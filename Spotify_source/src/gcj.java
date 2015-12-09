// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

public final class gcj
    implements an
{

    private static final String d[] = {
        "connected"
    };
    private Boolean a;
    private Context b;
    private gck c;

    public gcj(Context context, gck gck1)
    {
        b = context;
        c = gck1;
    }

    public final da a(Bundle bundle)
    {
        return new cu(b, dtw.a, d, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            boolean flag = gcw.a(((Cursor) (obj)), 0);
            if (a == null || a.booleanValue() != flag)
            {
                a = Boolean.valueOf(flag);
                c.d(a.booleanValue());
            }
        }
    }

}
