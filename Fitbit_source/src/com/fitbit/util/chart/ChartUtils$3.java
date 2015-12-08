// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.fitbit.util.format.e;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

// Referenced classes of package com.fitbit.util.chart:
//            a

static final class  extends Format
{

    private static final long serialVersionUID = 1L;

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return stringbuffer.append(e.a(((Double)obj).doubleValue()));
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        return null;
    }

    ()
    {
    }
}
