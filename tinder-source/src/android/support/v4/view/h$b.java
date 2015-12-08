// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            h, k

static class 
    implements 
{

    public void a(LayoutInflater layoutinflater, k k)
    {
        if (k != null)
        {
            k = new <init>(k);
        } else
        {
            k = null;
        }
        layoutinflater.setFactory(k);
    }

    ()
    {
    }
}
