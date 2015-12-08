// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.b.c;
import com.google.android.apps.translatedecoder.lm.LanguageModel;
import com.google.android.apps.translatedecoder.lm.a;
import com.google.android.apps.translatedecoder.preprocess.Tokenizer;
import com.google.android.apps.translatedecoder.pt.HashMapBasedPt;
import com.google.android.apps.translatedecoder.pt.PhrasePair;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            DecoderOutput, b, h, v, 
//            d, r, q, f, 
//            u, j, o, m, 
//            p, n, k

public final class g
{

    private static final Logger b = Logger.getLogger("translate");
    private static final ExecutorService c = Executors.newFixedThreadPool(4);
    private static final Map d = new HashMap();
    private static final Map e = new HashMap();
    private static Tokenizer m = null;
    public boolean a;
    private final b f;
    private PhraseTable g;
    private com.google.android.apps.translatedecoder.rapidresp.a h;
    private com.google.android.apps.translatedecoder.b.a i;
    private a j;
    private final SymbolTable k;
    private com.google.android.apps.translatedecoder.util.c l;
    private com.google.android.apps.translatedecoder.a.a n;

    public g(b b1, SymbolTable symboltable)
    {
        h = null;
        n = null;
        a = false;
        f = b1;
        k = symboltable;
    }

    public static boolean a(String s)
    {
        return a(s, "zh", "Chinese");
    }

    private static boolean a(String s, String s1, String s2)
    {
        return s.toLowerCase().startsWith(s1) || s.equalsIgnoreCase(s2);
    }

    private DecoderOutput b(String s, List list)
    {
        Object obj;
        DecoderOutput decoderoutput;
        Future future;
        long l2;
        k.flush();
        obj = j;
        if (((a) (obj)).e.size() > 100)
        {
            ((a) (obj)).e.clear();
        }
        l2 = System.currentTimeMillis();
        decoderoutput = new DecoderOutput();
        decoderoutput.a = s;
        obj = s.trim();
        if (a(f.c))
        {
            b.info("Converting input to simplified chinese");
            obj = com.google.android.apps.translatedecoder.decoder.b.b(s.trim());
        }
        b.info(((String) (obj)));
        s = ((String) (obj));
        if (f.a)
        {
            s = m.tokenizeWithJoin(f.c, ((String) (obj)));
        }
        decoderoutput.b = s;
        obj = s.toLowerCase(Locale.getDefault());
        s = k.addWords(s);
        decoderoutput.f = s.length;
        future = c.submit(new h(this, n, s));
        obj = k.addWords(((String) (obj)));
        if (!f.F.equals("2")) goto _L2; else goto _L1
_L1:
        Object obj1 = new v(g, h, j, f, k, s, ((int []) (obj)));
        if (((v) (obj1)).b != null) goto _L4; else goto _L3
_L3:
        s = null;
_L7:
        if (((v) (obj1)).d.d)
        {
            decoderoutput.a(DecoderOutput.FeaturesUsed.RR);
        }
        obj = null;
        obj1 = s;
_L5:
        Object obj2 = null;
        try
        {
            s = (List)future.get(500L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            Logger logger = b;
            s = String.valueOf(interruptedexception.toString());
            if (s.length() != 0)
            {
                s = "Dictionary Decoding was exceptional! ".concat(s);
            } else
            {
                s = new String("Dictionary Decoding was exceptional! ");
            }
            logger.info(s);
            decoderoutput.a(new j(DecoderOutput.ErrorCode.DICTIONARY_ERROR, interruptedexception));
            s = ((String) (obj2));
        }
        catch (ExecutionException executionexception)
        {
            Logger logger1 = b;
            s = String.valueOf(executionexception.toString());
            if (s.length() != 0)
            {
                s = "Dictionary Decoding was exceptional! ".concat(s);
            } else
            {
                s = new String("Dictionary Decoding was exceptional! ");
            }
            logger1.info(s);
            decoderoutput.a(new j(DecoderOutput.ErrorCode.DICTIONARY_ERROR, executionexception));
            s = ((String) (obj2));
        }
        catch (TimeoutException timeoutexception)
        {
            Logger logger2 = b;
            s = String.valueOf(timeoutexception.toString());
            if (s.length() != 0)
            {
                s = "Dictionary Decoding timed out! ".concat(s);
            } else
            {
                s = new String("Dictionary Decoding timed out! ");
            }
            logger2.info(s);
            decoderoutput.a(new j(DecoderOutput.ErrorCode.DICTIONARY_TIMEOUT, timeoutexception));
            s = ((String) (obj2));
        }
        if (s != null && s.size() > 0)
        {
            int ai[];
            List list1;
            int ai1[];
            List list2;
            PriorityQueue priorityqueue;
            BitSet bitset;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            long l3;
            if (f.e)
            {
                obj2 = new ArrayList();
                com.google.android.apps.translatedecoder.a.b b1;
                for (Iterator iterator = s.iterator(); iterator.hasNext(); ((List) (obj2)).add(new com.google.android.apps.translatedecoder.a.b(b1.a, Tokenizer.deTokenize(f.d, b1.b), b1.c, b1.d)))
                {
                    b1 = (com.google.android.apps.translatedecoder.a.b)iterator.next();
                }

            } else
            {
                obj2 = s;
            }
            list.add(obj2);
        }
        if (s != null && s.size() > 0)
        {
            list = ((com.google.android.apps.translatedecoder.a.b)s.get(0)).b;
            decoderoutput.e = ((com.google.android.apps.translatedecoder.a.b)s.get(0)).d;
            s = list;
        } else
        if (f.F.equals("2"))
        {
            decoderoutput.e = ((r) (obj1)).c.a();
            boolean flag = f.p;
            s = k;
            list = new StringBuilder();
            ((r) (obj1)).a(((r) (obj1)).c.a.a, flag, s, list);
            s = list.toString().trim();
        } else
        {
            decoderoutput.e = ((m) (obj)).a.a();
            boolean flag1 = f.p;
            s = k;
            list = new StringBuilder();
            com.google.android.apps.translatedecoder.decoder.m.a(((m) (obj)).a.a.a, flag1, s, list);
            s = list.toString().trim();
        }
        decoderoutput.c = s;
        list = s;
        if (f.e)
        {
            list = Tokenizer.deTokenize(f.d, s);
        }
        decoderoutput.d = list;
        obj = b;
        s = String.valueOf(list);
        if (s.length() != 0)
        {
            s = "Response is ".concat(s);
        } else
        {
            s = new String("Response is ");
        }
        ((Logger) (obj)).info(s);
        s = b;
        l3 = System.currentTimeMillis();
        s.info((new StringBuilder(61)).append("Total # of milliseconds taken to decode: ").append(l3 - l2).toString());
        return decoderoutput;
        continue; /* Loop/switch isn't completed */
_L4:
        obj2 = ((v) (obj1)).d;
        ai = ((v) (obj1)).b;
        ai1 = ((v) (obj1)).c;
        if (((v) (obj1)).j.j > 0)
        {
            i1 = ((v) (obj1)).j.j;
        } else
        {
            i1 = ((v) (obj1)).b.length;
        }
        priorityqueue = new PriorityQueue();
        j1 = 1;
        do
        {
            if (j1 > i1)
            {
                break;
            }
            for (k1 = 0; k1 <= ai.length - j1; k1++)
            {
label0:
                {
                    bitset = new BitSet(ai.length + 1);
                    l1 = (k1 + j1) - 1;
                    bitset.set(k1, l1 + 1);
                    obj = ((d) (obj2)).b.getPhrases(ai, k1, l1);
                    if (obj != null)
                    {
                        s = ((String) (obj));
                        if (((List) (obj)).size() != 0)
                        {
                            break label0;
                        }
                    }
                    s = ((String) (obj));
                    if (!com.google.android.apps.translatedecoder.decoder.d.a(ai, ai1, k1, l1))
                    {
                        s = ((d) (obj2)).b.getPhrases(ai1);
                    }
                }
label1:
                {
                    if (s == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = s.size();
                    }
                    obj = s;
                    if (((d) (obj2)).c != null)
                    {
                        obj = ((d) (obj2)).c.a(ai, false, s);
                    }
                    if (obj == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = ((List) (obj)).size();
                    }
                    if (l1 != i2)
                    {
                        obj2.d = true;
                    }
                    s = ((String) (obj));
                    if (j1 != 1)
                    {
                        break label1;
                    }
                    if (obj != null)
                    {
                        s = ((String) (obj));
                        if (((List) (obj)).size() > 0)
                        {
                            break label1;
                        }
                    }
                    obj = ((d) (obj2)).b.createOOVPhrase(ai[k1]);
                    s = new ArrayList();
                    s.add(obj);
                }
                if (s == null || s.size() <= 0)
                {
                    continue;
                }
                if (s.size() > ((d) (obj2)).a)
                {
                    priorityqueue.clear();
                    priorityqueue.addAll(s);
                    s.clear();
                    for (; s.size() < ((d) (obj2)).a; s.add(priorityqueue.poll())) { }
                }
                if ((List)((d) (obj2)).e.get(bitset) == null)
                {
                    ((d) (obj2)).e.put(bitset, s);
                }
            }

            j1++;
        } while (true);
        ((v) (obj1)).e.a(((v) (obj1)).i.a(null, new int[] {
            ((v) (obj1)).h
        }), new BitSet(((v) (obj1)).b.length + 1), -1, 0).c.clear();
        s = new BitSet(((v) (obj1)).b.length + 1);
        i2 = ((v) (obj1)).j.j;
        for (i1 = 1; i1 <= ((v) (obj1)).b.length; i1++)
        {
            if (i2 < i1)
            {
                j1 = i2;
            } else
            {
                j1 = i1;
            }
            if (j1 < 0)
            {
                j1 = i1;
            }
            if (i1 - j1 > 0)
            {
                obj = ((v) (obj1)).e;
                k1 = i1 - j1 - 1;
                ((Map)((r) (obj)).b.get(k1)).clear();
                ((Map)((r) (obj)).a.get(k1)).clear();
            }
label2:
            for (k1 = 1; k1 <= j1; k1++)
            {
                obj = ((v) (obj1)).e.a(i1 - k1).entrySet().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label2;
                    }
                    obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                    list1 = ((v) (obj1)).f.a((q)((java.util.Map.Entry) (obj2)).getValue(), ((v) (obj1)).j.A, k1, ((v) (obj1)).b.length);
                    if (list1.size() != 0)
                    {
                        l1 = 0;
                        while (l1 < list1.size()) 
                        {
                            j2 = ((Integer)list1.get(l1)).intValue();
                            s.clear();
                            s.set(j2, j2 + k1);
                            list2 = (List)((v) (obj1)).d.e.get(s);
                            if (list2 != null)
                            {
                                ((v) (obj1)).f.a((q)((java.util.Map.Entry) (obj2)).getValue(), list2, j2, (j2 + k1) - 1);
                            }
                            l1++;
                        }
                    }
                } while (true);
            }

            ((v) (obj1)).e.b(i1);
        }

        s = ((v) (obj1)).a.createIdentityPhrase(((v) (obj1)).g, 0.0D);
        obj2 = ((v) (obj1)).e.a(((v) (obj1)).b.length);
        obj = new ArrayList();
        for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj)).add(((java.util.Map.Entry)((Iterator) (obj2)).next()).getValue())) { }
        ((v) (obj1)).e.c = ((v) (obj1)).f.a(((List) (obj)), s, ((v) (obj1)).b.length, ((v) (obj1)).b.length + 1);
        s = ((v) (obj1)).e;
        continue; /* Loop/switch isn't completed */
_L2:
        s = new u(g, h, j, f, k, s, ((int []) (obj)));
        obj = s.a();
        if (((u) (s)).a)
        {
            decoderoutput.a(DecoderOutput.FeaturesUsed.RR);
        }
        obj1 = null;
          goto _L5
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean b(String s)
    {
        return a(s, "ko", "Korean");
    }

    public final DecoderOutput a()
    {
        DecoderOutput decoderoutput;
        decoderoutput = new DecoderOutput();
        System.currentTimeMillis();
        if (f.v != null)
        {
            i = com.google.android.apps.translatedecoder.b.b.b(f.v);
        } else
        if (f.x != null)
        {
            try
            {
                i = new c(f.x, f.y);
            }
            catch (Exception exception)
            {
                decoderoutput.a(new j(DecoderOutput.ErrorCode.LOADING_FQ_FAILED, exception));
            }
        } else
        {
            decoderoutput.a(new j(DecoderOutput.ErrorCode.LOADING_FQ_FAILED, "DcdrInitFqtNotFound", f.x));
        }
        if (f.h)
        {
            throw new RuntimeException("convertSymbol is set true, but lmSymbol is null");
        }
        l = null;
        try
        {
            g = PhraseTable.readFromFile(f.i);
        }
        catch (Exception exception1)
        {
            decoderoutput.a(new k(DecoderOutput.FatalErrorCode.LOADING_PT_FAILED, exception1));
            return decoderoutput;
        }
        if (g == null)
        {
            decoderoutput.a(new k(DecoderOutput.FatalErrorCode.LOADING_PT_FAILED, "DcdrInitPtReadFromFileReturnedNull", f.i));
            return decoderoutput;
        }
        if (f.q > 0.0D)
        {
            g.setOovCost(f.q);
        }
        if (f.j > 0 && f.j < g.maxPhraseLen())
        {
            g.setMaxPhraseLen(f.j);
        }
        if (f.s == null) goto _L2; else goto _L1
_L1:
        if (!f.G.equals("2")) goto _L4; else goto _L3
_L3:
        h = new com.google.android.apps.translatedecoder.rapidresp.a(f.j, f.q, f.s, k, f.t);
_L14:
        String s1 = f.w;
        if (!a(f.d, "en", "ENGLISH")) goto _L6; else goto _L5
_L5:
        LanguageModel languagemodel = (LanguageModel)d.get(s1);
        Object obj;
        obj = languagemodel;
        if (languagemodel == null)
        {
            try
            {
                obj = LanguageModel.readFromFile(f.k);
                d.put(s1, obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                decoderoutput.a(new k(DecoderOutput.FatalErrorCode.LOADING_LM_FAILED, ((Exception) (obj))));
                return decoderoutput;
            }
        }
        if (obj == null)
        {
            decoderoutput.a(new k(DecoderOutput.FatalErrorCode.LOADING_LM_FAILED, "DcdrInitLmRffReturnedNull", f.k));
            return decoderoutput;
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            obj = new HashMapBasedPt(f.j, f.q, f.s, k);
            if (((HashMapBasedPt) (obj)).hasError())
            {
                decoderoutput.a(new j(DecoderOutput.ErrorCode.LOADING_RR_FAILED, "DcdrInitHmbpRapid", f.s));
            }
            h = new com.google.android.apps.translatedecoder.rapidresp.a(((PhraseTable) (obj)), f.t);
            if (f.j > 0 && f.j < ((HashMapBasedPt) (obj)).maxPhraseLen())
            {
                ((HashMapBasedPt) (obj)).setMaxPhraseLen(f.j);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            decoderoutput.a(new j(DecoderOutput.ErrorCode.LOADING_RR_FAILED, ((Exception) (obj))));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        decoderoutput.a(new j(DecoderOutput.ErrorCode.LOADING_RR_FAILED, "DcdrInitRapidNotFound", null));
        continue; /* Loop/switch isn't completed */
_L6:
        obj = LanguageModel.readFromFile(f.k);
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_417;
_L7:
        ((LanguageModel) (obj)).setMaxNumCachedNgrams(f.o);
        ((LanguageModel) (obj)).setConfig(f);
        if (f.r > 0.0D)
        {
            ((LanguageModel) (obj)).setOovCost(f.r);
        }
        int j1 = ((LanguageModel) (obj)).lmOrder();
        int i1 = j1;
        if (f.m > 0)
        {
            i1 = j1;
            if (f.m < ((LanguageModel) (obj)).lmOrder())
            {
                i1 = f.m;
                ((LanguageModel) (obj)).setLmOrder(i1);
            }
        }
        j = new a(i1, ((LanguageModel) (obj)), l, f);
        j.d = k;
        if (f.n != null)
        {
            obj = j;
            SymbolTable symboltable = k;
            if (((a) (obj)).c == null)
            {
                obj.c = new HashSet();
            }
            obj.d = symboltable;
        }
        obj = (Tokenizer)e.get(s1);
        m = ((Tokenizer) (obj));
        if (obj != null) goto _L10; else goto _L9
_L9:
        try
        {
            m = Tokenizer.readFromFile(f.b, f.z);
        }
        catch (Exception exception2)
        {
            decoderoutput.a(new k(DecoderOutput.FatalErrorCode.LOADING_PD_FAILED, exception2));
            return decoderoutput;
        }
        if (m == null)
        {
            DecoderOutput.FatalErrorCode fatalerrorcode = DecoderOutput.FatalErrorCode.LOADING_PD_FAILED;
            String s = f.b;
            s1 = f.z;
            decoderoutput.a(new k(fatalerrorcode, "DcdrInitTknRffReturnedNull", (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(",").append(s1).toString()));
            return decoderoutput;
        }
        e.put(s1, m);
_L12:
        n = new com.google.android.apps.translatedecoder.a.a(f, k, m, g, h);
        return decoderoutput;
_L10:
        if (b(f.d))
        {
            m.initKoreanPostProcessing(f.z);
        }
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final DecoderOutput a(String s, List list)
    {
        Object obj;
        Object obj1 = b;
        obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            obj = "Decoder decoder: freqQueriesTbl.lookUp: rawInput=".concat(((String) (obj)));
        } else
        {
            obj = new String("Decoder decoder: freqQueriesTbl.lookUp: rawInput=");
        }
        ((Logger) (obj1)).fine(((String) (obj)));
        if (i != null)
        {
            obj = i.a(s);
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            b.fine("Decoder decoder: freqQueriesTbl.lookUp: null...");
            return b(s, list);
        }
        DecoderOutput decoderoutput = new DecoderOutput();
        decoderoutput.a(DecoderOutput.FeaturesUsed.FQ);
        Logger logger = b;
        obj1 = String.valueOf(obj);
        if (((String) (obj1)).length() != 0)
        {
            obj1 = "Decoder decoder: freqQueriesTbl.lookUp: translation=".concat(((String) (obj1)));
        } else
        {
            obj1 = new String("Decoder decoder: freqQueriesTbl.lookUp: translation=");
        }
        logger.fine(((String) (obj1)));
        obj1 = s.trim();
        if (f.a)
        {
            obj1 = m.tokenizeWithJoin(f.c, s.trim());
        }
        obj1 = k.addWords(((String) (obj1)));
        if (h == null) goto _L2; else goto _L1
_L1:
        s = h.a(((int []) (obj1)), false, null);
        if (s == null || s.size() <= 0) goto _L2; else goto _L3
_L3:
        s = k.getWords(((PhrasePair)s.get(0)).tgtWords());
        decoderoutput.a(DecoderOutput.FeaturesUsed.RR);
_L5:
        obj = n.a(((int []) (obj1)));
        if (obj != null && ((List) (obj)).size() > 0)
        {
            list.add(obj);
            decoderoutput.a(DecoderOutput.FeaturesUsed.DI);
        }
        decoderoutput.d = s;
        return decoderoutput;
_L2:
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final DecoderOutput c(String s)
    {
        long l1 = System.currentTimeMillis();
        Object obj1 = new ArrayList();
        s = a(s, ((List) (obj1)));
        Object obj = new StringBuilder(((DecoderOutput) (s)).d);
        if (((List) (obj1)).size() > 0)
        {
            s.a(DecoderOutput.FeaturesUsed.DI);
            obj1 = (List)((List) (obj1)).get(0);
            ((StringBuilder) (obj)).append("\t");
            int i1 = 1;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                com.google.android.apps.translatedecoder.a.b b1 = (com.google.android.apps.translatedecoder.a.b)((Iterator) (obj1)).next();
                ((StringBuilder) (obj)).append(" ").append(i1).append(". ").append(b1.b).append("\n");
                i1++;
            }

            ((StringBuilder) (obj)).append("\n");
        }
        long l2;
        if (a(f.d))
        {
            if (a)
            {
                s.d = com.google.android.apps.translatedecoder.decoder.b.a(((StringBuilder) (obj)).toString());
            } else
            {
                s.d = com.google.android.apps.translatedecoder.decoder.b.b(((StringBuilder) (obj)).toString());
            }
        } else
        {
            s.d = ((StringBuilder) (obj)).toString();
        }
        obj = b;
        l2 = System.currentTimeMillis();
        ((Logger) (obj)).info((new StringBuilder(61)).append("Total # of milliseconds taken to decode: ").append(l2 - l1).toString());
        return s;
    }

}
