// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.os.Bundle;
import com.facebook.base.activity.i;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.orca.intents:
//            b

public class IntentHandlerActivity extends i
{

    public IntentHandlerActivity()
    {
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        ((b)i().a(com/facebook/orca/intents/b)).a(getIntent());
        finish();
    }
}
