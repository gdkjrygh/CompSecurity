// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.contacts:
//            ContactAccessorSdk5, ContactAccessor

public class ContactManager extends CordovaPlugin
{

    private static final int CONTACT_PICKER_RESULT = 1000;
    public static final int INVALID_ARGUMENT_ERROR = 1;
    public static final int IO_ERROR = 4;
    private static final String LOG_TAG = "Contact Query";
    public static final int NOT_SUPPORTED_ERROR = 5;
    public static final int PENDING_OPERATION_ERROR = 3;
    public static final int PERMISSION_DENIED_ERROR = 20;
    public static final int TIMEOUT_ERROR = 2;
    public static final int UNKNOWN_ERROR = 0;
    private CallbackContext callbackContext;
    private ContactAccessor contactAccessor;
    private JSONArray executeArgs;

    public ContactManager()
    {
    }

    private void pickContactAsync()
    {
        Runnable runnable = new Runnable() {

            final ContactManager this$0;
            final CordovaPlugin val$plugin;

            public void run()
            {
                Intent intent = new Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI);
                plugin.cordova.startActivityForResult(plugin, intent, 1000);
            }

            
            {
                this$0 = ContactManager.this;
                plugin = cordovaplugin;
                super();
            }
        };
        cordova.getThreadPool().execute(runnable);
    }

    public boolean execute(final String options, JSONArray jsonarray, final CallbackContext callbackContext)
        throws JSONException
    {
        this.callbackContext = callbackContext;
        executeArgs = jsonarray;
        if (android.os.Build.VERSION.RELEASE.startsWith("1."))
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 5));
            return true;
        }
        if (contactAccessor == null)
        {
            contactAccessor = new ContactAccessorSdk5(cordova);
        }
        if (options.equals("search"))
        {
            final JSONArray filter = jsonarray.getJSONArray(0);
            if (jsonarray.get(1) == null)
            {
                options = null;
            } else
            {
                options = jsonarray.getJSONObject(1);
            }
            cordova.getThreadPool().execute(new Runnable() {

                final ContactManager this$0;
                final CallbackContext val$callbackContext;
                final JSONArray val$filter;
                final JSONObject val$options;

                public void run()
                {
                    JSONArray jsonarray1 = contactAccessor.search(filter, options);
                    callbackContext.success(jsonarray1);
                }

            
            {
                this$0 = ContactManager.this;
                filter = jsonarray;
                options = jsonobject;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        }
        if (options.equals("save"))
        {
            options = jsonarray.getJSONObject(0);
            cordova.getThreadPool().execute(new Runnable() {

                final ContactManager this$0;
                final CallbackContext val$callbackContext;
                final JSONObject val$contact;

                public void run()
                {
                    Object obj = null;
                    String s = contactAccessor.save(contact);
                    JSONObject jsonobject = obj;
                    if (s != null)
                    {
                        try
                        {
                            jsonobject = contactAccessor.getContactById(s);
                        }
                        catch (JSONException jsonexception)
                        {
                            Log.e("Contact Query", "JSON fail.", jsonexception);
                            jsonexception = obj;
                        }
                    }
                    if (jsonobject != null)
                    {
                        callbackContext.success(jsonobject);
                        return;
                    } else
                    {
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 0));
                        return;
                    }
                }

            
            {
                this$0 = ContactManager.this;
                contact = jsonobject;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        }
        if (options.equals("remove"))
        {
            options = jsonarray.getString(0);
            cordova.getThreadPool().execute(new Runnable() {

                final ContactManager this$0;
                final CallbackContext val$callbackContext;
                final String val$contactId;

                public void run()
                {
                    if (contactAccessor.remove(contactId))
                    {
                        callbackContext.success();
                        return;
                    } else
                    {
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 0));
                        return;
                    }
                }

            
            {
                this$0 = ContactManager.this;
                contactId = s;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        }
        if (options.equals("pickContact"))
        {
            pickContactAsync();
            return true;
        } else
        {
            return false;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1000) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        String s1 = intent.getData().getLastPathSegment();
        intent = cordova.getActivity().getContentResolver();
        Uri uri = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        s1 = (new StringBuilder()).append("contact_id = ").append(s1).toString();
        intent = intent.query(uri, new String[] {
            "_id"
        }, s1, null, null);
        if (intent.moveToFirst()) goto _L6; else goto _L5
_L5:
        callbackContext.error("Error occured while retrieving contact raw id");
_L2:
        return;
_L6:
        String s = intent.getString(intent.getColumnIndex("_id"));
        intent.close();
        try
        {
            intent = contactAccessor.getContactById(s);
            callbackContext.success(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("Contact Query", "JSON fail.", intent);
        }
_L8:
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 0));
        return;
_L4:
        if (j == 0)
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT, 0));
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

}
