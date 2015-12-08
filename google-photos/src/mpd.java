// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class mpd
    implements onz, ooa, oob, opv
{

    List a;
    private boolean b;

    public mpd(opd opd1)
    {
        a = new ArrayList();
        opd1.a(this);
    }

    public final void a()
    {
        b = false;
    }

    public final boolean a(KeyEvent keyevent)
    {
label0:
        {
            if (!b || keyevent.getKeyCode() != 4 || keyevent.getAction() != 1)
            {
                break label0;
            }
            keyevent = a.iterator();
            do
            {
                if (!keyevent.hasNext())
                {
                    break label0;
                }
            } while (!((mpg)keyevent.next()).s());
            return true;
        }
        return false;
    }

    public final void c()
    {
        b = true;
    }
}
