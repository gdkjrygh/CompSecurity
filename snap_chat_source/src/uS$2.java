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
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            DSnapPage dsnappage = (DSnapPage)list.next();
            if (dsnappage.n == MediaState.SUCCESS && dsnappage.b() != null && !a.c.g(dsnappage.b()))
            {
                Timber.d("EditionMediaLoader", "Resetting media state for %s because it is not in the cache %s", new Object[] {
                    dsnappage
                });
                flag |= a.b.a(dsnappage, MediaState.NOT_STARTED);
            }
        } while (true);
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
