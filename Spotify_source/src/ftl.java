// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ftl extends BaseAdapter
{

    private Context a;
    private List b;

    public ftl(Context context, Intent intent)
    {
        a = context;
        b = a(context, intent);
    }

    private static List a(Context context, Intent intent)
    {
        intent = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = intent.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo2 = (ResolveInfo)iterator.next();
            if ("com.facebook.katana".equals(resolveinfo2.activityInfo.packageName))
            {
                arraylist.add(resolveinfo2);
            }
        } while (true);
        new ggg(context);
        context = intent.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)context.next();
            if ("com.twitter.android".equals(resolveinfo.activityInfo.packageName))
            {
                arraylist.add(resolveinfo);
            }
        } while (true);
        context = intent.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo1 = (ResolveInfo)context.next();
            if ("com.google.android.gm".equals(resolveinfo1.activityInfo.packageName))
            {
                arraylist.add(resolveinfo1);
            }
        } while (true);
        intent.removeAll(arraylist);
        arraylist.addAll(intent);
        return arraylist;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.c(a, viewgroup);
        }
        view.e(true);
        viewgroup = (ResolveInfo)b.get(i);
        PackageManager packagemanager = a.getPackageManager();
        ((dhx)view.u()).a(viewgroup.loadLabel(packagemanager));
        ((dhx)view.u()).d().setImageDrawable(viewgroup.loadIcon(packagemanager));
        return view.v();
    }
}
