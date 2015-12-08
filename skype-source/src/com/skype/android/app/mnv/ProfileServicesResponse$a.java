// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesResponse

static final class source extends Enum
{

    private static final getSource $VALUES[];
    public static final getSource MSA;
    public static final getSource SKYPE;
    private static final Map lookup;
    private final String source;

    public static source get(String s)
    {
        return (source)lookup.get(s);
    }

    public static lookup valueOf(String s)
    {
        return (lookup)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesResponse$a, s);
    }

    public static lookup[] values()
    {
        return (lookup[])$VALUES.clone();
    }

    public final String getSource()
    {
        return source;
    }

    public final String toString()
    {
        return source;
    }

    static 
    {
        MSA = new <init>("MSA", 0, "Msa");
        SKYPE = new <init>("SKYPE", 1, "Skype");
        $VALUES = (new .VALUES[] {
            MSA, SKYPE
        });
        lookup = new HashMap();
        source asource[] = values();
        int j = asource.length;
        for (int i = 0; i < j; i++)
        {
            source source1 = asource[i];
            lookup.put(source1.getSource(), source1);
        }

    }

    private _cls9(String s, int i, String s1)
    {
        super(s, i);
        source = s1;
    }
}
