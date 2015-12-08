// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

class AdMarvelCachedCleanupAdAsyncTask extends AsyncTask
{

    private final WeakReference contextReference;
    private final File storage;

    public AdMarvelCachedCleanupAdAsyncTask(Context context, File file)
    {
        contextReference = new WeakReference(context);
        storage = file;
    }

    void delete(File file)
        throws IOException
    {
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        afile = file.listFiles();
        j = afile.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        if (System.currentTimeMillis() - file.lastModified() > 0x278d00L)
        {
            file.delete();
        }
        return;
_L3:
        delete(afile[i]);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected transient Object doInBackground(Object aobj[])
    {
        if ((Context)contextReference.get() != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int j;
        if (!((File) (aobj = new File(storage, "/data/com.admarvel.android.admarvelcachedads/cachedads"))).exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        aobj = ((File) (aobj)).listFiles();
        j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            try
            {
                delete(((File) (aobj[i])));
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
