// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class ihi
{

    final ihj a;
    final ekq b;
    final List c;
    public boolean d;

    public ihi(ihj ihj, ekq ekq, List list)
    {
        a = ihj;
        b = ekq;
        if (list == null)
        {
            ihj = null;
        } else
        {
            ihj = Collections.unmodifiableList(list);
        }
        c = ihj;
    }
}
