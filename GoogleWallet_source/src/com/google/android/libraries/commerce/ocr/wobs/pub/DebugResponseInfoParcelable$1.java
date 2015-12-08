// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;

import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Function;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.pub:
//            DebugResponseInfoParcelable

final class this._cls0
    implements Function
{

    final DebugResponseInfoParcelable this$0;

    private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.foParcelable._cls1 _pcls1)
    {
        return new RecognizedWobInstanceParcelable(_pcls1);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.foParcelable._cls1.apply)obj);
    }

    able()
    {
        this$0 = DebugResponseInfoParcelable.this;
        super();
    }
}
