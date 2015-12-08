// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.database.DataSetObserver;

// Referenced classes of package kik.android:
//            ah

final class ai extends DataSetObserver
{

    final ah a;

    ai(ah ah1)
    {
        a = ah1;
        super();
    }

    public final void onChanged()
    {
        ah.a(a);
    }

    public final void onInvalidated()
    {
        ah.b(a);
    }
}
