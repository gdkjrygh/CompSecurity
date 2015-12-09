// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.error;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.error:
//            ErrorInstanceResponse

public class ErrorResponse extends FastMapJsonResponse
{

    private static final HashMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public ErrorResponse()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public ArrayList getErrors()
    {
        return (ArrayList)mConcreteTypeArrays.get("errors");
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("errors", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("errors", com/google/android/gms/common/server/error/ErrorInstanceResponse));
        sFields.put("code", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("code"));
    }
}
