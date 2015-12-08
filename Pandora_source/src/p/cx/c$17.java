// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.os.AsyncTask;
import com.pandora.radio.provider.i;
import p.cw.c;

// Referenced classes of package p.cx:
//            c

class .AsyncTask extends AsyncTask
{

    final p.cx.c a;

    protected transient Integer a(Void avoid[])
    {
        return Integer.valueOf(p.cx.c.c(a).y().g());
    }

    protected void a(Integer integer)
    {
        a.i(integer.intValue());
        if (integer.intValue() > 0)
        {
            a.a(null);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    Object(p.cx.c c1)
    {
        a = c1;
        super();
    }
}
