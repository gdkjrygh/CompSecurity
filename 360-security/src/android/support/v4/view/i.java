// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

class i
{

    public static int a(int j)
    {
        return KeyEvent.normalizeMetaState(j);
    }

    public static boolean a(int j, int k)
    {
        return KeyEvent.metaStateHasModifiers(j, k);
    }

    public static boolean b(int j)
    {
        return KeyEvent.metaStateHasNoModifiers(j);
    }
}
