// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;

final class gsy
    implements mpj
{

    private gsw a;

    gsy(gsw gsw1)
    {
        a = gsw1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1)
        {
            return;
        } else
        {
            gsw.b(a).finish();
            return;
        }
    }
}
