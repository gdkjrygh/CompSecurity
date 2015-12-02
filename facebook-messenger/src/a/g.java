// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import a.a.d;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package a:
//            f, i

public class g
{

    private static f a = new d();
    private static Pattern b = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

    public g()
    {
    }

    public static i a(List list, List list1)
    {
        return a(list, list1, a);
    }

    public static i a(List list, List list1, f f1)
    {
        return f1.a(list, list1);
    }

}
