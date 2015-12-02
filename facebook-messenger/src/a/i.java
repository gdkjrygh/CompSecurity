// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package a:
//            e, d

public class i
{

    private List a;

    public i()
    {
        a = new LinkedList();
    }

    public List a()
    {
        Collections.sort(a, e.a);
        return a;
    }

    public void a(d d)
    {
        a.add(d);
    }
}
