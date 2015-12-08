// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.AsyncTask;

// Referenced classes of package com.amazon.device.associates:
//            n

static final class a extends AsyncTask
{

    final String a;

    protected transient Void a(Void avoid[])
    {
        if (a != null && !a.trim().equals(""))
        {
            n.a(n.a(), new String[] {
                a
            });
        }
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    (String s)
    {
        a = s;
        super();
    }
}
