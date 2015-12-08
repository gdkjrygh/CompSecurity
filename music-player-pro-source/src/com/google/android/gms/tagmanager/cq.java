// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
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
//            ba, bh, cr, bg, 
//            ce

class cq
    implements o.f
{

    private final String aqm;
    private bg asC;
    private final ExecutorService asJ = Executors.newSingleThreadExecutor();
    private final Context mContext;

    cq(Context context, String s)
    {
        mContext = context;
        aqm = s;
    }

    private cr.c a(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = ba.cI(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            bh.S("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            bh.W("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private void d(com.google.android.gms.internal.pu.a a1)
        throws IllegalArgumentException
    {
        if (a1.gs == null && a1.auC == null)
        {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        } else
        {
            return;
        }
    }

    private cr.c k(byte abyte0[])
    {
        try
        {
            abyte0 = cr.b(com.google.android.gms.internal.c.f.a(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            bh.T("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            bh.W("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        bh.V("The container was successfully loaded from the resource (using binary file)");
        return abyte0;
    }

    public void a(bg bg1)
    {
        asC = bg1;
    }

    public void b(com.google.android.gms.internal.pu.a a1)
    {
        asJ.execute(new Runnable(a1) {

            final cq asK;
            final com.google.android.gms.internal.pu.a asL;

            public void run()
            {
                asK.c(asL);
            }

            
            {
                asK = cq.this;
                asL = a1;
                super();
            }
        });
    }

    boolean c(com.google.android.gms.internal.pu.a a1)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = qj();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.pu.a a1)
        {
            bh.T("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(qw.f(a1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.pu.a a1)
        {
            bh.W("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        a1;
        bh.W("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.pu.a a1)
        {
            bh.W("error closing stream for writing resource to disk");
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
            bh.W("error closing stream for writing resource to disk");
        }
        throw a1;
    }

    public cr.c fH(int i)
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = mContext.getResources().openRawResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.W((new StringBuilder()).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
        bh.V((new StringBuilder()).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
        try
        {
            obj = new ByteArrayOutputStream();
            cr.b(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = a(((ByteArrayOutputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            bh.W((new StringBuilder()).append("Error reading the default container with resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        bh.V("The container was successfully loaded from the resource (using JSON file format)");
        return ((cr.c) (obj1));
        obj = k(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((cr.c) (obj));
    }

    public void pt()
    {
        asJ.execute(new Runnable() {

            final cq asK;

            public void run()
            {
                asK.qi();
            }

            
            {
                asK = cq.this;
                super();
            }
        });
    }

    void qi()
    {
        Object obj;
        if (asC == null)
        {
            throw new IllegalStateException("Callback must be set before execute");
        }
        asC.ps();
        bh.V("Attempting to load resource from disk");
        if ((ce.qa().qb() == ce.a.asr || ce.qa().qb() == ce.a.ass) && aqm.equals(ce.qa().getContainerId()))
        {
            asC.a(bg.a.arV);
            return;
        }
        Object obj1;
        try
        {
            obj = new FileInputStream(qj());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.S("Failed to find the resource in the disk");
            asC.a(bg.a.arV);
            return;
        }
        obj1 = new ByteArrayOutputStream();
        cr.b(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
        obj1 = com.google.android.gms.internal.pu.a.l(((ByteArrayOutputStream) (obj1)).toByteArray());
        d(((com.google.android.gms.internal.pu.a) (obj1)));
        asC.l(obj1);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.W("Error closing stream for reading resource from disk");
        }
_L1:
        bh.V("The Disk resource was successfully read.");
        return;
        Object obj2;
        obj2;
        asC.a(bg.a.arW);
        bh.W("Failed to read the resource from disk");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.W("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        asC.a(bg.a.arW);
        bh.W("Failed to read the resource from disk. The resource is inconsistent");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bh.W("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            bh.W("Error closing stream for reading resource from disk");
        }
        throw obj2;
    }

    File qj()
    {
        String s = (new StringBuilder()).append("resource_").append(aqm).toString();
        return new File(mContext.getDir("google_tagmanager", 0), s);
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        asJ.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
