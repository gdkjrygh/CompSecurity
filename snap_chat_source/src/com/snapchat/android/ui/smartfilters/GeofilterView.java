// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.smartfilters;

import AJ;
import Ak;
import Am;
import An;
import GM;
import Jo;
import PG;
import PH;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.ui.SelfScalingImageView;
import com.snapchat.android.ui.SponsoredSlugView;
import com.snapchat.android.util.SnapMediaUtils;

public class GeofilterView extends RelativeLayout
    implements android.view.View.OnTouchListener
{

    public final SelfScalingImageView a = (SelfScalingImageView)findViewById(0x7f0d02f9);
    public final SponsoredSlugView b = (SponsoredSlugView)findViewById(0x7f0d02fa);
    public final GM c;
    private final AJ d;
    private final PH e;
    private float f;
    private int g;
    private int h;

    public GeofilterView(Context context, AJ aj)
    {
        super(context);
        f = 1.0F;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f040087, this, true);
        d = aj;
        e = new PH(d, this);
        c = new GM(aj, this);
        c.a();
        setOnTouchListener(this);
        a();
    }

    public final void a()
    {
        PG.a();
        Object obj;
        Object obj1;
        SelfScalingImageView selfscalingimageview;
        int i;
        if (d.mIsDynamic && d.b())
        {
            obj = d.a();
        } else
        {
            obj = d.mBitmap;
        }
        obj1 = e;
        selfscalingimageview = a;
        i = d.mLayoutGravity;
        if (obj == null)
        {
            selfscalingimageview.setImageBitmap(null);
        } else
        {
            selfscalingimageview.setImageBitmap(SnapMediaUtils.c(((android.graphics.Bitmap) (obj)), ((PH) (obj1)).mGeofilterView.getContext()));
            int k = Jo.a(i, Jo.j(((PH) (obj1)).mGeofilterView.getContext()));
            obj = (android.widget.RelativeLayout.LayoutParams)selfscalingimageview.getLayoutParams();
            int l = Jo.g(k);
            int i1 = Jo.h(k);
            for (int j = 9; j <= 15; j++)
            {
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(j, 0);
            }

            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(l);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(i1);
            selfscalingimageview.setScaleType(((PH) (obj1)).mGeofilter.mLayoutScaleType);
            selfscalingimageview.setGravity(k);
            selfscalingimageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (d.mIsSponsored)
        {
            obj1 = e;
            obj = b;
            ((SponsoredSlugView) (obj)).setSponsoredSlugWithDefaultText();
            obj1 = ((PH) (obj1)).mGeofilter.mSponsoredSlugPosAndText;
            if (obj1 != null)
            {
                ((SponsoredSlugView) (obj)).setPosAndText(((SG) (obj1)));
            }
            ((SponsoredSlugView) (obj)).a(true);
        }
    }

    public final void b()
    {
        if (b != null)
        {
            b.b();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = k - i;
        j = l - j;
        if (i != g || j != h)
        {
            g = i;
            h = j;
            a();
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = true;
        if (!c.a(motionevent))
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            view = c;
            motionevent = ((GM) (view)).b;
            AJ aj = ((GM) (view)).c;
            ((Am) (motionevent)).a.a(aj);
            ((Am) (motionevent)).b.a(aj);
            if (!((GM) (view)).h)
            {
                view.h = true;
                ((GM) (view)).f.setText(((GM) (view)).d.getText(0x7f080120));
                ((GM) (view)).g.setVisibility(8);
                return true;
            }
        }
        return flag;
    }

    public void setVisibilityOfPreviewOnlyContent(int i)
    {
        float f1 = 0.0F;
        Object obj;
        if (b != null)
        {
            if (i == 0)
            {
                b.setAlpha(f);
            } else
            {
                f = b.getAlpha();
                b.setAlpha(0.0F);
            }
        }
        obj = c;
        if (((GM) (obj)).b())
        {
            obj = ((GM) (obj)).e;
            if (i == 0)
            {
                f1 = 1.0F;
            }
            ((LinearLayout) (obj)).setAlpha(f1);
        }
    }
}
