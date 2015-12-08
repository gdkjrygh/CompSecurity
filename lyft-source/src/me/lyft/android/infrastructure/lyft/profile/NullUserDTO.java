// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;


// Referenced classes of package me.lyft.android.infrastructure.lyft.profile:
//            UserDTO

public class NullUserDTO extends UserDTO
{

    public static final String UNDETERMINED = "undetermined";
    private static final NullUserDTO instance = new NullUserDTO();

    private NullUserDTO()
    {
        super("", "", "", "", "", "", null, null, null, null, Boolean.valueOf(false), null, null, null, null, null, null, "undetermined", null, "", null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static NullUserDTO getInstance()
    {
        return instance;
    }

    public static boolean isNull(UserDTO userdto)
    {
        return instance.equals(userdto);
    }

}
