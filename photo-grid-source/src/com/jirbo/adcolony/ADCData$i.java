// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            af, z

class 
{

    void a(af af1)
    {
    }

    void a(af af1, String s)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
label7:
                                    {
                                        if (s == null)
                                        {
                                            return;
                                        }
                                        af1.b('"');
                                        int j1 = s.length();
                                        int i = 0;
label8:
                                        do
                                        {
                                            {
                                                if (i >= j1)
                                                {
                                                    break label0;
                                                }
                                                char c1 = s.charAt(i);
                                                switch (c1)
                                                {
                                                default:
                                                    if (c1 >= ' ' && c1 <= '~')
                                                    {
                                                        af1.b(c1);
                                                    } else
                                                    {
                                                        af1.a("\\u");
                                                        int i1 = c1;
                                                        int j = 0;
                                                        while (j < 4) 
                                                        {
                                                            int k1 = i1 >> 12 & 0xf;
                                                            i1 <<= 4;
                                                            if (k1 <= 9)
                                                            {
                                                                af1.a(k1);
                                                            } else
                                                            {
                                                                af1.b((char)((k1 - 10) + 97));
                                                            }
                                                            j++;
                                                        }
                                                    }
                                                    break;

                                                case 8: // '\b'
                                                    break label5;

                                                case 9: // '\t'
                                                    break label1;

                                                case 10: // '\n'
                                                    break label3;

                                                case 12: // '\f'
                                                    break label4;

                                                case 13: // '\r'
                                                    break label2;

                                                case 34: // '"'
                                                    break label8;

                                                case 47: // '/'
                                                    break label6;

                                                case 92: // '\\'
                                                    break label7;
                                                }
                                            }
                                            i++;
                                        } while (true);
                                        af1.a("\\\"");
                                        break MISSING_BLOCK_LABEL_125;
                                    }
                                    af1.a("\\\\");
                                    break MISSING_BLOCK_LABEL_125;
                                }
                                af1.a("\\/");
                                break MISSING_BLOCK_LABEL_125;
                            }
                            af1.a("\\b");
                            break MISSING_BLOCK_LABEL_125;
                        }
                        af1.a("\\f");
                        break MISSING_BLOCK_LABEL_125;
                    }
                    af1.a("\\n");
                    break MISSING_BLOCK_LABEL_125;
                }
                af1.a("\\r");
                break MISSING_BLOCK_LABEL_125;
            }
            af1.a("\\t");
            break MISSING_BLOCK_LABEL_125;
        }
        af1.b('"');
    }

    boolean a()
    {
        return false;
    }

    String b()
    {
        return q();
    }

    boolean b_()
    {
        return false;
    }

    boolean c()
    {
        return false;
    }

    boolean c_()
    {
        return false;
    }

    double d()
    {
        return 0.0D;
    }

    int e()
    {
        return 0;
    }

    boolean f()
    {
        return false;
    }

    boolean g()
    {
        return true;
    }

    q h()
    {
        return null;
    }

    boolean k()
    {
        return false;
    }

    boolean l()
    {
        return false;
    }

    boolean m()
    {
        return false;
    }

    q n()
    {
        return null;
    }

    boolean p()
    {
        return b_() || c();
    }

    String q()
    {
        z z1 = new z();
        a(z1);
        return z1.toString();
    }

    public String toString()
    {
        return q();
    }

    ()
    {
    }
}
