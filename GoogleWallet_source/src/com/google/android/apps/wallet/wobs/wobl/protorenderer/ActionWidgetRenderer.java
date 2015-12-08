// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, TextRenderingHelper, ProtoWoblRenderUtils, ProtoWoblRenderer

public class ActionWidgetRenderer extends WidgetRenderer
{

    private static final String TAG = com/google/android/apps/wallet/wobs/wobl/protorenderer/ActionWidgetRenderer.getSimpleName();
    private final TextRenderingHelper textRenderingHelper;
    private final com.google.wallet.proto.NanoCompiledWobl.ActionWidget widget;

    protected ActionWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.ActionWidget actionwidget)
    {
        super(protowoblrenderer);
        widget = actionwidget;
        textRenderingHelper = new TextRenderingHelper(android.os.Build.VERSION.SDK_INT, getContext(), actionwidget.textBoxAttributes, actionwidget.textStyleAttributes, actionwidget.inlineTextContent, getRendererClient());
    }

    private TextView createView()
    {
        return new TextView(getContext());
    }

    private int getIconDrawable()
    {
        if (widget.icon == null || widget.icon.intValue() == 7)
        {
            return -1;
        }
        switch (widget.icon.intValue())
        {
        case 2: // '\002'
        default:
            String s = TAG;
            String s1 = String.valueOf(widget.icon);
            WLog.w(s, (new StringBuilder(String.valueOf(s1).length() + 18)).append("Unknown icon type ").append(s1).toString());
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_globe;

        case 4: // '\004'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_checkmark;

        case 0: // '\0'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_globe;

        case 5: // '\005'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_mail;

        case 1: // '\001'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_map;

        case 3: // '\003'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_phone;

        case 6: // '\006'
            return com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_receipt;
        }
    }

    protected final volatile View createView()
    {
        return createView();
    }

    protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
    {
        return widget.widgetAttributes;
    }

    protected final void setViewGravity(Integer integer, Integer integer1)
    {
        ((TextView)getView()).setGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        TextView textview;
        int i;
        int j;
        i = 0;
        super.unsafeApplyWobl();
        textview = (TextView)getView();
        textRenderingHelper.applyWoblToView(textview);
        j = getIconDrawable();
        if (j > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        textview.setCompoundDrawablesWithIntrinsicBounds(j, 0, 0, 0);
        textview.setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.image_spacing_regular));
        if (widget.iconAlpha != null)
        {
            int k = Math.round(widget.iconAlpha.floatValue() * 255F);
            Drawable adrawable[] = textview.getCompoundDrawables();
            int l = adrawable.length;
            while (i < l) 
            {
                Drawable drawable = adrawable[i];
                if (drawable != null)
                {
                    drawable.setAlpha(k);
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
