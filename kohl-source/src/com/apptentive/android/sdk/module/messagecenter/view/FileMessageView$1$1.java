// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.StoredFile;
import com.apptentive.android.sdk.util.ImageUtil;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            FileMessageView

class val.imageBitmap
    implements Runnable
{

    final l.imageView this$1;
    final Bitmap val$imageBitmap;

    public void run()
    {
        imageView.setImageBitmap(val$imageBitmap);
        imageView.setPadding(0, 0, 0, 0);
        imageView.setVisibility(0);
    }

    l.imageView()
    {
        this$1 = final_imageview;
        val$imageBitmap = Bitmap.this;
        super();
    }

    // Unreferenced inner class com/apptentive/android/sdk/module/messagecenter/view/FileMessageView$1

/* anonymous class */
    class FileMessageView._cls1 extends Thread
    {

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
            imageView.post(bitmap. new FileMessageView._cls1._cls1());
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
                this$0 = final_filemessageview;
                storedFile = storedfile;
                imageView = ImageView.this;
                super();
            }
    }

}
