// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class bb
    implements Runnable
{

    final android.content.SharedPreferences.Editor a;

    bb(android.content.SharedPreferences.Editor editor)
    {
        a = editor;
        super();
    }

    public final void run()
    {
        a.commit();
    }
}
