// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class ActivityChooserModel extends DataSetObservable
{
    public final class ActivityResolveInfo
        implements Comparable
    {

        public final ResolveInfo resolveInfo;

        public final volatile int compareTo(Object obj)
        {
            return Float.floatToIntBits(0.0F) - Float.floatToIntBits(0.0F);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                if (Float.floatToIntBits(0.0F) != Float.floatToIntBits(0.0F))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Float.floatToIntBits(0.0F) + 31;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
            stringbuilder.append("; weight:").append(new BigDecimal(0.0D));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
    }

    public static final class HistoricalRecord
    {

        public final ComponentName activity;
        public final long time;
        public final float weight;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (HistoricalRecord)obj;
                if (activity == null)
                {
                    if (((HistoricalRecord) (obj)).activity != null)
                    {
                        return false;
                    }
                } else
                if (!activity.equals(((HistoricalRecord) (obj)).activity))
                {
                    return false;
                }
                if (time != ((HistoricalRecord) (obj)).time)
                {
                    return false;
                }
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((HistoricalRecord) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i;
            if (activity == null)
            {
                i = 0;
            } else
            {
                i = activity.hashCode();
            }
            return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("; activity:").append(activity);
            stringbuilder.append("; time:").append(time);
            stringbuilder.append("; weight:").append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public HistoricalRecord(ComponentName componentname, long l, float f)
        {
            activity = componentname;
            time = l;
            weight = f;
        }

        public HistoricalRecord(String s, long l, float f)
        {
            this(ComponentName.unflattenFromString(s), l, f);
        }
    }

    private final class PersistHistoryAsyncTask extends AsyncTask
    {

        final ActivityChooserModel this$0;

        private transient Void doInBackground(Object aobj[])
        {
            Object obj1;
            List list = (List)aobj[0];
            obj1 = (String)aobj[1];
            HistoricalRecord historicalrecord;
            int i;
            int j;
            try
            {
                aobj = mContext.openFileOutput(((String) (obj1)), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(((String) (obj1))).toString(), ((Throwable) (aobj)));
                return null;
            }
            obj1 = Xml.newSerializer();
            ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
            ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer) (obj1)).startTag(null, "historical-records");
            j = list.size();
            i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            historicalrecord = (HistoricalRecord)list.remove(0);
            ((XmlSerializer) (obj1)).startTag(null, "historical-record");
            ((XmlSerializer) (obj1)).attribute(null, "activity", historicalrecord.activity.flattenToString());
            ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(historicalrecord.time));
            ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(historicalrecord.weight));
            ((XmlSerializer) (obj1)).endTag(null, "historical-record");
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            ((XmlSerializer) (obj1)).endTag(null, "historical-records");
            ((XmlSerializer) (obj1)).endDocument();
            mCanReadHistoricalData;
            Object obj;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            return null;
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            continue; /* Loop/switch isn't completed */
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            continue; /* Loop/switch isn't completed */
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            if (true) goto _L4; else goto _L3
_L3:
            break MISSING_BLOCK_LABEL_396;
_L4:
            break MISSING_BLOCK_LABEL_233;
            obj;
            mCanReadHistoricalData;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            throw obj;
        }

        public final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground(aobj);
        }

        private PersistHistoryAsyncTask()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

        PersistHistoryAsyncTask(byte byte0)
        {
            null. this();
        }
    }


    private static final String LOG_TAG = android/support/v7/internal/widget/ActivityChooserModel.getSimpleName();
    private static final Map sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    final List mActivities;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    final List mHistoricalRecords;
    boolean mHistoricalRecordsChanged;
    final String mHistoryFileName;
    final Object mInstanceLock;
    boolean mReadShareHistoryCalled;

    private void readHistoricalDataImpl()
    {
        Object obj;
        Object obj1;
        Exception exception;
        List list;
        int i;
        try
        {
            obj = mContext.openFileInput(mHistoryFileName);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        i = 0;
_L1:
        if (i == 1 || i == 2)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(LOG_TAG, (new StringBuilder("Error reading historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = mHistoricalRecords;
        list.clear();
_L4:
        i = ((XmlPullParser) (obj1)).next();
        if (i == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 3 || i == 4) goto _L4; else goto _L3
_L3:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_211;
        obj1;
        Log.e(LOG_TAG, (new StringBuilder("Error reading historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        list.add(new HistoricalRecord(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L4
        exception;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        ioexception;
    }

    public final Intent chooseActivity$5c5d9cdb()
    {
        throw new NullPointerException();
    }

    final void ensureConsistentState()
    {
        boolean flag = true;
        if (mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(mHistoryFileName))
        {
            mCanReadHistoricalData = false;
            mReadShareHistoryCalled = true;
            readHistoricalDataImpl();
        } else
        {
            flag = false;
        }
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (flag | false)
        {
            notifyChanged();
        }
    }

    public final ResolveInfo getActivity(int i)
    {
        throw new NullPointerException();
    }

    public final int getActivityCount()
    {
        throw new NullPointerException();
    }

    public final int getActivityIndex(ResolveInfo resolveinfo)
    {
        throw new NullPointerException();
    }

    public final ResolveInfo getDefaultActivity()
    {
        throw new NullPointerException();
    }

    final void pruneExcessiveHistoricalRecordsIfNeeded()
    {
        int j = mHistoricalRecords.size() + 0;
        if (j > 0)
        {
            mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < j) 
            {
                mHistoricalRecords.remove(0);
                i++;
            }
        }
    }






/*
    static boolean access$502$7906a670(ActivityChooserModel activitychoosermodel)
    {
        activitychoosermodel.mCanReadHistoricalData = true;
        return true;
    }

*/
}
