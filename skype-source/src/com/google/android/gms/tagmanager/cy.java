// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cb, ae, cx

final class cy
{
    public static interface a
    {

        public abstract int a(Object obj, Object obj1);
    }


    final a a = new a() {

        final cy a;

        public final int a(Object obj, Object obj1)
        {
            return 1;
        }

            
            {
                a = cy.this;
                super();
            }
    };

    public cy()
    {
    }

    public static cx a(a a1)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            return new cb(a1);
        } else
        {
            return new ae(a1);
        }
    }
}
