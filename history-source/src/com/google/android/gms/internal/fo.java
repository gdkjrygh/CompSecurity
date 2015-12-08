// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fn, bt

public class fo
    implements fn.a
{

    public fo()
    {
    }

    public bv.a a(fn fn1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return b(fn1, jsonobject);
    }

    public bt b(fn fn1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        Future future = fn1.a(jsonobject, "image", true);
        fn1 = fn1.a(jsonobject, "app_icon", true);
        return new bt(jsonobject.getString("headline"), (Drawable)future.get(), jsonobject.getString("body"), (Drawable)fn1.get(), jsonobject.getString("call_to_action"), jsonobject.optDouble("rating", -1D), jsonobject.optString("store"), jsonobject.optString("price"));
    }
}
