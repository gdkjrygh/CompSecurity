// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Type

public interface b
{

    public abstract String a();

    public abstract JSONObject a(Context context)
        throws JSONException;

    public abstract void a(Context context, long l);

    public abstract Type b();
}
