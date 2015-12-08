// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class dmq
    implements hqf
{

    private static final String b[] = {
        "dedup_key", "capture_timestamp", "protobuf"
    };
    final Context a;
    private final noz c;

    dmq(Context context)
    {
        a = context;
        c = noz.a(context, 3, "OnDeviceIndexSyncJob", new String[] {
            "perf"
        });
    }

    static Context a(dmq dmq1)
    {
        return dmq1.a;
    }

    static String[] b()
    {
        return b;
    }

    public final String a()
    {
        return "OnDeviceSearchIndexSyncJob";
    }

    public final void a(int i, hqo hqo)
    {
        gjr gjr1;
        if (gjr.a())
        {
            if ((gjr1 = (gjr)olm.a(a, gjr)).a(i))
            {
                long l = noy.a();
                long l1 = ((mmv)olm.a(a, mmv)).a(i).d("OnDeviceSearchIndexSyncJob").a("resume_capture_timestamp", 0L);
                if (c.a())
                {
                    Object obj;
                    if (l1 == 0L)
                    {
                        obj = "beginning";
                    } else
                    {
                        obj = Long.valueOf(l1);
                    }
                    obj = String.valueOf(obj);
                    (new StringBuilder(String.valueOf(obj).length() + 20)).append("Begin indexing from ").append(((String) (obj)));
                }
                hqo = new dmr(this, i, hqo, l1);
                b.a(500, hqo);
                if (((dmr) (hqo)).a)
                {
                    gjr1.a(i, false);
                    ((mmv)olm.a(a, mmv)).b(i).h("OnDeviceSearchIndexSyncJob").g("resume_capture_timestamp").d();
                }
                if (c.a())
                {
                    noy.a("indexed remote media entries", Integer.valueOf(((dmr) (hqo)).b));
                    noy.a("duration", l);
                    return;
                }
            }
        }
    }

}
