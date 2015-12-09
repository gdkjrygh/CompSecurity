// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;

final class ang.Object
    implements an
{

    private final String a[] = {
        "connected", "can_stream"
    };
    private goq b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
label0:
        {
            boolean flag1 = true;
            obj = (Cursor)obj;
            if (((Cursor) (obj)).moveToFirst())
            {
                boolean flag3 = gcw.a(((Cursor) (obj)), 0);
                boolean flag2 = gcw.a(((Cursor) (obj)), 1);
                obj = b;
                boolean flag;
                if (flag3 && flag2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                goq.a(((goq) (obj)), flag);
                b.k().q_();
                obj = goq.c(b);
                if (!flag3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((ContentViewManager) (obj)).a(flag);
                obj = goq.c(b);
                if (!flag2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                ((ContentViewManager) (obj)).b(flag);
                if (!goq.d(b))
                {
                    break label0;
                }
                goq.e(b).a();
            }
            return;
        }
        goq.e(b).b();
    }

    (goq goq1)
    {
        b = goq1;
        super();
    }
}
