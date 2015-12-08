// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            SessionHandler, DatapointHelper, Constants, ReflectionUtils

public class LocalyticsSession
{
    static final class ProfileDbAction extends Enum
    {

        private static final ProfileDbAction $VALUES[];
        public static final ProfileDbAction SET_ATTRIBUTE;

        public static ProfileDbAction valueOf(String s)
        {
            return (ProfileDbAction)Enum.valueOf(com/localytics/android/LocalyticsSession$ProfileDbAction, s);
        }

        public static ProfileDbAction[] values()
        {
            return (ProfileDbAction[])$VALUES.clone();
        }

        static 
        {
            SET_ATTRIBUTE = new ProfileDbAction("SET_ATTRIBUTE", 0);
            $VALUES = (new ProfileDbAction[] {
                SET_ATTRIBUTE
            });
        }

        private ProfileDbAction(String s, int i)
        {
            super(s, i);
        }
    }


    static final String CAMPAIGN_ID_ATTRIBUTE = "Campaign ID";
    static final String CREATIVE_ID_ATTRIBUTE = "Creative ID";
    static final String PUSH_OPENED_EVENT = "Localytics Push Opened";
    private static final Map sLocalyticsSessionHandlerMap = new HashMap();
    private static final Object sLocalyticsSessionIntrinsicLock[] = new Object[0];
    protected static final HandlerThread sSessionHandlerThread = getHandlerThread(com/localytics/android/SessionHandler.getSimpleName());
    protected final Context mContext;
    private final SessionHandler mSessionHandler;

    public LocalyticsSession(Context context)
    {
        this(context, null);
    }

    public LocalyticsSession(Context context, String s)
    {
        this(context, s, null);
    }

    LocalyticsSession(Context context, String s, String s1)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        }
        Object obj = s;
        s = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s = DatapointHelper.getLocalyticsAppKeyOrNull(context);
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("key cannot be null or empty");
        }
        if ("com.localytics.android".equals(context.getPackageName()) && !context.getClass().getName().equals("android.test.IsolatedContext") && !context.getClass().getName().equals("android.test.RenamingDelegatingContext"))
        {
            throw new IllegalArgumentException(String.format("context.getPackageName() returned %s", new Object[] {
                context.getPackageName()
            }));
        }
        obj = context;
        if (!context.getClass().getName().equals("android.test.RenamingDelegatingContext"))
        {
            obj = context;
            if (Constants.CURRENT_API_LEVEL >= 8)
            {
                obj = context.getApplicationContext();
            }
        }
        mContext = ((Context) (obj));
        Object aobj[] = sLocalyticsSessionIntrinsicLock;
        aobj;
        JVM INSTR monitorenter ;
        SessionHandler sessionhandler = (SessionHandler)sLocalyticsSessionHandlerMap.get(s);
        context = sessionhandler;
        if (sessionhandler != null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        context = createSessionHandler(mContext, s, sSessionHandlerThread.getLooper());
        sLocalyticsSessionHandlerMap.put(s, context);
        context.sendMessage(context.obtainMessage(0, s1));
        mSessionHandler = context;
        aobj;
        JVM INSTR monitorexit ;
        return;
        context;
        aobj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static Map convertDimensionsToAttributes(List list)
    {
        TreeMap treemap = new TreeMap();
        if (list != null)
        {
            int i = 0;
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s = (String)list.next();
                if (i == 0)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1, s);
                } else
                if (1 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2, s);
                } else
                if (2 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3, s);
                } else
                if (3 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4, s);
                } else
                if (4 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5, s);
                } else
                if (5 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6, s);
                } else
                if (6 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7, s);
                } else
                if (7 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8, s);
                } else
                if (8 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9, s);
                } else
                if (9 == i)
                {
                    treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10, s);
                }
                i++;
            }
        }
        return treemap;
    }

    public static String createRangedAttribute(int i, int j, int k, int l)
    {
        if (l < 1)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "Step must not be less than zero.  Returning null.");
            }
        } else
        if (j >= k)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "maxValue must not be less than minValue.  Returning null.");
                return null;
            }
        } else
        {
            int i1 = ((k - j) + l) / l;
            int ai[] = new int[i1 + 1];
            for (k = 0; k <= i1; k++)
            {
                ai[k] = k * l + j;
            }

            return createRangedAttribute(i, ai);
        }
        return null;
    }

    public static String createRangedAttribute(int i, int ai[])
    {
        if (ai == null)
        {
            throw new IllegalArgumentException("steps cannot be null");
        }
        if (ai.length == 0)
        {
            throw new IllegalArgumentException("steps length must be greater than 0");
        }
        if (i < ai[0])
        {
            return (new StringBuilder()).append("less than ").append(ai[0]).toString();
        }
        if (i >= ai[ai.length - 1])
        {
            return (new StringBuilder()).append(ai[ai.length - 1]).append(" and above").toString();
        }
        int j = Arrays.binarySearch(ai, i);
        i = j;
        if (j < 0)
        {
            i = -j - 2;
        }
        if (ai[i] == ai[i + 1] - 1)
        {
            return Integer.toString(ai[i]);
        } else
        {
            return (new StringBuilder()).append(ai[i]).append("-").append(ai[i + 1] - 1).toString();
        }
    }

    public static String getAnalyticsURL()
    {
        return Constants.ANALYTICS_URL;
    }

    private static HandlerThread getHandlerThread(String s)
    {
        s = new HandlerThread(s, 10);
        s.start();
        return s;
    }

    public static String getProfilesURL()
    {
        return Constants.PROFILES_URL;
    }

    public static long getSessionExpiration()
    {
        return Constants.SESSION_EXPIRATION;
    }

    public static boolean isLoggingEnabled()
    {
        return Constants.IS_LOGGABLE;
    }

    public static boolean isUsingHttps()
    {
        return Constants.USE_HTTPS;
    }

    public static void setAnalyticsURL(String s)
    {
        Constants.ANALYTICS_URL = s;
    }

    public static void setHttpsEnabled(boolean flag)
    {
        Constants.USE_HTTPS = flag;
    }

    public static void setLoggingEnabled(boolean flag)
    {
        Constants.IS_LOGGABLE = flag;
    }

    public static void setProfilesURL(String s)
    {
        Constants.PROFILES_URL = s;
    }

    public static void setSessionExpiration(long l)
    {
        Constants.SESSION_EXPIRATION = l;
    }

    public void close()
    {
        close(null);
    }

    public void close(List list)
    {
label0:
        {
            if (list == null)
            {
                break label0;
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
            Iterator iterator = list.iterator();
            String s;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s = (String)iterator.next();
                if (s == null)
                {
                    throw new IllegalArgumentException("customDimensions cannot contain null elements");
                }
            } while (s.length() != 0);
            throw new IllegalArgumentException("customDimensions cannot contain empty elements");
        }
        if (list == null || list.isEmpty())
        {
            mSessionHandler.sendEmptyMessage(2);
            return;
        } else
        {
            mSessionHandler.sendMessage(mSessionHandler.obtainMessage(2, new TreeMap(convertDimensionsToAttributes(list))));
            return;
        }
    }

    protected SessionHandler createSessionHandler(Context context, String s, Looper looper)
    {
        SessionHandler sessionhandler;
        Object obj;
        obj = null;
        sessionhandler = null;
        SessionHandler sessionhandler1 = (SessionHandler)ReflectionUtils.tryInvokeConstructor("com.localytics.android.AmpSessionHandler", new Class[] {
            android/content/Context, java/lang/String, android/os/Looper
        }, new Object[] {
            context, s, looper
        });
        if (sessionhandler1 != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        sessionhandler = sessionhandler1;
        obj = sessionhandler1;
        try
        {
            throw new Exception();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        context = new SessionHandler(context, s, looper);
        return context;
        return sessionhandler1;
_L2:
        return ((SessionHandler) (obj));
        context;
        obj = sessionhandler;
        if (true) goto _L2; else goto _L1
_L1:
    }

    SessionHandler getSessionHandler()
    {
        return mSessionHandler;
    }

    public void handleNotificationReceived(Intent intent)
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(21, intent));
    }

    public void handlePushReceived(Intent intent)
    {
        handlePushReceived(intent, null);
    }

    public void handlePushReceived(Intent intent, List list)
    {
        if (intent != null && intent.getExtras() != null) goto _L2; else goto _L1
_L1:
        String s;
        return;
_L2:
        if ((s = intent.getExtras().getString("ll")) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj;
        obj = new JSONObject(s);
        s = ((JSONObject) (obj)).getString("ca");
        obj = ((JSONObject) (obj)).getString("cr");
        if (s == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("Campaign ID", s);
        hashmap.put("Creative ID", obj);
        tagEvent("Localytics Push Opened", hashmap, list);
        intent.removeExtra("ll");
        return;
        intent;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Failed to get campaign id or creative id from payload");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void handleRegistration(Intent intent)
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(20, intent));
    }

    public void open()
    {
        open(null);
    }

    public void open(List list)
    {
label0:
        {
            if (list == null)
            {
                break label0;
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
            Iterator iterator = list.iterator();
            String s;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s = (String)iterator.next();
                if (s == null)
                {
                    throw new IllegalArgumentException("customDimensions cannot contain null elements");
                }
            } while (s.length() != 0);
            throw new IllegalArgumentException("customDimensions cannot contain empty elements");
        }
        if (list == null || list.isEmpty())
        {
            mSessionHandler.sendEmptyMessage(1);
            return;
        } else
        {
            mSessionHandler.sendMessage(mSessionHandler.obtainMessage(1, new TreeMap(convertDimensionsToAttributes(list))));
            return;
        }
    }

    public void registerPush(String s)
    {
        if (DatapointHelper.getApiLevel() < 8 && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "GCM requires API level 8 or higher");
        }
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(9, new String(s)));
    }

    public void setCustomDimension(int i, String s)
    {
        if (i < 0 || i > 9)
        {
            throw new IllegalArgumentException("Only valid dimensions are 0 - 9");
        }
        SessionHandler sessionhandler = mSessionHandler;
        SessionHandler sessionhandler1 = mSessionHandler;
        if (s == null)
        {
            s = null;
        } else
        {
            s = new String(s);
        }
        sessionhandler.sendMessage(sessionhandler1.obtainMessage(12, ((Object) (new Object[] {
            Integer.valueOf(i), s
        }))));
    }

    public void setCustomerData(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key cannot be null");
        } else
        {
            mSessionHandler.sendMessage(mSessionHandler.obtainMessage(8, ((Object) (new Object[] {
                s, s1
            }))));
            return;
        }
    }

    public void setCustomerEmail(String s)
    {
        setCustomerData("email", s);
    }

    public void setCustomerId(String s)
    {
        setCustomerData("customer_id", s);
    }

    public void setCustomerName(String s)
    {
        setCustomerData("customer_name", s);
    }

    public void setLocation(Location location)
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(11, new Location(location)));
    }

    public void setOptOut(boolean flag)
    {
        SessionHandler sessionhandler = mSessionHandler;
        SessionHandler sessionhandler1 = mSessionHandler;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        sessionhandler.sendMessage(sessionhandler1.obtainMessage(6, i, 0));
    }

    public void setProfileAttribute(String s, Object obj)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1;
        try
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e("Localytics", "attribute name cannot be null");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Caught JSON exception", s);
                return;
            }
        }
          goto _L3
_L2:
        s1 = s.trim();
        if (s1.length() != 0) goto _L5; else goto _L4
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", "attribute name cannot be empty");
            return;
        }
          goto _L3
_L5:
        if (s1.getBytes().length <= 128) goto _L7; else goto _L6
_L6:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", String.format("attribute name cannot be longer than %s characters", new Object[] {
                Integer.valueOf(128)
            }));
            return;
        }
          goto _L3
_L7:
        if (!s1.startsWith("_")) goto _L9; else goto _L8
_L8:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", "attribute name cannot start with \"_\"");
            return;
        }
          goto _L3
_L9:
        if (obj == null) goto _L11; else goto _L10
_L10:
        if ((obj instanceof String) || (obj instanceof String[]) || (obj instanceof Date) || (obj instanceof Date[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof Integer[]) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Long[])) goto _L11; else goto _L12
_L12:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", "Profile property value can only be one of the following data types: String, String[], Date, Date[], int/Integer, int[]/Integer[], long/Long, long[]/Long[], or null");
            return;
        }
          goto _L3
_L11:
        JSONObject jsonobject = new JSONObject();
        if (obj != null) goto _L14; else goto _L13
_L13:
        s = ((String) (JSONObject.NULL));
_L21:
        if (!(s instanceof Object[])) goto _L16; else goto _L15
_L15:
        obj = ((Object) ((Object[])(Object[])s));
        s = new ArrayList();
        int i = 0;
_L36:
        if (i >= obj.length) goto _L18; else goto _L17
_L17:
        SimpleDateFormat simpledateformat;
        simpledateformat = obj[i];
        if (simpledateformat == null)
        {
            break MISSING_BLOCK_LABEL_760;
        }
        if ("".equals(simpledateformat))
        {
            break MISSING_BLOCK_LABEL_760;
        }
        if (!(simpledateformat instanceof String) || ((String)simpledateformat).getBytes().length <= 255) goto _L20; else goto _L19
_L19:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", String.format("attribute set cannot contain values longer than %s characters", new Object[] {
                Integer.valueOf(255)
            }));
            return;
        }
          goto _L3
_L14:
label0:
        {
            if (!(obj instanceof Date))
            {
                break label0;
            }
            s = (new SimpleDateFormat("yyyy-MM-dd")).format(obj);
        }
          goto _L21
        if (!(obj instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_428;
        }
        obj = (int[])(int[])obj;
        s = new Integer[obj.length];
        i = 0;
_L23:
        if (i >= obj.length) goto _L21; else goto _L22
_L22:
        s[i] = Integer.valueOf(obj[i]);
        i++;
          goto _L23
        if (!(obj instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_479;
        }
        obj = (long[])(long[])obj;
        s = new Long[obj.length];
        i = 0;
_L25:
        if (i >= obj.length) goto _L21; else goto _L24
_L24:
        s[i] = Long.valueOf(obj[i]);
        i++;
          goto _L25
        if (!(obj instanceof Date[])) goto _L27; else goto _L26
_L26:
        obj = (Date[])(Date[])obj;
        s = new String[obj.length];
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        i = 0;
_L35:
        if (i >= obj.length) goto _L21; else goto _L28
_L28:
        if (obj[i] == null) goto _L30; else goto _L29
_L29:
        s[i] = simpledateformat.format(obj[i]);
          goto _L30
_L27:
        s = ((String) (obj));
        if (!(obj instanceof String)) goto _L21; else goto _L31
_L31:
        s = ((String) (obj));
        if (((String)obj).getBytes().length <= 255) goto _L21; else goto _L32
_L32:
        if (Constants.IS_LOGGABLE)
        {
            Log.e("Localytics", String.format("attribute value cannot be longer than %s characters", new Object[] {
                Integer.valueOf(255)
            }));
            return;
        }
          goto _L3
_L20:
        s.add(obj[i]);
        break MISSING_BLOCK_LABEL_760;
_L18:
        if (s.size() == 0) goto _L3; else goto _L33
_L33:
        obj = new JSONArray();
        for (s = s.iterator(); s.hasNext(); ((JSONArray) (obj)).put(s.next())) { }
        jsonobject.put(s1, obj);
_L34:
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(16, ((Object) (new Object[] {
            jsonobject, new Integer(ProfileDbAction.SET_ATTRIBUTE.ordinal())
        }))));
        return;
_L16:
        if ("".equals(s.toString().trim()))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.put(s1, s);
        if (true) goto _L34; else goto _L3
_L3:
        return;
_L30:
        i++;
          goto _L35
        i++;
          goto _L36
    }

    public void setPushDisabled(boolean flag)
    {
        SessionHandler sessionhandler = mSessionHandler;
        SessionHandler sessionhandler1 = mSessionHandler;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        sessionhandler.sendMessage(sessionhandler1.obtainMessage(14, i, 0));
    }

    public void setPushRegistrationId(String s)
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(10, s));
    }

    public void tagEvent(String s)
    {
        tagEvent(s, null);
    }

    public void tagEvent(String s, Map map)
    {
        tagEvent(s, map, null);
    }

    public void tagEvent(String s, Map map, List list)
    {
        tagEvent(s, map, list, 0L);
    }

    public void tagEvent(String s, Map map, List list, long l)
    {
label0:
        {
            if (s == null)
            {
                throw new IllegalArgumentException("event cannot be null");
            }
            if (s.length() == 0)
            {
                throw new IllegalArgumentException("event cannot be empty");
            }
            if (map == null)
            {
                break label0;
            }
            if (map.isEmpty() && Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "attributes is empty.  Did the caller make an error?");
            }
            if (map.size() > 50 && Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("attributes size is %d, exceeding the maximum size of %d.  Did the caller make an error?", new Object[] {
                    Integer.valueOf(map.size()), Integer.valueOf(50)
                }));
            }
            Iterator iterator = map.entrySet().iterator();
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)iterator.next();
                String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
                if (s1 == null)
                {
                    throw new IllegalArgumentException("attributes cannot contain null keys");
                }
                if (obj == null)
                {
                    throw new IllegalArgumentException("attributes cannot contain null values");
                }
                if (s1.length() == 0)
                {
                    throw new IllegalArgumentException("attributes cannot contain empty keys");
                }
            } while (((String) (obj)).length() != 0);
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
            String s2;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label1;
                }
                s2 = (String)iterator1.next();
                if (s2 == null)
                {
                    throw new IllegalArgumentException("customDimensions cannot contain null elements");
                }
            } while (s2.length() != 0);
            throw new IllegalArgumentException("customDimensions cannot contain empty elements");
        }
        s = String.format("%s:%s", new Object[] {
            mContext.getPackageName(), s
        });
        if (map == null && list == null)
        {
            mSessionHandler.sendMessage(mSessionHandler.obtainMessage(3, ((Object) (new Object[] {
                s, null, Long.valueOf(l)
            }))));
            return;
        }
        TreeMap treemap = new TreeMap();
        if (map != null)
        {
            String s3 = mContext.getPackageName();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); treemap.put(String.format("%s:%s", new Object[] {
    s3, entry.getKey()
}), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        if (list != null)
        {
            treemap.putAll(convertDimensionsToAttributes(list));
        }
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(3, ((Object) (new Object[] {
            s, new TreeMap(treemap), Long.valueOf(l)
        }))));
    }

    public void tagScreen(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("event cannot be null");
        }
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("event cannot be empty");
        } else
        {
            mSessionHandler.sendMessage(mSessionHandler.obtainMessage(7, s));
            return;
        }
    }

    public void upload()
    {
        uploadAnalytics();
        uploadProfile();
    }

    protected void uploadAnalytics()
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(4, null));
    }

    protected void uploadProfile()
    {
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(17, null));
    }

}
