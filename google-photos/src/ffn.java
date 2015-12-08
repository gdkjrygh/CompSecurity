// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;

public final class ffn
    implements android.widget.AdapterView.OnItemClickListener
{

    private DrawerMenuFragment a;

    public ffn(DrawerMenuFragment drawermenufragment)
    {
        a = drawermenufragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mry.a(view, 4);
        if (DrawerMenuFragment.e(a).a(i) == ffh.a)
        {
            DrawerMenuFragment.a(a, DrawerMenuFragment.e(a).b(i));
            return;
        } else
        {
            DrawerMenuFragment.a(a, DrawerMenuFragment.e(a).c(i));
            return;
        }
    }
}
