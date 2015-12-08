// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter, VCardParameterCaseClasses

public class HobbyLevel extends VCardParameter
{

    public static final HobbyLevel HIGH = new HobbyLevel("high");
    public static final HobbyLevel LOW = new HobbyLevel("low");
    public static final HobbyLevel MEDIUM = new HobbyLevel("medium");
    private static final VCardParameterCaseClasses enums = new VCardParameterCaseClasses(ezvcard/parameter/HobbyLevel);

    private HobbyLevel(String s)
    {
        super(s);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static HobbyLevel find(String s)
    {
        return (HobbyLevel)enums.find(s);
    }

    public static HobbyLevel get(String s)
    {
        return (HobbyLevel)enums.get(s);
    }

}
