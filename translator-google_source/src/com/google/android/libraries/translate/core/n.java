// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.content.Context;
import android.support.v4.d.f;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.ah;
import com.google.android.libraries.translate.offline.o;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.translate.core:
//            Singleton, k, l, TwsResponseException, 
//            r, q, p, o, 
//            m

public final class n
{

    final AtomicBoolean a = new AtomicBoolean(false);
    final f b = new f(200);
    final o c;
    private final Context d = Singleton.a();
    private r e;
    private l f;

    public n()
    {
        c = (o)Singleton.c.b();
        Singleton.b().b();
        f = new l();
    }

    private m a(String s, Language language, Language language1, String s1)
    {
        language = language.getShortName();
        language1 = language1.getShortName();
        boolean flag;
        try
        {
            flag = c.a(language, language1);
            if (!com.google.android.libraries.translate.e.o.b(d))
            {
                break MISSING_BLOCK_LABEL_55;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Singleton.b().a(-5, s.getMessage());
            return null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        return a(s, ((String) (language)), ((String) (language1)), s1);
        return l.a(s, language, language1, s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        return ah.a(c, s, language, language1, s1);
        throw new TwsResponseException(language, language1, -2);
    }

    private m a(String s, String s1, String s2, String s3)
    {
        if (!a.get()) goto _L2; else goto _L1
_L1:
        int j = 300;
        int i = 0;
_L8:
        this;
        JVM INSTR monitorenter ;
        q q1;
        if (e != null)
        {
            e.cancel(true);
        }
        e = new r(this);
        e.a(new String[] {
            s, s1, s2, s3
        });
        q1 = new q(this, i);
        q1.a(new String[] {
            s, s1, s2, s3
        });
        this;
        JVM INSTR monitorexit ;
        s = e.a(j);
        if (s == null) goto _L4; else goto _L3
_L3:
        q1.cancel(true);
        a.set(false);
_L6:
        return s;
_L2:
        j = 5000;
        i = 4000;
        continue; /* Loop/switch isn't completed */
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        s1 = q1.a(-1L);
        s = s1;
        if (s1 == null) goto _L6; else goto _L5
_L5:
        a.set(true);
        return s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append(':').append(s1).append(':').append(s2).toString();
    }

    public final m a(String s, Language language, Language language1, String s1, boolean flag)
    {
        Object obj;
        p p1;
        obj = a(s, language.getShortName(), language1.getShortName());
        p1 = (p)b.a(obj);
        if (p1 == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        if (p1.b + 0x927c0L > System.currentTimeMillis())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L2; else goto _L3
_L3:
        p1.b = System.currentTimeMillis();
        e e1 = Singleton.b();
        if (flag)
        {
            obj = Event.CACHE_HIT_INSTANT;
        } else
        {
            obj = Event.CACHE_HIT_ONLINE;
        }
        e1.a(((Event) (obj)), language.getShortName(), language1.getShortName(), s1);
        if (!flag && com.google.android.libraries.translate.e.o.b(d))
        {
            (new com.google.android.libraries.translate.core.o(this, s, language, language1, s1)).a(new Void[0]);
        }
        s = p1.a;
_L5:
        return s;
_L2:
        b.b(obj);
        s1 = a(s, language, language1, s1);
        if (s1 != null)
        {
            s = s1;
            if (!s1.a())
            {
                b.a(obj, new p(s1));
                return s1;
            }
        } else
        {
            throw new TwsResponseException(language.getShortName(), language1.getShortName(), -1);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
