// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder, ZoneInfoLogger

private static final class iTailZone extends DateTimeZone
{

    private static final long serialVersionUID = 0x6c69b735442cb4f9L;
    private final String iNameKeys[];
    private final int iStandardOffsets[];
    private final iTailZone iTailZone;
    private final long iTransitions[];
    private final int iWallOffsets[];

    static iTailZone create(String s, boolean flag, ArrayList arraylist, iTailZone itailzone)
    {
        int l = arraylist.size();
        if (l == 0)
        {
            throw new IllegalArgumentException();
        }
        long al[] = new long[l];
        int ai[] = new int[l];
        int ai1[] = new int[l];
        String as2[] = new String[l];
        Object obj = null;
        for (int i = 0; i < l;)
        {
            iTailZone itailzone1 = (iTailZone)arraylist.get(i);
            if (!itailzone1.itionFrom(((itionFrom) (obj))))
            {
                throw new IllegalArgumentException(s);
            }
            al[i] = itailzone1.is();
            ai[i] = itailzone1.Offset();
            ai1[i] = itailzone1.dardOffset();
            as2[i] = itailzone1.Key();
            i++;
            obj = itailzone1;
        }

        arraylist = new String[5];
        String as1[][] = (new DateFormatSymbols(Locale.ENGLISH)).getZoneStrings();
        for (int j = 0; j < as1.length; j++)
        {
            String as[] = as1[j];
            if (as != null && as.length == 5 && s.equals(as[0]))
            {
                arraylist = as;
            }
        }

        as = ISOChronology.getInstanceUTC();
        int k = 0;
        while (k < as2.length - 1) 
        {
            String s1 = as2[k];
            String s2 = as2[k + 1];
            long l1 = ai[k];
            long l2 = ai[k + 1];
            long l3 = ai1[k];
            long l4 = ai1[k + 1];
            Period period = new Period(al[k], al[k + 1], PeriodType.yearMonthDay(), as);
            int i1 = k;
            if (l1 == l2)
            {
                continue;
            }
            i1 = k;
            if (l3 != l4)
            {
                continue;
            }
            i1 = k;
            if (!s1.equals(s2))
            {
                continue;
            }
            i1 = k;
            if (period.getYears() != 0)
            {
                continue;
            }
            i1 = k;
            if (period.getMonths() <= 4)
            {
                continue;
            }
            i1 = k;
            if (period.getMonths() >= 8)
            {
                continue;
            }
            i1 = k;
            if (!s1.equals(arraylist[2]))
            {
                continue;
            }
            i1 = k;
            if (s1.equals(arraylist[4]))
            {
                if (ZoneInfoLogger.verbose())
                {
                    System.out.println((new StringBuilder()).append("Fixing duplicate name key - ").append(s2).toString());
                    System.out.println((new StringBuilder()).append("     - ").append(new DateTime(al[k], as)).append(" - ").append(new DateTime(al[k + 1], as)).toString());
                }
                if (l1 > l2)
                {
                    as2[k] = (new StringBuilder()).append(s1).append("-Summer").toString().intern();
                    i1 = k;
                } else
                {
                    i1 = k;
                    if (l1 < l2)
                    {
                        as2[k + 1] = (new StringBuilder()).append(s2).append("-Summer").toString().intern();
                        i1 = k + 1;
                    }
                }
            }
            k = i1 + 1;
        }
        if (itailzone != null && itailzone.rrence.Key().equals(itailzone.ence.Key()))
        {
            if (ZoneInfoLogger.verbose())
            {
                System.out.println((new StringBuilder()).append("Fixing duplicate recurrent name key - ").append(itailzone.rrence.Key()).toString());
            }
            if (itailzone.rrence.Millis() > 0)
            {
                arraylist = new Millis(itailzone.Millis(), itailzone.ffset, itailzone.rrence.ppend("-Summer"), itailzone.ence);
            } else
            {
                arraylist = new ence(itailzone.ence(), itailzone.ffset, itailzone.rrence, itailzone.ence.ppend("-Summer"));
            }
        } else
        {
            arraylist = itailzone;
        }
        if (!flag)
        {
            s = "";
        }
        return new <init>(s, al, ai, ai1, as2, arraylist);
    }

    static <init> readFrom(DataInput datainput, String s)
        throws IOException
    {
        Object obj;
        long al[];
        int ai[];
        int ai1[];
        String as[];
        int j;
        int l;
        int i1;
        l = datainput.readUnsignedShort();
        obj = new String[l];
        for (int i = 0; i < l; i++)
        {
            obj[i] = datainput.readUTF();
        }

        i1 = datainput.readInt();
        al = new long[i1];
        ai = new int[i1];
        ai1 = new int[i1];
        as = new String[i1];
        j = 0;
_L2:
        int k;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        al[j] = DateTimeZoneBuilder.readMillis(datainput);
        ai[j] = (int)DateTimeZoneBuilder.readMillis(datainput);
        ai1[j] = (int)DateTimeZoneBuilder.readMillis(datainput);
        if (l < 256)
        {
            try
            {
                k = datainput.readUnsignedByte();
            }
            // Misplaced declaration of an exception variable
            catch (DataInput datainput)
            {
                throw new IOException("Invalid encoding");
            }
            break MISSING_BLOCK_LABEL_188;
        }
        k = datainput.readUnsignedShort();
        break MISSING_BLOCK_LABEL_188;
        obj = null;
        if (datainput.readBoolean())
        {
            obj = <init>(datainput, s);
        }
        return new <init>(s, al, ai, ai1, as, ((<init>) (obj)));
        as[j] = obj[k];
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof <init>))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (<init>)obj;
        if (!getID().equals(((getID) (obj)).getID()) || !Arrays.equals(iTransitions, ((iTransitions) (obj)).iTransitions) || !Arrays.equals(iNameKeys, ((iNameKeys) (obj)).iNameKeys) || !Arrays.equals(iWallOffsets, ((iWallOffsets) (obj)).iWallOffsets) || !Arrays.equals(iStandardOffsets, ((iStandardOffsets) (obj)).iStandardOffsets))
        {
            break; /* Loop/switch isn't completed */
        }
        if (iTailZone != null) goto _L4; else goto _L3
_L3:
        if (((iTailZone) (obj)).iTailZone == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (!iTailZone.iTailZone(((iTailZone) (obj)).iTailZone)) goto _L5; else goto _L6
_L6:
        return true;
        return false;
    }

    public String getNameKey(long l)
    {
        long al[] = iTransitions;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return iNameKeys[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return iNameKeys[i - 1];
            } else
            {
                return "UTC";
            }
        }
        if (iTailZone == null)
        {
            return iNameKeys[i - 1];
        } else
        {
            return iTailZone.(l);
        }
    }

    public int getOffset(long l)
    {
        long al[] = iTransitions;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return iWallOffsets[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return iWallOffsets[i - 1];
            } else
            {
                return 0;
            }
        }
        if (iTailZone == null)
        {
            return iWallOffsets[i - 1];
        } else
        {
            return iTailZone.iTailZone(l);
        }
    }

    public int getStandardOffset(long l)
    {
        long al[] = iTransitions;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return iStandardOffsets[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return iStandardOffsets[i - 1];
            } else
            {
                return 0;
            }
        }
        if (iTailZone == null)
        {
            return iStandardOffsets[i - 1];
        } else
        {
            return iTailZone.dOffset(l);
        }
    }

    public boolean isCachable()
    {
        if (iTailZone == null)
        {
            long al[] = iTransitions;
            if (al.length <= 1)
            {
                return false;
            }
            double d = 0.0D;
            int i = 1;
            int j = 0;
            while (i < al.length) 
            {
                long l = al[i] - al[i - 1];
                int k = j;
                double d1 = d;
                if (l < 0xeb488b400L)
                {
                    d1 = d + (double)l;
                    k = j + 1;
                }
                i++;
                j = k;
                d = d1;
            }
            if (j <= 0 || d / (double)j / 86400000D < 25D)
            {
                return false;
            }
        }
        return true;
    }

    public boolean isFixed()
    {
        return false;
    }

    public long nextTransition(long l)
    {
        long al[] = iTransitions;
        int i = Arrays.binarySearch(al, l);
        long l1;
        if (i >= 0)
        {
            i++;
        } else
        {
            i = ~i;
        }
        if (i < al.length)
        {
            l1 = al[i];
        } else
        {
            l1 = l;
            if (iTailZone != null)
            {
                long l3 = al[al.length - 1];
                long l2 = l;
                if (l < l3)
                {
                    l2 = l3;
                }
                return iTailZone.tion(l2);
            }
        }
        return l1;
    }

    public long previousTransition(long l)
    {
        long al[];
        int i;
        al = iTransitions;
        i = Arrays.binarySearch(al, l);
        if (i < 0) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = l;
        if (l > 0x8000000000000000L)
        {
            l1 = l - 1L;
        }
_L4:
        return l1;
_L2:
        i = ~i;
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l;
        if (i > 0)
        {
            long l2 = al[i - 1];
            l1 = l;
            if (l2 > 0x8000000000000000L)
            {
                return l2 - 1L;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (iTailZone != null)
        {
            l1 = iTailZone.ansition(l);
            if (l1 < l)
            {
                return l1;
            }
        }
        long l3 = al[i - 1];
        l1 = l;
        if (l3 > 0x8000000000000000L)
        {
            return l3 - 1L;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void writeTo(DataOutput dataoutput)
        throws IOException
    {
        boolean flag = false;
        int j1 = iTransitions.length;
        Object obj = new HashSet();
        for (int i = 0; i < j1; i++)
        {
            ((Set) (obj)).add(iNameKeys[i]);
        }

        int k1 = ((Set) (obj)).size();
        if (k1 > 65535)
        {
            throw new UnsupportedOperationException("String pool is too large");
        }
        String as[] = new String[k1];
        obj = ((Set) (obj)).iterator();
        for (int j = 0; ((Iterator) (obj)).hasNext(); j++)
        {
            as[j] = (String)((Iterator) (obj)).next();
        }

        dataoutput.writeShort(k1);
        for (int k = 0; k < k1; k++)
        {
            dataoutput.writeUTF(as[k]);
        }

        dataoutput.writeInt(j1);
        int l = 0;
label0:
        do
        {
            if (l < j1)
            {
                DateTimeZoneBuilder.writeMillis(dataoutput, iTransitions[l]);
                DateTimeZoneBuilder.writeMillis(dataoutput, iWallOffsets[l]);
                DateTimeZoneBuilder.writeMillis(dataoutput, iStandardOffsets[l]);
                String s = iNameKeys[l];
                int i1 = 0;
                do
                {
label1:
                    {
                        if (i1 < k1)
                        {
                            if (!as[i1].equals(s))
                            {
                                break label1;
                            }
                            if (k1 < 256)
                            {
                                dataoutput.writeByte(i1);
                            } else
                            {
                                dataoutput.writeShort(i1);
                            }
                        }
                        l++;
                        continue label0;
                    }
                    i1++;
                } while (true);
            }
            if (iTailZone != null)
            {
                flag = true;
            }
            dataoutput.writeBoolean(flag);
            if (iTailZone != null)
            {
                iTailZone.iTailZone(dataoutput);
            }
            return;
        } while (true);
    }

    private (String s, long al[], int ai[], int ai1[], String as[],  )
    {
        super(s);
        iTransitions = al;
        iWallOffsets = ai;
        iStandardOffsets = ai1;
        iNameKeys = as;
        iTailZone = ;
    }
}
