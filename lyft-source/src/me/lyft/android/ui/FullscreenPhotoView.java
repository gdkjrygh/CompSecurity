// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

public class FullscreenPhotoView extends FrameLayout
{

    ActivityController activityController;
    AppFlow appFlow;
    private Binder binder;
    ImageLoader imageLoader;
    private final Action1 onConfigurationChanged = new Action1() {

        final FullscreenPhotoView this$0;

        public void call(Configuration configuration)
        {
            byte byte1 = 8;
            if (configuration.orientation == 1)
            {
                configuration = photoTitleTextView;
                byte byte0;
                if (Strings.isNullOrEmpty(params.getTitle()))
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                configuration.setVisibility(byte0);
                configuration = photoSubtitleTextView;
                if (Strings.isNullOrEmpty(params.getSubtitle()))
                {
                    byte0 = byte1;
                } else
                {
                    byte0 = 0;
                }
                configuration.setVisibility(byte0);
            } else
            if (configuration.orientation == 2)
            {
                photoTitleTextView.setVisibility(8);
                photoSubtitleTextView.setVisibility(8);
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Configuration)obj);
        }

            
            {
                this$0 = FullscreenPhotoView.this;
                super();
            }
    };
    MainScreens.FullscreenPhotoScreen params;
    ImageView photoImageView;
    TextView photoSubtitleTextView;
    TextView photoTitleTextView;

    public FullscreenPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (MainScreens.FullscreenPhotoScreen)context.a();
    }

    public void close(View view)
    {
        appFlow.goBack();
    }

    protected void onAttachedToWindow()
    {
        byte byte1 = 8;
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(activityController.observeConfigurationChange(), onConfigurationChanged);
        Object obj = params.getPhotoUrl();
        imageLoader.load(((String) (obj))).placeholder(0x7f0201ba).into(photoImageView);
        photoTitleTextView.setText(params.getTitle());
        obj = photoTitleTextView;
        byte byte0;
        if (Strings.isNullOrEmpty(params.getTitle()))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        photoSubtitleTextView.setText(params.getSubtitle());
        obj = photoSubtitleTextView;
        if (Strings.isNullOrEmpty(params.getSubtitle()))
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        activityController.setRotationOrientation();
    }

    protected void onDetachedFromWindow()
    {
        activityController.restoreDefaultOrientation();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        setOnClickListener(new android.view.View.OnClickListener() {

            final FullscreenPhotoView this$0;

            public void onClick(View view)
            {
                close(view);
            }

            
            {
                this$0 = FullscreenPhotoView.this;
                super();
            }
        });
    }
}
