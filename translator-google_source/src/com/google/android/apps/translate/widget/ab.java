// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.l;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.languages.Language;

// Referenced classes of package com.google.android.apps.translate.widget:
//            af, LangSpinner, PinButton

final class ab extends ArrayAdapter
{

    private boolean a;

    public ab(Context context)
    {
        super(context, o.lang_picker_item, 0x1020014);
        a = false;
    }

    static boolean a(ab ab1, boolean flag)
    {
        ab1.a = flag;
        return flag;
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getItemViewType(int i)
    {
        return getItem(i) != null ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Language language;
        Object obj;
        boolean flag;
        language = (Language)getItem(i);
        if (language == null)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = LayoutInflater.from(getContext()).inflate(o.lang_picker_divider, null);
            }
            return viewgroup;
        }
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(o.lang_picker_item, null);
            viewgroup = new af(view, this);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (af)view.getTag();
        }
        af.a(viewgroup).setText(language.getLongName());
        af.a(viewgroup, language);
        flag = "en".equals(language.getShortName());
        if (!a)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        obj = getContext().getResources();
        LangSpinner.a(language);
        JVM INSTR tableswitch 1 3: default 152
    //                   1 201
    //                   2 279
    //                   3 357;
           goto _L1 _L2 _L3 _L4
_L1:
        af.b(viewgroup).setVisibility(8);
        af.b(viewgroup).setLoading(false);
_L5:
        viewgroup = af.b(viewgroup);
        Context context;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setEnabled(flag);
        return view;
_L2:
        af.b(viewgroup).setVisibility(0);
        af.b(viewgroup).setImageResource(l.ic_file_download_black_24dp);
        i = ((Resources) (obj)).getColor(j.offline_pin_idle);
        af.b(viewgroup).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        af.b(viewgroup).setLoading(false);
        af.b(viewgroup).setContentDescription(getContext().getString(r.label_offline_available, new Object[] {
            language.getLongName()
        }));
          goto _L5
_L3:
        af.b(viewgroup).setVisibility(0);
        af.b(viewgroup).setImageResource(l.ic_file_download_black_24dp);
        i = ((Resources) (obj)).getColor(j.offline_pin_downloading);
        af.b(viewgroup).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        af.b(viewgroup).setLoading(true);
        af.b(viewgroup).setContentDescription(getContext().getString(r.label_offline_downloading, new Object[] {
            language.getLongName()
        }));
          goto _L5
_L4:
        af.b(viewgroup).setVisibility(0);
        af.b(viewgroup).setImageResource(l.ic_download_completed);
        i = ((Resources) (obj)).getColor(j.offline_pin_idle);
        af.b(viewgroup).setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        af.b(viewgroup).setLoading(false);
        obj = af.b(viewgroup);
        context = getContext();
        if (flag)
        {
            i = r.label_offline_installed;
        } else
        {
            i = r.label_offline_downloaded;
        }
        ((PinButton) (obj)).setContentDescription(context.getString(i, new Object[] {
            language.getLongName()
        }));
          goto _L5
        af.b(viewgroup).setVisibility(8);
        af.b(viewgroup).setLoading(false);
          goto _L5
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean isEnabled(int i)
    {
        return getItem(i) != null;
    }
}
