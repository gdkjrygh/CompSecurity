// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.res.Resources;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.domain.splitfare.SplitFareState;

public class addNegativeButton extends me.lyft.android.ui.essDialog
{

    public static addNegativeButton create(Resources resources, ISplitFareStateRepository isplitfarestaterepository)
    {
        isplitfarestaterepository = isplitfarestaterepository.getSplitFareState();
        return new <init>(resources.getString(0x7f070348, new Object[] {
            Integer.valueOf(isplitfarestaterepository.getAcceptedContributorsCount()), Integer.valueOf(isplitfarestaterepository.getInvitedContributorsCount())
        }), resources.getString(0x7f070347), resources.getString(0x7f070212));
    }

    public I(String s, String s1, String s2)
    {
        super("split_in_progress_dialog");
        setTitle(s);
        setMessage(s1);
        setTitleColorResource(0x7f0c0066);
        setButtonsOrientation(Integer.valueOf(1));
        addNegativeButton(s2);
    }
}
