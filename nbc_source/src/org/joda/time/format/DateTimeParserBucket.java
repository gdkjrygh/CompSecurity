// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

// Referenced classes of package org.joda.time.format:
//            InternalParser, FormatUtils, DateTimeParserInternalParser, DateTimeParser

public class DateTimeParserBucket
{
    static class SavedField
        implements Comparable
    {

        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        public volatile int compareTo(Object obj)
        {
            return compareTo((SavedField)obj);
        }

        public int compareTo(SavedField savedfield)
        {
            savedfield = savedfield.iField;
            int i = DateTimeParserBucket.compareReverse(iField.getRangeDurationField(), savedfield.getRangeDurationField());
            if (i != 0)
            {
                return i;
            } else
            {
                return DateTimeParserBucket.compareReverse(iField.getDurationField(), savedfield.getDurationField());
            }
        }

        void init(DateTimeField datetimefield, int i)
        {
            iField = datetimefield;
            iValue = i;
            iText = null;
            iLocale = null;
        }

        void init(DateTimeField datetimefield, String s, Locale locale)
        {
            iField = datetimefield;
            iValue = 0;
            iText = s;
            iLocale = locale;
        }

        long set(long l, boolean flag)
        {
            long l1;
            if (iText == null)
            {
                l = iField.set(l, iValue);
            } else
            {
                l = iField.set(l, iText, iLocale);
            }
            l1 = l;
            if (flag)
            {
                l1 = iField.roundFloor(l);
            }
            return l1;
        }

        SavedField()
        {
        }
    }

    class SavedState
    {

        final Integer iOffset;
        final SavedField iSavedFields[];
        final int iSavedFieldsCount;
        final DateTimeZone iZone;
        final DateTimeParserBucket this$0;

        boolean restoreState(DateTimeParserBucket datetimeparserbucket)
        {
            if (datetimeparserbucket != DateTimeParserBucket.this)
            {
                return false;
            }
            datetimeparserbucket.iZone = iZone;
            datetimeparserbucket.iOffset = iOffset;
            datetimeparserbucket.iSavedFields = iSavedFields;
            if (iSavedFieldsCount < datetimeparserbucket.iSavedFieldsCount)
            {
                datetimeparserbucket.iSavedFieldsShared = true;
            }
            datetimeparserbucket.iSavedFieldsCount = iSavedFieldsCount;
            return true;
        }

        SavedState()
        {
            this$0 = DateTimeParserBucket.this;
            super();
            iZone = DateTimeParserBucket.this.iZone;
            iOffset = DateTimeParserBucket.this.iOffset;
            iSavedFields = DateTimeParserBucket.this.iSavedFields;
            iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }
    }


    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField iSavedFields[];
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public DateTimeParserBucket(long l, Chronology chronology, Locale locale)
    {
        this(l, chronology, locale, null, 2000);
    }

    public DateTimeParserBucket(long l, Chronology chronology, Locale locale, Integer integer)
    {
        this(l, chronology, locale, integer, 2000);
    }

    public DateTimeParserBucket(long l, Chronology chronology, Locale locale, Integer integer, int i)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        iMillis = l;
        iDefaultZone = chronology.getZone();
        iChrono = chronology.withUTC();
        chronology = locale;
        if (locale == null)
        {
            chronology = Locale.getDefault();
        }
        iLocale = chronology;
        iDefaultYear = i;
        iDefaultPivotYear = integer;
        iZone = iDefaultZone;
        iPivotYear = iDefaultPivotYear;
        iSavedFields = new SavedField[8];
    }

    static int compareReverse(DurationField durationfield, DurationField durationfield1)
    {
        if (durationfield == null || !durationfield.isSupported())
        {
            return durationfield1 != null && durationfield1.isSupported() ? -1 : 0;
        }
        if (durationfield1 == null || !durationfield1.isSupported())
        {
            return 1;
        } else
        {
            return -durationfield.compareTo(durationfield1);
        }
    }

    private SavedField obtainSaveField()
    {
        Object obj = iSavedFields;
        int j = iSavedFieldsCount;
        SavedField savedfield;
        if (j == obj.length || iSavedFieldsShared)
        {
            SavedField asavedfield[];
            int i;
            if (j == obj.length)
            {
                i = j * 2;
            } else
            {
                i = obj.length;
            }
            asavedfield = new SavedField[i];
            System.arraycopy(obj, 0, asavedfield, 0, j);
            iSavedFields = asavedfield;
            iSavedFieldsShared = false;
            obj = asavedfield;
        }
        iSavedState = null;
        savedfield = obj[j];
        if (savedfield == null)
        {
            savedfield = new SavedField();
            obj[j] = savedfield;
            obj = savedfield;
        } else
        {
            obj = savedfield;
        }
        iSavedFieldsCount = j + 1;
        return ((SavedField) (obj));
    }

    private static void sort(SavedField asavedfield[], int i)
    {
        int j = 0;
        if (i <= 10) goto _L2; else goto _L1
_L1:
        Arrays.sort(asavedfield, 0, i);
_L6:
        return;
_L4:
        j++;
_L2:
        if (j >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        int k = j;
        while (k > 0 && asavedfield[k - 1].compareTo(asavedfield[k]) > 0) 
        {
            SavedField savedfield = asavedfield[k];
            asavedfield[k] = asavedfield[k - 1];
            asavedfield[k - 1] = savedfield;
            k--;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public long computeMillis()
    {
        return computeMillis(false, (CharSequence)null);
    }

    public long computeMillis(boolean flag)
    {
        return computeMillis(flag, (CharSequence)null);
    }

    public long computeMillis(boolean flag, CharSequence charsequence)
    {
        Object obj;
        int j;
        obj = iSavedFields;
        j = iSavedFieldsCount;
        if (iSavedFieldsShared)
        {
            obj = (SavedField[])(SavedField[])iSavedFields.clone();
            iSavedFields = ((SavedField []) (obj));
            iSavedFieldsShared = false;
        }
        sort(((SavedField []) (obj)), j);
        if (j <= 0) goto _L2; else goto _L1
_L1:
        Object obj1;
        DurationField durationfield;
        DurationField durationfield1;
        obj1 = DurationFieldType.months().getField(iChrono);
        durationfield = DurationFieldType.days().getField(iChrono);
        durationfield1 = obj[0].iField.getDurationField();
        if (compareReverse(durationfield1, ((DurationField) (obj1))) < 0 || compareReverse(durationfield1, durationfield) > 0) goto _L2; else goto _L3
_L3:
        long l;
        saveField(DateTimeFieldType.year(), iDefaultYear);
        l = computeMillis(flag, charsequence);
_L7:
        return l;
_L2:
        int i;
        long l1;
        l = iMillis;
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            try
            {
                l = obj[i].set(l, flag);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (charsequence != null)
                {
                    ((IllegalFieldValueException) (obj)).prependMessage((new StringBuilder()).append("Cannot parse \"").append(charsequence).append('"').toString());
                }
                throw obj;
            }
            i++;
        } while (true);
        l1 = l;
          goto _L4
_L6:
        l = ((SavedField) (obj1)).set(l, flag);
        i++;
          goto _L5
_L12:
        flag = false;
          goto _L6
_L9:
        if (iOffset != null)
        {
            return l1 - (long)iOffset.intValue();
        }
        l = l1;
        if (iZone != null)
        {
            i = iZone.getOffsetFromLocal(l1);
            l1 -= i;
            l = l1;
            if (i != iZone.getOffset(l1))
            {
                obj1 = (new StringBuilder()).append("Illegal instant due to time zone offset transition (").append(iZone).append(')').toString();
                obj = obj1;
                if (charsequence != null)
                {
                    obj = (new StringBuilder()).append("Cannot parse \"").append(charsequence).append("\": ").append(((String) (obj1))).toString();
                }
                throw new IllegalInstantException(((String) (obj)));
            }
        }
          goto _L7
_L4:
        if (!flag) goto _L9; else goto _L8
_L8:
        i = 0;
_L5:
        l1 = l;
        if (i >= j) goto _L9; else goto _L10
_L10:
        obj1 = obj[i];
        if (i != j - 1) goto _L12; else goto _L11
_L11:
        flag = true;
          goto _L6
    }

    public long computeMillis(boolean flag, String s)
    {
        return computeMillis(flag, ((CharSequence) (s)));
    }

    long doParseMillis(InternalParser internalparser, CharSequence charsequence)
    {
        int j = internalparser.parseInto(this, charsequence, 0);
        int i;
        if (j >= 0)
        {
            i = j;
            if (j >= charsequence.length())
            {
                return computeMillis(true, charsequence);
            }
        } else
        {
            i = ~j;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charsequence.toString(), i));
    }

    public Chronology getChronology()
    {
        return iChrono;
    }

    public Locale getLocale()
    {
        return iLocale;
    }

    public int getOffset()
    {
        if (iOffset != null)
        {
            return iOffset.intValue();
        } else
        {
            return 0;
        }
    }

    public Integer getOffsetInteger()
    {
        return iOffset;
    }

    public Integer getPivotYear()
    {
        return iPivotYear;
    }

    public DateTimeZone getZone()
    {
        return iZone;
    }

    public long parseMillis(DateTimeParser datetimeparser, CharSequence charsequence)
    {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(datetimeparser), charsequence);
    }

    public void reset()
    {
        iZone = iDefaultZone;
        iOffset = null;
        iPivotYear = iDefaultPivotYear;
        iSavedFieldsCount = 0;
        iSavedFieldsShared = false;
        iSavedState = null;
    }

    public boolean restoreState(Object obj)
    {
        if ((obj instanceof SavedState) && ((SavedState)obj).restoreState(this))
        {
            iSavedState = obj;
            return true;
        } else
        {
            return false;
        }
    }

    public void saveField(DateTimeField datetimefield, int i)
    {
        obtainSaveField().init(datetimefield, i);
    }

    public void saveField(DateTimeFieldType datetimefieldtype, int i)
    {
        obtainSaveField().init(datetimefieldtype.getField(iChrono), i);
    }

    public void saveField(DateTimeFieldType datetimefieldtype, String s, Locale locale)
    {
        obtainSaveField().init(datetimefieldtype.getField(iChrono), s, locale);
    }

    public Object saveState()
    {
        if (iSavedState == null)
        {
            iSavedState = new SavedState();
        }
        return iSavedState;
    }

    public void setOffset(int i)
    {
        iSavedState = null;
        iOffset = Integer.valueOf(i);
    }

    public void setOffset(Integer integer)
    {
        iSavedState = null;
        iOffset = integer;
    }

    public void setPivotYear(Integer integer)
    {
        iPivotYear = integer;
    }

    public void setZone(DateTimeZone datetimezone)
    {
        iSavedState = null;
        iZone = datetimezone;
    }



/*
    static DateTimeZone access$002(DateTimeParserBucket datetimeparserbucket, DateTimeZone datetimezone)
    {
        datetimeparserbucket.iZone = datetimezone;
        return datetimezone;
    }

*/



/*
    static Integer access$102(DateTimeParserBucket datetimeparserbucket, Integer integer)
    {
        datetimeparserbucket.iOffset = integer;
        return integer;
    }

*/



/*
    static SavedField[] access$202(DateTimeParserBucket datetimeparserbucket, SavedField asavedfield[])
    {
        datetimeparserbucket.iSavedFields = asavedfield;
        return asavedfield;
    }

*/



/*
    static int access$302(DateTimeParserBucket datetimeparserbucket, int i)
    {
        datetimeparserbucket.iSavedFieldsCount = i;
        return i;
    }

*/


/*
    static boolean access$402(DateTimeParserBucket datetimeparserbucket, boolean flag)
    {
        datetimeparserbucket.iSavedFieldsShared = flag;
        return flag;
    }

*/
}
