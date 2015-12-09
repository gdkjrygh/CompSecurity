// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.view.View;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.common.players.SharedProfileSummaryUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            SlimProfileAppContentAdapter

private final class ew extends LayoutSlot
{

    private final ArrayList mClickableViews = new ArrayList();
    final ew this$0;

    public final List getClickableViews()
    {
        return mClickableViews;
    }

    public final void resetAnnotation()
    {
        ew.setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        SharedProfileSummaryUtils.addLevelUpCongrats(ew.getResources(), , ew, ew(1));
        ew.setVisibility(0);
    }

    public ()
    {
        this$0 = this._cls0.this;
        super();
        mClickableViews.add(ew);
    }
}
