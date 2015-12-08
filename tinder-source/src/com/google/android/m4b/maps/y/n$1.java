// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.y:
//            n

public static final class <init>
    implements <init>
{

    final int a = 2;

    public final Iterator a(n n1, CharSequence charsequence)
    {
        return new n.a(n1, charsequence) {

            private n._cls1 c;

            public final int a(int i)
            {
                i = c.a + i;
                if (i < b.length())
                {
                    return i;
                } else
                {
                    return -1;
                }
            }

            public final int b(int i)
            {
                return i;
            }

            
            {
                c = n._cls1.this;
                super(n1, charsequence);
            }
        };
    }

    public <init>()
    {
        super();
    }
}
