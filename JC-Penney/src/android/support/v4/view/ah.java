// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ai, am

class ah
{

    static void a(LayoutInflater layoutinflater, am am)
    {
        if (am != null)
        {
            am = new ai(am);
        } else
        {
            am = null;
        }
        layoutinflater.setFactory(am);
    }
}
