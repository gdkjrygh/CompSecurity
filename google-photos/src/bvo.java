// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.RectF;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

final class bvo
    implements cvf
{

    private File a;
    private bvm b;

    bvo(bvm bvm1, File file)
    {
        b = bvm1;
        a = file;
        super();
    }

    public final void a()
    {
    }

    public final void a(int i, boolean flag)
    {
    }

    public final void a(long l)
    {
    }

    public final void a(long l, RectF rectf)
    {
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        FileOutputStream fileoutputstream = null;
        FileOutputStream fileoutputstream1 = bvm.a(b, a);
        fileoutputstream = fileoutputstream1;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, fileoutputstream1);
        if (fileoutputstream1 == null) goto _L1; else goto _L3
_L3:
        try
        {
            fileoutputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return;
        }
        bitmap;
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (IOException ioexception) { }
        }
        throw bitmap;
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    public final void d()
    {
    }
}
