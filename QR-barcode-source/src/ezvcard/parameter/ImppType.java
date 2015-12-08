// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter, VCardParameterCaseClasses

public class ImppType extends VCardParameter
{

    public static final ImppType BUSINESS = new ImppType("business");
    public static final ImppType HOME = new ImppType("home");
    public static final ImppType MOBILE = new ImppType("mobile");
    public static final ImppType PERSONAL = new ImppType("personal");
    public static final ImppType PREF = new ImppType("pref");
    public static final ImppType WORK = new ImppType("work");
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/ImppType);

    private ImppType(String s)
    {
        super(s);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static ImppType find(String s)
    {
        return (ImppType)enums.find(s);
    }

    public static ImppType get(String s)
    {
        return (ImppType)enums.get(s);
    }

}
