// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ValueHolder

public final class SimpleValueHolder
    implements ValueHolder
{

    private String value;

    public SimpleValueHolder()
    {
        value = "";
    }

    public final String getValue()
    {
        return value;
    }

    public final void setValue(String s)
    {
        Preconditions.checkNotNull(s);
        value = s;
    }
}
