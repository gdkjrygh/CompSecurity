// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.error;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.error:
//            ErrorResponse

public final class TopLevelErrorResponse extends FastMapJsonResponse
{

    private static final HashMap sFields;
    final HashMap mConcreteTypes = new HashMap();

    public TopLevelErrorResponse()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("error", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("error", com/google/android/gms/common/server/error/ErrorResponse));
    }
}
