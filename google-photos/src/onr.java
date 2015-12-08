// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

final class onr
    implements onl
{

    onr()
    {
    }

    public static void b(Context context)
    {
        (new File(context.getFilesDir(), "corrupted_install")).delete();
    }

    public final File a(Context context)
    {
        return new File(context.getFilesDir(), "corrupted_install");
    }

    public final Object a()
    {
        return "corrupted-install";
    }

    public final boolean a(Throwable throwable)
    {
        return throwable instanceof UnsatisfiedLinkError;
    }

    public final al b()
    {
        return new onu();
    }
}
