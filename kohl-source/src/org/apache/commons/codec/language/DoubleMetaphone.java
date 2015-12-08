// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class DoubleMetaphone
    implements StringEncoder
{
    public class DoubleMetaphoneResult
    {

        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;
        final DoubleMetaphone this$0;

        public void append(char c)
        {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void append(char c, char c1)
        {
            appendPrimary(c);
            appendAlternate(c1);
        }

        public void append(String s)
        {
            appendPrimary(s);
            appendAlternate(s);
        }

        public void append(String s, String s1)
        {
            appendPrimary(s);
            appendAlternate(s1);
        }

        public void appendAlternate(char c)
        {
            if (alternate.length() < maxLength)
            {
                alternate.append(c);
            }
        }

        public void appendAlternate(String s)
        {
            int i = maxLength - alternate.length();
            if (s.length() <= i)
            {
                alternate.append(s);
                return;
            } else
            {
                alternate.append(s.substring(0, i));
                return;
            }
        }

        public void appendPrimary(char c)
        {
            if (primary.length() < maxLength)
            {
                primary.append(c);
            }
        }

        public void appendPrimary(String s)
        {
            int i = maxLength - primary.length();
            if (s.length() <= i)
            {
                primary.append(s);
                return;
            } else
            {
                primary.append(s.substring(0, i));
                return;
            }
        }

        public String getAlternate()
        {
            return alternate.toString();
        }

        public String getPrimary()
        {
            return primary.toString();
        }

        public boolean isComplete()
        {
            return primary.length() >= maxLength && alternate.length() >= maxLength;
        }

        public DoubleMetaphoneResult(int i)
        {
            this$0 = DoubleMetaphone.this;
            super();
            primary = new StringBuilder(getMaxCodeLen());
            alternate = new StringBuilder(getMaxCodeLen());
            maxLength = i;
        }
    }


    private static final String ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER[] = {
        "ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", 
        "ER"
    };
    private static final String L_R_N_M_B_H_F_V_W_SPACE[] = {
        "L", "R", "N", "M", "B", "H", "F", "V", "W", " "
    };
    private static final String L_T_K_S_N_M_B_Z[] = {
        "L", "T", "K", "S", "N", "M", "B", "Z"
    };
    private static final String SILENT_START[] = {
        "GN", "KN", "PN", "WR", "PS"
    };
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen;

    public DoubleMetaphone()
    {
        maxCodeLen = 4;
    }

    private String cleanInput(String s)
    {
        if (s != null)
        {
            if ((s = s.trim()).length() != 0)
            {
                return s.toUpperCase(Locale.ENGLISH);
            }
        }
        return null;
    }

    private boolean conditionC0(String s, int i)
    {
        boolean flag1 = false;
        if (!contains(s, i, 4, new String[] {
            "CHIA"
        })) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (i <= 1) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (isVowel(charAt(s, i - 2))) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!contains(s, i - 1, 3, new String[] {
            "ACH"
        })) goto _L4; else goto _L6
_L6:
        char c = charAt(s, i + 2);
        if (c != 'I' && c != 'E')
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!contains(s, i - 2, 6, new String[] {
            "BACHER", "MACHER"
        })) goto _L4; else goto _L7
_L7:
        return true;
    }

    private boolean conditionCH0(String s, int i)
    {
        while (i != 0 || !contains(s, i + 1, 5, new String[] {
            "HARAC", "HARIS"
        }) && !contains(s, i + 1, 3, new String[] {
            "HOR", "HYM", "HIA", "HEM"
        }) || contains(s, 0, 5, new String[] {
            "CHORE"
        })) 
        {
            return false;
        }
        return true;
    }

    private boolean conditionCH1(String s, int i)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (!contains(s, 0, 4, new String[] {
    "VAN ", "VON "
}) && !contains(s, 0, 3, new String[] {
    "SCH"
}) && !contains(s, i - 2, 6, new String[] {
    "ORCHES", "ARCHIT", "ORCHID"
}) && !contains(s, i + 2, 1, new String[] {
    "T", "S"
}))
            {
                if (!contains(s, i - 1, 1, new String[] {
    "A", "O", "U", "E"
}))
                {
                    flag = flag1;
                    if (i != 0)
                    {
                        break label0;
                    }
                }
                if (!contains(s, i + 2, 1, L_R_N_M_B_H_F_V_W_SPACE))
                {
                    flag = flag1;
                    if (i + 1 != s.length() - 1)
                    {
                        break label0;
                    }
                }
            }
            flag = true;
        }
        return flag;
    }

    private boolean conditionL0(String s, int i)
    {
        while (i == s.length() - 3 && contains(s, i - 1, 4, new String[] {
            "ILLO", "ILLA", "ALLE"
        }) || (contains(s, s.length() - 2, 2, new String[] {
            "AS", "OS"
        }) || contains(s, s.length() - 1, 1, new String[] {
            "A", "O"
        })) && contains(s, i - 1, 4, new String[] {
            "ALLE"
        })) 
        {
            return true;
        }
        return false;
    }

    private boolean conditionM0(String s, int i)
    {
        while (charAt(s, i + 1) == 'M' || contains(s, i - 1, 3, new String[] {
            "UMB"
        }) && (i + 1 == s.length() - 1 || contains(s, i + 2, 2, new String[] {
            "ER"
        }))) 
        {
            return true;
        }
        return false;
    }

    protected static transient boolean contains(String s, int i, int j, String as[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (i < 0) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (i + j > s.length()) goto _L2; else goto _L3
_L3:
        s = s.substring(i, i + j);
        j = as.length;
        i = 0;
_L8:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        if (!s.equals(as[i])) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int handleAEIOUY(DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (i == 0)
        {
            doublemetaphoneresult.append('A');
        }
        return i + 1;
    }

    private int handleC(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (conditionC0(s, i))
        {
            doublemetaphoneresult.append('K');
            i += 2;
        } else
        if (i == 0 && contains(s, i, 6, new String[] {
    "CAESAR"
}))
        {
            doublemetaphoneresult.append('S');
            i += 2;
        } else
        if (contains(s, i, 2, new String[] {
    "CH"
}))
        {
            i = handleCH(s, doublemetaphoneresult, i);
        } else
        if (contains(s, i, 2, new String[] {
    "CZ"
}) && !contains(s, i - 2, 4, new String[] {
    "WICZ"
}))
        {
            doublemetaphoneresult.append('S', 'X');
            i += 2;
        } else
        if (contains(s, i + 1, 3, new String[] {
    "CIA"
}))
        {
            doublemetaphoneresult.append('X');
            i += 3;
        } else
        {
            if (contains(s, i, 2, new String[] {
    "CC"
}) && (i != 1 || charAt(s, 0) != 'M'))
            {
                return handleCC(s, doublemetaphoneresult, i);
            }
            if (contains(s, i, 2, new String[] {
    "CK", "CG", "CQ"
}))
            {
                doublemetaphoneresult.append('K');
                i += 2;
            } else
            if (contains(s, i, 2, new String[] {
    "CI", "CE", "CY"
}))
            {
                if (contains(s, i, 3, new String[] {
    "CIO", "CIE", "CIA"
}))
                {
                    doublemetaphoneresult.append('S', 'X');
                } else
                {
                    doublemetaphoneresult.append('S');
                }
                i += 2;
            } else
            {
                doublemetaphoneresult.append('K');
                if (contains(s, i + 1, 2, new String[] {
    " C", " Q", " G"
}))
                {
                    i += 3;
                } else
                if (contains(s, i + 1, 1, new String[] {
    "C", "K", "Q"
}) && !contains(s, i + 1, 2, new String[] {
    "CE", "CI"
}))
                {
                    i += 2;
                } else
                {
                    i++;
                }
            }
        }
        return i;
    }

    private int handleCC(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (contains(s, i + 2, 1, new String[] {
    "I", "E", "H"
}) && !contains(s, i + 2, 2, new String[] {
    "HU"
}))
        {
            if (i == 1 && charAt(s, i - 1) == 'A' || contains(s, i - 1, 5, new String[] {
    "UCCEE", "UCCES"
}))
            {
                doublemetaphoneresult.append("KS");
            } else
            {
                doublemetaphoneresult.append('X');
            }
            return i + 3;
        } else
        {
            doublemetaphoneresult.append('K');
            return i + 2;
        }
    }

    private int handleCH(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (i > 0 && contains(s, i, 4, new String[] {
    "CHAE"
}))
        {
            doublemetaphoneresult.append('K', 'X');
            return i + 2;
        }
        if (conditionCH0(s, i))
        {
            doublemetaphoneresult.append('K');
            return i + 2;
        }
        if (conditionCH1(s, i))
        {
            doublemetaphoneresult.append('K');
            return i + 2;
        }
        if (i > 0)
        {
            if (contains(s, 0, 2, new String[] {
    "MC"
}))
            {
                doublemetaphoneresult.append('K');
            } else
            {
                doublemetaphoneresult.append('X', 'K');
            }
        } else
        {
            doublemetaphoneresult.append('X');
        }
        return i + 2;
    }

    private int handleD(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (contains(s, i, 2, new String[] {
    "DG"
}))
        {
            if (contains(s, i + 2, 1, new String[] {
    "I", "E", "Y"
}))
            {
                doublemetaphoneresult.append('J');
                return i + 3;
            } else
            {
                doublemetaphoneresult.append("TK");
                return i + 2;
            }
        }
        if (contains(s, i, 2, new String[] {
    "DT", "DD"
}))
        {
            doublemetaphoneresult.append('T');
            return i + 2;
        } else
        {
            doublemetaphoneresult.append('T');
            return i + 1;
        }
    }

    private int handleG(String s, DoubleMetaphoneResult doublemetaphoneresult, int i, boolean flag)
    {
        if (charAt(s, i + 1) == 'H')
        {
            return handleGH(s, doublemetaphoneresult, i);
        }
        if (charAt(s, i + 1) == 'N')
        {
            if (i == 1 && isVowel(charAt(s, 0)) && !flag)
            {
                doublemetaphoneresult.append("KN", "N");
            } else
            if (!contains(s, i + 2, 2, new String[] {
    "EY"
}) && (charAt(s, i + 1) != 'Y' && !flag))
            {
                doublemetaphoneresult.append("N", "KN");
            } else
            {
                doublemetaphoneresult.append("KN");
            }
            return i + 2;
        }
        if (contains(s, i + 1, 2, new String[] {
    "LI"
}) && !flag)
        {
            doublemetaphoneresult.append("KL", "L");
            return i + 2;
        }
        if (i == 0 && (charAt(s, i + 1) == 'Y' || contains(s, i + 1, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER)))
        {
            doublemetaphoneresult.append('K', 'J');
            return i + 2;
        }
        if ((contains(s, i + 1, 2, new String[] {
    "ER"
}) || charAt(s, i + 1) == 'Y') && !contains(s, 0, 6, new String[] {
    "DANGER", "RANGER", "MANGER"
}) && !contains(s, i - 1, 1, new String[] {
    "E", "I"
}) && !contains(s, i - 1, 3, new String[] {
    "RGY", "OGY"
}))
        {
            doublemetaphoneresult.append('K', 'J');
            return i + 2;
        }
        if (contains(s, i + 1, 1, new String[] {
    "E", "I", "Y"
}) || contains(s, i - 1, 4, new String[] {
    "AGGI", "OGGI"
}))
        {
            if (contains(s, 0, 4, new String[] {
    "VAN ", "VON "
}) || contains(s, 0, 3, new String[] {
    "SCH"
}) || contains(s, i + 1, 2, new String[] {
    "ET"
}))
            {
                doublemetaphoneresult.append('K');
            } else
            if (contains(s, i + 1, 3, new String[] {
    "IER"
}))
            {
                doublemetaphoneresult.append('J');
            } else
            {
                doublemetaphoneresult.append('J', 'K');
            }
            return i + 2;
        }
        if (charAt(s, i + 1) == 'G')
        {
            doublemetaphoneresult.append('K');
            return i + 2;
        } else
        {
            doublemetaphoneresult.append('K');
            return i + 1;
        }
    }

    private int handleGH(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (i > 0 && !isVowel(charAt(s, i - 1)))
        {
            doublemetaphoneresult.append('K');
            return i + 2;
        }
        if (i == 0)
        {
            if (charAt(s, i + 2) == 'I')
            {
                doublemetaphoneresult.append('J');
            } else
            {
                doublemetaphoneresult.append('K');
            }
            return i + 2;
        }
        if (i > 1 && contains(s, i - 2, 1, new String[] {
    "B", "H", "D"
}) || i > 2 && contains(s, i - 3, 1, new String[] {
    "B", "H", "D"
}) || i > 3 && contains(s, i - 4, 1, new String[] {
    "B", "H"
}))
        {
            return i + 2;
        }
        if (i <= 2 || charAt(s, i - 1) != 'U' || !contains(s, i - 3, 1, new String[] {
            "C", "G", "L", "R", "T"
        })) goto _L2; else goto _L1
_L1:
        doublemetaphoneresult.append('F');
_L4:
        return i + 2;
_L2:
        if (i > 0 && charAt(s, i - 1) != 'I')
        {
            doublemetaphoneresult.append('K');
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int handleH(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if ((i == 0 || isVowel(charAt(s, i - 1))) && isVowel(charAt(s, i + 1)))
        {
            doublemetaphoneresult.append('H');
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleJ(String s, DoubleMetaphoneResult doublemetaphoneresult, int i, boolean flag)
    {
        if (contains(s, i, 4, new String[] {
    "JOSE"
}) || contains(s, 0, 4, new String[] {
    "SAN "
}))
        {
            if (i == 0 && charAt(s, i + 4) == ' ' || s.length() == 4 || contains(s, 0, 4, new String[] {
    "SAN "
}))
            {
                doublemetaphoneresult.append('H');
            } else
            {
                doublemetaphoneresult.append('J', 'H');
            }
            return i + 1;
        }
        if (i == 0 && !contains(s, i, 4, new String[] {
    "JOSE"
}))
        {
            doublemetaphoneresult.append('J', 'A');
        } else
        if (isVowel(charAt(s, i - 1)) && !flag && (charAt(s, i + 1) == 'A' || charAt(s, i + 1) == 'O'))
        {
            doublemetaphoneresult.append('J', 'H');
        } else
        if (i == s.length() - 1)
        {
            doublemetaphoneresult.append('J', ' ');
        } else
        if (!contains(s, i + 1, 1, L_T_K_S_N_M_B_Z) && !contains(s, i - 1, 1, new String[] {
    "S", "K", "L"
}))
        {
            doublemetaphoneresult.append('J');
        }
        if (charAt(s, i + 1) == 'J')
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleL(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (charAt(s, i + 1) == 'L')
        {
            if (conditionL0(s, i))
            {
                doublemetaphoneresult.appendPrimary('L');
            } else
            {
                doublemetaphoneresult.append('L');
            }
            return i + 2;
        } else
        {
            doublemetaphoneresult.append('L');
            return i + 1;
        }
    }

    private int handleP(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (charAt(s, i + 1) == 'H')
        {
            doublemetaphoneresult.append('F');
            return i + 2;
        }
        doublemetaphoneresult.append('P');
        if (contains(s, i + 1, 1, new String[] {
    "P", "B"
}))
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleR(String s, DoubleMetaphoneResult doublemetaphoneresult, int i, boolean flag)
    {
        if (i == s.length() - 1 && !flag && contains(s, i - 2, 2, new String[] {
    "IE"
}) && !contains(s, i - 4, 2, new String[] {
    "ME", "MA"
}))
        {
            doublemetaphoneresult.appendAlternate('R');
        } else
        {
            doublemetaphoneresult.append('R');
        }
        if (charAt(s, i + 1) == 'R')
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleS(String s, DoubleMetaphoneResult doublemetaphoneresult, int i, boolean flag)
    {
        if (contains(s, i - 1, 3, new String[] {
    "ISL", "YSL"
}))
        {
            return i + 1;
        }
        if (i == 0 && contains(s, i, 5, new String[] {
    "SUGAR"
}))
        {
            doublemetaphoneresult.append('X', 'S');
            return i + 1;
        }
        if (contains(s, i, 2, new String[] {
    "SH"
}))
        {
            if (contains(s, i + 1, 4, new String[] {
    "HEIM", "HOEK", "HOLM", "HOLZ"
}))
            {
                doublemetaphoneresult.append('S');
            } else
            {
                doublemetaphoneresult.append('X');
            }
            return i + 2;
        }
        if (contains(s, i, 3, new String[] {
    "SIO", "SIA"
}) || contains(s, i, 4, new String[] {
    "SIAN"
}))
        {
            if (flag)
            {
                doublemetaphoneresult.append('S');
            } else
            {
                doublemetaphoneresult.append('S', 'X');
            }
            return i + 3;
        }
        if (i == 0 && contains(s, i + 1, 1, new String[] {
    "M", "N", "L", "W"
}) || contains(s, i + 1, 1, new String[] {
    "Z"
}))
        {
            doublemetaphoneresult.append('S', 'X');
            if (contains(s, i + 1, 1, new String[] {
    "Z"
}))
            {
                return i + 2;
            } else
            {
                return i + 1;
            }
        }
        if (contains(s, i, 2, new String[] {
    "SC"
}))
        {
            return handleSC(s, doublemetaphoneresult, i);
        }
        if (i == s.length() - 1 && contains(s, i - 2, 2, new String[] {
    "AI", "OI"
}))
        {
            doublemetaphoneresult.appendAlternate('S');
        } else
        {
            doublemetaphoneresult.append('S');
        }
        if (contains(s, i + 1, 1, new String[] {
    "S", "Z"
}))
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleSC(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (charAt(s, i + 2) == 'H')
        {
            if (contains(s, i + 3, 2, new String[] {
    "OO", "ER", "EN", "UY", "ED", "EM"
}))
            {
                if (contains(s, i + 3, 2, new String[] {
    "ER", "EN"
}))
                {
                    doublemetaphoneresult.append("X", "SK");
                } else
                {
                    doublemetaphoneresult.append("SK");
                }
            } else
            if (i == 0 && !isVowel(charAt(s, 3)) && charAt(s, 3) != 'W')
            {
                doublemetaphoneresult.append('X', 'S');
            } else
            {
                doublemetaphoneresult.append('X');
            }
        } else
        if (contains(s, i + 2, 1, new String[] {
    "I", "E", "Y"
}))
        {
            doublemetaphoneresult.append('S');
        } else
        {
            doublemetaphoneresult.append("SK");
        }
        return i + 3;
    }

    private int handleT(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (contains(s, i, 4, new String[] {
    "TION"
}))
        {
            doublemetaphoneresult.append('X');
            return i + 3;
        }
        if (contains(s, i, 3, new String[] {
    "TIA", "TCH"
}))
        {
            doublemetaphoneresult.append('X');
            return i + 3;
        }
        if (contains(s, i, 2, new String[] {
    "TH"
}) || contains(s, i, 3, new String[] {
    "TTH"
}))
        {
            if (contains(s, i + 2, 2, new String[] {
    "OM", "AM"
}) || contains(s, 0, 4, new String[] {
    "VAN ", "VON "
}) || contains(s, 0, 3, new String[] {
    "SCH"
}))
            {
                doublemetaphoneresult.append('T');
            } else
            {
                doublemetaphoneresult.append('0', 'T');
            }
            return i + 2;
        }
        doublemetaphoneresult.append('T');
        if (contains(s, i + 1, 1, new String[] {
    "T", "D"
}))
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleW(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (contains(s, i, 2, new String[] {
    "WR"
}))
        {
            doublemetaphoneresult.append('R');
            return i + 2;
        }
        if (i == 0 && (isVowel(charAt(s, i + 1)) || contains(s, i, 2, new String[] {
    "WH"
})))
        {
            if (isVowel(charAt(s, i + 1)))
            {
                doublemetaphoneresult.append('A', 'F');
            } else
            {
                doublemetaphoneresult.append('A');
            }
            return i + 1;
        }
        if (i == s.length() - 1 && isVowel(charAt(s, i - 1)) || contains(s, i - 1, 5, new String[] {
    "EWSKI", "EWSKY", "OWSKI", "OWSKY"
}) || contains(s, 0, 3, new String[] {
    "SCH"
}))
        {
            doublemetaphoneresult.appendAlternate('F');
            return i + 1;
        }
        if (contains(s, i, 4, new String[] {
    "WICZ", "WITZ"
}))
        {
            doublemetaphoneresult.append("TS", "FX");
            return i + 4;
        } else
        {
            return i + 1;
        }
    }

    private int handleX(String s, DoubleMetaphoneResult doublemetaphoneresult, int i)
    {
        if (i == 0)
        {
            doublemetaphoneresult.append('S');
            return i + 1;
        }
        if (i != s.length() - 1 || !contains(s, i - 3, 3, new String[] {
    "IAU", "EAU"
}) && !contains(s, i - 2, 2, new String[] {
    "AU", "OU"
}))
        {
            doublemetaphoneresult.append("KS");
        }
        if (contains(s, i + 1, 1, new String[] {
    "C", "X"
}))
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private int handleZ(String s, DoubleMetaphoneResult doublemetaphoneresult, int i, boolean flag)
    {
        if (charAt(s, i + 1) == 'H')
        {
            doublemetaphoneresult.append('J');
            return i + 2;
        }
        if (contains(s, i + 1, 2, new String[] {
    "ZO", "ZI", "ZA"
}) || flag && i > 0 && charAt(s, i - 1) != 'T')
        {
            doublemetaphoneresult.append("S", "TS");
        } else
        {
            doublemetaphoneresult.append('S');
        }
        if (charAt(s, i + 1) == 'Z')
        {
            return i + 2;
        } else
        {
            return i + 1;
        }
    }

    private boolean isSilentStart(String s)
    {
        boolean flag1 = false;
        String as[] = SILENT_START;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.startsWith(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private boolean isSlavoGermanic(String s)
    {
        return s.indexOf('W') > -1 || s.indexOf('K') > -1 || s.indexOf("CZ") > -1 || s.indexOf("WITZ") > -1;
    }

    private boolean isVowel(char c)
    {
        return "AEIOUY".indexOf(c) != -1;
    }

    protected char charAt(String s, int i)
    {
        if (i < 0 || i >= s.length())
        {
            return '\0';
        } else
        {
            return s.charAt(i);
        }
    }

    public String doubleMetaphone(String s)
    {
        return doubleMetaphone(s, false);
    }

    public String doubleMetaphone(String s, boolean flag)
    {
        s = cleanInput(s);
        if (s == null)
        {
            return null;
        }
        boolean flag1 = isSlavoGermanic(s);
        DoubleMetaphoneResult doublemetaphoneresult;
        int i;
        if (isSilentStart(s))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        doublemetaphoneresult = new DoubleMetaphoneResult(getMaxCodeLen());
        do
        {
            if (!doublemetaphoneresult.isComplete() && i <= s.length() - 1)
            {
                switch (s.charAt(i))
                {
                default:
                    i++;
                    break;

                case 65: // 'A'
                case 69: // 'E'
                case 73: // 'I'
                case 79: // 'O'
                case 85: // 'U'
                case 89: // 'Y'
                    i = handleAEIOUY(doublemetaphoneresult, i);
                    break;

                case 66: // 'B'
                    doublemetaphoneresult.append('P');
                    if (charAt(s, i + 1) == 'B')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 199: 
                    doublemetaphoneresult.append('S');
                    i++;
                    break;

                case 67: // 'C'
                    i = handleC(s, doublemetaphoneresult, i);
                    break;

                case 68: // 'D'
                    i = handleD(s, doublemetaphoneresult, i);
                    break;

                case 70: // 'F'
                    doublemetaphoneresult.append('F');
                    if (charAt(s, i + 1) == 'F')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 71: // 'G'
                    i = handleG(s, doublemetaphoneresult, i, flag1);
                    break;

                case 72: // 'H'
                    i = handleH(s, doublemetaphoneresult, i);
                    break;

                case 74: // 'J'
                    i = handleJ(s, doublemetaphoneresult, i, flag1);
                    break;

                case 75: // 'K'
                    doublemetaphoneresult.append('K');
                    if (charAt(s, i + 1) == 'K')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 76: // 'L'
                    i = handleL(s, doublemetaphoneresult, i);
                    break;

                case 77: // 'M'
                    doublemetaphoneresult.append('M');
                    if (conditionM0(s, i))
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 78: // 'N'
                    doublemetaphoneresult.append('N');
                    if (charAt(s, i + 1) == 'N')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 209: 
                    doublemetaphoneresult.append('N');
                    i++;
                    break;

                case 80: // 'P'
                    i = handleP(s, doublemetaphoneresult, i);
                    break;

                case 81: // 'Q'
                    doublemetaphoneresult.append('K');
                    if (charAt(s, i + 1) == 'Q')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 82: // 'R'
                    i = handleR(s, doublemetaphoneresult, i, flag1);
                    break;

                case 83: // 'S'
                    i = handleS(s, doublemetaphoneresult, i, flag1);
                    break;

                case 84: // 'T'
                    i = handleT(s, doublemetaphoneresult, i);
                    break;

                case 86: // 'V'
                    doublemetaphoneresult.append('F');
                    if (charAt(s, i + 1) == 'V')
                    {
                        i += 2;
                    } else
                    {
                        i++;
                    }
                    break;

                case 87: // 'W'
                    i = handleW(s, doublemetaphoneresult, i);
                    break;

                case 88: // 'X'
                    i = handleX(s, doublemetaphoneresult, i);
                    break;

                case 90: // 'Z'
                    i = handleZ(s, doublemetaphoneresult, i, flag1);
                    break;
                }
            } else
            if (flag)
            {
                return doublemetaphoneresult.getAlternate();
            } else
            {
                return doublemetaphoneresult.getPrimary();
            }
        } while (true);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
        } else
        {
            return doubleMetaphone((String)obj);
        }
    }

    public String encode(String s)
    {
        return doubleMetaphone(s);
    }

    public int getMaxCodeLen()
    {
        return maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String s, String s1)
    {
        return isDoubleMetaphoneEqual(s, s1, false);
    }

    public boolean isDoubleMetaphoneEqual(String s, String s1, boolean flag)
    {
        return doubleMetaphone(s, flag).equals(doubleMetaphone(s1, flag));
    }

    public void setMaxCodeLen(int i)
    {
        maxCodeLen = i;
    }

}
