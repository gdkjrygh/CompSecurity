// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;

// Referenced classes of package com.facebook:
//            Session

public class LegacyHelper
{

    public LegacyHelper()
    {
    }

    public static void extendTokenCompleted(Session session, Bundle bundle)
    {
        session.extendTokenCompleted(bundle);
    }
}
