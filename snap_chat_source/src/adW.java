// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adW
{

    public final int a;
    public final aeF b;
    public final int c;
    public final boolean d;
    final String e;
    private final aeD f;
    private final aeF g;

    public adW(int i, aeD aed, aeF aef, int j, String s)
    {
        this(i, aed, aef, ((aeF) (aeC.a)), j, false, s);
    }

    private adW(int i, aeD aed, aeF aef, aeF aef1, int j, boolean flag, String s)
    {
        if (aed == null)
        {
            throw new NullPointerException("result == null");
        }
        if (aef == null)
        {
            throw new NullPointerException("sources == null");
        }
        if (aef1 == null)
        {
            throw new NullPointerException("exceptions == null");
        }
        if (j <= 0 || j > 6)
        {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (aef1.a() != 0 && j != 6)
        {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        } else
        {
            a = i;
            f = aed;
            g = aef;
            b = aef1;
            c = j;
            d = flag;
            e = s;
            return;
        }
    }

    public adW(int i, aeD aed, aeF aef, aeF aef1, String s)
    {
        this(i, aed, aef, aef1, 6, false, s);
    }

    public adW(int i, aeD aed, aeF aef, String s)
    {
        this(i, aed, aef, ((aeF) (aeC.a)), 1, false, s);
    }

    public adW(int i, aeF aef, aeF aef1)
    {
        this(i, aeD.i, aef, aef1, 6, true, null);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof adW))
            {
                return false;
            }
            obj = (adW)obj;
            if (a != ((adW) (obj)).a || c != ((adW) (obj)).c || f != ((adW) (obj)).f || !g.equals(((adW) (obj)).g) || !b.equals(((adW) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((a * 31 + c) * 31 + f.hashCode()) * 31 + g.hashCode()) * 31 + b.hashCode();
    }

    public final String toString()
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer(40);
        stringbuffer.append("Rop{");
        i = a;
        i;
        JVM INSTR tableswitch 1 57: default 264
    //                   1 428
    //                   2 434
    //                   3 440
    //                   4 446
    //                   5 452
    //                   6 458
    //                   7 464
    //                   8 470
    //                   9 476
    //                   10 482
    //                   11 488
    //                   12 494
    //                   13 500
    //                   14 506
    //                   15 512
    //                   16 518
    //                   17 524
    //                   18 530
    //                   19 536
    //                   20 542
    //                   21 548
    //                   22 554
    //                   23 560
    //                   24 566
    //                   25 572
    //                   26 578
    //                   27 584
    //                   28 590
    //                   29 596
    //                   30 602
    //                   31 608
    //                   32 614
    //                   33 620
    //                   34 626
    //                   35 632
    //                   36 638
    //                   37 644
    //                   38 650
    //                   39 656
    //                   40 662
    //                   41 668
    //                   42 674
    //                   43 680
    //                   44 686
    //                   45 692
    //                   46 698
    //                   47 704
    //                   48 710
    //                   49 716
    //                   50 722
    //                   51 728
    //                   52 734
    //                   53 740
    //                   54 264
    //                   55 746
    //                   56 752
    //                   57 758;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L1 _L55 _L56 _L57
_L1:
        String s = (new StringBuilder("unknown-")).append(aeO.d(i)).toString();
_L61:
        stringbuffer.append(s);
        int k;
        if (f != aeD.i)
        {
            stringbuffer.append(" ");
            stringbuffer.append(f);
        } else
        {
            stringbuffer.append(" .");
        }
        stringbuffer.append(" <-");
        k = g.a();
        if (k == 0)
        {
            stringbuffer.append(" .");
        } else
        {
            j = 0;
            while (j < k) 
            {
                stringbuffer.append(' ');
                stringbuffer.append(g.a(j));
                j++;
            }
        }
        if (d)
        {
            stringbuffer.append(" call");
        }
        k = b.a();
        if (k == 0) goto _L59; else goto _L58
_L58:
        stringbuffer.append(" throws");
        int j = 0;
        while (j < k) 
        {
            stringbuffer.append(' ');
            if (b.a(j) == aeD.o)
            {
                stringbuffer.append("<any>");
            } else
            {
                stringbuffer.append(b.a(j));
            }
            j++;
        }
          goto _L60
_L2:
        s = "nop";
          goto _L61
_L3:
        s = "move";
          goto _L61
_L4:
        s = "move-param";
          goto _L61
_L5:
        s = "move-exception";
          goto _L61
_L6:
        s = "const";
          goto _L61
_L7:
        s = "goto";
          goto _L61
_L8:
        s = "if-eq";
          goto _L61
_L9:
        s = "if-ne";
          goto _L61
_L10:
        s = "if-lt";
          goto _L61
_L11:
        s = "if-ge";
          goto _L61
_L12:
        s = "if-le";
          goto _L61
_L13:
        s = "if-gt";
          goto _L61
_L14:
        s = "switch";
          goto _L61
_L15:
        s = "add";
          goto _L61
_L16:
        s = "sub";
          goto _L61
_L17:
        s = "mul";
          goto _L61
_L18:
        s = "div";
          goto _L61
_L19:
        s = "rem";
          goto _L61
_L20:
        s = "neg";
          goto _L61
_L21:
        s = "and";
          goto _L61
_L22:
        s = "or";
          goto _L61
_L23:
        s = "xor";
          goto _L61
_L24:
        s = "shl";
          goto _L61
_L25:
        s = "shr";
          goto _L61
_L26:
        s = "ushr";
          goto _L61
_L27:
        s = "not";
          goto _L61
_L28:
        s = "cmpl";
          goto _L61
_L29:
        s = "cmpg";
          goto _L61
_L30:
        s = "conv";
          goto _L61
_L31:
        s = "to-byte";
          goto _L61
_L32:
        s = "to-char";
          goto _L61
_L33:
        s = "to-short";
          goto _L61
_L34:
        s = "return";
          goto _L61
_L35:
        s = "array-length";
          goto _L61
_L36:
        s = "throw";
          goto _L61
_L37:
        s = "monitor-enter";
          goto _L61
_L38:
        s = "monitor-exit";
          goto _L61
_L39:
        s = "aget";
          goto _L61
_L40:
        s = "aput";
          goto _L61
_L41:
        s = "new-instance";
          goto _L61
_L42:
        s = "new-array";
          goto _L61
_L43:
        s = "filled-new-array";
          goto _L61
_L44:
        s = "check-cast";
          goto _L61
_L45:
        s = "instance-of";
          goto _L61
_L46:
        s = "get-field";
          goto _L61
_L47:
        s = "get-static";
          goto _L61
_L48:
        s = "put-field";
          goto _L61
_L49:
        s = "put-static";
          goto _L61
_L50:
        s = "invoke-static";
          goto _L61
_L51:
        s = "invoke-virtual";
          goto _L61
_L52:
        s = "invoke-super";
          goto _L61
_L53:
        s = "invoke-direct";
          goto _L61
_L54:
        s = "invoke-interface";
          goto _L61
_L55:
        s = "move-result";
          goto _L61
_L56:
        s = "move-result-pseudo";
          goto _L61
_L57:
        s = "fill-array-data";
          goto _L61
_L59:
        c;
        JVM INSTR tableswitch 1 5: default 868
    //                   1 907
    //                   2 917
    //                   3 927
    //                   4 937
    //                   5 948;
           goto _L62 _L63 _L64 _L65 _L66 _L67
_L62:
        stringbuffer.append((new StringBuilder(" ")).append(aeO.d(c)).toString());
_L60:
        stringbuffer.append('}');
        return stringbuffer.toString();
_L63:
        stringbuffer.append(" flows");
        continue; /* Loop/switch isn't completed */
_L64:
        stringbuffer.append(" returns");
        continue; /* Loop/switch isn't completed */
_L65:
        stringbuffer.append(" gotos");
        continue; /* Loop/switch isn't completed */
_L66:
        stringbuffer.append(" ifs");
        continue; /* Loop/switch isn't completed */
_L67:
        stringbuffer.append(" switches");
        if (true) goto _L60; else goto _L68
_L68:
    }
}
