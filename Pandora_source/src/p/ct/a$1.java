// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import android.os.AsyncTask;
import p.df.a;

// Referenced classes of package p.ct:
//            a

class s.AsyncTask extends AsyncTask
{

    final p.ct.a a;

    public transient Void a(Void avoid[])
    {
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.c("AppLink", "Thread interrupted during retry sleep", avoid);
        }
        a.a(false);
        return null;
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    .Object(p.ct.a a1)
    {
        a = a1;
        super();
    }
}
