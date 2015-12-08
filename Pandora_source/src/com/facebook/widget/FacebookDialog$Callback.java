// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static interface ll
{

    public abstract void onComplete(ll ll, Bundle bundle);

    public abstract void onError(ll ll, Exception exception, Bundle bundle);
}
