// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class isz extends dy
{

    private static final ekk A = (new ekm()).a(hpg).a(elt).b(hdv).a();
    Point l[];
    boolean m;
    private final ej n;
    private final iul o;
    private final int p;
    private final iuj q;
    private final String r;
    private final String s;
    private final boolean t;
    private final boolean u;
    private final Uri v;
    private iug w;
    private ekq x;
    private inl y;
    private boolean z;

    public isz(Context context, iul iul1, int i, iuj iuj1, String s1, String s2, boolean flag, 
            boolean flag1, Point apoint[], ekq ekq1, inl inl)
    {
        this(context, iul1, i, iuj1, s1, s2, true, false, apoint, ekq1, inl, true);
    }

    public isz(Context context, iul iul1, int i, iuj iuj1, String s1, String s2, boolean flag, 
            boolean flag1, Point apoint[], ekq ekq1, inl inl, boolean flag2)
    {
        super(context);
        n = new ej(this);
        o = iul1;
        p = i;
        q = iuj1;
        r = s1;
        s = s2;
        t = flag;
        u = flag1;
        l = apoint;
        x = ekq1;
        y = inl;
        z = flag2;
        v = Uri.withAppendedPath(iun.a, iuj1.a());
    }

    static inl a(isz isz1)
    {
        return isz1.y;
    }

    private iuh a(iuj iuj1)
    {
        byte abyte0[] = s();
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        iuh iuh1;
        try
        {
            iuh1 = new iuh((pev)qlw.a(new pev(), abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (iuj iuj1)
        {
            Log.e("StoryLoader", "Unable to deserialize test story", iuj1);
            return null;
        }
_L4:
        return iuh1;
_L2:
        iuh iuh2 = o.a;
        if (iuh2 == null || iuh2.a == null)
        {
            break; /* Loop/switch isn't completed */
        }
        iuh1 = iuh2;
        if (c.c(iuj1.a, iuh2.a.a.b))
        {
            continue; /* Loop/switch isn't completed */
        }
        o.a = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return iun.a(super.f, p, iuj1);
    }

    static ekk q()
    {
        return A;
    }

    private iug r()
    {
        Object obj;
        boolean flag1;
        flag1 = false;
        try
        {
            if (q.a() == null)
            {
                Log.w("StoryLoader", "Can't load story with null id.");
                throw new itc(this, (byte)0);
            }
        }
        catch (itb itb1)
        {
            iuh iuh1 = new iuh(null);
            iuh1.e = 2;
            return iuh1.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new iuh(null);
            obj.e = 1;
            return ((iuh) (obj)).a();
        }
        if (!m) goto _L2; else goto _L1
_L1:
        super.f.getContentResolver().unregisterContentObserver(n);
        iun.b(super.f, p, q);
        super.f.getContentResolver().registerContentObserver(v, false, n);
        m = false;
        obj = null;
_L11:
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!((iuh) (obj)).f) goto _L5; else goto _L4
_L4:
        if (t && (l == null || l.length == 0))
        {
            throw new itb(this);
        }
          goto _L5
_L2:
        iuh iuh2 = a(q);
        if (iuh2 == null) goto _L7; else goto _L6
_L6:
        obj = iuh2.a;
_L17:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_734;
        }
        if (((pev) (obj)).f == null || !b.a(((pev) (obj)).f.a, false))
        {
            break MISSING_BLOCK_LABEL_734;
        }
        int i = 1;
_L18:
        boolean flag;
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        flag = flag1;
        if (((pev) (obj)).f == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        flag = flag1;
        if (b.a(((pev) (obj)).f.b, false))
        {
            flag = true;
        }
        if (t && i == 0) goto _L9; else goto _L8
_L8:
        obj = iuh2;
        if (!u) goto _L11; else goto _L10
_L10:
        obj = iuh2;
        if (flag) goto _L11; else goto _L9
_L9:
        obj = iuh2;
        if (iuh2 == null) goto _L11; else goto _L12
_L12:
        obj = iuh2;
        if (iuh2.f) goto _L11; else goto _L13
_L13:
        obj = null;
          goto _L11
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        if (!((iuh) (obj)).f)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (((iuh) (obj)).f)
        {
            z = false;
        }
        obj = new ing(super.f, p, q, r, s, t, u, l, false, z);
        ((ing) (obj)).d();
        if (((ing) (obj)).l())
        {
            throw new itc(this, (byte)0);
        }
        obj = new iuh(((pbm)((ing) (obj)).t()).a.a);
        obj.c = System.currentTimeMillis();
        super.f.getContentResolver().unregisterContentObserver(n);
        super.f.getContentResolver().registerContentObserver(v, false, n);
        int k;
        if (x != null)
        {
            try
            {
                Object obj1 = (ekv)((elw)olm.a(super.f, elw)).a(x.a());
                ekk ekk = (new ekm()).a(elt).a();
                obj1 = ((ekv) (obj1)).a(x, ekw.a, ekk);
                obj.b = (iui)(new ita(this)).execute(new elb[] {
                    obj1
                }).get();
            }
            catch (InterruptedException interruptedexception)
            {
                Log.e("StoryLoader", "Interrupted exception during story loading media");
            }
            catch (ExecutionException executionexception)
            {
                Log.e("StoryLoader", "Execution exception during story loading media");
            }
        }
        obj = ((iuh) (obj)).a();
        if (((iug) (obj)).equals(w)) goto _L15; else goto _L14
_L14:
        if (Log.isLoggable("StoryLoader", 3) && w != null && qlw.a(((iug) (obj)).a, w.a) && ((iug) (obj)).e != w.e)
        {
            i = w.e;
            k = ((iug) (obj)).e;
            (new StringBuilder(62)).append("loadedStoryData.loadStatus changed: ").append(i).append(" -> ").append(k);
        }
        w = ((iug) (obj));
_L16:
        return w;
_L15:
        if (((iug) (obj)).d)
        {
            w.d = ((iug) (obj)).d;
        }
        if (true) goto _L16; else goto _L7
_L7:
        obj = null;
          goto _L17
        i = 0;
          goto _L18
    }

    private byte[] s()
    {
        if (!(new File(super.f.getFilesDir(), "story-with-layout.protobin")).exists())
        {
            return null;
        }
        BufferedInputStream bufferedinputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        bufferedinputstream = new BufferedInputStream(super.f.openFileInput("story-with-layout.protobin"));
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[1024];
_L1:
        int i = bufferedinputstream.read(abyte1, 0, 1024);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            byte abyte0[];
            try
            {
                bytearrayoutputstream.write(abyte1, 0, i);
            }
            catch (IOException ioexception)
            {
                return null;
            }
        }
          goto _L1
        bytearrayoutputstream.flush();
        bufferedinputstream.close();
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public final Object d()
    {
        return r();
    }

    protected final void f()
    {
        if (!o() && w != null)
        {
            a(w);
            return;
        } else
        {
            h();
            super.f.getContentResolver().registerContentObserver(v, false, n);
            return;
        }
    }

    protected final void j()
    {
        g();
    }

    protected final void n()
    {
        super.f.getContentResolver().unregisterContentObserver(n);
        w = null;
        m = false;
        g();
    }

}
