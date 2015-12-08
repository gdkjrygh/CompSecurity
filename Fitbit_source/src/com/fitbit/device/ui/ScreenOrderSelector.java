// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerScreen;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.e.a;
import com.mobeta.android.dslv.DragSortListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public class ScreenOrderSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private static final String b = "ScreenOrderSelector";
    protected String a;
    private Device c;
    private a d;
    private DragSortListView e;
    private TrackerSettings f;
    private List g;
    private List h;
    private com.mobeta.android.dslv.DragSortListView.h i;

    public ScreenOrderSelector()
    {
        i = new _cls1();
    }

    static TrackerSettings a(ScreenOrderSelector screenorderselector)
    {
        return screenorderselector.f;
    }

    private boolean a()
    {
        Object obj = f.a(TrackerOption.SCREEN_ORDER);
        if (!g.equals(((e) (obj)).c()))
        {
            return true;
        }
        for (obj = ((List)((e) (obj)).c()).iterator(); ((Iterator) (obj)).hasNext();)
        {
            TrackerScreen trackerscreen = (TrackerScreen)((Iterator) (obj)).next();
            if (f.a(trackerscreen) && !h.contains(trackerscreen) || !f.a(trackerscreen) && h.contains(trackerscreen))
            {
                return true;
            }
        }

        return false;
    }

    private boolean a(TrackerScreen trackerscreen)
    {
        return c.o().b(trackerscreen);
    }

    static boolean a(ScreenOrderSelector screenorderselector, TrackerScreen trackerscreen)
    {
        return screenorderselector.a(trackerscreen);
    }

    static a b(ScreenOrderSelector screenorderselector)
    {
        return screenorderselector.d;
    }

    static DragSortListView c(ScreenOrderSelector screenorderselector)
    {
        return screenorderselector.e;
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        if (isResumed())
        {
            if (j == -1 && a())
            {
                c.a(f);
                an.a().a(c, getActivity());
                ((TrackerDetailsActivity)getActivity()).c();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = an.a().a(a);
        if (c != null) goto _L2; else goto _L1
_L1:
        dismiss();
_L4:
        try
        {
            f = (TrackerSettings)c.o().clone();
            g = new ArrayList((Collection)f.a(TrackerOption.SCREEN_ORDER).c());
            h = new ArrayList();
            bundle = g.iterator();
            do
            {
                if (!bundle.hasNext())
                {
                    break;
                }
                TrackerScreen trackerscreen = (TrackerScreen)bundle.next();
                if (f.a(trackerscreen))
                {
                    h.add(trackerscreen);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.fitbit.e.a.f("ScreenOrderSelector", "Clone unsopported", bundle, new Object[0]);
        }
        return;
_L2:
        if (c.o() == null)
        {
            c.a(new TrackerSettings());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getActivity().getLayoutInflater().inflate(0x7f040148, null);
        e = (DragSortListView)bundle.findViewById(0x7f1100ef);
        Object obj = f.a(TrackerOption.SCREEN_ORDER);
    /* block-local class not found */
    class a {}

        d = new a(getActivity(), (List)((e) (obj)).c());
        e.setAdapter(d);
        e.setChoiceMode(2);
        e.a(i);
        e.setOnItemClickListener(this);
        obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setView(bundle);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f08042e, this);
        ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f0802c2, this);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f0804ed);
        return ((android.app.AlertDialog.Builder) (obj)).create();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = (TrackerScreen)adapterview.getAdapter().getItem(j);
        if (a(adapterview))
        {
            return;
        }
        TrackerSettings trackersettings = f;
        boolean flag;
        if (!f.a(adapterview))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        trackersettings.a(adapterview, flag);
        ((CheckBox)view.findViewById(0x7f1101ee)).setChecked(f.a(adapterview));
    }

    /* member class not found */
    class _cls1 {}

}
