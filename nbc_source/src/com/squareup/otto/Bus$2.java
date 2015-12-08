// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;


// Referenced classes of package com.squareup.otto:
//            Bus

class nit> extends ThreadLocal
{

    final Bus this$0;

    protected Boolean initialValue()
    {
        return Boolean.valueOf(false);
    }

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    ()
    {
        this$0 = Bus.this;
        super();
    }
}
