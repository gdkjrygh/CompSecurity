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
//            fn, bu

public class fp
    implements fn.a
{

    public fp()
    {
    }

    public bv.a a(fn fn1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return c(fn1, jsonobject);
    }

    public bu c(fn fn1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        Future future = fn1.a(jsonobject, "image", true);
        fn1 = fn1.a(jsonobject, "secondary_image", false);
        return new bu(jsonobject.getString("headline"), (Drawable)future.get(), jsonobject.getString("body"), (Drawable)fn1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("attribution"));
    }
}
