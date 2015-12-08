// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.social.albumupload.impl.UploadSchedulerService;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

final class mrt
    implements mqw
{

    private final Context a;
    private final mrh b;

    public mrt(Context context)
    {
        a = context.getApplicationContext();
        b = (mrh)olm.a(context, mrh);
    }

    private mrm a(int i)
    {
        return new mrm(a, i);
    }

    public final int a(mqm mqm1)
    {
        int i = a(mqm1.a).a(mqm1);
        b.a(mqm1);
        return i;
    }

    public final long a(int i, String s, Collection collection, mqv mqv)
    {
        long l = a(i).a(s, collection);
        s = mqm.a(i, s, l);
        if (mqv != null)
        {
            a(mqv, ((mqm) (s)));
        }
        b.a(s);
        UploadSchedulerService.a(a, i);
        return l;
    }

    public final void a(mqv mqv, mqm mqm1)
    {
        mrh mrh1 = b;
        mrh1.a.add(new mre(mqv, mqm1));
        mrh1.b.execute(mrh1);
    }

    public final List b(mqm mqm1)
    {
        return a(mqm1.a).b(mqm1);
    }

    public final void b(mqv mqv, mqm mqm1)
    {
        b.a.remove(new mre(mqv, mqm1));
    }
}
