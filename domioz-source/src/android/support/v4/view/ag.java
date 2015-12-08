// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            af, ak, an

class ag
    implements af
{

    ag()
    {
    }

    public void a(LayoutInflater layoutinflater, an an)
    {
        if (an != null)
        {
            an = new ak(an);
        } else
        {
            an = null;
        }
        layoutinflater.setFactory(an);
    }
}
