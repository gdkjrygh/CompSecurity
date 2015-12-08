// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties, CustomProperty

public static class Q
{

    private final Map Rf = new HashMap();

    public Q a(CustomPropertyKey custompropertykey, String s)
    {
        jx.b(custompropertykey, "key");
        Rf.put(custompropertykey, new CustomProperty(custompropertykey, s));
        return this;
    }

    public AppVisibleCustomProperties iW()
    {
        return new AppVisibleCustomProperties(Rf.values(), null);
    }

    public Q()
    {
    }
}
