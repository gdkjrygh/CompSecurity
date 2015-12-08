// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

final class eeo extends mtf
{

    private final int a;

    eeo(int i)
    {
        super("GetCardCountTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = (dus)olm.a(context, dus);
        Iterator iterator = context.a().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            dur dur1 = (dur)context.a((String)iterator.next());
            int j;
            try
            {
                j = dur1.a(a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return new mue(false);
            }
            i = j + i;
        }
        context = new mue(true);
        context.a().putInt("unread_card_num", i);
        context.a().putInt("account_id", a);
        return context;
    }
}
