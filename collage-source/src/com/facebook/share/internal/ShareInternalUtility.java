// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ResultProcessor, OpenGraphJSONUtility

public final class ShareInternalUtility
{

    public static final String MY_PHOTOS = "me/photos";
    private static final String MY_STAGING_RESOURCES = "me/staging_resources";
    private static final String STAGING_PARAM = "file";

    public ShareInternalUtility()
    {
    }

    private static AppCall getAppCallFromActivityResult(int i, int j, Intent intent)
    {
        intent = NativeProtocol.getCallIdFromIntent(intent);
        if (intent == null)
        {
            return null;
        } else
        {
            return AppCall.finishPendingCall(intent, i);
        }
    }

    private static com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, SharePhoto sharephoto)
    {
        Bitmap bitmap = sharephoto.getBitmap();
        Uri uri = sharephoto.getImageUrl();
        sharephoto = null;
        if (bitmap != null)
        {
            sharephoto = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        } else
        if (uri != null)
        {
            return NativeAppCallAttachmentStore.createAttachment(uuid, uri);
        }
        return sharephoto;
    }

    public static Pair getFieldNameAndNamespaceFromFullName(String s)
    {
        Object obj = null;
        int i = s.indexOf(':');
        String s2 = obj;
        String s1 = s;
        if (i != -1)
        {
            s2 = obj;
            s1 = s;
            if (s.length() > i + 1)
            {
                s2 = s.substring(0, i);
                s1 = s.substring(i + 1);
            }
        }
        return new Pair(s2, s1);
    }

    public static com.facebook.share.widget.LikeView.ObjectType getMostSpecificObjectType(com.facebook.share.widget.LikeView.ObjectType objecttype, com.facebook.share.widget.LikeView.ObjectType objecttype1)
    {
        if (objecttype != objecttype1)
        {
            if (objecttype == com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
            {
                return objecttype1;
            }
            if (objecttype1 != com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
            {
                return null;
            }
        }
        return objecttype;
    }

    public static String getNativeDialogCompletionGesture(Bundle bundle)
    {
        if (bundle.containsKey("completionGesture"))
        {
            return bundle.getString("completionGesture");
        } else
        {
            return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        }
    }

    public static List getPhotoUrls(SharePhotoContent sharephotocontent, UUID uuid)
    {
label0:
        {
            if (sharephotocontent != null)
            {
                sharephotocontent = sharephotocontent.getPhotos();
                if (sharephotocontent != null)
                {
                    break label0;
                }
            }
            return null;
        }
        sharephotocontent = Utility.map(sharephotocontent, new com.facebook.internal.Utility.Mapper(uuid) {

            final UUID val$appCallId;

            public com.facebook.internal.NativeAppCallAttachmentStore.Attachment apply(SharePhoto sharephoto)
            {
                return ShareInternalUtility.getAttachment(appCallId, sharephoto);
            }

            public volatile Object apply(Object obj)
            {
                return apply((SharePhoto)obj);
            }

            
            {
                appCallId = uuid;
                super();
            }
        });
        uuid = Utility.map(sharephotocontent, new com.facebook.internal.Utility.Mapper() {

            public volatile Object apply(Object obj)
            {
                return apply((com.facebook.internal.NativeAppCallAttachmentStore.Attachment)obj);
            }

            public String apply(com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment)
            {
                return attachment.getAttachmentUrl();
            }

        });
        NativeAppCallAttachmentStore.addAttachments(sharephotocontent);
        return uuid;
    }

    public static String getShareDialogPostId(Bundle bundle)
    {
        if (bundle.containsKey("postId"))
        {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID"))
        {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        } else
        {
            return bundle.getString("post_id");
        }
    }

    public static ResultProcessor getShareResultProcessor(FacebookCallback facebookcallback)
    {
        return new ResultProcessor(facebookcallback, facebookcallback) {

            final FacebookCallback val$callback;

            public void onCancel(AppCall appcall)
            {
                ShareInternalUtility.invokeOnCancelCallback(callback);
            }

            public void onError(AppCall appcall, FacebookException facebookexception)
            {
                ShareInternalUtility.invokeOnErrorCallback(callback, facebookexception);
            }

            public void onSuccess(AppCall appcall, Bundle bundle)
            {
label0:
                {
                    if (bundle != null)
                    {
                        appcall = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                        if (appcall != null && !"post".equalsIgnoreCase(appcall))
                        {
                            break label0;
                        }
                        appcall = ShareInternalUtility.getShareDialogPostId(bundle);
                        ShareInternalUtility.invokeOnSuccessCallback(callback, appcall);
                    }
                    return;
                }
                if ("cancel".equalsIgnoreCase(appcall))
                {
                    ShareInternalUtility.invokeOnCancelCallback(callback);
                    return;
                } else
                {
                    ShareInternalUtility.invokeOnErrorCallback(callback, new FacebookException("UnknownError"));
                    return;
                }
            }

            
            {
                callback = facebookcallback1;
                super(facebookcallback);
            }
        };
    }

    public static String getVideoUrl(ShareVideoContent sharevideocontent, UUID uuid)
    {
        if (sharevideocontent == null || sharevideocontent.getVideo() == null)
        {
            return null;
        } else
        {
            sharevideocontent = NativeAppCallAttachmentStore.createAttachment(uuid, sharevideocontent.getVideo().getLocalUrl());
            uuid = new ArrayList(1);
            uuid.add(sharevideocontent);
            NativeAppCallAttachmentStore.addAttachments(uuid);
            return sharevideocontent.getAttachmentUrl();
        }
    }

    public static boolean handleActivityResult(int i, int j, Intent intent, ResultProcessor resultprocessor)
    {
        boolean flag = true;
        AppCall appcall = getAppCallFromActivityResult(i, j, intent);
        if (appcall == null)
        {
            flag = false;
        } else
        {
            NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appcall.getCallId());
            if (resultprocessor != null)
            {
                FacebookException facebookexception = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent));
                if (facebookexception != null)
                {
                    if (facebookexception instanceof FacebookOperationCanceledException)
                    {
                        resultprocessor.onCancel(appcall);
                        return true;
                    } else
                    {
                        resultprocessor.onError(appcall, facebookexception);
                        return true;
                    }
                } else
                {
                    resultprocessor.onSuccess(appcall, NativeProtocol.getSuccessResultsFromIntent(intent));
                    return true;
                }
            }
        }
        return flag;
    }

    public static void invokeCallbackWithError(FacebookCallback facebookcallback, String s)
    {
        invokeOnErrorCallback(facebookcallback, s);
    }

    public static void invokeCallbackWithException(FacebookCallback facebookcallback, Exception exception)
    {
        if (exception instanceof FacebookException)
        {
            invokeOnErrorCallback(facebookcallback, (FacebookException)exception);
            return;
        } else
        {
            invokeCallbackWithError(facebookcallback, (new StringBuilder()).append("Error preparing share content: ").append(exception.getLocalizedMessage()).toString());
            return;
        }
    }

    public static void invokeCallbackWithResults(FacebookCallback facebookcallback, String s, GraphResponse graphresponse)
    {
        Object obj = graphresponse.getError();
        if (obj != null)
        {
            obj = ((FacebookRequestError) (obj)).getErrorMessage();
            s = ((String) (obj));
            if (Utility.isNullOrEmpty(((String) (obj))))
            {
                s = "Unexpected error sharing.";
            }
            invokeOnErrorCallback(facebookcallback, graphresponse, s);
            return;
        } else
        {
            invokeOnSuccessCallback(facebookcallback, s);
            return;
        }
    }

    static void invokeOnCancelCallback(FacebookCallback facebookcallback)
    {
        logShareResult("cancelled", null);
        if (facebookcallback != null)
        {
            facebookcallback.onCancel();
        }
    }

    static void invokeOnErrorCallback(FacebookCallback facebookcallback, FacebookException facebookexception)
    {
        logShareResult("error", facebookexception.getMessage());
        if (facebookcallback != null)
        {
            facebookcallback.onError(facebookexception);
        }
    }

    static void invokeOnErrorCallback(FacebookCallback facebookcallback, GraphResponse graphresponse, String s)
    {
        logShareResult("error", s);
        if (facebookcallback != null)
        {
            facebookcallback.onError(new FacebookGraphResponseException(graphresponse, s));
        }
    }

    static void invokeOnErrorCallback(FacebookCallback facebookcallback, String s)
    {
        logShareResult("error", s);
        if (facebookcallback != null)
        {
            facebookcallback.onError(new FacebookException(s));
        }
    }

    static void invokeOnSuccessCallback(FacebookCallback facebookcallback, String s)
    {
        logShareResult("succeeded", null);
        if (facebookcallback != null)
        {
            facebookcallback.onSuccess(new com.facebook.share.Sharer.Result(s));
        }
    }

    private static void logShareResult(String s, String s1)
    {
        AppEventsLogger appeventslogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", s);
        if (s1 != null)
        {
            bundle.putString("error_message", s1);
        }
        appeventslogger.logSdkEvent("fb_share_dialog_result", null, bundle);
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Bitmap bitmap, com.facebook.GraphRequest.Callback callback)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", bitmap);
        return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Uri uri, com.facebook.GraphRequest.Callback callback)
        throws FileNotFoundException
    {
        if (Utility.isFileUri(uri))
        {
            return newUploadStagingResourceWithImageRequest(accesstoken, new File(uri.getPath()), callback);
        }
        if (!Utility.isContentUri(uri))
        {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } else
        {
            uri = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", uri);
            return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
        }
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, File file, com.facebook.GraphRequest.Callback callback)
        throws FileNotFoundException
    {
        file = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 0x10000000), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", file);
        return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
    }

    public static void registerSharerCallback(int i, CallbackManager callbackmanager, FacebookCallback facebookcallback)
    {
        if (!(callbackmanager instanceof CallbackManagerImpl))
        {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            ((CallbackManagerImpl)callbackmanager).registerCallback(i, new com.facebook.internal.CallbackManagerImpl.Callback(i, facebookcallback) {

                final FacebookCallback val$callback;
                final int val$requestCode;

                public boolean onActivityResult(int j, Intent intent)
                {
                    return ShareInternalUtility.handleActivityResult(requestCode, j, intent, ShareInternalUtility.getShareResultProcessor(callback));
                }

            
            {
                requestCode = i;
                callback = facebookcallback;
                super();
            }
            });
            return;
        }
    }

    public static void registerStaticShareCallback(int i)
    {
        CallbackManagerImpl.registerStaticCallback(i, new com.facebook.internal.CallbackManagerImpl.Callback(i) {

            final int val$requestCode;

            public boolean onActivityResult(int j, Intent intent)
            {
                return ShareInternalUtility.handleActivityResult(requestCode, j, intent, ShareInternalUtility.getShareResultProcessor(null));
            }

            
            {
                requestCode = i;
                super();
            }
        });
    }

    public static JSONArray removeNamespacesFromOGJsonArray(JSONArray jsonarray, boolean flag)
        throws JSONException
    {
        JSONArray jsonarray1 = new JSONArray();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            Object obj1 = jsonarray.get(i);
            Object obj;
            if (obj1 instanceof JSONArray)
            {
                obj = removeNamespacesFromOGJsonArray((JSONArray)obj1, flag);
            } else
            {
                obj = obj1;
                if (obj1 instanceof JSONObject)
                {
                    obj = removeNamespacesFromOGJsonObject((JSONObject)obj1, flag);
                }
            }
            jsonarray1.put(obj);
            i++;
        }
        return jsonarray1;
    }

    public static JSONObject removeNamespacesFromOGJsonObject(JSONObject jsonobject, boolean flag)
    {
        Object obj;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        String s;
        String s1;
        Object obj1;
        int i;
        if (jsonobject == null)
        {
            return null;
        }
        JSONArray jsonarray;
        try
        {
            jsonobject1 = new JSONObject();
            jsonobject2 = new JSONObject();
            jsonarray = jsonobject.names();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new FacebookException("Failed to create json object from share content");
        }
        i = 0;
_L6:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        s = jsonarray.getString(i);
        obj = jsonobject.get(s);
        if (!(obj instanceof JSONObject)) goto _L2; else goto _L1
_L1:
        obj = removeNamespacesFromOGJsonObject((JSONObject)obj, true);
_L4:
        obj1 = getFieldNameAndNamespaceFromFullName(s);
        s1 = (String)((Pair) (obj1)).first;
        obj1 = (String)((Pair) (obj1)).second;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (s1.equals("fbsdk"))
        {
            jsonobject1.put(s, obj);
            break MISSING_BLOCK_LABEL_263;
        }
        break MISSING_BLOCK_LABEL_151;
_L2:
        if (!(obj instanceof JSONArray)) goto _L4; else goto _L3
_L3:
        obj = removeNamespacesFromOGJsonArray((JSONArray)obj, true);
          goto _L4
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (!s1.equals("og"))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        jsonobject1.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_263;
        jsonobject2.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_263;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        if (s1.equals("fb"))
        {
            jsonobject1.put(s, obj);
            break MISSING_BLOCK_LABEL_263;
        }
        jsonobject1.put(((String) (obj1)), obj);
        break MISSING_BLOCK_LABEL_263;
        if (jsonobject2.length() > 0)
        {
            jsonobject1.put("data", jsonobject2);
        }
        return jsonobject1;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static JSONObject toJSONObjectForCall(UUID uuid, ShareOpenGraphContent shareopengraphcontent)
        throws JSONException
    {
        Object obj = shareopengraphcontent.getAction();
        ArrayList arraylist = new ArrayList();
        obj = OpenGraphJSONUtility.toJSONObject(((com.facebook.share.model.ShareOpenGraphAction) (obj)), new OpenGraphJSONUtility.PhotoJSONProcessor(uuid, arraylist) {

            final ArrayList val$attachments;
            final UUID val$callId;

            public JSONObject toJSONObject(SharePhoto sharephoto)
            {
                Object obj1 = ShareInternalUtility.getAttachment(callId, sharephoto);
                if (obj1 != null) goto _L2; else goto _L1
_L1:
                obj1 = null;
_L4:
                return ((JSONObject) (obj1));
_L2:
                attachments.add(obj1);
                JSONObject jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("url", ((com.facebook.internal.NativeAppCallAttachmentStore.Attachment) (obj1)).getAttachmentUrl());
                }
                // Misplaced declaration of an exception variable
                catch (SharePhoto sharephoto)
                {
                    throw new FacebookException("Unable to attach images", sharephoto);
                }
                obj1 = jsonobject;
                if (!sharephoto.getUserGenerated()) goto _L4; else goto _L3
_L3:
                jsonobject.put("user_generated", true);
                return jsonobject;
            }

            
            {
                callId = uuid;
                attachments = arraylist;
                super();
            }
        });
        NativeAppCallAttachmentStore.addAttachments(arraylist);
        if (shareopengraphcontent.getPlaceId() != null && Utility.isNullOrEmpty(((JSONObject) (obj)).optString("place")))
        {
            ((JSONObject) (obj)).put("place", shareopengraphcontent.getPlaceId());
        }
        if (shareopengraphcontent.getPeopleIds() != null)
        {
            uuid = ((JSONObject) (obj)).optJSONArray("tags");
            if (uuid == null)
            {
                uuid = new HashSet();
            } else
            {
                uuid = Utility.jsonArrayToSet(uuid);
            }
            for (shareopengraphcontent = shareopengraphcontent.getPeopleIds().iterator(); shareopengraphcontent.hasNext(); uuid.add((String)shareopengraphcontent.next())) { }
            ((JSONObject) (obj)).put("tags", new ArrayList(uuid));
        }
        return ((JSONObject) (obj));
    }

    public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent shareopengraphcontent)
        throws JSONException
    {
        return OpenGraphJSONUtility.toJSONObject(shareopengraphcontent.getAction(), new OpenGraphJSONUtility.PhotoJSONProcessor() {

            public JSONObject toJSONObject(SharePhoto sharephoto)
            {
                sharephoto = sharephoto.getImageUrl();
                JSONObject jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("url", sharephoto.toString());
                }
                // Misplaced declaration of an exception variable
                catch (SharePhoto sharephoto)
                {
                    throw new FacebookException("Unable to attach images", sharephoto);
                }
                return jsonobject;
            }

        });
    }

}
