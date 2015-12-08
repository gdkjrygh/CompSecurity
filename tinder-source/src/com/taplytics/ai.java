// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.taplytics:
//            s, z

final class ai extends AsyncTask
{

    final z a;

    private ai(z z)
    {
        a = z;
        super();
    }

    ai(z z, byte byte0)
    {
        this(z);
    }

    private static Boolean a(ArrayList aarraylist[])
    {
        try
        {
            for (aarraylist = aarraylist[0].iterator(); aarraylist.hasNext(); ((s)aarraylist.next()).a()) { }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList aarraylist[])
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((ArrayList[])aobj);
    }
}
