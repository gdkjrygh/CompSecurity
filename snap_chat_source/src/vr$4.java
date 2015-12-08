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
        obj = (ChannelPage)obj;
        obj1 = (ChannelPage)obj1;
        return dI.a().a((Comparable)a.e.get(((ChannelPage) (obj)).a), (Comparable)a.e.get(((ChannelPage) (obj1)).a)).b();
    }

    >(vr vr1)
    {
        a = vr1;
        super();
    }
}
