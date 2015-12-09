// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.SpeechService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;

public class MultiChoiceDialogFragment extends DialogFragment
{
    private static class a extends com.fitbit.ui.a.c
        implements android.view.View.OnClickListener
    {

        private void a(View view)
        {
            com.fitbit.savedstate.MobileRunSavedState.AudioCue audiocue;
            Resources resources;
            com.fitbit.runtrack.b b1;
            com.fitbit.data.domain.Length.LengthUnits lengthunits;
            audiocue = (com.fitbit.savedstate.MobileRunSavedState.AudioCue)view.getTag();
            resources = view.getResources();
            b1 = new com.fitbit.runtrack.b(EnumSet.of(audiocue));
            lengthunits = an.a().b().t();
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.fitbit.savedstate.MobileRunSavedState.AudioCue.values().length];
                    try
                    {
                        a[com.fitbit.savedstate.MobileRunSavedState.AudioCue.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.fitbit.savedstate.MobileRunSavedState.AudioCue.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.fitbit.savedstate.MobileRunSavedState.AudioCue.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.fitbit.savedstate.MobileRunSavedState.AudioCue.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.fitbit.savedstate.MobileRunSavedState.AudioCue.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1.a[audiocue.ordinal()];
            JVM INSTR tableswitch 1 5: default 80
        //                       1 110
        //                       2 158
        //                       3 202
        //                       4 253
        //                       5 297;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            String s = b1.a(resources);
            view.getContext().startService(SpeechService.a(view.getContext(), Locale.getDefault(), s, 3, 0.8F));
            return;
_L2:
            int i;
            if (lengthunits.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
            {
                i = 0x7f100001;
            } else
            {
                i = 0x7f100000;
            }
            b1.a(new Length(resources.getFraction(i, 1, 1), lengthunits));
            continue; /* Loop/switch isn't completed */
_L3:
            int j;
            if (lengthunits.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
            {
                j = 0x7f0e000a;
            } else
            {
                j = 0x7f0e0009;
            }
            b1.a(new Duration(resources.getInteger(j)));
            continue; /* Loop/switch isn't completed */
_L4:
            int k;
            if (lengthunits.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
            {
                k = 0x7f0e0006;
            } else
            {
                k = 0x7f0e0005;
            }
            b1.b(new Duration(resources.getInteger(k)));
            b1.a(lengthunits);
            continue; /* Loop/switch isn't completed */
_L5:
            int l;
            if (lengthunits.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
            {
                l = 0x7f0e000c;
            } else
            {
                l = 0x7f0e000b;
            }
            b1.c(new Duration(resources.getInteger(l)));
            continue; /* Loop/switch isn't completed */
_L6:
            int i1;
            if (lengthunits.equals(com.fitbit.data.domain.Length.LengthUnits.MILES))
            {
                i1 = 0x7f0e0008;
            } else
            {
                i1 = 0x7f0e0007;
            }
            b1.a(resources.getInteger(i1));
            if (true) goto _L1; else goto _L7
_L7:
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040139, viewgroup, false);
            }
            viewgroup = (CheckedTextView)view1.findViewById(0x1020014);
            view = (b)getItem(i);
            viewgroup.setText(((b) (view)).a);
            viewgroup.setChecked(((b) (view)).c.booleanValue());
            viewgroup.setTag(Integer.valueOf(i));
            viewgroup.setOnClickListener(this);
            viewgroup = view1.findViewById(0x7f1103be);
            viewgroup.setTag(((b) (view)).b);
            viewgroup.setOnClickListener(this);
            return view1;
        }

        public void onClick(View view)
        {
            if (view.getId() != 0x7f1103be) goto _L2; else goto _L1
_L1:
            a(view);
_L5:
            return;
_L2:
            CheckedTextView checkedtextview;
            int i;
            int j;
            int k;
            checkedtextview = (CheckedTextView)view;
            checkedtextview.toggle();
            j = ((Integer)view.getTag()).intValue();
            MultiChoiceDialogFragment.a()[j] = checkedtextview.isChecked();
            view = MultiChoiceDialogFragment.a();
            k = view.length;
            i = 0;
_L6:
            if (i >= k)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            if (view[i] == 0) goto _L4; else goto _L3
_L3:
            i = 1;
_L7:
            if (i == 0)
            {
                checkedtextview.toggle();
                MultiChoiceDialogFragment.a()[j] = checkedtextview.isChecked();
                return;
            }
              goto _L5
_L4:
            i++;
              goto _L6
            i = 0;
              goto _L7
        }

        public a(Collection collection)
        {
            addAll(collection);
        }
    }

    private static class b
    {

        final String a;
        final com.fitbit.savedstate.MobileRunSavedState.AudioCue b;
        final Boolean c;

        public b(String s, com.fitbit.savedstate.MobileRunSavedState.AudioCue audiocue, Boolean boolean1)
        {
            a = s;
            b = audiocue;
            c = boolean1;
        }
    }

    public static interface c
    {

        public abstract void a(int i, boolean aflag[]);
    }


    private static String a = "ID";
    private static String b = "CHOICES";
    private static String c = "SELECTED";
    private static boolean d[];
    private c e;

    public MultiChoiceDialogFragment()
    {
        setArguments(new Bundle());
    }

    public static MultiChoiceDialogFragment a(int i, boolean aflag[], String as[])
    {
        Bundle bundle = new Bundle();
        bundle.putInt(a, i);
        bundle.putBooleanArray(c, aflag);
        bundle.putStringArray(b, as);
        aflag = new MultiChoiceDialogFragment();
        aflag.setArguments(bundle);
        return aflag;
    }

    static boolean[] a()
    {
        return d;
    }

    public void a(c c1)
    {
        e = c1;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getArguments().getBooleanArray(c);
        if (bundle != null)
        {
            bundle = bundle.getBooleanArray(c);
            if (bundle == null)
            {
                bundle = d;
            }
            d = bundle;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        String as[];
        ArrayList arraylist;
        int i;
        as = getArguments().getStringArray(b);
        arraylist = new ArrayList();
        i = 0;
_L8:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        bundle = com.fitbit.savedstate.MobileRunSavedState.AudioCue.valueOf(as[i]);
        _cls1.a[bundle.ordinal()];
        JVM INSTR tableswitch 1 5: default 80
    //                   1 122
    //                   2 132
    //                   3 142
    //                   4 152
    //                   5 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_162;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        bundle = null;
_L9:
        arraylist.add(new b(bundle, com.fitbit.savedstate.MobileRunSavedState.AudioCue.valueOf(as[i]), Boolean.valueOf(d[i])));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        bundle = getString(0x7f080162);
          goto _L9
_L3:
        bundle = getString(0x7f080522);
          goto _L9
_L4:
        bundle = getString(0x7f080063);
          goto _L9
_L5:
        bundle = getString(0x7f0804e5);
          goto _L9
        bundle = getString(0x7f080579);
          goto _L9
        return (new android.app.AlertDialog.Builder(getActivity())).setAdapter(new a(arraylist), null).create();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setCanceledOnTouchOutside(true);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (e != null)
        {
            int i = getArguments().getInt(a);
            e.a(i, d);
        }
        super.onDismiss(dialoginterface);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBooleanArray(c, d);
    }

}
