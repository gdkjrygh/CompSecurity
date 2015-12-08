// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.os.AsyncTask;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import java.util.List;
import p.cw.c;

// Referenced classes of package p.ch:
//            a

class .AsyncTask extends AsyncTask
{

    final int a;
    final a b;

    protected transient Void a(Void avoid[])
    {
        avoid = (y)b.i().get(a);
        b.a.b().d().a(avoid, null, false, p.cw., new com.pandora.android.data.c(true));
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    Object(a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }
}
