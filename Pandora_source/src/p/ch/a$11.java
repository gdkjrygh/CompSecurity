// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.os.AsyncTask;
import java.util.HashMap;

// Referenced classes of package p.ch:
//            a

class .AsyncTask extends AsyncTask
{

    final a a;

    protected transient Void a(Void avoid[])
    {
        p.ch.a.a(a);
        return null;
    }

    protected void a(Void void1)
    {
label0:
        {
            if (p.ch.a.b(a).size() != 0)
            {
                a.j();
            }
            if (a.c != null && a.n() == -1)
            {
                a.c = null;
                if (p.ch.a.b(a).size() != 0)
                {
                    break label0;
                }
                p.ch.a.a(a, (byte)7);
                p.ch.a.b("PLAYING_STATUS_NO_STATIONS");
            }
            return;
        }
        p.ch.a.a(a, (byte)1);
        p.ch.a.b("PLAYING_STATUS_NO_ACTIVE_STATION");
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    Object(a a1)
    {
        a = a1;
        super();
    }
}
