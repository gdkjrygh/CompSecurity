// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.List;

final class g.Object
    implements ebg
{

    private l.List a;

    public final void a(Throwable throwable)
    {
        Logger.b(throwable, "Could not load %s", new Object[] {
            a.a.parentId
        });
    }

    public final void a(List list)
    {
        egu egu1 = ehe.a(a.a);
        int j = a.a;
        int k = a.a.offset;
        int i;
        if (a.a.limit == null)
        {
            i = 20;
        } else
        {
            i = a.a.limit.intValue();
        }
        egu1.a(j, ehe.a(list, k, i));
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class ehe$3

/* anonymous class */
    final class ehe._cls3
        implements Runnable
    {

        final com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest a;
        final int b;
        final ehe c;

        public final void run()
        {
            ehe.b(c).a.a(a.parentId, new ehe._cls3._cls1(this));
        }

            
            {
                c = ehe1;
                a = childrenpagerequest;
                b = i;
                super();
            }
    }

}
