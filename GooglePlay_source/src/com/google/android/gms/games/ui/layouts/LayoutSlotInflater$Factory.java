// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSlotInflater, LayoutSpec

private final class <init>
    implements LayoutInflaterFactory
{

    final LayoutSlotInflater this$0;

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        if (attributeset.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "layoutSlotContainer", false))
        {
            view = new LayoutSpec("WHOLE_CARD", -1, 0, null, 0, null, -1, 0);
        } else
        {
            view = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlot");
            int i = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSubSlot", -1);
            int j = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotAnimationType", 0);
            s = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlotSharedView");
            int k = attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "layoutSlotRoot", 0);
            context = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlotType");
            int l = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotIndex", -1);
            int i1 = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotImageResizeMode", 0);
            if (!TextUtils.isEmpty(view) || i != -1)
            {
                view = new LayoutSpec(view, i, j, s, k, context, l, i1);
            } else
            {
                view = null;
            }
        }
        LayoutSlotInflater.access$100(LayoutSlotInflater.this).addLast(view);
        return null;
    }

    private ()
    {
        this$0 = LayoutSlotInflater.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
