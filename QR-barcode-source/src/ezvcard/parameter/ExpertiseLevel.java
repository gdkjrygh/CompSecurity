// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter, VCardParameterCaseClasses

public class ExpertiseLevel extends VCardParameter
{

    public static final ExpertiseLevel AVERAGE = new ExpertiseLevel("average");
    public static final ExpertiseLevel BEGINNER = new ExpertiseLevel("beginner");
    public static final ExpertiseLevel EXPERT = new ExpertiseLevel("expert");
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/ExpertiseLevel);

    private ExpertiseLevel(String s)
    {
        super(s);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static ExpertiseLevel find(String s)
    {
        return (ExpertiseLevel)enums.find(s);
    }

    public static ExpertiseLevel get(String s)
    {
        return (ExpertiseLevel)enums.get(s);
    }

}
