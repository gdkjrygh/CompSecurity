// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            d, e

private static abstract class a
    implements d
{

    private final a a;

    protected abstract boolean a();

    public final boolean a(CharSequence charsequence, int i)
    {
        if (charsequence == null || i < 0 || charsequence.length() - i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (a == null)
        {
            return a();
        }
        switch (a.a(charsequence, i))
        {
        default:
            return a();

        case 0: // '\0'
            return true;

        case 1: // '\001'
            return false;
        }
    }

    public eption(eption eption)
    {
        a = eption;
    }
}
