// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Pair;
import com.snapchat.android.Timber;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements Runnable
{

    private Pair a;
    private xm b;

    public final void run()
    {
        xm xm1 = b;
        Pair pair = a;
        Iterator iterator = xm1.c.iterator();
        int i;
        for (i = 0; iterator.hasNext() && !TextUtils.equals(((ChatFeedItem)iterator.next()).d(), (CharSequence)pair.first); i++) { }
        Timber.f("ChatListManager", "Scrolling to position: %d. item id: %s. offset: %d. items count: %d.", new Object[] {
            Integer.valueOf(i), pair.first, pair.second, Integer.valueOf(xm1.c.size())
        });
        xm1.d.a(i, ((Integer)pair.second).intValue());
        xm1.b.c();
    }

    >(xm xm1, Pair pair)
    {
        b = xm1;
        a = pair;
        super();
    }
}
