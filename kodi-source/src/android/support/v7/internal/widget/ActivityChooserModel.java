// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.os.AsyncTaskCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
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
        final ActivityChooserModel this$0;
        public float weight;

        public int compareTo(ActivityResolveInfo activityresolveinfo)
        {
            return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((ActivityResolveInfo)obj);
        }

        public boolean equals(Object obj)
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
                obj = (ActivityResolveInfo)obj;
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Float.floatToIntBits(weight) + 31;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
            stringbuilder.append("; weight:").append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public ActivityResolveInfo(ResolveInfo resolveinfo)
        {
            this$0 = ActivityChooserModel.this;
            super();
            resolveInfo = resolveinfo;
        }
    }

    public static interface ActivitySorter
    {

        public abstract void sort(Intent intent, List list, List list1);
    }

    public static final class HistoricalRecord
    {

        public final ComponentName activity;
        public final long time;
        public final float weight;

        public boolean equals(Object obj)
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

        public int hashCode()
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

        public String toString()
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

    public static interface OnChooseActivityListener
    {

        public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
    }

    private final class PersistHistoryAsyncTask extends AsyncTask
    {

        final ActivityChooserModel this$0;

        public volatile Object doInBackground(Object aobj[])
        {
            return doInBackground(aobj);
        }

        public transient Void doInBackground(Object aobj[])
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
                Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
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
            mCanReadHistoricalData = true;
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
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
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
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
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
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
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
            break MISSING_BLOCK_LABEL_412;
_L4:
            break MISSING_BLOCK_LABEL_237;
            obj;
            mCanReadHistoricalData = true;
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

        private PersistHistoryAsyncTask()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

    }


    private static final String LOG_TAG = android/support/v7/internal/widget/ActivityChooserModel.getSimpleName();
    private static final Map sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List mActivities;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    private boolean addHisoricalRecord(HistoricalRecord historicalrecord)
    {
        boolean flag = mHistoricalRecords.add(historicalrecord);
        if (flag)
        {
            mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return flag;
    }

    private void ensureConsistentState()
    {
        boolean flag = loadActivitiesIfNeeded();
        boolean flag1 = readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (flag | flag1)
        {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    private boolean loadActivitiesIfNeeded()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mReloadActivities)
        {
            flag = flag1;
            if (mIntent != null)
            {
                mReloadActivities = false;
                mActivities.clear();
                List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
                int j = list.size();
                for (int i = 0; i < j; i++)
                {
                    ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
                    mActivities.add(new ActivityResolveInfo(resolveinfo));
                }

                flag = true;
            }
        }
        return flag;
    }

    private void persistHistoricalDataIfNeeded()
    {
        if (!mReadShareHistoryCalled)
        {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (mHistoricalRecordsChanged)
        {
            mHistoricalRecordsChanged = false;
            if (!TextUtils.isEmpty(mHistoryFileName))
            {
                AsyncTaskCompat.executeParallel(new PersistHistoryAsyncTask(), new Object[] {
                    mHistoricalRecords, mHistoryFileName
                });
                return;
            }
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded()
    {
        int j = mHistoricalRecords.size() - mHistoryMaxSize;
        if (j > 0)
        {
            mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < j) 
            {
                HistoricalRecord historicalrecord = (HistoricalRecord)mHistoricalRecords.remove(0);
                i++;
            }
        }
    }

    private boolean readHistoricalDataIfNeeded()
    {
        if (mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(mHistoryFileName))
        {
            mCanReadHistoricalData = false;
            mReadShareHistoryCalled = true;
            readHistoricalDataImpl();
            return true;
        } else
        {
            return false;
        }
    }

    private void readHistoricalDataImpl()
    {
        Object obj = mContext.openFileInput(mHistoryFileName);
        Object obj1;
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        int i = 0;
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
        break MISSING_BLOCK_LABEL_116;
        obj1;
        Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_298;
        List list;
        list = mHistoricalRecords;
        list.clear();
_L3:
        i = ((XmlPullParser) (obj1)).next();
        if (i == 1)
        {
            if (obj != null)
            {
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
            }
            break MISSING_BLOCK_LABEL_298;
        }
        if (i == 3 || i == 4) goto _L3; else goto _L2
_L2:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_230;
        obj1;
        Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj != null)
        {
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
        }
        break MISSING_BLOCK_LABEL_298;
        list.add(new HistoricalRecord(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L3
        Exception exception;
        exception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        throw exception;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
    }

    private boolean sortActivitiesIfNeeded()
    {
        if (mActivitySorter != null && mIntent != null && !mActivities.isEmpty() && !mHistoricalRecords.isEmpty())
        {
            mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
            return true;
        } else
        {
            return false;
        }
    }

    public Intent chooseActivity(int i)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mIntent != null)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj1;
        Intent intent;
        ensureConsistentState();
        obj1 = (ActivityResolveInfo)mActivities.get(i);
        obj1 = new ComponentName(((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.name);
        intent = new Intent(mIntent);
        intent.setComponent(((ComponentName) (obj1)));
        if (mActivityChoserModelPolicy == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Intent intent1 = new Intent(intent);
        if (!mActivityChoserModelPolicy.onChooseActivity(this, intent1))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        addHisoricalRecord(new HistoricalRecord(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ResolveInfo getActivity(int i)
    {
        ResolveInfo resolveinfo;
        synchronized (mInstanceLock)
        {
            ensureConsistentState();
            resolveinfo = ((ActivityResolveInfo)mActivities.get(i)).resolveInfo;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getActivityCount()
    {
        int i;
        synchronized (mInstanceLock)
        {
            ensureConsistentState();
            i = mActivities.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getActivityIndex(ResolveInfo resolveinfo)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j;
        ensureConsistentState();
        list = mActivities;
        j = list.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((ActivityResolveInfo)list.get(i)).resolveInfo != resolveinfo)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj;
        JVM INSTR monitorexit ;
        return i;
        obj;
        JVM INSTR monitorexit ;
        return -1;
        resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        throw resolveinfo;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ResolveInfo getDefaultActivity()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        ensureConsistentState();
        if (mActivities.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((ActivityResolveInfo)mActivities.get(0)).resolveInfo;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setDefaultActivity(int i)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ActivityResolveInfo activityresolveinfo;
        ActivityResolveInfo activityresolveinfo1;
        ensureConsistentState();
        activityresolveinfo = (ActivityResolveInfo)mActivities.get(i);
        activityresolveinfo1 = (ActivityResolveInfo)mActivities.get(0);
        if (activityresolveinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
_L1:
        addHisoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        f = 1.0F;
          goto _L1
    }






/*
    static boolean access$502(ActivityChooserModel activitychoosermodel, boolean flag)
    {
        activitychoosermodel.mCanReadHistoricalData = flag;
        return flag;
    }

*/
}
