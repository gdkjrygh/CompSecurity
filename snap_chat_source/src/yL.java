// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.FriendSectionizer;
import java.util.Collections;
import java.util.List;

public class yL extends yI
{

    private static final String b = yL.getSimpleName();

    public yL(FriendManager friendmanager)
    {
        super(friendmanager);
    }

    public final FriendSectionizer a()
    {
        return new com.snapchat.android.util.FriendSectionizer.e();
    }

    public final void a(List list)
    {
        b(list);
    }

    public final FriendSectionizer b()
    {
        return new com.snapchat.android.util.FriendSectionizer.e();
    }

    public final void b(List list)
    {
        list.clear();
        list.addAll(a.l());
        Collections.sort(list);
        if (list.size() == 0)
        {
            Timber.c(b, (new StringBuilder("user ")).append(Bt.q()).append(" has no non-Snapchatter contacts.").toString(), new Object[0]);
        }
    }

}
