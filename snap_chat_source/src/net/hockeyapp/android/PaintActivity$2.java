// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.hockeyapp.android:
//            PaintActivity

final class a extends AsyncTask
{

    private Bitmap a;

    private transient Void a(File afile[])
    {
        try
        {
            afile = new FileOutputStream(afile[0]);
            a.compress(android.graphics.ormat.JPEG, 100, afile);
            afile.close();
        }
        // Misplaced declaration of an exception variable
        catch (File afile[])
        {
            afile.printStackTrace();
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((File[])aobj);
    }

    (Bitmap bitmap)
    {
        a = bitmap;
        super();
    }
}
