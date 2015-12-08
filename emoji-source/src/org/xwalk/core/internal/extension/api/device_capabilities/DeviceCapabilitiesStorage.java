// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.os.StatFs;
import android.util.SparseArray;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilities

class DeviceCapabilitiesStorage
{
    class StorageUnit
    {

        private long mAvailCapacity;
        private long mCapacity;
        private int mId;
        private String mName;
        private String mPath;
        private String mType;
        final DeviceCapabilitiesStorage this$0;

        public JSONObject convertToJSON()
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("id", Integer.toString(mId + 1));
                jsonobject.put("name", mName);
                jsonobject.put("type", mType);
                jsonobject.put("capacity", mCapacity);
                jsonobject.put("availCapacity", mAvailCapacity);
            }
            catch (JSONException jsonexception)
            {
                return mDeviceCapabilities.setErrorMessage(jsonexception.toString());
            }
            return jsonobject;
        }

        public long getAvailCapacity()
        {
            return mAvailCapacity;
        }

        public long getCapacity()
        {
            return mCapacity;
        }

        public int getId()
        {
            return mId;
        }

        public String getName()
        {
            return mName;
        }

        public String getPath()
        {
            return mPath;
        }

        public String getType()
        {
            return mType;
        }

        public boolean isSame(StorageUnit storageunit)
        {
            return mPath == storageunit.getPath();
        }

        public boolean isValid()
        {
            if (mPath == null || mPath.isEmpty())
            {
                mCapacity = 0L;
                mAvailCapacity = 0L;
                return false;
            } else
            {
                return (new File(mPath)).canRead();
            }
        }

        public void setPath(String s)
        {
            mPath = s;
            updateCapacity();
        }

        public void setType(String s)
        {
            mType = s;
        }

        public void updateCapacity()
        {
            if (!isValid())
            {
                return;
            }
            StatFs statfs = new StatFs(mPath);
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                long l = statfs.getBlockSizeLong();
                mCapacity = statfs.getBlockCountLong() * l;
                mAvailCapacity = statfs.getAvailableBlocksLong() * l;
                return;
            } else
            {
                long l1 = statfs.getBlockSize();
                mCapacity = (long)statfs.getBlockCount() * l1;
                mAvailCapacity = (long)statfs.getAvailableBlocks() * l1;
                return;
            }
        }

        public StorageUnit(int i, String s, String s1)
        {
            this$0 = DeviceCapabilitiesStorage.this;
            super();
            mId = i;
            mName = s;
            mType = s1;
            mPath = "";
            mCapacity = 0L;
            mAvailCapacity = 0L;
        }
    }


    private static final String TAG = "DeviceCapabilitiesStorage";
    private static int mStorageCount = 0;
    private WeakReference mActivity;
    private DeviceCapabilities mDeviceCapabilities;
    private IntentFilter mIntentFilter;
    private boolean mIsListening;
    private final SparseArray mStorageList = new SparseArray();
    private final BroadcastReceiver mStorageListener = new BroadcastReceiver() {

        final DeviceCapabilitiesStorage this$0;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("android.intent.action.MEDIA_MOUNTED".equals(context))
            {
                notifyAndSaveAttachedStorage();
            }
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(context) || "android.intent.action.MEDIA_REMOVED".equals(context) || "android.intent.action.MEDIA_BAD_REMOVAL".equals(context))
            {
                notifyAndRemoveDetachedStorage();
            }
        }

            
            {
                this$0 = DeviceCapabilitiesStorage.this;
                super();
            }
    };

    public DeviceCapabilitiesStorage(DeviceCapabilities devicecapabilities, Activity activity)
    {
        mIsListening = false;
        mIntentFilter = new IntentFilter();
        mDeviceCapabilities = devicecapabilities;
        mActivity = new WeakReference(activity);
        registerIntentFilter();
        initStorageList();
    }

    private boolean attemptAddExternalStorage()
    {
        int i = mStorageCount - 1;
        StorageUnit storageunit = new StorageUnit(mStorageCount, new String((new StringBuilder()).append("sdcard").append(Integer.toString(i)).toString()), "removable");
        storageunit.setPath((new StringBuilder()).append("/storage/sdcard").append(Integer.toString(i)).toString());
        if (!storageunit.isValid())
        {
            return false;
        }
        for (int j = 0; j < mStorageList.size(); j++)
        {
            if (storageunit.isSame((StorageUnit)mStorageList.valueAt(j)))
            {
                return false;
            }
        }

        mStorageList.put(mStorageCount, storageunit);
        mStorageCount++;
        return true;
    }

    private void initStorageList()
    {
        mStorageList.clear();
        mStorageCount = 0;
        StorageUnit storageunit = new StorageUnit(mStorageCount, "Internal", "fixed");
        storageunit.setPath(Environment.getRootDirectory().getAbsolutePath());
        mStorageList.put(mStorageCount, storageunit);
        mStorageCount++;
        int i = mStorageCount;
        storageunit = new StorageUnit(mStorageCount, new String((new StringBuilder()).append("sdcard").append(Integer.toString(i - 1)).toString()), "fixed");
        if (Environment.isExternalStorageRemovable())
        {
            storageunit.setType("removable");
        }
        storageunit.setPath(Environment.getExternalStorageDirectory().getAbsolutePath());
        if (storageunit.isValid())
        {
            mStorageList.put(mStorageCount, storageunit);
            mStorageCount++;
        }
        attemptAddExternalStorage();
    }

    private void notifyAndRemoveDetachedStorage()
    {
        StorageUnit storageunit = (StorageUnit)mStorageList.valueAt(mStorageList.size() - 1);
        if (storageunit.getType() != "removable")
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("reply", "detachStorage");
            jsonobject.put("eventName", "storagedetach");
            jsonobject.put("data", storageunit.convertToJSON());
            mDeviceCapabilities.broadcastMessage(jsonobject.toString());
            mStorageList.remove(storageunit.getId());
            mStorageCount--;
            return;
        }
        catch (JSONException jsonexception)
        {
            mDeviceCapabilities.printErrorMessage(jsonexception);
        }
    }

    private void notifyAndSaveAttachedStorage()
    {
        if (!attemptAddExternalStorage())
        {
            return;
        }
        StorageUnit storageunit = (StorageUnit)mStorageList.valueAt(mStorageList.size() - 1);
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("reply", "attachStorage");
            jsonobject.put("eventName", "storageattach");
            jsonobject.put("data", storageunit.convertToJSON());
            mDeviceCapabilities.broadcastMessage(jsonobject.toString());
            return;
        }
        catch (JSONException jsonexception)
        {
            mDeviceCapabilities.printErrorMessage(jsonexception);
        }
    }

    private void registerIntentFilter()
    {
        mIntentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        mIntentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        mIntentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        mIntentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        mIntentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        mIntentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        mIntentFilter.addDataScheme("file");
    }

    public JSONObject getInfo()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        int i = 0;
        do
        {
            try
            {
                if (i >= mStorageList.size())
                {
                    break;
                }
                jsonarray.put(((StorageUnit)mStorageList.valueAt(i)).convertToJSON());
            }
            catch (JSONException jsonexception)
            {
                return mDeviceCapabilities.setErrorMessage(jsonexception.toString());
            }
            i++;
        } while (true);
        jsonobject.put("storages", jsonarray);
        return jsonobject;
    }

    public void onDestroy()
    {
    }

    public void onPause()
    {
        unregisterListener();
    }

    public void onResume()
    {
        if (!((StorageUnit)mStorageList.valueAt(mStorageList.size() - 1)).isValid())
        {
            notifyAndRemoveDetachedStorage();
        }
        notifyAndSaveAttachedStorage();
        registerListener();
    }

    public void registerListener()
    {
        if (!mIsListening)
        {
            mIsListening = true;
            Activity activity = (Activity)mActivity.get();
            if (activity != null)
            {
                activity.registerReceiver(mStorageListener, mIntentFilter);
                return;
            }
        }
    }

    public void unregisterListener()
    {
        if (mIsListening)
        {
            mIsListening = false;
            Activity activity = (Activity)mActivity.get();
            if (activity != null)
            {
                activity.unregisterReceiver(mStorageListener);
                return;
            }
        }
    }




}
