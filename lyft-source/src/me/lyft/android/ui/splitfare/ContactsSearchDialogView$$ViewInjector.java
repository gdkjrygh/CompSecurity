// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.SearchToolbarView;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

public class _cls2.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ContactsSearchDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final ContactsSearchDialogView target, Object obj)
    {
        target.searchToolbarView = (SearchToolbarView)viewinjector.searchToolbarView((View)viewinjector.searchToolbarView(obj, 0x7f0d0148, "field 'searchToolbarView'"), 0x7f0d0148, "field 'searchToolbarView'");
        View view = (View)viewinjector.searchToolbarView(obj, 0x7f0d0149, "field 'listView' and method 'onItemClicked'");
        target.listView = (ListView)viewinjector.listView(view, 0x7f0d0149, "field 'listView'");
        ((AdapterView)view).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ContactsSearchDialogView..ViewInjector this$0;
            final ContactsSearchDialogView val$target;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                target.onItemClicked(i);
            }

            
            {
                this$0 = ContactsSearchDialogView..ViewInjector.this;
                target = contactssearchdialogview;
                super();
            }
        });
        target.emptyView = (TextView)viewinjector.emptyView((View)viewinjector.emptyView(obj, 0x7f0d014a, "field 'emptyView'"), 0x7f0d014a, "field 'emptyView'");
        ((View)viewinjector.emptyView(obj, 0x7f0d0147, "method 'dismiss'")).setOnClickListener(new DebouncingOnClickListener() {

            final ContactsSearchDialogView..ViewInjector this$0;
            final ContactsSearchDialogView val$target;

            public void doClick(View view1)
            {
                target.dismiss();
            }

            
            {
                this$0 = ContactsSearchDialogView..ViewInjector.this;
                target = contactssearchdialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((ContactsSearchDialogView)obj);
    }

    public void reset(ContactsSearchDialogView contactssearchdialogview)
    {
        contactssearchdialogview.searchToolbarView = null;
        contactssearchdialogview.listView = null;
        contactssearchdialogview.emptyView = null;
    }

    public _cls2.val.target()
    {
    }
}
