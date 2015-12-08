// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            bl, at, ad

public final class ax
    implements IEventSubscriber
{

    final at a;

    public ax(at at1)
    {
        a = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (bl)obj;
        at.f(a).a(((bl) (obj)).a);
        at.i(a).sendBroadcast(at.h(a));
    }
}
