// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ListView;

// Referenced classes of package kik.android.chat.fragment:
//            od, KikPromotedChatsFragment

final class oe
    implements Runnable
{

    final od a;

    oe(od od1)
    {
        a = od1;
        super();
    }

    public final void run()
    {
        a.a._contactsList.invalidateViews();
    }
}
