// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Fy;
import MB;
import MT;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionView, FatCenterCaptionEditText, FatCaptionEditText, FatCaptionParcelableState, 
//            CaptionTypeEnums, CaptionEditText

public class FatCenterCaptionView extends FatCaptionView
{

    public FatCenterCaptionView(Context context)
    {
        super(context);
    }

    private FatCenterCaptionEditText r()
    {
        return new FatCenterCaptionEditText(getContext(), k());
    }

    protected final FatCaptionEditText a(Context context)
    {
        return r();
    }

    protected final volatile void a(Bundle bundle, boolean flag, CaptionEditText captionedittext)
    {
        a(bundle, flag, (FatCaptionEditText)captionedittext);
    }

    protected final void a(Bundle bundle, boolean flag, FatCaptionEditText fatcaptionedittext)
    {
        super.a(bundle, flag, fatcaptionedittext);
        bundle = (FatCaptionParcelableState)bundle.getParcelable("captionPositionState");
        if (flag && !i() && bundle != null)
        {
            int i = ((FatCaptionParcelableState) (bundle)).d;
            fatcaptionedittext.a((c - i) / 2);
        }
    }

    public final void a(boolean flag)
    {
        if (flag && ((FatCaptionEditText)a).p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super.a(flag);
        if (!((FatCaptionEditText)a).p)
        {
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            viewtreeobserver.addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewtreeobserver) {

                private ViewTreeObserver a;
                private FatCenterCaptionView b;

                public final boolean onPreDraw()
                {
                    int i = ((FatCaptionEditText)b.a).getWidth();
                    b.a((b.c - i) / 2);
                    if (a.isAlive())
                    {
                        a.removeOnPreDrawListener(this);
                    }
                    return false;
                }

            
            {
                b = FatCenterCaptionView.this;
                a = viewtreeobserver;
                super();
            }
            });
        }
    }

    protected final CaptionEditText b(Context context)
    {
        return r();
    }

    public final CaptionTypeEnums e()
    {
        return CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE;
    }

    public void onCaptionColorPickedEvent(Fy fy)
    {
        super.onCaptionColorPickedEvent(fy);
    }

    public void onEditCaptionEvent(MB mb)
    {
        super.onEditCaptionEvent(mb);
    }

    public void onGlobalLayoutEvent(MT mt)
    {
        super.onGlobalLayoutEvent(mt);
    }
}
