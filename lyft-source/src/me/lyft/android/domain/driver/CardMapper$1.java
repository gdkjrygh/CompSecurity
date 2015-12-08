// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.infrastructure.lyft.driver.DialDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            CardMapper, Dial

final class DialDTO
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((DialDTO)obj);
    }

    public Dial call(DialDTO dialdto)
    {
        return Dial.fromDto(dialdto);
    }

    DialDTO()
    {
    }
}
