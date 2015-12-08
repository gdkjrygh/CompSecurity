// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import com.google.android.libraries.translate.offline.OfflinePackage;

public class h
{

    public final String b;
    public final int c;
    public OfflinePackage d;
    public boolean e;
    public android.view.View.OnClickListener f;

    public h(String s, int i)
    {
        this(s, i, null);
    }

    public h(String s, int i, OfflinePackage offlinepackage)
    {
        b = s;
        c = i;
        d = offlinepackage;
        e = false;
        f = null;
    }

    public String toString()
    {
        return b;
    }
}
