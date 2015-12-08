// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            EnterpriseScreens

public abstract class label extends EnterpriseScreens
{

    final String email;
    final String label;
    final UserOrganizationDTO userOrganization;

    public String getEmail()
    {
        return (String)Objects.firstNonNull(email, "");
    }

    public String getLabel()
    {
        return (String)Objects.firstNonNull(label, "");
    }

    public UserOrganizationDTO getUserOrganization()
    {
        return userOrganization;
    }

    public (String s, UserOrganizationDTO userorganizationdto)
    {
        email = s;
        userOrganization = userorganizationdto;
        label = "";
    }

    public label(String s, UserOrganizationDTO userorganizationdto, String s1)
    {
        email = s;
        userOrganization = userorganizationdto;
        label = s1;
    }
}
