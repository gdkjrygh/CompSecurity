// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.fragment;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Device;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.imageview.NonRoundWebImageView;
import com.pinterest.ui.progress.LoadingView;
import org.apache.commons.lang3.StringUtils;

public class EducationBackgroundPageFragment extends BaseFragment
{

    private Bitmap _imageBitmap;
    private String _imageUrl;
    private NonRoundWebImageView _imageView;
    private LoadingView _loadingSpinner;
    private FrameLayout _spinnerContainer;

    public EducationBackgroundPageFragment()
    {
        init("");
    }

    public EducationBackgroundPageFragment(String s)
    {
        init(s);
    }

    private void init(String s)
    {
        _layoutId = 0x7f0300bf;
        Bundle bundle = getArguments();
        if (StringUtils.isNotBlank(s) && bundle != null)
        {
            _imageUrl = bundle.getString("_imageUrl");
            return;
        }
        if (bundle == null)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("_imageUrl", s);
            setArguments(bundle1);
        }
        _imageUrl = s;
    }

    private void show()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_imageView, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(300L);
        objectanimator.addListener(new _cls2());
        objectanimator.start();
    }

    public void onDestroyView()
    {
        _imageView.setImageListener(null);
        _imageView = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = new TypedValue();
        getResources().getValue(0x7f0a0014, bundle, true);
        float f = bundle.getFloat();
        _imageView = (NonRoundWebImageView)view.findViewById(0x7f0f004b);
        _loadingSpinner = (LoadingView)view.findViewById(0x7f0f0242);
        _spinnerContainer = (FrameLayout)view.findViewById(0x7f0f0241);
        view = (android.widget.FrameLayout.LayoutParams)_loadingSpinner.getLayoutParams();
        view.gravity = 17;
        _loadingSpinner.setLayoutParams(view);
        if (_imageBitmap != null && _imageView != null)
        {
            int i = (int)(Device.getScreenWidth() * f);
            _imageView.getLayoutParams().width = i;
            _imageView.setImageBitmap(_imageBitmap);
            return;
        } else
        {
            int j = (int)(Math.min(Device.getScreenHeight(), Device.getScreenWidth()) * f);
            _imageView.getLayoutParams().width = j;
            _spinnerContainer.setMinimumHeight((int)(f * (Device.getScreenHeight() - (float)Device.getStatusBarHeight())));
            _imageView.setImageListener(new _cls1());
            _loadingSpinner.setState(0);
            ImageCache.loadImage(_imageView, _imageUrl);
            return;
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        _imageBitmap = bitmap;
        if (_imageView != null)
        {
            _imageView.setImageBitmap(_imageBitmap);
        }
    }





    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationBackgroundPageFragment this$0;

        public void onAnimationCancel(Animator animator)
        {
label0:
            {
                super.onAnimationCancel(animator);
                if (_spinnerContainer != null)
                {
                    if (!(_spinnerContainer.getBackground() instanceof BitmapDrawable))
                    {
                        break label0;
                    }
                    animator = ((BitmapDrawable)_spinnerContainer.getBackground()).getBitmap();
                    _spinnerContainer.setBackgroundDrawable(null);
                    if (animator != null)
                    {
                        animator.recycle();
                    }
                }
                return;
            }
            _spinnerContainer.setBackgroundDrawable(null);
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls2()
        {
            this$0 = EducationBackgroundPageFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
    {

        final EducationBackgroundPageFragment this$0;

        public void onBitmapFailed(Drawable drawable)
        {
            super.onBitmapFailed(drawable);
            if (_imageView != null)
            {
                _loadingSpinner.setState(2);
            }
        }

        public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            super.onBitmapLoaded(bitmap, loadedfrom);
            if (_imageView != null)
            {
                show();
                _loadingSpinner.setState(2);
            }
        }

        public void onBitmapSet()
        {
            super.onBitmapSet();
            if (_imageView != null)
            {
                show();
                _loadingSpinner.setState(2);
            }
        }

        public void onPrepareLoad(Drawable drawable)
        {
            super.onPrepareLoad(drawable);
            if (_imageView != null)
            {
                _imageView.setAlpha(0.0F);
            }
        }

        _cls1()
        {
            this$0 = EducationBackgroundPageFragment.this;
            super();
        }
    }

}
