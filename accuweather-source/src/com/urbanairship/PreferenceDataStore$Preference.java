// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.urbanairship.util.UAStringUtil;
import java.util.concurrent.Executor;

// Referenced classes of package com.urbanairship:
//            PreferenceDataStore, UrbanAirshipProvider, UrbanAirshipResolver, Logger

private class registerObserver
{

    private final String key;
    final PreferenceDataStore this$0;
    private String value;

    private void registerObserver()
    {
        ContentObserver contentobserver = new ContentObserver(null) {

            final PreferenceDataStore.Preference this$1;

            public void onChange(boolean flag)
            {
                super.onChange(flag);
                Logger.verbose((new StringBuilder()).append("Preference updated:").append(key).toString());
                executor.execute(new Runnable() {

                    final _cls2 this$2;

                    public void run()
                    {
                        syncValue();
                    }

            
            {
                this$2 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$1 = PreferenceDataStore.Preference.this;
                super(handler);
            }
        };
        Uri uri = Uri.withAppendedPath(UrbanAirshipProvider.getPreferencesContentUri(), key);
        PreferenceDataStore.access$200(PreferenceDataStore.this).registerContentObserver(uri, true, contentobserver);
    }

    private void setValue(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!UAStringUtil.equals(s, value))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        value = s;
        this;
        JVM INSTR monitorexit ;
        PreferenceDataStore.access$100(PreferenceDataStore.this, key);
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private boolean writeValue(String s)
    {
        boolean flag1 = true;
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        Logger.verbose((new StringBuilder()).append("Removing preference: ").append(key).toString());
        ContentValues contentvalues;
        if (PreferenceDataStore.access$200(PreferenceDataStore.this).delete(UrbanAirshipProvider.getPreferencesContentUri(), "_id = ?", new String[] {
    key
}) < 0)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Logger.verbose((new StringBuilder()).append("Saving preference: ").append(key).append(" value: ").append(s).toString());
        contentvalues = new ContentValues();
        contentvalues.put("_id", key);
        contentvalues.put("value", s);
        if (PreferenceDataStore.access$200(PreferenceDataStore.this).insert(UrbanAirshipProvider.getPreferencesContentUri(), contentvalues) != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    String get()
    {
        this;
        JVM INSTR monitorenter ;
        String s = value;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void put(final String value)
    {
        setValue(value);
        executor.execute(new Runnable() {

            final PreferenceDataStore.Preference this$1;
            final String val$value;

            public void run()
            {
                writeValue(value);
            }

            
            {
                this$1 = PreferenceDataStore.Preference.this;
                value = s;
                super();
            }
        });
    }

    boolean putSync(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!writeValue(s))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        setValue(s);
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    void syncValue()
    {
        Object obj = null;
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        obj = obj1;
        Object obj2 = PreferenceDataStore.access$200(PreferenceDataStore.this);
        obj = obj1;
        Uri uri = UrbanAirshipProvider.getPreferencesContentUri();
        obj = obj1;
        String s = key;
        obj = obj1;
        obj1 = ((UrbanAirshipResolver) (obj2)).query(uri, new String[] {
            "value"
        }, "_id = ?", new String[] {
            s
        }, null);
        obj = obj1;
        this;
        JVM INSTR monitorexit ;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        obj2 = ((Cursor) (obj1)).getString(0);
_L5:
        obj = obj1;
        setValue(((String) (obj2)));
_L6:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
_L4:
        obj2 = null;
          goto _L5
_L2:
        obj = obj1;
        Logger.warn((new StringBuilder()).append("Unable to get preference ").append(key).append(" from").append(" database. Falling back to cached value.").toString());
          goto _L6
    }



    _cls2.this._cls1(String s, String s1)
    {
        this$0 = PreferenceDataStore.this;
        super();
        key = s;
        value = s1;
        registerObserver();
    }
}
