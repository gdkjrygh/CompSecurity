// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

final class olh
{

    final String a;
    final Map b;
    final long c;
    final long d;

    public olh(oli oli1)
    {
        a = oli1.b;
        b = Collections.unmodifiableMap(oli1.a);
        c = oli1.c;
        d = oli1.d;
    }
}
