// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.app.ListActivity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.share:
//            AppInfo

final class LoadPackagesAsyncTask extends AsyncTask
{

    private static final String PKG_PREFIX_BLACKLIST[] = {
        "com.android.", "android", "com.google.android.", "com.htc"
    };
    private static final String PKG_PREFIX_WHITELIST[] = {
        "com.google.android.apps."
    };
    private final ListActivity activity;

    LoadPackagesAsyncTask(ListActivity listactivity)
    {
        activity = listactivity;
    }

    private static boolean isHidden(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        String as[];
        int i;
        int j;
        as = PKG_PREFIX_WHITELIST;
        j = as.length;
        i = 0;
_L5:
        if (i < j) goto _L4; else goto _L3
_L3:
        as = PKG_PREFIX_BLACKLIST;
        j = as.length;
        i = 0;
_L7:
        if (i >= j)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.startsWith(as[i]))
        {
            return false;
        }
        i++;
          goto _L5
        if (s.startsWith(as[i])) goto _L1; else goto _L6
_L6:
        i++;
          goto _L7
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient List doInBackground(Void avoid[])
    {
        avoid = new ArrayList();
        PackageManager packagemanager = activity.getPackageManager();
        Iterator iterator = packagemanager.getInstalledApplications(0).iterator();
        do
        {
            String s;
            CharSequence charsequence;
            Object obj;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        Collections.sort(avoid);
                        return avoid;
                    }
                    obj = (ApplicationInfo)iterator.next();
                    s = ((ApplicationInfo) (obj)).packageName;
                } while (isHidden(s));
                charsequence = ((ApplicationInfo) (obj)).loadLabel(packagemanager);
                obj = ((ApplicationInfo) (obj)).loadIcon(packagemanager);
            } while (charsequence == null);
            avoid.add(new AppInfo(s, charsequence.toString(), ((android.graphics.drawable.Drawable) (obj))));
        } while (true);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        list = new ArrayAdapter(com.google.zxing.client.android.R.layout.app_picker_list_item, com.google.zxing.client.android.R.id.app_picker_list_item_label, list, list) {

            final LoadPackagesAsyncTask this$0;
            private final List val$results;

            public View getView(int i, View view, ViewGroup viewgroup)
            {
                view = super.getView(i, view, viewgroup);
                viewgroup = ((AppInfo)results.get(i)).getIcon();
                if (viewgroup != null)
                {
                    ((ImageView)view.findViewById(com.google.zxing.client.android.R.id.app_picker_list_item_icon)).setImageDrawable(viewgroup);
                }
                return view;
            }

            
            {
                this$0 = LoadPackagesAsyncTask.this;
                results = list1;
                super(final_context, i, j, list);
            }
        };
        activity.setListAdapter(list);
    }

}
