// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.database.table.CashFeedItemTable;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.CashUtils;
import com.squareup.otto.Bus;

public final class lang.Object
    implements lang.Object
{

    private ChatConversation a;
    private String b;
    private sl c;

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (Qh)obj;
        if (pi1.c() && obj != null)
        {
            pi1 = com.snapchat.android.model.ransaction.a.a(((Qh) (obj)));
            obj = a.e(b);
            pi1 = new CashFeedItem(pi1);
            obj = CashUtils.a(a, ((CashFeedItem) (obj)), pi1);
            if (obj != null)
            {
                if (a.mAmIPresent || CashUtils.a(a.mMyUsername, ((CashFeedItem) (obj))))
                {
                    sl.b(a, IA.a(obj));
                }
                CashFeedItemTable.a(SnapchatApplication.get(), IA.a(obj));
            }
            Mf.a().a(new Mp(a.mId));
            a.x();
        } else
        if (pi1.mResponseCode == 404)
        {
            obj = a.e(b);
            if (CashUtils.a(a, ((CashFeedItem) (obj)), null) != null)
            {
                Mf.a().a(new Mp(a.mId));
                a.x();
                return;
            }
        }
    }

    public >(sl sl1, ChatConversation chatconversation, String s)
    {
        c = sl1;
        a = chatconversation;
        b = s;
        super();
    }
}
