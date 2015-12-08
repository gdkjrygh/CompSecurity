// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    private uZ a;

    public final void a(List list)
    {
        list = list.iterator();
        boolean flag = false;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            DSnapPage dsnappage = (DSnapPage)list.next();
            if (a.c.a(dsnappage))
            {
                flag = a.b.b(dsnappage, MediaState.RESOLVE_NEEDED) | flag;
            }
        } while (true);
        if (flag)
        {
            a.a.b();
        }
    }

    >(uZ uz)
    {
        a = uz;
        super();
    }
}
