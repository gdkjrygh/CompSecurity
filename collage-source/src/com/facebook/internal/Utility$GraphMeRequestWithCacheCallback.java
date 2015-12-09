// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility

public static interface 
{

    public abstract void onFailure(FacebookException facebookexception);

    public abstract void onSuccess(JSONObject jsonobject);
}
