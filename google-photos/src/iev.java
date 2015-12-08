// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

final class iev
    implements iwj
{

    iev()
    {
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        Collections.sort(((List) (obj)), new iej());
        return obj;
    }
}
