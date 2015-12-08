// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class ivy
    implements mti, omb, opl, opv
{

    private static final ekk b = (new ekm()).b(ivu).a();
    private static final String c;
    public boolean a;
    private mtj d;
    private ejz e;
    private noz f;

    public ivy(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((mtj)olm1.a(mtj)).a(this);
        e = (ejz)olm1.b(ejz);
        f = noz.a(context, "TimeMachineShare", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (e == null)
        {
            bundle = null;
        } else
        {
            bundle = e.b();
        }
        if (bundle != null)
        {
            d.a(new elc(bundle, b, b.Be));
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            if (c.equals(s))
            {
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                if (f.a())
                {
                    noy.a("taskResult", mue1);
                }
            }
            return;
        }
        boolean flag;
        if (((ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection")).b(ivu) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    static 
    {
        c = elc.a(b.Be);
    }
}
