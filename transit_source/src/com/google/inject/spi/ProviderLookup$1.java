// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.internal.util.$Preconditions;

// Referenced classes of package com.google.inject.spi:
//            ProviderLookup

class this._cls0
    implements Provider
{

    final ProviderLookup this$0;

    public Object get()
    {
        boolean flag;
        if (ProviderLookup.access$000(ProviderLookup.this) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "This Provider cannot be used until the Injector has been created.");
        return ProviderLookup.access$000(ProviderLookup.this).get();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Provider<").append(ProviderLookup.access$100(ProviderLookup.this).getTypeLiteral()).append(">").toString();
    }

    ditions()
    {
        this$0 = ProviderLookup.this;
        super();
    }
}
