// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            SessionHandler, AmpUploadHandler, Constants, LocalyticsProvider, 
//            AmpCondition, AmpHelper, AmpDownloader, TestModeButton, 
//            TestModeListView, AmpRulesAdapter, UploadHandler, AmpCallable, 
//            JsonHelper, AmpDialogFragment, JavaScriptClient

class AmpSessionHandler extends SessionHandler
{

    private static final String AMP_RULEEVENTS_SORT_ORDER = String.format("CAST(%s as TEXT)", new Object[] {
        "rule_id_ref"
    });
    private static final String AMP_RULES_SORT_ORDER = String.format("CAST(%s AS TEXT)", new Object[] {
        "_id"
    });
    private static final String JOINER_ARG_AMP_RULES_COLUMNS[] = {
        "_id"
    };
    private static final String PROJECTION_AMP_RULEEVENTS[] = {
        "rule_id_ref"
    };
    private static final String SELECTION_AMP_RULEEVENTS = String.format("%s = ?", new Object[] {
        "event_name"
    });
    private static final String SELECTION_AMP_RULES = String.format("%s > ?", new Object[] {
        "expiration"
    });
    private FragmentManager mFragmentManager;

    public AmpSessionHandler(Context context, String s, Looper looper)
    {
        super(context, s, looper);
        sUploadHandlerThread.setName(com/localytics/android/AmpUploadHandler.getSimpleName());
    }

    private boolean decompressZipFile(String s, String s1, String s2)
    {
        Object obj;
        String s3;
        obj = null;
        s3 = null;
        s = new ZipInputStream(new FileInputStream((new StringBuilder()).append(s).append(File.separator).append(s2).toString()));
        s2 = new byte[8192];
_L5:
        obj = s.getNextEntry();
        if (obj == null) goto _L2; else goto _L1
_L1:
        s3 = (new StringBuilder()).append(s1).append(File.separator).append(((ZipEntry) (obj)).getName()).toString();
        if (!((ZipEntry) (obj)).isDirectory()) goto _L4; else goto _L3
_L3:
        if (!(new File(s3)).mkdir() && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("Could not create directory %s", new Object[] {
                s3
            }));
        }
          goto _L5
        s1;
_L10:
        obj = s;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj = s;
        Log.w("Localytics", "Caught IOException", s1);
        int i;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught IOException", s);
                }
                return false;
            }
        }
        return false;
_L4:
        obj = new FileOutputStream(s3);
_L8:
        i = s.read(s2, 0, s2.length);
        if (i <= 0) goto _L7; else goto _L6
_L6:
        ((FileOutputStream) (obj)).write(s2, 0, i);
          goto _L8
        s1;
_L9:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught IOException", s);
                }
                return false;
            }
        }
        throw s1;
_L7:
        ((FileOutputStream) (obj)).close();
        s.closeEntry();
          goto _L5
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught IOException", s);
                }
                return false;
            }
        }
        return true;
        s1;
        s = ((String) (obj));
          goto _L9
        s1;
        s = s3;
          goto _L10
    }

    private boolean doesCreativeExist(int i, boolean flag)
    {
        File file;
        if (flag)
        {
            file = new File((new StringBuilder()).append(getZipFileDirPath()).append(File.separator).append(String.format("amp_rule_%d.zip", new Object[] {
                Integer.valueOf(i)
            })).toString());
        } else
        {
            file = new File((new StringBuilder()).append(getUnzipFileDirPath(i)).append(File.separator).append("index.html").toString());
        }
        return file.exists();
    }

    private final Vector getAmpConditionValues(int i)
    {
        Object obj1 = null;
        Object obj = mProvider.query("amp_condition_values", null, String.format("%s = ?", new Object[] {
            "condition_id_ref"
        }), new String[] {
            Integer.toString(i)
        }, null);
        obj1 = null;
_L3:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("value"));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        Object obj2 = new Vector();
_L6:
        obj1 = obj;
        ((Vector) (obj2)).add(s);
        obj1 = obj2;
          goto _L3
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((Vector) (obj1));
        obj2;
        obj = obj1;
        obj1 = obj2;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
        obj2 = obj1;
          goto _L6
    }

    private Vector getAmpConditions(int i)
    {
        Object obj1 = null;
        Object obj = mProvider.query("amp_conditions", null, String.format("%s = ?", new Object[] {
            "rule_id_ref"
        }), new String[] {
            Integer.toString(i)
        }, null);
        obj1 = null;
_L3:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj3;
        String s;
        Vector vector;
        i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("_id"));
        obj3 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("attribute_name"));
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("operator"));
        vector = getAmpConditionValues(i);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        Object obj2 = new Vector();
_L6:
        obj1 = obj;
        obj3 = new AmpCondition(((String) (obj3)), s, vector);
        obj1 = obj;
        ((AmpCondition) (obj3)).setPackageName(mContext.getPackageName());
        obj1 = obj;
        ((Vector) (obj2)).add(obj3);
        obj1 = obj2;
          goto _L3
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((Vector) (obj1));
        obj2;
        obj = obj1;
        obj1 = obj2;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
        obj2 = obj1;
          goto _L6
    }

    private Vector getAmpMessageMaps(String s)
    {
        String s1;
        Cursor cursor;
        HashMap hashmap;
        Cursor cursor1;
        Vector vector;
        vector = new Vector();
        cursor1 = null;
        hashmap = null;
        s1 = hashmap;
        cursor = cursor1;
        Object obj = Long.toString(System.currentTimeMillis() / 1000L);
        s1 = hashmap;
        cursor = cursor1;
        Object obj1 = mProvider;
        s1 = hashmap;
        cursor = cursor1;
        String s2 = SELECTION_AMP_RULES;
        s1 = hashmap;
        cursor = cursor1;
        String s3 = AMP_RULES_SORT_ORDER;
        s1 = hashmap;
        cursor = cursor1;
        cursor1 = ((LocalyticsProvider) (obj1)).query("amp_rules", null, s2, new String[] {
            obj
        }, s3);
        s1 = hashmap;
        cursor = cursor1;
        obj = mProvider;
        s1 = hashmap;
        cursor = cursor1;
        obj1 = SELECTION_AMP_RULEEVENTS;
        s1 = hashmap;
        cursor = cursor1;
        s2 = AMP_RULEEVENTS_SORT_ORDER;
        s1 = hashmap;
        cursor = cursor1;
        s = ((LocalyticsProvider) (obj)).query("amp_ruleevent", null, ((String) (obj1)), new String[] {
            s
        }, s2);
        int i = 0;
_L3:
        s1 = s;
        cursor = cursor1;
        if (i >= s.getCount()) goto _L2; else goto _L1
_L1:
        s1 = s;
        cursor = cursor1;
        s.moveToPosition(i);
        s1 = s;
        cursor = cursor1;
        int k = s.getInt(s.getColumnIndexOrThrow("rule_id_ref"));
        int j = 0;
_L4:
        s1 = s;
        cursor = cursor1;
        if (j >= cursor1.getCount())
        {
            break MISSING_BLOCK_LABEL_927;
        }
        s1 = s;
        cursor = cursor1;
        cursor1.moveToPosition(j);
        s1 = s;
        cursor = cursor1;
        if (cursor1.getInt(cursor1.getColumnIndexOrThrow("_id")) != k)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        s1 = s;
        cursor = cursor1;
        hashmap = new HashMap();
        s1 = s;
        cursor = cursor1;
        hashmap.put("_id", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("_id"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("campaign_id", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("campaign_id"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("expiration", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("expiration"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("display_seconds", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("display_seconds"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("display_session", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("display_session"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("version", cursor1.getString(cursor1.getColumnIndexOrThrow("version")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("phone_location", cursor1.getString(cursor1.getColumnIndexOrThrow("phone_location")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("phone_size_width", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("phone_size_width"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("phone_size_height", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("phone_size_height"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("tablet_location", cursor1.getString(cursor1.getColumnIndexOrThrow("tablet_location")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("tablet_size_width", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("tablet_size_width"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("tablet_size_height", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("tablet_size_height"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("time_to_display", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("time_to_display"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("internet_required", Integer.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("internet_required"))));
        s1 = s;
        cursor = cursor1;
        hashmap.put("ab_test", cursor1.getString(cursor1.getColumnIndexOrThrow("ab_test")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("rule_name", cursor1.getString(cursor1.getColumnIndexOrThrow("rule_name")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("location", cursor1.getString(cursor1.getColumnIndexOrThrow("location")));
        s1 = s;
        cursor = cursor1;
        hashmap.put("devices", cursor1.getString(cursor1.getColumnIndexOrThrow("devices")));
        s1 = s;
        cursor = cursor1;
        vector.add(hashmap);
        break MISSING_BLOCK_LABEL_997;
        s1 = s;
        cursor = cursor1;
        cursor1.moveToFirst();
        i++;
          goto _L3
_L2:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (s != null)
        {
            s.close();
        }
        return vector;
        s;
        if (cursor != null)
        {
            cursor.close();
        }
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        j++;
          goto _L4
    }

    private String getRemoteFileURL(Map map)
    {
        String s = (String)map.get("devices");
        if (s.compareTo("tablet") == 0)
        {
            return (String)map.get("tablet_location");
        }
        if (s.compareTo("both") == 0)
        {
            return (String)map.get("phone_location");
        } else
        {
            return (String)map.get("phone_location");
        }
    }

    private String getUnzipFileDirPath(int i)
    {
        Object obj;
label0:
        {
            obj = new StringBuilder();
            ((StringBuilder) (obj)).append(mContext.getFilesDir().getAbsolutePath());
            ((StringBuilder) (obj)).append(File.separator);
            ((StringBuilder) (obj)).append(".localytics");
            ((StringBuilder) (obj)).append(File.separator);
            ((StringBuilder) (obj)).append(mApiKey);
            ((StringBuilder) (obj)).append(File.separator);
            ((StringBuilder) (obj)).append(String.format("amp_rule_%d", new Object[] {
                Integer.valueOf(i)
            }));
            String s = ((StringBuilder) (obj)).toString();
            File file = new File(s);
            if (file.exists())
            {
                obj = s;
                if (file.isDirectory())
                {
                    break label0;
                }
            }
            obj = s;
            if (!file.mkdirs())
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", String.format("Could not create the directory %s for saving the decompressed file.", new Object[] {
                        file.getAbsolutePath()
                    }));
                }
                obj = null;
            }
        }
        return ((String) (obj));
    }

    private String getZipFileDirPath()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(mContext.getFilesDir().getAbsolutePath());
        stringbuilder.append(File.separator);
        stringbuilder.append(".localytics");
        stringbuilder.append(File.separator);
        stringbuilder.append(mApiKey);
        return stringbuilder.toString();
    }

    private boolean isAmpMessageSatisfiedConditions(Map map, Map map1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = true;
            int i = ((Integer)map.get("campaign_id")).intValue();
            map = getAmpConditions(AmpHelper.getRuleIdFromCampaignId(mProvider, i));
            flag = flag1;
            if (map == null)
            {
                break label0;
            }
            map = map.iterator();
            do
            {
                flag = flag1;
                if (!map.hasNext())
                {
                    break label0;
                }
            } while (((AmpCondition)map.next()).isSatisfiedByAttributes(map1));
            flag = false;
        }
        return flag;
    }

    private boolean isConnectingToInternet()
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)mContext.getSystemService("connectivity");
        if (connectivitymanager != null)
        {
            NetworkInfo anetworkinfo[] = connectivitymanager.getAllNetworkInfo();
            if (anetworkinfo != null)
            {
                for (int i = 0; i < anetworkinfo.length; i++)
                {
                    if (anetworkinfo[i].getState() == android.net.NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    private Map retrieveDisplayingCandidate(Vector vector, Map map)
    {
label0:
        {
            Object obj = null;
            Iterator iterator = vector.iterator();
            vector = obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Map map1 = (Map)iterator.next();
                boolean flag;
                if (((Integer)map1.get("internet_required")).intValue() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((!flag || isConnectingToInternet()) && (map == null || isAmpMessageSatisfiedConditions(map1, map)))
                {
                    vector = map1;
                }
            } while (true);
            if (vector != null)
            {
                map = vector;
                if (updateDisplayingCandidate(vector))
                {
                    break label0;
                }
            }
            map = null;
        }
        return map;
    }

    private boolean updateDisplayingCandidate(Map map)
    {
        String s = null;
        int i = ((Integer)map.get("_id")).intValue();
        String s2 = getZipFileDirPath();
        String s1 = getUnzipFileDirPath(i);
        boolean flag = getRemoteFileURL(map).endsWith(".zip");
        if (!doesCreativeExist(i, flag))
        {
            String s3 = AmpDownloader.getRemoteFileURL(map);
            String s4 = AmpDownloader.getLocalFileURL(mContext, mApiKey, i, flag);
            if (!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4))
            {
                AmpDownloader.downloadFile(s3, s4, true);
            }
        }
        if (flag)
        {
            if (decompressZipFile(s2, s1, String.format("amp_rule_%d.zip", new Object[] {
    Integer.valueOf(i)
})))
            {
                s = (new StringBuilder()).append("file://").append(s1).append(File.separator).append("index.html").toString();
            }
        } else
        {
            s = (new StringBuilder()).append("file://").append(s1).append(File.separator).append("index.html").toString();
        }
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        s2 = (String)map.get("devices");
        int j;
        if (s2.equals("tablet"))
        {
            j = ((Integer)map.get("tablet_size_width")).intValue();
            i = ((Integer)map.get("tablet_size_height")).intValue();
        } else
        if (s2.equals("both"))
        {
            j = ((Integer)map.get("phone_size_width")).intValue();
            i = ((Integer)map.get("phone_size_height")).intValue();
        } else
        {
            j = ((Integer)map.get("phone_size_width")).intValue();
            i = ((Integer)map.get("phone_size_height")).intValue();
        }
        map.put("html_url", s);
        map.put("base_path", s1);
        map.put("display_width", Float.valueOf(j));
        map.put("display_height", Float.valueOf(i));
        return true;
    }

    void ampTrigger(final String ampMessage, final Map attributes)
    {
        Vector vector1 = getAmpMessageMaps(ampMessage);
        Vector vector = vector1;
        if (vector1.size() == 0)
        {
            vector = vector1;
            if (ampMessage.startsWith(mContext.getPackageName()))
            {
                vector = getAmpMessageMaps(ampMessage.substring(mContext.getPackageName().length() + 1, ampMessage.length()));
            }
        }
        ampMessage = retrieveDisplayingCandidate(vector, attributes);
        if (ampMessage == null)
        {
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final AmpSessionHandler this$0;
                final Map val$ampMessage;
                final Map val$attributes;

                public void run()
                {
                    if (mFragmentManager != null) goto _L2; else goto _L1
_L1:
                    return;
_L2:
                    try
                    {
                        if (mFragmentManager.findFragmentByTag("amp_dialog") == null)
                        {
                            AmpDialogFragment.newInstance().setData(ampMessage).setCallbacks(getDialogCallbacks()).setJavaScriptClient(new JavaScriptClient(getJavaScriptClientCallbacks(attributes))).show(mFragmentManager, "amp_dialog");
                            mFragmentManager.executePendingTransactions();
                            return;
                        }
                    }
                    catch (Exception exception)
                    {
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.e("Localytics", "Localytics library threw an uncaught exception", exception);
                            return;
                        }
                    }
                    if (true) goto _L1; else goto _L3
_L3:
                }

            
            {
                this$0 = AmpSessionHandler.this;
                ampMessage = map;
                attributes = map1;
                super();
            }
            });
            return;
        }
    }

    protected UploadHandler createUploadHandler(Context context, Handler handler, String s, String s1, Looper looper)
    {
        return new AmpUploadHandler(context, this, s, s1, looper);
    }

    public Map getDialogCallbacks()
    {
        TreeMap treemap = new TreeMap();
        treemap.put(Integer.valueOf(1), new AmpCallable() {

            final AmpSessionHandler this$0;

            public Object call(Object aobj[])
            {
                sendMessage(obtainMessage(19, ((Object) (aobj))));
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(2), new AmpCallable() {

            final AmpSessionHandler this$0;

            public Object call(Object aobj[])
            {
                Object obj = (String)aobj[0];
                Object obj1 = (Map)aobj[1];
                aobj = String.format("%s:%s", new Object[] {
                    mContext.getPackageName(), obj
                });
                obj = new TreeMap();
                if (obj1 != null)
                {
                    String s = mContext.getPackageName();
                    java.util.Map.Entry entry;
                    for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((TreeMap) (obj)).put(String.format("%s:%s", new Object[] {
            s, entry.getKey()
        }), entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    }

                }
                sendMessage(obtainMessage(3, ((Object) (new Object[] {
                    aobj, obj, null
                }))));
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        return treemap;
    }

    public Map getJavaScriptClientCallbacks(final Map attributes)
    {
        TreeMap treemap = new TreeMap();
        treemap.put(Integer.valueOf(3), new AmpCallable() {

            final AmpSessionHandler this$0;

            private Map convertDimensionsToAttributes(List list)
            {
                TreeMap treemap1 = new TreeMap();
                if (list != null)
                {
                    int i = 0;
                    list = list.iterator();
                    while (list.hasNext()) 
                    {
                        String s = (String)list.next();
                        if (i == 0)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1, s);
                        } else
                        if (1 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2, s);
                        } else
                        if (2 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3, s);
                        } else
                        if (3 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4, s);
                        } else
                        if (4 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5, s);
                        } else
                        if (5 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6, s);
                        } else
                        if (6 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7, s);
                        } else
                        if (7 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8, s);
                        } else
                        if (8 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9, s);
                        } else
                        if (9 == i)
                        {
                            treemap1.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10, s);
                        }
                        i++;
                    }
                }
                return treemap1;
            }

            Object call(Object aobj[])
            {
                List list;
                String s;
                String s1;
                String s3;
                long l;
label0:
                {
                    s3 = (String)aobj[0];
                    s1 = (String)aobj[1];
                    s = (String)aobj[2];
                    l = ((Long)aobj[3]).longValue();
                    aobj = null;
                    try
                    {
                        if (!TextUtils.isEmpty(s1))
                        {
                            aobj = JsonHelper.toMap(new JSONObject(s1));
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object aobj[])
                    {
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.w("Localytics", "[JavaScriptClient]: Failed to parse the json object in tagEventNative");
                        }
                        return null;
                    }
                    list = null;
                    try
                    {
                        if (!TextUtils.isEmpty(s))
                        {
                            list = JsonHelper.toList(new JSONArray(s));
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object aobj[])
                    {
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.w("Localytics", "[JavaScriptClient]: Failed to parse the json object in tagEventNative");
                        }
                        return null;
                    }
                    if (s3 == null)
                    {
                        throw new IllegalArgumentException("event cannot be null");
                    }
                    if (s3.length() == 0)
                    {
                        throw new IllegalArgumentException("event cannot be empty");
                    }
                    if (s1 == null)
                    {
                        break label0;
                    }
                    if (((Map) (aobj)).isEmpty() && Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", "attributes is empty.  Did the caller make an error?");
                    }
                    if (((Map) (aobj)).size() > 50 && Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", String.format("attributes size is %d, exceeding the maximum size of %d.  Did the caller make an error?", new Object[] {
                            Integer.valueOf(((Map) (aobj)).size()), Integer.valueOf(50)
                        }));
                    }
                    Iterator iterator = ((Map) (aobj)).entrySet().iterator();
                    Object obj1;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        obj1 = (java.util.Map.Entry)iterator.next();
                        String s4 = (String)((java.util.Map.Entry) (obj1)).getKey();
                        obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
                        if (s4 == null)
                        {
                            throw new IllegalArgumentException("attributes cannot contain null keys");
                        }
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException("attributes cannot contain null values");
                        }
                        if (s4.length() == 0)
                        {
                            throw new IllegalArgumentException("attributes cannot contain empty keys");
                        }
                    } while (((String) (obj1)).length() != 0);
                    throw new IllegalArgumentException("attributes cannot contain empty values");
                }
label1:
                {
                    if (list == null)
                    {
                        break label1;
                    }
                    if (list.isEmpty() && Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", "customDimensions is empty.  Did the caller make an error?");
                    }
                    if (list.size() > 10 && Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", String.format("customDimensions size is %d, exceeding the maximum size of %d.  Did the caller make an error?", new Object[] {
                            Integer.valueOf(list.size()), Integer.valueOf(10)
                        }));
                    }
                    Iterator iterator1 = list.iterator();
                    Object obj;
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break label1;
                        }
                        obj = iterator1.next();
                        if (obj == null)
                        {
                            throw new IllegalArgumentException("customDimensions cannot contain null elements");
                        }
                    } while (((String)obj).length() != 0);
                    throw new IllegalArgumentException("customDimensions cannot contain empty elements");
                }
                s3 = String.format("%s:%s", new Object[] {
                    mContext.getPackageName(), s3
                });
                if (aobj == null && list == null)
                {
                    sendMessage(obtainMessage(3, ((Object) (new Object[] {
                        s3, null, Long.valueOf(l)
                    }))));
                } else
                {
                    TreeMap treemap1 = new TreeMap();
                    if (s1 != null)
                    {
                        String s2 = mContext.getPackageName();
                        java.util.Map.Entry entry;
                        for (aobj = ((Map) (aobj)).entrySet().iterator(); ((Iterator) (aobj)).hasNext(); treemap1.put(String.format("%s:%s", new Object[] {
            s2, entry.getKey()
        }), (String)entry.getValue()))
                        {
                            entry = (java.util.Map.Entry)((Iterator) (aobj)).next();
                        }

                    }
                    if (s != null)
                    {
                        treemap1.putAll(convertDimensionsToAttributes(list));
                    }
                    sendMessage(obtainMessage(3, ((Object) (new Object[] {
                        s3, treemap1, Long.valueOf(l)
                    }))));
                }
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(5), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                Object obj;
                obj = null;
                aobj = null;
                Cursor cursor = mProvider.query("identifiers", null, null, null, null);
                aobj = cursor;
                obj = cursor;
                int i = cursor.getCount();
                if (i != 0) goto _L2; else goto _L1
_L1:
                if (cursor != null)
                {
                    cursor.close();
                }
                aobj = null;
_L6:
                return ((Object) (aobj));
_L2:
                aobj = cursor;
                obj = cursor;
                Object obj1 = new JSONObject();
                aobj = cursor;
                obj = cursor;
                i = cursor.getColumnIndexOrThrow("key");
                aobj = cursor;
                obj = cursor;
                int j = cursor.getColumnIndexOrThrow("value");
_L4:
                aobj = cursor;
                obj = cursor;
                if (!cursor.moveToNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                aobj = cursor;
                obj = cursor;
                ((JSONObject) (obj1)).put(cursor.getString(i), cursor.getString(j));
                if (true) goto _L4; else goto _L3
                obj;
                obj = ((Object) (aobj));
                if (!Constants.IS_LOGGABLE)
                {
                    break MISSING_BLOCK_LABEL_154;
                }
                obj = ((Object) (aobj));
                Log.w("Localytics", "[JavaScriptClient]: Failed to get identifiers");
                if (aobj != null)
                {
                    ((Cursor) (aobj)).close();
                }
                return null;
_L3:
                aobj = cursor;
                obj = cursor;
                obj1 = ((JSONObject) (obj1)).toString();
                obj = obj1;
                aobj = ((Object []) (obj));
                if (cursor == null) goto _L6; else goto _L5
_L5:
                cursor.close();
                return obj;
                aobj;
                if (obj != null)
                {
                    ((Cursor) (obj)).close();
                }
                throw aobj;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(6), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                aobj = new JSONObject();
                int i = 0;
                do
                {
                    if (i >= 10)
                    {
                        break;
                    }
                    try
                    {
                        ((JSONObject) (aobj)).put((new StringBuilder()).append("c").append(i).toString(), getCustomDimension(i));
                    }
                    catch (JSONException jsonexception)
                    {
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.w("Localytics", "[JavaScriptClient]: Failed to get custom dimension");
                        }
                    }
                    i++;
                } while (true);
                return ((JSONObject) (aobj)).toString();
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(7), new AmpCallable() {

            final AmpSessionHandler this$0;
            final Map val$attributes;

            Object call(Object aobj[])
            {
                JSONObject jsonobject;
                if (attributes == null)
                {
                    return null;
                }
                if (attributes.size() == 0)
                {
                    return null;
                }
                try
                {
                    aobj = String.format("%s:%s", new Object[] {
                        mContext.getPackageName(), ""
                    });
                    jsonobject = new JSONObject();
                    Iterator iterator = attributes.entrySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        Object obj = (java.util.Map.Entry)iterator.next();
                        if (((String)((java.util.Map.Entry) (obj)).getKey()).startsWith(((String) (aobj))))
                        {
                            String s = (String)((java.util.Map.Entry) (obj)).getKey();
                            obj = (String)((java.util.Map.Entry) (obj)).getValue();
                            jsonobject.put(s.substring(((String) (aobj)).length()), obj);
                        }
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", "[JavaScriptClient]: Failed to get attributes");
                    }
                    return null;
                }
                aobj = jsonobject.toString();
                return ((Object) (aobj));
            }

            
            {
                this$0 = AmpSessionHandler.this;
                attributes = map;
                super();
            }
        });
        treemap.put(Integer.valueOf(8), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                int i = ((Integer)aobj[0]).intValue();
                aobj = (String)aobj[1];
                setCustomDimension(i, ((String) (aobj)));
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        return treemap;
    }

    public void handleMessage(Message message)
    {
        if (!Arrays.asList(new Integer[] {
    Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(19)
}).contains(Integer.valueOf(message.what)))
        {
            super.handleMessage(message);
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Handler received %s", new Object[] {
                message
            }));
        }
        message.what;
        JVM INSTR lookupswitch 4: default 310
    //                   3: 185
    //                   13: 124
    //                   15: 228
    //                   19: 269;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_TRIGGER_AMP");
        }
        message = ((Message) ((Object[])(Object[])message.obj));
        ampTrigger((String)message[0], (Map)message[1]);
        return;
_L2:
        try
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.d("Localytics", "Amp Session Handler received MESSAGE_TAG_EVENT");
            }
            message = ((Message) ((Object[])(Object[])message.obj));
            ampTrigger((String)message[0], (Map)message[1]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e("Localytics", "Localytics library threw an uncaught exception", message);
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Amp Session Handler received MESSAGE_SHOW_AMP_TEST");
        }
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

            final AmpSessionHandler this$0;

            public void run()
            {
                showAmpTest();
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        }, 1000L);
        return;
_L5:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Amp Session Handler received MESSAGE_DELETE_AMP_RESOURCES");
        }
        message = (Map)((Object[])(Object[])message.obj)[0];
        AmpHelper.destroyLocalAmp(mProvider, message, true);
        return;
    }

    public void setFragmentManager(FragmentManager fragmentmanager)
    {
        mFragmentManager = fragmentmanager;
    }

    void showAmpTest()
    {
        while (mFragmentManager == null || mFragmentManager.findFragmentByTag("amp_test_mode_button") != null || mFragmentManager.findFragmentByTag("amp_test_mode_list") != null) 
        {
            return;
        }
        final TestModeButton button = TestModeButton.newInstance();
        final TestModeListView listView = TestModeListView.newInstance();
        final AmpRulesAdapter adapter = new AmpRulesAdapter(mContext);
        listView.setAdapter(adapter);
        TreeMap treemap = new TreeMap();
        treemap.put(Integer.valueOf(9), new AmpCallable() {

            final AmpSessionHandler this$0;
            final AmpRulesAdapter val$adapter;
            final TestModeListView val$listView;

            Object call(Object aobj[])
            {
                adapter.updateDataSet(mProvider);
                listView.show(mFragmentManager, "amp_test_mode_list");
                mFragmentManager.executePendingTransactions();
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                adapter = amprulesadapter;
                listView = testmodelistview;
                super();
            }
        });
        button.setCallbacks(treemap);
        button.show(mFragmentManager, "amp_test_mode_button");
        mFragmentManager.executePendingTransactions();
        treemap = new TreeMap();
        treemap.put(Integer.valueOf(10), new AmpCallable() {

            final AmpSessionHandler this$0;
            final TestModeButton val$button;

            Object call(Object aobj[])
            {
                button.show(mFragmentManager, "amp_test_mode_button");
                mFragmentManager.executePendingTransactions();
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                button = testmodebutton;
                super();
            }
        });
        treemap.put(Integer.valueOf(12), new AmpCallable() {

            final AmpSessionHandler this$0;
            final AmpRulesAdapter val$adapter;

            Object call(Object aobj[])
            {
                sendMessage(obtainMessage(3, ((Object) (new Object[] {
                    String.format("%s:%s", new Object[] {
                        mContext.getPackageName(), "Test Mode Update Data"
                    }), null, null
                }))));
                sendMessage(obtainMessage(4, new Runnable() {

                    final _cls5 this$1;

                    public void run()
                    {
                        (new Handler(Looper.getMainLooper())).post(new Runnable() {

                            final _cls1 this$2;

                            public void run()
                            {
                                adapter.updateDataSet(mProvider);
                                adapter.notifyDataSetChanged();
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }));
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                adapter = amprulesadapter;
                super();
            }
        });
        treemap.put(Integer.valueOf(13), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                String s;
                s = null;
                aobj = null;
                Cursor cursor = mProvider.query("info", null, null, null, null);
                aobj = cursor;
                if (!cursor.moveToFirst())
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                aobj = cursor;
                s = cursor.getString(cursor.getColumnIndexOrThrow("registration_id"));
                if (cursor != null)
                {
                    cursor.close();
                }
                Exception exception;
                if (!TextUtils.isEmpty(s))
                {
                    aobj = mContext;
                    Context context = mContext;
                    ((ClipboardManager)((Context) (aobj)).getSystemService("clipboard")).setText(s);
                    Toast.makeText(mContext, (new StringBuilder()).append(s).append(" has been copied to the clipboard.").toString(), 1).show();
                    return null;
                } else
                {
                    Toast.makeText(mContext, "No push token found. Please check your integration.", 1).show();
                    return null;
                }
                exception;
                if (aobj != null)
                {
                    ((Cursor) (aobj)).close();
                }
                throw exception;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(14), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                aobj = SessionHandler.getInstallationId(mProvider, mApiKey);
                if (!TextUtils.isEmpty(((CharSequence) (aobj))))
                {
                    Context context = mContext;
                    Context context1 = mContext;
                    ((ClipboardManager)context.getSystemService("clipboard")).setText(((CharSequence) (aobj)));
                    Toast.makeText(mContext, (new StringBuilder()).append(((String) (aobj))).append(" has been copied to the clipboard.").toString(), 1).show();
                } else
                {
                    Toast.makeText(mContext, "No install id found. Please check your integration.", 1).show();
                }
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        treemap.put(Integer.valueOf(11), new AmpCallable() {

            final AmpSessionHandler this$0;

            Object call(Object aobj[])
            {
                aobj = (Map)aobj[0];
                (((_cls1) (aobj)). new AsyncTask() {

                    final _cls8 this$1;
                    final Map val$ampMessage;

                    protected volatile Object doInBackground(Object aobj[])
                    {
                        return doInBackground((Map[])aobj);
                    }

                    protected transient Map doInBackground(Map amap[])
                    {
                        if (updateDisplayingCandidate(amap[0]))
                        {
                            return amap[0];
                        } else
                        {
                            return null;
                        }
                    }

                    protected volatile void onPostExecute(Object obj)
                    {
                        onPostExecute((Map)obj);
                    }

                    protected void onPostExecute(Map map)
                    {
                        if (map == null)
                        {
                            AmpDialogFragment ampdialogfragment;
                            try
                            {
                                Toast.makeText(mContext, "The downloaded campaign file is broken.", 0).show();
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (Map map) { }
                            break MISSING_BLOCK_LABEL_182;
                        }
                        if (mFragmentManager != null && mFragmentManager.findFragmentByTag((new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString()) == null)
                        {
                            ampdialogfragment = AmpDialogFragment.newInstance();
                            ampdialogfragment.setRetainInstance(false);
                            ampdialogfragment.setData(map).setCallbacks(getDialogCallbacks()).setJavaScriptClient(new JavaScriptClient(getJavaScriptClientCallbacks(null))).show(mFragmentManager, (new StringBuilder()).append("amp_dialog").append(map.get("campaign_id")).toString());
                            mFragmentManager.executePendingTransactions();
                            return;
                        }
                        break MISSING_BLOCK_LABEL_197;
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.e("Localytics", "Localytics library threw an uncaught exception", map);
                        }
                    }

                    protected void onPreExecute()
                    {
                        int i = ((Integer)ampMessage.get("_id")).intValue();
                        boolean flag = getRemoteFileURL(ampMessage).endsWith(".zip");
                        if (!doesCreativeExist(i, flag))
                        {
                            Toast.makeText(mContext, "Downloading the campaign...\nIt'll be shown in few seconds.", 0).show();
                        }
                    }

            
            {
                this$1 = final__pcls8;
                ampMessage = Map.this;
                super();
            }
                }).execute(new Map[] {
                    aobj
                });
                return null;
            }

            
            {
                this$0 = AmpSessionHandler.this;
                super();
            }
        });
        listView.setCallbacks(treemap);
    }





}
