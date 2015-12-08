// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.util.Base64;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.http.util.ByteArrayBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SocialSharing extends CordovaPlugin
{
    private abstract class SocialSharingRunnable
        implements Runnable
    {

        public CallbackContext callbackContext;
        final SocialSharing this$0;

        SocialSharingRunnable(CallbackContext callbackcontext)
        {
            this$0 = SocialSharing.this;
            super();
            callbackContext = callbackcontext;
        }
    }


    private static final String ACTION_AVAILABLE_EVENT = "available";
    private static final String ACTION_CAN_SHARE_VIA = "canShareVia";
    private static final String ACTION_CAN_SHARE_VIA_EMAIL = "canShareViaEmail";
    private static final String ACTION_SHARE_EVENT = "share";
    private static final String ACTION_SHARE_VIA = "shareVia";
    private static final String ACTION_SHARE_VIA_EMAIL_EVENT = "shareViaEmail";
    private static final String ACTION_SHARE_VIA_FACEBOOK_EVENT = "shareViaFacebook";
    private static final String ACTION_SHARE_VIA_FACEBOOK_WITH_PASTEMESSAGEHINT = "shareViaFacebookWithPasteMessageHint";
    private static final String ACTION_SHARE_VIA_SMS_EVENT = "shareViaSMS";
    private static final String ACTION_SHARE_VIA_TWITTER_EVENT = "shareViaTwitter";
    private static final String ACTION_SHARE_VIA_WHATSAPP_EVENT = "shareViaWhatsApp";
    private static final int ACTIVITY_CODE_SENDVIAEMAIL = 2;
    private CallbackContext _callbackContext;
    private String pasteMessage;

    public SocialSharing()
    {
    }

    private void cleanupOldFiles(File file)
    {
        file = file.listFiles();
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            file[i].delete();
        }

    }

    private void createOrCleanDir(String s)
        throws IOException
    {
        s = new File(s);
        if (!s.exists())
        {
            if (!s.mkdirs())
            {
                throw new IOException("CREATE_DIRS_FAILED");
            }
        } else
        {
            cleanupOldFiles(s);
        }
    }

    private boolean doSendIntent(final CallbackContext final_callbackcontext, final String msg, final String subject, final JSONArray files, final String url, final String appPackageName, final boolean peek)
    {
        final CordovaInterface mycordova = cordova;
        cordova.getThreadPool().execute(new SocialSharingRunnable(this) {

            final SocialSharing this$0;
            final String val$appPackageName;
            final JSONArray val$files;
            final String val$msg;
            final CordovaInterface val$mycordova;
            final boolean val$peek;
            final CordovaPlugin val$plugin;
            final String val$subject;
            final String val$url;

            public void run()
            {
                Object obj;
                String s;
                Object obj1;
                Intent intent;
                boolean flag;
                s = msg;
                String s2;
                int i;
                if (files.length() > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = "android.intent.action.SEND_MULTIPLE";
                } else
                {
                    obj = "android.intent.action.SEND";
                }
                intent = new Intent(((String) (obj)));
                intent.addFlags(0x80000);
                if (files.length() <= 0) goto _L2; else goto _L1
_L1:
                obj1 = new ArrayList();
                s2 = getDownloadDir();
                obj = null;
                i = 0;
_L4:
                if (i >= files.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                obj = getFileUriAndSetType(intent, s2, files.getString(i), subject, i);
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_126;
                }
                ((ArrayList) (obj1)).add(obj);
                i++;
                if (true) goto _L4; else goto _L3
_L3:
                if (((ArrayList) (obj1)).isEmpty()) goto _L6; else goto _L5
_L5:
                if (!flag) goto _L8; else goto _L7
_L7:
                try
                {
                    intent.putExtra("android.intent.extra.STREAM", ((java.io.Serializable) (obj1)));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    callbackContext.error(((Exception) (obj)).getMessage());
                }
_L6:
                if (SocialSharing.notEmpty(subject))
                {
                    intent.putExtra("android.intent.extra.SUBJECT", subject);
                }
                obj = s;
                if (SocialSharing.notEmpty(url))
                {
                    if (SocialSharing.notEmpty(s))
                    {
                        obj = (new StringBuilder()).append(s).append(" ").append(url).toString();
                    } else
                    {
                        obj = url;
                    }
                }
                if (SocialSharing.notEmpty(((String) (obj))))
                {
                    intent.putExtra("android.intent.extra.TEXT", ((String) (obj)));
                    intent.putExtra("sms_body", ((String) (obj)));
                }
                if (appPackageName == null)
                {
                    break MISSING_BLOCK_LABEL_485;
                }
                obj1 = appPackageName;
                obj = null;
                s = ((String) (obj1));
                if (((String) (obj1)).contains("/"))
                {
                    obj = appPackageName.split("/");
                    s = obj[0];
                    obj = obj[1];
                }
                obj1 = getActivity(callbackContext, intent, s);
                if (obj1 == null) goto _L10; else goto _L9
_L9:
                if (!peek) goto _L12; else goto _L11
_L11:
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
_L10:
                return;
_L8:
                intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
                  goto _L6
_L2:
                intent.setType("text/plain");
                  goto _L6
_L12:
                intent.addCategory("android.intent.category.LAUNCHER");
                String s1 = ((ActivityInfo) (obj1)).applicationInfo.packageName;
                if (obj == null)
                {
                    obj = ((ActivityInfo) (obj1)).name;
                }
                intent.setComponent(new ComponentName(s1, ((String) (obj))));
                mycordova.startActivityForResult(plugin, intent, 0);
                if (pasteMessage == null) goto _L10; else goto _L13
_L13:
                (new Timer()).schedule(new TimerTask() {

                    final _cls2 this$1;

                    public void run()
                    {
                        cordova.getActivity().runOnUiThread(new Runnable() {

                            final _cls1 this$2;

                            public void run()
                            {
                                showPasteMessage(msg, pasteMessage);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }, 2000L);
                return;
                if (peek)
                {
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
                    return;
                } else
                {
                    mycordova.startActivityForResult(plugin, Intent.createChooser(intent, null), 1);
                    return;
                }
            }

            
            {
                this$0 = SocialSharing.this;
                msg = s;
                files = jsonarray;
                subject = s1;
                url = s2;
                appPackageName = s3;
                peek = flag;
                mycordova = cordovainterface;
                plugin = cordovaplugin;
                super(final_callbackcontext);
            }
        });
        return true;
    }

    private ActivityInfo getActivity(CallbackContext callbackcontext, Intent intent, String s)
    {
        intent = webView.getContext().getPackageManager().queryIntentActivities(intent, 0);
        for (Iterator iterator = intent.iterator(); iterator.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            if (resolveinfo.activityInfo.packageName.contains(s))
            {
                return resolveinfo.activityInfo;
            }
        }

        callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, getShareActivities(intent)));
        return null;
    }

    private byte[] getBytes(InputStream inputstream)
        throws IOException
    {
        inputstream = new BufferedInputStream(inputstream);
        ByteArrayBuffer bytearraybuffer = new ByteArrayBuffer(5000);
        do
        {
            int i = inputstream.read();
            if (i != -1)
            {
                bytearraybuffer.append((byte)i);
            } else
            {
                return bytearraybuffer.toByteArray();
            }
        } while (true);
    }

    private String getDownloadDir()
        throws IOException
    {
        String s = (new StringBuilder()).append(webView.getContext().getExternalFilesDir(null)).append("/socialsharing-downloads").toString();
        createOrCleanDir(s);
        return s;
    }

    private String getFileName(String s)
    {
        int i = s.lastIndexOf('/');
        if (i == -1)
        {
            return s;
        } else
        {
            return s.substring(i + 1);
        }
    }

    private Uri getFileUriAndSetType(Intent intent, String s, String s1, String s2, int i)
        throws IOException
    {
        String s3;
        s3 = s1;
        intent.setType("image/*");
        if (!s1.startsWith("http") && !s1.startsWith("www/")) goto _L2; else goto _L1
_L1:
        s3 = getFileName(s1);
        s2 = (new StringBuilder()).append("file://").append(s).append("/").append(s3).toString();
        if (s1.startsWith("http"))
        {
            URLConnection urlconnection = (new URL(s1)).openConnection();
            Object obj = urlconnection.getHeaderField("Content-Disposition");
            s1 = s3;
            intent = s2;
            if (obj != null)
            {
                obj = Pattern.compile("filename=([^;]+)").matcher(((CharSequence) (obj)));
                s1 = s3;
                intent = s2;
                if (((Matcher) (obj)).find())
                {
                    s1 = ((Matcher) (obj)).group(1).replaceAll("[^a-zA-Z0-9._-]", "");
                    intent = (new StringBuilder()).append("file://").append(s).append("/").append(s1).toString();
                }
            }
            saveFile(getBytes(urlconnection.getInputStream()), s, s1);
        } else
        {
            saveFile(getBytes(webView.getContext().getAssets().open(s1)), s, s3);
            intent = s2;
        }
_L4:
        return Uri.parse(intent);
_L2:
        if (!s1.startsWith("data:"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.contains(";base64,"))
        {
            intent.setType("text/plain");
            return null;
        }
        s3 = s1.substring(s1.indexOf(";base64,") + 8);
        if (!s1.contains("data:image/"))
        {
            intent.setType(s1.substring(s1.indexOf("data:") + 5, s1.indexOf(";base64")));
        }
        s1 = s1.substring(s1.indexOf("/") + 1, s1.indexOf(";base64"));
        intent = (new StringBuilder()).append("file.").append(s1).toString();
        if (notEmpty(s2))
        {
            s2 = (new StringBuilder()).append(sanitizeFilename(s2));
            if (i == 0)
            {
                intent = "";
            } else
            {
                intent = (new StringBuilder()).append("_").append(i).toString();
            }
            intent = s2.append(intent).append(".").append(s1).toString();
        }
        saveFile(Base64.decode(s3, 0), s, intent);
        intent = (new StringBuilder()).append("file://").append(s).append("/").append(intent).toString();
        if (true) goto _L4; else goto _L3
_L3:
        intent = s3;
        if (!s1.startsWith("file://"))
        {
            throw new IllegalArgumentException("URL_NOT_SUPPORTED");
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static String getPhoneNumbersWithManufacturerSpecificSeparators(String s)
    {
        if (notEmpty(s))
        {
            char c;
            if (Build.MANUFACTURER.equalsIgnoreCase("samsung"))
            {
                c = ',';
            } else
            {
                c = ';';
            }
            return s.replace(';', c).replace(',', c);
        } else
        {
            return null;
        }
    }

    private JSONArray getShareActivities(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(((ResolveInfo)list.next()).activityInfo.packageName)) { }
        return new JSONArray(arraylist);
    }

    private boolean invokeEmailIntent(final CallbackContext final_callbackcontext, final String message, final String subject, final JSONArray to, final JSONArray cc, final JSONArray bcc, final JSONArray files)
        throws JSONException
    {
        cordova.getThreadPool().execute(new SocialSharingRunnable(this) {

            final SocialSharing this$0;
            final JSONArray val$bcc;
            final JSONArray val$cc;
            final JSONArray val$files;
            final String val$message;
            final SocialSharing val$plugin;
            final String val$subject;
            final JSONArray val$to;

            public void run()
            {
                Intent intent;
                ArrayList arraylist;
                intent = new Intent("android.intent.action.SEND_MULTIPLE");
                String s;
                Uri uri;
                int i;
                if (SocialSharing.notEmpty(message))
                {
                    if (Pattern.compile(".*\\<[^>]+>.*", 32).matcher(message).matches())
                    {
                        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(message));
                        intent.setType("text/html");
                    } else
                    {
                        intent.putExtra("android.intent.extra.TEXT", message);
                        intent.setType("text/plain");
                    }
                }
                if (SocialSharing.notEmpty(subject))
                {
                    intent.putExtra("android.intent.extra.SUBJECT", subject);
                }
                if (to != null && to.length() > 0)
                {
                    intent.putExtra("android.intent.extra.EMAIL", SocialSharing.toStringArray(to));
                }
                if (cc != null && cc.length() > 0)
                {
                    intent.putExtra("android.intent.extra.CC", SocialSharing.toStringArray(cc));
                }
                if (bcc != null && bcc.length() > 0)
                {
                    intent.putExtra("android.intent.extra.BCC", SocialSharing.toStringArray(bcc));
                }
                if (files.length() <= 0)
                {
                    break MISSING_BLOCK_LABEL_299;
                }
                arraylist = new ArrayList();
                s = getDownloadDir();
                i = 0;
_L2:
                if (i >= files.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                uri = getFileUriAndSetType(intent, s, files.getString(i), subject, i);
                if (uri == null)
                {
                    break MISSING_BLOCK_LABEL_254;
                }
                arraylist.add(uri);
                i++;
                if (true) goto _L2; else goto _L1
_L1:
                try
                {
                    if (!arraylist.isEmpty())
                    {
                        intent.putExtra("android.intent.extra.STREAM", arraylist);
                    }
                }
                catch (Exception exception)
                {
                    callbackContext.error(exception.getMessage());
                }
                intent.setType("application/octet-stream");
                cordova.startActivityForResult(plugin, Intent.createChooser(intent, "Choose Email App"), 2);
                return;
            }

            
            {
                this$0 = SocialSharing.this;
                message = s;
                subject = s1;
                to = jsonarray;
                cc = jsonarray1;
                bcc = jsonarray2;
                files = jsonarray3;
                plugin = socialsharing1;
                super(final_callbackcontext);
            }
        });
        return true;
    }

    private boolean invokeSMSIntent(final CallbackContext final_callbackcontext, final JSONObject message, final String phonenumbers)
    {
        message = message.optString("message");
        phonenumbers = getPhoneNumbersWithManufacturerSpecificSeparators(phonenumbers);
        cordova.getThreadPool().execute(new SocialSharingRunnable(this) {

            final SocialSharing this$0;
            final String val$image;
            final String val$message;
            final String val$phonenumbers;
            final SocialSharing val$plugin;
            final String val$subject;

            public void run()
            {
                if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
                Object obj;
                Object obj1 = new Intent("android.intent.action.SENDTO");
                StringBuilder stringbuilder = (new StringBuilder()).append("smsto:");
                if (SocialSharing.notEmpty(phonenumbers))
                {
                    obj = phonenumbers;
                } else
                {
                    obj = "";
                }
                ((Intent) (obj1)).setData(Uri.parse(stringbuilder.append(((String) (obj))).toString()));
                obj = obj1;
_L4:
                ((Intent) (obj)).putExtra("sms_body", message);
                ((Intent) (obj)).putExtra("sms_subject", subject);
                Intent intent;
                try
                {
                    if (image == null || "".equals(image))
                    {
                        break MISSING_BLOCK_LABEL_142;
                    }
                    obj1 = getFileUriAndSetType(((Intent) (obj)), getDownloadDir(), image, subject, 0);
                }
                catch (Exception exception)
                {
                    callbackContext.error(exception.getMessage());
                    return;
                }
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_142;
                }
                ((Intent) (obj)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj1)));
                cordova.startActivityForResult(plugin, ((Intent) (obj)), 0);
                return;
_L2:
                intent = new Intent("android.intent.action.VIEW");
                intent.setType("vnd.android-dir/mms-sms");
                obj = intent;
                if (phonenumbers != null)
                {
                    intent.putExtra("address", phonenumbers);
                    obj = intent;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = SocialSharing.this;
                phonenumbers = s;
                message = s1;
                subject = s2;
                image = s3;
                plugin = socialsharing1;
                super(final_callbackcontext);
            }
        });
        return true;
    }

    private boolean isEmailAvailable()
    {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "someone@domain.com", null));
        return cordova.getActivity().getPackageManager().queryIntentActivities(intent, 0).size() > 1;
    }

    private static boolean notEmpty(String s)
    {
        return s != null && !"".equals(s) && !"null".equalsIgnoreCase(s);
    }

    public static String sanitizeFilename(String s)
    {
        return s.replaceAll("[:\\\\/*?|<> ]", "_");
    }

    private void saveFile(byte abyte0[], String s, String s1)
        throws IOException
    {
        s = new FileOutputStream(new File(new File(s), s1));
        s.write(abyte0);
        s.flush();
        s.close();
    }

    private void showPasteMessage(String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return;
        } else
        {
            ((ClipboardManager)cordova.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(s1, s));
            s = Toast.makeText(webView.getContext(), s1, 1);
            s.setGravity(17, 0, 0);
            s.show();
            return;
        }
    }

    private static String[] toStringArray(JSONArray jsonarray)
        throws JSONException
    {
        String as[] = new String[jsonarray.length()];
        for (int i = 0; i < jsonarray.length(); i++)
        {
            as[i] = jsonarray.getString(i);
        }

        return as;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        _callbackContext = callbackcontext;
        pasteMessage = null;
        if ("available".equals(s))
        {
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
            return true;
        }
        if ("share".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), null, false);
        }
        if ("shareViaTwitter".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), "twitter", false);
        }
        if ("shareViaFacebook".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), "com.facebook.katana", false);
        }
        if ("shareViaFacebookWithPasteMessageHint".equals(s))
        {
            pasteMessage = jsonarray.getString(4);
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), "com.facebook.katana", false);
        }
        if ("shareViaWhatsApp".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), "whatsapp", false);
        }
        if ("canShareVia".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), jsonarray.getString(4), true);
        }
        if ("canShareViaEmail".equals(s))
        {
            if (isEmailAvailable())
            {
                callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
                return true;
            } else
            {
                callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, "not available"));
                return false;
            }
        }
        if ("shareVia".equals(s))
        {
            return doSendIntent(callbackcontext, jsonarray.getString(0), jsonarray.getString(1), jsonarray.getJSONArray(2), jsonarray.getString(3), jsonarray.getString(4), false);
        }
        if ("shareViaSMS".equals(s))
        {
            return invokeSMSIntent(callbackcontext, jsonarray.getJSONObject(0), jsonarray.getString(1));
        }
        if ("shareViaEmail".equals(s))
        {
            String s1 = jsonarray.getString(0);
            String s2 = jsonarray.getString(1);
            JSONArray jsonarray2 = jsonarray.getJSONArray(2);
            JSONArray jsonarray1;
            if (jsonarray.isNull(3))
            {
                s = null;
            } else
            {
                s = jsonarray.getJSONArray(3);
            }
            if (jsonarray.isNull(4))
            {
                jsonarray1 = null;
            } else
            {
                jsonarray1 = jsonarray.getJSONArray(4);
            }
            if (jsonarray.isNull(5))
            {
                jsonarray = null;
            } else
            {
                jsonarray = jsonarray.getJSONArray(5);
            }
            return invokeEmailIntent(callbackcontext, s1, s2, jsonarray2, s, jsonarray1, jsonarray);
        } else
        {
            callbackcontext.error((new StringBuilder()).append("socialSharing.").append(s).append(" is not a supported function. Did you mean '").append("share").append("'?").toString());
            return false;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (2 == i)
        {
            super.onActivityResult(i, j, intent);
            _callbackContext.success();
            return;
        }
        intent = _callbackContext;
        org.apache.cordova.PluginResult.Status status = org.apache.cordova.PluginResult.Status.OK;
        boolean flag;
        if (j == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.sendPluginResult(new PluginResult(status, flag));
    }







}
