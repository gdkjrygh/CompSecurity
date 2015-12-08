// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.FileMessage;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.StoredFile;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.util.ImageUtil;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            PersonalMessageView

public class FileMessageView extends PersonalMessageView
{

    private static final int MAX_IMAGE_DISPLAY_HEIGHT = 800;
    private static final int MAX_IMAGE_DISPLAY_WIDTH = 800;
    private static final float MAX_IMAGE_SCREEN_PROPORTION_X = 0.5F;
    private static final float MAX_IMAGE_SCREEN_PROPORTION_Y = 0.6F;

    public FileMessageView(Context context, FileMessage filemessage)
    {
        super(context, filemessage);
    }

    private Point getBitmapDimensions(StoredFile storedfile)
    {
        StoredFile storedfile1;
        StoredFile storedfile2;
        storedfile2 = null;
        storedfile1 = null;
        storedfile = context.openFileInput(storedfile.getLocalFilePath());
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        Object obj = new android.graphics.BitmapFactory.Options();
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        obj.inJustDecodeBounds = true;
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        BitmapFactory.decodeStream(storedfile, null, ((android.graphics.BitmapFactory.Options) (obj)));
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        Point point = Util.getScreenSize(context);
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        int j = (int)(0.5F * (float)point.x);
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        int k = (int)(0.6F * (float)point.x);
        int i = j;
        float f;
        if (j > 800)
        {
            i = 800;
        }
        j = k;
        if (k > 800)
        {
            j = 800;
        }
          goto _L1
_L3:
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        f = ImageUtil.calculateBitmapScaleFactor(((android.graphics.BitmapFactory.Options) (obj)).outWidth, ((android.graphics.BitmapFactory.Options) (obj)).outHeight, i, j);
        storedfile1 = storedfile;
        storedfile2 = storedfile;
        obj = new Point((int)((float)((android.graphics.BitmapFactory.Options) (obj)).outWidth * f), (int)((float)((android.graphics.BitmapFactory.Options) (obj)).outHeight * f));
        Util.ensureClosed(storedfile);
        return ((Point) (obj));
        storedfile;
        storedfile2 = storedfile1;
        Log.e("Error opening stored file.", storedfile, new Object[0]);
        Util.ensureClosed(storedfile1);
        return null;
        storedfile;
        Util.ensureClosed(storedfile2);
        throw storedfile;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void loadImage(final StoredFile storedFile, final ImageView imageView)
    {
        storedFile = new Thread() {

            final FileMessageView this$0;
            final ImageView val$imageView;
            final StoredFile val$storedFile;

            public void run()
            {
                Object obj;
                java.io.FileInputStream fileinputstream;
                Object obj2;
                obj2 = null;
                obj = null;
                fileinputstream = null;
                java.io.FileInputStream fileinputstream1 = context.openFileInput(storedFile.getLocalFilePath());
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                Point point = Util.getScreenSize(context);
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                int j = (int)(0.5F * (float)point.x);
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                int k = (int)(0.6F * (float)point.x);
                int i = j;
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;
                    final Bitmap val$imageBitmap;

                    public void run()
                    {
                        imageView.setImageBitmap(imageBitmap);
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setVisibility(0);
                    }

            
            {
                this$1 = final__pcls1;
                imageBitmap = Bitmap.this;
                super();
            }
                }

                Object obj1;
                Bitmap bitmap;
                if (j > 800)
                {
                    i = 800;
                }
                j = k;
                if (k > 800)
                {
                    j = 800;
                }
                  goto _L1
_L3:
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                bitmap = ImageUtil.createScaledBitmapFromStream(fileinputstream1, i, j, null);
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                Log.v("Loaded bitmap and re-sized to: %d x %d", new Object[] {
                    Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())
                });
                fileinputstream = fileinputstream1;
                obj2 = fileinputstream1;
                obj = fileinputstream1;
                imageView.post(bitmap. new _cls1());
                Util.ensureClosed(fileinputstream1);
                return;
                obj2;
                obj = fileinputstream;
                Log.e("Error opening stored image.", ((Throwable) (obj2)), new Object[0]);
                Util.ensureClosed(fileinputstream);
                return;
                obj1;
                obj = obj2;
                Log.e("Ran out of memory opening image.", ((Throwable) (obj1)), new Object[0]);
                Util.ensureClosed(((java.io.Closeable) (obj2)));
                return;
                obj1;
                Util.ensureClosed(((java.io.Closeable) (obj)));
                throw obj1;
_L1:
                if (true) goto _L3; else goto _L2
_L2:
            }

            
            {
                this$0 = FileMessageView.this;
                storedFile = storedfile;
                imageView = imageview;
                super();
            }
        };
        storedFile.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            final FileMessageView this$0;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                Log.w("UncaughtException in FileMessageView.", throwable, new Object[0]);
                MetricModule.sendError(context.getApplicationContext(), throwable, null, null);
            }

            
            {
                this$0 = FileMessageView.this;
                super();
            }
        });
        storedFile.setName("Apptentive-FileMessageViewLoadImage");
        storedFile.start();
    }

    protected void init(FileMessage filemessage)
    {
        super.init(filemessage);
        filemessage = LayoutInflater.from(context);
        FrameLayout framelayout = (FrameLayout)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_body);
        filemessage.inflate(com.apptentive.android.sdk.R.layout.apptentive_message_body_file, framelayout);
    }

    protected volatile void init(Message message)
    {
        init((FileMessage)message);
    }

    public void updateMessage(FileMessage filemessage)
    {
        boolean flag1 = true;
        FileMessage filemessage1 = (FileMessage)message;
        super.updateMessage(filemessage);
        StoredFile storedfile;
        if (filemessage != null)
        {
            if ((storedfile = filemessage.getStoredFile(context)) != null && storedfile.getLocalFilePath() != null)
            {
                filemessage = null;
                if (filemessage1 != null)
                {
                    filemessage = filemessage1.getStoredFile(context);
                }
                boolean flag;
                if (filemessage1 == null || filemessage.getLocalFilePath() == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (filemessage1 == null || storedfile.getLocalFilePath().equals(filemessage.getLocalFilePath()))
                {
                    flag1 = false;
                }
                if (flag || flag1)
                {
                    String s = storedfile.getMimeType();
                    if (s == null)
                    {
                        Log.e("FileMessage mime type is null.", new Object[0]);
                        return;
                    }
                    filemessage = (ImageView)findViewById(com.apptentive.android.sdk.R.id.apptentive_file_message_image);
                    if (s.contains("image"))
                    {
                        filemessage.setVisibility(4);
                        Point point = getBitmapDimensions(storedfile);
                        if (point == null)
                        {
                            Log.w("Unable to peek at image dimensions.", new Object[0]);
                            return;
                        } else
                        {
                            filemessage.setPadding(point.x, point.y, 0, 0);
                            loadImage(storedfile, filemessage);
                            return;
                        }
                    }
                }
            }
        }
    }

    public volatile void updateMessage(Message message)
    {
        updateMessage((FileMessage)message);
    }
}
