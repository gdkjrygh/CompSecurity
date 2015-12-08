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
//            fo, bp

public class fq
    implements fo.a
{

    public fq()
    {
    }

    public bq.a a(fo fo1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return c(fo1, jsonobject);
    }

    public bp c(fo fo1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        Future future = fo1.a(jsonobject, "image", true);
        fo1 = fo1.a(jsonobject, "secondary_image", false);
        return new bp(jsonobject.getString("headline"), (Drawable)future.get(), jsonobject.getString("body"), (Drawable)fo1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("attribution"));
    }
}
