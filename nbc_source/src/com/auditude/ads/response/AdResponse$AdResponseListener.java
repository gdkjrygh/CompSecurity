// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.response:
//            AdResponse

public static interface 
{

    public abstract void onRequestComplete(ArrayList arraylist);

    public abstract void onRequestFailed(Throwable throwable);
}
