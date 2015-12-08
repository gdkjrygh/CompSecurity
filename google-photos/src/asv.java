// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import java.io.File;

final class asv
    implements asx
{

    asv()
    {
    }

    public final Class a()
    {
        return android/os/ParcelFileDescriptor;
    }

    public final Object a(File file)
    {
        return ParcelFileDescriptor.open(file, 0x10000000);
    }

    public final void a(Object obj)
    {
        ((ParcelFileDescriptor)obj).close();
    }
}
