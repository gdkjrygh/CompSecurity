// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.facebook.internal:
//            G, Y

public static final class b
{

    Context a;
    Uri b;
    public b c;
    public boolean d;
    public Object e;

    public (Context context, Uri uri)
    {
        Y.a(uri, "imageUri");
        a = context;
        b = uri;
    }
}
