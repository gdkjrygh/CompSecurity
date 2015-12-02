// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;


// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ad, an

class ai
    implements Runnable
{

    final an a;
    final ad b;

    ai(ad ad1, an an)
    {
        b = ad1;
        a = an;
        super();
    }

    public void run()
    {
        if (!b.g())
        {
            b.b(a);
        }
    }
}
