// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class fyb extends BaseAdapter
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    public com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification a[];
    private Context b;
    private boolean c;
    private NotificationSettingsFragment d;

    public fyb(NotificationSettingsFragment notificationsettingsfragment, Context context)
    {
        d = notificationsettingsfragment;
        super();
        b = context;
    }

    public final void a(Collection collection)
    {
        a = (com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification[])collection.toArray(new com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification[collection.size()]);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.length;
        }
    }

    public final volatile Object getItem(int i)
    {
        return a[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return a[i].d.ordinal();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = true;
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.b(b, viewgroup);
            view.a(new SwitchCompat(b));
            view.e(true);
            ((SwitchCompat)view.x()).setOnCheckedChangeListener(this);
        }
        viewgroup = a[i];
        c = true;
        ((dhw)view.u()).a(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (viewgroup)).b);
        SwitchCompat switchcompat = (SwitchCompat)view.x();
        if (((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (viewgroup)).c == 0)
        {
            flag = false;
        }
        switchcompat.setChecked(flag);
        view.x().setTag(viewgroup);
        c = false;
        return view.v();
    }

    public final int getViewTypeCount()
    {
        return com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification.Type.values().length;
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (c)
        {
            return;
        }
        compoundbutton = (com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification)compoundbutton.getTag();
        NotificationSettingsFragment notificationsettingsfragment = d;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        compoundbutton.c = i;
        HashMap hashmap;
        switch (com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment._cls5.a[((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).d.ordinal()])
        {
        default:
            Assertion.a("Unsupported notification type");
            return;

        case 1: // '\001'
            ContentValues contentvalues = new ContentValues();
            contentvalues.put(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).a, Integer.valueOf(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).c));
            notificationsettingsfragment.k().getContentResolver().update(dtx.a, contentvalues, null, null);
            return;

        case 2: // '\002'
            hashmap = new HashMap();
            break;
        }
        hashmap.put(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).a, Integer.toString(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).c));
        Uri uri = notificationsettingsfragment.a.buildUpon().appendQueryParameter(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).a, Integer.toString(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).c)).build();
        ((dmj)dmz.a(dmj)).a(uri.toString()).a("", hashmap, notificationsettingsfragment.Y);
        notificationsettingsfragment.b.add(((com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment.Notification) (compoundbutton)).a);
    }
}
