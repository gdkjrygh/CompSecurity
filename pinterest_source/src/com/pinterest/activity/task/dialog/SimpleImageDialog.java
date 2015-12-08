// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class SimpleImageDialog extends BaseDialog
{

    Bitmap _bitmap;
    ImageView _imageView;

    public SimpleImageDialog()
    {
    }

    public static SimpleImageDialog newInstance()
    {
        return new SimpleImageDialog();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setContent(LayoutInflater.from(getActivity()).inflate(0x7f030094, null));
        ButterKnife.a(this, container);
        _imageView.setMaxWidth((int)(Device.getScreenWidth() * 0.8F));
        _imageView.setMaxHeight((int)(Device.getScreenHeight() * 0.8F));
        _imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        _imageView.setOnClickListener(new _cls1());
        _imageView.setImageBitmap(_bitmap);
    }

    public void setImage(Bitmap bitmap)
    {
        _bitmap = bitmap;
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SimpleImageDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = SimpleImageDialog.this;
            super();
        }
    }

}
