// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.support.v4.d.f;
import android.text.TextUtils;
import com.google.android.apps.translatedecoder.decoder.DecoderOutput;
import com.google.android.apps.translatedecoder.decoder.g;
import com.google.android.apps.translatedecoder.decoder.j;
import com.google.android.apps.translatedecoder.decoder.k;
import com.google.android.apps.translatedecoder.util.HashMapBasedSymbol;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.core.n;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ai, e, OfflineTranslationException, o

public final class ah
{

    private static final f a = new f(4);
    private static final f b = new f(20);

    private static g a(ai ai1, com.google.android.libraries.translate.offline.e e1, String s, String s1)
    {
        String s2;
        Object obj;
        s2 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(" ").append(s1).toString();
        obj = (g)a.a(s2);
        if (obj != null)
        {
            return ((g) (obj));
        }
        Object obj1;
        char c1;
        boolean flag;
        try
        {
            obj = new b(ai1.o());
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.libraries.translate.offline.e e1)
        {
            try
            {
                throw new OfflineTranslationException(s, s1, -5001, "config", ai1.b(), ai1.c());
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.libraries.translate.offline.e e1)
            {
                Singleton.b().a(-5002, e1.getMessage(), s, s1, ai1.b(), ai1.c());
            }
            return null;
        }
        obj1 = new b(ai1.h(s, s1));
        obj.l = ((b) (obj1)).l;
        obj.q = ((b) (obj1)).q;
        obj.A = ((b) (obj1)).A;
        obj.E = ((b) (obj1)).E;
        obj.C = ((b) (obj1)).C;
        obj.B = ((b) (obj1)).B;
        obj.c = s;
        obj.d = s1;
        if (g.a(s1))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        flag = g.a(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        com.google.android.apps.translatedecoder.decoder.b.a(ai1.b(s, s1), ai1.c(s, s1), ai1.d(s, s1), ai1.e(s, s1));
_L15:
        if (g.b(s1))
        {
            obj.z = ai1.q();
        }
        obj.g = ai1.g(s, s1);
        obj.i = ai1.i(s, s1);
        obj.k = ai1.b(s1);
        obj.b = ai1.p();
        obj1 = ai1.f(s, s1);
        if (!e1.a(((String) (obj1)))) goto _L2; else goto _L1
_L1:
        obj.s = ((String) (obj1));
_L9:
        e1 = Integer.valueOf(ai1.b());
        if (e1.intValue() <= 2) goto _L4; else goto _L3
_L3:
        obj.x = ai1.k(s, s1);
        obj.y = ai1.j(s, s1);
_L10:
        if (e1.intValue() <= 3) goto _L6; else goto _L5
_L5:
        obj.F = "2";
_L11:
        e1 = String.valueOf(e1.toString());
        int i = ai1.c();
        obj.w = (new StringBuilder(String.valueOf(e1).length() + 12)).append(e1).append(".").append(i).toString();
        ai1.i(s, s1);
        e1 = new HashMapBasedSymbol();
        if (((b) (obj)).f)
        {
            e1 = SymbolTable.readFromFile(((b) (obj)).g);
        }
        obj = new g(((b) (obj)), e1);
        obj1 = ((g) (obj)).a();
        e1 = null;
        c1 = '\0';
        if (((DecoderOutput) (obj1)).h.isEmpty()) goto _L8; else goto _L7
_L7:
        e1 = ((k)((DecoderOutput) (obj1)).h.get(0)).a();
        c1 = '\uEC76';
_L13:
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        Singleton.b().a(c1, e1, s, s1, ai1.b(), ai1.c());
        if (c1 == '\uEC76')
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_755;
        e1;
        throw new OfflineTranslationException(s, s1, -5001, OfflineTranslationException.getCauseForLangPair("config", s, s1), ai1.b(), ai1.c());
        obj1;
        Singleton.b().a(-5003, "config", s, s1, ai1.b(), ai1.c());
        continue; /* Loop/switch isn't completed */
_L2:
        obj.s = null;
          goto _L9
_L4:
        obj.v = ai1.a(s, s1);
          goto _L10
_L6:
        obj.F = "1";
          goto _L11
_L8:
        if (((DecoderOutput) (obj1)).g.isEmpty()) goto _L13; else goto _L12
_L12:
        e1 = ((j)((DecoderOutput) (obj1)).g.get(0)).a();
        c1 = '\uEC75';
          goto _L13
        a.a(s2, obj);
        return ((g) (obj));
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static m a(com.google.android.libraries.translate.offline.o o1, String s, String s1, String s2, String s3)
    {
        m m1;
        String s4;
        s4 = n.a(s, s1, s2);
        m1 = (m)b.a(s4);
        if (m1 == null) goto _L2; else goto _L1
_L1:
        Singleton.b().a(Event.CACHE_HIT_OFFLINE, s1, s2);
        s = m1;
_L4:
        return s;
_L2:
        if (!o.c())
        {
            return null;
        }
        Object obj;
        Object obj1;
        String s5;
        boolean flag;
        if (g.a(s2) && s2.equalsIgnoreCase("zh-TW"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s5 = c.b(s1);
        obj1 = c.b(s2);
        if (!TextUtils.equals(s5, ((CharSequence) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        o1 = s;
        if (g.a(s5))
        {
            if (flag)
            {
                o1 = com.google.android.apps.translatedecoder.decoder.b.a(s);
            } else
            {
                o1 = com.google.android.apps.translatedecoder.decoder.b.b(s);
            }
        }
        o1 = m.b(s5, o1);
        s = o1;
        if (o1 != null)
        {
            b.a(s4, o1);
            return o1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!TextUtils.equals(s5, "en") && !TextUtils.equals(((CharSequence) (obj1)), "en"))
        {
            s2 = (ai)o1.c(s5, "en");
            if (s2 == null)
            {
                o1 = null;
            } else
            {
                s1 = Singleton.b().a(s2.a(), s5, ((String) (obj1)));
                s2 = a(((ai) (s2)), o1.b, s5, "en");
                if (s2 == null)
                {
                    o1 = null;
                } else
                {
                    s2 = s2.a(s, new ArrayList());
                    if (a(((DecoderOutput) (s2))))
                    {
                        o1 = null;
                    } else
                    {
                        s = ((DecoderOutput) (s2)).d;
                        obj = ((DecoderOutput) (s2)).i;
                        s2 = (ai)o1.c("en", ((String) (obj1)));
                        if (s2 == null)
                        {
                            o1 = null;
                        } else
                        {
                            o1 = a(((ai) (s2)), o1.b, "en", ((String) (obj1)));
                            if (o1 == null)
                            {
                                o1 = null;
                            } else
                            {
label0:
                                {
                                    o1.a = flag;
                                    s = o1.c(s);
                                    if (!a(((DecoderOutput) (s))))
                                    {
                                        break label0;
                                    }
                                    o1 = null;
                                }
                            }
                        }
                    }
                }
            }
        } else
        {
            s1 = (ai)o1.c(s5, ((String) (obj1)));
            if (s1 == null)
            {
                o1 = null;
            } else
            {
                s2 = Singleton.b().a(s1.a(), s5, ((String) (obj1)));
                o1 = a(((ai) (s1)), o1.b, s5, ((String) (obj1)));
                if (o1 == null)
                {
                    o1 = null;
                } else
                {
label1:
                    {
                        o1.a = flag;
                        s1 = o1.c(s);
                        if (!a(((DecoderOutput) (s1))))
                        {
                            break label1;
                        }
                        o1 = null;
                    }
                }
            }
        }
        break MISSING_BLOCK_LABEL_119;
        o1 = ((DecoderOutput) (s)).d;
        if (obj != null)
        {
            ((List) (obj)).addAll(((DecoderOutput) (s)).i);
            obj1 = s1;
            s2 = o1;
            s1 = s;
            s = ((String) (obj1));
            o1 = ((com.google.android.libraries.translate.offline.o) (obj));
        } else
        {
            obj1 = ((DecoderOutput) (s)).i;
            s2 = s;
            s = s1;
            obj = o1;
            o1 = ((com.google.android.libraries.translate.offline.o) (obj1));
            s1 = s2;
            s2 = ((String) (obj));
        }
_L5:
        s.a(((DecoderOutput) (s1)).f, s3, TextUtils.join("", o1));
        if (TextUtils.isEmpty(s2))
        {
            o1 = null;
        } else
        {
            o1 = m.b(s5, s2);
        }
        break MISSING_BLOCK_LABEL_119;
        obj = ((DecoderOutput) (s1)).d;
        o1 = ((DecoderOutput) (s1)).i;
        s = s2;
        s2 = ((String) (obj));
          goto _L5
    }

    public static String a(String s)
    {
        return c.b(s);
    }

    public static void a()
    {
        b.a(-1);
    }

    private static boolean a(DecoderOutput decoderoutput)
    {
        if (decoderoutput.h.size() > 0)
        {
            return true;
        } else
        {
            decoderoutput.g.size();
            return false;
        }
    }

}
