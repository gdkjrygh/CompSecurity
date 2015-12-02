// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo;

import android.content.Context;

public interface IUpdateService
{

    public abstract boolean checkUpdateJar(int i, String s);

    public abstract void downloadUpdate(Context context, String s, String s1);
}
