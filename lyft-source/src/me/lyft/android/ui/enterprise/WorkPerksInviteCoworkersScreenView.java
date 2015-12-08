// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.Objects;
import me.lyft.android.controls.Toolbar;

public class WorkPerksInviteCoworkersScreenView extends LinearLayout
{

    EnterpriseScreens.WorkPerksInviteCoworkersScreen params;
    Toolbar toolbar;

    public WorkPerksInviteCoworkersScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (EnterpriseScreens.WorkPerksInviteCoworkersScreen)context.a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle((String)Objects.firstNonNull(params.getLabel(), "Work"));
    }
}
