// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.activity.task.education.model.EducationToolTip;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationToolTipView

class this._cls0
    implements android.view.alLayoutListener
{

    final EducationToolTipView this$0;

    public void onGlobalLayout()
    {
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int i = Math.max(_tooltipTriangle.getHeight(), _tooltipInvertedTriangle.getHeight());
        EducationToolTipView.access$102(EducationToolTipView.this, i + _tooltipRectangle.getHeight());
        positionToolTip(AndroidEducationAnchor.findByValue(EducationToolTipView.access$200(EducationToolTipView.this).anchorPoint));
    }

    ()
    {
        this$0 = EducationToolTipView.this;
        super();
    }
}
