// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

final class FieldParser
{

    private static final Object FOUR_DIGIT_DATA_LENGTH[][];
    private static final Object THREE_DIGIT_DATA_LENGTH[][];
    private static final Object THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH[][];
    private static final Object TWO_DIGIT_DATA_LENGTH[][];
    private static final Object VARIABLE_LENGTH;

    private FieldParser()
    {
    }

    static String parseFieldsInGeneralPurpose(String s)
        throws NotFoundException
    {
        if (s.isEmpty())
        {
            return null;
        }
        if (s.length() < 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, 2);
        Object aobj[][] = TWO_DIGIT_DATA_LENGTH;
        int i1 = aobj.length;
        for (int i = 0; i < i1; i++)
        {
            Object aobj1[] = aobj[i];
            if (aobj1[0].equals(s1))
            {
                if (aobj1[1] == VARIABLE_LENGTH)
                {
                    return processVariableAI(2, ((Integer)aobj1[2]).intValue(), s);
                } else
                {
                    return processFixedAI(2, ((Integer)aobj1[1]).intValue(), s);
                }
            }
        }

        if (s.length() < 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        s1 = s.substring(0, 3);
        aobj = THREE_DIGIT_DATA_LENGTH;
        i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            Object aobj2[] = aobj[j];
            if (aobj2[0].equals(s1))
            {
                if (aobj2[1] == VARIABLE_LENGTH)
                {
                    return processVariableAI(3, ((Integer)aobj2[2]).intValue(), s);
                } else
                {
                    return processFixedAI(3, ((Integer)aobj2[1]).intValue(), s);
                }
            }
        }

        aobj = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
        i1 = aobj.length;
        for (int k = 0; k < i1; k++)
        {
            Object aobj3[] = aobj[k];
            if (aobj3[0].equals(s1))
            {
                if (aobj3[1] == VARIABLE_LENGTH)
                {
                    return processVariableAI(4, ((Integer)aobj3[2]).intValue(), s);
                } else
                {
                    return processFixedAI(4, ((Integer)aobj3[1]).intValue(), s);
                }
            }
        }

        if (s.length() < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        s1 = s.substring(0, 4);
        aobj = FOUR_DIGIT_DATA_LENGTH;
        i1 = aobj.length;
        for (int l = 0; l < i1; l++)
        {
            Object aobj4[] = aobj[l];
            if (aobj4[0].equals(s1))
            {
                if (aobj4[1] == VARIABLE_LENGTH)
                {
                    return processVariableAI(4, ((Integer)aobj4[2]).intValue(), s);
                } else
                {
                    return processFixedAI(4, ((Integer)aobj4[1]).intValue(), s);
                }
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private static String processFixedAI(int i, int j, String s)
        throws NotFoundException
    {
        if (s.length() < i)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, i);
        if (s.length() < i + j)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s2 = s.substring(i, i + j);
        s = s.substring(i + j);
        s1 = (new StringBuilder()).append('(').append(s1).append(')').append(s2).toString();
        s = parseFieldsInGeneralPurpose(s);
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1).append(s).toString();
        }
    }

    private static String processVariableAI(int i, int j, String s)
        throws NotFoundException
    {
        String s1 = s.substring(0, i);
        String s2;
        if (s.length() < i + j)
        {
            j = s.length();
        } else
        {
            j = i + j;
        }
        s2 = s.substring(i, j);
        s = s.substring(j);
        s1 = (new StringBuilder()).append('(').append(s1).append(')').append(s2).toString();
        s = parseFieldsInGeneralPurpose(s);
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1).append(s).toString();
        }
    }

    static 
    {
        VARIABLE_LENGTH = new Object();
        Object aobj9[] = {
            "01", Integer.valueOf(14)
        };
        Object obj = VARIABLE_LENGTH;
        Object aobj10[] = {
            "15", Integer.valueOf(6)
        };
        Object aobj11[] = {
            "17", Integer.valueOf(6)
        };
        Object obj1 = VARIABLE_LENGTH;
        Object aobj12[] = {
            "22", VARIABLE_LENGTH, Integer.valueOf(29)
        };
        Object obj2 = VARIABLE_LENGTH;
        Object aobj13[] = {
            "37", VARIABLE_LENGTH, Integer.valueOf(8)
        };
        Object obj3 = VARIABLE_LENGTH;
        Object aobj14[] = {
            "91", VARIABLE_LENGTH, Integer.valueOf(30)
        };
        Object aobj15[] = {
            "92", VARIABLE_LENGTH, Integer.valueOf(30)
        };
        Object aobj16[] = {
            "93", VARIABLE_LENGTH, Integer.valueOf(30)
        };
        Object obj4 = VARIABLE_LENGTH;
        Object obj5 = VARIABLE_LENGTH;
        Object obj6 = VARIABLE_LENGTH;
        Object obj7 = VARIABLE_LENGTH;
        Object obj8 = VARIABLE_LENGTH;
        Object aobj17[] = {
            "99", VARIABLE_LENGTH, Integer.valueOf(30)
        };
        TWO_DIGIT_DATA_LENGTH = (new Object[][] {
            new Object[] {
                "00", Integer.valueOf(18)
            }, aobj9, new Object[] {
                "02", Integer.valueOf(14)
            }, new Object[] {
                "10", obj, Integer.valueOf(20)
            }, new Object[] {
                "11", Integer.valueOf(6)
            }, new Object[] {
                "12", Integer.valueOf(6)
            }, new Object[] {
                "13", Integer.valueOf(6)
            }, aobj10, aobj11, new Object[] {
                "20", Integer.valueOf(2)
            }, new Object[] {
                "21", obj1, Integer.valueOf(20)
            }, aobj12, new Object[] {
                "30", obj2, Integer.valueOf(8)
            }, aobj13, new Object[] {
                "90", obj3, Integer.valueOf(30)
            }, aobj14, aobj15, aobj16, new Object[] {
                "94", obj4, Integer.valueOf(30)
            }, new Object[] {
                "95", obj5, Integer.valueOf(30)
            }, new Object[] {
                "96", obj6, Integer.valueOf(30)
            }, new Object[] {
                "97", obj7, Integer.valueOf(30)
            }, new Object[] {
                "98", obj8, Integer.valueOf(30)
            }, aobj17
        });
        obj = VARIABLE_LENGTH;
        obj1 = VARIABLE_LENGTH;
        obj2 = VARIABLE_LENGTH;
        obj3 = VARIABLE_LENGTH;
        obj4 = VARIABLE_LENGTH;
        obj5 = VARIABLE_LENGTH;
        obj6 = VARIABLE_LENGTH;
        aobj9 = (new Object[] {
            "400", VARIABLE_LENGTH, Integer.valueOf(30)
        });
        aobj10 = (new Object[] {
            "401", VARIABLE_LENGTH, Integer.valueOf(30)
        });
        aobj11 = (new Object[] {
            "402", Integer.valueOf(17)
        });
        aobj12 = (new Object[] {
            "403", VARIABLE_LENGTH, Integer.valueOf(30)
        });
        aobj13 = (new Object[] {
            "410", Integer.valueOf(13)
        });
        aobj14 = (new Object[] {
            "411", Integer.valueOf(13)
        });
        aobj15 = (new Object[] {
            "412", Integer.valueOf(13)
        });
        aobj16 = (new Object[] {
            "413", Integer.valueOf(13)
        });
        aobj17 = (new Object[] {
            "414", Integer.valueOf(13)
        });
        Object aobj18[] = {
            "420", VARIABLE_LENGTH, Integer.valueOf(20)
        };
        obj7 = VARIABLE_LENGTH;
        Object aobj19[] = {
            "422", Integer.valueOf(3)
        };
        obj8 = VARIABLE_LENGTH;
        Object aobj20[] = {
            "425", Integer.valueOf(3)
        };
        THREE_DIGIT_DATA_LENGTH = (new Object[][] {
            new Object[] {
                "240", obj, Integer.valueOf(30)
            }, new Object[] {
                "241", obj1, Integer.valueOf(30)
            }, new Object[] {
                "242", obj2, Integer.valueOf(6)
            }, new Object[] {
                "250", obj3, Integer.valueOf(30)
            }, new Object[] {
                "251", obj4, Integer.valueOf(30)
            }, new Object[] {
                "253", obj5, Integer.valueOf(17)
            }, new Object[] {
                "254", obj6, Integer.valueOf(20)
            }, aobj9, aobj10, aobj11, aobj12, aobj13, aobj14, aobj15, aobj16, aobj17, aobj18, new Object[] {
                "421", obj7, Integer.valueOf(15)
            }, aobj19, new Object[] {
                "423", obj8, Integer.valueOf(15)
            }, new Object[] {
                "424", Integer.valueOf(3)
            }, aobj20, new Object[] {
                "426", Integer.valueOf(3)
            }
        });
        Object aobj[] = {
            "310", Integer.valueOf(6)
        };
        Object aobj1[] = {
            "312", Integer.valueOf(6)
        };
        Object aobj2[] = {
            "313", Integer.valueOf(6)
        };
        Object aobj3[] = {
            "314", Integer.valueOf(6)
        };
        Object aobj4[] = {
            "316", Integer.valueOf(6)
        };
        Object aobj5[] = {
            "320", Integer.valueOf(6)
        };
        Object aobj6[] = {
            "321", Integer.valueOf(6)
        };
        Object aobj7[] = {
            "322", Integer.valueOf(6)
        };
        Object aobj8[] = {
            "323", Integer.valueOf(6)
        };
        aobj9 = (new Object[] {
            "324", Integer.valueOf(6)
        });
        aobj10 = (new Object[] {
            "325", Integer.valueOf(6)
        });
        aobj11 = (new Object[] {
            "326", Integer.valueOf(6)
        });
        aobj12 = (new Object[] {
            "327", Integer.valueOf(6)
        });
        aobj13 = (new Object[] {
            "328", Integer.valueOf(6)
        });
        aobj14 = (new Object[] {
            "329", Integer.valueOf(6)
        });
        aobj15 = (new Object[] {
            "330", Integer.valueOf(6)
        });
        aobj16 = (new Object[] {
            "331", Integer.valueOf(6)
        });
        aobj17 = (new Object[] {
            "332", Integer.valueOf(6)
        });
        aobj18 = (new Object[] {
            "333", Integer.valueOf(6)
        });
        aobj19 = (new Object[] {
            "334", Integer.valueOf(6)
        });
        aobj20 = (new Object[] {
            "335", Integer.valueOf(6)
        });
        Object aobj21[] = {
            "340", Integer.valueOf(6)
        };
        Object aobj22[] = {
            "341", Integer.valueOf(6)
        };
        Object aobj23[] = {
            "342", Integer.valueOf(6)
        };
        Object aobj24[] = {
            "343", Integer.valueOf(6)
        };
        Object aobj25[] = {
            "344", Integer.valueOf(6)
        };
        Object aobj26[] = {
            "345", Integer.valueOf(6)
        };
        Object aobj27[] = {
            "346", Integer.valueOf(6)
        };
        Object aobj28[] = {
            "349", Integer.valueOf(6)
        };
        Object aobj29[] = {
            "350", Integer.valueOf(6)
        };
        Object aobj30[] = {
            "351", Integer.valueOf(6)
        };
        Object aobj31[] = {
            "352", Integer.valueOf(6)
        };
        Object aobj32[] = {
            "353", Integer.valueOf(6)
        };
        Object aobj33[] = {
            "354", Integer.valueOf(6)
        };
        Object aobj34[] = {
            "356", Integer.valueOf(6)
        };
        Object aobj35[] = {
            "357", Integer.valueOf(6)
        };
        Object aobj36[] = {
            "360", Integer.valueOf(6)
        };
        Object aobj37[] = {
            "361", Integer.valueOf(6)
        };
        Object aobj38[] = {
            "362", Integer.valueOf(6)
        };
        Object aobj39[] = {
            "363", Integer.valueOf(6)
        };
        Object aobj40[] = {
            "364", Integer.valueOf(6)
        };
        Object aobj41[] = {
            "365", Integer.valueOf(6)
        };
        Object aobj42[] = {
            "366", Integer.valueOf(6)
        };
        Object aobj43[] = {
            "367", Integer.valueOf(6)
        };
        Object aobj44[] = {
            "368", Integer.valueOf(6)
        };
        Object aobj45[] = {
            "369", Integer.valueOf(6)
        };
        Object aobj46[] = {
            "390", VARIABLE_LENGTH, Integer.valueOf(15)
        };
        Object aobj47[] = {
            "391", VARIABLE_LENGTH, Integer.valueOf(18)
        };
        Object aobj48[] = {
            "392", VARIABLE_LENGTH, Integer.valueOf(15)
        };
        Object aobj49[] = {
            "393", VARIABLE_LENGTH, Integer.valueOf(18)
        };
        Object aobj50[] = {
            "703", VARIABLE_LENGTH, Integer.valueOf(30)
        };
        THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = (new Object[][] {
            aobj, new Object[] {
                "311", Integer.valueOf(6)
            }, aobj1, aobj2, aobj3, new Object[] {
                "315", Integer.valueOf(6)
            }, aobj4, aobj5, aobj6, aobj7, 
            aobj8, aobj9, aobj10, aobj11, aobj12, aobj13, aobj14, aobj15, aobj16, aobj17, 
            aobj18, aobj19, aobj20, new Object[] {
                "336", Integer.valueOf(6)
            }, aobj21, aobj22, aobj23, aobj24, aobj25, aobj26, 
            aobj27, new Object[] {
                "347", Integer.valueOf(6)
            }, new Object[] {
                "348", Integer.valueOf(6)
            }, aobj28, aobj29, aobj30, aobj31, aobj32, aobj33, new Object[] {
                "355", Integer.valueOf(6)
            }, 
            aobj34, aobj35, aobj36, aobj37, aobj38, aobj39, aobj40, aobj41, aobj42, aobj43, 
            aobj44, aobj45, aobj46, aobj47, aobj48, aobj49, aobj50
        });
        aobj6 = (new Object[] {
            "7002", VARIABLE_LENGTH, Integer.valueOf(30)
        });
        aobj = ((Object []) (VARIABLE_LENGTH));
        aobj1 = ((Object []) (VARIABLE_LENGTH));
        aobj2 = ((Object []) (VARIABLE_LENGTH));
        aobj7 = (new Object[] {
            "8005", Integer.valueOf(6)
        });
        aobj3 = ((Object []) (VARIABLE_LENGTH));
        aobj4 = ((Object []) (VARIABLE_LENGTH));
        aobj8 = (new Object[] {
            "8018", Integer.valueOf(18)
        });
        aobj9 = (new Object[] {
            "8020", VARIABLE_LENGTH, Integer.valueOf(25)
        });
        aobj10 = (new Object[] {
            "8100", Integer.valueOf(6)
        });
        aobj11 = (new Object[] {
            "8101", Integer.valueOf(10)
        });
        aobj12 = (new Object[] {
            "8110", VARIABLE_LENGTH, Integer.valueOf(70)
        });
        aobj5 = ((Object []) (VARIABLE_LENGTH));
        FOUR_DIGIT_DATA_LENGTH = (new Object[][] {
            new Object[] {
                "7001", Integer.valueOf(13)
            }, aobj6, new Object[] {
                "7003", Integer.valueOf(10)
            }, new Object[] {
                "8001", Integer.valueOf(14)
            }, new Object[] {
                "8002", aobj, Integer.valueOf(20)
            }, new Object[] {
                "8003", aobj1, Integer.valueOf(30)
            }, new Object[] {
                "8004", aobj2, Integer.valueOf(30)
            }, aobj7, new Object[] {
                "8006", Integer.valueOf(18)
            }, new Object[] {
                "8007", aobj3, Integer.valueOf(30)
            }, new Object[] {
                "8008", aobj4, Integer.valueOf(12)
            }, aobj8, aobj9, aobj10, aobj11, new Object[] {
                "8102", Integer.valueOf(2)
            }, aobj12, new Object[] {
                "8200", aobj5, Integer.valueOf(70)
            }
        });
    }
}
