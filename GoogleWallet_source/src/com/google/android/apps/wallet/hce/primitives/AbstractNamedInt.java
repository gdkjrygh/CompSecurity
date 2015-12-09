// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.primitives;


// Referenced classes of package com.google.android.apps.wallet.hce.primitives:
//            AbstractNamed

public abstract class AbstractNamedInt extends AbstractNamed
{

    protected final int mIntValue;

    protected AbstractNamedInt(String s, int i)
    {
        super(s);
        mIntValue = i;
    }

    public int hashCode()
    {
        return super.hashCode() * 31 + Integer.valueOf(mIntValue).hashCode();
    }

    public final int intValue()
    {
        return mIntValue;
    }

    public String toString()
    {
        return String.format("%s '%X'", new Object[] {
            mName, Integer.valueOf(mIntValue)
        });
    }
}
