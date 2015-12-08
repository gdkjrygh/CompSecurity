// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.connect.ConnectManager;
import java.lang.ref.WeakReference;
import java.util.List;

final class fzh
    implements dkz
{

    private final WeakReference a;
    private fzg b;

    fzh(fzg fzg1, fzg fzg2)
    {
        b = fzg1;
        super();
        ctz.a(fzg2);
        a = new WeakReference(fzg2);
    }

    public final void a()
    {
    }

    public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
    {
        list = (fzg)ctz.a(a.get());
        if (list.q() && fzg.a(list))
        {
            if ((list = ((ConnectManager)fzg.b(list).f()).d()) != null)
            {
                fzg.a(b, list);
                return;
            }
        }
    }
}
