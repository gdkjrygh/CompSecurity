// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;

public interface LogflowEventListener
{

    public abstract void logClick(int i, View view);

    public abstract void logClick(View view);

    public abstract void logImpression(View view, boolean flag);
}
