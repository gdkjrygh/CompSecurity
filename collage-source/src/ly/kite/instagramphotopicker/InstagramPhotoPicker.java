// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramPhoto, InstagramGalleryActivity, InstagramLoginActivity

public class InstagramPhotoPicker
{

    public static final String EXTRA_SELECTED_PHOTOS = "ly.kite.instagramphotopicker.EXTRA_SELECTED_PHOTOS";
    static final String PREFERENCE_ACCESS_TOKEN = "ly.kite.instagramphotopicker.PREFERENCE_ACCESS_TOKEN";
    static final String PREFERENCE_CLIENT_ID = "ly.kite.instagramphotopicker.PREFERENCE_CLIENT_ID";
    static final String PREFERENCE_FILE = "ly.kite.instagramphotopicker.PREFERENCE_FILE";
    static final String PREFERENCE_REDIRECT_URI = "ly.kite.instagramphotopicker.PREFERENCE_REDIRECT_URI";
    static String cachedAccessToken = null;
    static String cachedClientId = null;
    static String cachedRedirectUri = null;

    public InstagramPhotoPicker()
    {
    }

    static String getAccessToken(Context context)
    {
        if (cachedAccessToken == null)
        {
            loadInstagramPreferences(context);
        }
        return cachedAccessToken;
    }

    static String getClientId(Context context)
    {
        if (cachedClientId == null)
        {
            loadInstagramPreferences(context);
        }
        return cachedClientId;
    }

    static String getRedirectUri(Context context)
    {
        if (cachedRedirectUri == null)
        {
            loadInstagramPreferences(context);
        }
        return cachedRedirectUri;
    }

    public static InstagramPhoto[] getResultPhotos(Intent intent)
    {
        intent = intent.getParcelableArrayExtra("ly.kite.instagramphotopicker.EXTRA_SELECTED_PHOTOS");
        InstagramPhoto ainstagramphoto[] = new InstagramPhoto[intent.length];
        System.arraycopy(intent, 0, ainstagramphoto, 0, intent.length);
        return ainstagramphoto;
    }

    private static void loadInstagramPreferences(Context context)
    {
        context = context.getApplicationContext().getSharedPreferences("ly.kite.instagramphotopicker.PREFERENCE_FILE", 0);
        cachedAccessToken = context.getString("ly.kite.instagramphotopicker.PREFERENCE_ACCESS_TOKEN", null);
        cachedClientId = context.getString("ly.kite.instagramphotopicker.PREFERENCE_CLIENT_ID", null);
        cachedRedirectUri = context.getString("ly.kite.instagramphotopicker.PREFERENCE_REDIRECT_URI", null);
    }

    static void logout(Context context)
    {
        android.content.SharedPreferences.Editor editor = context.getApplicationContext().getSharedPreferences("ly.kite.instagramphotopicker.PREFERENCE_FILE", 0).edit();
        editor.remove("ly.kite.instagramphotopicker.PREFERENCE_ACCESS_TOKEN");
        editor.remove("ly.kite.instagramphotopicker.PREFERENCE_CLIENT_ID");
        editor.remove("ly.kite.instagramphotopicker.PREFERENCE_REDIRECT_URI");
        editor.commit();
        cachedAccessToken = null;
        cachedClientId = null;
        cachedRedirectUri = null;
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
        (new WebView(context)).clearCache(true);
    }

    static void saveInstagramPreferences(Context context, String s, String s1, String s2)
    {
        context = context.getApplicationContext().getSharedPreferences("ly.kite.instagramphotopicker.PREFERENCE_FILE", 0).edit();
        context.putString("ly.kite.instagramphotopicker.PREFERENCE_ACCESS_TOKEN", s);
        context.putString("ly.kite.instagramphotopicker.PREFERENCE_CLIENT_ID", s1);
        context.putString("ly.kite.instagramphotopicker.PREFERENCE_REDIRECT_URI", s2);
        context.commit();
        cachedAccessToken = s;
        cachedClientId = s1;
        cachedRedirectUri = s2;
    }

    public static void startPhotoPickerForResult(Activity activity, String s, String s1, int i)
    {
        if (getAccessToken(activity) != null)
        {
            if (s.equals(cachedClientId))
            {
                InstagramGalleryActivity.startForResult(activity, i);
                return;
            }
            logout(activity);
        }
        InstagramLoginActivity.startLoginForResult(activity, s, s1, i);
    }

    public static void startPhotoPickerForResult(Fragment fragment, String s, String s1, int i)
    {
        if (getAccessToken(fragment.getActivity()) != null)
        {
            if (s.equals(cachedClientId))
            {
                InstagramGalleryActivity.startForResult(fragment, i);
                return;
            }
            logout(fragment.getActivity());
        }
        InstagramLoginActivity.startLoginForResult(fragment, s, s1, i);
    }

}
