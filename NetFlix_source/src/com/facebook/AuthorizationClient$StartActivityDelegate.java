// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AuthorizationClient

static interface 
{

    public abstract Activity getActivityContext();

    public abstract void startActivityForResult(Intent intent, int i);
}
