// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;

public final class ffm
    implements android.widget.AdapterView.OnItemClickListener
{

    private DrawerMenuFragment a;

    public ffm(DrawerMenuFragment drawermenufragment)
    {
        a = drawermenufragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mry.a(view, 4);
        adapterview = ((ffy)adapterview.getAdapter()).a(i);
        DrawerMenuFragment.a(a, adapterview, DrawerMenuFragment.c(a));
        DrawerMenuFragment.d(a).ae_();
    }
}
