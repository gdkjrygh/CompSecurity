// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.fbservice.ops.c;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.i;
import com.facebook.o;
import com.facebook.orca.f.k;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.widget.listview.EmptyListViewItem;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threadlist:
//            af, al, n, o, 
//            p

public class m extends Dialog
{

    public static final String a = new String("NEW_THREAD");
    private final af b;
    private final k c;
    private final c d;
    private final a e;
    private String f;
    private ListView g;
    private EmptyListViewItem h;
    private ThreadsCollection i;
    private p j;
    private String k;

    public m(Context context, af af1, k k1, c c1, a a1)
    {
        super(context);
        i = ThreadsCollection.a();
        b = af1;
        c = k1;
        d = c1;
        e = a1;
    }

    static c a(m m1)
    {
        return m1.d;
    }

    private void a()
    {
        FolderName foldername = b();
        if (c.a(foldername))
        {
            i = c.b(foldername);
            c();
            return;
        } else
        {
            a(s.STALE_DATA_OKAY);
            return;
        }
    }

    private void a(int l)
    {
        Object obj = b.getItem(l);
        if (obj != af.b) goto _L2; else goto _L1
_L1:
        k = a;
_L4:
        dismiss();
        return;
_L2:
        if (obj instanceof ThreadSummary)
        {
            k = ((ThreadSummary)obj).a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(OperationResult operationresult)
    {
        i = ((FetchThreadListResult)operationresult.i()).b();
        c();
    }

    private void a(ServiceException serviceexception)
    {
        h.setMessage(null);
        h.a(false);
    }

    private void a(s s1)
    {
        if (d.b())
        {
            return;
        } else
        {
            Object obj = b();
            s1 = FetchThreadListParams.newBuilder().a(s1).a(((FolderName) (obj))).f();
            obj = new Bundle();
            ((Bundle) (obj)).putParcelable("fetchThreadListParams", s1);
            d.a(aq.i, ((Bundle) (obj)));
            h.setMessage(getContext().getResources().getString(o.thread_list_loading));
            h.a(true);
            return;
        }
    }

    static void a(m m1, int l)
    {
        m1.a(l);
    }

    static void a(m m1, OperationResult operationresult)
    {
        m1.a(operationresult);
    }

    static void a(m m1, ServiceException serviceexception)
    {
        m1.a(serviceexception);
    }

    private FolderName b()
    {
        return FolderName.a((FolderType)e.b());
    }

    private void c()
    {
        int l = 0;
        b.a(i.b());
        h.setMessage(getContext().getResources().getString(o.thread_list_no_threads));
        h.a(false);
        EmptyListViewItem emptylistviewitem = h;
        if (!i.d())
        {
            l = 8;
        }
        emptylistviewitem.setVisibility(l);
    }

    public void a(p p1)
    {
        j = p1;
    }

    public void a(String s1)
    {
        f = s1;
    }

    public void b(String s1)
    {
        b.a(s1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(com.facebook.k.orca_thread_chooser_dialog);
        ((TextView)findViewById(i.title)).setText(f);
        g = (ListView)findViewById(i.thread_list);
        h = (EmptyListViewItem)findViewById(i.threadlist_empty_item);
        b.a(al.CHOOSE_DIALOG);
        g.setAdapter(b);
        g.setItemsCanFocus(true);
        g.setOnItemClickListener(new n(this));
        d.a(new com.facebook.orca.threadlist.o(this));
        a();
    }

    protected void onStop()
    {
        super.onStop();
        d.a(null);
        d.a();
        if (j != null)
        {
            j.a(k);
        }
    }

}
