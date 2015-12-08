// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzlz, zzvh, zzvm

public class zzvn
{

    public static final Integer zzaCx = Integer.valueOf(0);
    public static final Integer zzaCy = Integer.valueOf(1);
    private final Context mContext;
    private final ExecutorService zzazT;

    public zzvn(Context context)
    {
        this(context, Executors.newSingleThreadExecutor());
    }

    zzvn(Context context, ExecutorService executorservice)
    {
        mContext = context;
        zzazT = executorservice;
    }

    private String zzdF(String s)
    {
        return (new StringBuilder("resource_")).append(s).toString();
    }

    private byte[] zzf(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlz.zza(inputstream, bytearrayoutputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbf.zzac("Error closing stream for reading resource from disk");
            return null;
        }
_L2:
        return bytearrayoutputstream.toByteArray();
        IOException ioexception;
        ioexception;
        zzbf.zzac("Failed to read the resource from disk");
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbf.zzac("Error closing stream for reading resource from disk");
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            zzbf.zzac("Error closing stream for reading resource from disk");
            return null;
        }
        throw exception;
    }

    public void zza(String s, Integer integer, zzvh zzvh1, zzvm zzvm1)
    {
        zzazT.execute(new Runnable(s, integer, zzvh1, zzvm1) {

            final Integer zzaCA;
            final zzvh zzaCB;
            final zzvm zzaCC;
            final zzvn zzaCD;
            final String zzaCz;

            public void run()
            {
                zzaCD.zzb(zzaCz, zzaCA, zzaCB, zzaCC);
            }

            
            {
                zzaCD = zzvn.this;
                zzaCz = s;
                zzaCA = integer;
                zzaCB = zzvh1;
                zzaCC = zzvm1;
                super();
            }
        });
    }

    void zzb(String s, Integer integer, zzvh zzvh1, zzvm zzvm1)
    {
        zzbf.zzab("DiskLoader: Starting to load resource from Disk.");
        Object obj = zzvh1.zzn(zzf(new FileInputStream(zzdE(s))));
        if (obj != null)
        {
            try
            {
                zzbf.zzab((new StringBuilder("Saved resource loaded: ")).append(zzdF(s)).toString());
                zzvm1.zza(Status.zzNo, obj, zzaCy, zzdD(s));
                return;
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                zzbf.zzZ((new StringBuilder("Saved resource not found: ")).append(zzdF(s)).toString());
            }
            catch (zzvl.zzg zzg1)
            {
                zzbf.zzZ((new StringBuilder("Saved resource is corrupted: ")).append(zzdF(s)).toString());
            }
        }
        if (integer == null)
        {
            zzvm1.zza(Status.zzNq, null, null, 0L);
            return;
        }
        s = mContext.getResources().openRawResource(integer.intValue());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        s = ((String) (zzvh1.zzn(zzf(s))));
        if (s != null)
        {
            try
            {
                zzbf.zzab((new StringBuilder("Default resource loaded: ")).append(mContext.getResources().getResourceEntryName(integer.intValue())).toString());
                zzvm1.zza(Status.zzNo, s, zzaCx, 0L);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbf.zzZ((new StringBuilder("Default resource not found. ID: ")).append(integer).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzbf.zzZ((new StringBuilder("Default resource resource is corrupted: ")).append(integer).toString());
            }
        }
        zzvm1.zza(Status.zzNq, null, null, 0L);
        return;
    }

    public long zzdD(String s)
    {
        s = zzdE(s);
        if (s.exists())
        {
            return s.lastModified();
        } else
        {
            return 0L;
        }
    }

    File zzdE(String s)
    {
        return new File(mContext.getDir("google_tagmanager", 0), zzdF(s));
    }

    public void zzf(String s, byte abyte0[])
    {
        zzazT.execute(new Runnable(s, abyte0) {

            final byte zzGV[];
            final zzvn zzaCD;
            final String zzaCz;

            public void run()
            {
                zzaCD.zzg(zzaCz, zzGV);
            }

            
            {
                zzaCD = zzvn.this;
                zzaCz = s;
                zzGV = abyte0;
                super();
            }
        });
    }

    void zzg(String s, byte abyte0[])
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzdE(s);
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ("Error opening resource file for writing");
            return;
        }
        fileoutputstream.write(abyte0);
        try
        {
            fileoutputstream.close();
            zzbf.zzab((new StringBuilder("Resource ")).append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        zzbf.zzZ("Error writing resource to disk. Removing resource from disk");
        file.delete();
        try
        {
            fileoutputstream.close();
            zzbf.zzab((new StringBuilder("Resource ")).append(s).append(" saved on Disk.").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ("Error closing stream for writing resource to disk");
        }
        return;
        abyte0;
        try
        {
            fileoutputstream.close();
            zzbf.zzab((new StringBuilder("Resource ")).append(s).append(" saved on Disk.").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ("Error closing stream for writing resource to disk");
        }
        throw abyte0;
    }

}
