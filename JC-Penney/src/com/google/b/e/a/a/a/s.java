// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.m;

final class s
{

    private static final Object a;
    private static final Object b[][];
    private static final Object c[][];
    private static final Object d[][];
    private static final Object e[][];

    private static String a(int i, int j, String s1)
    {
        if (s1.length() < i)
        {
            throw m.a();
        }
        String s2 = s1.substring(0, i);
        if (s1.length() < i + j)
        {
            throw m.a();
        }
        String s3 = s1.substring(i, i + j);
        s1 = s1.substring(i + j);
        s2 = (new StringBuilder()).append('(').append(s2).append(')').append(s3).toString();
        s1 = a(s1);
        if (s1 == null)
        {
            return s2;
        } else
        {
            return (new StringBuilder()).append(s2).append(s1).toString();
        }
    }

    static String a(String s1)
    {
        if (s1.isEmpty())
        {
            return null;
        }
        if (s1.length() < 2)
        {
            throw m.a();
        }
        String s2 = s1.substring(0, 2);
        Object aobj[][] = b;
        int i1 = aobj.length;
        for (int i = 0; i < i1; i++)
        {
            Object aobj1[] = aobj[i];
            if (aobj1[0].equals(s2))
            {
                if (aobj1[1] == a)
                {
                    return b(2, ((Integer)aobj1[2]).intValue(), s1);
                } else
                {
                    return a(2, ((Integer)aobj1[1]).intValue(), s1);
                }
            }
        }

        if (s1.length() < 3)
        {
            throw m.a();
        }
        s2 = s1.substring(0, 3);
        aobj = c;
        i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            Object aobj2[] = aobj[j];
            if (aobj2[0].equals(s2))
            {
                if (aobj2[1] == a)
                {
                    return b(3, ((Integer)aobj2[2]).intValue(), s1);
                } else
                {
                    return a(3, ((Integer)aobj2[1]).intValue(), s1);
                }
            }
        }

        aobj = d;
        i1 = aobj.length;
        for (int k = 0; k < i1; k++)
        {
            Object aobj3[] = aobj[k];
            if (aobj3[0].equals(s2))
            {
                if (aobj3[1] == a)
                {
                    return b(4, ((Integer)aobj3[2]).intValue(), s1);
                } else
                {
                    return a(4, ((Integer)aobj3[1]).intValue(), s1);
                }
            }
        }

        if (s1.length() < 4)
        {
            throw m.a();
        }
        s2 = s1.substring(0, 4);
        aobj = e;
        i1 = aobj.length;
        for (int l = 0; l < i1; l++)
        {
            Object aobj4[] = aobj[l];
            if (aobj4[0].equals(s2))
            {
                if (aobj4[1] == a)
                {
                    return b(4, ((Integer)aobj4[2]).intValue(), s1);
                } else
                {
                    return a(4, ((Integer)aobj4[1]).intValue(), s1);
                }
            }
        }

        throw m.a();
    }

    private static String b(int i, int j, String s1)
    {
        String s2 = s1.substring(0, i);
        String s3;
        if (s1.length() < i + j)
        {
            j = s1.length();
        } else
        {
            j = i + j;
        }
        s3 = s1.substring(i, j);
        s1 = s1.substring(j);
        s2 = (new StringBuilder()).append('(').append(s2).append(')').append(s3).toString();
        s1 = a(s1);
        if (s1 == null)
        {
            return s2;
        } else
        {
            return (new StringBuilder()).append(s2).append(s1).toString();
        }
    }

    static 
    {
        a = new Object();
        Object aobj5[] = {
            "00", Integer.valueOf(18)
        };
        Object aobj6[] = {
            "01", Integer.valueOf(14)
        };
        Object aobj7[] = {
            "10", a, Integer.valueOf(20)
        };
        Object aobj8[] = {
            "12", Integer.valueOf(6)
        };
        Object aobj9[] = {
            "13", Integer.valueOf(6)
        };
        Object aobj10[] = {
            "15", Integer.valueOf(6)
        };
        Object aobj11[] = {
            "21", a, Integer.valueOf(20)
        };
        Object aobj12[] = {
            "22", a, Integer.valueOf(29)
        };
        Object obj = a;
        Object obj1 = a;
        Object obj2 = a;
        Object aobj13[] = {
            "91", a, Integer.valueOf(30)
        };
        Object aobj14[] = {
            "92", a, Integer.valueOf(30)
        };
        Object aobj15[] = {
            "93", a, Integer.valueOf(30)
        };
        Object obj3 = a;
        Object obj4 = a;
        Object obj5 = a;
        Object aobj16[] = {
            "97", a, Integer.valueOf(30)
        };
        Object aobj17[] = {
            "98", a, Integer.valueOf(30)
        };
        Object aobj18[] = {
            "99", a, Integer.valueOf(30)
        };
        b = (new Object[][] {
            aobj5, aobj6, new Object[] {
                "02", Integer.valueOf(14)
            }, aobj7, new Object[] {
                "11", Integer.valueOf(6)
            }, aobj8, aobj9, aobj10, new Object[] {
                "17", Integer.valueOf(6)
            }, new Object[] {
                "20", Integer.valueOf(2)
            }, 
            aobj11, aobj12, new Object[] {
                "30", obj, Integer.valueOf(8)
            }, new Object[] {
                "37", obj1, Integer.valueOf(8)
            }, new Object[] {
                "90", obj2, Integer.valueOf(30)
            }, aobj13, aobj14, aobj15, new Object[] {
                "94", obj3, Integer.valueOf(30)
            }, new Object[] {
                "95", obj4, Integer.valueOf(30)
            }, 
            new Object[] {
                "96", obj5, Integer.valueOf(30)
            }, aobj16, aobj17, aobj18
        });
        obj = a;
        Object aobj4[] = {
            "241", a, Integer.valueOf(30)
        };
        aobj5 = (new Object[] {
            "242", a, Integer.valueOf(6)
        });
        aobj6 = (new Object[] {
            "250", a, Integer.valueOf(30)
        });
        obj1 = a;
        obj2 = a;
        obj3 = a;
        aobj7 = (new Object[] {
            "400", a, Integer.valueOf(30)
        });
        aobj8 = (new Object[] {
            "401", a, Integer.valueOf(30)
        });
        aobj9 = (new Object[] {
            "403", a, Integer.valueOf(30)
        });
        aobj10 = (new Object[] {
            "410", Integer.valueOf(13)
        });
        aobj11 = (new Object[] {
            "411", Integer.valueOf(13)
        });
        aobj12 = (new Object[] {
            "412", Integer.valueOf(13)
        });
        aobj13 = (new Object[] {
            "420", a, Integer.valueOf(20)
        });
        obj4 = a;
        aobj14 = (new Object[] {
            "423", a, Integer.valueOf(15)
        });
        c = (new Object[][] {
            new Object[] {
                "240", obj, Integer.valueOf(30)
            }, aobj4, aobj5, aobj6, new Object[] {
                "251", obj1, Integer.valueOf(30)
            }, new Object[] {
                "253", obj2, Integer.valueOf(17)
            }, new Object[] {
                "254", obj3, Integer.valueOf(20)
            }, aobj7, aobj8, new Object[] {
                "402", Integer.valueOf(17)
            }, aobj9, aobj10, aobj11, aobj12, new Object[] {
                "413", Integer.valueOf(13)
            }, new Object[] {
                "414", Integer.valueOf(13)
            }, aobj13, new Object[] {
                "421", obj4, Integer.valueOf(15)
            }, new Object[] {
                "422", Integer.valueOf(3)
            }, aobj14, new Object[] {
                "424", Integer.valueOf(3)
            }, new Object[] {
                "425", Integer.valueOf(3)
            }, new Object[] {
                "426", Integer.valueOf(3)
            }
        });
        Object aobj[] = {
            "311", Integer.valueOf(6)
        };
        Object aobj1[] = {
            "313", Integer.valueOf(6)
        };
        Object aobj2[] = {
            "315", Integer.valueOf(6)
        };
        Object aobj3[] = {
            "316", Integer.valueOf(6)
        };
        aobj4 = (new Object[] {
            "321", Integer.valueOf(6)
        });
        aobj5 = (new Object[] {
            "323", Integer.valueOf(6)
        });
        aobj6 = (new Object[] {
            "326", Integer.valueOf(6)
        });
        aobj7 = (new Object[] {
            "327", Integer.valueOf(6)
        });
        aobj8 = (new Object[] {
            "330", Integer.valueOf(6)
        });
        aobj9 = (new Object[] {
            "331", Integer.valueOf(6)
        });
        aobj10 = (new Object[] {
            "332", Integer.valueOf(6)
        });
        aobj11 = (new Object[] {
            "334", Integer.valueOf(6)
        });
        aobj12 = (new Object[] {
            "335", Integer.valueOf(6)
        });
        aobj13 = (new Object[] {
            "343", Integer.valueOf(6)
        });
        aobj14 = (new Object[] {
            "344", Integer.valueOf(6)
        });
        aobj15 = (new Object[] {
            "345", Integer.valueOf(6)
        });
        aobj16 = (new Object[] {
            "348", Integer.valueOf(6)
        });
        aobj17 = (new Object[] {
            "349", Integer.valueOf(6)
        });
        aobj18 = (new Object[] {
            "350", Integer.valueOf(6)
        });
        Object aobj19[] = {
            "352", Integer.valueOf(6)
        };
        Object aobj20[] = {
            "353", Integer.valueOf(6)
        };
        Object aobj21[] = {
            "360", Integer.valueOf(6)
        };
        Object aobj22[] = {
            "361", Integer.valueOf(6)
        };
        Object aobj23[] = {
            "365", Integer.valueOf(6)
        };
        Object aobj24[] = {
            "366", Integer.valueOf(6)
        };
        Object aobj25[] = {
            "367", Integer.valueOf(6)
        };
        Object aobj26[] = {
            "368", Integer.valueOf(6)
        };
        Object aobj27[] = {
            "369", Integer.valueOf(6)
        };
        obj = a;
        Object aobj28[] = {
            "391", a, Integer.valueOf(18)
        };
        Object aobj29[] = {
            "392", a, Integer.valueOf(15)
        };
        Object aobj30[] = {
            "393", a, Integer.valueOf(18)
        };
        Object aobj31[] = {
            "703", a, Integer.valueOf(30)
        };
        d = (new Object[][] {
            new Object[] {
                "310", Integer.valueOf(6)
            }, aobj, new Object[] {
                "312", Integer.valueOf(6)
            }, aobj1, new Object[] {
                "314", Integer.valueOf(6)
            }, aobj2, aobj3, new Object[] {
                "320", Integer.valueOf(6)
            }, aobj4, new Object[] {
                "322", Integer.valueOf(6)
            }, aobj5, new Object[] {
                "324", Integer.valueOf(6)
            }, new Object[] {
                "325", Integer.valueOf(6)
            }, aobj6, aobj7, new Object[] {
                "328", Integer.valueOf(6)
            }, new Object[] {
                "329", Integer.valueOf(6)
            }, aobj8, aobj9, aobj10, new Object[] {
                "333", Integer.valueOf(6)
            }, aobj11, aobj12, new Object[] {
                "336", Integer.valueOf(6)
            }, new Object[] {
                "340", Integer.valueOf(6)
            }, new Object[] {
                "341", Integer.valueOf(6)
            }, new Object[] {
                "342", Integer.valueOf(6)
            }, aobj13, aobj14, aobj15, new Object[] {
                "346", Integer.valueOf(6)
            }, new Object[] {
                "347", Integer.valueOf(6)
            }, aobj16, aobj17, aobj18, new Object[] {
                "351", Integer.valueOf(6)
            }, aobj19, aobj20, new Object[] {
                "354", Integer.valueOf(6)
            }, new Object[] {
                "355", Integer.valueOf(6)
            }, new Object[] {
                "356", Integer.valueOf(6)
            }, new Object[] {
                "357", Integer.valueOf(6)
            }, aobj21, aobj22, new Object[] {
                "362", Integer.valueOf(6)
            }, new Object[] {
                "363", Integer.valueOf(6)
            }, new Object[] {
                "364", Integer.valueOf(6)
            }, aobj23, aobj24, aobj25, aobj26, aobj27, new Object[] {
                "390", obj, Integer.valueOf(15)
            }, aobj28, aobj29, aobj30, aobj31
        });
        aobj1 = (new Object[] {
            "7002", a, Integer.valueOf(30)
        });
        aobj2 = (new Object[] {
            "7003", Integer.valueOf(10)
        });
        aobj3 = (new Object[] {
            "8001", Integer.valueOf(14)
        });
        aobj4 = (new Object[] {
            "8002", a, Integer.valueOf(20)
        });
        aobj5 = (new Object[] {
            "8003", a, Integer.valueOf(30)
        });
        aobj6 = (new Object[] {
            "8004", a, Integer.valueOf(30)
        });
        aobj7 = (new Object[] {
            "8006", Integer.valueOf(18)
        });
        obj = a;
        aobj8 = (new Object[] {
            "8008", a, Integer.valueOf(12)
        });
        aobj9 = (new Object[] {
            "8018", Integer.valueOf(18)
        });
        aobj10 = (new Object[] {
            "8020", a, Integer.valueOf(25)
        });
        aobj11 = (new Object[] {
            "8100", Integer.valueOf(6)
        });
        aobj12 = (new Object[] {
            "8101", Integer.valueOf(10)
        });
        aobj13 = (new Object[] {
            "8110", a, Integer.valueOf(70)
        });
        aobj = ((Object []) (a));
        e = (new Object[][] {
            new Object[] {
                "7001", Integer.valueOf(13)
            }, aobj1, aobj2, aobj3, aobj4, aobj5, aobj6, new Object[] {
                "8005", Integer.valueOf(6)
            }, aobj7, new Object[] {
                "8007", obj, Integer.valueOf(30)
            }, aobj8, aobj9, aobj10, aobj11, aobj12, new Object[] {
                "8102", Integer.valueOf(2)
            }, aobj13, new Object[] {
                "8200", aobj, Integer.valueOf(70)
            }
        });
    }
}
