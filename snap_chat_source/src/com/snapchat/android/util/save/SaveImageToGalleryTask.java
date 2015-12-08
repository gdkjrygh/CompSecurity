// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;

import Bk;
import Ke;
import Pt;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.framework.ErrorMetric;
import dv;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.snapchat.android.util.save:
//            SaveMediaNotificationsToShow

public class SaveImageToGalleryTask extends AsyncTask
{
    public static final class SaveLocation extends Enum
    {

        private static final SaveLocation $VALUES[];
        public static final SaveLocation MEDIA_STORE;
        public static final SaveLocation SNAPCHAT_ALBUM;

        public static SaveLocation valueOf(String s)
        {
            return (SaveLocation)Enum.valueOf(com/snapchat/android/util/save/SaveImageToGalleryTask$SaveLocation, s);
        }

        public static SaveLocation[] values()
        {
            return (SaveLocation[])$VALUES.clone();
        }

        static 
        {
            MEDIA_STORE = new SaveLocation("MEDIA_STORE", 0);
            SNAPCHAT_ALBUM = new SaveLocation("SNAPCHAT_ALBUM", 1);
            $VALUES = (new SaveLocation[] {
                MEDIA_STORE, SNAPCHAT_ALBUM
            });
        }

        private SaveLocation(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String IMAGE_FILE_EXTENSION = ".jpg";
    private static final int JPEG_COMPRESSION = 95;
    private static final String TAG = "SaveImageToGalleryTask";
    private final Bitmap mBitmap;
    private final CameraEventAnalytics mCameraEventAnalytics;
    protected final Context mContext;
    private final String mFilename;
    private final Pt mNotifications;
    private final SaveMediaNotificationsToShow mNotificationsToShow;
    private final SaveLocation mSaveLocation;
    private final com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext mSaveSnapContext;
    private final Bk mStorySnap;

    private SaveImageToGalleryTask(Context context, Bk bk, Bitmap bitmap, String s, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext savesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow, SaveLocation savelocation)
    {
        if (bk == null && bitmap == null)
        {
            throw new NullPointerException("storySnap and bitmap are both null");
        } else
        {
            mContext = (Context)dv.a(context);
            mStorySnap = bk;
            mBitmap = bitmap;
            mFilename = s;
            mSaveSnapContext = savesnapcontext;
            mNotificationsToShow = (SaveMediaNotificationsToShow)dv.a(savemedianotificationstoshow);
            mCameraEventAnalytics = CameraEventAnalytics.a();
            mNotifications = Pt.a();
            mSaveLocation = (SaveLocation)dv.a(savelocation);
            return;
        }
    }

    public SaveImageToGalleryTask(Context context, Bk bk, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext savesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        this(context, bk, null, null, savesnapcontext, savemedianotificationstoshow, SaveLocation.SNAPCHAT_ALBUM);
    }

    public SaveImageToGalleryTask(Context context, Bitmap bitmap, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext savesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        this(context, null, bitmap, null, savesnapcontext, savemedianotificationstoshow, SaveLocation.SNAPCHAT_ALBUM);
    }

    public SaveImageToGalleryTask(Context context, Bitmap bitmap, SaveLocation savelocation)
    {
        this(context, null, bitmap, null, null, SaveMediaNotificationsToShow.NONE, savelocation);
    }

    public SaveImageToGalleryTask(Context context, Bitmap bitmap, String s, SaveLocation savelocation)
    {
        this(context, null, bitmap, s, null, SaveMediaNotificationsToShow.NONE, savelocation);
    }

    private String a(Bitmap bitmap, String s)
    {
        s = new File(Ke.b(), s);
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(s);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, fileoutputstream);
            fileoutputstream.flush();
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            (new ErrorMetric("failed to save image")).a(bitmap).e();
            return null;
        }
        if (mContext == null)
        {
            return null;
        } else
        {
            Ke.a(mContext, s);
            return s.getAbsolutePath();
        }
    }

    private String c(String s)
    {
        String s1 = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        Object obj;
        obj = Uri.parse(s);
        s = s1;
        obj = mContext.getContentResolver().query(((Uri) (obj)), new String[] {
            "_data"
        }, null, null, null);
        s = ((String) (obj));
        int i = ((Cursor) (obj)).getColumnIndexOrThrow("_data");
        s = ((String) (obj));
        ((Cursor) (obj)).moveToFirst();
        s = ((String) (obj));
        s1 = ((Cursor) (obj)).getString(i);
        s = s1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj)).close();
        return s1;
        Exception exception;
        exception;
        if (s != null)
        {
            s.close();
        }
        throw exception;
    }

    public void a()
    {
        if (mNotificationsToShow != SaveMediaNotificationsToShow.NONE)
        {
            mNotifications.d();
        }
        if (mSaveSnapContext != null)
        {
            CameraEventAnalytics.b(false, mSaveSnapContext);
        }
    }

    public void a(String s)
    {
        if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
        {
            mNotifications.c();
        }
        if (mSaveSnapContext != null)
        {
            CameraEventAnalytics.a(false, mSaveSnapContext);
        }
    }

    public void b(String s)
    {
        if (mBitmap != null)
        {
            mBitmap.recycle();
        }
        if (!TextUtils.isEmpty(s))
        {
            a(s);
            return;
        } else
        {
            a();
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        Bitmap bitmap;
        if (mFilename == null)
        {
            aobj = (new StringBuilder()).append(Ke.c()).append(".jpg").toString();
        } else
        {
            aobj = mFilename;
        }
        if (mStorySnap != null)
        {
            bitmap = mStorySnap.a(mContext);
        } else
        {
            bitmap = mBitmap;
        }
        if (bitmap == null)
        {
            Timber.e("SaveImageToGalleryTask", "Failed to get image bitmap from story snap", new Object[0]);
            return null;
        }
        if (mSaveLocation == SaveLocation.SNAPCHAT_ALBUM)
        {
            return a(bitmap, ((String) (aobj)));
        } else
        {
            return c(android.provider.MediaStore.Images.Media.insertImage(mContext.getContentResolver(), bitmap, ((String) (aobj)), null));
        }
    }

    public void onPostExecute(Object obj)
    {
        b((String)obj);
    }

    public void onPreExecute()
    {
        if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
        {
            mNotifications.b();
        }
    }
}
