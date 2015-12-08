// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.y:
//            n

final class nit> extends nit>
{

    private b c;

    public final int a(int i)
    {
        i = c.c + i;
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

    ( , n n, CharSequence charsequence)
    {
        c = ;
        super(n, charsequence);
    }

    // Unreferenced inner class com/google/android/m4b/maps/y/n$1

/* anonymous class */
    public static final class n._cls1
        implements n.b
    {

        final int a = 2;

        public final Iterator a(n n1, CharSequence charsequence)
        {
            return new n._cls1._cls1(this, n1, charsequence);
        }

            public 
            {
                super();
            }
    }

}
