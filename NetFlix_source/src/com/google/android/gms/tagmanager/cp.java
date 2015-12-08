// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.kt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ba, bh, cq, bg, 
//            cd

class cp
    implements o.f
{

    private final String WJ;
    private bg Zf;
    private final ExecutorService Zm = Executors.newSingleThreadExecutor();
    private final Context mContext;

    cp(Context context, String s)
    {
        mContext = context;
        WJ = s;
    }

    private cq.c a(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = ba.bG(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            bh.v("Tried to convert binary resource to string for JSON parsing; not UTF-8 format");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            bh.z("Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private cq.c k(byte abyte0[])
    {
        try
        {
            abyte0 = cq.b(com.google.android.gms.internal.c.f.a(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            bh.z("Resource doesn't contain a binary container");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            bh.z("Resource doesn't contain a binary container");
            return null;
        }
        return abyte0;
    }

    public void a(bg bg1)
    {
        Zf = bg1;
    }

    public void b(com.google.android.gms.internal.it.a a1)
    {
        Zm.execute(new Runnable(a1) {

            final cp Zn;
            final com.google.android.gms.internal.it.a Zo;

            public void run()
            {
                Zn.c(Zo);
            }

            
            {
                Zn = cp.this;
                Zo = a1;
                super();
            }
        });
    }

    boolean c(com.google.android.gms.internal.it.a a1)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = lc();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.it.a a1)
        {
            bh.w("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(kt.d(a1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.it.a a1)
        {
            bh.z("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        a1;
        bh.z("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.it.a a1)
        {
            bh.z("error closing stream for writing resource to disk");
            return false;
        }
        return false;
        a1;
        try
        {
            fileoutputstream.close();
        }
        catch (IOException ioexception)
        {
            bh.z("error closing stream for writing resource to disk");
        }
        throw a1;
    }

    public cq.c ca(int i)
    {
        bh.y((new StringBuilder()).append("Atttempting to load container from resource ID ").append(i).toString());
        Object obj;
        Object obj1;
        try
        {
            obj1 = mContext.getResources().openRawResource(i);
            obj = new ByteArrayOutputStream();
            cq.b(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = a(((ByteArrayOutputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            bh.z((new StringBuilder()).append("Error reading default container resource with ID ").append(i).toString());
            return null;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            bh.z("No default container resource found.");
            return null;
        }
        if (obj1 != null)
        {
            return ((cq.c) (obj1));
        }
        obj = k(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((cq.c) (obj));
    }

    public void km()
    {
        Zm.execute(new Runnable() {

            final cp Zn;

            public void run()
            {
                Zn.lb();
            }

            
            {
                Zn = cp.this;
                super();
            }
        });
    }

    void lb()
    {
        Object obj;
        if (Zf == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        }
        Zf.kl();
        bh.y("Start loading resource from disk ...");
        if ((cd.kT().kU() == cd.a.YU || cd.kT().kU() == cd.a.YV) && WJ.equals(cd.kT().getContainerId()))
        {
            Zf.a(bg.a.Yy);
            return;
        }
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            obj = new FileInputStream(lc());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.v("resource not on disk");
            Zf.a(bg.a.Yy);
            return;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        cq.b(((java.io.InputStream) (obj)), bytearrayoutputstream);
        Zf.i(com.google.android.gms.internal.it.a.l(bytearrayoutputstream.toByteArray()));
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.z("error closing stream for reading resource from disk");
        }
_L2:
        bh.y("Load resource from disk finished.");
        return;
        Object obj1;
        obj1;
        bh.z("error reading resource from disk");
        Zf.a(bg.a.Yz);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.z("error closing stream for reading resource from disk");
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            bh.z("error closing stream for reading resource from disk");
        }
        throw obj1;
    }

    File lc()
    {
        String s = (new StringBuilder()).append("resource_").append(WJ).toString();
        return new File(mContext.getDir("google_tagmanager", 0), s);
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        Zm.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
