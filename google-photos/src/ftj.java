// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ftj
{

    public final List a;

    public ftj(List list)
    {
        a = list;
    }

    public final void a(fsv fsv)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ftd)iterator.next()).c(fsv)) { }
    }
}
