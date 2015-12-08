// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.c;

import com.roidapp.baselib.c.c;

// Referenced classes of package com.roidapp.imagelib.c:
//            c

final class d extends c
{

    private final com.roidapp.imagelib.c.c a;

    public d(com.roidapp.imagelib.c.c c1)
    {
        a = c1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        if (a == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            a.b();
            return Boolean.valueOf(true);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        if (a != null)
        {
            a.a();
        }
    }
}
