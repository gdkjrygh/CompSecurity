// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class jdk
    implements jde
{

    public final List a = new CopyOnWriteArrayList();

    public jdk()
    {
    }

    static List a(jdk jdk1)
    {
        return jdk1.a;
    }

    public final void a(int i, int j, long l, long l1)
    {
        b.a(new jdl(this, i, j, l, l1));
    }
}
