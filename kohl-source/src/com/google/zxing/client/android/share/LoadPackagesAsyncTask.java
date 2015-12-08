// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.app.ListActivity;
import android.content.Context;
import android.content.pm.PackageItemInfo;
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
        String as[] = PKG_PREFIX_WHITELIST;
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            if (s.startsWith(as[i]))
            {
                return false;
            }
        }

        as = PKG_PREFIX_BLACKLIST;
        k = as.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                if (s.startsWith(as[j]))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    protected volatile Object doInBackground(Object aobj[])
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
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (PackageItemInfo)iterator.next();
            String s = ((PackageItemInfo) (obj)).packageName;
            if (!isHidden(s))
            {
                CharSequence charsequence = ((PackageItemInfo) (obj)).loadLabel(packagemanager);
                obj = ((PackageItemInfo) (obj)).loadIcon(packagemanager);
                if (charsequence != null)
                {
                    avoid.add(new AppInfo(s, charsequence.toString(), ((android.graphics.drawable.Drawable) (obj))));
                }
            }
        } while (true);
        Collections.sort(avoid);
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        list = new ArrayAdapter(com.google.zxing.client.android.R.layout.app_picker_list_item, com.google.zxing.client.android.R.id.app_picker_list_item_label, list, list) {

            final LoadPackagesAsyncTask this$0;
            final List val$results;

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
