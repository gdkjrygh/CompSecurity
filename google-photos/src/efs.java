// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class efs extends mtf
{

    private final int a;
    private final String b;
    private final mhe c;

    efs(String s, int i, mhe mhe1)
    {
        super("com.google.android.apps.photos.autobackup.UpdateAutoBackupMediaStateTask");
        a = i;
        b = s;
        c = mhe1;
        super.i = muf.a;
    }

    protected final mue a(Context context)
    {
        if (!c.c())
        {
            return new mue(true);
        } else
        {
            ega ega1 = (ega)olm.a(context, ega);
            context = ((eto)olm.a(context, eto)).d(a);
            ega1.a(c, b, a, context, 3);
            return new mue(true);
        }
    }
}
