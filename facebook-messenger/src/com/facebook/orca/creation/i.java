// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import com.facebook.orca.activity.d;
import com.facebook.orca.compose.ComposeFragment;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class i
    implements d
{

    final CreateThreadActivity a;

    i(CreateThreadActivity createthreadactivity)
    {
        a = createthreadactivity;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            CreateThreadActivity.e(a).a();
            a.finish();
        }
    }
}
