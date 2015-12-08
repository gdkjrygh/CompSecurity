// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import java.lang.ref.WeakReference;

public class FullImageDialog extends Dialog
{

    private final WeakReference activityRef;
    private final Handler handler = new Handler();
    private final Runnable imageError = new _cls1();

    public FullImageDialog(final Activity image, Urn urn, ImageOperations imageoperations)
    {
        super(image, 0x7f0c0298);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(0x7f03006a);
        getWindow().setLayout(-1, -1);
        activityRef = new WeakReference(image);
        image = (ImageView)findViewById(0x7f0f006f);
        final ProgressBar progress = (ProgressBar)findViewById(0x7f0f0173);
        imageoperations.displayInFullDialogView(urn, ApiImageSize.T500, image, new _cls2());
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            cancel();
            return true;
        } else
        {
            return false;
        }
    }




    private class _cls1
        implements Runnable
    {

        final FullImageDialog this$0;

        public void run()
        {
            Activity activity = (Activity)activityRef.get();
            if (activity != null && !activity.isFinishing())
            {
                AndroidUtils.showToast(activity, 0x7f070147, new Object[0]);
            }
            try
            {
                dismiss();
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                return;
            }
        }

        _cls1()
        {
            this$0 = FullImageDialog.this;
            super();
        }
    }


    private class _cls2
        implements ImageListener
    {

        final FullImageDialog this$0;
        final ImageView val$image;
        final ProgressBar val$progress;

        public void onLoadingComplete(String s, View view, Bitmap bitmap)
        {
            progress.setVisibility(8);
            image.setVisibility(0);
        }

        public void onLoadingFailed(String s, View view, String s1)
        {
            handler.post(imageError);
        }

        public void onLoadingStarted(String s, View view)
        {
            progress.setVisibility(0);
        }

        _cls2()
        {
            this$0 = FullImageDialog.this;
            progress = progressbar;
            image = imageview;
            super();
        }
    }

}
