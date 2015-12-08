// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionFontListFragment

public static class  extends ArrayAdapter
{

    private final CaptionPreviewHelper captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    private final int mDefaultPos = 0;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (CheckedTextView)super.getView(i, view, viewgroup);
        viewgroup = getContext().getResources().getStringArray(0x7f0d0005)[i];
        NBCSystem.debugLog("CaptionFontListFragment", (new StringBuilder()).append("fontName: ").append(viewgroup).toString());
        android.graphics.Typeface typeface = captionPreviewHelper.getTypeFaceForName(getContext(), viewgroup);
        if (typeface != null)
        {
            view.setTypeface(typeface);
            if (i == 0)
            {
                view.setText(getContext().getString(0x7f07007b, new Object[] {
                    viewgroup
                }));
            }
        }
        return view;
    }

    public (Context context, int i, String as[])
    {
        super(context, i, as);
    }
}
