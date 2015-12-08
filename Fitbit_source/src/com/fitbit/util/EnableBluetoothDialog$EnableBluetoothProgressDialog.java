// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.util:
//            ProgressDialogFragment, EnableBluetoothDialog

public static class I extends ProgressDialogFragment
{

    private static final Set a = new HashSet();
    private static boolean b = false;

    public static I a(int i, int j, android.content.I k)
    {
        I l = new <init>();
        a(((ProgressDialogFragment) (l)), i, j, k);
        return l;
    }

    public static void a(boolean flag)
    {
        b = flag;
        if (!b)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).dismiss()) { }
        }
    }

    public void onPause()
    {
        super.onPause();
        a.remove(this);
    }

    public void onResume()
    {
        super.onResume();
        if (b)
        {
            a.add(this);
            return;
        } else
        {
            dismiss();
            return;
        }
    }


    public I()
    {
    }
}
