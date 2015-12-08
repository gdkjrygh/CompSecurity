// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.os.AsyncTask;
import com.pandora.radio.provider.f;
import com.pandora.radio.provider.h;
import p.cw.c;

// Referenced classes of package p.cx:
//            c

class s.AsyncTask extends AsyncTask
{

    final int a;
    final .Void b;
    final p.cx.c c;

    protected transient Void a(Void avoid[])
    {
        avoid = p.cx.c.c(c).x();
        a;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 38
    //                   1 50;
           goto _L1 _L2 _L3
_L1:
        return null;
_L2:
        avoid.a("SORT_PREFERENCE", h.b);
        continue; /* Loop/switch isn't completed */
_L3:
        avoid.a("SORT_PREFERENCE", h.a);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void a(Void void1)
    {
        if (b != null)
        {
            b.a();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    .Object(p.cx.c c1, int i, .Object obj)
    {
        c = c1;
        a = i;
        b = obj;
        super();
    }
}
