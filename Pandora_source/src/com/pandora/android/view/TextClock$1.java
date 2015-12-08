// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.pandora.android.view:
//            TextClock

class t> extends ContentObserver
{

    final TextClock a;

    public void onChange(boolean flag)
    {
        a.a(TextClock.a(a));
        TextClock.b(a);
    }

    public void onChange(boolean flag, Uri uri)
    {
        a.a(TextClock.a(a));
        TextClock.b(a);
    }

    (TextClock textclock, Handler handler)
    {
        a = textclock;
        super(handler);
    }
}
