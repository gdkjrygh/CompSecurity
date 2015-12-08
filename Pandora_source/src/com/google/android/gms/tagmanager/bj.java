// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zzny;
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
//            y, zzbg, zzbf, ax

class bj
    implements zzp.f
{

    private final Context a;
    private final String b;
    private final ExecutorService c = Executors.newSingleThreadExecutor();
    private zzbf d;

    bj(Context context, String s)
    {
        a = context;
        b = s;
    }

    private com.google.android.gms.internal.zzmq.zzc a(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = y.a(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzaj("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzan("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private com.google.android.gms.internal.zzmq.zzc a(byte abyte0[])
    {
        try
        {
            abyte0 = zzmq.zzb(com.google.android.gms.internal.zzc.zzf.zza(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.zzak("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzbg.zzan("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        zzbg.zzam("The container was successfully loaded from the resource (using binary file)");
        return abyte0;
    }

    private void c(com.google.android.gms.internal.zzmi.zza zza)
        throws IllegalArgumentException
    {
        if (zza.zzhh == null && zza.zzaGM == null)
        {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        } else
        {
            return;
        }
    }

    public com.google.android.gms.internal.zzmq.zzc a(int i)
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = a.getResources().openRawResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzan((new StringBuilder()).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
        zzbg.zzam((new StringBuilder()).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(a.getResources().getResourceName(i)).append(")").toString());
        try
        {
            obj = new ByteArrayOutputStream();
            zzmq.zzc(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = a(((ByteArrayOutputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            zzbg.zzan((new StringBuilder()).append("Error reading the default container with resource ID ").append(i).append(" (").append(a.getResources().getResourceName(i)).append(")").toString());
            return null;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        zzbg.zzam("The container was successfully loaded from the resource (using JSON file format)");
        return ((com.google.android.gms.internal.zzmq.zzc) (obj1));
        obj = a(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((com.google.android.gms.internal.zzmq.zzc) (obj));
    }

    public void a()
    {
        c.execute(new Runnable() {

            final bj a;

            public void run()
            {
                a.b();
            }

            
            {
                a = bj.this;
                super();
            }
        });
    }

    public void a(com.google.android.gms.internal.zzmi.zza zza)
    {
        c.execute(new Runnable(zza) {

            final com.google.android.gms.internal.zzmi.zza a;
            final bj b;

            public void run()
            {
                b.b(a);
            }

            
            {
                b = bj.this;
                a = zza;
                super();
            }
        });
    }

    public void a(zzbf zzbf1)
    {
        d = zzbf1;
    }

    void b()
    {
        Object obj;
        if (d == null)
        {
            throw new IllegalStateException("Callback must be set before execute");
        }
        d.a();
        zzbg.zzam("Attempting to load resource from disk");
        if ((ax.a().b() == ax.a.b || ax.a().b() == ax.a.c) && b.equals(ax.a().d()))
        {
            d.a(zzbf.zza.zzaDU);
            return;
        }
        Object obj1;
        try
        {
            obj = new FileInputStream(c());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzaj("Failed to find the resource in the disk");
            d.a(zzbf.zza.zzaDU);
            return;
        }
        obj1 = new ByteArrayOutputStream();
        zzmq.zzc(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
        obj1 = com.google.android.gms.internal.zzmi.zza.zzo(((ByteArrayOutputStream) (obj1)).toByteArray());
        c(((com.google.android.gms.internal.zzmi.zza) (obj1)));
        d.a(obj1);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
_L1:
        zzbg.zzam("The Disk resource was successfully read.");
        return;
        Object obj2;
        obj2;
        d.a(zzbf.zza.zzaDV);
        zzbg.zzan("Failed to read the resource from disk");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        d.a(zzbf.zza.zzaDV);
        zzbg.zzan("Failed to read the resource from disk. The resource is inconsistent");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
        throw obj2;
    }

    boolean b(com.google.android.gms.internal.zzmi.zza zza)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = c();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzmi.zza zza)
        {
            zzbg.zzak("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(zzny.zzf(zza));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzmi.zza zza)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        zza;
        zzbg.zzan("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.zzmi.zza zza)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
            return false;
        }
        return false;
        zza;
        try
        {
            fileoutputstream.close();
        }
        catch (IOException ioexception)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
        }
        throw zza;
    }

    File c()
    {
        String s = (new StringBuilder()).append("resource_").append(b).toString();
        return new File(a.getDir("google_tagmanager", 0), s);
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        c.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
