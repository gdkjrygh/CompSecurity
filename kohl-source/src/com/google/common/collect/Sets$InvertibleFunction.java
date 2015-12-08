// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Sets

static abstract class <init>
    implements Function
{

    public <init> inverse()
    {
        return new Sets.InvertibleFunction() {

            final Sets.InvertibleFunction this$0;

            public Object apply(Object obj)
            {
                return Sets.InvertibleFunction.this.invert(obj);
            }

            public Sets.InvertibleFunction inverse()
            {
                return Sets.InvertibleFunction.this;
            }

            Object invert(Object obj)
            {
                return Sets.InvertibleFunction.this.apply(obj);
            }

            
            {
                this$0 = Sets.InvertibleFunction.this;
                super();
            }
        };
    }

    abstract Object invert(Object obj);

    <init>()
    {
    }
}
