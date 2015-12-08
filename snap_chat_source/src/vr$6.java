// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.discover.model.ChannelPage;
import java.util.Comparator;

final class lang.Object
    implements Comparator
{

    private vr a;

    public final int compare(Object obj, Object obj1)
    {
        long l = 0L;
        obj = (ChannelPage)obj;
        obj1 = (ChannelPage)obj1;
        boolean flag = a.c.b(((ChannelPage) (obj)).d);
        boolean flag1 = a.c.b(((ChannelPage) (obj1)).d);
        long l1;
        if (flag && flag1)
        {
            l1 = a.c.c(((ChannelPage) (obj)).a);
            l = a.c.c(((ChannelPage) (obj1)).a);
        } else
        {
            l1 = 0L;
        }
        return dI.a().b(flag, flag1).a(l1, l).b();
    }

    >(vr vr1)
    {
        a = vr1;
        super();
    }
}
