// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter, VCardParameterCaseClasses

public class InterestLevel extends VCardParameter
{

    public static final InterestLevel HIGH = new InterestLevel("high");
    public static final InterestLevel LOW = new InterestLevel("low");
    public static final InterestLevel MEDIUM = new InterestLevel("medium");
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/InterestLevel);

    private InterestLevel(String s)
    {
        super(s);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static InterestLevel find(String s)
    {
        return (InterestLevel)enums.find(s);
    }

    public static InterestLevel get(String s)
    {
        return (InterestLevel)enums.get(s);
    }

}
