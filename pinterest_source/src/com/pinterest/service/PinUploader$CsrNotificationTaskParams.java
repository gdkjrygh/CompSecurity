// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.api.model.Pin;
import java.util.List;

// Referenced classes of package com.pinterest.service:
//            PinUploader

class domainPins
{

    public List domainPins;
    public Pin pin;
    final PinUploader this$0;

    public A(Pin pin1, List list)
    {
        this$0 = PinUploader.this;
        super();
        pin = pin1;
        domainPins = list;
    }
}
