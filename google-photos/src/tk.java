// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class tk
    implements wk
{

    private td a;

    tk(td td1)
    {
        a = td1;
        super();
    }

    public final void a(vu vu, boolean flag)
    {
        a.b(vu);
    }

    public final boolean a_(vu vu)
    {
        android.view.Window.Callback callback = ((sv) (a)).b.getCallback();
        if (callback != null)
        {
            callback.onMenuOpened(108, vu);
        }
        return true;
    }
}
