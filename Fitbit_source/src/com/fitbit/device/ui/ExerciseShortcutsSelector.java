// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.util.bh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseShortcutsSelector_, ExerciseOptionsActivity

public class ExerciseShortcutsSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    public static interface b
    {

        public abstract void a(ExerciseShortcutsSelector exerciseshortcutsselector);
    }


    public static final String a = "ExerciseShortcutsSelector.ADD_EXERCISE_SHORTCUTS";
    private static final String i = "ExerciseSelector";
    protected List b;
    protected ListView c;
    protected TextView d;
    protected String e;
    protected int f;
    int g;
    protected b h;
    private c j;

    public ExerciseShortcutsSelector()
    {
        b = new ArrayList();
        g = 0;
    }

    public static ExerciseShortcutsSelector a(List list, b b1, int k, String s)
    {
        s = ExerciseShortcutsSelector_.e().a(s).a(k).a();
        s.a(list);
        s.a(b1);
        return s;
    }

    static boolean a(ExerciseShortcutsSelector exerciseshortcutsselector)
    {
        return exerciseshortcutsselector.f();
    }

    private void e()
    {
        if (getDialog() != null)
        {
            Button button = ((AlertDialog)getDialog()).getButton(-1);
            int k;
            boolean flag;
            if (g > 0)
            {
                k = getResources().getColor(0x7f0f0111);
            } else
            {
                k = 0xff888888;
            }
            button.setTextColor(k);
            if (g > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            button.setEnabled(flag);
        }
        d.setText(ExerciseOptionsActivity.a(getActivity(), f));
    }

    private boolean f()
    {
        return f < 7;
    }

    protected void a()
    {
        e();
    }

    public void a(b b1)
    {
        h = b1;
    }

    public void a(List list)
    {
    /* block-local class not found */
    class a {}

        ExerciseOption exerciseoption;
        for (list = list.iterator(); list.hasNext(); b.add(new a(exerciseoption)))
        {
            exerciseoption = (ExerciseOption)list.next();
        }

    }

    protected void b()
    {
        if (h != null)
        {
            h.a(this);
        }
        dismiss();
    }

    public b c()
    {
        return h;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList(b.size());
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.b)
            {
                arraylist.add(a1.a);
            }
        } while (true);
        return arraylist;
    }

    public void onClick(DialogInterface dialoginterface, int k)
    {
        if (isResumed())
        {
            if (k == -1 && h != null)
            {
                h.a(this);
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getActivity().getLayoutInflater().inflate(0x7f040156, null);
        c = (ListView)bundle.findViewById(0x7f110086);
        Object obj = View.inflate(getActivity(), 0x7f040119, null);
        c.addHeaderView(((View) (obj)));
        d = (TextView)((View) (obj)).findViewById(0x7f110395);
        e();
    /* block-local class not found */
    class c {}

        j = new c(getActivity(), b);
        c.setAdapter(j);
        c.setChoiceMode(2);
        c.setOnItemClickListener(this);
        obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setView(bundle);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(bh.a(getActivity(), 0x7f08019f, new String[] {
            e.toUpperCase()
        }), this);
        ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f0801a0, this);
        return ((android.app.AlertDialog.Builder) (obj)).create();
    }

    public void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
        if (l < 0L)
        {
            return;
        }
        adapterview = (a)j.getItem((int)l);
        if (!((a) (adapterview)).b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            if (f())
            {
                adapterview.b = true;
                f = f + 1;
                g = g + 1;
            }
        } else
        {
            adapterview.b = false;
            f = f - 1;
            g = g - 1;
        }
        j.notifyDataSetChanged();
        e();
    }

    public void onStart()
    {
        super.onStart();
        e();
    }
}
