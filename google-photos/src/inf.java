// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class inf
{

    public final int a;
    private final ar b;

    public inf(ar ar1, int i)
    {
        b = ar1;
        a = i;
    }

    public void a(am am1, int i, String s)
    {
        Object obj;
        Object obj1;
        obj1 = b.getIntent().getExtras();
        obj = am1.q;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (obj1 == null)
        {
            obj = new Bundle();
        }
_L4:
        am1.f(((Bundle) (obj)));
        obj = b.c();
        obj1 = ((ay) (obj)).a();
        ((bp) (obj1)).b(i, am1, s);
        ((bp) (obj1)).a(0);
        ((bp) (obj1)).c();
        ((ay) (obj)).b();
        return;
_L2:
        if (obj1 != null)
        {
            Bundle bundle = new Bundle(((Bundle) (obj1)).size() + ((Bundle) (obj)).size());
            bundle.putAll(((Bundle) (obj1)));
            bundle.putAll(((Bundle) (obj)));
            obj = bundle;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
