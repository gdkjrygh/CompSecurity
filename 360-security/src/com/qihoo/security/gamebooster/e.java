// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            LocalGamePkg

public class e
{

    private List a;
    private List b;

    public e(List list)
    {
        a = list;
        a(list);
    }

    private void a(List list)
    {
        b = new ArrayList();
        b.addAll(list);
        b.add(LocalGamePkg.ADD);
    }

    public List a()
    {
        return b;
    }
}
