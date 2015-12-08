// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            KeyEventCompat, KeyEventCompatHoneycomb

static final class I extends I
{

    public final boolean metaStateHasModifiers(int i, int j)
    {
        return KeyEventCompatHoneycomb.metaStateHasModifiers(i, j);
    }

    public final boolean metaStateHasNoModifiers(int i)
    {
        return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
    }

    public final int normalizeMetaState(int i)
    {
        return KeyEventCompatHoneycomb.normalizeMetaState(i);
    }

    I()
    {
    }
}
