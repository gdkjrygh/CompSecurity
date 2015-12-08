// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.controls.CameraToolbar;

// Referenced classes of package me.lyft.android.ui.gallery:
//            Cropper

public final class CropView extends FrameLayout
{

    Cropper cropperView;
    View retakeButton;
    View saveButton;
    CameraToolbar toolbar;

    public CropView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            saveButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CropView this$0;

                public void onClick(View view)
                {
                    cropperView.savePicture();
                }

            
            {
                this$0 = CropView.this;
                super();
            }
            });
            retakeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CropView this$0;

                public void onClick(View view)
                {
                    cropperView.retakePicture();
                }

            
            {
                this$0 = CropView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.setTitle(getResources().getString(0x7f0700eb));
            return;
        }
    }
}
