// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class dhd
    implements opl, opv
{

    private final rz a;

    dhd(rz rz1, opd opd1)
    {
        a = rz1;
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        try
        {
            a.getMenuInflater();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
    }
}
