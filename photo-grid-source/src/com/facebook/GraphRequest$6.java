// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.facebook:
//            GraphRequest

class val.keysAndValues
    implements yValueSerializer
{

    final GraphRequest this$0;
    final ArrayList val$keysAndValues;

    public void writeString(String s, String s1)
    {
        val$keysAndValues.add(String.format(Locale.US, "%s=%s", new Object[] {
            s, URLEncoder.encode(s1, "UTF-8")
        }));
    }

    yValueSerializer()
    {
        this$0 = final_graphrequest;
        val$keysAndValues = ArrayList.this;
        super();
    }
}
