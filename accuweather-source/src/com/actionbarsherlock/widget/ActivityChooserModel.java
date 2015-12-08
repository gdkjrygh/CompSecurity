// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable
{
    public static interface ActivityChooserModelClient
    {

        public abstract void setActivityChooserModel(ActivityChooserModel activitychoosermodel);
    }

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

    private final class DefaultSorter
        implements ActivitySorter
    {

        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
        private final Map mPackageNameToActivityMap;
        final ActivityChooserModel this$0;

        public void sort(Intent intent, List list, List list1)
        {
            intent = mPackageNameToActivityMap;
            intent.clear();
            int k = list.size();
            for (int i = 0; i < k; i++)
            {
                ActivityResolveInfo activityresolveinfo = (ActivityResolveInfo)list.get(i);
                activityresolveinfo.weight = 0.0F;
                intent.put(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo);
            }

            int j = list1.size();
            float f = 1.0F;
            for (j--; j >= 0;)
            {
                HistoricalRecord historicalrecord = (HistoricalRecord)list1.get(j);
                ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)intent.get(historicalrecord.activity.getPackageName());
                float f1 = f;
                if (activityresolveinfo1 != null)
                {
                    activityresolveinfo1.weight = activityresolveinfo1.weight + historicalrecord.weight * f;
                    f1 = f * 0.95F;
                }
                j--;
                f = f1;
            }

            Collections.sort(list);
        }

        private DefaultSorter()
        {
            this$0 = ActivityChooserModel.this;
            super();
            mPackageNameToActivityMap = new HashMap();
        }

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

    private final class HistoryLoader
        implements Runnable
    {

        final ActivityChooserModel this$0;

        public void run()
        {
            Object obj = mContext.openFileInput(mHistoryFileName);
            Object obj1;
            obj1 = Xml.newPullParser();
            ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
            int i = 0;
_L1:
            if (i == 1 || i == 2)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            i = ((XmlPullParser) (obj1)).next();
              goto _L1
            if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
            {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            break MISSING_BLOCK_LABEL_125;
            obj1;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
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
            break MISSING_BLOCK_LABEL_457;
            Object obj2 = new ArrayList();
_L6:
            i = ((XmlPullParser) (obj1)).next();
            if (i != 1) goto _L3; else goto _L2
_L2:
            obj1 = mInstanceLock;
            obj1;
            JVM INSTR monitorenter ;
            List list;
            obj2 = new LinkedHashSet(((java.util.Collection) (obj2)));
            list = mHistoricalRecords;
            i = list.size() - 1;
_L4:
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_361;
            }
            ((Set) (obj2)).add((HistoricalRecord)list.get(i));
            i--;
            if (true) goto _L4; else goto _L3
_L3:
            if (i == 3 || i == 4) goto _L6; else goto _L5
_L5:
            if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
            {
                throw new XmlPullParserException("Share records file not well-formed.");
            }
            break MISSING_BLOCK_LABEL_300;
            obj1;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
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
            break MISSING_BLOCK_LABEL_457;
            ((List) (obj2)).add(new HistoricalRecord(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
              goto _L6
            obj1;
            IOException ioexception;
            Exception exception;
            if (obj != null)
            {
                try
                {
                    ((FileInputStream) (obj)).close();
                }
                catch (IOException ioexception1) { }
            }
            throw obj1;
            if (list.size() != ((Set) (obj2)).size())
            {
                break MISSING_BLOCK_LABEL_390;
            }
            obj1;
            JVM INSTR monitorexit ;
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
            break MISSING_BLOCK_LABEL_457;
            list.clear();
            list.addAll(((java.util.Collection) (obj2)));
            mHistoricalRecordsChanged = true;
            mHandler.post(new Runnable() {

                final HistoryLoader this$1;

                public void run()
                {
                    pruneExcessiveHistoricalRecordsLocked();
                    sortActivities();
                }

            
            {
                this$1 = HistoryLoader.this;
                super();
            }
            });
            obj1;
            JVM INSTR monitorexit ;
            if (obj != null)
            {
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
            }
            break MISSING_BLOCK_LABEL_457;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
            FileNotFoundException filenotfoundexception;
            filenotfoundexception;
        }

        private HistoryLoader()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

    }

    private final class HistoryPersister
        implements Runnable
    {

        final ActivityChooserModel this$0;

        public void run()
        {
            Object obj1 = mInstanceLock;
            obj1;
            JVM INSTR monitorenter ;
            ArrayList arraylist = new ArrayList(mHistoricalRecords);
            obj1;
            JVM INSTR monitorexit ;
            Object obj = mContext.openFileOutput(mHistoryFileName, 0);
            obj1 = Xml.newSerializer();
            int j;
            ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (obj)), null);
            ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer) (obj1)).startTag(null, "historical-records");
            j = arraylist.size();
            int i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            HistoricalRecord historicalrecord = (HistoricalRecord)arraylist.remove(0);
            ((XmlSerializer) (obj1)).startTag(null, "historical-record");
            ((XmlSerializer) (obj1)).attribute(null, "activity", historicalrecord.activity.flattenToString());
            ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(historicalrecord.time));
            ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(historicalrecord.weight));
            ((XmlSerializer) (obj1)).endTag(null, "historical-record");
            i++;
            if (true) goto _L2; else goto _L1
            obj;
_L6:
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
_L3:
            return;
_L1:
            ((XmlSerializer) (obj1)).endTag(null, "historical-records");
            ((XmlSerializer) (obj1)).endDocument();
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
              goto _L3
            Object obj2;
            obj2;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj2)));
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
              goto _L3
            obj2;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj2)));
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
              goto _L3
            obj2;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj2)));
            if (obj == null) goto _L3; else goto _L4
_L4:
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            obj2;
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw obj2;
            obj;
            if (true) goto _L6; else goto _L5
_L5:
        }

        private HistoryPersister()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

    }

    public static interface OnChooseActivityListener
    {

        public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
    }


    private static final String ATTRIBUTE_ACTIVITY = "activity";
    private static final String ATTRIBUTE_TIME = "time";
    private static final String ATTRIBUTE_WEIGHT = "weight";
    private static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1F;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = com/actionbarsherlock/widget/ActivityChooserModel.getSimpleName();
    private static final Executor SERIAL_EXECUTOR = Executors.newSingleThreadExecutor();
    private static final String TAG_HISTORICAL_RECORD = "historical-record";
    private static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List mActivites = new ArrayList();
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final List mHistoricalRecords = new ArrayList();
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock = new Object();
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;

    private ActivityChooserModel(Context context, String s)
    {
        mActivitySorter = new DefaultSorter();
        mHistoryMaxSize = 50;
        mCanReadHistoricalData = true;
        mReadShareHistoryCalled = false;
        mHistoricalRecordsChanged = true;
        mContext = context.getApplicationContext();
        if (!TextUtils.isEmpty(s) && !s.endsWith(".xml"))
        {
            mHistoryFileName = (new StringBuilder()).append(s).append(".xml").toString();
            return;
        } else
        {
            mHistoryFileName = s;
            return;
        }
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalrecord)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = mHistoricalRecords.add(historicalrecord);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        mHistoricalRecordsChanged = true;
        pruneExcessiveHistoricalRecordsLocked();
        persistHistoricalData();
        sortActivities();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        historicalrecord;
        obj;
        JVM INSTR monitorexit ;
        throw historicalrecord;
    }

    public static ActivityChooserModel get(Context context, String s)
    {
        Object obj = sRegistryLock;
        obj;
        JVM INSTR monitorenter ;
        ActivityChooserModel activitychoosermodel1 = (ActivityChooserModel)sDataModelRegistry.get(s);
        ActivityChooserModel activitychoosermodel;
        activitychoosermodel = activitychoosermodel1;
        if (activitychoosermodel1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        activitychoosermodel = new ActivityChooserModel(context, s);
        sDataModelRegistry.put(s, activitychoosermodel);
        activitychoosermodel.readHistoricalData();
        obj;
        JVM INSTR monitorexit ;
        return activitychoosermodel;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void loadActivitiesLocked()
    {
        mActivites.clear();
        if (mIntent != null)
        {
            List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
                mActivites.add(new ActivityResolveInfo(resolveinfo));
            }

            sortActivities();
            return;
        } else
        {
            notifyChanged();
            return;
        }
    }

    private void persistHistoricalData()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mReadShareHistoryCalled)
        {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        break MISSING_BLOCK_LABEL_30;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (mHistoricalRecordsChanged)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        mHistoricalRecordsChanged = false;
        mCanReadHistoricalData = true;
        if (!TextUtils.isEmpty(mHistoryFileName))
        {
            SERIAL_EXECUTOR.execute(new HistoryPersister());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    private void pruneExcessiveHistoricalRecordsLocked()
    {
        List list = mHistoricalRecords;
        int j = list.size() - mHistoryMaxSize;
        if (j > 0)
        {
            mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < j) 
            {
                HistoricalRecord historicalrecord = (HistoricalRecord)list.remove(0);
                i++;
            }
        }
    }

    private void readHistoricalData()
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mCanReadHistoricalData && mHistoricalRecordsChanged)
                {
                    break label0;
                }
            }
            return;
        }
        mCanReadHistoricalData = false;
        mReadShareHistoryCalled = true;
        if (!TextUtils.isEmpty(mHistoryFileName))
        {
            SERIAL_EXECUTOR.execute(new HistoryLoader());
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void sortActivities()
    {
        synchronized (mInstanceLock)
        {
            if (mActivitySorter != null && !mActivites.isEmpty())
            {
                mActivitySorter.sort(mIntent, mActivites, Collections.unmodifiableList(mHistoricalRecords));
                notifyChanged();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent chooseActivity(int i)
    {
        Object obj = (ActivityResolveInfo)mActivites.get(i);
        obj = new ComponentName(((ActivityResolveInfo) (obj)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj)).resolveInfo.activityInfo.name);
        Intent intent = new Intent(mIntent);
        intent.setComponent(((ComponentName) (obj)));
        if (mActivityChoserModelPolicy != null)
        {
            Intent intent1 = new Intent(intent);
            if (mActivityChoserModelPolicy.onChooseActivity(this, intent1))
            {
                return null;
            }
        }
        addHisoricalRecord(new HistoricalRecord(((ComponentName) (obj)), System.currentTimeMillis(), 1.0F));
        return intent;
    }

    public ResolveInfo getActivity(int i)
    {
        ResolveInfo resolveinfo;
        synchronized (mInstanceLock)
        {
            resolveinfo = ((ActivityResolveInfo)mActivites.get(i)).resolveInfo;
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
            i = mActivites.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getActivityIndex(ResolveInfo resolveinfo)
    {
        List list = mActivites;
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            if (((ActivityResolveInfo)list.get(i)).resolveInfo == resolveinfo)
            {
                return i;
            }
        }

        return -1;
    }

    public ResolveInfo getDefaultActivity()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        if (mActivites.isEmpty())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        resolveinfo = ((ActivityResolveInfo)mActivites.get(0)).resolveInfo;
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

    public int getHistoryMaxSize()
    {
        int i;
        synchronized (mInstanceLock)
        {
            i = mHistoryMaxSize;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getHistorySize()
    {
        int i;
        synchronized (mInstanceLock)
        {
            i = mHistoricalRecords.size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent getIntent()
    {
        Intent intent;
        synchronized (mInstanceLock)
        {
            intent = mIntent;
        }
        return intent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setActivitySorter(ActivitySorter activitysorter)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mActivitySorter != activitysorter)
                {
                    break label0;
                }
            }
            return;
        }
        mActivitySorter = activitysorter;
        sortActivities();
        obj;
        JVM INSTR monitorexit ;
        return;
        activitysorter;
        obj;
        JVM INSTR monitorexit ;
        throw activitysorter;
    }

    public void setDefaultActivity(int i)
    {
        ActivityResolveInfo activityresolveinfo = (ActivityResolveInfo)mActivites.get(i);
        ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)mActivites.get(0);
        float f;
        if (activityresolveinfo1 != null)
        {
            f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
        } else
        {
            f = 1.0F;
        }
        addHisoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
    }

    public void setHistoryMaxSize(int i)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mHistoryMaxSize != i)
                {
                    break label0;
                }
            }
            return;
        }
        mHistoryMaxSize = i;
        pruneExcessiveHistoricalRecordsLocked();
        sortActivities();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setIntent(Intent intent)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mIntent != intent)
                {
                    break label0;
                }
            }
            return;
        }
        mIntent = intent;
        loadActivitiesLocked();
        obj;
        JVM INSTR monitorexit ;
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
    {
        mActivityChoserModelPolicy = onchooseactivitylistener;
    }









/*
    static boolean access$702(ActivityChooserModel activitychoosermodel, boolean flag)
    {
        activitychoosermodel.mHistoricalRecordsChanged = flag;
        return flag;
    }

*/


}
