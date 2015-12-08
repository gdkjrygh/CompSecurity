// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;

public final class RecognitionState
{

    String a;
    String b;
    ResultType c;
    EndpointerState d;
    public String e;
    public String f;
    Language g;
    Language h;
    boolean i;
    boolean j;
    boolean k;
    private final d l;

    public RecognitionState()
    {
        c = ResultType.UNKNOWN;
        d = EndpointerState.UNKNOWN;
        j = true;
        k = false;
        l = com.google.android.libraries.translate.languages.e.a(Singleton.a());
    }

    public RecognitionState(RecognitionState recognitionstate)
    {
        c = ResultType.UNKNOWN;
        d = EndpointerState.UNKNOWN;
        j = true;
        k = false;
        l = com.google.android.libraries.translate.languages.e.a(Singleton.a());
        a = recognitionstate.a;
        b = recognitionstate.b;
        c = recognitionstate.c;
        d = recognitionstate.d;
        e = recognitionstate.e;
        f = recognitionstate.f;
        g = recognitionstate.g;
        h = recognitionstate.h;
        i = recognitionstate.i;
        j = recognitionstate.j;
        k = recognitionstate.k;
    }

    private boolean a(Language language)
    {
        boolean flag1 = true;
        if (language != null && g != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (TextUtils.equals(language.getShortName(), g.getShortName())) goto _L4; else goto _L3
_L3:
        Language language1;
        language = l.b(language.getShortName());
        language1 = l.b(g.getShortName());
        if (language == null || language1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (language.equals(language1)) goto _L4; else goto _L5
_L5:
        return false;
    }

    final Language a(String s)
    {
        Language language = l.c(s);
        Object obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            "Unknown TWS language code from speech server: ".concat(((String) (obj)));
        } else
        {
            new String("Unknown TWS language code from speech server: ");
        }
        obj = language;
        if (language == null)
        {
            obj = l.b(s);
        }
        return ((Language) (obj));
    }

    public final RecognitionState a()
    {
        a = null;
        b = null;
        c = ResultType.UNKNOWN;
        d = EndpointerState.UNKNOWN;
        e = null;
        f = null;
        g = null;
        h = null;
        i = false;
        j = true;
        k = false;
        return this;
    }

    public final String a(Language language, Language language1, String s, String s1)
    {
        if (c())
        {
            if (a(language))
            {
                return s;
            }
            if (a(language1))
            {
                return s1;
            }
        }
        return b;
    }

    public final boolean a(String s, String s1)
    {
        while (TextUtils.isEmpty(b()) || TextUtils.isEmpty(b) || TextUtils.equals(b(), s) && TextUtils.equals(b, s1)) 
        {
            return false;
        }
        return true;
    }

    public final String b()
    {
        if (c())
        {
            return e;
        } else
        {
            return a;
        }
    }

    public final boolean c()
    {
        while (TextUtils.isEmpty(f) || TextUtils.isEmpty(e) || g == null || h == null) 
        {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof RecognitionState))
        {
            return false;
        }
        obj = (RecognitionState)obj;
        if (i != ((RecognitionState) (obj)).i)
        {
            return false;
        }
        if (j != ((RecognitionState) (obj)).j)
        {
            return false;
        }
        if (k != ((RecognitionState) (obj)).k)
        {
            return false;
        }
        if (a == null ? ((RecognitionState) (obj)).a != null : !a.equals(((RecognitionState) (obj)).a))
        {
            return false;
        }
        if (b == null ? ((RecognitionState) (obj)).b != null : !b.equals(((RecognitionState) (obj)).b))
        {
            return false;
        }
        if (c != ((RecognitionState) (obj)).c)
        {
            return false;
        }
        if (d != ((RecognitionState) (obj)).d)
        {
            return false;
        }
        if (e == null ? ((RecognitionState) (obj)).e != null : !e.equals(((RecognitionState) (obj)).e))
        {
            return false;
        }
        if (f == null ? ((RecognitionState) (obj)).f != null : !f.equals(((RecognitionState) (obj)).f))
        {
            return false;
        }
        if (g == null ? ((RecognitionState) (obj)).g != null : !g.equals(((RecognitionState) (obj)).g))
        {
            return false;
        }
        if (h == null) goto _L4; else goto _L3
_L3:
        if (h.equals(((RecognitionState) (obj)).h)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((RecognitionState) (obj)).h == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int k3 = 1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (a != null)
        {
            i1 = a.hashCode();
        } else
        {
            i1 = 0;
        }
        if (b != null)
        {
            j1 = b.hashCode();
        } else
        {
            j1 = 0;
        }
        if (c != null)
        {
            k1 = c.hashCode();
        } else
        {
            k1 = 0;
        }
        if (d != null)
        {
            l1 = d.hashCode();
        } else
        {
            l1 = 0;
        }
        if (e != null)
        {
            i2 = e.hashCode();
        } else
        {
            i2 = 0;
        }
        if (f != null)
        {
            j2 = f.hashCode();
        } else
        {
            j2 = 0;
        }
        if (g != null)
        {
            k2 = g.hashCode();
        } else
        {
            k2 = 0;
        }
        if (h != null)
        {
            l2 = h.hashCode();
        } else
        {
            l2 = 0;
        }
        if (i)
        {
            i3 = 1;
        } else
        {
            i3 = 0;
        }
        if (j)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
        if (!k)
        {
            k3 = 0;
        }
        return (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + i1 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k3;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("RecognitionState");
        stringbuffer.append(" result: [").append(a).append("] ");
        stringbuffer.append(" recognizedLanguage: [").append(b).append("]");
        stringbuffer.append(" resultType: [").append(c).append("]");
        stringbuffer.append(" endpointerState: [").append(d).append("]");
        stringbuffer.append(" sourceText: [").append(e).append("]");
        stringbuffer.append(" translation: [").append(f).append("]");
        stringbuffer.append(" sourceLanguage: [").append(g).append("]");
        stringbuffer.append(" targetLanguage: [").append(h).append("]");
        stringbuffer.append(" ttsReceived: [").append(i).append("]");
        stringbuffer.append(" ttsSupported: [").append(j).append("]");
        stringbuffer.append(" ttsDisabled: [").append(k).append("]");
        return stringbuffer.toString();
    }

    private class ResultType extends Enum
    {

        public static final ResultType COMPLETED_RESULT;
        public static final ResultType RESULT;
        public static final ResultType UNKNOWN;
        private static final ResultType a[];

        public static ResultType valueOf(String s)
        {
            return (ResultType)Enum.valueOf(com/google/android/libraries/translate/speech/s3/RecognitionState$ResultType, s);
        }

        public static ResultType[] values()
        {
            return (ResultType[])a.clone();
        }

        static 
        {
            RESULT = new ResultType("RESULT", 0);
            COMPLETED_RESULT = new ResultType("COMPLETED_RESULT", 1);
            UNKNOWN = new ResultType("UNKNOWN", 2);
            a = (new ResultType[] {
                RESULT, COMPLETED_RESULT, UNKNOWN
            });
        }

        private ResultType(String s, int i1)
        {
            super(s, i1);
        }
    }


    private class EndpointerState extends Enum
    {

        public static final EndpointerState END_OF_SPEECH;
        public static final EndpointerState START_OF_SPEECH;
        public static final EndpointerState UNKNOWN;
        private static final EndpointerState a[];

        public static EndpointerState valueOf(String s)
        {
            return (EndpointerState)Enum.valueOf(com/google/android/libraries/translate/speech/s3/RecognitionState$EndpointerState, s);
        }

        public static EndpointerState[] values()
        {
            return (EndpointerState[])a.clone();
        }

        static 
        {
            START_OF_SPEECH = new EndpointerState("START_OF_SPEECH", 0);
            END_OF_SPEECH = new EndpointerState("END_OF_SPEECH", 1);
            UNKNOWN = new EndpointerState("UNKNOWN", 2);
            a = (new EndpointerState[] {
                START_OF_SPEECH, END_OF_SPEECH, UNKNOWN
            });
        }

        private EndpointerState(String s, int i1)
        {
            super(s, i1);
        }
    }

}
