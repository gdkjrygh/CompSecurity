// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ContentUriUtils;

// Referenced classes of package org.chromium.ui.base:
//            WindowAndroid

class SelectFileDialog
    implements WindowAndroid.IntentCallback
{
    private class GetDisplayNameTask extends AsyncTask
    {

        final ContentResolver mContentResolver;
        String mFilePaths[];
        final boolean mIsMultiple;
        final SelectFileDialog this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Uri[])aobj);
        }

        protected transient String[] doInBackground(Uri auri[])
        {
            String as1[];
            int i;
            mFilePaths = new String[auri.length];
            as1 = new String[auri.length];
            i = 0;
_L2:
            String as[] = as1;
            if (i >= auri.length)
            {
                break; /* Loop/switch isn't completed */
            }
            mFilePaths[i] = auri[i].toString();
            as1[i] = ContentUriUtils.getDisplayName(auri[i], mContentResolver, "_display_name");
            i++;
            if (true) goto _L2; else goto _L1
            auri;
            Log.w("SelectFileDialog", "Unable to extract results from the content provider");
            as = null;
_L1:
            return as;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String[])obj);
        }

        protected void onPostExecute(String as[])
        {
            if (as == null)
            {
                onFileNotSelected();
                return;
            }
            if (mIsMultiple)
            {
                nativeOnMultipleFilesSelected(mNativeSelectFileDialog, mFilePaths, as);
                return;
            } else
            {
                nativeOnFileSelected(mNativeSelectFileDialog, mFilePaths[0], as[0]);
                return;
            }
        }

        public GetDisplayNameTask(ContentResolver contentresolver, boolean flag)
        {
            this$0 = SelectFileDialog.this;
            super();
            mContentResolver = contentresolver;
            mIsMultiple = flag;
        }
    }


    private static final String ALL_AUDIO_TYPES = "audio/*";
    private static final String ALL_IMAGE_TYPES = "image/*";
    private static final String ALL_VIDEO_TYPES = "video/*";
    private static final String ANY_TYPES = "*/*";
    private static final String AUDIO_TYPE = "audio/";
    private static final String CAPTURE_IMAGE_DIRECTORY = "browser-photos";
    private static final String IMAGE_FILE_PATH = "images";
    private static final String IMAGE_TYPE = "image/";
    private static final String TAG = "SelectFileDialog";
    private static final String VIDEO_TYPE = "video/";
    private Uri mCameraOutputUri;
    private boolean mCapture;
    private List mFileTypes;
    private final long mNativeSelectFileDialog;

    private SelectFileDialog(long l)
    {
        mNativeSelectFileDialog = l;
    }

    private boolean acceptSpecificType(String s)
    {
        for (Iterator iterator = mFileTypes.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).startsWith(s))
            {
                return true;
            }
        }

        return false;
    }

    private boolean acceptsSpecificType(String s)
    {
        return mFileTypes.size() == 1 && TextUtils.equals((CharSequence)mFileTypes.get(0), s);
    }

    private boolean captureCamcorder()
    {
        return mCapture && acceptsSpecificType("video/*");
    }

    private boolean captureCamera()
    {
        return mCapture && acceptsSpecificType("image/*");
    }

    private boolean captureMicrophone()
    {
        return mCapture && acceptsSpecificType("audio/*");
    }

    private static SelectFileDialog create(long l)
    {
        return new SelectFileDialog(l);
    }

    private File getFileForImageCapture(Context context)
        throws IOException
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            File file = new File(context.getFilesDir(), "images");
            context = file;
            if (!file.exists())
            {
                context = file;
                if (!file.mkdir())
                {
                    throw new IOException("Folder cannot be created.");
                }
            }
        } else
        {
            File file1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            File file2 = new File((new StringBuilder()).append(file1.getAbsolutePath()).append(File.separator).append("browser-photos").toString());
            context = file2;
            if (!file2.exists())
            {
                context = file2;
                if (!file2.mkdirs())
                {
                    context = file1;
                }
            }
        }
        return File.createTempFile(String.valueOf(System.currentTimeMillis()), ".jpg", context);
    }

    private native void nativeOnFileNotSelected(long l);

    private native void nativeOnFileSelected(long l, String s, String s1);

    private native void nativeOnMultipleFilesSelected(long l, String as[], String as1[]);

    private boolean noSpecificType()
    {
        return mFileTypes.size() != 1 || mFileTypes.contains("*/*");
    }

    private void onFileNotSelected()
    {
        nativeOnFileNotSelected(mNativeSelectFileDialog);
    }

    private void selectFile(String as[], boolean flag, boolean flag1, WindowAndroid windowandroid)
    {
        Intent intent;
        Object obj;
        mFileTypes = new ArrayList(Arrays.asList(as));
        mCapture = flag;
        as = new Intent("android.intent.action.CHOOSER");
        intent = new Intent("android.media.action.IMAGE_CAPTURE");
        obj = windowandroid.getApplicationContext();
        intent.setFlags(3);
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L2; else goto _L1
_L1:
        mCameraOutputUri = ContentUriUtils.getContentUriFromFile(((Context) (obj)), getFileForImageCapture(((Context) (obj))));
_L13:
        if (mCameraOutputUri != null) goto _L4; else goto _L3
_L3:
        onFileNotSelected();
_L9:
        return;
_L2:
        try
        {
            mCameraOutputUri = Uri.fromFile(getFileForImageCapture(((Context) (obj))));
        }
        catch (IOException ioexception)
        {
            Log.e("SelectFileDialog", "Cannot retrieve content uri from file", ioexception);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Intent intent1;
        intent.putExtra("output", mCameraOutputUri);
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            intent.setClipData(ClipData.newUri(((Context) (obj)).getContentResolver(), "images", mCameraOutputUri));
        }
        obj = new Intent("android.media.action.VIDEO_CAPTURE");
        intent1 = new Intent("android.provider.MediaStore.RECORD_SOUND");
        if (!captureCamera()) goto _L6; else goto _L5
_L5:
        if (windowandroid.showIntent(intent, this, org.chromium.ui.R.string.low_memory_error)) goto _L8; else goto _L7
_L7:
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        if (android.os.Build.VERSION.SDK_INT >= 18 && flag1)
        {
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        ArrayList arraylist = new ArrayList();
        if (!noSpecificType())
        {
            if (shouldShowImageTypes())
            {
                arraylist.add(intent);
                intent2.setType("image/*");
            } else
            if (shouldShowVideoTypes())
            {
                arraylist.add(obj);
                intent2.setType("video/*");
            } else
            if (shouldShowAudioTypes())
            {
                arraylist.add(intent1);
                intent2.setType("audio/*");
            }
        }
        if (arraylist.isEmpty())
        {
            intent2.setType("*/*");
            arraylist.add(intent);
            arraylist.add(obj);
            arraylist.add(intent1);
        }
        as.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])arraylist.toArray(new Intent[0]));
        as.putExtra("android.intent.extra.INTENT", intent2);
        if (!windowandroid.showIntent(as, this, org.chromium.ui.R.string.low_memory_error))
        {
            onFileNotSelected();
            return;
        }
_L8:
        if (true) goto _L9; else goto _L6
_L6:
        if (!captureCamcorder())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!windowandroid.showIntent(((Intent) (obj)), this, org.chromium.ui.R.string.low_memory_error)) goto _L7; else goto _L10
_L10:
        return;
        if (!captureMicrophone() || !windowandroid.showIntent(intent1, this, org.chromium.ui.R.string.low_memory_error)) goto _L7; else goto _L11
_L11:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private boolean shouldShowAudioTypes()
    {
        return shouldShowTypes("audio/*", "audio/");
    }

    private boolean shouldShowImageTypes()
    {
        return shouldShowTypes("image/*", "image/");
    }

    private boolean shouldShowTypes(String s, String s1)
    {
        if (noSpecificType() || mFileTypes.contains(s))
        {
            return true;
        } else
        {
            return acceptSpecificType(s1);
        }
    }

    private boolean shouldShowVideoTypes()
    {
        return shouldShowTypes("video/*", "video/");
    }

    public void onIntentCompleted(WindowAndroid windowandroid, int i, ContentResolver contentresolver, Intent intent)
    {
        if (i != -1)
        {
            onFileNotSelected();
            return;
        }
        if (intent == null)
        {
            if ("file".equals(mCameraOutputUri.getScheme()))
            {
                contentresolver = mCameraOutputUri.getPath();
            } else
            {
                contentresolver = mCameraOutputUri.toString();
            }
            nativeOnFileSelected(mNativeSelectFileDialog, contentresolver, mCameraOutputUri.getLastPathSegment());
            windowandroid.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", mCameraOutputUri));
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 18 && intent.getData() == null && intent.getClipData() != null)
        {
            windowandroid = intent.getClipData();
            int j = windowandroid.getItemCount();
            if (j == 0)
            {
                onFileNotSelected();
                return;
            }
            intent = new Uri[j];
            for (i = 0; i < j; i++)
            {
                intent[i] = windowandroid.getItemAt(i).getUri();
            }

            (new GetDisplayNameTask(contentresolver, true)).execute(intent);
            return;
        }
        if ("file".equals(intent.getData().getScheme()))
        {
            nativeOnFileSelected(mNativeSelectFileDialog, intent.getData().getSchemeSpecificPart(), "");
            return;
        }
        if ("content".equals(intent.getScheme()))
        {
            (new GetDisplayNameTask(contentresolver, false)).execute(new Uri[] {
                intent.getData()
            });
            return;
        } else
        {
            onFileNotSelected();
            windowandroid.showError(org.chromium.ui.R.string.opening_file_error);
            return;
        }
    }




}
