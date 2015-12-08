// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.os.AsyncTask;
import com.pandora.radio.data.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import p.bo.a;

// Referenced classes of package p.ch:
//            a

class s.AsyncTask extends AsyncTask
{

    final p.ch.a a;

    protected transient Void a(Void avoid[])
    {
        Object obj;
        avoid = new ByteArrayOutputStream(p.ch.a.p().intValue());
        obj = new a();
        byte byte0 = 64;
        List list;
        list = a.i();
        avoid.write(list.size());
        int i = 0;
_L3:
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = ((y)list.get(i)).d().getBytes("UTF-8");
        if (abyte0.length + 2 + avoid.size() <= p.ch.a.p().intValue() - 6)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        ((a) (obj)).a(byte0, avoid.toByteArray());
        p.ch.a.a(a, ((a) (obj)));
        obj = new ByteArrayOutputStream(p.ch.a.p().intValue());
        avoid = new a();
        byte0 = 65;
_L4:
        ((ByteArrayOutputStream) (obj)).write(i);
        ((ByteArrayOutputStream) (obj)).write(abyte0);
        ((ByteArrayOutputStream) (obj)).write(0);
        i++;
        Object obj1 = obj;
        obj = avoid;
        avoid = ((Void []) (obj1));
          goto _L3
_L2:
        try
        {
            ((a) (obj)).a(byte0, avoid.toByteArray());
            p.ch.a.a(a, ((a) (obj)));
            a.k();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.e("WatchManager", "PEBBLE - Error occurring in sendStations.", avoid);
        }
        return null;
        Void avoid1[] = avoid;
        avoid = ((Void []) (obj));
        obj = avoid1;
          goto _L4
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    .Object(p.ch.a a1)
    {
        a = a1;
        super();
    }
}
