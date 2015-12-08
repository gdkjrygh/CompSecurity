// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import b;
import java.util.ArrayList;
import java.util.List;
import nzw;
import oai;
import oaj;
import oam;
import oas;

public final class PreferenceScreen extends oai
    implements android.content.DialogInterface.OnDismissListener, android.widget.AdapterView.OnItemClickListener
{

    private ListAdapter c;
    private Dialog d;

    public PreferenceScreen(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, b.HN);
    }

    private void c(Bundle bundle)
    {
        Object obj = super.g;
        ListView listview = new ListView(((Context) (obj)));
        a(listview);
        CharSequence charsequence = super.m;
        int i;
        if (TextUtils.isEmpty(charsequence))
        {
            i = 0x1030006;
        } else
        {
            i = 0x1030005;
        }
        obj = new Dialog(((Context) (obj)), i);
        d = ((Dialog) (obj));
        ((Dialog) (obj)).setContentView(listview);
        if (!TextUtils.isEmpty(charsequence))
        {
            ((Dialog) (obj)).setTitle(charsequence);
        }
        ((Dialog) (obj)).setOnDismissListener(this);
        if (bundle != null)
        {
            ((Dialog) (obj)).onRestoreInstanceState(bundle);
        }
        synchronized (super.h)
        {
            if (((oam) (bundle)).f == null)
            {
                bundle.f = new ArrayList();
            }
            ((oam) (bundle)).f.add(obj);
        }
        ((Dialog) (obj)).show();
        return;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ListAdapter l()
    {
        if (c == null)
        {
            c = new oaj(this);
        }
        return c;
    }

    protected final void a()
    {
        if (super.o != null || c() == 0)
        {
            return;
        } else
        {
            c(null);
            return;
        }
    }

    protected final void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(oas))
        {
            super.a(parcelable);
        } else
        {
            parcelable = (oas)parcelable;
            super.a(parcelable.getSuperState());
            if (((oas) (parcelable)).a)
            {
                c(((oas) (parcelable)).b);
                return;
            }
        }
    }

    public final void a(ListView listview)
    {
        listview.setOnItemClickListener(this);
        listview.setAdapter(l());
        i();
    }

    protected final Parcelable d()
    {
        Object obj = super.d();
        Dialog dialog = d;
        if (dialog == null || !dialog.isShowing())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new oas(((Parcelable) (obj)));
            obj.a = true;
            obj.b = dialog.onSaveInstanceState();
            return ((Parcelable) (obj));
        }
    }

    protected final boolean k()
    {
        return false;
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
label0:
        {
            d = null;
            synchronized (super.h)
            {
                if (oam1.f != null)
                {
                    break label0;
                }
            }
            return;
        }
        oam1.f.remove(dialoginterface);
        oam1;
        JVM INSTR monitorexit ;
        return;
        dialoginterface;
        oam1;
        JVM INSTR monitorexit ;
        throw dialoginterface;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        adapterview = ((AdapterView) (l().getItem(i)));
        if (!(adapterview instanceof nzw))
        {
            return;
        } else
        {
            ((nzw)adapterview).a(this);
            return;
        }
    }
}
