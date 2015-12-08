// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

public class mro
{

    public final mrp a;
    private final Context b;
    private final ContentResolver c;
    private final mmv d;
    private nmp e;

    public mro(Context context)
    {
        this(context, context.getContentResolver());
    }

    private mro(Context context, ContentResolver contentresolver)
    {
        a = new mrp(this);
        b = context;
        c = contentresolver;
        d = (mmv)olm.a(context, mmv);
    }

    private String a(String s)
    {
        String s1;
        try
        {
            s1 = nkp.a(c.openInputStream(Uri.parse(s)));
        }
        catch (Exception exception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "cannot compute fingerprint for: ".concat(s);
            } else
            {
                s = new String("cannot compute fingerprint for: ");
            }
            Log.e("UploadRpcExecutor", s, exception);
            return null;
        }
        return s1;
    }

    public final mrq a(int i, String s, String s1)
    {
        s1 = a(s1);
        Object obj = d.a(i).b("gaia_id");
        if (TextUtils.isEmpty(s1))
        {
            return mrq.a(mrr.d);
        }
        obj = new nwh(b, i, ((String) (obj)), Arrays.asList(new String[] {
            s1
        }));
        ((nwh) (obj)).d();
        if (!((nwh) (obj)).l() && ((nwh) (obj)).a(s1))
        {
            long l = ((nwh) (obj)).b(s1);
            if ("instant".equals(s))
            {
                return mrq.a(mrr.c);
            }
            s = new nuj(b, i, s, null, Arrays.asList(new String[] {
                Long.toString(l)
            }), nuh.a);
            s.d();
            if (!s.l())
            {
                return mrq.a((String)((nuj) (s)).c.get(0), (String)((nuj) (s)).d.get(0));
            }
        }
        return mrq.a(mrr.c);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final mrq b(int i, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        s = mrq.a(mrr.b);
        this;
        JVM INSTR monitorexit ;
        return s;
        e = (new nmr(b)).a(i).a();
        this;
        JVM INSTR monitorexit ;
        if (!a.a)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        s = mrq.a(mrr.e);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        nmp nmp1 = e;
        nnd nnd1 = new nnd();
        nnd1.a = Uri.parse(s1);
        nnd1.d = s;
        nnd1.f = true;
        nnd1.g = false;
        s = nmp1.a(nnd1.a());
        s = mrq.a(((nmo) (s)).a, ((nmo) (s)).b);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        s = mrq.a(mrr.e);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (Log.isLoggable("UploadRpcExecutor", 6))
        {
            Log.e("UploadRpcExecutor", "Upload should be restarted: ", s);
        }
        s = mrq.a(mrr.b);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (Log.isLoggable("UploadRpcExecutor", 6))
        {
            Log.e("UploadRpcExecutor", "File not found: ", s);
        }
        s = mrq.a(mrr.d);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (Log.isLoggable("UploadRpcExecutor", 6))
        {
            Log.e("UploadRpcExecutor", "Error while uploading photo to album: ", s);
        }
        s = mrq.a(mrr.c);
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        this;
        JVM INSTR monitorenter ;
        e = null;
        a.a = false;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
