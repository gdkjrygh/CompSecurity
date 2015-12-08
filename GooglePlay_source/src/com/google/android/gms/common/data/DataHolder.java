// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.AbstractWindowedCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolderCreator

public final class DataHolder
    implements SafeParcelable
{
    public static class Builder
    {

        final String mColumns[];
        private boolean mIsSorted;
        public final ArrayList mRows;
        private String mSortedColumn;
        public final String mUniqueColumn;
        public final HashMap mUniqueColumnIndices;

        public final DataHolder build(int i)
        {
            return new DataHolder(this, i);
        }

        final boolean isSortedOnColumn(String s)
        {
            Asserts.checkNotNull(s);
            return mIsSorted && s.equals(mSortedColumn);
        }

        public final Builder sort(String s)
        {
            if (isSortedOnColumn(s))
            {
                return this;
            }
            Collections.sort(mRows, new ColumnValueComparator(s));
            if (mUniqueColumn != null)
            {
                mUniqueColumnIndices.clear();
                int j = mRows.size();
                for (int i = 0; i < j; i++)
                {
                    Object obj = ((HashMap)mRows.get(i)).get(mUniqueColumn);
                    if (obj != null)
                    {
                        mUniqueColumnIndices.put(obj, Integer.valueOf(i));
                    }
                }

            }
            mIsSorted = true;
            mSortedColumn = s;
            return this;
        }

        public Builder withRow(ContentValues contentvalues)
        {
            Asserts.checkNotNull(contentvalues);
            HashMap hashmap = new HashMap(contentvalues.size());
            java.util.Map.Entry entry;
            for (contentvalues = contentvalues.valueSet().iterator(); contentvalues.hasNext(); hashmap.put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)contentvalues.next();
            }

            return withRow(hashmap);
        }

        public Builder withRow(HashMap hashmap)
        {
            Asserts.checkNotNull(hashmap);
            int i;
            if (mUniqueColumn == null)
            {
                i = -1;
            } else
            {
                Object obj = hashmap.get(mUniqueColumn);
                if (obj == null)
                {
                    i = -1;
                } else
                {
                    Integer integer = (Integer)mUniqueColumnIndices.get(obj);
                    if (integer == null)
                    {
                        mUniqueColumnIndices.put(obj, Integer.valueOf(mRows.size()));
                        i = -1;
                    } else
                    {
                        i = integer.intValue();
                    }
                }
            }
            if (i == -1)
            {
                mRows.add(hashmap);
            } else
            {
                mRows.remove(i);
                mRows.add(i, hashmap);
            }
            mIsSorted = false;
            return this;
        }

        private Builder(String as[], String s)
        {
            mColumns = (String[])Preconditions.checkNotNull(as);
            mRows = new ArrayList();
            mUniqueColumn = s;
            mUniqueColumnIndices = new HashMap();
            mIsSorted = false;
            mSortedColumn = null;
        }

        Builder(String as[], String s, byte byte0)
        {
            this(as, s);
        }
    }

    private static final class ColumnValueComparator
        implements Comparator
    {

        private final String mSortColumn;

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (HashMap)obj;
            obj1 = (HashMap)obj1;
            obj = Preconditions.checkNotNull(((HashMap) (obj)).get(mSortColumn));
            obj1 = Preconditions.checkNotNull(((HashMap) (obj1)).get(mSortColumn));
            if (obj.equals(obj1))
            {
                return 0;
            }
            if (obj instanceof Boolean)
            {
                return ((Boolean)obj).compareTo((Boolean)obj1);
            }
            if (obj instanceof Long)
            {
                return ((Long)obj).compareTo((Long)obj1);
            }
            if (obj instanceof Integer)
            {
                return ((Integer)obj).compareTo((Integer)obj1);
            }
            if (obj instanceof String)
            {
                return ((String)obj).compareTo((String)obj1);
            }
            if (obj instanceof Double)
            {
                return ((Double)obj).compareTo((Double)obj1);
            }
            if (obj instanceof Float)
            {
                return ((Float)obj).compareTo((Float)obj1);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown type for lValue ")).append(obj).toString());
            }
        }

        ColumnValueComparator(String s)
        {
            mSortColumn = (String)Preconditions.checkNotNull(s);
        }
    }

    public static final class DataHolderException extends RuntimeException
    {

        public DataHolderException(String s)
        {
            super(s);
        }
    }


    public static final DataHolderCreator CREATOR = new DataHolderCreator();
    private static final Builder EMPTY = new Builder(new String[0]) {

        public final Builder withRow(ContentValues contentvalues)
        {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

        public final Builder withRow(HashMap hashmap)
        {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

    };
    boolean mClosed;
    public Bundle mColumnBundle;
    final String mColumns[];
    public boolean mIsLeakDetectionEnabled;
    Object mLeakIdentifier;
    public final Bundle mMetadata;
    public int mRowCount;
    public final int mStatusCode;
    final int mVersionCode;
    int mWindowRowOffsets[];
    public final CursorWindow mWindows[];

    DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        mIsLeakDetectionEnabled = true;
        mVersionCode = i;
        mColumns = as;
        mWindows = acursorwindow;
        mStatusCode = j;
        mMetadata = bundle;
    }

    public DataHolder(AbstractWindowedCursor abstractwindowedcursor, int i)
    {
        this(abstractwindowedcursor.getColumnNames(), extractWindows(abstractwindowedcursor), i, ((Bundle) (null)));
    }

    DataHolder(Builder builder1, int i)
    {
        this(builder1, i, null);
    }

    private DataHolder(Builder builder1, int i, Bundle bundle)
    {
        this(builder1.mColumns, extractWindows(builder1, -1), i, bundle);
    }

    private DataHolder(Builder builder1, int i, Bundle bundle, int j)
    {
        this(builder1.mColumns, extractWindows(builder1, j), i, bundle);
    }

    DataHolder(Builder builder1, int i, Bundle bundle, int j, byte byte0)
    {
        this(builder1, i, bundle, j);
    }

    private DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
    {
        mClosed = false;
        mIsLeakDetectionEnabled = true;
        mVersionCode = 1;
        mColumns = (String[])Preconditions.checkNotNull(as);
        mWindows = (CursorWindow[])Preconditions.checkNotNull(acursorwindow);
        mStatusCode = i;
        mMetadata = bundle;
        validateContents();
    }

    public static Builder builder(String as[])
    {
        return new Builder(as, null, (byte)0);
    }

    public static Builder builder(String as[], String s)
    {
        Preconditions.checkNotNull(s);
        return new Builder(as, s, (byte)0);
    }

    public static DataHolder empty(int i)
    {
        return empty(i, null);
    }

    public static DataHolder empty(int i, Bundle bundle)
    {
        return new DataHolder(EMPTY, i, bundle);
    }

    private static CursorWindow[] extractWindows(AbstractWindowedCursor abstractwindowedcursor)
    {
        ArrayList arraylist = new ArrayList();
        CursorWindow cursorwindow;
        int j;
        j = abstractwindowedcursor.getCount();
        cursorwindow = abstractwindowedcursor.getWindow();
        int i;
        boolean flag = false;
        i = ((flag) ? 1 : 0);
        if (cursorwindow == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i = ((flag) ? 1 : 0);
        if (cursorwindow.getStartPosition() == 0)
        {
            cursorwindow.acquireReference();
            abstractwindowedcursor.setWindow(null);
            arraylist.add(cursorwindow);
            i = cursorwindow.getNumRows();
        }
_L8:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!abstractwindowedcursor.moveToPosition(i)) goto _L2; else goto _L3
_L3:
        cursorwindow = abstractwindowedcursor.getWindow();
        if (cursorwindow == null) goto _L5; else goto _L4
_L4:
        cursorwindow.acquireReference();
        abstractwindowedcursor.setWindow(null);
_L6:
        if (cursorwindow.getNumRows() != 0)
        {
            arraylist.add(cursorwindow);
            i = cursorwindow.getStartPosition() + cursorwindow.getNumRows();
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L5:
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        abstractwindowedcursor.fillWindow(i, cursorwindow);
        if (true) goto _L6; else goto _L2
        Exception exception;
        exception;
        abstractwindowedcursor.close();
        throw exception;
_L2:
        abstractwindowedcursor.close();
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static CursorWindow[] extractWindows(Builder builder1, int i)
    {
        CursorWindow cursorwindow;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int j;
        if (builder1.mColumns.length == 0)
        {
            return new CursorWindow[0];
        }
        CursorWindow cursorwindow1;
        int l;
        if (i < 0 || i >= builder1.mRows.size())
        {
            obj1 = builder1.mRows;
        } else
        {
            obj1 = builder1.mRows.subList(0, i);
        }
        l = ((List) (obj1)).size();
        obj = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(obj);
        ((CursorWindow) (obj)).setNumColumns(builder1.mColumns.length);
        j = 0;
        i = 0;
_L5:
        if (i >= l) goto _L2; else goto _L1
_L1:
        cursorwindow = ((CursorWindow) (obj));
        cursorwindow1 = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        cursorwindow1 = ((CursorWindow) (obj));
        Log.d("DataHolder", (new StringBuilder("Allocating additional cursor window for large data set (row ")).append(i).append(")").toString());
        cursorwindow1 = ((CursorWindow) (obj));
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        cursorwindow.setNumColumns(builder1.mColumns.length);
        arraylist.add(cursorwindow);
        if (cursorwindow.allocRow())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        arraylist.remove(cursorwindow);
        builder1 = (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        return builder1;
        CursorWindow cursorwindow2 = cursorwindow;
        obj = (Map)((List) (obj1)).get(i);
        int k;
        boolean flag;
        flag = true;
        k = 0;
_L8:
        cursorwindow2 = cursorwindow;
        if (k >= builder1.mColumns.length || !flag) goto _L4; else goto _L3
_L3:
        cursorwindow2 = cursorwindow;
        String s = builder1.mColumns[k];
        cursorwindow2 = cursorwindow;
        Object obj2 = ((Map) (obj)).get(s);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        cursorwindow2 = cursorwindow;
        flag = cursorwindow.putNull(i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow2 = cursorwindow;
        if (!(obj2 instanceof String))
        {
            break MISSING_BLOCK_LABEL_335;
        }
        cursorwindow2 = cursorwindow;
        flag = cursorwindow.putString((String)obj2, i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow2 = cursorwindow;
        if (!(obj2 instanceof Long))
        {
            break MISSING_BLOCK_LABEL_369;
        }
        cursorwindow2 = cursorwindow;
        flag = cursorwindow.putLong(((Long)obj2).longValue(), i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow2 = cursorwindow;
        if (!(obj2 instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_404;
        }
        cursorwindow2 = cursorwindow;
        flag = cursorwindow.putLong(((Integer)obj2).intValue(), i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow2 = cursorwindow;
        if (!(obj2 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_449;
        }
        cursorwindow2 = cursorwindow;
        CursorWindow cursorwindow3;
        long l1;
        if (((Boolean)obj2).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        cursorwindow3 = cursorwindow;
        flag = cursorwindow.putLong(l1, i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow3 = cursorwindow;
        if (!(obj2 instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_480;
        }
        cursorwindow3 = cursorwindow;
        flag = cursorwindow.putBlob((byte[])obj2, i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow3 = cursorwindow;
        if (!(obj2 instanceof Double))
        {
            break MISSING_BLOCK_LABEL_514;
        }
        cursorwindow3 = cursorwindow;
        flag = cursorwindow.putDouble(((Double)obj2).doubleValue(), i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow3 = cursorwindow;
        if (!(obj2 instanceof Float))
        {
            break MISSING_BLOCK_LABEL_549;
        }
        cursorwindow3 = cursorwindow;
        flag = cursorwindow.putDouble(((Float)obj2).floatValue(), i, k);
        break MISSING_BLOCK_LABEL_766;
        cursorwindow3 = cursorwindow;
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported object for column ")).append(s).append(": ").append(obj2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Builder builder1) { }
        break MISSING_BLOCK_LABEL_590;
_L4:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_737;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        cursorwindow3 = cursorwindow;
        throw new DataHolderException("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        cursorwindow3 = cursorwindow;
        Log.d("DataHolder", (new StringBuilder("Couldn't populate window data for row ")).append(i).append(" - allocating new window.").toString());
        cursorwindow3 = cursorwindow;
        cursorwindow.freeLastRow();
        cursorwindow3 = cursorwindow;
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        cursorwindow.setNumColumns(builder1.mColumns.length);
        arraylist.add(cursorwindow);
        i--;
        j = 1;
_L6:
        i++;
        obj = cursorwindow;
          goto _L5
        j = 0;
          goto _L6
_L7:
        i = 0;
        for (j = arraylist.size(); i < j; i++)
        {
            ((CursorWindow)arraylist.get(i)).close();
        }

        throw builder1;
          goto _L5
_L2:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        builder1;
          goto _L7
        k++;
          goto _L8
    }

    public final void checkColumnAndRow(String s, int i)
    {
        if (mColumnBundle == null || !mColumnBundle.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= mRowCount)
        {
            throw new CursorIndexOutOfBoundsException(i, mRowCount);
        } else
        {
            return;
        }
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed) goto _L2; else goto _L1
_L1:
        mClosed = true;
        int i = 0;
_L3:
        if (i >= mWindows.length)
        {
            break; /* Loop/switch isn't completed */
        }
        mWindows[i].close();
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int describeContents()
    {
        return 0;
    }

    protected final void finalize()
        throws Throwable
    {
        if (!mIsLeakDetectionEnabled || mWindows.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (mLeakIdentifier != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = mLeakIdentifier.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final boolean getBoolean(String s, int i, int j)
    {
        checkColumnAndRow(s, i);
        return Long.valueOf(mWindows[j].getLong(i, mColumnBundle.getInt(s))).longValue() == 1L;
    }

    public final int getInteger(String s, int i, int j)
    {
        checkColumnAndRow(s, i);
        return mWindows[j].getInt(i, mColumnBundle.getInt(s));
    }

    public final long getLong(String s, int i, int j)
    {
        checkColumnAndRow(s, i);
        return mWindows[j].getLong(i, mColumnBundle.getInt(s));
    }

    public final String getString(String s, int i, int j)
    {
        checkColumnAndRow(s, i);
        return mWindows[j].getString(i, mColumnBundle.getInt(s));
    }

    public final int getWindowIndex(int i)
    {
        int k;
        boolean flag;
        if (i >= 0 && i < mRowCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        k = 0;
        do
        {
label0:
            {
                int j = k;
                if (k < mWindowRowOffsets.length)
                {
                    if (i >= mWindowRowOffsets[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == mWindowRowOffsets.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    public final boolean hasColumn(String s)
    {
        return mColumnBundle.containsKey(s);
    }

    public final boolean hasNull(String s, int i, int j)
    {
        checkColumnAndRow(s, i);
        return mWindows[j].isNull(i, mColumnBundle.getInt(s));
    }

    public final boolean isClosed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mClosed;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void validateContents()
    {
        mColumnBundle = new Bundle();
        for (int i = 0; i < mColumns.length; i++)
        {
            mColumnBundle.putInt(mColumns[i], i);
        }

        mWindowRowOffsets = new int[mWindows.length];
        int k = 0;
        for (int j = 0; j < mWindows.length; j++)
        {
            mWindowRowOffsets[j] = k;
            int l = mWindows[j].getStartPosition();
            k += mWindows[j].getNumRows() - (k - l);
        }

        mRowCount = k;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DataHolderCreator.writeToParcel(this, parcel, i);
    }

}
