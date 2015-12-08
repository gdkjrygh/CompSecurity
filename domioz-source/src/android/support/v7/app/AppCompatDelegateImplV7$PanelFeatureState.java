// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.i;
import android.view.View;
import android.view.ViewGroup;

final class q
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    i j;
    g k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;

    final void a(i i1)
    {
        if (i1 != j)
        {
            if (j != null)
            {
                j.b(k);
            }
            j = i1;
            if (i1 != null && k != null)
            {
                i1.a(k);
                return;
            }
        }
    }

    (int i1)
    {
        a = i1;
        q = false;
    }
}
