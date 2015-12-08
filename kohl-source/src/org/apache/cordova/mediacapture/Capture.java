// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.mediacapture;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;
import org.apache.cordova.file.FileUtils;
import org.apache.cordova.file.LocalFilesystemURL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.mediacapture:
//            FileHelper

public class Capture extends CordovaPlugin
{

    private static final String AUDIO_3GPP = "audio/3gpp";
    private static final int CAPTURE_AUDIO = 0;
    private static final int CAPTURE_IMAGE = 1;
    private static final int CAPTURE_INTERNAL_ERR = 0;
    private static final int CAPTURE_NO_MEDIA_FILES = 3;
    private static final int CAPTURE_VIDEO = 2;
    private static final String IMAGE_JPEG = "image/jpeg";
    private static final String LOG_TAG = "Capture";
    private static final String VIDEO_3GPP = "video/3gpp";
    private static final String VIDEO_MP4 = "video/mp4";
    private CallbackContext callbackContext;
    private int duration;
    private long limit;
    private int numPics;
    private JSONArray results;

    public Capture()
    {
    }

    private void captureAudio()
    {
        Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
        cordova.startActivityForResult(this, intent, 0);
    }

    private void captureImage()
    {
        numPics = queryImgDB(whichContentStore()).getCount();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(getTempDirectoryPath(), "Capture.jpg");
        try
        {
            createWritableFile(file);
        }
        catch (IOException ioexception)
        {
            fail(createErrorObject(0, ioexception.toString()));
            return;
        }
        intent.putExtra("output", Uri.fromFile(file));
        cordova.startActivityForResult(this, intent, 1);
    }

    private void captureVideo(int i)
    {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (android.os.Build.VERSION.SDK_INT > 7)
        {
            intent.putExtra("android.intent.extra.durationLimit", i);
        }
        cordova.startActivityForResult(this, intent, 2);
    }

    private void checkForDuplicateImage()
    {
        Uri uri = whichContentStore();
        Cursor cursor = queryImgDB(uri);
        if (cursor.getCount() - numPics == 2)
        {
            cursor.moveToLast();
            int i = Integer.valueOf(cursor.getString(cursor.getColumnIndex("_id"))).intValue();
            uri = Uri.parse((new StringBuilder()).append(uri).append("/").append(i - 1).toString());
            cordova.getActivity().getContentResolver().delete(uri, null, null);
        }
    }

    private JSONObject createErrorObject(int i, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("code", i);
            jsonobject.put("message", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject createMediaFile(Uri uri)
    {
        Object obj;
        JSONObject jsonobject;
        File file;
        Class class1;
        file = webView.getResourceApi().mapUriToFile(uri);
        jsonobject = new JSONObject();
        class1 = webView.getClass();
        obj = null;
        PluginManager pluginmanager = (PluginManager)class1.getMethod("getPluginManager", new Class[0]).invoke(webView, new Object[0]);
        obj = pluginmanager;
_L5:
        Object obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = (PluginManager)class1.getField("pluginManager").get(webView);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                nosuchfieldexception = ((NoSuchFieldException) (obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj;
            }
        }
        obj = ((FileUtils)((PluginManager) (obj1)).getPlugin("File")).filesystemURLforLocalPath(file.getAbsolutePath());
        try
        {
            jsonobject.put("name", file.getName());
            jsonobject.put("fullPath", file.toURI().toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
            return jsonobject;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        jsonobject.put("localURL", ((LocalFilesystemURL) (obj)).toString());
        if (!file.getAbsoluteFile().toString().endsWith(".3gp") && !file.getAbsoluteFile().toString().endsWith(".3gpp"))
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (!uri.toString().contains("/audio/")) goto _L2; else goto _L1
_L1:
        jsonobject.put("type", "audio/3gpp");
_L3:
        jsonobject.put("lastModifiedDate", file.lastModified());
        jsonobject.put("size", file.length());
        return jsonobject;
_L2:
        jsonobject.put("type", "video/3gpp");
          goto _L3
        jsonobject.put("type", FileHelper.getMimeType(Uri.fromFile(file), cordova));
          goto _L3
        Object obj2;
        obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void createWritableFile(File file)
        throws IOException
    {
        file.createNewFile();
        file.setWritable(true, false);
    }

    private JSONObject getAudioVideoData(String s, JSONObject jsonobject, boolean flag)
        throws JSONException
    {
        MediaPlayer mediaplayer = new MediaPlayer();
        try
        {
            mediaplayer.setDataSource(s);
            mediaplayer.prepare();
            jsonobject.put("duration", mediaplayer.getDuration() / 1000);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("Capture", "Error: loading video file");
            return jsonobject;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        jsonobject.put("height", mediaplayer.getVideoHeight());
        jsonobject.put("width", mediaplayer.getVideoWidth());
        return jsonobject;
    }

    private JSONObject getFormatData(String s, String s1)
        throws JSONException
    {
        String s2;
        JSONObject jsonobject;
label0:
        {
            Uri uri;
            if (s.startsWith("file:"))
            {
                uri = Uri.parse(s);
            } else
            {
                uri = Uri.fromFile(new File(s));
            }
            jsonobject = new JSONObject();
            jsonobject.put("height", 0);
            jsonobject.put("width", 0);
            jsonobject.put("bitrate", 0);
            jsonobject.put("duration", 0);
            jsonobject.put("codecs", "");
            if (s1 != null && !s1.equals(""))
            {
                s2 = s1;
                if (!"null".equals(s1))
                {
                    break label0;
                }
            }
            s2 = FileHelper.getMimeType(uri, cordova);
        }
        Log.d("Capture", (new StringBuilder()).append("Mime type = ").append(s2).toString());
        if (!s2.equals("image/jpeg") && !s.endsWith(".jpg")) goto _L2; else goto _L1
_L1:
        s1 = getImageData(uri, jsonobject);
_L4:
        return s1;
_L2:
        if (s2.endsWith("audio/3gpp"))
        {
            return getAudioVideoData(s, jsonobject, false);
        }
        if (s2.equals("video/3gpp"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = jsonobject;
        if (!s2.equals("video/mp4")) goto _L4; else goto _L3
_L3:
        return getAudioVideoData(s, jsonobject, true);
    }

    private JSONObject getImageData(Uri uri, JSONObject jsonobject)
        throws JSONException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        jsonobject.put("height", options.outHeight);
        jsonobject.put("width", options.outWidth);
        return jsonobject;
    }

    private String getTempDirectoryPath()
    {
        File file = cordova.getActivity().getCacheDir();
        file.mkdirs();
        return file.getAbsolutePath();
    }

    private Cursor queryImgDB(Uri uri)
    {
        return cordova.getActivity().getContentResolver().query(uri, new String[] {
            "_id"
        }, null, null, null);
    }

    private Uri whichContentStore()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            return android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else
        {
            return android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        callbackContext = callbackcontext;
        limit = 1L;
        duration = 0;
        results = new JSONArray();
        JSONObject jsonobject = jsonarray.optJSONObject(0);
        if (jsonobject != null)
        {
            limit = jsonobject.optLong("limit", 1L);
            duration = jsonobject.optInt("duration", 0);
        }
        if (s.equals("getFormatData"))
        {
            callbackcontext.success(getFormatData(jsonarray.getString(0), jsonarray.getString(1)));
            return true;
        }
        if (s.equals("captureAudio"))
        {
            captureAudio();
            return true;
        }
        if (s.equals("captureImage"))
        {
            captureImage();
            return true;
        }
        if (s.equals("captureVideo"))
        {
            captureVideo(duration);
            return true;
        } else
        {
            return false;
        }
    }

    public void fail(JSONObject jsonobject)
    {
        callbackContext.error(jsonobject);
    }

    public void onActivityResult(int i, int j, final Intent intent)
    {
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        intent = new Runnable() {

            final Capture this$0;
            final Intent val$intent;
            final Capture val$that;

            public void run()
            {
                Uri uri = intent.getData();
                results.put(createMediaFile(uri));
                if ((long)results.length() >= limit)
                {
                    that.callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, results));
                    return;
                } else
                {
                    captureAudio();
                    return;
                }
            }

            
            {
                this$0 = Capture.this;
                intent = intent1;
                that = capture1;
                super();
            }
        };
        cordova.getThreadPool().execute(intent);
_L4:
        return;
_L2:
        if (i == 1)
        {
            intent = new Runnable() {

                final Capture this$0;
                final Capture val$that;

                public void run()
                {
                    Object obj1;
                    obj1 = new ContentValues();
                    ((ContentValues) (obj1)).put("mime_type", "image/jpeg");
                    Object obj = that.cordova.getActivity().getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ((ContentValues) (obj1)));
_L2:
                    OutputStream outputstream;
                    byte abyte0[];
                    obj1 = new FileInputStream((new StringBuilder()).append(getTempDirectoryPath()).append("/Capture.jpg").toString());
                    outputstream = that.cordova.getActivity().getContentResolver().openOutputStream(((Uri) (obj)));
                    abyte0 = new byte[4096];
_L1:
                    int k = ((FileInputStream) (obj1)).read(abyte0);
                    if (k == -1)
                    {
                        break MISSING_BLOCK_LABEL_208;
                    }
                    try
                    {
                        outputstream.write(abyte0, 0, k);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                        that.fail(createErrorObject(0, "Error capturing image."));
                        return;
                    }
                      goto _L1
                    obj;
                    LOG.d("Capture", "Can't write to external media storage.");
                    obj = that.cordova.getActivity().getContentResolver().insert(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, ((ContentValues) (obj1)));
                      goto _L2
                    obj;
                    LOG.d("Capture", "Can't write to internal media storage.");
                    that.fail(createErrorObject(0, "Error capturing image - no media storage found."));
                    return;
                    outputstream.flush();
                    outputstream.close();
                    ((FileInputStream) (obj1)).close();
                    results.put(createMediaFile(((Uri) (obj))));
                    checkForDuplicateImage();
                    if ((long)results.length() >= limit)
                    {
                        that.callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, results));
                        return;
                    }
                    captureImage();
                    return;
                }

            
            {
                this$0 = Capture.this;
                that = capture1;
                super();
            }
            };
            cordova.getThreadPool().execute(intent);
            return;
        }
        if (i != 2) goto _L4; else goto _L3
_L3:
        intent = new Runnable() {

            final Capture this$0;
            final Intent val$intent;
            final Capture val$that;

            public void run()
            {
                Uri uri = null;
                if (intent != null)
                {
                    uri = intent.getData();
                }
                Uri uri1 = uri;
                if (uri == null)
                {
                    uri1 = Uri.fromFile(new File(getTempDirectoryPath(), "Capture.avi"));
                }
                if (uri1 == null)
                {
                    that.fail(createErrorObject(3, "Error: data is null"));
                    return;
                }
                results.put(createMediaFile(uri1));
                if ((long)results.length() >= limit)
                {
                    that.callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, results));
                    return;
                } else
                {
                    captureVideo(duration);
                    return;
                }
            }

            
            {
                this$0 = Capture.this;
                intent = intent1;
                that = capture1;
                super();
            }
        };
        cordova.getThreadPool().execute(intent);
        return;
        if (j == 0)
        {
            if (results.length() > 0)
            {
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, results));
                return;
            } else
            {
                fail(createErrorObject(3, "Canceled."));
                return;
            }
        }
        if (results.length() > 0)
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, results));
            return;
        } else
        {
            fail(createErrorObject(3, "Did not complete!"));
            return;
        }
    }











}
