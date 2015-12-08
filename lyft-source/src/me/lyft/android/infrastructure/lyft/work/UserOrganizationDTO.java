// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


// Referenced classes of package me.lyft.android.infrastructure.lyft.work:
//            ErrorsDTO, InviteTextDTO, OrganizationDTO

public class UserOrganizationDTO
{

    public final ErrorsDTO errors;
    public final InviteTextDTO inviteText;
    public final OrganizationDTO organization;

    public UserOrganizationDTO(OrganizationDTO organizationdto, InviteTextDTO invitetextdto, ErrorsDTO errorsdto)
    {
        organization = organizationdto;
        inviteText = invitetextdto;
        errors = errorsdto;
    }

    public ErrorsDTO getErrors()
    {
        return errors;
    }

    public InviteTextDTO getInviteText()
    {
        return inviteText;
    }

    public OrganizationDTO getOrganization()
    {
        return organization;
    }
}
