// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties, CustomProperty

public static final class 
{

    public final Map mProperties = new HashMap();

    public final  add(CustomPropertyKey custompropertykey, String s)
    {
        Preconditions.checkNotNull(custompropertykey, "key");
        mProperties.put(custompropertykey, new CustomProperty(custompropertykey, s));
        return this;
    }

    public final AppVisibleCustomProperties build()
    {
        return new AppVisibleCustomProperties(mProperties.values(), (byte)0);
    }

    public ()
    {
    }
}
