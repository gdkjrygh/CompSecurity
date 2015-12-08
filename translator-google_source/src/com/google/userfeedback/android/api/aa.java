// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.userfeedback.android.api:
//            z, i, ShowStringListActivity, m, 
//            ShowTextActivity, y, ac, g, 
//            h, ah, l, ab

public final class aa extends BaseAdapter
{

    private static int c = 1;
    List a;
    Context b;

    aa(Context context, z z1)
    {
        b = context;
        a = new ArrayList();
        if (z1.a != null && z1.a.length() > 0)
        {
            a(z1, "description", i.gf_error_report_description);
        }
        a(z1, "packageName", i.gf_error_report_package_name);
        a(z1, "packageVersion", i.gf_error_report_package_version);
        a(z1, "packageVersionName", i.gf_error_report_package_version_name);
        a(z1, "installerPackageName", i.gf_error_report_installer_package_name);
        a(z1, "processName", i.gf_error_report_process_name);
        a(z1, "timestamp", i.gf_error_report_time, 1);
        a(z1, "isSystemApp", i.gf_error_report_system_app, 0);
        a(i.gf_network_data);
        a(z1, "networkName", i.gf_network_name);
        a(i.gf_error_report_system);
        a(z1, "device", i.gf_error_report_device);
        a(z1, "buildId", i.gf_error_report_build_id);
        a(z1, "buildType", i.gf_error_report_build_type);
        a(z1, "model", i.gf_error_report_model);
        a(z1, "product", i.gf_error_report_product);
        a(z1, "sdkInt", i.gf_error_report_sdk_version);
        a(z1, "release", i.gf_error_report_release);
        a(z1, "incremental", i.gf_error_report_incremental);
        a(z1, "codename", i.gf_error_report_codename);
        a(z1, "board", i.gf_error_report_board);
        a(z1, "brand", i.gf_error_report_brand);
        a(z1, "numGoogleAccounts", i.gf_error_report_user_accounts);
        if (z1.o != null && !z1.o.isEmpty())
        {
            a(z1, "installedPackages", i.gf_error_report_installed_packages, com/google/userfeedback/android/api/ShowStringListActivity);
        }
        if (z1.p != null && !z1.p.isEmpty())
        {
            a(z1, "runningApplications", i.gf_error_report_running_apps, com/google/userfeedback/android/api/ShowStringListActivity);
        }
        if (z1.q != null && m.c.e)
        {
            a(z1, "systemLog", i.gf_error_report_system_log, com/google/userfeedback/android/api/ShowTextActivity);
        }
        if (z1.I != null)
        {
            context = z1.I;
            a(i.gf_crash_header);
            a(context, "exceptionClassName", i.gf_exception_class_name);
            a(context, "throwFileName", i.gf_throw_file_name);
            a(context, "throwLineNumber", i.gf_throw_line_number);
            a(context, "throwClassName", i.gf_throw_class_name);
            a(context, "throwMethodName", i.gf_throw_method_name);
            if (((y) (context)).g != null)
            {
                a(context, "exceptionMessage", i.gf_exception_message);
            }
            a(context, "stackTrace", i.gf_stack_trace, com/google/userfeedback/android/api/ShowTextActivity);
        }
        if (z1.u != null && m.c.d)
        {
            a(i.gf_screenshot_preview);
            a(z1, "screenshot", i.gf_screenshot_preview);
        }
    }

    static Bitmap a(byte abyte0[], int j, int k)
    {
        android.graphics.BitmapFactory.Options options;
        int i1;
label0:
        {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
            if (j != 0)
            {
                i1 = k;
                if (k != 0)
                {
                    break label0;
                }
            }
            j = options.outWidth / 2;
            i1 = options.outHeight / 2;
        }
        k = options.outHeight;
        int j1 = options.outWidth;
        if (k > i1 || j1 > j)
        {
            k = Math.round((float)k / (float)i1);
            j = Math.round((float)j1 / (float)j);
            if (k > j)
            {
                j = k;
            }
            c = j;
        }
        options.inSampleSize = c;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
    }

    private void a(int j)
    {
        a.add(new ac(j));
    }

    private void a(Object obj, String s, int j)
    {
        a(obj, s, j, null, 0);
    }

    private void a(Object obj, String s, int j, int k)
    {
        a(obj, s, j, null, k);
    }

    private void a(Object obj, String s, int j, Class class1)
    {
        a(obj, s, j, class1, 0);
    }

    private void a(Object obj, String s, int j, Class class1, int k)
    {
        s = obj.getClass().getField(s);
        a.add(new ac(j, obj, s, class1, k));
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int j)
    {
        return a.get(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        ac ac1;
        LayoutInflater layoutinflater;
        ac1 = (ac)a.get(j);
        layoutinflater = (LayoutInflater)b.getSystemService("layout_inflater");
        if (ac1.b())
        {
            if (view == null || view.getId() != g.gf_section_header_row)
            {
                viewgroup = layoutinflater.inflate(h.gf_section_header_row, viewgroup, false);
                l l1 = m.c.a.o;
                view = viewgroup;
                if (l1 != null)
                {
                    if (l1.a() < 0)
                    {
                        viewgroup.setBackgroundDrawable(null);
                    } else
                    {
                        viewgroup.setBackgroundDrawable(viewgroup.getResources().getDrawable(l1.a()));
                    }
                    view = viewgroup;
                    if (l1.c != 0)
                    {
                        ((TextView)viewgroup).setTextColor(viewgroup.getResources().getColor(l1.c));
                        view = viewgroup;
                    }
                }
            }
            ((TextView)view).setText(ac1.a);
            return view;
        }
        if (!ac1.c()) goto _L2; else goto _L1
_L1:
        View view1;
label0:
        {
            if (view != null)
            {
                view1 = view;
                if (view.getId() == g.gf_expandable_row)
                {
                    break label0;
                }
            }
            view1 = layoutinflater.inflate(h.gf_expandable_row, viewgroup, false);
        }
_L10:
        if (!ac1.a())
        {
            ((TextView)view1.findViewById(g.gf_label)).setText(ac1.a);
        } else
        {
            (new ab(this, (ImageView)view1.findViewById(g.gf_feedback_screenshot_view))).execute(new ac[] {
                ac1
            });
        }
        if (ac1.d != null) goto _L4; else goto _L3
_L3:
        view = (TextView)view1.findViewById(g.gf_value);
        j = ac1.e;
        j;
        JVM INSTR tableswitch 0 1: default 272
    //                   0 382
    //                   1 501;
           goto _L5 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_501;
_L4:
        return view1;
_L2:
        if (!ac1.a())
        {
            break MISSING_BLOCK_LABEL_315;
        }
        if (view == null) goto _L9; else goto _L8
_L8:
        view1 = view;
        if (view.getId() == g.gf_screenshot_row) goto _L10; else goto _L9
_L9:
        view1 = layoutinflater.inflate(h.gf_screenshot_row, viewgroup, false);
          goto _L10
        if (view == null) goto _L12; else goto _L11
_L11:
        view1 = view;
        if (view.getId() == g.gf_label_value_row) goto _L10; else goto _L12
_L12:
        view1 = layoutinflater.inflate(h.gf_label_value_row, viewgroup, false);
          goto _L10
_L6:
label1:
        {
            if (!ac1.c.getType().equals(Integer.TYPE))
            {
                break label1;
            }
            view.setText(ac1.c.get(ac1.b).toString());
        }
          goto _L4
        if (!ac1.c.getType().equals(java/lang/String)) goto _L14; else goto _L13
_L13:
        view.setText((String)ac1.c.get(ac1.b));
          goto _L4
_L14:
        if (!ac1.c.getType().equals(Boolean.TYPE)) goto _L4; else goto _L15
_L15:
        view.setText(ac1.c.get(ac1.b).toString());
          goto _L4
        try
        {
            viewgroup = new Date(ac1.c.getLong(ac1.b));
            view.setText(DateFormat.getDateInstance(0).format(viewgroup));
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
          goto _L4
    }

    public final boolean isEnabled(int j)
    {
        return !((ac)a.get(j)).b();
    }

}
