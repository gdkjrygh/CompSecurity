// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class eef
    implements omb, omz, opv
{

    List a;
    private omx b;
    private mtj c;

    public eef(opd opd1)
    {
        opd1.a(this);
    }

    void a()
    {
        if (a != null && b.a)
        {
            c.a(new eeg(a));
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mtj)olm1.a(mtj);
        b = (omx)olm1.a(omx);
        b.a(this);
    }

    public final void a(boolean flag)
    {
        a();
    }
}
