// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.OpenUDID;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.math.BigInteger;
import java.security.SecureRandom;

public class OpenUDID_manager
{

    private static final boolean LOG = true;
    private static String OpenUDID = null;
    public static final String PREFS_NAME = "openudid_prefs";
    public static final String PREF_KEY = "openudid";
    public static final String TAG = "OpenUDID";
    private static boolean mInitialized = false;
    private final Context mContext;
    private final SharedPreferences mPreferences;

    private OpenUDID_manager(Context context)
    {
        mPreferences = context.getSharedPreferences("openudid_prefs", 0);
        mContext = context;
    }

    private void generateOpenUDID()
    {
        Log.d("OpenUDID", "Generating openUDID");
        OpenUDID = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        if (OpenUDID == null || OpenUDID.equals("9774d56d682e549c") || OpenUDID.length() < 15)
        {
            OpenUDID = (new BigInteger(64, new SecureRandom())).toString(16);
        }
    }

    public static String getOpenUDID()
    {
        if (!mInitialized)
        {
            Log.e("OpenUDID", "Initialisation isn't done");
        }
        return OpenUDID;
    }

    public static boolean isInitialized()
    {
        return mInitialized;
    }

    private void storeOpenUDID()
    {
        android.content.SharedPreferences.Editor editor = mPreferences.edit();
        editor.putString("openudid", OpenUDID);
        editor.commit();
    }

    public static void sync(Context context)
    {
        context = new OpenUDID_manager(context);
        OpenUDID = ((OpenUDID_manager) (context)).mPreferences.getString("openudid", null);
        if (OpenUDID == null)
        {
            context.generateOpenUDID();
            context.storeOpenUDID();
        }
        Log.d("OpenUDID", (new StringBuilder("OpenUDID: ")).append(OpenUDID).toString());
        mInitialized = true;
    }

}
