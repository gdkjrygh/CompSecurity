// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.text.TextUtils;
import com.skype.Account;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.CompletableFuture;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.res.ChatText;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.util.cache:
//            SpannedStringCache

public class ContactMoodCache
{

    private SpannedStringCache a;
    private ChatText b;
    private AsyncService c;

    public ContactMoodCache(SpannedStringCache spannedstringcache, ChatText chattext, AsyncService asyncservice)
    {
        a = spannedstringcache;
        b = chattext;
        c = asyncservice;
    }

    static CharSequence a(ContactMoodCache contactmoodcache, int i, String s, String s1, int j)
    {
        return contactmoodcache.b(i, s, s1, j);
    }

    private CharSequence b(int i, String s, String s1, int j)
    {
        if (TextUtils.isEmpty(s))
        {
            s = b.a(s1);
        } else
        {
            s = b.a(s, Integer.valueOf(0));
        }
        a.a(i, j, s);
        return s;
    }

    public final CharSequence a(int i, String s, String s1, int j)
    {
        SpannedStringCache.a a1 = a.a(i);
        if (a1 != null && s1.equals(a1.c.toString()))
        {
            return a1.c;
        } else
        {
            return b(i, s, s1, j);
        }
    }

    public final CharSequence a(Account account)
    {
        SpannedStringCache.a a1 = a.a(account.getObjectID());
        if (a1 != null && (long)account.getMoodTimestampProp() == a1.b)
        {
            return a1.c;
        } else
        {
            return b(account.getObjectID(), account.getRichMoodTextProp(), account.getMoodTextProp(), account.getMoodTimestampProp());
        }
    }

    public final Future a(int i, String s, String s1, int j, Object obj, AsyncCallback asynccallback)
    {
        SpannedStringCache.a a1 = a.a(i);
        if (a1 == null || !s1.equals(a1.c.toString()))
        {
            a1 = null;
        }
        if (a1 != null)
        {
            if (asynccallback != null)
            {
                asynccallback.done(new CompletedAsyncResult(a1.c, obj));
            }
            return CompletableFuture.completedFuture(a1.c);
        } else
        {
            s = new Callable(i, s, s1, j) {

                final int a;
                final String b;
                final String c;
                final int d;
                final ContactMoodCache e;

                public final Object call()
                    throws Exception
                {
                    return ContactMoodCache.a(e, a, b, c, d);
                }

            
            {
                e = ContactMoodCache.this;
                a = i;
                b = s;
                c = s1;
                d = j;
                super();
            }
            };
            return c.a(s, obj, asynccallback);
        }
    }

    public final void a(int i)
    {
        a.b(i);
    }
}
