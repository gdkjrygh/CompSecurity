// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.InviteSurfacingDTO;

public class InviteMenuItem extends RadioButton
{

    IConstantsProvider constantsProvider;

    public InviteMenuItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void adjustText()
    {
        InviteSurfacingDTO invitesurfacingdto = constantsProvider.getConstants().getInviteSurfacingDTO();
        if (invitesurfacingdto != InviteSurfacingDTO.NULL && !Strings.isNullOrEmpty(invitesurfacingdto.getMenuItemText()))
        {
            setText(invitesurfacingdto.getMenuItemText());
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        adjustText();
    }
}
