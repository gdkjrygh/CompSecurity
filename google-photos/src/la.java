// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;

final class la extends kz
{

    la()
    {
    }

    public final int a(int i)
    {
        return KeyEvent.normalizeMetaState(i);
    }

    public final boolean a(int i, int j)
    {
        return KeyEvent.metaStateHasModifiers(i, j);
    }

    public final boolean b(int i)
    {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
