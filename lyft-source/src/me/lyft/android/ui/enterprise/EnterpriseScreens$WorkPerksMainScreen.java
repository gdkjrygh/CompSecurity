// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            EnterpriseScreens

public class organizationCreditLabel extends EnterpriseScreens
{

    final String organizationCreditLabel;

    public String getOrganizationCreditLabel()
    {
        return (String)Objects.firstNonNull(organizationCreditLabel, "");
    }

    public I()
    {
        organizationCreditLabel = "";
    }

    public organizationCreditLabel(String s)
    {
        organizationCreditLabel = s;
    }
}
