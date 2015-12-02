// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.b;

import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.ui.media.b:
//            c, d

class e extends d
{

    final c a;

    private e(c c)
    {
        a = c;
        super();
    }

    e(c c, com.facebook.ui.media.b.d d1)
    {
        this(c);
    }

    public com.facebook.ui.media.attachments.d a()
    {
        return new com.facebook.ui.media.attachments.d((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
