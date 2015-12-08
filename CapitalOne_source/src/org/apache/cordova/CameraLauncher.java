// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
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
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.codec.binary.Base64;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            FileUtils, DirectoryManager, ExifHelper

public class CameraLauncher extends CordovaPlugin
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    private static final int ALLMEDIA = 2;
    private static final int CAMERA = 1;
    private static final int DATA_URL = 0;
    private static final int FILE_URI = 1;
    private static final String GET_All = "Get All";
    private static final String GET_PICTURE = "Get Picture";
    private static final String GET_VIDEO = "Get Video";
    private static final int JPEG = 0;
    private static final String LOG_TAG = "CameraLauncher";
    private static final int PHOTOLIBRARY = 0;
    private static final int PICTURE = 0;
    private static final int PNG = 1;
    private static final int SAVEDPHOTOALBUM = 2;
    private static final int VIDEO = 1;
    public CallbackContext callbackContext;
    private MediaScannerConnection conn;
    private boolean correctOrientation;
    private int encodingType;
    private Uri imageUri;
    private int mQuality;
    private int mediaType;
    private int numPics;
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
        }
    }

    private void cleanup(int i, Uri uri, Uri uri1, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        (new File(FileUtils.stripFileProtocol(uri.toString()))).delete();
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
            return new File(DirectoryManager.getTempDirectoryPath(cordova.getActivity()), ".Pic.jpg");
        }
        if (i == 1)
        {
            return new File(DirectoryManager.getTempDirectoryPath(cordova.getActivity()), ".Pic.png");
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Encoding Type: ").append(i).toString());
        }
    }

    private Bitmap getRotatedBitmap(int i, Bitmap bitmap, ExifHelper exifhelper)
    {
        Matrix matrix = new Matrix();
        if (i == 180)
        {
            matrix.setRotate(i);
        } else
        {
            matrix.setRotate(i, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        }
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        exifhelper.resetOrientation();
        return bitmap;
    }

    private Bitmap getScaledBitmap(String s)
    {
        if (targetWidth <= 0 && targetHeight <= 0)
        {
            return BitmapFactory.decodeFile(s);
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        int ai[] = calculateAspectRatio(options.outWidth, options.outHeight);
        options.inJustDecodeBounds = false;
        options.inSampleSize = calculateSampleSize(options.outWidth, options.outHeight, targetWidth, targetHeight);
        s = BitmapFactory.decodeFile(s, options);
        if (s == null)
        {
            return null;
        } else
        {
            return Bitmap.createScaledBitmap(s, ai[0], ai[1], true);
        }
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
        catch (UnsupportedOperationException unsupportedoperationexception1)
        {
            LOG.d("CameraLauncher", "Can't write to external media storage.");
            try
            {
                obj = cordova.getActivity().getContentResolver().insert(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, ((ContentValues) (obj)));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                LOG.d("CameraLauncher", "Can't write to internal media storage.");
                return null;
            }
            return ((Uri) (obj));
        }
        return uri;
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
        FileInputStream fileinputstream = new FileInputStream(FileUtils.stripFileProtocol(imageUri.toString()));
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
        callbackContext = callbackcontext;
        if (!s.equals("takePicture")) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        saveToPhotoAlbum = false;
        targetHeight = 0;
        targetWidth = 0;
        encodingType = 0;
        mediaType = 0;
        mQuality = 80;
        mQuality = jsonarray.getInt(0);
        i = jsonarray.getInt(1);
        j = jsonarray.getInt(2);
        targetWidth = jsonarray.getInt(3);
        targetHeight = jsonarray.getInt(4);
        encodingType = jsonarray.getInt(5);
        mediaType = jsonarray.getInt(6);
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
        if (j != 1) goto _L4; else goto _L3
_L3:
        takePicture(i, encodingType);
_L5:
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        s.setKeepCallback(true);
        callbackcontext.sendPluginResult(s);
        return true;
_L4:
        if (j == 0 || j == 2)
        {
            getImage(j, i);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }

    public void failPicture(String s)
    {
        callbackContext.error(s);
    }

    public void getImage(int i, int j)
    {
        String s;
        Intent intent;
        intent = new Intent();
        s = "Get Picture";
        if (mediaType != 0) goto _L2; else goto _L1
_L1:
        intent.setType("image/*");
_L4:
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
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
        } else
        if (mediaType == 2)
        {
            intent.setType("*/*");
            s = "Get All";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        int k;
        int l;
        l = i / 16 - 1;
        k = i % 16 - 1;
        i = 0;
        flag = false;
        if (l != 1) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        ExifHelper exifhelper = new ExifHelper();
        i = ((flag) ? 1 : 0);
        if (encodingType == 0)
        {
            exifhelper.createInFile((new StringBuilder()).append(DirectoryManager.getTempDirectoryPath(cordova.getActivity())).append("/.Pic.jpg").toString());
            exifhelper.readExifData();
            i = exifhelper.getOrientation();
        }
_L6:
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = getScaledBitmap(FileUtils.stripFileProtocol(imageUri.toString()));
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = (Bitmap)intent.getExtras().get("data");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        try
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to create bitmap!");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_192;
        obj;
        ((IOException) (obj)).printStackTrace();
        i = ((flag) ? 1 : 0);
        if (true) goto _L6; else goto _L5
        failPicture("Error capturing image.");
        return;
        intent = ((Intent) (obj));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        intent = ((Intent) (obj));
        if (correctOrientation)
        {
            intent = getRotatedBitmap(i, ((Bitmap) (obj)), exifhelper);
        }
        processPicture(intent);
        checkForDuplicateImage(0);
        obj = intent;
_L21:
        cleanup(1, imageUri, ((Uri) (obj1)), ((Bitmap) (obj)));
        return;
_L5:
        if (k != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (saveToPhotoAlbum) goto _L8; else goto _L7
_L7:
        intent = Uri.fromFile(new File(DirectoryManager.getTempDirectoryPath(cordova.getActivity()), (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
_L11:
        if (intent != null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        failPicture("Error capturing image - no media storage found.");
        if (targetHeight != -1 || targetWidth != -1 || mQuality != 100 || i != 0) goto _L10; else goto _L9
_L9:
        writeUncompressedImage(intent);
        callbackContext.success(intent.toString());
        obj1 = obj2;
_L13:
        callbackContext.success(intent.toString());
        obj = obj1;
        obj1 = intent;
        continue; /* Loop/switch isn't completed */
_L8:
        intent = getUriFromMediaStore();
          goto _L11
_L10:
        obj1 = getScaledBitmap(FileUtils.stripFileProtocol(imageUri.toString()));
        obj = obj1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        obj = obj1;
        if (correctOrientation)
        {
            obj = getRotatedBitmap(i, ((Bitmap) (obj1)), exifhelper);
        }
        obj1 = cordova.getActivity().getContentResolver().openOutputStream(intent);
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, mQuality, ((OutputStream) (obj1)));
        ((OutputStream) (obj1)).close();
        obj1 = obj;
        if (encodingType != 0) goto _L13; else goto _L12
_L12:
        if (!saveToPhotoAlbum)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        obj1 = FileUtils.getRealPathFromURI(intent, cordova);
_L14:
        exifhelper.createOutFile(((String) (obj1)));
        exifhelper.writeExifData();
        obj1 = obj;
          goto _L13
        obj1 = intent.getPath();
          goto _L14
_L4:
        if (j == 0)
        {
            failPicture("Camera cancelled.");
            return;
        } else
        {
            failPicture("Did not complete!");
            return;
        }
          goto _L13
_L2:
        if (l != 0 && l != 2)
        {
            break MISSING_BLOCK_LABEL_1131;
        }
        if (j != -1) goto _L16; else goto _L15
_L15:
        obj2 = intent.getData();
        if (mediaType != 0)
        {
            callbackContext.success(((Uri) (obj2)).toString());
            return;
        }
        if (targetHeight == -1 && targetWidth == -1 && mQuality == 100 && k == 1 && !correctOrientation)
        {
            callbackContext.success(((Uri) (obj2)).toString());
            return;
        }
        obj = FileUtils.getRealPathFromURI(((Uri) (obj2)), cordova);
        obj1 = FileUtils.getMimeType(((String) (obj)));
        if (obj == null || obj1 == null || !((String) (obj1)).equalsIgnoreCase("image/jpeg") && !((String) (obj1)).equalsIgnoreCase("image/png"))
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to retrieve path to picture!");
            return;
        }
        obj1 = getScaledBitmap(((String) (obj)));
        if (obj1 == null)
        {
            Log.d("CameraLauncher", "I either have a null image path or bitmap");
            failPicture("Unable to create bitmap!");
            return;
        }
        obj = obj1;
        if (correctOrientation)
        {
            intent = cordova.getActivity().getContentResolver().query(intent.getData(), new String[] {
                "orientation"
            }, null, null, null);
            if (intent != null)
            {
                intent.moveToPosition(0);
                i = intent.getInt(0);
                intent.close();
            }
            obj = obj1;
            if (i != 0)
            {
                intent = new Matrix();
                intent.setRotate(i);
                obj = Bitmap.createBitmap(((Bitmap) (obj1)), 0, 0, ((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight(), intent, true);
            }
        }
        if (k != 0) goto _L18; else goto _L17
_L17:
        processPicture(((Bitmap) (obj)));
_L19:
        if (obj != null)
        {
            ((Bitmap) (obj)).recycle();
        }
        System.gc();
        return;
_L18:
        if (k != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (targetHeight <= 0 || targetWidth <= 0)
        {
            break MISSING_BLOCK_LABEL_1097;
        }
        intent = (new StringBuilder()).append(DirectoryManager.getTempDirectoryPath(cordova.getActivity())).append("/resize.jpg").toString();
        obj1 = new ExifHelper();
        FileOutputStream fileoutputstream;
        try
        {
            if (encodingType == 0)
            {
                ((ExifHelper) (obj1)).createInFile(intent);
                ((ExifHelper) (obj1)).readExifData();
                ((ExifHelper) (obj1)).getOrientation();
            }
        }
        catch (IOException ioexception)
        {
            try
            {
                ioexception.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
                failPicture("Error retrieving image.");
                continue; /* Loop/switch isn't completed */
            }
        }
        fileoutputstream = new FileOutputStream(intent);
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, mQuality, fileoutputstream);
        fileoutputstream.close();
        if (encodingType == 0)
        {
            ((ExifHelper) (obj1)).createOutFile(FileUtils.getRealPathFromURI(((Uri) (obj2)), cordova));
            ((ExifHelper) (obj1)).writeExifData();
        }
        callbackContext.success((new StringBuilder()).append("file://").append(intent).append("?").append(System.currentTimeMillis()).toString());
        continue; /* Loop/switch isn't completed */
        callbackContext.success(((Uri) (obj2)).toString());
        if (true) goto _L19; else goto _L16
_L16:
        if (j == 0)
        {
            failPicture("Selection cancelled.");
            return;
        }
        failPicture("Selection did not complete!");
        return;
        if (true) goto _L21; else goto _L20
_L20:
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
            bitmap = new String(Base64.encodeBase64(bytearrayoutputstream.toByteArray()));
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
