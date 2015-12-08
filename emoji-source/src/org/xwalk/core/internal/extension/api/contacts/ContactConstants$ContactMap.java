// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.util.Pair;
import java.util.Map;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactConstants

public static class mTypeValueMap
{

    public Map mDataMap;
    public String mMimeType;
    public String mName;
    public Map mTypeMap;
    public Map mTypeValueMap;

    public (String s, Map map, Map map1, Map map2)
    {
        mName = s;
        mMimeType = (String)((Pair)ContactConstants.contactDataMap.get(s)).second;
        mDataMap = map;
        mTypeMap = map1;
        mTypeValueMap = map2;
    }
}
