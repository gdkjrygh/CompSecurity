// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Joiner

class  extends Joiner
{

    final Joiner this$0;
    final String val$nullText;

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
}
