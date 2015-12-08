// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter, VCardParameterCaseClasses

public class Calscale extends VCardParameter
{

    public static final Calscale GREGORIAN = new Calscale("gregorian");
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/Calscale);

    private Calscale(String s)
    {
        super(s);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static Calscale find(String s)
    {
        return (Calscale)enums.find(s);
    }

    public static Calscale get(String s)
    {
        return (Calscale)enums.get(s);
    }

}
