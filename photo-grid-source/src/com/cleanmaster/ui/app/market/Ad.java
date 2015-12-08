// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.cleanmaster.model.VastModel;
import com.cleanmaster.ui.app.market.data.filter.a;
import com.cleanmaster.ui.app.market.data.filter.b;
import com.cleanmaster.util.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            b, c

public class Ad extends com.cleanmaster.ui.app.market.b
{

    public static final int APP_CAN_UPDATE = 2;
    public static final int APP_INSTALLED = 1;
    public static final int APP_NOT_INSTALLED = 0;
    public static final int APP_TAG_NOT_SHOW = 0;
    public static final int APP_TAG_SHOW_HOT = 2;
    public static final int APP_TAG_SHOW_NEW = 1;
    private static final int BOLD_MASK = 1;
    private static final int COLLECTION_AD_TYPE = 100;
    public static final int COLOR_BLACK = 2;
    public static final int COLOR_BLUE = 4;
    public static final int COLOR_GREY = 1;
    public static final int COLOR_LIGHT_GREY = 3;
    public static final int COLOR_LIGHT_RED = 5;
    private static final int COLOR_MASK = 30;
    private static final int DESC_MASK = 992;
    private static final int DETAIL_MASK = 31744;
    public static final int ICON_LIST_MAX_COUNT = 4;
    public static final int INMOBI_RES_TYPE = 1001;
    public static final int MT_TYPE_OPEN_BROWSER = 256;
    public static final int MT_TYPE_OPEN_DEEPLINK = 512;
    public static final int MT_TYPE_OPEN_DOWNLOAD = 8;
    public static final int MT_TYPE_OPEN_INTERNAL = 64;
    public static final int MT_TYPE_OPEN_WEBVIEW = 128;
    private static final int OPERATION_AD_TYPE = 0;
    public static final int RECOMMEND_SHOW_TYPE_HIGH = 1003;
    public static final int RECOMMEND_SHOW_TYPE_LOW = 1005;
    public static final int RECOMMEND_TYPE_THREE_APPS = 13;
    private static final int SELF_ADV_AD_TYPE = 3;
    private static final String SHOW_TOP_FAKE_PKGNAME = "x_showtop";
    public static final int SHOW_TYPE_BANNER_GALLERY = 1018;
    public static final int SHOW_TYPE_BANNER_ICON_LIST = 1013;
    public static final int SHOW_TYPE_BANNER_SINGLE_APP = 1012;
    public static final int SHOW_TYPE_BANNER_TEXT = 1014;
    public static final int SHOW_TYPE_BAO_CARD = 1002;
    public static final int SHOW_TYPE_BAO_CARD_NEW = 50000;
    public static final int SHOW_TYPE_BIG_ICON = 1004;
    public static final int SHOW_TYPE_BIG_PICKS = 1000;
    public static final int SHOW_TYPE_CONTENT_CHEETAH_JUMPTO = 10000;
    public static final int SHOW_TYPE_EIGHT_ICON = 1015;
    public static final int SHOW_TYPE_FACEBOOK = 1016;
    public static final int SHOW_TYPE_GAMEBOX_3_ICON = 1024;
    public static final int SHOW_TYPE_GAMEBOX_BAO_CARD = 1022;
    public static final int SHOW_TYPE_GAME_BIG_CARD = 1010;
    public static final int SHOW_TYPE_GDT = 1026;
    public static final int SHOW_TYPE_GENERNAL_PICKS = 0;
    public static final int SHOW_TYPE_GP_TOP = 1025;
    public static final int SHOW_TYPE_HAVE_PIC_BIG_CARD = 50000;
    public static final int SHOW_TYPE_HTML5_CARD = 1023;
    public static final int SHOW_TYPE_ICON_LIST = 1006;
    public static final int SHOW_TYPE_NO_PIC_SMALL_CARD = 50001;
    public static final int SHOW_TYPE_RESULTPAGE_BIGCARD = 1016;
    public static final int SHOW_TYPE_SPECIAL_RECOMMEND = 1001;
    public static final int SHOW_TYPE_TEXT = 1009;
    public static final int SHOW_TYPE_TEXT_WITH_ICON = 1011;
    public static final int SHOW_TYPE_THREE_ICON = 1008;
    public static final int SHOW_TYPE_TWO_PIC = 1007;
    public static final int SHOW_TYPE_VAST = 50003;
    public static final int SIMILAR_MAX_COUNT = 3;
    private static final int TITLE_MASK = 31;
    public static final int VERSION = 38;
    com.cleanmaster.data.filter.b _conditionsjson;
    private int app_action_type;
    private int app_show_type;
    private int app_tag;
    private String background;
    private String button_txt;
    private String conditionsjson;
    private String context_code;
    private String des;
    private String desc;
    private String detail_id;
    private String detail_pg;
    private String download_num;
    private String genre;
    private String html;
    public int installedStatus;
    public boolean isNativeAd;
    private boolean isShowGuess;
    private int mAdStatus;
    private String mClickTrackingUrl;
    private long mCreateTime;
    private String mDeepLink;
    private String mEditorExt;
    private String mEditorHeadLogo;
    private String mEditorName;
    private String mEditorRecommend;
    private String mExtension;
    private int mFont;
    private String mImprTrackingUrl;
    private int mLikes;
    private int mLoadClick;
    private String mPosName;
    private String mPosid;
    private int mPriority;
    private ArrayList mSugApps;
    private String mThirdImpUrl;
    private long mTimeStamp;
    private int mt_type;
    private String name_space;
    private String pic_url;
    private String pkg;
    private String pkg_size;
    private String pkg_url;
    private double price;
    private double rating;
    private int res_type;
    private String reviewers;
    private int showRating;
    private int showedPos;
    private int subject;
    private String sug_app;
    private int sug_type;
    private String title;
    private String trigger_src;
    private VastModel vastModel;
    public int versionCode;
    private int x_posision;

    public Ad()
    {
        subject = 0;
        app_show_type = -1;
        app_action_type = -1;
        x_posision = -1;
        mPosName = "";
        mEditorHeadLogo = "";
        mEditorName = "";
        mEditorRecommend = "";
        mEditorExt = "";
        mTimeStamp = 0L;
        mImprTrackingUrl = "";
        mLikes = -1;
        conditionsjson = "";
        isShowGuess = false;
        isNativeAd = false;
        showedPos = 0;
        mAdStatus = 0;
        mFont = 0;
        mLoadClick = 0;
        _conditionsjson = null;
    }

    public static long LONG(Cursor cursor, String s, long l)
    {
        long l1;
        try
        {
            l1 = cursor.getLong(cursor.getColumnIndexOrThrow(s));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            return l;
        }
        return l1;
    }

    public static String STRING(Cursor cursor, String s, String s1)
    {
        try
        {
            cursor = cursor.getString(cursor.getColumnIndexOrThrow(s));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            return null;
        }
        return cursor;
    }

    public static Ad createAd(String s)
    {
        Ad ad = new Ad();
        ad.setDes("");
        ad.setSugType(-1);
        return ad.createAdFromPckName(s);
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(s).append("(_id INTEGER PRIMARY KEY,title TEXT,desc TEXT,pic_url TEXT,pkg TEXT,pkg_url TEXT,des TEXT,app_tag INTEGER,detail_id TEXT,download_num TEXT,rating DOUBLE,show_rating TEXT,price DOUBLE,reviewers TEXT,genre TEXT,pkg_size TEXT,sug_type INTEGER,res_type INTEGER,subject INTEGER,app_action_type INTEGER,app_show_type INTEGER,").append("mt_type INTEGER,background TEXT,context_code TEXT,name_space TEXT,trigger_src TEXT,button_txt TEXT,sug_app TEXT,pos_name TEXT,timestamp INTEGER,editor_head_logo TEXT,editor_name TEXT,editor_ext TEXT,detail_pg TEXT,editor_recommend TEXT,impr_tracking_url TEXT,likes INTEGER,conditionsjson TEXT,is_ad INTEGER,font INTEGER,load_clk INTEGER,html TEXT,extension").append(" TEXT,deeplink TEXT,priority INTEGER,click_tracking_url TEXT,third_imp_url TEXT,create_time INTEGER,posid TEXT);").toString());
    }

    private int getDescFont()
    {
        return (getFont() & 0x3e0) >> 5;
    }

    private int getDetailFont()
    {
        return (getFont() & 0x7c00) >> 10;
    }

    private int getTitleFont()
    {
        return getFont() & 0x1f;
    }

    public static List getTopAds(Map map)
    {
        if (map.containsKey("x_showtop"))
        {
            return (List)map.get("x_showtop");
        } else
        {
            return null;
        }
    }

    public static String notnull(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public boolean canUpdate()
    {
        return installedStatus == 2;
    }

    public Ad createAdFromPckName(String s)
    {
        pkg = s;
        return this;
    }

    public Ad fromCursor(Cursor cursor)
    {
        setTitle(STRING(cursor, "title", ""));
        setPicUrl(STRING(cursor, "pic_url", ""));
        setPkg(STRING(cursor, "pkg", ""));
        setPkgUrl(STRING(cursor, "pkg_url", ""));
        setAppTag(cursor.getInt(cursor.getColumnIndex("app_tag")));
        setDes(STRING(cursor, "des", ""));
        setDesc(STRING(cursor, "desc", ""));
        setDetailId(STRING(cursor, "detail_id", ""));
        setDownloadNum(STRING(cursor, "download_num", ""));
        setSubject(cursor.getInt(cursor.getColumnIndex("subject")));
        setRating(cursor.getDouble(cursor.getColumnIndex("rating")));
        setPrice(cursor.getDouble(cursor.getColumnIndex("price")));
        setReviewers(cursor.getString(cursor.getColumnIndex("reviewers")));
        setgenre(cursor.getString(cursor.getColumnIndex("genre")));
        setPkgSize(cursor.getString(cursor.getColumnIndex("pkg_size")));
        setSugType(cursor.getInt(cursor.getColumnIndex("sug_type")));
        setResType(cursor.getInt(cursor.getColumnIndex("res_type")));
        setMtType(cursor.getInt(cursor.getColumnIndex("mt_type")));
        setAppShowType(cursor.getInt(cursor.getColumnIndex("app_show_type")));
        setAppActionType(cursor.getInt(cursor.getColumnIndex("app_action_type")));
        setBackground(cursor.getString(cursor.getColumnIndex("background")));
        setContextCode(cursor.getString(cursor.getColumnIndex("context_code")));
        setNameSpace(cursor.getString(cursor.getColumnIndex("name_space")));
        setTriggerSrc(STRING(cursor, "trigger_src", ""));
        setSugApp(STRING(cursor, "sug_app", ""));
        setButtonTxt(cursor.getString(cursor.getColumnIndex("button_txt")));
        setDetail_pg(cursor.getString(cursor.getColumnIndex("detail_pg")));
        setPosName(STRING(cursor, "pos_name", ""));
        setTimeStamp(LONG(cursor, "timestamp", 0L));
        setEditorHeadLogo(STRING(cursor, "editor_head_logo", ""));
        setEditorName(STRING(cursor, "editor_name", ""));
        setEditorRecommend(STRING(cursor, "editor_recommend", ""));
        setEditorExt(STRING(cursor, "editor_ext", ""));
        setImprTrackingUrl(STRING(cursor, "impr_tracking_url", ""));
        setLikes(cursor.getInt(cursor.getColumnIndex("likes")));
        setConditionsJson(STRING(cursor, "conditionsjson", ""));
        setAdStatus(cursor.getInt(cursor.getColumnIndex("is_ad")));
        setFont(cursor.getInt(cursor.getColumnIndex("font")));
        setLoadClick(cursor.getInt(cursor.getColumnIndex("load_clk")));
        setHtml(cursor.getString(cursor.getColumnIndex("html")));
        setExtension(cursor.getString(cursor.getColumnIndex("extension")));
        setDeepLink(cursor.getString(cursor.getColumnIndex("deeplink")));
        setPriority(cursor.getInt(cursor.getColumnIndex("priority")));
        setClickTrackingUrl(cursor.getString(cursor.getColumnIndex("click_tracking_url")));
        setThirdImpUrl(cursor.getString(cursor.getColumnIndex("third_imp_url")));
        setCreateTime(cursor.getLong(cursor.getColumnIndex("create_time")));
        setPosid(cursor.getString(cursor.getColumnIndex("posid")));
        return this;
    }

    public volatile Object fromCursor(Cursor cursor)
    {
        return fromCursor(cursor);
    }

    public Ad fromJSONObject(JSONObject jsonobject)
    {
        int i = 0;
        if (jsonobject != null)
        {
            try
            {
                if (!jsonobject.isNull("title"))
                {
                    setTitle(jsonobject.getString("title"));
                }
                if (!jsonobject.isNull("desc"))
                {
                    setDesc(jsonobject.getString("desc"));
                }
                if (!jsonobject.isNull("pic_url"))
                {
                    setPicUrl(jsonobject.getString("pic_url"));
                }
                if (!jsonobject.isNull("pkg"))
                {
                    setPkg(jsonobject.getString("pkg"));
                }
                if (!jsonobject.isNull("pkg_url"))
                {
                    setPkgUrl(jsonobject.getString("pkg_url"));
                }
                if (!jsonobject.isNull("des"))
                {
                    setDes(jsonobject.getString("des"));
                }
                if (!jsonobject.isNull("app_tag"))
                {
                    setAppTag(jsonobject.getInt("app_tag"));
                }
                if (!jsonobject.isNull("detail_id"))
                {
                    setDetailId(jsonobject.getString("detail_id"));
                }
                if (!jsonobject.isNull("download_num"))
                {
                    setDownloadNum(jsonobject.getString("download_num"));
                }
                if (!jsonobject.isNull("subject"))
                {
                    setSubject(jsonobject.getInt("subject"));
                }
                if (!jsonobject.isNull("rating"))
                {
                    setRating(jsonobject.getDouble("rating"));
                }
                if (!jsonobject.isNull("versioncode"))
                {
                    versionCode = jsonobject.getInt("versioncode");
                }
                if (!jsonobject.isNull("price"))
                {
                    setPrice(jsonobject.getDouble("price"));
                }
                if (!jsonobject.isNull("reviewers"))
                {
                    setReviewers(jsonobject.getString("reviewers"));
                }
                if (!jsonobject.isNull("genre"))
                {
                    setgenre(jsonobject.getString("genre"));
                }
                if (!jsonobject.isNull("pkg_size"))
                {
                    setPkgSize(jsonobject.getString("pkg_size"));
                }
                if (!jsonobject.isNull("sug_type"))
                {
                    setSugType(jsonobject.getInt("sug_type"));
                }
                if (!jsonobject.isNull("res_type"))
                {
                    setResType(jsonobject.getInt("res_type"));
                }
                if (!jsonobject.isNull("mt_type"))
                {
                    setMtType(jsonobject.getInt("mt_type"));
                }
                if (!jsonobject.isNull("app_show_type"))
                {
                    setAppShowType(jsonobject.optInt("app_show_type"));
                }
                if (!jsonobject.isNull("app_action_type"))
                {
                    setAppActionType(jsonobject.optInt("app_action_type"));
                }
                if (!jsonobject.isNull("background"))
                {
                    setBackground(jsonobject.optString("background"));
                }
                if (!jsonobject.isNull("context_code"))
                {
                    setContextCode(jsonobject.optString("context_code"));
                }
                if (!jsonobject.isNull("name_space"))
                {
                    setNameSpace(jsonobject.optString("name_space"));
                }
                if (!jsonobject.isNull("trigger_src"))
                {
                    setTriggerSrc(jsonobject.optString("trigger_src"));
                }
                if (!jsonobject.isNull("sug_app"))
                {
                    setSugApp(jsonobject.optString("sug_app"));
                }
                if (!jsonobject.isNull("button_txt"))
                {
                    setButtonTxt(jsonobject.optString("button_txt"));
                }
                if (!jsonobject.isNull("detail_pg"))
                {
                    setDetail_pg(jsonobject.optString("detail_pg"));
                }
                if (!jsonobject.isNull("pos_name"))
                {
                    setPosName(jsonobject.optString("pos_name", ""));
                }
                if (!jsonobject.isNull("timestamp"))
                {
                    setTimeStamp(jsonobject.optLong("timestamp", 0L));
                }
                if (!jsonobject.isNull("editor_head_logo"))
                {
                    setEditorHeadLogo(jsonobject.optString("editor_head_logo", ""));
                }
                if (!jsonobject.isNull("editor_name"))
                {
                    setEditorName(jsonobject.optString("editor_name", ""));
                }
                if (!jsonobject.isNull("editor_recommend"))
                {
                    setEditorRecommend(jsonobject.optString("editor_recommend", ""));
                }
                if (!jsonobject.isNull("editor_ext"))
                {
                    setEditorExt(jsonobject.optString("editor_ext", ""));
                }
                if (!jsonobject.isNull("impr_tracking_url"))
                {
                    setImprTrackingUrl(jsonobject.optString("impr_tracking_url", ""));
                }
                if (!jsonobject.isNull("likes"))
                {
                    setLikes(jsonobject.optInt("likes", -1));
                }
                if (!jsonobject.isNull("conditionsjson"))
                {
                    setConditionsJson(jsonobject.optString("conditionsjson", ""));
                }
                if (!jsonobject.isNull("is_ad"))
                {
                    i = jsonobject.optInt("is_ad", 0);
                }
                setAdStatus(i);
                if (!jsonobject.isNull("font"))
                {
                    setFont(jsonobject.optInt("font", 0));
                }
                if (!jsonobject.isNull("load_clk"))
                {
                    setLoadClick(jsonobject.optInt("load_clk", 0));
                }
                if (!jsonobject.isNull("html"))
                {
                    setHtml(jsonobject.optString("html", ""));
                }
                if (!jsonobject.isNull("extension"))
                {
                    setExtension(jsonobject.optString("extension", ""));
                }
                if (!jsonobject.isNull("deeplink"))
                {
                    setDeepLink(jsonobject.optString("deeplink", ""));
                }
                if (!jsonobject.isNull("priority"))
                {
                    setPriority(jsonobject.optInt("priority", 0));
                }
                if (!jsonobject.isNull("click_tracking_url"))
                {
                    setClickTrackingUrl(jsonobject.optString("click_tracking_url", ""));
                }
                if (!jsonobject.isNull("third_imp_url"))
                {
                    setThirdImpUrl(jsonobject.optString("third_imp_url", ""));
                }
                if (!jsonobject.isNull("create_time"))
                {
                    setCreateTime(jsonobject.optLong("create_time", 0L));
                }
                if (!jsonobject.isNull("posid"))
                {
                    setPosid(jsonobject.optString("posid", ""));
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return this;
            }
        }
        return this;
    }

    public volatile Object fromJSONObject(JSONObject jsonobject)
    {
        return fromJSONObject(jsonobject);
    }

    public int getActionForMaidian()
    {
        if (isOpenInternal())
        {
            return 6;
        }
        switch (installedStatus)
        {
        default:
            return 0;

        case 1: // '\001'
            return 4;

        case 2: // '\002'
            return 3;

        case 0: // '\0'
            return 2;
        }
    }

    public int getAdStatus()
    {
        return mAdStatus;
    }

    public int getAppActionType()
    {
        return app_action_type;
    }

    public int getAppShowType()
    {
        return app_show_type;
    }

    public int getAppTag()
    {
        return app_tag;
    }

    public String getBackground()
    {
        return background;
    }

    public String getButtonTxt()
    {
        return button_txt;
    }

    public String getClickTrackingUrl()
    {
        return mClickTrackingUrl;
    }

    public String getConditionsJson()
    {
        return conditionsjson;
    }

    public String getContextCode()
    {
        return context_code;
    }

    public long getCreateTime()
    {
        if (mCreateTime == 0L)
        {
            mCreateTime = System.currentTimeMillis();
        }
        return mCreateTime;
    }

    public String getDeepLink()
    {
        return mDeepLink;
    }

    public String getDes()
    {
        return des;
    }

    public String getDesc()
    {
        return desc;
    }

    public int getDescColor()
    {
        return (getDescFont() & 0x1e) >> 1;
    }

    public int getDetailColor()
    {
        return (getDetailFont() & 0x1e) >> 1;
    }

    public String getDetailId()
    {
        return detail_id;
    }

    public String getDetail_pg()
    {
        return detail_pg;
    }

    public String getDownloadNum()
    {
        return download_num;
    }

    public String getEditorExt()
    {
        return mEditorExt;
    }

    public String getEditorHeadLogo()
    {
        return mEditorHeadLogo;
    }

    public String getEditorName()
    {
        return mEditorName;
    }

    public String getEditorRecommend()
    {
        return mEditorRecommend;
    }

    public String getExtension()
    {
        return mExtension;
    }

    public int getFont()
    {
        return mFont;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getHtml()
    {
        return html;
    }

    public String getImprTrackingUrl()
    {
        return mImprTrackingUrl;
    }

    public int getLikes()
    {
        return mLikes;
    }

    public int getLoadClk()
    {
        return mLoadClick;
    }

    public int getMtType()
    {
        return mt_type;
    }

    public String getNameSpace()
    {
        return name_space;
    }

    public String getPicUrl()
    {
        return pic_url;
    }

    public String getPkg()
    {
        return pkg;
    }

    public String getPkgUrl()
    {
        return pkg_url;
    }

    public String getPosName()
    {
        return mPosName;
    }

    public String getPosid()
    {
        return mPosid;
    }

    public int getPosision()
    {
        return x_posision;
    }

    public double getPrice()
    {
        return price;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public double getRating()
    {
        return rating;
    }

    public int getResType()
    {
        return res_type;
    }

    public String getReviewers()
    {
        return reviewers;
    }

    public int getShowType()
    {
        return showRating;
    }

    public int getShowedPos()
    {
        return showedPos;
    }

    public int getSubject()
    {
        return subject;
    }

    public String getSugApp()
    {
        return notnull(sug_app);
    }

    public ArrayList getSugApps()
    {
        ArrayList arraylist;
        if (mSugApps != null)
        {
            return mSugApps;
        }
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(sug_app)) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray(sug_app);
        int i = 0;
_L3:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = jsonarray.getJSONObject(i);
        Ad ad = new Ad();
        ad.fromJSONObject(jsonobject);
        arraylist.add(ad);
        i++;
        if (true) goto _L3; else goto _L2
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
_L2:
        mSugApps = arraylist;
        return arraylist;
    }

    public int getSugType()
    {
        return sug_type;
    }

    public String getThirdImpUrl()
    {
        return mThirdImpUrl;
    }

    public long getTimeStamp()
    {
        return mTimeStamp;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTitleColor()
    {
        return (getTitleFont() & 0x1e) >> 1;
    }

    public String getTriggerSrc()
    {
        return trigger_src;
    }

    public List getTriggerSrcAsList()
    {
        ArrayList arraylist = new ArrayList();
        if (!TextUtils.isEmpty(trigger_src)) goto _L2; else goto _L1
_L1:
        arraylist.add("x_showtop");
_L4:
        return arraylist;
_L2:
        String as[] = trigger_src.split(",");
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                arraylist.add(as[i]);
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public VastModel getVastModel()
    {
        return vastModel;
    }

    public int getVersionCode()
    {
        return versionCode;
    }

    public String getpkg_size()
    {
        return pkg_size;
    }

    public boolean hasDetail()
    {
        return !TextUtils.isEmpty(getDetail_pg());
    }

    public boolean isAvailAble()
    {
        long l1 = com.cleanmaster.ui.app.market.c.b(getPosid());
        long l = l1;
        if (l1 == 0L)
        {
            l = 0x36ee80L;
        }
        return System.currentTimeMillis() - getCreateTime() < l;
    }

    public boolean isDeepLink()
    {
        return mt_type == 512;
    }

    public boolean isDescBold()
    {
        return (getDescFont() & 1) == 1;
    }

    public boolean isDetailBold()
    {
        return (getDetailFont() & 1) == 1;
    }

    public boolean isForOpen()
    {
        return isSubjectAd() || isOpenInternal() || isInstalled() || getAppShowType() != 0 && getAppShowType() != 1004 && getAppShowType() != 1002 && getAppShowType() != 1022 && getAppShowType() != 50000;
    }

    public boolean isForOpen_Uninstall()
    {
        return isSubjectAd() || isOpenInternal() || isInstalled();
    }

    public boolean isInstalled()
    {
        return 1 == installedStatus;
    }

    public boolean isNotInstalled()
    {
        return installedStatus == 0;
    }

    public boolean isOpenBrowser()
    {
        return mt_type == 256;
    }

    public boolean isOpenInternal()
    {
        return mt_type == 64;
    }

    public boolean isOpenWebview()
    {
        return mt_type == 128;
    }

    public boolean isOperationOrCollectionAd()
    {
        while (res_type == 0 || res_type == 100 || res_type == 3 || mAdStatus != 0) 
        {
            return true;
        }
        return false;
    }

    public boolean isPreloadUrl()
    {
        return getLoadClk() > 0;
    }

    public boolean isPriority()
    {
        return getPriority() == 1;
    }

    public boolean isShowGuess()
    {
        return isShowGuess;
    }

    public boolean isShowRating()
    {
        return showRating == 1;
    }

    public boolean isSubjectAd()
    {
        return getSubject() > 0;
    }

    public boolean isTitleBold()
    {
        return (getTitleFont() & 1) == 1;
    }

    public boolean match(a a)
    {
        if (!TextUtils.isEmpty(conditionsjson))
        {
            if (_conditionsjson == null)
            {
                _conditionsjson = b.a(conditionsjson);
            }
            if (_conditionsjson != null)
            {
                return _conditionsjson.a(a);
            }
        }
        return true;
    }

    public void setAdStatus(int i)
    {
        mAdStatus = i;
    }

    public void setAppActionType(int i)
    {
        app_action_type = i;
    }

    public void setAppShowType(int i)
    {
        app_show_type = i;
    }

    public void setAppTag(int i)
    {
        app_tag = i;
    }

    public void setBackground(String s)
    {
        background = s;
    }

    public void setButtonTxt(String s)
    {
        button_txt = s;
    }

    public void setClickTrackingUrl(String s)
    {
        mClickTrackingUrl = s;
    }

    public Ad setConditionsJson(String s)
    {
        conditionsjson = s;
        return this;
    }

    public void setContextCode(String s)
    {
        context_code = s;
    }

    public void setCreateTime(long l)
    {
        mCreateTime = l;
    }

    public void setDeepLink(String s)
    {
        mDeepLink = s;
    }

    public void setDes(String s)
    {
        des = s;
    }

    public void setDesc(String s)
    {
        desc = s;
    }

    public void setDetailId(String s)
    {
        detail_id = s;
    }

    public void setDetail_pg(String s)
    {
        detail_pg = s;
    }

    public void setDownloadNum(String s)
    {
        download_num = s;
    }

    public void setEditorExt(String s)
    {
        mEditorExt = s;
    }

    public void setEditorHeadLogo(String s)
    {
        mEditorHeadLogo = s;
    }

    public void setEditorName(String s)
    {
        mEditorName = s;
    }

    public void setEditorRecommend(String s)
    {
        mEditorRecommend = s;
    }

    public void setExtension(String s)
    {
        mExtension = s;
    }

    public void setFont(int i)
    {
        mFont = i;
    }

    public void setHtml(String s)
    {
        html = s;
    }

    public void setImprTrackingUrl(String s)
    {
        mImprTrackingUrl = s;
    }

    public void setLikes(int i)
    {
        mLikes = i;
    }

    public void setLoadClick(int i)
    {
        mLoadClick = i;
    }

    public void setMtType(int i)
    {
        mt_type = i;
    }

    public void setNameSpace(String s)
    {
        name_space = s;
    }

    public void setPicUrl(String s)
    {
        pic_url = s;
    }

    public void setPkg(String s)
    {
        pkg = s;
    }

    public void setPkgSize(String s)
    {
        pkg_size = s;
    }

    public void setPkgUrl(String s)
    {
        pkg_url = s;
    }

    public void setPosName(String s)
    {
        mPosName = s;
    }

    public void setPosid(String s)
    {
        mPosid = s;
    }

    public void setPosision(int i)
    {
        x_posision = i;
    }

    public void setPrice(double d)
    {
        price = d;
    }

    public void setPriority(int i)
    {
        mPriority = i;
    }

    public void setRating(double d)
    {
        rating = d;
    }

    public void setResType(int i)
    {
        res_type = i;
    }

    public void setReviewers(String s)
    {
        reviewers = s;
    }

    public void setShowGuess(boolean flag)
    {
        isShowGuess = flag;
    }

    public void setShowType(int i)
    {
        showRating = i;
    }

    public void setShowedPos(int i)
    {
        showedPos = i;
    }

    public void setSubject(int i)
    {
        subject = i;
    }

    public void setSugApp(String s)
    {
        sug_app = s;
    }

    public void setSugApps(ArrayList arraylist)
    {
        mSugApps = arraylist;
    }

    public void setSugType(int i)
    {
        sug_type = i;
    }

    public void setThirdImpUrl(String s)
    {
        mThirdImpUrl = s;
    }

    public void setTimeStamp(long l)
    {
        mTimeStamp = l;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setTriggerSrc(String s)
    {
        trigger_src = s;
    }

    public void setVastModel(VastModel vastmodel)
    {
        vastModel = vastmodel;
    }

    public void setgenre(String s)
    {
        genre = s;
    }

    public f toBuinessDataItem()
    {
        f f1 = new f(getPkg(), getSugType(), getResType(), getDes());
        f1.a(x_posision);
        return f1;
    }

    public f toBuinessDataItem(int i, int j, int k)
    {
        f f1 = new f(getPkg(), getSugType(), getResType(), getDes(), i, j, k);
        f1.a(x_posision);
        return f1;
    }

    public ContentValues toContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        try
        {
            contentvalues.put("title", notnull(getTitle()));
            contentvalues.put("pic_url", notnull(getPicUrl()));
            contentvalues.put("pkg", notnull(getPkg()));
            contentvalues.put("pkg_url", notnull(getPkgUrl()));
            contentvalues.put("app_tag", Integer.valueOf(getAppTag()));
            contentvalues.put("desc", notnull(getDesc()));
            contentvalues.put("des", notnull(getDes()));
            contentvalues.put("detail_id", notnull(getDetailId()));
            contentvalues.put("download_num", notnull(getDownloadNum()));
            contentvalues.put("subject", Integer.valueOf(getSubject()));
            contentvalues.put("price", Double.valueOf(getPrice()));
            contentvalues.put("reviewers", notnull(getReviewers()));
            contentvalues.put("genre", notnull(getGenre()));
            contentvalues.put("rating", Double.valueOf(getRating()));
            contentvalues.put("pkg_size", notnull(getpkg_size()));
            contentvalues.put("sug_type", Integer.valueOf(getSugType()));
            contentvalues.put("res_type", Integer.valueOf(getResType()));
            contentvalues.put("mt_type", Integer.valueOf(getMtType()));
            contentvalues.put("app_action_type", Integer.valueOf(getAppActionType()));
            contentvalues.put("app_show_type", Integer.valueOf(getAppShowType()));
            contentvalues.put("background", getBackground());
            contentvalues.put("context_code", getContextCode());
            contentvalues.put("name_space", getNameSpace());
            contentvalues.put("trigger_src", notnull(getTriggerSrc()));
            contentvalues.put("sug_app", getSugApp());
            contentvalues.put("button_txt", getButtonTxt());
            contentvalues.put("pos_name", notnull(getPosName()));
            contentvalues.put("editor_head_logo", notnull(getEditorHeadLogo()));
            contentvalues.put("editor_name", notnull(getEditorName()));
            contentvalues.put("editor_recommend", notnull(getEditorRecommend()));
            contentvalues.put("timestamp", Long.valueOf(getTimeStamp()));
            contentvalues.put("editor_ext", getEditorExt());
            contentvalues.put("impr_tracking_url", getImprTrackingUrl());
            contentvalues.put("detail_pg", notnull(getDetail_pg()));
            contentvalues.put("likes", Integer.valueOf(getLikes()));
            contentvalues.put("conditionsjson", getConditionsJson());
            contentvalues.put("is_ad", Integer.valueOf(getAdStatus()));
            contentvalues.put("font", Integer.valueOf(getFont()));
            contentvalues.put("load_clk", Integer.valueOf(getLoadClk()));
            contentvalues.put("html", getHtml());
            contentvalues.put("extension", getExtension());
            contentvalues.put("deeplink", getDeepLink());
            contentvalues.put("priority", Integer.valueOf(getPriority()));
            contentvalues.put("click_tracking_url", getClickTrackingUrl());
            contentvalues.put("third_imp_url", getThirdImpUrl());
            setCreateTime(System.currentTimeMillis());
            contentvalues.put("create_time", Long.valueOf(getCreateTime()));
            contentvalues.put("posid", getPosid());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return contentvalues;
        }
        return contentvalues;
    }

    public ContentValues toContentValues(String s)
    {
        setPosid(s);
        return toContentValues();
    }

    public String toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("title", getTitle());
            jsonobject.put("desc", getDesc());
            jsonobject.put("pic_url", getPicUrl());
            jsonobject.put("pkg", getPkg());
            jsonobject.put("pkg_url", getPkgUrl());
            jsonobject.put("des", getDes());
            jsonobject.put("app_tag", getAppTag());
            jsonobject.put("detail_id", getDetailId());
            jsonobject.put("download_num", getDownloadNum());
            jsonobject.put("subject", getSubject());
            jsonobject.put("rating", getRating());
            jsonobject.put("versioncode", getVersionCode());
            jsonobject.put("price", getPrice());
            jsonobject.put("reviewers", getReviewers());
            jsonobject.put("genre", getGenre());
            jsonobject.put("pkg_size", getpkg_size());
            jsonobject.put("sug_type", getSugType());
            jsonobject.put("res_type", getResType());
            jsonobject.put("mt_type", getMtType());
            jsonobject.put("app_show_type", getAppShowType());
            jsonobject.put("app_action_type", getAppActionType());
            jsonobject.put("background", getBackground());
            jsonobject.put("context_code", getContextCode());
            jsonobject.put("name_space", getNameSpace());
            jsonobject.put("trigger_src", getNameSpace());
            jsonobject.put("sug_app", getSugApp());
            jsonobject.put("button_txt", getButtonTxt());
            jsonobject.put("pos_name=", getPosName());
            jsonobject.put("timestamp=", getTimeStamp());
            jsonobject.put("editor_head_logo=", getEditorHeadLogo());
            jsonobject.put("editor_name=", getEditorName());
            jsonobject.put("editor_recommend=", getEditorRecommend());
            jsonobject.put("editor_ext=", getEditorExt());
            jsonobject.put("detail_pg=", getDetail_pg());
            jsonobject.put("impr_tracking_url", getImprTrackingUrl());
            jsonobject.put("likes", getLikes());
            jsonobject.put("conditionsjson", getConditionsJson());
            jsonobject.put("is_ad", mAdStatus);
            jsonobject.put("font", getFont());
            jsonobject.put("load_clk", getLoadClk());
            jsonobject.put("html", getHtml());
            jsonobject.put("extension", getExtension());
            jsonobject.put("deeplink", getDeepLink());
            jsonobject.put("priority", getPriority());
            jsonobject.put("click_tracking_url", getClickTrackingUrl());
            jsonobject.put("third_imp_url", getThirdImpUrl());
            jsonobject.put("create_time", getCreateTime());
            jsonobject.put("posid", getPosid());
        }
        catch (Exception exception) { }
        return jsonobject.toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("[ ")).append(getClass().getSimpleName()).append(" ]").toString()).append("\n");
        stringbuilder.append("        title=").append(getTitle()).append("\n");
        stringbuilder.append("         desc=").append(getDesc()).append("\n");
        stringbuilder.append("      pic_url=").append(getPicUrl()).append("\n");
        stringbuilder.append("          pkg=").append(getPkg()).append("\n");
        stringbuilder.append("      pkg_url=").append(getPkgUrl()).append("\n");
        stringbuilder.append("          des=").append(getDes()).append("\n");
        stringbuilder.append("      app_tag=").append(getAppTag()).append("\n");
        stringbuilder.append("    detail_id=").append(getDetailId()).append("\n");
        stringbuilder.append(" download_num=").append(getDownloadNum()).append("\n");
        stringbuilder.append("      subject=").append(getSubject()).append("\n");
        stringbuilder.append("       rating=").append(getRating()).append("\n");
        stringbuilder.append("  versionCode=").append(versionCode).append("\n");
        stringbuilder.append("  show_rating=").append(getShowType()).append("\n");
        stringbuilder.append("      mt_type=").append(getMtType()).append("\n");
        stringbuilder.append("    app_action_type=").append(getAppActionType()).append("\n");
        stringbuilder.append("      app_show_type=").append(getAppShowType()).append("\n");
        stringbuilder.append("         background=").append(getBackground()).append("\n");
        stringbuilder.append("       context_code=").append(getContextCode()).append("\n");
        stringbuilder.append("         name_space=").append(getNameSpace()).append("\n");
        stringbuilder.append("        trigger_src=").append(getTriggerSrc()).append("\n");
        stringbuilder.append("            sug_app=").append(getSugApp()).append("\n");
        stringbuilder.append("            button_txt=").append(getButtonTxt()).append("\n");
        stringbuilder.append("      pos_name=").append(getPosName()).append("\n");
        stringbuilder.append("      timestamp=").append(getTimeStamp()).append("\n");
        stringbuilder.append("      editor_head_logo=").append(getEditorHeadLogo()).append("\n");
        stringbuilder.append("      editor_name=").append(getEditorName()).append("\n");
        stringbuilder.append("      editor_recommend=").append(getEditorRecommend()).append("\n");
        stringbuilder.append("      editor_ext=").append(getEditorExt()).append("\n");
        stringbuilder.append("     impr_tracking_url=").append(getImprTrackingUrl()).append("\n");
        stringbuilder.append("     detail_pg=").append(getDetail_pg()).append("\n");
        stringbuilder.append("     likes=").append(getLikes()).append("\n");
        stringbuilder.append("     conditionsjson=").append(getConditionsJson()).append("\n");
        stringbuilder.append("     font=").append(getFont()).append("\n");
        stringbuilder.append("     load_clk=").append(getLoadClk()).append("\n");
        stringbuilder.append("     html=").append(getHtml()).append("\n");
        stringbuilder.append("     extension=").append(getExtension()).append("\n");
        stringbuilder.append("     deeplink=").append(getDeepLink()).append("\n");
        stringbuilder.append("     priority=").append(getPriority()).append("\n");
        stringbuilder.append("     clickTrackUrl=").append(getClickTrackingUrl()).append("\n");
        stringbuilder.append("     thirdImpUrl=").append(getThirdImpUrl()).append("\n");
        stringbuilder.append("     createTime=").append(getCreateTime()).append("\n");
        stringbuilder.append("     posid=").append(getPosid()).append("\n");
        return stringbuilder.toString();
    }
}
