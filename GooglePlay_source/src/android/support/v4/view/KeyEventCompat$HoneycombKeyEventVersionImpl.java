// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            KeyEventCompat

static final class I extends I
{

    public final boolean metaStateHasModifiers(int i, int j)
    {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    public final boolean metaStateHasNoModifiers(int i)
    {
        return KeyEvent.metaStateHasNoModifiers(i);
    }

    public final int normalizeMetaState(int i)
    {
        return KeyEvent.normalizeMetaState(i);
    }

    I()
    {
    }
}
