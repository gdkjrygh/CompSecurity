// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.common.players.SharedProfileSummaryUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            SlimProfileAppContentAdapter

private final class mClickableViews extends LayoutSlot
{

    private final ArrayList mClickableViews = new ArrayList();
    final this._cls0 this$0;

    public final List getClickableViews()
    {
        return mClickableViews;
    }

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        this._cls0.this.mClickableViews.setVisibility(8);
        _fld0.setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        appcontentannotation = appcontentannotation.getModifiers();
        int i = com.google.android.gms.games.ui.destination.main.this._mth0(appcontentannotation.getString("currentSteps"), 0);
        int j = com.google.android.gms.games.ui.destination.main.this._mth0(appcontentannotation.getString("totalSteps"), 0);
        int k = UiUtils.getLevelColor(_fld0.getResources(), _mth0(1));
        if (j <= 0)
        {
            SharedProfileSummaryUtils.displayMaxLevelInformation(_fld0.getResources(), _fld0, _fld0, i, k);
            return;
        } else
        {
            SharedProfileSummaryUtils.displayNextLevelInformation(_fld0.getResources(), _fld0, _fld0, i, j, k);
            return;
        }
    }

    public ()
    {
        this$0 = this._cls0.this;
        super();
        mClickableViews.add(mClickableViews.this.mClickableViews);
    }
}
