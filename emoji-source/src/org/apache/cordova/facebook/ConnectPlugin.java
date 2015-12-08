// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphUser;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.WebDialog;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConnectPlugin extends CordovaPlugin
{

    private static final int INVALID_ERROR_CODE = -2;
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set OTHER_PUBLISH_PERMISSIONS = new HashSet() {

            
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
    };
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private final String TAG = "ConnectPlugin";
    private String applicationId;
    private CallbackContext graphContext;
    private String graphPath;
    private AppEventsLogger logger;
    private CallbackContext loginContext;
    private String method;
    private Bundle paramBundle;
    private CallbackContext showDialogContext;
    private boolean trackingPendingCall;
    private UiLifecycleHelper uiHelper;
    private String userID;

    public ConnectPlugin()
    {
        applicationId = null;
        loginContext = null;
        showDialogContext = null;
        graphContext = null;
        trackingPendingCall = false;
    }

    private boolean checkActiveSession(Session session)
    {
        return session != null && session.isOpened();
    }

    private void getUserInfo(Session session, com.facebook.Request.GraphUserCallback graphusercallback)
    {
        if (cordova != null)
        {
            Request.newMeRequest(session, graphusercallback).executeAsync();
        }
    }

    private void handleError(Exception exception, CallbackContext callbackcontext)
    {
        String s;
        byte byte0;
        s = (new StringBuilder()).append("Facebook error: ").append(exception.getMessage()).toString();
        byte0 = -2;
        if (!(exception instanceof FacebookOperationCanceledException)) goto _L2; else goto _L1
_L1:
        char c;
        s = "User cancelled dialog";
        c = '\u1069';
_L4:
        Log.e("ConnectPlugin", exception.toString());
        callbackcontext.error(getErrorResponse(exception, s, c));
        return;
_L2:
        c = byte0;
        if (exception instanceof FacebookDialogException)
        {
            s = (new StringBuilder()).append("Dialog error: ").append(exception.getMessage()).toString();
            c = byte0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void handleSuccess(Bundle bundle)
    {
        JSONObject jsonobject;
        if (bundle.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        jsonobject = new JSONObject();
        Iterator iterator = bundle.keySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        int i;
        s = (String)iterator.next();
        i = s.indexOf("[");
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        String s1 = s.substring(0, i);
        if (!jsonobject.has(s1)) goto _L4; else goto _L3
_L3:
        JSONArray jsonarray = (JSONArray)jsonobject.get(s1);
_L6:
        jsonarray.put(jsonarray.length(), bundle.get(s));
          goto _L5
        bundle;
        bundle.printStackTrace();
_L2:
        showDialogContext.success(jsonobject);
        return;
_L4:
        jsonarray = new JSONArray();
        jsonobject.put(s1, jsonarray);
          goto _L6
        jsonobject.put(s, bundle.get(s));
          goto _L5
        Log.e("ConnectPlugin", "User cancelled dialog");
        showDialogContext.error("User cancelled dialog");
        return;
    }

    private boolean isPublishPermission(String s)
    {
        return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(s));
    }

    private void makeGraphCall()
    {
        Session session = Session.getActiveSession();
        Object obj = new com.facebook.Request.Callback() {

            final ConnectPlugin this$0;

            public void onCompleted(Response response)
            {
                if (graphContext != null)
                {
                    if (response.getError() != null)
                    {
                        graphContext.error(getFacebookRequestErrorResponse(response.getError()));
                    } else
                    {
                        response = response.getGraphObject();
                        graphContext.success(response.getInnerJSONObject());
                    }
                    graphPath = null;
                    graphContext = null;
                }
            }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
        };
        Object obj1;
        String as[];
        try
        {
            graphPath = URLDecoder.decode(graphPath, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((UnsupportedEncodingException) (obj1)).printStackTrace();
        }
        as = graphPath.split("\\?");
        obj = Request.newGraphPathRequest(null, as[0], ((com.facebook.Request.Callback) (obj)));
        obj1 = ((Request) (obj)).getParameters();
        if (as.length > 1)
        {
            as = as[1].split("&");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                int k = s.indexOf("=");
                if (k > 0)
                {
                    ((Bundle) (obj1)).putString(s.substring(0, k), s.substring(k + 1, s.length()));
                }
            }

        }
        ((Bundle) (obj1)).putString("access_token", session.getAccessToken());
        ((Request) (obj)).setParameters(((Bundle) (obj1)));
        ((Request) (obj)).executeAsync();
    }

    private void onSessionStateChange(SessionState sessionstate, Exception exception)
    {
        Log.d("ConnectPlugin", (new StringBuilder()).append("onSessionStateChange:").append(sessionstate.toString()).toString());
        if (exception == null || !(exception instanceof FacebookOperationCanceledException)) goto _L2; else goto _L1
_L1:
        Log.e("ConnectPlugin", (new StringBuilder()).append("exception:").append(exception.toString()).toString());
        handleError(exception, loginContext);
_L4:
        return;
_L2:
        exception = Session.getActiveSession();
        if (!sessionstate.isOpened())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (loginContext != null)
        {
            getUserInfo(exception, new com.facebook.Request.GraphUserCallback() {

                final ConnectPlugin this$0;

                public void onCompleted(GraphUser graphuser, Response response)
                {
                    if (loginContext != null)
                    {
                        if (response.getError() != null)
                        {
                            loginContext.error(getFacebookRequestErrorResponse(response.getError()));
                            return;
                        } else
                        {
                            response = response.getGraphObject();
                            Log.d("ConnectPlugin", (new StringBuilder()).append("returning login object ").append(response.getInnerJSONObject().toString()).toString());
                            userID = graphuser.getId();
                            loginContext.success(getResponse());
                            loginContext = null;
                            return;
                        }
                    } else
                    {
                        userID = graphuser.getId();
                        return;
                    }
                }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
            });
            return;
        }
        if (graphContext == null) goto _L4; else goto _L3
_L3:
        makeGraphCall();
        return;
        if (sessionstate != SessionState.CLOSED_LOGIN_FAILED || loginContext == null) goto _L4; else goto _L5
_L5:
        handleError(new FacebookAuthorizationException("Session was closed and was not closed normally"), loginContext);
        return;
    }

    public boolean execute(final String dialogCallback, JSONArray jsonarray, final CallbackContext _callbackContext)
        throws JSONException
    {
        if (!dialogCallback.equals("login")) goto _L2; else goto _L1
_L1:
        String as[];
        Log.d("ConnectPlugin", "login FB");
        as = new String[jsonarray.length()];
        for (int i = 0; i < jsonarray.length(); i++)
        {
            as[i] = jsonarray.getString(i);
        }

        dialogCallback = null;
        if (as.length > 0)
        {
            dialogCallback = Arrays.asList(as);
        }
        jsonarray = Session.getActiveSession();
        loginContext = _callbackContext;
        PluginResult pluginresult = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
        pluginresult.setKeepCallback(true);
        loginContext.sendPluginResult(pluginresult);
        if (!checkActiveSession(jsonarray)) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag3;
        int l;
        int i1;
        flag = false;
        flag3 = false;
        if (dialogCallback == null)
        {
            flag3 = true;
        }
        i1 = as.length;
        l = 0;
_L16:
        boolean flag8;
        boolean flag10;
        flag10 = flag;
        flag8 = flag3;
        if (l >= i1) goto _L6; else goto _L5
_L5:
        if (isPublishPermission(as[l]))
        {
            flag = true;
        } else
        {
            flag3 = true;
        }
        if (!flag || !flag3) goto _L8; else goto _L7
_L7:
        flag8 = flag3;
        flag10 = flag;
_L6:
        if (flag10 && flag8)
        {
            _callbackContext.error("Cannot ask for both read and publish permissions.");
        } else
        {
            dialogCallback = new com.facebook.Session.NewPermissionsRequest(cordova.getActivity(), dialogCallback);
            cordova.setActivityResultCallback(this);
            if (flag10)
            {
                jsonarray.requestNewPublishPermissions(dialogCallback);
            } else
            {
                jsonarray.requestNewReadPermissions(dialogCallback);
            }
        }
_L9:
        return true;
_L8:
        l++;
        continue; /* Loop/switch isn't completed */
_L4:
        jsonarray = (new com.facebook.Session.Builder(cordova.getActivity())).setApplicationId(applicationId).build();
        cordova.setActivityResultCallback(this);
        Session.setActiveSession(jsonarray);
        _callbackContext = new com.facebook.Session.OpenRequest(cordova.getActivity());
        _callbackContext.setPermissions(dialogCallback);
        _callbackContext.setCallback(new com.facebook.Session.StatusCallback() {

            final ConnectPlugin this$0;

            public void call(Session session, SessionState sessionstate, Exception exception2)
            {
                onSessionStateChange(sessionstate, exception2);
            }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
        });
        jsonarray.openForRead(_callbackContext);
        if (true) goto _L9; else goto _L2
_L2:
        if (dialogCallback.equals("logout"))
        {
            dialogCallback = Session.getActiveSession();
            if (checkActiveSession(dialogCallback))
            {
                dialogCallback.closeAndClearTokenInformation();
                userID = null;
                _callbackContext.success();
            } else
            if (dialogCallback != null)
            {
                _callbackContext.error("Session not open.");
            } else
            {
                _callbackContext.error("No valid session found, must call init and login before logout.");
            }
            return true;
        }
        if (dialogCallback.equals("getLoginStatus"))
        {
            dialogCallback = Session.getActiveSession();
            if (userID == null && Session.getActiveSession() != null && dialogCallback.isOpened())
            {
                getUserInfo(dialogCallback, new com.facebook.Request.GraphUserCallback() {

                    final ConnectPlugin this$0;
                    final CallbackContext val$_callbackContext;

                    public void onCompleted(GraphUser graphuser, Response response)
                    {
                        if (response.getError() != null)
                        {
                            _callbackContext.error(getFacebookRequestErrorResponse(response.getError()));
                            return;
                        } else
                        {
                            userID = graphuser.getId();
                            _callbackContext.success(getResponse());
                            return;
                        }
                    }

            
            {
                this$0 = ConnectPlugin.this;
                _callbackContext = callbackcontext;
                super();
            }
                });
            } else
            {
                _callbackContext.success(getResponse());
            }
            return true;
        }
        if (dialogCallback.equals("getAccessToken"))
        {
            dialogCallback = Session.getActiveSession();
            if (checkActiveSession(dialogCallback))
            {
                _callbackContext.success(dialogCallback.getAccessToken());
            } else
            if (dialogCallback == null)
            {
                _callbackContext.error("No valid session found, must call init and login before logout.");
            } else
            {
                _callbackContext.error("Session not open.");
            }
            return true;
        }
        if (!dialogCallback.equals("logEvent")) goto _L11; else goto _L10
_L10:
        if (jsonarray.length() == 0)
        {
            _callbackContext.error("Invalid arguments");
            return true;
        }
        dialogCallback = jsonarray.getString(0);
        if (jsonarray.length() != 1) goto _L13; else goto _L12
_L12:
        logger.logEvent(dialogCallback);
_L14:
        _callbackContext.success();
        return true;
_L13:
        JSONObject jsonobject = jsonarray.getJSONObject(1);
        Bundle bundle1 = new Bundle();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            try
            {
                String s = (String)iterator.next();
                bundle1.putString(s, jsonobject.getString(s));
            }
            catch (Exception exception)
            {
                Log.w("ConnectPlugin", (new StringBuilder()).append("Type in AppEvent parameters was not String for key: ").append((String)iterator.next()).toString());
                try
                {
                    String s1 = (String)iterator.next();
                    bundle1.putInt(s1, jsonobject.getInt(s1));
                }
                catch (Exception exception1)
                {
                    Log.e("ConnectPlugin", (new StringBuilder()).append("Unsupported type in AppEvent parameters for key: ").append((String)iterator.next()).toString());
                }
            }
        }

        if (jsonarray.length() == 2)
        {
            logger.logEvent(dialogCallback, bundle1);
        }
        if (jsonarray.length() == 3)
        {
            double d = jsonarray.getDouble(2);
            logger.logEvent(dialogCallback, d, bundle1);
        }
        if (true) goto _L14; else goto _L11
_L11:
        if (dialogCallback.equals("logPurchase"))
        {
            if (jsonarray.length() != 2)
            {
                _callbackContext.error("Invalid arguments");
                return true;
            } else
            {
                int j = jsonarray.getInt(0);
                dialogCallback = jsonarray.getString(1);
                logger.logPurchase(BigDecimal.valueOf(j), Currency.getInstance(dialogCallback));
                _callbackContext.success();
                return true;
            }
        }
        if (dialogCallback.equals("showDialog"))
        {
            Bundle bundle = new Bundle();
            try
            {
                dialogCallback = jsonarray.getJSONObject(0);
            }
            // Misplaced declaration of an exception variable
            catch (final String dialogCallback)
            {
                dialogCallback = new JSONObject();
            }
            for (jsonarray = dialogCallback.keys(); jsonarray.hasNext();)
            {
                Object obj = (String)jsonarray.next();
                if (((String) (obj)).equals("method"))
                {
                    try
                    {
                        method = dialogCallback.getString(((String) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.w("ConnectPlugin", "Nonstring method parameter provided to dialog");
                    }
                } else
                {
                    try
                    {
                        bundle.putString(((String) (obj)), dialogCallback.getString(((String) (obj))));
                    }
                    catch (JSONException jsonexception)
                    {
                        Log.w("ConnectPlugin", "Nonstring parameter provided to dialog discarded");
                    }
                }
            }

            paramBundle = new Bundle(bundle);
            boolean flag1;
            boolean flag4;
            boolean flag6;
            if (method.equalsIgnoreCase("share") || method.equalsIgnoreCase("share_open_graph"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && FacebookDialog.canPresentShareDialog(cordova.getActivity(), new com.facebook.widget.FacebookDialog.ShareDialogFeature[] {
    com.facebook.widget.FacebookDialog.ShareDialogFeature.SHARE_DIALOG
}))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (!flag1 || !flag4)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (flag6 && !checkActiveSession(Session.getActiveSession()))
            {
                _callbackContext.error("No active session");
                return true;
            }
            showDialogContext = _callbackContext;
            dialogCallback = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
            dialogCallback.setKeepCallback(true);
            showDialogContext.sendPluginResult(dialogCallback);
            dialogCallback = new com.facebook.widget.WebDialog.OnCompleteListener() {

                final ConnectPlugin this$0;

                public void onComplete(Bundle bundle2, FacebookException facebookexception)
                {
                    if (facebookexception != null)
                    {
                        handleError(facebookexception, showDialogContext);
                        return;
                    } else
                    {
                        handleSuccess(bundle2);
                        return;
                    }
                }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
            };
            if (method.equalsIgnoreCase("feed"))
            {
                dialogCallback = new Runnable() {

                    final ConnectPlugin this$0;
                    final com.facebook.widget.WebDialog.OnCompleteListener val$dialogCallback;
                    final ConnectPlugin val$me;

                    public void run()
                    {
                        ((com.facebook.widget.WebDialog.FeedDialogBuilder)(new com.facebook.widget.WebDialog.FeedDialogBuilder(me.cordova.getActivity(), Session.getActiveSession(), paramBundle)).setOnCompleteListener(dialogCallback)).build().show();
                    }

            
            {
                this$0 = ConnectPlugin.this;
                me = connectplugin1;
                dialogCallback = oncompletelistener;
                super();
            }
                };
                cordova.getActivity().runOnUiThread(dialogCallback);
            } else
            if (method.equalsIgnoreCase("apprequests"))
            {
                dialogCallback = new Runnable() {

                    final ConnectPlugin this$0;
                    final com.facebook.widget.WebDialog.OnCompleteListener val$dialogCallback;
                    final ConnectPlugin val$me;

                    public void run()
                    {
                        ((com.facebook.widget.WebDialog.RequestsDialogBuilder)(new com.facebook.widget.WebDialog.RequestsDialogBuilder(me.cordova.getActivity(), Session.getActiveSession(), paramBundle)).setOnCompleteListener(dialogCallback)).build().show();
                    }

            
            {
                this$0 = ConnectPlugin.this;
                me = connectplugin1;
                dialogCallback = oncompletelistener;
                super();
            }
                };
                cordova.getActivity().runOnUiThread(dialogCallback);
            } else
            if (flag1)
            {
                if (flag4)
                {
                    dialogCallback = new Runnable() {

                        final ConnectPlugin this$0;
                        final ConnectPlugin val$me;

                        public void run()
                        {
                            FacebookDialog facebookdialog = ((com.facebook.widget.FacebookDialog.ShareDialogBuilder)((com.facebook.widget.FacebookDialog.ShareDialogBuilder)((com.facebook.widget.FacebookDialog.ShareDialogBuilder)((com.facebook.widget.FacebookDialog.ShareDialogBuilder)((com.facebook.widget.FacebookDialog.ShareDialogBuilder)(new com.facebook.widget.FacebookDialog.ShareDialogBuilder(me.cordova.getActivity())).setName(paramBundle.getString("name"))).setCaption(paramBundle.getString("caption"))).setDescription(paramBundle.getString("description"))).setLink(paramBundle.getString("href"))).setPicture(paramBundle.getString("picture"))).build();
                            uiHelper.trackPendingDialogCall(facebookdialog.present());
                        }

            
            {
                this$0 = ConnectPlugin.this;
                me = connectplugin1;
                super();
            }
                    };
                    trackingPendingCall = true;
                    cordova.getActivity().runOnUiThread(dialogCallback);
                } else
                {
                    dialogCallback = new Runnable() {

                        final ConnectPlugin this$0;
                        final com.facebook.widget.WebDialog.OnCompleteListener val$dialogCallback;
                        final ConnectPlugin val$me;

                        public void run()
                        {
                            ((com.facebook.widget.WebDialog.FeedDialogBuilder)(new com.facebook.widget.WebDialog.FeedDialogBuilder(me.cordova.getActivity(), Session.getActiveSession(), paramBundle)).setOnCompleteListener(dialogCallback)).build().show();
                        }

            
            {
                this$0 = ConnectPlugin.this;
                me = connectplugin1;
                dialogCallback = oncompletelistener;
                super();
            }
                    };
                    cordova.getActivity().runOnUiThread(dialogCallback);
                }
            } else
            if (method.equalsIgnoreCase("send"))
            {
                dialogCallback = new Runnable() {

                    final ConnectPlugin this$0;
                    final ConnectPlugin val$me;

                    public void run()
                    {
                        com.facebook.widget.FacebookDialog.MessageDialogBuilder messagedialogbuilder = new com.facebook.widget.FacebookDialog.MessageDialogBuilder(me.cordova.getActivity());
                        if (paramBundle.containsKey("link"))
                        {
                            messagedialogbuilder.setLink(paramBundle.getString("link"));
                        }
                        if (paramBundle.containsKey("caption"))
                        {
                            messagedialogbuilder.setCaption(paramBundle.getString("caption"));
                        }
                        if (paramBundle.containsKey("name"))
                        {
                            messagedialogbuilder.setName(paramBundle.getString("name"));
                        }
                        if (paramBundle.containsKey("picture"))
                        {
                            messagedialogbuilder.setPicture(paramBundle.getString("picture"));
                        }
                        if (paramBundle.containsKey("description"))
                        {
                            messagedialogbuilder.setDescription(paramBundle.getString("description"));
                        }
                        if (messagedialogbuilder.canPresent())
                        {
                            messagedialogbuilder.build().present();
                            return;
                        } else
                        {
                            trackingPendingCall = false;
                            Log.e("ConnectPlugin", "Messaging unavailable.");
                            showDialogContext.error("Messaging unavailable.");
                            return;
                        }
                    }

            
            {
                this$0 = ConnectPlugin.this;
                me = connectplugin1;
                super();
            }
                };
                trackingPendingCall = true;
                cordova.getActivity().runOnUiThread(dialogCallback);
            } else
            {
                _callbackContext.error("Unsupported dialog method.");
            }
            return true;
        }
        if (dialogCallback.equals("graphApi"))
        {
            graphContext = _callbackContext;
            dialogCallback = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
            dialogCallback.setKeepCallback(true);
            graphContext.sendPluginResult(dialogCallback);
            graphPath = jsonarray.getString(0);
            jsonarray = jsonarray.getJSONArray(1);
            dialogCallback = new ArrayList();
            for (int k = 0; k < jsonarray.length(); k++)
            {
                dialogCallback.add(jsonarray.getString(k));
            }

            boolean flag5 = false;
            boolean flag2 = false;
            if (dialogCallback.size() > 0)
            {
                jsonarray = dialogCallback.iterator();
                boolean flag7;
label0:
                do
                {
                    do
                    {
                        flag7 = flag5;
                        boolean flag9 = flag2;
                        if (!jsonarray.hasNext())
                        {
                            break label0;
                        }
                        if (isPublishPermission((String)jsonarray.next()))
                        {
                            flag7 = true;
                            flag9 = flag2;
                        } else
                        {
                            flag9 = true;
                            flag7 = flag5;
                        }
                        flag5 = flag7;
                        flag2 = flag9;
                    } while (!flag7);
                    flag5 = flag7;
                    flag2 = flag9;
                } while (!flag9);
                if (flag7 && flag9)
                {
                    graphContext.error("Cannot ask for both read and publish permissions.");
                } else
                {
                    jsonarray = Session.getActiveSession();
                    if (jsonarray.getPermissions().containsAll(dialogCallback))
                    {
                        makeGraphCall();
                    } else
                    {
                        dialogCallback = new com.facebook.Session.NewPermissionsRequest(cordova.getActivity(), dialogCallback);
                        cordova.setActivityResultCallback(this);
                        if (flag7)
                        {
                            jsonarray.requestNewPublishPermissions(dialogCallback);
                        } else
                        {
                            jsonarray.requestNewReadPermissions(dialogCallback);
                        }
                    }
                }
            } else
            {
                makeGraphCall();
            }
            return true;
        }
        return false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public JSONObject getErrorResponse(Exception exception, String s, int i)
    {
        if (exception instanceof FacebookServiceException)
        {
            return getFacebookRequestErrorResponse(((FacebookServiceException)exception).getRequestError());
        }
        String s1 = "{";
        if (exception instanceof FacebookDialogException)
        {
            i = ((FacebookDialogException)exception).getErrorCode();
        }
        if (i != -2)
        {
            s1 = (new StringBuilder()).append("{").append("\"errorCode\": \"").append(i).append("\",").toString();
        }
        String s2 = s;
        if (s == null)
        {
            s2 = exception.getMessage();
        }
        exception = (new StringBuilder()).append(s1).append("\"errorMessage\": \"").append(s2).append("\"}").toString();
        try
        {
            exception = new JSONObject(exception);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
            return new JSONObject();
        }
        return exception;
    }

    public JSONObject getFacebookRequestErrorResponse(FacebookRequestError facebookrequesterror)
    {
        String s1 = (new StringBuilder()).append("{\"errorCode\": \"").append(facebookrequesterror.getErrorCode()).append("\",").append("\"errorType\": \"").append(facebookrequesterror.getErrorType()).append("\",").append("\"errorMessage\": \"").append(facebookrequesterror.getErrorMessage()).append("\"").toString();
        int i = facebookrequesterror.getUserActionMessageId();
        String s = s1;
        if (i != 0)
        {
            s = s1;
            if (cordova.getActivity().getResources().getString(i) != null)
            {
                s = (new StringBuilder()).append(s1).append(",\"errorUserMessage\": \"").append(cordova.getActivity().getResources().getString(facebookrequesterror.getUserActionMessageId())).append("\"").toString();
            }
        }
        facebookrequesterror = (new StringBuilder()).append(s).append("}").toString();
        try
        {
            facebookrequesterror = new JSONObject(facebookrequesterror);
        }
        // Misplaced declaration of an exception variable
        catch (FacebookRequestError facebookrequesterror)
        {
            facebookrequesterror.printStackTrace();
            return new JSONObject();
        }
        return facebookrequesterror;
    }

    public JSONObject getResponse()
    {
        long l = 0L;
        Object obj = Session.getActiveSession();
        if (checkActiveSession(((Session) (obj))))
        {
            Date date = new Date();
            long l1 = (((Session) (obj)).getExpirationDate().getTime() - date.getTime()) / 1000L;
            if (l1 > 0L)
            {
                l = l1;
            }
            obj = (new StringBuilder()).append("{\"status\": \"connected\",\"authResponse\": {\"accessToken\": \"").append(((Session) (obj)).getAccessToken()).append("\",").append("\"expiresIn\": \"").append(l).append("\",").append("\"session_key\": true,").append("\"sig\": \"...\",").append("\"userID\": \"").append(userID).append("\"").append("}").append("}").toString();
        } else
        {
            obj = "{\"status\": \"unknown\"}";
        }
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return new JSONObject();
        }
        return ((JSONObject) (obj));
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        uiHelper = new UiLifecycleHelper(cordovainterface.getActivity(), null);
        logger = AppEventsLogger.newLogger(cordovainterface.getActivity());
        int i = cordovainterface.getActivity().getResources().getIdentifier("fb_app_id", "string", cordovainterface.getActivity().getPackageName());
        applicationId = cordovainterface.getActivity().getString(i);
        cordovainterface.setActivityResultCallback(this);
        Session session = (new com.facebook.Session.Builder(cordovainterface.getActivity())).setApplicationId(applicationId).build();
        if (session.getState() == SessionState.CREATED_TOKEN_LOADED)
        {
            Session.setActiveSession(session);
            com.facebook.Session.OpenRequest openrequest = new com.facebook.Session.OpenRequest(cordovainterface.getActivity());
            openrequest.setCallback(new com.facebook.Session.StatusCallback() {

                final ConnectPlugin this$0;

                public void call(Session session1, SessionState sessionstate, Exception exception)
                {
                    onSessionStateChange(sessionstate, exception);
                }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
            });
            session.openForRead(openrequest);
        }
        if (checkActiveSession(session))
        {
            onSessionStateChange(session.getState(), null);
        }
        super.initialize(cordovainterface, cordovawebview);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Log.d("ConnectPlugin", (new StringBuilder()).append("activity result in plugin: requestCode(").append(i).append("), resultCode(").append(j).append(")").toString());
        if (!trackingPendingCall) goto _L2; else goto _L1
_L1:
        uiHelper.onActivityResult(i, j, intent, new com.facebook.widget.FacebookDialog.Callback() {

            final ConnectPlugin this$0;

            public void onComplete(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Bundle bundle)
            {
                Log.i("Activity", "Success!");
                handleSuccess(bundle);
            }

            public void onError(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Exception exception, Bundle bundle)
            {
                Log.e("Activity", String.format("Error: %s", new Object[] {
                    exception.toString()
                }));
                handleError(exception, showDialogContext);
            }

            
            {
                this$0 = ConnectPlugin.this;
                super();
            }
        });
_L4:
        trackingPendingCall = false;
        return;
_L2:
        Session session = Session.getActiveSession();
        if (session != null && loginContext != null)
        {
            session.onActivityResult(cordova.getActivity(), i, j, intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroy()
    {
        super.onDestroy();
        uiHelper.onDestroy();
    }

    public void onPause()
    {
        uiHelper.onPause();
    }

    public void onResume(boolean flag)
    {
        super.onResume(flag);
        uiHelper.onResume();
        AppEventsLogger.activateApp(cordova.getActivity());
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        uiHelper.onSaveInstanceState(bundle);
    }






/*
    static CallbackContext access$1002(ConnectPlugin connectplugin, CallbackContext callbackcontext)
    {
        connectplugin.loginContext = callbackcontext;
        return callbackcontext;
    }

*/




/*
    static String access$402(ConnectPlugin connectplugin, String s)
    {
        connectplugin.userID = s;
        return s;
    }

*/




/*
    static boolean access$702(ConnectPlugin connectplugin, boolean flag)
    {
        connectplugin.trackingPendingCall = flag;
        return flag;
    }

*/



/*
    static CallbackContext access$802(ConnectPlugin connectplugin, CallbackContext callbackcontext)
    {
        connectplugin.graphContext = callbackcontext;
        return callbackcontext;
    }

*/


/*
    static String access$902(ConnectPlugin connectplugin, String s)
    {
        connectplugin.graphPath = s;
        return s;
    }

*/
}
