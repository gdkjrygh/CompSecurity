// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import com.pinterest.activity.task.dialog.SimpleTextDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.reporting.CrashReporting;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.base:
//            Events

public class PermissionUtil
{

    private static String CAMERA_USAGE_PERMISSIONS[] = {
        "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"
    };
    private static final int PERM_REQUEST_CODE = 1;
    public static final String READ_EXTERNAL_STORAGE = "android.permission.READ_EXTERNAL_STORAGE";
    private static Map combinedExpMap;

    public PermissionUtil()
    {
    }

    public static boolean checkPermission(Context context, String s)
    {
        return ContextCompat.checkSelfPermission(context, s) == 0;
    }

    public static void checkPermissionAsync(BaseActivity baseactivity, String s, int i, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback onrequestpermissionsresultcallback)
    {
        checkPermissionAsync(baseactivity, new String[] {
            s
        }, new int[] {
            i
        }, onrequestpermissionsresultcallback);
    }

    public static void checkPermissionAsync(final BaseActivity activity, final String dialog[], int ai[], final android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback callback)
    {
        if (ai != null && dialog.length != ai.length)
        {
            throw new IllegalArgumentException("permissions and explanationStrIds should have the same length");
        }
        Object obj = null;
        Resources resources = activity.getResources();
        LinkedList linkedlist = new LinkedList();
        int ai1[] = new int[dialog.length];
        int i = 0;
        do
        {
            StringBuilder stringbuilder;
            if (i < dialog.length)
            {
                if (ContextCompat.checkSelfPermission(activity, dialog[i]) == 0)
                {
                    ai1[i] = 0;
                    stringbuilder = ((StringBuilder) (obj));
                } else
                {
                    linkedlist.add(dialog[i]);
                    boolean flag;
                    try
                    {
                        flag = ActivityCompat.shouldShowRequestPermissionRationale(activity, dialog[i]);
                    }
                    catch (Exception exception)
                    {
                        CrashReporting.a(exception);
                        flag = false;
                    }
                    stringbuilder = ((StringBuilder) (obj));
                    if (flag)
                    {
                        stringbuilder = ((StringBuilder) (obj));
                        if (ai != null)
                        {
                            stringbuilder = ((StringBuilder) (obj));
                            if (obj == null)
                            {
                                stringbuilder = new StringBuilder();
                                stringbuilder.append(resources.getString(0x7f0703e4));
                            }
                            stringbuilder.append((new StringBuilder(" ")).append(resources.getString(ai[i])).toString());
                        }
                    }
                }
            } else
            {
                if (linkedlist.size() == 0)
                {
                    callback.onRequestPermissionsResult(1, dialog, ai1);
                    return;
                }
                final String permToRequestArray[] = new String[linkedlist.size()];
                linkedlist.toArray(permToRequestArray);
                if (obj != null)
                {
                    obj = ((StringBuilder) (obj)).toString();
                    ai = ((int []) (obj));
                    if (linkedlist.size() == dialog.length)
                    {
                        ai = ((int []) (obj));
                        if (combinedExpMap.containsKey(dialog))
                        {
                            ai = new StringBuilder();
                            ai.append(resources.getString(0x7f0703e4));
                            ai.append(" ");
                            ai.append(resources.getString(((Integer)combinedExpMap.get(dialog)).intValue()));
                            ai = ai.toString();
                        }
                    }
                    dialog = SimpleTextDialog.newInstance();
                    dialog.setText(ai);
                    dialog.setPositiveButton(0x7f070397, new _cls1());
                    dialog.addOnDismissListener(new _cls2());
                    Events.post(new DialogEvent(dialog));
                    return;
                }
                requestPermissions(activity, permToRequestArray, callback);
                return;
            }
            i++;
            obj = stringbuilder;
        } while (true);
    }

    public static boolean checkPermissions(Context context, String as[])
    {
        boolean flag = true;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            flag = checkPermission(context, as[i]) & flag;
            if (!flag)
            {
                return false;
            }
        }

        return flag;
    }

    public static String[] getCameraUsagePermissionGroup()
    {
        return CAMERA_USAGE_PERMISSIONS;
    }

    public static boolean isPermissionDeniedPermanently(Activity activity, String s)
    {
        if (checkPermission(activity, s) || ActivityCompat.shouldShowRequestPermissionRationale(activity, s))
        {
            return false;
        } else
        {
            return Preferences.persisted().getStringSet("PREF_APP_PERMISSION_REQUESTS", Collections.EMPTY_SET).contains(s);
        }
    }

    private static void requestPermissions(BaseActivity baseactivity, String as[], android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback onrequestpermissionsresultcallback)
    {
        baseactivity.setOnRequestPermissionsResultCallback(onrequestpermissionsresultcallback);
        ActivityCompat.requestPermissions(baseactivity, as, 1);
        savePermissionRequested(Arrays.asList(as));
    }

    private static void savePermissionRequested(Collection collection)
    {
        PreferencesManager preferencesmanager = Preferences.persisted();
        Set set = preferencesmanager.getStringSet("PREF_APP_PERMISSION_REQUESTS", new HashSet());
        set.addAll(collection);
        preferencesmanager.set("PREF_APP_PERMISSION_REQUESTS", set);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        combinedExpMap = hashmap;
        hashmap.put(CAMERA_USAGE_PERMISSIONS, Integer.valueOf(0x7f0700ab));
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SimpleTextDialog val$dialog;

        public final void onClick(View view)
        {
            dialog.dismiss();
        }

        _cls1()
        {
            dialog = simpletextdialog;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
    {

        final BaseActivity val$activity;
        final android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback val$callback;
        final String val$permToRequestArray[];

        public final void onDismiss(BaseDialog basedialog)
        {
            PermissionUtil.requestPermissions(activity, permToRequestArray, callback);
        }

        _cls2()
        {
            activity = baseactivity;
            permToRequestArray = as;
            callback = onrequestpermissionsresultcallback;
            super();
        }
    }

}
