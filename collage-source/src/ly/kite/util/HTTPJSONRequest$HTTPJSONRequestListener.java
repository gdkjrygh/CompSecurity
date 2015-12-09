// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.util;

import org.json.JSONObject;

// Referenced classes of package ly.kite.util:
//            HTTPJSONRequest

public static interface 
{

    public abstract void onError(Exception exception);

    public abstract void onSuccess(int i, JSONObject jsonobject);
}
