// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            aa, af, ai

class ab
    implements aa
{

    ab()
    {
    }

    public void a(LayoutInflater layoutinflater, ai ai)
    {
        if (ai != null)
        {
            ai = new af(ai);
        } else
        {
            ai = null;
        }
        layoutinflater.setFactory(ai);
    }
}
