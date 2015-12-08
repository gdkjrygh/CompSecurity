// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package net.hockeyapp.android:
//            Constants, VersionCache, UpdateFragment, UpdateManagerListener, 
//            UpdateActivity, UpdateManager

public class CheckUpdateTask extends AsyncTask
{

    private Activity activity;
    protected String appIdentifier;
    private UpdateManagerListener listener;
    private Boolean mandatory;
    protected String urlString;

    public CheckUpdateTask(Activity activity1, String s)
    {
        urlString = null;
        appIdentifier = null;
        activity = null;
        mandatory = Boolean.valueOf(false);
        appIdentifier = null;
        activity = activity1;
        urlString = s;
        Constants.loadFromContext(activity1);
    }

    public CheckUpdateTask(Activity activity1, String s, String s1)
    {
        urlString = null;
        appIdentifier = null;
        activity = null;
        mandatory = Boolean.valueOf(false);
        appIdentifier = s1;
        activity = activity1;
        urlString = s;
        Constants.loadFromContext(activity1);
    }

    public CheckUpdateTask(Activity activity1, String s, String s1, UpdateManagerListener updatemanagerlistener)
    {
        urlString = null;
        appIdentifier = null;
        activity = null;
        mandatory = Boolean.valueOf(false);
        appIdentifier = s1;
        activity = activity1;
        urlString = s;
        listener = updatemanagerlistener;
        Constants.loadFromContext(activity1);
    }

    private void cleanUp()
    {
        activity = null;
        urlString = null;
        appIdentifier = null;
    }

    private static String convertStreamToString(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 1024);
        stringbuilder = new StringBuilder();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        stringbuilder.append((new StringBuilder()).append(s).append("\n").toString());
          goto _L1
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return stringbuilder.toString();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        throw exception;
    }

    private boolean findNewVersion(JSONArray jsonarray, int i)
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
label1:
                {
                    boolean flag = flag1;
                    try
                    {
                        if (j >= jsonarray.length())
                        {
                            break label1;
                        }
                        JSONObject jsonobject = jsonarray.getJSONObject(j);
                        if (jsonobject.getInt("version") <= i)
                        {
                            break label0;
                        }
                        if (jsonobject.has("mandatory"))
                        {
                            mandatory = Boolean.valueOf(jsonobject.getBoolean("mandatory"));
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return false;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private void showDialog(final JSONArray updateInfo)
    {
        if (getCachingEnabled())
        {
            VersionCache.setVersionInfo(activity, updateInfo.toString());
        }
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setTitle(R.string.update_dialog_title);
        if (!mandatory.booleanValue())
        {
            builder.setMessage(R.string.update_dialog_message);
            builder.setNegativeButton(R.string.update_dialog_negative_button, new android.content.DialogInterface.OnClickListener() {

                final CheckUpdateTask this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    cleanUp();
                }

            
            {
                this$0 = CheckUpdateTask.this;
                super();
            }
            });
            builder.setPositiveButton(R.string.update_dialog_positive_button, new android.content.DialogInterface.OnClickListener() {

                final CheckUpdateTask this$0;
                final JSONArray val$updateInfo;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (getCachingEnabled())
                    {
                        VersionCache.setVersionInfo(activity, "[]");
                    }
                    if (UpdateManager.fragmentsSupported().booleanValue() && UpdateManager.runsOnTablet(activity).booleanValue())
                    {
                        showUpdateFragment(updateInfo);
                        return;
                    } else
                    {
                        startUpdateIntent(updateInfo, Boolean.valueOf(false));
                        return;
                    }
                }

            
            {
                this$0 = CheckUpdateTask.this;
                updateInfo = jsonarray;
                super();
            }
            });
            builder.create().show();
            return;
        } else
        {
            Toast.makeText(activity, R.string.update_mandatory_toast, 1).show();
            startUpdateIntent(updateInfo, Boolean.valueOf(true));
            return;
        }
    }

    private void showUpdateFragment(JSONArray jsonarray)
    {
        FragmentTransaction fragmenttransaction = activity.getFragmentManager().beginTransaction();
        fragmenttransaction.setTransition(4097);
        Object obj = activity.getFragmentManager().findFragmentByTag("hockey_update_dialog");
        if (obj != null)
        {
            fragmenttransaction.remove(((android.app.Fragment) (obj)));
        }
        fragmenttransaction.addToBackStack(null);
        obj = net/hockeyapp/android/UpdateFragment;
        if (listener != null)
        {
            obj = listener.getUpdateFragmentClass();
        }
        try
        {
            ((DialogFragment)((Class) (obj)).getMethod("newInstance", new Class[] {
                org/json/JSONArray, java/lang/String
            }).invoke(null, new Object[] {
                jsonarray, getURLString("apk")
            })).show(fragmenttransaction, "hockey_update_dialog");
            return;
        }
        catch (Exception exception)
        {
            String s1 = Constants.TAG;
            exception.printStackTrace();
            String s = Constants.TAG;
            startUpdateIntent(jsonarray, Boolean.valueOf(false));
            return;
        }
    }

    private void startUpdateIntent(JSONArray jsonarray, Boolean boolean1)
    {
        Object obj = net/hockeyapp/android/UpdateActivity;
        if (listener != null)
        {
            obj = listener.getUpdateActivityClass();
        }
        Intent intent = new Intent();
        intent.setClass(activity, ((Class) (obj)));
        intent.putExtra("json", jsonarray.toString());
        intent.putExtra("url", getURLString("apk"));
        activity.startActivity(intent);
        if (boolean1.booleanValue())
        {
            activity.finish();
        }
        cleanUp();
    }

    public void attach(Activity activity1)
    {
        activity = activity1;
        Constants.loadFromContext(activity1);
    }

    public void detach()
    {
        activity = null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient JSONArray doInBackground(String as[])
    {
        int i;
        i = getVersionCode();
        as = new JSONArray(VersionCache.getVersionInfo(activity));
        if (getCachingEnabled() && findNewVersion(as, i))
        {
            return as;
        }
        boolean flag;
        as = (new URL(getURLString("json"))).openConnection();
        as.addRequestProperty("User-Agent", "Hockey/Android");
        as.setRequestProperty("connection", "close");
        as.connect();
        as = new BufferedInputStream(as.getInputStream());
        String s = convertStreamToString(as);
        as.close();
        as = new JSONArray(s);
        flag = findNewVersion(as, i);
        if (flag) goto _L2; else goto _L1
_L1:
        return null;
        as;
        as.printStackTrace();
        if (true) goto _L1; else goto _L2
_L2:
        return as;
    }

    protected boolean getCachingEnabled()
    {
        return true;
    }

    protected String getURLString(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(urlString);
        stringbuilder.append("api/2/apps/");
        String s1;
        if (appIdentifier != null)
        {
            s1 = appIdentifier;
        } else
        {
            s1 = activity.getPackageName();
        }
        stringbuilder.append(s1);
        stringbuilder.append((new StringBuilder("?format=")).append(s).toString());
        if (android.provider.Settings.Secure.getString(activity.getContentResolver(), "android_id") != null)
        {
            stringbuilder.append((new StringBuilder("&udid=")).append(URLEncoder.encode(android.provider.Settings.Secure.getString(activity.getContentResolver(), "android_id"))).toString());
        }
        stringbuilder.append("&os=Android");
        stringbuilder.append((new StringBuilder("&os_version=")).append(URLEncoder.encode(Constants.ANDROID_VERSION)).toString());
        stringbuilder.append((new StringBuilder("&device=")).append(URLEncoder.encode(Constants.PHONE_MODEL)).toString());
        stringbuilder.append((new StringBuilder("&oem=")).append(URLEncoder.encode(Constants.PHONE_MANUFACTURER)).toString());
        stringbuilder.append((new StringBuilder("&app_version=")).append(URLEncoder.encode(Constants.APP_VERSION)).toString());
        return stringbuilder.toString();
    }

    protected int getVersionCode()
    {
        int i;
        try
        {
            i = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return 0;
        }
        return i;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONArray)obj);
    }

    protected void onPostExecute(JSONArray jsonarray)
    {
        if (jsonarray != null)
        {
            if (listener != null)
            {
                listener.onUpdateAvailable();
            }
            showDialog(jsonarray);
        } else
        if (listener != null)
        {
            listener.onNoUpdateAvailable();
            return;
        }
    }




}
