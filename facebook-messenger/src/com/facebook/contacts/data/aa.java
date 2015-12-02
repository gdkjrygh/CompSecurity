// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package com.facebook.contacts.data:
//            x

public final class aa
    implements BaseColumns
{

    public final Uri a;
    final x b;

    public aa(x x1)
    {
        b = x1;
        super();
        a = Uri.withAppendedPath(b.b, "favorites");
    }
}
