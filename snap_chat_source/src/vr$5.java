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
        boolean flag1 = true;
        obj = (ChannelPage)obj;
        obj1 = (ChannelPage)obj1;
        vq vq = a.a.a(((ChannelPage) (obj)).a);
        vq vq1 = a.a.a(((ChannelPage) (obj1)).a);
        dI di = dI.a().a(((ChannelPage) (obj)).j, ((ChannelPage) (obj1)).j).a(obj, obj1, a.h);
        boolean flag;
        if (((ChannelPage) (obj)).f >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((ChannelPage) (obj1)).f < 0)
        {
            flag1 = false;
        }
        return di.a(flag, flag1).a(((ChannelPage) (obj)).f, ((ChannelPage) (obj1)).f).a(vq, vq1, eu.a(a.f).c()).a(obj, obj1, a.g).a(((ChannelPage) (obj)).e, ((ChannelPage) (obj1)).e).b();
    }

    >(vr vr1)
    {
        a = vr1;
        super();
    }
}
