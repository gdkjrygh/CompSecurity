// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ak

final class al extends ak
{

    al(String s, Boolean boolean1)
    {
        super(s, boolean1, (byte)0);
    }

    public final Object a(Bundle bundle)
    {
        return Boolean.valueOf(bundle.getBoolean(a(), ((Boolean)b()).booleanValue()));
    }
}
