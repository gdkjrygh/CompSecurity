// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.domain.payment.LineItem;
import me.lyft.android.infrastructure.lyft.payment.LineItemDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.driver:
//            ExpressPay

final class .LineItemDTO
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((LineItemDTO)obj);
    }

    public LineItem call(LineItemDTO lineitemdto)
    {
        return LineItem.fromDTO(lineitemdto);
    }

    .LineItemDTO()
    {
    }
}
