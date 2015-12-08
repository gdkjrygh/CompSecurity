// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.discover.model.ChannelPage;
import java.util.Comparator;
import java.util.Map;

final class lang.Object
    implements Comparator
{

    private vr a;

    public final int compare(Object obj, Object obj1)
    {
        int j = -1;
        obj = (ChannelPage)obj;
        obj1 = (ChannelPage)obj1;
        int i;
        boolean flag;
        boolean flag1;
        if (a.d.containsKey(((ChannelPage) (obj)).a))
        {
            i = ((Integer)a.d.get(((ChannelPage) (obj)).a)).intValue();
        } else
        {
            i = -1;
        }
        if (a.d.containsKey(((ChannelPage) (obj1)).a))
        {
            j = ((Integer)a.d.get(((ChannelPage) (obj1)).a)).intValue();
        }
        obj = dI.a();
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return ((dI) (obj)).a(flag, flag1).a(i, j).b();
    }

    >(vr vr1)
    {
        a = vr1;
        super();
    }
}
