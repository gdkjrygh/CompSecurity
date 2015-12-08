// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.tiktok.inject.compatrootmodule;

import android.app.Application;
import puc;
import pud;
import pue;
import puf;
import pup;

public final class ComponentCreator
{

    public ComponentCreator()
    {
    }

    public final pue createComponent(Application application)
    {
        pud pud1 = puc.h();
        pud1.a = new puf(application);
        if (pud1.a == null)
        {
            throw new IllegalStateException(String.valueOf(puf.getCanonicalName()).concat(" must be set"));
        }
        if (pud1.b == null)
        {
            pud1.b = new pup();
        }
        return new puc(pud1);
    }
}
