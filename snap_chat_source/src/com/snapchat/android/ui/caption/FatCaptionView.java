// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Fy;
import Jo;
import MB;
import MT;
import Ms;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui.caption:
//            SnapCaptionView, FatCaptionParcelableState, FatCaptionEditText, CaptionTypeEnums, 
//            CaptionEditText

public class FatCaptionView extends SnapCaptionView
{

    private double e;

    public FatCaptionView(Context context)
    {
        super(context);
        e = r();
    }

    private double r()
    {
        switch (Jo.e(getContext()))
        {
        case 0: // '\0'
        default:
            return 0.0D;

        case 1: // '\001'
            return 1.5707963267948966D;

        case 2: // '\002'
            return 3.1415926535897931D;

        case 3: // '\003'
            return -1.5707963267948966D;
        }
    }

    public final Bundle a()
    {
        Bundle bundle = super.a();
        bundle.putFloat("captionPreviousXPercentageOnScreen", (float)p() / (float)c);
        bundle.putParcelable("captionPositionState", new FatCaptionParcelableState((FatCaptionEditText)a));
        bundle.putDouble("captionLastOrientationAngle", e);
        bundle.putBoolean("captionInFreeMode", ((FatCaptionEditText)a).p);
        bundle.putBoolean("captionScaleEdited", ((FatCaptionEditText)a).z);
        return bundle;
    }

    protected FatCaptionEditText a(Context context)
    {
        return new FatCaptionEditText(context, k());
    }

    public final void a(Bundle bundle, boolean flag)
    {
        if (bundle != null && bundle.containsKey("captionMaxLength"))
        {
            ((FatCaptionEditText)a).a(bundle.getInt("captionMaxLength"));
        }
        super.a(bundle, flag);
        d();
    }

    protected volatile void a(Bundle bundle, boolean flag, CaptionEditText captionedittext)
    {
        a(bundle, flag, (FatCaptionEditText)captionedittext);
    }

    protected void a(Bundle bundle, boolean flag, FatCaptionEditText fatcaptionedittext)
    {
        if (!flag)
        {
            double d1 = r();
            fatcaptionedittext.p = bundle.getBoolean("captionInFreeMode", false);
            fatcaptionedittext.z = bundle.getBoolean("captionScaleEdited", false);
            FatCaptionParcelableState fatcaptionparcelablestate = (FatCaptionParcelableState)bundle.getParcelable("captionPositionState");
            fatcaptionedittext.y = fatcaptionparcelablestate.f;
            fatcaptionedittext.x = fatcaptionparcelablestate.g;
            if (!fatcaptionedittext.p)
            {
                super.a(bundle, false, fatcaptionedittext);
                fatcaptionedittext.a(bundle.getFloat("captionPreviousXPercentageOnScreen") * (float)c);
                return;
            }
            double d2;
            float f;
            float f1;
            float f2;
            float f3;
            int i;
            int j;
            if (fatcaptionparcelablestate != null)
            {
                f = fatcaptionparcelablestate.a;
            } else
            {
                f = 0.0F;
            }
            if (fatcaptionparcelablestate != null)
            {
                f1 = fatcaptionparcelablestate.b;
            } else
            {
                f1 = 1.0F;
            }
            d2 = bundle.getDouble("captionLastOrientationAngle") - d1;
            e = d1;
            f2 = fatcaptionparcelablestate.c[0];
            f3 = fatcaptionparcelablestate.c[1];
            i = fatcaptionparcelablestate.d;
            j = fatcaptionparcelablestate.e;
            bundle = Jo.a(d2, f2, f3, i, j, c, b);
            fatcaptionedittext.a(bundle[0], bundle[1]);
            fatcaptionedittext.v = (float)Math.toDegrees(d2) + f;
            fatcaptionedittext.w = f1;
            fatcaptionedittext.setRotation(fatcaptionedittext.v);
            fatcaptionedittext.setScaleX(fatcaptionedittext.w);
            fatcaptionedittext.setScaleY(fatcaptionedittext.w);
            fatcaptionedittext.setMaxWidth(i);
            fatcaptionedittext.setMaxHeight(j);
            bundle = getContext().getResources().getDisplayMetrics();
            fatcaptionedittext.setTextSize(1, (float)fatcaptionparcelablestate.f / ((DisplayMetrics) (bundle)).density);
            return;
        } else
        {
            super.a(bundle, flag, fatcaptionedittext);
            fatcaptionedittext.m();
            return;
        }
    }

    protected CaptionEditText b(Context context)
    {
        return a(context);
    }

    protected final void b()
    {
        if (!((FatCaptionEditText)a).p)
        {
            ((FatCaptionEditText)a).a((p() * c) / b, (o() * b) / c);
        }
    }

    protected final XmlResourceParser c()
    {
        return getResources().getLayout(0x7f04001d);
    }

    protected final void d()
    {
        ((FatCaptionEditText)a).t = (float)Math.min(c, b) * 0.053125F * 3F;
        ((FatCaptionEditText)a).u = ((FatCaptionEditText)a).t / 4D;
        if (!((FatCaptionEditText)a).p)
        {
            ((FatCaptionEditText)a).n();
        }
        ((FatCaptionEditText)a).setVerticalFadingEdgeEnabled(true);
        ((FatCaptionEditText)a).setFadingEdgeLength(45);
        ((FatCaptionEditText)a).h();
        if (!((FatCaptionEditText)a).p)
        {
            ((FatCaptionEditText)a).l();
        }
    }

    public CaptionTypeEnums e()
    {
        return CaptionTypeEnums.FAT_CAPTION_TYPE;
    }

    public void onCaptionColorPickedEvent(Fy fy)
    {
        ((FatCaptionEditText)a).setColor(((Ms) (fy)).mColor);
    }

    public void onEditCaptionEvent(MB mb)
    {
        if (mb.mIsEditing)
        {
            setBackgroundColor(getResources().getColor(0x7f0c0019));
            return;
        } else
        {
            setBackgroundColor(0);
            return;
        }
    }

    public void onGlobalLayoutEvent(MT mt)
    {
        if (!((FatCaptionEditText)a).p)
        {
            ((FatCaptionEditText)a).l();
        }
        if (!((FatCaptionEditText)a).g && ((FatCaptionEditText)a).n)
        {
            ((FatCaptionEditText)a).c();
        }
        mt = getRootView();
        Rect rect = new Rect();
        mt.getWindowVisibleDisplayFrame(rect);
        int i = b - (rect.bottom - rect.top);
        if (i > 100)
        {
            i = b - i;
            if (((FatCaptionEditText)a).i() != i)
            {
                ((FatCaptionEditText)a).b(i);
                if (((FatCaptionEditText)a).n)
                {
                    ((FatCaptionEditText)a).a(false);
                }
            }
        }
    }
}
