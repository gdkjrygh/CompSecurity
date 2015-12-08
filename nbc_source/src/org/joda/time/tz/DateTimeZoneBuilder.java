// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.tz:
//            FixedDateTimeZone, CachedDateTimeZone, ZoneInfoLogger

public class DateTimeZoneBuilder
{
    private static final class DSTZone extends DateTimeZone
    {

        private static final long serialVersionUID = 0x605522c6413e57d1L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        private Recurrence findMatchingRecurrence(long l)
        {
            Recurrence recurrence1;
            int i = iStandardOffset;
            Recurrence recurrence = iStartRecurrence;
            recurrence1 = iEndRecurrence;
            long l1;
            long l2;
            try
            {
                l1 = recurrence.next(l, i, recurrence1.getSaveMillis());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                l1 = l;
            }
            catch (ArithmeticException arithmeticexception)
            {
                l1 = l;
            }
            l2 = recurrence1.next(l, i, recurrence.getSaveMillis());
            l = l2;
_L2:
            if (l1 > l)
            {
                return recurrence;
            } else
            {
                return recurrence1;
            }
            Object obj;
            obj;
            continue; /* Loop/switch isn't completed */
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        static DSTZone readFrom(DataInput datainput, String s)
            throws IOException
        {
            return new DSTZone(s, (int)DateTimeZoneBuilder.readMillis(datainput), Recurrence.readFrom(datainput), Recurrence.readFrom(datainput));
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof DSTZone)
                {
                    if (!getID().equals(((DSTZone) (obj = (DSTZone)obj)).getID()) || iStandardOffset != ((DSTZone) (obj)).iStandardOffset || !iStartRecurrence.equals(((DSTZone) (obj)).iStartRecurrence) || !iEndRecurrence.equals(((DSTZone) (obj)).iEndRecurrence))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public String getNameKey(long l)
        {
            return findMatchingRecurrence(l).getNameKey();
        }

        public int getOffset(long l)
        {
            return iStandardOffset + findMatchingRecurrence(l).getSaveMillis();
        }

        public int getStandardOffset(long l)
        {
            return iStandardOffset;
        }

        public boolean isFixed()
        {
            return false;
        }

        public long nextTransition(long l)
        {
            Recurrence recurrence;
            Recurrence recurrence1;
            int i;
            i = iStandardOffset;
            recurrence = iStartRecurrence;
            recurrence1 = iEndRecurrence;
            long l2 = recurrence.next(l, i, recurrence1.getSaveMillis());
            long l1;
            l1 = l2;
            if (l > 0L)
            {
                l1 = l2;
                if (l2 < 0L)
                {
                    l1 = l;
                }
            }
_L1:
label0:
            {
                Object obj;
                long l3;
                try
                {
                    l3 = recurrence1.next(l, i, recurrence.getSaveMillis());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    break label0;
                }
                catch (ArithmeticException arithmeticexception)
                {
                    break label0;
                }
                if (l <= 0L || l3 >= 0L)
                {
                    l = l3;
                }
            }
            if (l1 > l)
            {
                return l;
            } else
            {
                return l1;
            }
            obj;
            l1 = l;
              goto _L1
            obj;
            l1 = l;
              goto _L1
        }

        public long previousTransition(long l)
        {
            Recurrence recurrence;
            Recurrence recurrence1;
            int i;
            l++;
            i = iStandardOffset;
            recurrence = iStartRecurrence;
            recurrence1 = iEndRecurrence;
            long l2 = recurrence.previous(l, i, recurrence1.getSaveMillis());
            long l1;
            l1 = l2;
            if (l < 0L)
            {
                l1 = l2;
                if (l2 > 0L)
                {
                    l1 = l;
                }
            }
_L1:
label0:
            {
                Object obj;
                long l3;
                try
                {
                    l3 = recurrence1.previous(l, i, recurrence.getSaveMillis());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    break label0;
                }
                catch (ArithmeticException arithmeticexception)
                {
                    break label0;
                }
                if (l >= 0L || l3 <= 0L)
                {
                    l = l3;
                }
            }
            l3 = l;
            if (l1 > l)
            {
                l3 = l1;
            }
            return l3 - 1L;
            obj;
            l1 = l;
              goto _L1
            obj;
            l1 = l;
              goto _L1
        }

        public void writeTo(DataOutput dataoutput)
            throws IOException
        {
            DateTimeZoneBuilder.writeMillis(dataoutput, iStandardOffset);
            iStartRecurrence.writeTo(dataoutput);
            iEndRecurrence.writeTo(dataoutput);
        }

        DSTZone(String s, int i, Recurrence recurrence, Recurrence recurrence1)
        {
            super(s);
            iStandardOffset = i;
            iStartRecurrence = recurrence;
            iEndRecurrence = recurrence1;
        }
    }

    private static final class OfYear
    {

        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        static OfYear readFrom(DataInput datainput)
            throws IOException
        {
            return new OfYear((char)datainput.readUnsignedByte(), datainput.readUnsignedByte(), datainput.readByte(), datainput.readUnsignedByte(), datainput.readBoolean(), (int)DateTimeZoneBuilder.readMillis(datainput));
        }

        private long setDayOfMonth(Chronology chronology, long l)
        {
            if (iDayOfMonth >= 0)
            {
                return chronology.dayOfMonth().set(l, iDayOfMonth);
            } else
            {
                l = chronology.dayOfMonth().set(l, 1);
                l = chronology.monthOfYear().add(l, 1);
                return chronology.dayOfMonth().add(l, iDayOfMonth);
            }
        }

        private long setDayOfMonthNext(Chronology chronology, long l)
        {
            long l1;
            try
            {
                l1 = setDayOfMonth(chronology, l);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                if (iMonthOfYear == 2 && iDayOfMonth == 29)
                {
                    for (; !chronology.year().isLeap(l); l = chronology.year().add(l, 1)) { }
                    return setDayOfMonth(chronology, l);
                } else
                {
                    throw illegalargumentexception;
                }
            }
            return l1;
        }

        private long setDayOfMonthPrevious(Chronology chronology, long l)
        {
            long l1;
            try
            {
                l1 = setDayOfMonth(chronology, l);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                if (iMonthOfYear == 2 && iDayOfMonth == 29)
                {
                    for (; !chronology.year().isLeap(l); l = chronology.year().add(l, -1)) { }
                    return setDayOfMonth(chronology, l);
                } else
                {
                    throw illegalargumentexception;
                }
            }
            return l1;
        }

        private long setDayOfWeek(Chronology chronology, long l)
        {
            int k;
            long l1;
            int i = chronology.dayOfWeek().get(l);
            k = iDayOfWeek - i;
            l1 = l;
            if (k == 0) goto _L2; else goto _L1
_L1:
            if (!iAdvance) goto _L4; else goto _L3
_L3:
            int j;
            j = k;
            if (k < 0)
            {
                j = k + 7;
            }
_L6:
            l1 = chronology.dayOfWeek().add(l, j);
_L2:
            return l1;
_L4:
            j = k;
            if (k > 0)
            {
                j = k - 7;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof OfYear)
                {
                    if (iMode != ((OfYear) (obj = (OfYear)obj)).iMode || iMonthOfYear != ((OfYear) (obj)).iMonthOfYear || iDayOfMonth != ((OfYear) (obj)).iDayOfMonth || iDayOfWeek != ((OfYear) (obj)).iDayOfWeek || iAdvance != ((OfYear) (obj)).iAdvance || iMillisOfDay != ((OfYear) (obj)).iMillisOfDay)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public long next(long l, int i, int j)
        {
            ISOChronology isochronology;
            long l1;
            long l2;
            if (iMode == 'w')
            {
                i += j;
            } else
            if (iMode != 's')
            {
                i = 0;
            }
            l2 = (long)i + l;
            isochronology = ISOChronology.getInstanceUTC();
            l = isochronology.monthOfYear().set(l2, iMonthOfYear);
            l = isochronology.millisOfDay().set(l, 0);
            l1 = setDayOfMonthNext(isochronology, isochronology.millisOfDay().add(l, iMillisOfDay));
            if (iDayOfWeek == 0)
            {
                l = l1;
                if (l1 <= l2)
                {
                    l = setDayOfMonthNext(isochronology, isochronology.year().add(l1, 1));
                }
            } else
            {
                l1 = setDayOfWeek(isochronology, l1);
                l = l1;
                if (l1 <= l2)
                {
                    l = isochronology.year().add(l1, 1);
                    l = setDayOfWeek(isochronology, setDayOfMonthNext(isochronology, isochronology.monthOfYear().set(l, iMonthOfYear)));
                }
            }
            return l - (long)i;
        }

        public long previous(long l, int i, int j)
        {
            ISOChronology isochronology;
            long l1;
            long l2;
            if (iMode == 'w')
            {
                i += j;
            } else
            if (iMode != 's')
            {
                i = 0;
            }
            l2 = (long)i + l;
            isochronology = ISOChronology.getInstanceUTC();
            l = isochronology.monthOfYear().set(l2, iMonthOfYear);
            l = isochronology.millisOfDay().set(l, 0);
            l1 = setDayOfMonthPrevious(isochronology, isochronology.millisOfDay().add(l, iMillisOfDay));
            if (iDayOfWeek == 0)
            {
                l = l1;
                if (l1 >= l2)
                {
                    l = setDayOfMonthPrevious(isochronology, isochronology.year().add(l1, -1));
                }
            } else
            {
                l1 = setDayOfWeek(isochronology, l1);
                l = l1;
                if (l1 >= l2)
                {
                    l = isochronology.year().add(l1, -1);
                    l = setDayOfWeek(isochronology, setDayOfMonthPrevious(isochronology, isochronology.monthOfYear().set(l, iMonthOfYear)));
                }
            }
            return l - (long)i;
        }

        public long setInstant(int i, int j, int k)
        {
            if (iMode != 'w') goto _L2; else goto _L1
_L1:
            j += k;
_L4:
            ISOChronology isochronology = ISOChronology.getInstanceUTC();
            long l = isochronology.year().set(0L, i);
            l = isochronology.monthOfYear().set(l, iMonthOfYear);
            long l1 = setDayOfMonth(isochronology, isochronology.millisOfDay().set(l, iMillisOfDay));
            l = l1;
            if (iDayOfWeek != 0)
            {
                l = setDayOfWeek(isochronology, l1);
            }
            return l - (long)j;
_L2:
            if (iMode != 's')
            {
                j = 0;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void writeTo(DataOutput dataoutput)
            throws IOException
        {
            dataoutput.writeByte(iMode);
            dataoutput.writeByte(iMonthOfYear);
            dataoutput.writeByte(iDayOfMonth);
            dataoutput.writeByte(iDayOfWeek);
            dataoutput.writeBoolean(iAdvance);
            DateTimeZoneBuilder.writeMillis(dataoutput, iMillisOfDay);
        }

        OfYear(char c, int i, int j, int k, boolean flag, int l)
        {
            if (c != 'u' && c != 'w' && c != 's')
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown mode: ").append(c).toString());
            } else
            {
                iMode = c;
                iMonthOfYear = i;
                iDayOfMonth = j;
                iDayOfWeek = k;
                iAdvance = flag;
                iMillisOfDay = l;
                return;
            }
        }
    }

    private static final class PrecalculatedZone extends DateTimeZone
    {

        private static final long serialVersionUID = 0x6c69b735442cb4f9L;
        private final String iNameKeys[];
        private final int iStandardOffsets[];
        private final DSTZone iTailZone;
        private final long iTransitions[];
        private final int iWallOffsets[];

        static PrecalculatedZone create(String s, boolean flag, ArrayList arraylist, DSTZone dstzone)
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
                Transition transition = (Transition)arraylist.get(i);
                if (!transition.isTransitionFrom(((Transition) (obj))))
                {
                    throw new IllegalArgumentException(s);
                }
                al[i] = transition.getMillis();
                ai[i] = transition.getWallOffset();
                ai1[i] = transition.getStandardOffset();
                as2[i] = transition.getNameKey();
                i++;
                obj = transition;
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
            if (dstzone != null && dstzone.iStartRecurrence.getNameKey().equals(dstzone.iEndRecurrence.getNameKey()))
            {
                if (ZoneInfoLogger.verbose())
                {
                    System.out.println((new StringBuilder()).append("Fixing duplicate recurrent name key - ").append(dstzone.iStartRecurrence.getNameKey()).toString());
                }
                if (dstzone.iStartRecurrence.getSaveMillis() > 0)
                {
                    arraylist = new DSTZone(dstzone.getID(), dstzone.iStandardOffset, dstzone.iStartRecurrence.renameAppend("-Summer"), dstzone.iEndRecurrence);
                } else
                {
                    arraylist = new DSTZone(dstzone.getID(), dstzone.iStandardOffset, dstzone.iStartRecurrence, dstzone.iEndRecurrence.renameAppend("-Summer"));
                }
            } else
            {
                arraylist = dstzone;
            }
            if (!flag)
            {
                s = "";
            }
            return new PrecalculatedZone(s, al, ai, ai1, as2, arraylist);
        }

        static PrecalculatedZone readFrom(DataInput datainput, String s)
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
                obj = DSTZone.readFrom(datainput, s);
            }
            return new PrecalculatedZone(s, al, ai, ai1, as, ((DSTZone) (obj)));
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
            if (!(obj instanceof PrecalculatedZone))
            {
                break MISSING_BLOCK_LABEL_121;
            }
            obj = (PrecalculatedZone)obj;
            if (!getID().equals(((PrecalculatedZone) (obj)).getID()) || !Arrays.equals(iTransitions, ((PrecalculatedZone) (obj)).iTransitions) || !Arrays.equals(iNameKeys, ((PrecalculatedZone) (obj)).iNameKeys) || !Arrays.equals(iWallOffsets, ((PrecalculatedZone) (obj)).iWallOffsets) || !Arrays.equals(iStandardOffsets, ((PrecalculatedZone) (obj)).iStandardOffsets))
            {
                break; /* Loop/switch isn't completed */
            }
            if (iTailZone != null) goto _L4; else goto _L3
_L3:
            if (((PrecalculatedZone) (obj)).iTailZone == null) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (!iTailZone.equals(((PrecalculatedZone) (obj)).iTailZone)) goto _L5; else goto _L6
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
                return iTailZone.getNameKey(l);
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
                return iTailZone.getOffset(l);
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
                return iTailZone.getStandardOffset(l);
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
                    return iTailZone.nextTransition(l2);
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
                l1 = iTailZone.previousTransition(l);
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
                    iTailZone.writeTo(dataoutput);
                }
                return;
            } while (true);
        }

        private PrecalculatedZone(String s, long al[], int ai[], int ai1[], String as[], DSTZone dstzone)
        {
            super(s);
            iTransitions = al;
            iWallOffsets = ai;
            iStandardOffsets = ai1;
            iNameKeys = as;
            iTailZone = dstzone;
        }
    }

    private static final class Recurrence
    {

        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        static Recurrence readFrom(DataInput datainput)
            throws IOException
        {
            return new Recurrence(OfYear.readFrom(datainput), datainput.readUTF(), (int)DateTimeZoneBuilder.readMillis(datainput));
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof Recurrence)
                {
                    if (iSaveMillis != ((Recurrence) (obj = (Recurrence)obj)).iSaveMillis || !iNameKey.equals(((Recurrence) (obj)).iNameKey) || !iOfYear.equals(((Recurrence) (obj)).iOfYear))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public String getNameKey()
        {
            return iNameKey;
        }

        public OfYear getOfYear()
        {
            return iOfYear;
        }

        public int getSaveMillis()
        {
            return iSaveMillis;
        }

        public long next(long l, int i, int j)
        {
            return iOfYear.next(l, i, j);
        }

        public long previous(long l, int i, int j)
        {
            return iOfYear.previous(l, i, j);
        }

        Recurrence rename(String s)
        {
            return new Recurrence(iOfYear, s, iSaveMillis);
        }

        Recurrence renameAppend(String s)
        {
            return rename((new StringBuilder()).append(iNameKey).append(s).toString().intern());
        }

        public void writeTo(DataOutput dataoutput)
            throws IOException
        {
            iOfYear.writeTo(dataoutput);
            dataoutput.writeUTF(iNameKey);
            DateTimeZoneBuilder.writeMillis(dataoutput, iSaveMillis);
        }

        Recurrence(OfYear ofyear, String s, int i)
        {
            iOfYear = ofyear;
            iNameKey = s;
            iSaveMillis = i;
        }
    }

    private static final class Rule
    {

        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public int getFromYear()
        {
            return iFromYear;
        }

        public String getNameKey()
        {
            return iRecurrence.getNameKey();
        }

        public OfYear getOfYear()
        {
            return iRecurrence.getOfYear();
        }

        public int getSaveMillis()
        {
            return iRecurrence.getSaveMillis();
        }

        public int getToYear()
        {
            return iToYear;
        }

        public long next(long l, int i, int j)
        {
            ISOChronology isochronology = ISOChronology.getInstanceUTC();
            int i1 = i + j;
            int k;
            long l1;
            if (l == 0x8000000000000000L)
            {
                k = 0x80000000;
            } else
            {
                k = isochronology.year().get((long)i1 + l);
            }
            if (k < iFromYear)
            {
                l1 = isochronology.year().set(0L, iFromYear) - (long)i1 - 1L;
            } else
            {
                l1 = l;
            }
            l1 = iRecurrence.next(l1, i, j);
            if (l1 > l && isochronology.year().get((long)i1 + l1) > iToYear)
            {
                return l;
            } else
            {
                return l1;
            }
        }

        Rule(Recurrence recurrence, int i, int j)
        {
            iRecurrence = recurrence;
            iFromYear = i;
            iToYear = j;
        }
    }

    private static final class RuleSet
    {

        private static final int YEAR_LIMIT;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public void addRule(Rule rule)
        {
            if (!iRules.contains(rule))
            {
                iRules.add(rule);
            }
        }

        public DSTZone buildTailZone(String s)
        {
            if (iRules.size() == 2)
            {
                Rule rule = (Rule)iRules.get(0);
                Rule rule1 = (Rule)iRules.get(1);
                if (rule.getToYear() == 0x7fffffff && rule1.getToYear() == 0x7fffffff)
                {
                    return new DSTZone(s, iStandardOffset, rule.iRecurrence, rule1.iRecurrence);
                }
            }
            return null;
        }

        public Transition firstTransition(long l)
        {
            Transition transition;
            ArrayList arraylist;
            int i;
            long l1;
            if (iInitialNameKey != null)
            {
                return new Transition(l, iInitialNameKey, iStandardOffset + iInitialSaveMillis, iStandardOffset);
            }
            arraylist = new ArrayList(iRules);
            l1 = 0x8000000000000000L;
            i = 0;
            transition = null;
_L7:
            Object obj;
            Transition transition1;
            transition1 = nextTransition(l1, i);
            obj = transition;
            if (transition1 == null) goto _L2; else goto _L1
_L1:
            l1 = transition1.getMillis();
            if (l1 != l) goto _L4; else goto _L3
_L3:
            obj = new Transition(l, transition1);
_L2:
            iRules = arraylist;
            return ((Transition) (obj));
_L4:
            Object obj1;
label0:
            {
                if (l1 <= l)
                {
                    break; /* Loop/switch isn't completed */
                }
                obj1 = transition;
                if (transition != null)
                {
                    break label0;
                }
                obj = arraylist.iterator();
                do
                {
                    obj1 = transition;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    obj1 = (Rule)((Iterator) (obj)).next();
                } while (((Rule) (obj1)).getSaveMillis() != 0);
                obj1 = new Transition(l, ((Rule) (obj1)), iStandardOffset);
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = new Transition(l, transition1.getNameKey(), iStandardOffset, iStandardOffset);
            }
            if (true) goto _L2; else goto _L5
_L5:
            transition = new Transition(l, transition1);
            i = transition1.getSaveMillis();
            if (true) goto _L7; else goto _L6
_L6:
        }

        public int getStandardOffset()
        {
            return iStandardOffset;
        }

        public long getUpperLimit(int i)
        {
            if (iUpperYear == 0x7fffffff)
            {
                return 0x7fffffffffffffffL;
            } else
            {
                return iUpperOfYear.setInstant(iUpperYear, iStandardOffset, i);
            }
        }

        public Transition nextTransition(long l, int i)
        {
            ISOChronology isochronology = ISOChronology.getInstanceUTC();
            long l1 = 0x7fffffffffffffffL;
            Iterator iterator = iRules.iterator();
            Rule rule = null;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Rule rule1 = (Rule)iterator.next();
                long l2 = rule1.next(l, iStandardOffset, i);
                if (l2 <= l)
                {
                    iterator.remove();
                } else
                if (l2 <= l1)
                {
                    rule = rule1;
                    l1 = l2;
                }
            } while (true);
            while (rule == null || isochronology.year().get(l1) >= YEAR_LIMIT || iUpperYear < 0x7fffffff && l1 >= iUpperOfYear.setInstant(iUpperYear, iStandardOffset, i)) 
            {
                return null;
            }
            return new Transition(l1, rule, iStandardOffset);
        }

        public void setFixedSavings(String s, int i)
        {
            iInitialNameKey = s;
            iInitialSaveMillis = i;
        }

        public void setStandardOffset(int i)
        {
            iStandardOffset = i;
        }

        public void setUpperLimit(int i, OfYear ofyear)
        {
            iUpperYear = i;
            iUpperOfYear = ofyear;
        }

        static 
        {
            long l = DateTimeUtils.currentTimeMillis();
            YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(l) + 100;
        }

        RuleSet()
        {
            iRules = new ArrayList(10);
            iUpperYear = 0x7fffffff;
        }

        RuleSet(RuleSet ruleset)
        {
            iStandardOffset = ruleset.iStandardOffset;
            iRules = new ArrayList(ruleset.iRules);
            iInitialNameKey = ruleset.iInitialNameKey;
            iInitialSaveMillis = ruleset.iInitialSaveMillis;
            iUpperYear = ruleset.iUpperYear;
            iUpperOfYear = ruleset.iUpperOfYear;
        }
    }

    private static final class Transition
    {

        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public long getMillis()
        {
            return iMillis;
        }

        public String getNameKey()
        {
            return iNameKey;
        }

        public int getSaveMillis()
        {
            return iWallOffset - iStandardOffset;
        }

        public int getStandardOffset()
        {
            return iStandardOffset;
        }

        public int getWallOffset()
        {
            return iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition)
        {
            while (transition == null || iMillis > transition.iMillis && (iWallOffset != transition.iWallOffset || !iNameKey.equals(transition.iNameKey))) 
            {
                return true;
            }
            return false;
        }

        Transition(long l, String s, int i, int j)
        {
            iMillis = l;
            iNameKey = s;
            iWallOffset = i;
            iStandardOffset = j;
        }

        Transition(long l, Rule rule, int i)
        {
            iMillis = l;
            iNameKey = rule.getNameKey();
            iWallOffset = rule.getSaveMillis() + i;
            iStandardOffset = i;
        }

        Transition(long l, Transition transition)
        {
            iMillis = l;
            iNameKey = transition.iNameKey;
            iWallOffset = transition.iWallOffset;
            iStandardOffset = transition.iStandardOffset;
        }
    }


    private final ArrayList iRuleSets = new ArrayList(10);

    public DateTimeZoneBuilder()
    {
    }

    private boolean addTransition(ArrayList arraylist, Transition transition)
    {
        int i = 0;
        boolean flag = false;
        int j = arraylist.size();
        if (j == 0)
        {
            arraylist.add(transition);
            flag = true;
        } else
        {
            Transition transition1 = (Transition)arraylist.get(j - 1);
            if (transition.isTransitionFrom(transition1))
            {
                if (j >= 2)
                {
                    i = ((Transition)arraylist.get(j - 2)).getWallOffset();
                }
                int k = transition1.getWallOffset();
                long l = transition1.getMillis();
                long l1 = i;
                long l2 = transition.getMillis();
                if ((long)k + l2 != l1 + l)
                {
                    arraylist.add(transition);
                    return true;
                } else
                {
                    arraylist.remove(j - 1);
                    return addTransition(arraylist, transition);
                }
            }
        }
        return flag;
    }

    private static DateTimeZone buildFixedZone(String s, String s1, int i, int j)
    {
        if ("UTC".equals(s) && s.equals(s1) && i == 0 && j == 0)
        {
            return DateTimeZone.UTC;
        } else
        {
            return new FixedDateTimeZone(s, s1, i, j);
        }
    }

    private RuleSet getLastRuleSet()
    {
        if (iRuleSets.size() == 0)
        {
            addCutover(0x80000000, 'w', 1, 1, 0, false, 0);
        }
        return (RuleSet)iRuleSets.get(iRuleSets.size() - 1);
    }

    public static DateTimeZone readFrom(DataInput datainput, String s)
        throws IOException
    {
        switch (datainput.readUnsignedByte())
        {
        default:
            throw new IOException("Invalid encoding");

        case 70: // 'F'
            s = new FixedDateTimeZone(s, datainput.readUTF(), (int)readMillis(datainput), (int)readMillis(datainput));
            datainput = s;
            if (s.equals(DateTimeZone.UTC))
            {
                datainput = DateTimeZone.UTC;
            }
            return datainput;

        case 67: // 'C'
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(datainput, s));

        case 80: // 'P'
            return PrecalculatedZone.readFrom(datainput, s);
        }
    }

    public static DateTimeZone readFrom(InputStream inputstream, String s)
        throws IOException
    {
        if (inputstream instanceof DataInput)
        {
            return readFrom((DataInput)inputstream, s);
        } else
        {
            return readFrom(((DataInput) (new DataInputStream(inputstream))), s);
        }
    }

    static long readMillis(DataInput datainput)
        throws IOException
    {
        int i = datainput.readUnsignedByte();
        switch (i >> 6)
        {
        default:
            return (long)((i << 26) >> 26) * 0x1b7740L;

        case 1: // '\001'
            return (long)((i << 26) >> 2 | datainput.readUnsignedByte() << 16 | datainput.readUnsignedByte() << 8 | datainput.readUnsignedByte()) * 60000L;

        case 2: // '\002'
            return (((long)i << 58) >> 26 | (long)(datainput.readUnsignedByte() << 24) | (long)(datainput.readUnsignedByte() << 16) | (long)(datainput.readUnsignedByte() << 8) | (long)datainput.readUnsignedByte()) * 1000L;

        case 3: // '\003'
            return datainput.readLong();
        }
    }

    static void writeMillis(DataOutput dataoutput, long l)
        throws IOException
    {
        if (l % 0x1b7740L == 0L)
        {
            long l1 = l / 0x1b7740L;
            if ((l1 << 58) >> 58 == l1)
            {
                dataoutput.writeByte((int)(l1 & 63L));
                return;
            }
        }
        if (l % 60000L == 0L)
        {
            long l2 = l / 60000L;
            if ((l2 << 34) >> 34 == l2)
            {
                dataoutput.writeInt((int)(l2 & 0x3fffffffL) | 0x40000000);
                return;
            }
        }
        if (l % 1000L == 0L)
        {
            long l3 = l / 1000L;
            if ((l3 << 26) >> 26 == l3)
            {
                dataoutput.writeByte((int)(l3 >> 32 & 63L) | 0x80);
                dataoutput.writeInt((int)(l3 & -1L));
                return;
            }
        }
        char c;
        if (l < 0L)
        {
            c = '\377';
        } else
        {
            c = '\300';
        }
        dataoutput.writeByte(c);
        dataoutput.writeLong(l);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int j, int k, int l, boolean flag, int i1)
    {
        if (iRuleSets.size() > 0)
        {
            OfYear ofyear = new OfYear(c, j, k, l, flag, i1);
            ((RuleSet)iRuleSets.get(iRuleSets.size() - 1)).setUpperLimit(i, ofyear);
        }
        iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String s, int i, int j, int k, char c, int l, int i1, 
            int j1, boolean flag, int k1)
    {
        if (j <= k)
        {
            s = new Rule(new Recurrence(new OfYear(c, l, i1, j1, flag, k1), s, i), j, k);
            getLastRuleSet().addRule(s);
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String s, int i)
    {
        getLastRuleSet().setFixedSavings(s, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i)
    {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String s, boolean flag)
    {
        Object obj;
        ArrayList arraylist;
        int i;
        int l;
        long l1;
        if (s == null)
        {
            throw new IllegalArgumentException();
        }
        arraylist = new ArrayList();
        obj = null;
        l1 = 0x8000000000000000L;
        l = iRuleSets.size();
        i = 0;
_L5:
        if (i >= l) goto _L2; else goto _L1
_L1:
        RuleSet ruleset;
        Transition transition;
        ruleset = (RuleSet)iRuleSets.get(i);
        transition = ruleset.firstTransition(l1);
        if (transition != null) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        int j;
        addTransition(arraylist, transition);
        l1 = transition.getMillis();
        j = transition.getSaveMillis();
        ruleset = new RuleSet(ruleset);
_L6:
label0:
        {
            transition = ruleset.nextTransition(l1, j);
            if (transition != null && (!addTransition(arraylist, transition) || obj == null))
            {
                break label0;
            }
            l1 = ruleset.getUpperLimit(j);
        }
          goto _L3
        long l2 = transition.getMillis();
        int k = transition.getSaveMillis();
        j = k;
        l1 = l2;
        if (obj == null)
        {
            j = k;
            l1 = l2;
            if (i == l - 1)
            {
                obj = ruleset.buildTailZone(s);
                j = k;
                l1 = l2;
            }
        }
          goto _L6
_L2:
        if (arraylist.size() != 0) goto _L8; else goto _L7
_L7:
        if (obj == null) goto _L10; else goto _L9
_L9:
        return ((DateTimeZone) (obj));
_L10:
        return buildFixedZone(s, "UTC", 0, 0);
_L8:
        if (arraylist.size() == 1 && obj == null)
        {
            obj = (Transition)arraylist.get(0);
            return buildFixedZone(s, ((Transition) (obj)).getNameKey(), ((Transition) (obj)).getWallOffset(), ((Transition) (obj)).getStandardOffset());
        }
        s = PrecalculatedZone.create(s, flag, arraylist, ((DSTZone) (obj)));
        obj = s;
        if (!s.isCachable()) goto _L9; else goto _L11
_L11:
        return CachedDateTimeZone.forZone(s);
          goto _L3
    }

    public void writeTo(String s, DataOutput dataoutput)
        throws IOException
    {
        s = toDateTimeZone(s, false);
        if (s instanceof FixedDateTimeZone)
        {
            dataoutput.writeByte(70);
            dataoutput.writeUTF(s.getNameKey(0L));
            writeMillis(dataoutput, s.getOffset(0L));
            writeMillis(dataoutput, s.getStandardOffset(0L));
            return;
        }
        if (s instanceof CachedDateTimeZone)
        {
            dataoutput.writeByte(67);
            s = ((CachedDateTimeZone)s).getUncachedZone();
        } else
        {
            dataoutput.writeByte(80);
        }
        ((PrecalculatedZone)s).writeTo(dataoutput);
    }

    public void writeTo(String s, OutputStream outputstream)
        throws IOException
    {
        if (outputstream instanceof DataOutput)
        {
            writeTo(s, (DataOutput)outputstream);
            return;
        } else
        {
            writeTo(s, ((DataOutput) (new DataOutputStream(outputstream))));
            return;
        }
    }
}
