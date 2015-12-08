// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.reflect.TypeToken;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class rv
{
    public static final class a
    {

        public boolean a;
        List b;

        public final String toString()
        {
            return (new StringBuilder("HistoryEntry{success=")).append(a).append(", messages=").append(b).append('}').toString();
        }

        protected a()
        {
            a = true;
            b = new ArrayList();
        }
    }


    private static final Type c = (new TypeToken() {

    }).getType();
    Iu a;
    public LinkedHashMap b;

    public rv()
    {
        SnapchatApplication.getDIComponent().a(this);
        b = a(Bt.bp());
        Timber.c("TranscodingHistory", "Transcoding history restored: %s", new Object[] {
            toString()
        });
    }

    private LinkedHashMap a(String s)
    {
        Object obj;
        try
        {
            s = (LinkedHashMap)a.a(s, c);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.a("TranscodingHistory", s);
            s = null;
        }
        obj = s;
        if (s == null)
        {
            obj = new LinkedHashMap();
        }
        return ((LinkedHashMap) (obj));
    }

    public final void a(String s, boolean flag, String s1)
    {
        a a2 = (a)b.get(s);
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
        }
        a1.a = flag;
        a1.b.add(s1);
        b.put(s, a1);
        if (b != null)
        {
            s = b.keySet().iterator();
            for (int i = b.size() - 10; i > 0 && s.hasNext(); i--)
            {
                s1 = (String)s.next();
                b.remove(s1);
            }

        }
        Timber.c("TranscodingHistory", "Transcoding history stored: %s", new Object[] {
            toString()
        });
        Bt.s(toString());
    }

    public final String toString()
    {
        String s;
        try
        {
            s = a.a(b, c);
        }
        catch (Exception exception)
        {
            Timber.a("TranscodingHistory", exception);
            return null;
        }
        return s;
    }

}
