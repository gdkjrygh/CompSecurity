// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class mpe
    implements omb, omz, opv
{

    private final mpg a;
    private mpd b;

    public mpe(opd opd1, mpg mpg)
    {
        a = mpg;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (mpd)olm1.b(mpd);
        ((omx)olm1.a(omx)).a(this);
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (b != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mpd mpd1 = b;
                mpg mpg = a;
                mpd1.a.add(mpg);
            }
            return;
        }
        mpd mpd2 = b;
        mpg mpg1 = a;
        mpd2.a.remove(mpg1);
    }
}
