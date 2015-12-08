// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    private uS a;

    public final void a(List list)
    {
        list = list.iterator();
        boolean flag = false;
        while (list.hasNext()) 
        {
            DSnapPage dsnappage = (DSnapPage)list.next();
            boolean flag1 = flag;
            if (dsnappage.o.isError())
            {
                Timber.c("EditionMediaLoader", "Resetting placeholder state for %s because it was in error state %s", new Object[] {
                    dsnappage, dsnappage.o.name()
                });
                flag1 = flag | a.b.b(dsnappage, MediaState.NOT_STARTED);
            }
            if (dsnappage.n.isError())
            {
                Timber.c("EditionMediaLoader", "Resetting media state for %s because it was in error state %s", new Object[] {
                    dsnappage, dsnappage.n.name()
                });
                flag = a.b.a(dsnappage, MediaState.NOT_STARTED) | flag1;
            } else
            {
                flag = flag1;
            }
        }
        if (flag)
        {
            a.a.b();
        }
    }

    >(uS us)
    {
        a = us;
        super();
    }
}
