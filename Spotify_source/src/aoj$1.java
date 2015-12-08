// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

public final class 
    implements aok
{

    public final void a(Object obj, File file)
    {
        obj = (Bitmap)obj;
        file = new FileOutputStream(file);
        ((Bitmap) (obj)).compress(android.graphics..CompressFormat.JPEG, 100, file);
        arp.a(file);
        return;
        obj;
        arp.a(file);
        throw obj;
    }

    public ()
    {
    }
}
