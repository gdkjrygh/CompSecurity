// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;

public final class imn extends mtf
{

    private final Uri a;
    private final boolean b;
    private final boolean c;
    private final boolean j;

    imn(Uri uri, boolean flag, boolean flag1, boolean flag2)
    {
        super("StorageLookupTask");
        a = uri;
        b = flag;
        c = flag1;
        j = flag2;
    }

    protected final mue a(Context context)
    {
        try
        {
            izs izs1 = (izs)olm.a(context, izs);
            imp imp1 = new imp();
            if (b)
            {
                imp1.a = b.a(context, a);
            }
            if (c)
            {
                b.v();
                context = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long l = context.getAvailableBlocks();
                imp1.b = (long)context.getBlockSize() * l;
            }
            if (j)
            {
                imp1.c = izs1.b();
            }
            context = new mue(true);
            context.a().putLong("file_size", imp1.a);
            context.a().putLong("available_data", imp1.b);
            context.a().putLong("trash_size", imp1.c);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }
}
