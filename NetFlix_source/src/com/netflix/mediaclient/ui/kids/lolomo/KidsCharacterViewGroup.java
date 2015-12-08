// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsCharacterView

public class KidsCharacterViewGroup extends VideoViewGroup
{

    private final boolean shouldIncludePeekDimen;

    public KidsCharacterViewGroup(Context context, boolean flag)
    {
        super(context, flag);
        shouldIncludePeekDimen = flag;
    }

    protected volatile View createChildView(Context context)
    {
        return createChildView(context);
    }

    protected KidsCharacterView createChildView(Context context)
    {
        return new KidsCharacterView(context, shouldIncludePeekDimen);
    }

    protected boolean shouldApplyPaddingToChildren()
    {
        return shouldIncludePeekDimen;
    }

    protected volatile void updateViewIds(View view, int i, int j, int k)
    {
        updateViewIds((KidsCharacterView)view, i, j, k);
    }

    protected void updateViewIds(KidsCharacterView kidscharacterview, int i, int j, int k)
    {
    }
}
