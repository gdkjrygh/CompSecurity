// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;
import dmz;
import gcz;
import gft;
import gve;
import gwb;

public class MomentImageSwitcher extends ImageSwitcher
{

    public MomentImageSwitcher(Context context)
    {
        super(context);
        a(context);
    }

    public MomentImageSwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
        setFactory(new android.widget.ViewSwitcher.ViewFactory(context) {

            private Context a;

            public final View makeView()
            {
                ImageView imageview = new ImageView(a);
                imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                gcz gcz1 = (gcz)dmz.a(gcz);
                imageview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(gcz1.b(), gcz1.c()));
                return imageview;
            }

            
            {
                a = context;
                super();
            }
        });
        setInAnimation(context, 0x10a0000);
        setOutAnimation(context, 0x10a0001);
    }

    public void setImageResource(int i)
    {
        ImageView imageview = (ImageView)getNextView();
        Picasso picasso = ((gft)dmz.a(gft)).a();
        picasso.a(imageview);
        picasso.a(i).a(imageview, new gve() {

            private MomentImageSwitcher a;

            public final void a()
            {
                a.showNext();
            }

            public final void b()
            {
                Logger.c("Exception when loading the image", new Object[0]);
            }

            
            {
                a = MomentImageSwitcher.this;
                super();
            }
        });
    }
}
