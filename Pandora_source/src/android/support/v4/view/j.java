// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

class j
{

    public static int a(int i)
    {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean a(int i, int k)
    {
        return KeyEvent.metaStateHasModifiers(i, k);
    }

    public static boolean b(int i)
    {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
