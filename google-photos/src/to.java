// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

final class to
{

    int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    vu h;
    vs i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    public boolean n;
    boolean o;
    boolean p;
    Bundle q;

    to(int i1)
    {
        a = i1;
        o = false;
    }

    final void a(vu vu1)
    {
        if (vu1 != h)
        {
            if (h != null)
            {
                h.b(i);
            }
            h = vu1;
            if (vu1 != null && i != null)
            {
                vu1.a(i);
                return;
            }
        }
    }
}
