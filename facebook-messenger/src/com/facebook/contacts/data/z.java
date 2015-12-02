// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.net.Uri;

// Referenced classes of package com.facebook.contacts.data:
//            y, x

public final class z
    implements y
{

    public final Uri a;
    final x b;

    public z(x x1)
    {
        b = x1;
        super();
        a = Uri.withAppendedPath(b.b, "contacts_with_fbids");
    }
}
