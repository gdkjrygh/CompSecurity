// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import me.lyft.android.controls.TextureVideoView;
import me.lyft.android.logging.L;
import me.lyft.android.utils.VersionUtils;

public class IntroductionVideoLayout extends RelativeLayout
{

    ImageView staticImageView;
    TextureVideoView videoView;

    public IntroductionVideoLayout(Context context)
    {
        super(context);
        init();
    }

    public IntroductionVideoLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public IntroductionVideoLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public IntroductionVideoLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        init();
    }

    private void adjustAspectRatio(int i, int j)
    {
        videoView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(getWidth(), getHeight()));
        int k = getWidth();
        int l = getHeight();
        videoView.setMinimumWidth(k);
        videoView.setMinimumHeight(l);
        i = (int)(((double)j / (double)i) * (double)k);
        j = (k - k) / 2;
        int i1 = (l - i) / 2;
        Matrix matrix = new Matrix();
        videoView.getTransform(matrix);
        matrix.setScale((float)k / (float)k, (float)i / (float)l);
        matrix.postTranslate(j, i1);
        videoView.setTransform(matrix);
    }

    private void initVideoView()
    {
        videoView.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final IntroductionVideoLayout this$0;

            public boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                L.d((new StringBuilder()).append("video view error:").append(i).append("|").append(j).toString(), new Object[0]);
                showStaticImage();
                return true;
            }

            
            {
                this$0 = IntroductionVideoLayout.this;
                super();
            }
        });
        videoView.setVideoPath((new StringBuilder()).append("android.resource://").append(getContext().getPackageName()).append("/").append(0x7f060006).toString());
        videoView.setMediaController(new MediaController(getContext()));
        videoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final IntroductionVideoLayout this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                videoView.start();
                mediaplayer.setLooping(true);
                adjustAspectRatio(mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
            }

            
            {
                this$0 = IntroductionVideoLayout.this;
                super();
            }
        });
    }

    private void showStaticImage()
    {
        staticImageView.setVisibility(0);
        videoView.setVisibility(8);
    }

    public void init()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030149, this, true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (videoView != null)
        {
            videoView.stopPlayback();
            videoView = null;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (VersionUtils.hasKitKat())
        {
            staticImageView.setVisibility(8);
            return;
        } else
        {
            showStaticImage();
            return;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (VersionUtils.hasKitKat())
        {
            initVideoView();
        }
    }


}
