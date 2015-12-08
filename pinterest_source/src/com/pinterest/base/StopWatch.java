// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.os.SystemClock;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.configuration.SharedBuildConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.pinterest.base:
//            StopWatchV4

public class StopWatch
{

    public static final String BUY_IT_CLICK = "buy_it_clicked";
    public static final String CATEGORY_TTRFP = "category_ttrfp";
    public static final String CLICKTHROUGH_VERIFY = "clickthrough_verify";
    private static final String DEFAULT_STOPWATCH = "__DEFAULT_STOPWATCH__";
    public static final String HF_BUILDER_TTRFP = "hf_builder_ttrfp";
    public static final String INSTALL_REFERRER_DELAY = "INSTALL_REFERRER_DELAY";
    public static final String INTEREST_TTRFP = "interest_ttrfp";
    public static final String LOGIN_EMAIL = "login_email";
    private static final int MAX_SIZE_OF_AUX_ARRAY = 20;
    public static final String MODEL_CACHE_CLEANUP = "model_cache_cleanup";
    private static final String PAUSED_TIME = "paused_time";
    private static final String PAUSED_TS = "paused_time_stamp";
    private static final String PAUSED_TS_CURRENT = "paused_ts_current";
    public static final String PIN_CLOSEUP = "pin_closeup";
    public static final String REPIN_DIALOG = "repin_dialog";
    public static final String REPIN_SUBMIT = "repin_submit";
    private static final String RESUMED_TS = "resumed_time_stamp";
    public static final String SEARCH_TTRFP = "search_ttrfp";
    public static final String SIGNUP_EMAIL = "signup_email";
    private static final String SUB_WATCH_STARTED = "_start";
    private static final String TAG = "StopWatch";
    public static final String TTLNHF = "ttlnhf";
    public static final String TTLNHF_STREAMING_APPLIED = "ttlnhf_streaming_applied";
    public static final String TTRFP = "ttrfp";
    public static final String TTRFP_LOG = "ttrfp_tmp_log";
    public static final String TTRFP_LOG_DU_10_PActivity_Init = "du_10_pinterest_activity_init";
    public static final String TTRFP_LOG_DU_20_MActivity_Init = "du_20_main_activity_init";
    public static final String TTRFP_LOG_DU_40_HF_OBJ_CREATION = "du_40_hf_obj_creation";
    public static final String TTRFP_LOG_DU_40_READ_DISK = "du_40_read_disk";
    public static final String TTRFP_LOG_DU_42_LOAD_HF_NET = "du_42_load_hf_from_net";
    public static final String TTRFP_LOG_DU_80_1ST_IMG_LOADED = "du_80_1st_img_loaded";
    public static final JsonPrimitive TTRFP_LOG_FAILURE = new JsonPrimitive("failure");
    public static final String TTRFP_LOG_STS_41_HF_READ_DISK_POST = "sts_41_hf_read_disk_post";
    public static final String TTRFP_LOG_STS_50_SET_DATA_SOURCE = "sts_50_set_data_source";
    public static final String TTRFP_LOG_STS_80_1ST_LOADED_IMG_FROM = "sts_80_1st_loaded_img_from";
    public static final String TTRFP_LOG_STS_80_1ST_LOADED_IMG_URL = "sts_80_1st_loaded_img_url";
    public static final String TTRFP_LOG_STS_80_TO_LOAD_IMG_URL = "sts_80_to_load_img_url";
    public static final String TTRFP_LOG_STS_HF_FSIZE_POST_WRITE = "sts_hf_fsize_post_write";
    public static final String TTRFP_LOG_STS_HF_FSIZE_PRE_READ = "sts_hf_fsize_pre_read";
    public static final String TTRFP_LOG_STS_PACTIVITY_COUNT = "sts_pinterest_activity_count";
    public static final JsonPrimitive TTRFP_LOG_SUCCESS = new JsonPrimitive("success");
    public static final String TTRFP_LOG_TS_10_PACTIVITY_INIT = "ts_10_pinterest_activity_init";
    public static final String TTRFP_LOG_TS_20_MACTIVITY_INIT = "ts_20_main_activity_init";
    public static final String TTRFP_LOG_TS_30_HF_ON_VIEW_CREATED = "ts_30_hf_on_view_created";
    public static final String TTRFP_LOG_TS_40_HF_READ_DISK_POST = "ts_40_hf_read_disk_post";
    public static final String TTRFP_LOG_TS_41_HF_CREATED_DISK = "ts_41_hf_created_disk";
    public static final String TTRFP_LOG_TS_42_HF_CREATED_NET = "ts_42_hf_created_net";
    public static final String TTRFP_LOG_TS_50_SET_DATA_SOURCE = "ts_50_set_data_source";
    public static final String TTRFP_LOG_TS_60_HF_ON_SUCCESS_DONE = "ts_60_hf_on_success_done";
    public static final String TTRFP_LOG_TS_70_TO_LOAD_CELL = "ts_70_to_load_pin_cell";
    public static final String TTRFP_LOG_TS_80_TO_LOAD_PIN_IMG = "ts_80_to_load_pin_img";
    public static final String TTRFP_LOG_TS_x_HF_REFRESH = "ts_x_hf_refresh";
    public static final String WEBVIEW_PAGELOAD = "webview_pageload";
    public static final String WP_0P_LOADED = "0p_loaded";
    public static final String WP_100P_LOADED = "100p_loaded";
    public static final String WP_25P_LOADED = "25p_loaded";
    public static final String WP_50P_LOADED = "50p_loaded";
    public static final String WP_75P_LOADED = "75p_loaded";
    public static final String WP_CLICK_THROUGH_UUID = "clickthrough_uuid";
    public static final String WP_PIN_UID = "pin_uid";
    public static final String WP_PIN_URL = "url";
    private static final HashMap _stopWatches = new HashMap();
    final HashMap _auxDatas = new HashMap();
    private final HashMap _markers = new HashMap();

    public StopWatch()
    {
    }

    public static StopWatch get()
    {
        return get("__DEFAULT_STOPWATCH__");
    }

    public static StopWatch get(String s)
    {
        StopWatch stopwatch = (StopWatch)_stopWatches.get(s);
        Object obj = stopwatch;
        if (stopwatch == null)
        {
            obj = new StopWatchV4();
            _stopWatches.put(s, obj);
        }
        return ((StopWatch) (obj));
    }

    static transient void log(String s, Object aobj[])
    {
        if (SharedBuildConfig.isNonProduction())
        {
            Log.d("StopWatch", String.format(s, aobj));
        }
    }

    public StopWatch complete(String s)
    {
        return complete(s, false, null);
    }

    public StopWatch complete(String s, boolean flag, String s1)
    {
        JsonObject jsonobject = (JsonObject)_auxDatas.get(s);
        long l = stop(s);
        if (l != -1L)
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = s1;
                if (jsonobject != null)
                {
                    s2 = jsonobject.toString();
                }
            }
            log("%s - cached %s - auxData %s", new Object[] {
                s, String.valueOf(flag), String.valueOf(s2)
            });
            AnalyticsApi.a(s, l, flag, s2);
        }
        return this;
    }

    public JsonElement getAuxData(String s, String s1)
    {
        if (isActive(s) && _auxDatas.containsKey(s))
        {
            return ((JsonObject)_auxDatas.get(s)).get(s1);
        } else
        {
            return null;
        }
    }

    public long getStartTime(String s)
    {
        if (_markers.containsKey(s))
        {
            return ((Long)_markers.get(s)).longValue();
        } else
        {
            return 0L;
        }
    }

    public StopWatch invalidate(String s)
    {
        _markers.remove(s);
        _auxDatas.remove(s);
        return this;
    }

    public StopWatch invalidateAll()
    {
        for (Iterator iterator = (new HashSet(_markers.keySet())).iterator(); iterator.hasNext(); invalidate((String)iterator.next())) { }
        return this;
    }

    public boolean isActive(String s)
    {
        return _markers.containsKey(s);
    }

    public StopWatch logTimeStamp(String s, String s1)
    {
        return logTimeStamp(s, s1, false);
    }

    public StopWatch logTimeStamp(String s, String s1, boolean flag)
    {
        if (isActive(s))
        {
            long l = getStartTime(s);
            if (l != 0L)
            {
                putAuxData(s, s1, new JsonPrimitive(new Long(SystemClock.elapsedRealtime() - l)), flag);
            }
        }
        return this;
    }

    public StopWatch pause(String s)
    {
        Long long1 = Long.valueOf((new Long(SystemClock.elapsedRealtime())).longValue() - getStartTime(s));
        putAuxData(s, "paused_time_stamp", new JsonPrimitive(long1), true);
        return putAuxData(s, "paused_ts_current", new JsonPrimitive(long1));
    }

    public StopWatch putAuxData(String s, String s1, JsonElement jsonelement)
    {
        return putAuxData(s, s1, jsonelement, false);
    }

    public StopWatch putAuxData(String s, String s1, JsonElement jsonelement, boolean flag)
    {
label0:
        {
            if (isActive(s))
            {
                if (!_auxDatas.containsKey(s))
                {
                    JsonObject jsonobject = new JsonObject();
                    _auxDatas.put(s, jsonobject);
                    s = jsonobject;
                } else
                {
                    s = (JsonObject)_auxDatas.get(s);
                }
                if (!s.has(s1))
                {
                    break label0;
                }
                if (flag)
                {
                    JsonArray jsonarray;
                    if (s.get(s1).isJsonArray())
                    {
                        jsonarray = s.get(s1).getAsJsonArray();
                    } else
                    {
                        jsonarray = new JsonArray();
                        jsonarray.add(s.get(s1));
                    }
                    if (jsonarray.size() < 20)
                    {
                        jsonarray.add(jsonelement);
                        s.add(s1, jsonarray);
                    }
                }
            }
            return this;
        }
        if (flag)
        {
            JsonArray jsonarray1 = new JsonArray();
            jsonarray1.add(jsonelement);
            s.add(s1, jsonarray1);
            return this;
        } else
        {
            s.add(s1, jsonelement);
            return this;
        }
    }

    public StopWatch resume(String s)
    {
        if (isActive(s))
        {
            Long long1 = Long.valueOf((new Long(SystemClock.elapsedRealtime())).longValue() - getStartTime(s));
            putAuxData(s, "resumed_time_stamp", new JsonPrimitive(long1), true);
            if (_auxDatas.containsKey(s))
            {
                s = (JsonObject)_auxDatas.get(s);
                if (s.has("paused_ts_current"))
                {
                    long l1 = s.get("paused_ts_current").getAsLong();
                    s.remove("paused_ts_current");
                    long l = 0L;
                    if (s.has("paused_time"))
                    {
                        l = s.get("paused_time").getAsLong();
                    }
                    s.add("paused_time", new JsonPrimitive(new Long(l + (long1.longValue() - l1))));
                }
            }
        }
        return this;
    }

    public StopWatch start(String s)
    {
        _markers.put(s, Long.valueOf(SystemClock.elapsedRealtime()));
        return this;
    }

    public StopWatch startSubWatch(String s, String s1)
    {
        StopWatch stopwatch;
label0:
        {
            stopwatch = this;
            if (!isActive(s))
            {
                break label0;
            }
            if (_auxDatas.containsKey(s))
            {
                stopwatch = this;
                if (!_auxDatas.containsKey(s))
                {
                    break label0;
                }
                stopwatch = this;
                if (((JsonObject)_auxDatas.get(s)).has(s1))
                {
                    break label0;
                }
            }
            long l = SystemClock.elapsedRealtime();
            long l1 = getStartTime(s);
            stopwatch = putAuxData(s, (new StringBuilder()).append(s1).append("_start").toString(), new JsonPrimitive(new Long(l - l1)), true);
        }
        return stopwatch;
    }

    public long stop(String s)
    {
        long l = SystemClock.elapsedRealtime();
        Long long1 = (Long)_markers.remove(s);
        _auxDatas.remove(s);
        if (long1 == null || long1.longValue() == -1L)
        {
            return -1L;
        } else
        {
            return l - long1.longValue();
        }
    }

    public StopWatch stopSubWatch(String s, String s1)
    {
        if (isActive(s) && _auxDatas.containsKey(s))
        {
            JsonObject jsonobject = (JsonObject)_auxDatas.get(s);
            String s2 = (new StringBuilder()).append(s1).append("_start").toString();
            if (jsonobject.has(s2))
            {
                JsonPrimitive jsonprimitive;
                long l;
                if (jsonobject.get(s2).isJsonArray())
                {
                    jsonprimitive = (JsonPrimitive)((JsonArray)jsonobject.get(s2)).get(0);
                } else
                {
                    jsonprimitive = jsonobject.getAsJsonPrimitive(s2);
                }
                l = jsonprimitive.getAsLong();
                jsonobject.add(s1, new JsonPrimitive(new Long(SystemClock.elapsedRealtime() - getStartTime(s) - l)));
                jsonobject.remove(s2);
            }
        }
        return this;
    }

}
