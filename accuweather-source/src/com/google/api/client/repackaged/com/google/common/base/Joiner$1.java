// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.repackaged.com.google.common.base;


// Referenced classes of package com.google.api.client.repackaged.com.google.common.base:
//            Joiner, Preconditions

class nit> extends Joiner
{

    final Joiner this$0;
    final String val$nullText;

    public Joiner skipNulls()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    CharSequence toString(Object obj)
    {
        if (obj == null)
        {
            return val$nullText;
        } else
        {
            return Joiner.this.toString(obj);
        }
    }

    public Joiner useForNull(String s)
    {
        Preconditions.checkNotNull(s);
        throw new UnsupportedOperationException("already specified useForNull");
    }

    ions(String s)
    {
        this$0 = final_joiner;
        val$nullText = s;
        super(Joiner.this, null);
    }
}
