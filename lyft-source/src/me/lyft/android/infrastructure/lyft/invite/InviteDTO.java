// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.invite;


// Referenced classes of package me.lyft.android.infrastructure.lyft.invite:
//            InvitePhoneNumber

public class InviteDTO
{

    public final String email;
    public final String firstName;
    public final String lastName;
    public final InvitePhoneNumber phoneNumbers[];

    public InviteDTO(String s, String s1, InvitePhoneNumber ainvitephonenumber[], String s2)
    {
        firstName = s;
        lastName = s1;
        phoneNumbers = ainvitephonenumber;
        email = s2;
    }
}
