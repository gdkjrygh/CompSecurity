// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public class fzu extends fzv
    implements android.view.View.OnCreateContextMenuListener
{

    public final Flags m;
    public ListView n;
    public ListAdapter o;

    public fzu(Context context, ViewGroup viewgroup, Flags flags)
    {
        super(context);
        m = flags;
        context = (ViewGroup)c().inflate(0x7f0300d3, viewgroup, false);
        a((ListView)context.findViewById(0x102000a));
        b(context);
    }

    public void a(View view, int i, long l)
    {
    }

    public final void a(ListView listview)
    {
        n = listview;
        n.setOnCreateContextMenuListener(this);
        n.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private fzu a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                a.a(view, i, l);
            }

            
            {
                a = fzu.this;
                super();
            }
        });
        n.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            private fzu a;

            public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
            {
                return a.a(view);
            }

            
            {
                a = fzu.this;
                super();
            }
        });
        n.getId();
    }

    public boolean a(View view)
    {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    }
}
