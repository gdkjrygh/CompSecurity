// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.util.ArrayList;
import net.coocent.android.exitwithrate.AppturboUnlockTools;
import net.coocent.android.exitwithrate.InstallTimeChecker;

// Referenced classes of package net.coocent.android.xmlparser:
//            GiftEntity, GiftActivity, NetMusicXmlParseTask, LoadAppInfoListener, 
//            GiftGridViewAdapter

public class PromotionSDK
{

    public static final String BASE_URL = "http://www.coocent.net/coocentPromotion/yonggift/";
    public static final String DOWNLOAD_ICON_PATH = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/gift/").toString();
    public static final String IS_NO_AD_VERSION = "is_no_ad_version";
    public static final String PREFERENCE_BASE_INFO = "APP_BASE_INFOS";
    public static final String PREFERENCE_KEY_RATE = "APP_RATE";
    private static ArrayList appinfoList = null;
    private static SharedPreferences db;
    private static int giftIcons[];
    private static boolean isFirstNew = false;
    private static Activity mContext;
    private static LoadAppInfoListener mlAppInfoListener;

    public PromotionSDK()
    {
    }

    public static ArrayList GetAppInfoList()
    {
        return appinfoList;
    }

    public static void Init(LoadAppInfoListener loadappinfolistener, Activity activity)
    {
        mlAppInfoListener = loadappinfolistener;
        mContext = activity;
        if (db == null)
        {
            db = activity.getSharedPreferences("APP_BASE_INFOS", 0);
        }
    }

    public static void InitAppInfoList(ArrayList arraylist)
    {
        appinfoList = arraylist;
    }

    public static void InitMyActionBar(LoadAppInfoListener loadappinfolistener, Activity activity)
    {
        mlAppInfoListener = loadappinfolistener;
        mContext = activity;
        if (db == null)
        {
            db = activity.getSharedPreferences("APP_BASE_INFOS", 0);
        }
        mContext.findViewById(net.coocent.promotionsdk.R.id.promotion_icon).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                MobclickAgent.onEvent(PromotionSDK.mContext, "open");
                PromotionSDK.showPromoationApp();
            }

        });
    }

    public static void UpdateNewcount()
    {
        TextView textview;
        int i;
        try
        {
            textview = (TextView)mContext.findViewById(net.coocent.promotionsdk.R.id.newcount_tv);
            i = getNewCount();
        }
        catch (Exception exception)
        {
            return;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        mContext.findViewById(net.coocent.promotionsdk.R.id.promotion_icon).setVisibility(0);
        textview.setText((new StringBuilder()).append(i).toString());
        textview.setVisibility(0);
        textview.startAnimation(AnimationUtils.loadAnimation(mContext, net.coocent.promotionsdk.R.anim.newcount_in));
        return;
        mContext.findViewById(net.coocent.promotionsdk.R.id.promotion_icon).setVisibility(8);
        return;
    }

    public static int getGiftIconForActionBar()
    {
        return giftIcons[getNewCount()];
    }

    public static boolean getIsNoAdVersion(String s)
    {
        boolean flag1 = PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("is_no_ad_version", false);
        if (flag1)
        {
            return true;
        }
        InstallTimeChecker installtimechecker = new InstallTimeChecker();
        installtimechecker.setpromotionTime(s);
        boolean flag2 = installtimechecker.isPromotionTime(mContext);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (AppturboUnlockTools.isAppturboUnlockable(mContext))
            {
                flag = flag1;
                if (flag2)
                {
                    PreferenceManager.getDefaultSharedPreferences(mContext).edit().putBoolean("is_no_ad_version", true).commit();
                    flag = true;
                    Toast.makeText(mContext, mContext.getString(net.coocent.promotionsdk.R.string.appturbo_promotion), 1).show();
                }
            }
        }
        return flag;
    }

    public static int getNewCount()
    {
        int j;
        int l;
        int i1;
        j = 0;
        int i = 0;
        int k;
        try
        {
            i1 = appinfoList.size();
        }
        catch (Exception exception)
        {
            return i;
        }
        l = 0;
          goto _L1
_L3:
        k = j;
        i = j;
        if (!isNew(((GiftEntity)appinfoList.get(l)).getPackagename()))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        j++;
        k = j;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        i = j;
        isFirstNew = true;
        k = j;
        l++;
        j = k;
_L1:
        if (l < i1) goto _L3; else goto _L2
_L2:
        return j;
    }

    protected static boolean isNew(String s)
    {
        return db == null || !db.contains(s);
    }

    public static void onResume()
    {
        if (appinfoList != null)
        {
            UpdateNewcount();
        }
    }

    protected static void setListOnItemClickListner(GridView gridview, final GiftGridViewAdapter giftGridViewAdapter)
    {
        gridview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private final GiftGridViewAdapter val$giftGridViewAdapter;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                view = PromotionSDK.db.edit();
                adapterview = ((GiftEntity)giftGridViewAdapter.getItem(i)).getPackagename();
                view.putString(adapterview, adapterview);
                view.commit();
                view = (new StringBuilder("market://details?id=")).append(adapterview).toString();
                try
                {
                    Uri uri = Uri.parse(view);
                    Intent intent = PromotionSDK.mContext.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                    intent.setData(uri);
                    PromotionSDK.mContext.startActivity(intent);
                }
                catch (Exception exception)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse(view));
                    PromotionSDK.mContext.startActivity(view);
                }
                giftGridViewAdapter.notifyDataSetChanged();
                MobclickAgent.onEvent(PromotionSDK.mContext, adapterview.replace('.', '_'));
                MobclickAgent.onEvent(PromotionSDK.mContext, "total");
            }

            
            {
                giftGridViewAdapter = giftgridviewadapter;
                super();
            }
        });
    }

    public static void showPromoationApp()
    {
        String s;
        Object obj;
        mContext.startActivity(new Intent(mContext, net/coocent/android/xmlparser/GiftActivity));
        obj = db.edit();
        if (!isFirstNew)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s = ((GiftEntity)appinfoList.get(0)).getPackagename();
        ((android.content.SharedPreferences.Editor) (obj)).putString(s, s);
        isFirstNew = false;
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        obj = (new StringBuilder("market://details?id=")).append(s).toString();
        Uri uri = Uri.parse(((String) (obj)));
        Intent intent = mContext.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
        intent.setData(uri);
        mContext.startActivity(intent);
_L1:
        Exception exception1;
        try
        {
            MobclickAgent.onEvent(mContext, s.replace('.', '_'));
            return;
        }
        catch (Exception exception) { }
        break MISSING_BLOCK_LABEL_165;
        exception1;
        obj = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        mContext.startActivity(((Intent) (obj)));
          goto _L1
    }

    public static void starAppInfoLoadTask()
    {
        (new NetMusicXmlParseTask(mlAppInfoListener, mContext)).execute(new String[] {
            "http://www.coocent.net/coocentPromotion/yonggift/giftList.xml"
        });
    }

    static 
    {
        giftIcons = (new int[] {
            net.coocent.promotionsdk.R.drawable.icon_gift, net.coocent.promotionsdk.R.drawable.icon_gift_1, net.coocent.promotionsdk.R.drawable.icon_gift_2, net.coocent.promotionsdk.R.drawable.icon_gift_3, net.coocent.promotionsdk.R.drawable.icon_gift_4, net.coocent.promotionsdk.R.drawable.icon_gift_5, net.coocent.promotionsdk.R.drawable.icon_gift_6, net.coocent.promotionsdk.R.drawable.icon_gift_7, net.coocent.promotionsdk.R.drawable.icon_gift_8, net.coocent.promotionsdk.R.drawable.icon_gift_9
        });
    }


}
