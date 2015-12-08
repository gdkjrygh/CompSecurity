// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;

final class eof
    implements mpj
{

    private eod a;

    eof(eod eod1)
    {
        a = eod1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1)
        {
            ar ar = a.O_();
            ar.setResult(i, intent);
            ar.finish();
        }
    }
}
