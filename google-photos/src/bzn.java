// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;
import android.text.format.DateFormat;
import java.io.File;
import java.util.Date;

final class bzn
    implements cad
{

    bzn()
    {
    }

    public final String a(Context context)
    {
        return (new File(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), context.getString(c.af)), String.format(context.getString(c.bm), new Object[] {
            DateFormat.format(context.getString(c.bl), new Date())
        }))).getAbsolutePath();
    }
}
