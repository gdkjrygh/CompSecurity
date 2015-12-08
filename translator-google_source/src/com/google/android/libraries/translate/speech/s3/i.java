// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.gsa.a.c;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.tts.network.a;
import com.google.f.d.a.f;
import com.google.f.d.a.g;
import com.google.f.e.m;
import com.google.f.f.a.d;
import com.google.f.f.a.j;
import com.google.f.f.a.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.translate.speech.s3:
//            RecognitionState, j

public final class i
    implements c
{

    final AtomicBoolean a = new AtomicBoolean(false);
    boolean b;
    long c;
    FileOutputStream d;
    File e;
    a f;
    com.google.android.libraries.b.a.a.a g;
    final RecognitionState h = new RecognitionState();
    private final com.google.android.libraries.translate.speech.s3.j i;
    private LogParams j;

    public i(com.google.android.libraries.translate.speech.s3.j j1, boolean flag, LogParams logparams)
    {
        i = j1;
        b = flag;
        j = logparams;
    }

    private boolean a(j j1, RecognitionState recognitionstate)
    {
        if (j1 != null && recognitionstate.c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k;
        if (j1.e != null)
        {
            k = j1.e.a;
        }
        if (d != null)
        {
            if ((j1.b & 1) != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                try
                {
                    byte abyte0[] = j1.c;
                    k = abyte0.length;
                    d.write(abyte0);
                    if (c == 0L)
                    {
                        c = System.currentTimeMillis();
                    }
                }
                catch (IOException ioexception)
                {
                    d = null;
                }
            }
        }
        if ((j1.b & 2) != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0 || !j1.d) goto _L1; else goto _L3
_L3:
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        d.flush();
        d.close();
        if (c != 0L)
        {
            Singleton.b().a(Event.S3_TTS_DOWNLOAD, c, recognitionstate.h.getShortName(), null, j, recognitionstate.f.length());
            c = 0L;
        }
        j1 = f.a(recognitionstate.f, recognitionstate.h);
        if (j1.exists())
        {
            j1.delete();
        }
        e.renameTo(j1);
        d = null;
_L5:
        recognitionstate.i = true;
        return true;
        j1;
        d = null;
        if (true) goto _L5; else goto _L4
_L4:
        j1;
        d = null;
        throw j1;
    }

    public final void a(NetworkRecognizeException networkrecognizeexception)
    {
        if (!a.get());
    }

    public final void a(m m1)
    {
        if (!a.get()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        m1.a;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 45
    //                   1 1386
    //                   2 1396
    //                   3 1422;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        return;
_L4:
        RecognitionState recognitionstate = new RecognitionState();
        boolean flag = false;
        Object obj;
        Object obj3;
        j j1;
        Object obj4;
        Object obj5;
        com.google.f.d.a.i k;
        com.google.android.libraries.b.a.a.a a1;
        g g1;
        f f1;
        int i1;
        int k1;
        int l1;
        boolean flag1;
        int i2;
        if (b)
        {
            obj = (l)m1.getExtension(l.a);
            j1 = (j)m1.getExtension(j.a);
        } else
        {
            j1 = null;
            obj = null;
        }
        if (obj != null)
        {
            i1 = 0;
            flag = false;
            if (obj != null)
            {
                if ((((l) (obj)).b & 2) != 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                i1 = ((flag) ? 1 : 0);
                if (k1 != 0)
                {
                    recognitionstate.e = ((l) (obj)).e;
                    i1 = 1;
                }
                if ((((l) (obj)).b & 1) != 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (k1 != 0)
                {
                    recognitionstate.f = ((l) (obj)).c;
                    i1 = 1;
                }
                if ((((l) (obj)).b & 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1 = i1;
                if (flag)
                {
                    Object obj1 = ((l) (obj)).g;
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        obj1 = recognitionstate.a(((String) (obj1)));
                        if (obj1 != null)
                        {
                            recognitionstate.g = ((Language) (obj1));
                        }
                    }
                    k1 = 1;
                }
                if ((((l) (obj)).b & 4) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = k1;
                if (flag)
                {
                    Object obj2 = ((l) (obj)).f;
                    if (!TextUtils.isEmpty(((CharSequence) (obj2))))
                    {
                        obj2 = recognitionstate.a(((String) (obj2)));
                        if (obj2 != null)
                        {
                            recognitionstate.h = ((Language) (obj2));
                        }
                    }
                    i1 = k1 | 1;
                }
                if ((((l) (obj)).b & 0x10) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1 = i1;
                if (flag)
                {
                    d d1;
                    boolean flag2;
                    if (!((l) (obj)).h)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    recognitionstate.j = flag2;
                    k1 = i1 | 1;
                }
                if ((((l) (obj)).b & 0x20) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = k1;
                if (flag)
                {
                    recognitionstate.k = ((l) (obj)).i;
                    i1 = k1 | 1;
                }
            }
            recognitionstate.toString();
            flag = i1 | 0;
        }
        d1 = (d)m1.getExtension(d.a);
        if (d1 == null) goto _L9; else goto _L8
_L8:
        i1 = 0;
        k1 = 0;
        if (d1.b == null) goto _L11; else goto _L10
_L10:
        k = d1.b;
        if (!TextUtils.isEmpty(d1.g))
        {
            recognitionstate.b = d1.g;
            k1 = 1;
            m1 = d1.g;
        }
        if (k.d == null) goto _L13; else goto _L12
_L12:
        m1 = g.a(k.d);
        if (!m1.isEmpty())
        {
            recognitionstate.a = (String)m1.get(0);
            k1 = 1;
        }
_L21:
        if (k.a == 0)
        {
            i1 = k1 | 1;
            recognitionstate.c = RecognitionState.ResultType.RESULT;
        } else
        {
            i1 = k1;
            if (k.a == 1)
            {
                i1 = k1 | 1;
                recognitionstate.c = RecognitionState.ResultType.COMPLETED_RESULT;
            }
        }
_L11:
        k1 = i1;
        if (d1.c != null)
        {
            l1 = d1.c.a;
            if (l1 == 0)
            {
                recognitionstate.d = RecognitionState.EndpointerState.START_OF_SPEECH;
                k1 = i1 | 1;
            } else
            {
                k1 = i1;
                if (l1 == 1)
                {
                    recognitionstate.d = RecognitionState.EndpointerState.END_OF_SPEECH;
                    k1 = i1 | 1;
                }
            }
        }
        i1 = flag | k1;
        recognitionstate.toString();
_L32:
        if (i1 == 0 && j1 == null) goto _L1; else goto _L14
_L14:
        m1 = h;
        m1;
        JVM INSTR monitorenter ;
        recognitionstate.toString();
        obj = h;
        if (recognitionstate.c())
        {
            obj.e = recognitionstate.e;
            obj.f = recognitionstate.f;
            obj.g = recognitionstate.g;
            obj.h = recognitionstate.h;
        }
        if (!TextUtils.isEmpty(recognitionstate.a))
        {
            obj.a = recognitionstate.a;
        }
        if (((RecognitionState) (obj)).c != recognitionstate.c)
        {
            obj.c = recognitionstate.c;
        }
        if (((RecognitionState) (obj)).d != recognitionstate.d)
        {
            obj.d = recognitionstate.d;
        }
        if (recognitionstate.b != null)
        {
            obj.b = recognitionstate.b;
        }
        if (((RecognitionState) (obj)).i != recognitionstate.i)
        {
            obj.i = recognitionstate.i;
        }
        if (((RecognitionState) (obj)).j != recognitionstate.j)
        {
            obj.j = recognitionstate.j;
        }
        if (((RecognitionState) (obj)).k != recognitionstate.k)
        {
            obj.k = recognitionstate.k;
        }
        h.toString();
        k1 = i1;
        if (j1 == null) goto _L16; else goto _L15
_L15:
        k1 = i1 | a(j1, h);
        flag2 = h.i;
_L16:
        if (k1 == 0) goto _L18; else goto _L17
_L17:
        i.a(h);
_L18:
        m1;
        JVM INSTR monitorexit ;
        return;
        obj;
        m1;
        JVM INSTR monitorexit ;
        throw obj;
_L13:
        if (k.b == null) goto _L20; else goto _L19
_L19:
        m1 = g.a(k.b);
        if (!m1.isEmpty())
        {
            recognitionstate.a = (String)m1.get(0);
            k1 = 1;
        }
          goto _L21
_L20:
        if (k.c == null) goto _L21; else goto _L22
_L22:
        a1 = g;
        if (k.b != null)
        {
            m1 = k.b;
            if (((com.google.f.d.a.j) (m1)).a.length > 0)
            {
                m1 = ((com.google.f.d.a.j) (m1)).a[0];
                if (m1.b())
                {
                    a1.a.append(((com.google.f.d.a.e) (m1)).a);
                }
            }
        }
        obj3 = null;
        m1 = null;
        obj4 = null;
        obj = null;
        if (k.c == null) goto _L24; else goto _L23
_L23:
        g1 = k.c;
        i2 = g1.a.length;
        i1 = 0;
        k1 = 0;
_L31:
        obj4 = obj;
        obj3 = m1;
        if (i1 >= i2) goto _L24; else goto _L25
_L25:
        f1 = g1.a[i1];
        if ((f1.a & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = k1;
        obj4 = obj;
        obj5 = m1;
        if (!flag1) goto _L27; else goto _L26
_L26:
        if (k1 != 0) goto _L29; else goto _L28
_L28:
        if ((f1.a & 2) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 == 0 || f1.c < 0.90000000000000002D) goto _L29; else goto _L30
_L30:
        obj3 = obj;
        if (obj == null)
        {
            obj3 = new StringBuilder(a1.a);
        }
        ((StringBuilder) (obj3)).append(f1.b);
        obj5 = m1;
        obj4 = obj3;
        l1 = k1;
_L27:
        i1++;
        k1 = l1;
        obj = obj4;
        m1 = ((m) (obj5));
          goto _L31
_L29:
        obj3 = m1;
        if (m1 == null)
        {
            obj3 = new StringBuilder();
        }
        ((StringBuilder) (obj3)).append(f1.b);
        l1 = 1;
        obj4 = obj;
        obj5 = obj3;
          goto _L27
_L24:
        if (obj4 == null)
        {
            m1 = a1.a.toString();
        } else
        {
            m1 = ((StringBuilder) (obj4)).toString();
        }
        if (obj3 == null)
        {
            obj = "";
        } else
        {
            obj = ((StringBuilder) (obj3)).toString();
        }
        obj = Pair.create(m1, obj);
        m1 = String.valueOf((String)((Pair) (obj)).first);
        obj = String.valueOf((String)((Pair) (obj)).second);
        if (((String) (obj)).length() != 0)
        {
            m1 = m1.concat(((String) (obj)));
        } else
        {
            m1 = new String(m1);
        }
        recognitionstate.a = m1;
        k1 = 1;
          goto _L21
_L5:
        i.d();
        return;
_L6:
        b(new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(m1.b));
        throw new IllegalStateException("Error S3Response received via onResult");
_L7:
        b(new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(0));
        return;
_L9:
        i1 = ((flag) ? 1 : 0);
          goto _L32
    }

    public final void b(NetworkRecognizeException networkrecognizeexception)
    {
        if (a.getAndSet(true))
        {
            return;
        } else
        {
            i.a(networkrecognizeexception);
            return;
        }
    }
}
