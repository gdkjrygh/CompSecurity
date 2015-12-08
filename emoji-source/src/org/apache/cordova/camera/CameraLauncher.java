// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.camera;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.camera:
//            FileHelper, ExifHelper

public class CameraLauncher extends CordovaPlugin
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    private static final int ALLMEDIA = 2;
    private static final int CAMERA = 1;
    private static final int CROP_CAMERA = 100;
    private static final int DATA_URL = 0;
    private static final int FILE_URI = 1;
    private static final String GET_All = "Get All";
    private static final String GET_PICTURE = "Get Picture";
    private static final String GET_VIDEO = "Get Video";
    private static final int JPEG = 0;
    private static final String LOG_TAG = "CameraLauncher";
    private static final int NATIVE_URI = 2;
    private static final int PHOTOLIBRARY = 0;
    private static final int PICTURE = 0;
    private static final int PNG = 1;
    private static final int SAVEDPHOTOALBUM = 2;
    private static final int VIDEO = 1;
    private boolean allowEdit;
    public CallbackContext callbackContext;
    private MediaScannerConnection conn;
    private boolean correctOrientation;
    private Uri croppedUri;
    private int encodingType;
    private Uri imageUri;
    private int mQuality;
    private int mediaType;
    private int numPics;
    private boolean orientationCorrected;
    private boolean saveToPhotoAlbum;
    private Uri scanMe;
    private int targetHeight;
    private int targetWidth;

    public CameraLauncher()
    {
    }

    public static int calculateSampleSize(int i, int j, int k, int l)
    {
        if ((float)i / (float)j > (float)k / (float)l)
        {
            return i / k;
        } else
        {
            return j / l;
        }
    }

    private void checkForDuplicateImage(int i)
    {
        boolean flag = true;
        Uri uri = whichContentStore();
        Cursor cursor = queryImgDB(uri);
        int k = cursor.getCount();
        byte byte0 = flag;
        if (i == 1)
        {
            byte0 = flag;
            if (saveToPhotoAlbum)
            {
                byte0 = 2;
            }
        }
        if (k - numPics == byte0)
        {
            cursor.moveToLast();
            int j = Integer.valueOf(cursor.getString(cursor.getColumnIndex("_id"))).intValue();
            i = j;
            if (byte0 == 2)
            {
                i = j - 1;
            }
            uri = Uri.parse((new StringBuilder()).append(uri).append("/").append(i).toString());
            cordova.getActivity().getContentResolver().delete(uri, null, null);
            cursor.close();
        }
    }

    private void cleanup(int i, Uri uri, Uri uri1, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        (new File(FileHelper.stripFileProtocol(uri.toString()))).delete();
        checkForDuplicateImage(i);
        if (saveToPhotoAlbum && uri1 != null)
        {
            scanForGallery(uri1);
        }
        System.gc();
    }

    private File createCaptureFile(int i)
    {
        if (i == 0)
        {
            return new File(getTempDirectoryPath(), ".Pic.jpg");
        }
        if (i == 1)
        {
            return new File(getTempDirectoryPath(), ".Pic.png");
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Encoding Type: ").append(i).toString());
        }
    }

    private int getImageOrientation(Uri uri)
    {
        boolean flag = false;
        int j = 0;
        int i = ((flag) ? 1 : 0);
        try
        {
            uri = cordova.getActivity().getContentResolver().query(uri, new String[] {
                "orientation"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return i;
        }
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        i = ((flag) ? 1 : 0);
        uri.moveToPosition(0);
        i = ((flag) ? 1 : 0);
        j = uri.getInt(0);
        i = j;
        uri.close();
        return j;
    }

    private Bitmap getRotatedBitmap(int i, Bitmap bitmap, ExifHelper exifhelper)
    {
        Matrix matrix = new Matrix();
        Bitmap bitmap1;
        if (i == 180)
        {
            matrix.setRotate(i);
        } else
        {
            matrix.setRotate(i, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        }
        bitmap1 = bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return bitmap1;
        }
        bitmap1 = bitmap;
        exifhelper.resetOrientation();
        return bitmap;
    }

    private Bitmap getScaledBitmap(String s)
        throws IOException
    {
        Object obj = null;
        Bitmap bitmap;
        if (targetWidth <= 0 && targetHeight <= 0)
        {
            bitmap = BitmapFactory.decodeStream(FileHelper.getInputStreamFromUriString(s, cordova));
        } else
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(FileHelper.getInputStreamFromUriString(s, cordova), null, options);
            bitmap = obj;
            if (options.outWidth != 0)
            {
                bitmap = obj;
                if (options.outHeight != 0)
                {
                    int ai[] = calculateAspectRatio(options.outWidth, options.outHeight);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = calculateSampleSize(options.outWidth, options.outHeight, targetWidth, targetHeight);
                    s = BitmapFactory.decodeStream(FileHelper.getInputStreamFromUriString(s, cordova), null, options);
                    bitmap = obj;
                    if (s != null)
                    {
                        return Bitmap.createScaledBitmap(s, ai[0], ai[1], true);
                    }
                }
            }
        }
        return bitmap;
    }

    private String getTempDirectoryPath()
    {
        File file;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Android/data/").append(cordova.getActivity().getPackageName()).append("/cache/").toString());
        } else
        {
            file = cordova.getActivity().getCacheDir();
        }
        file.mkdirs();
        return file.getAbsolutePath();
    }

    private Uri getUriFromMediaStore()
    {
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("mime_type", "image/jpeg");
        Uri uri;
        try
        {
            uri = cordova.getActivity().getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ((ContentValues) (obj)));
        }
        catch (RuntimeException runtimeexception1)
        {
            LOG.d("CameraLauncher", "Can't write to external media storage.");
            try
            {
                obj = cordova.getActivity().getContentResolver().insert(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, ((ContentValues) (obj)));
            }
            catch (RuntimeException runtimeexception)
            {
                LOG.d("CameraLauncher", "Can't write to internal media storage.");
                return null;
            }
            return ((Uri) (obj));
        }
        return uri;
    }

    private String ouputModifiedBitmap(Bitmap bitmap, Uri uri)
        throws IOException
    {
        String s = (new StringBuilder()).append(getTempDirectoryPath()).append("/modified.jpg").toString();
        FileOutputStream fileoutputstream = new FileOutputStream(s);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, mQuality, fileoutputstream);
        fileoutputstream.close();
        bitmap = FileHelper.getRealPath(uri, cordova);
        uri = new ExifHelper();
        if (bitmap != null && encodingType == 0)
        {
            try
            {
                uri.createInFile(bitmap);
                uri.readExifData();
                if (correctOrientation && orientationCorrected)
                {
                    uri.resetOrientation();
                }
                uri.createOutFile(s);
                uri.writeExifData();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
                return s;
            }
        }
        return s;
    }

    private void performCrop(Uri uri)
    {
        try
        {
            Intent intent = new Intent("com.android.camera.action.CROP");
            intent.setDataAndType(uri, "image/*");
            intent.putExtra("crop", "true");
            if (targetWidth > 0)
            {
                intent.putExtra("outputX", targetWidth);
            }
            if (targetHeight > 0)
            {
                intent.putExtra("outputY", targetHeight);
            }
            if (targetHeight > 0 && targetWidth > 0 && targetWidth == targetHeight)
            {
                intent.putExtra("aspectX", 1);
                intent.putExtra("aspectY", 1);
            }
            croppedUri = Uri.fromFile(new File(getTempDirectoryPath(), (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
            intent.putExtra("output", croppedUri);
            if (cordova != null)
            {
                cordova.startActivityForResult(this, intent, 100);
            }
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.e("CameraLauncher", "Crop operation not supported on this device");
        }
        callbackContext.success(uri.toString());
    }

    private void processResultFromCamera(int i, Intent intent)
        throws IOException
    {
        ExifHelper exifhelper;
        boolean flag;
        flag = false;
        exifhelper = new ExifHelper();
        Object obj;
        Object obj1;
        int j;
        if (encodingType == 0)
        {
            exifhelper.createInFile((new StringBuilder()).append(getTempDirectoryPath()).append("/.Pic.jpg").toString());
            exifhelper.readExifData();
            j = exifhelper.getOrientation();
            break MISSING_BLOCK_LABEL_59;
        }
        j = ((flag) ? 1 : 0);
        try
        {
            if (encodingType == 1)
            {
                exifhelper.createInFile((new StringBuilder()).append(getTempDirectoryPath()).append("/.Pic.png").toString());
                exifhelper.readExifData();
                j = exifhelper.getOrientation();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            j = ((flag) ? 1 : 0);
        }
        if (true) goto _L2; else goto _L1
_L2:
        obj = null;
        obj1 = null;
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Bitmap bitmap = getScaledBitmap(FileHelper.stripFileProtocol(imageUri.toString()));
        obj = bitmap;
        if (bitmap == null)
        {
            obj = (Bitmap)intent.getExtras().get("data");
        }
        if (obj == null)
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to create bitmap!");
            return;
        }
        intent = ((Intent) (obj));
        if (j != 0)
        {
            intent = ((Intent) (obj));
            if (correctOrientation)
            {
                intent = getRotatedBitmap(j, ((Bitmap) (obj)), exifhelper);
            }
        }
        processPicture(intent);
        checkForDuplicateImage(0);
        obj = intent;
_L4:
        cleanup(1, imageUri, ((Uri) (obj1)), ((Bitmap) (obj)));
        return;
_L1:
        if (i == 1 || i == 2)
        {
            if (saveToPhotoAlbum)
            {
                intent = getUriFromMediaStore();
                try
                {
                    intent = Uri.fromFile(new File(FileHelper.getRealPath(intent, cordova)));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent = null;
                }
            } else
            {
                intent = Uri.fromFile(new File(getTempDirectoryPath(), (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
            }
            if (intent == null)
            {
                failPicture("Error capturing image - no media storage found.");
                return;
            }
            if (targetHeight == -1 && targetWidth == -1 && mQuality == 100 && !correctOrientation)
            {
                writeUncompressedImage(intent);
                callbackContext.success(intent.toString());
                obj1 = intent;
            } else
            {
                obj1 = getScaledBitmap(FileHelper.stripFileProtocol(imageUri.toString()));
                obj = obj1;
                if (j != 0)
                {
                    obj = obj1;
                    if (correctOrientation)
                    {
                        obj = getRotatedBitmap(j, ((Bitmap) (obj1)), exifhelper);
                    }
                }
                obj1 = cordova.getActivity().getContentResolver().openOutputStream(intent);
                ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, mQuality, ((OutputStream) (obj1)));
                ((OutputStream) (obj1)).close();
                if (encodingType == 0)
                {
                    if (saveToPhotoAlbum)
                    {
                        obj1 = FileHelper.getRealPath(intent, cordova);
                    } else
                    {
                        obj1 = intent.getPath();
                    }
                    exifhelper.createOutFile(((String) (obj1)));
                    exifhelper.writeExifData();
                }
                if (allowEdit)
                {
                    performCrop(intent);
                    obj1 = intent;
                } else
                {
                    callbackContext.success(intent.toString());
                    obj1 = intent;
                }
            }
        } else
        {
            throw new IllegalStateException();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void processResultFromGallery(int i, Intent intent)
    {
        Object obj;
        Object obj1;
label0:
        {
label1:
            {
                intent = intent.getData();
                obj1 = intent;
                if (intent == null)
                {
                    if (croppedUri == null)
                    {
                        break label1;
                    }
                    obj1 = croppedUri;
                }
                if (mediaType != 0)
                {
                    callbackContext.success(((Uri) (obj1)).toString());
                    return;
                }
                break label0;
            }
            failPicture("null data from photo library");
            return;
        }
        if (targetHeight == -1 && targetWidth == -1 && (i == 1 || i == 2) && !correctOrientation)
        {
            callbackContext.success(((Uri) (obj1)).toString());
            return;
        }
        obj = ((Uri) (obj1)).toString();
        intent = FileHelper.getMimeType(((String) (obj)), cordova);
        if (!"image/jpeg".equalsIgnoreCase(intent) && !"image/png".equalsIgnoreCase(intent))
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to retrieve path to picture!");
            return;
        }
        intent = null;
        obj = getScaledBitmap(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        if (intent == null)
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to create bitmap!");
            return;
        }
        break; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        Matrix matrix;
        ioexception = intent;
        if (!correctOrientation)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        int j = getImageOrientation(((Uri) (obj1)));
        ioexception = intent;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        matrix = new Matrix();
        matrix.setRotate(j);
        ioexception = intent;
        intent = Bitmap.createBitmap(intent, 0, 0, intent.getWidth(), intent.getHeight(), matrix, true);
        ioexception = intent;
        orientationCorrected = true;
        ioexception = intent;
_L3:
        if (i == 0)
        {
            processPicture(ioexception);
        } else
        if (i == 1 || i == 2)
        {
            if (targetHeight > 0 && targetWidth > 0 || correctOrientation && orientationCorrected)
            {
                try
                {
                    intent = ouputModifiedBitmap(ioexception, ((Uri) (obj1)));
                    callbackContext.success((new StringBuilder()).append("file://").append(intent).append("?").append(System.currentTimeMillis()).toString());
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent.printStackTrace();
                    failPicture("Error retrieving image.");
                }
            } else
            {
                callbackContext.success(((Uri) (obj1)).toString());
            }
        }
        if (ioexception != null)
        {
            ioexception.recycle();
        }
        System.gc();
        return;
        intent;
        orientationCorrected = false;
          goto _L3
    }

    private Cursor queryImgDB(Uri uri)
    {
        return cordova.getActivity().getContentResolver().query(uri, new String[] {
            "_id"
        }, null, null, null);
    }

    private void scanForGallery(Uri uri)
    {
        scanMe = uri;
        if (conn != null)
        {
            conn.disconnect();
        }
        conn = new MediaScannerConnection(cordova.getActivity().getApplicationContext(), this);
        conn.connect();
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

    private void writeUncompressedImage(Uri uri)
        throws FileNotFoundException, IOException
    {
        FileInputStream fileinputstream = new FileInputStream(FileHelper.stripFileProtocol(imageUri.toString()));
        uri = cordova.getActivity().getContentResolver().openOutputStream(uri);
        byte abyte0[] = new byte[4096];
        do
        {
            int i = fileinputstream.read(abyte0);
            if (i != -1)
            {
                uri.write(abyte0, 0, i);
            } else
            {
                uri.flush();
                uri.close();
                fileinputstream.close();
                return;
            }
        } while (true);
    }

    public int[] calculateAspectRatio(int i, int j)
    {
        int l;
        int i1;
        l = targetWidth;
        i1 = targetHeight;
        if (l > 0 || i1 > 0) goto _L2; else goto _L1
_L1:
        int k;
        l = i;
        k = j;
_L4:
        return (new int[] {
            l, k
        });
_L2:
        if (l > 0 && i1 <= 0)
        {
            k = (l * j) / i;
        } else
        if (l <= 0 && i1 > 0)
        {
            l = (i1 * i) / j;
            k = i1;
        } else
        {
            double d = (double)l / (double)i1;
            double d1 = (double)i / (double)j;
            if (d1 > d)
            {
                k = (l * j) / i;
            } else
            {
                k = i1;
                if (d1 < d)
                {
                    l = (i1 * i) / j;
                    k = i1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
label0:
        {
            {
                callbackContext = callbackcontext;
                if (!s.equals("takePicture"))
                {
                    break MISSING_BLOCK_LABEL_251;
                }
                saveToPhotoAlbum = false;
                targetHeight = 0;
                targetWidth = 0;
                encodingType = 0;
                mediaType = 0;
                mQuality = 80;
                mQuality = jsonarray.getInt(0);
                int i = jsonarray.getInt(1);
                int j = jsonarray.getInt(2);
                targetWidth = jsonarray.getInt(3);
                targetHeight = jsonarray.getInt(4);
                encodingType = jsonarray.getInt(5);
                mediaType = jsonarray.getInt(6);
                allowEdit = jsonarray.getBoolean(7);
                correctOrientation = jsonarray.getBoolean(8);
                saveToPhotoAlbum = jsonarray.getBoolean(9);
                if (targetWidth < 1)
                {
                    targetWidth = -1;
                }
                if (targetHeight < 1)
                {
                    targetHeight = -1;
                }
                if (j != 1)
                {
                    break label0;
                }
                try
                {
                    takePicture(i, encodingType);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    callbackcontext.error("Illegal Argument Exception");
                    callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR));
                    return true;
                }
            }
            s = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
            s.setKeepCallback(true);
            callbackcontext.sendPluginResult(s);
            return true;
        }
        if (j != 0 && j != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        getImage(j, i, encodingType);
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_251;
_L2:
        break MISSING_BLOCK_LABEL_178;
        return false;
    }

    public void failPicture(String s)
    {
        callbackContext.error(s);
    }

    public void getImage(int i, int j, int k)
    {
        String s;
        Intent intent;
        intent = new Intent();
        s = "Get Picture";
        croppedUri = null;
        if (mediaType != 0) goto _L2; else goto _L1
_L1:
        intent.setType("image/*");
        if (allowEdit)
        {
            intent.setAction("android.intent.action.PICK");
            intent.putExtra("crop", "true");
            if (targetWidth > 0)
            {
                intent.putExtra("outputX", targetWidth);
            }
            if (targetHeight > 0)
            {
                intent.putExtra("outputY", targetHeight);
            }
            if (targetHeight > 0 && targetWidth > 0 && targetWidth == targetHeight)
            {
                intent.putExtra("aspectX", 1);
                intent.putExtra("aspectY", 1);
            }
            croppedUri = Uri.fromFile(createCaptureFile(k));
            intent.putExtra("output", croppedUri);
        } else
        {
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        }
_L4:
        if (cordova != null)
        {
            cordova.startActivityForResult(this, Intent.createChooser(intent, new String(s)), (i + 1) * 16 + j + 1);
        }
        return;
_L2:
        if (mediaType == 1)
        {
            intent.setType("video/*");
            s = "Get Video";
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else
        if (mediaType == 2)
        {
            intent.setType("*/*");
            s = "Get All";
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        int k;
        int l;
        k = i / 16 - 1;
        l = i % 16 - 1;
        if (i == 100)
        {
            if (j == -1)
            {
                callbackContext.success(croppedUri.toString());
                croppedUri = null;
            } else
            if (j == 0)
            {
                failPicture("Camera cancelled.");
            } else
            {
                failPicture("Did not complete!");
            }
        }
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (j != -1) goto _L2; else goto _L1
_L1:
        processResultFromCamera(l, intent);
_L3:
        return;
        intent;
        intent.printStackTrace();
        failPicture("Error capturing image.");
        return;
_L2:
        if (j == 0)
        {
            failPicture("Camera cancelled.");
            return;
        } else
        {
            failPicture("Did not complete!");
            return;
        }
        if (k == 0 || k == 2)
        {
            if (j == -1 && intent != null)
            {
                processResultFromGallery(l, intent);
                return;
            }
            if (j == 0)
            {
                failPicture("Selection cancelled.");
                return;
            } else
            {
                failPicture("Selection did not complete!");
                return;
            }
        }
          goto _L3
    }

    public void onMediaScannerConnected()
    {
        try
        {
            conn.scanFile(scanMe.toString(), "image/*");
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            LOG.e("CameraLauncher", "Can't scan file in MediaScanner after taking picture");
        }
    }

    public void onScanCompleted(String s, Uri uri)
    {
        conn.disconnect();
    }

    public void processPicture(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, mQuality, bytearrayoutputstream))
        {
            bitmap = new String(Base64.encode(bytearrayoutputstream.toByteArray(), 2));
            callbackContext.success(bitmap);
        }
_L1:
        return;
        bitmap;
        failPicture("Error compressing image.");
          goto _L1
    }

    public void takePicture(int i, int j)
    {
        numPics = queryImgDB(whichContentStore()).getCount();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = createCaptureFile(j);
        intent.putExtra("output", Uri.fromFile(file));
        imageUri = Uri.fromFile(file);
        if (cordova != null)
        {
            cordova.startActivityForResult(this, intent, i + 32 + 1);
        }
    }
}
