// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import MT;
import Mf;
import Mo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.View;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.ui.caption:
//            SnapCaptionView, VanillaCaptionEditText, CaptionTypeEnums, CaptionEditText

public class VanillaCaptionView extends SnapCaptionView
{

    public VanillaCaptionView(Context context)
    {
        super(context);
    }

    public final void a(Bundle bundle, boolean flag)
    {
        if (bundle != null && bundle.containsKey("captionMaxLength"))
        {
            ((VanillaCaptionEditText)a).m = bundle.getInt("captionMaxLength");
        }
        super.a(bundle, flag);
        if (!((VanillaCaptionEditText)a).n)
        {
            ((VanillaCaptionEditText)a).setGravity(17);
        }
        if (((VanillaCaptionEditText)a).l())
        {
            Mf.a().a(new Mo(6));
        }
    }

    protected final CaptionEditText b(Context context)
    {
        context = new VanillaCaptionEditText(context, k());
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        return context;
    }

    protected final void b()
    {
        super.b();
        ((VanillaCaptionEditText)a).u = c;
        ((VanillaCaptionEditText)a).t = b;
        ((VanillaCaptionEditText)a).setFilters(new InputFilter[0]);
    }

    protected final XmlResourceParser c()
    {
        return getResources().getLayout(0x7f04001e);
    }

    protected final void d()
    {
        ((VanillaCaptionEditText)a).u = c;
        ((VanillaCaptionEditText)a).t = b;
        ((VanillaCaptionEditText)a).c(d);
        DisplayMetrics displaymetrics = ((VanillaCaptionEditText)a).getContext().getResources().getDisplayMetrics();
        ((VanillaCaptionEditText)a).setTextSize(((float)Math.min(c, b) * 0.053125F) / displaymetrics.density);
    }

    public final CaptionTypeEnums e()
    {
        return CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE;
    }

    public void onGlobalLayoutEvent(MT mt)
    {
        if (!((VanillaCaptionEditText)a).g && ((VanillaCaptionEditText)a).n && ((VanillaCaptionEditText)a).getTop() != ((VanillaCaptionEditText)a).d())
        {
            ((VanillaCaptionEditText)a).setY(((VanillaCaptionEditText)a).d());
        }
        mt = getRootView();
        Rect rect = new Rect();
        mt.getWindowVisibleDisplayFrame(rect);
        int i = b - (rect.bottom - rect.top);
        if (i > 100)
        {
            i = b - i;
            if (((VanillaCaptionEditText)a).i() != i)
            {
                ((VanillaCaptionEditText)a).b(i);
                if (((VanillaCaptionEditText)a).n)
                {
                    ((VanillaCaptionEditText)a).a(false);
                }
            }
        }
    }

    public void setText(String s)
    {
        super.setText(s);
        if (!i())
        {
            ((VanillaCaptionEditText)a).setGravity(17);
            return;
        } else
        {
            ((VanillaCaptionEditText)a).setGravity(3);
            return;
        }
    }
}
