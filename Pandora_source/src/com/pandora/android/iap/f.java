// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import p.cw.c;

public class f
{

    public static void a()
    {
        b.a.b().j().a(true);
        PandoraIntent pandoraintent = new PandoraIntent("iap_error");
        b.a.C().a(pandoraintent);
    }
}
