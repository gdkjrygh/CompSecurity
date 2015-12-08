// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            w

final class x extends w
{

    x()
    {
    }

    public final int a(int i)
    {
        return KeyEvent.normalizeMetaState(i);
    }

    public final boolean b(int i)
    {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    public final boolean c(int i)
    {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
