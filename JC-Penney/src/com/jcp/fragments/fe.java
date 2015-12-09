// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import java.util.Observable;

public class fe extends Observable
{

    private boolean a;

    public fe()
    {
    }

    public void a(boolean flag)
    {
        a = flag;
        setChanged();
        notifyObservers(this);
    }
}
