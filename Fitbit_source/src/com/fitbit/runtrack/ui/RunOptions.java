// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.savedstate.MobileRunSavedState;
import com.fitbit.ui.a.c;
import com.fitbit.util.fonts.FitbitFont;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            FitbitFragment, MultiChoiceDialogFragment

public class RunOptions extends FitbitFragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.CompoundButton.OnCheckedChangeListener
{
    private static class a extends c
    {

        private Typeface a;

        public View getDropDownView(int j, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
            }
            viewgroup = (TextView)view;
            viewgroup.setText((CharSequence)((Pair)getItem(j)).second);
            viewgroup.setTypeface(a);
            return view;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
            }
            viewgroup = (TextView)view;
            viewgroup.setText((CharSequence)((Pair)getItem(j)).second);
            viewgroup.setTypeface(a);
            viewgroup.setGravity(80);
            return view;
        }

        public a(Context context, Collection collection)
        {
            addAll(collection);
            a = FitbitFont.h.a(context, Typeface.DEFAULT);
        }
    }

    private static class b extends c
    {

        private Typeface a;

        public View getDropDownView(int j, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
            }
            viewgroup = (TextView)view;
            viewgroup.setText(((SupportedActivity)getItem(j)).name);
            viewgroup.setTypeface(a);
            return view;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
            }
            viewgroup = (TextView)view;
            viewgroup.setText(((SupportedActivity)getItem(j)).name);
            viewgroup.setTypeface(a);
            viewgroup.setPadding(0, 0, 0, 0);
            return view;
        }

        public b(Context context, Collection collection)
        {
            addAll(collection);
            a = FitbitFont.h.a(context, Typeface.DEFAULT);
        }
    }


    private static final String a = com/fitbit/runtrack/ui/RunOptions.getSimpleName();
    private static final String b = "choice";
    private View c;
    private Spinner d;
    private Spinner e;
    private Spinner f;
    private SwitchCompat g;
    private TextView h;
    private View i;

    public RunOptions()
    {
    }

    static View a(RunOptions runoptions)
    {
        return runoptions.i;
    }

    private void a()
    {
        c.setVisibility(0);
        i.setVisibility(8);
        g.setChecked(true);
        b();
        a(MobileRunSavedState.g());
    }

    static void a(RunOptions runoptions, EnumSet enumset)
    {
        runoptions.a(enumset);
    }

    private void a(EnumSet enumset)
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList(enumset.size());
        iterator = enumset.iterator();
_L8:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        enumset = (com.fitbit.savedstate.MobileRunSavedState.AudioCue)iterator.next();
        static class _cls3
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.fitbit.savedstate.MobileRunSavedState.AudioCue.values().length];
                try
                {
                    b[com.fitbit.savedstate.MobileRunSavedState.AudioCue.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.fitbit.savedstate.MobileRunSavedState.AudioCue.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.fitbit.savedstate.MobileRunSavedState.AudioCue.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.fitbit.savedstate.MobileRunSavedState.AudioCue.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[com.fitbit.savedstate.MobileRunSavedState.AudioCue.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[com.fitbit.savedstate.MobileRunSavedState.FrequencyType.values().length];
                try
                {
                    a[com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.b[enumset.ordinal()];
        JVM INSTR tableswitch 1 5: default 80
    //                   1 91
    //                   2 101
    //                   3 111
    //                   4 121
    //                   5 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_131;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        enumset = null;
_L9:
        arraylist.add(enumset);
        if (true) goto _L8; else goto _L7
_L7:
        enumset = getString(0x7f080162);
          goto _L9
_L3:
        enumset = getString(0x7f080522);
          goto _L9
_L4:
        enumset = getString(0x7f080063);
          goto _L9
_L5:
        enumset = getString(0x7f0804e5);
          goto _L9
        enumset = getString(0x7f080579);
          goto _L9
        h.setText(TextUtils.join(", ", arraylist));
        return;
    }

    static View b(RunOptions runoptions)
    {
        return runoptions.c;
    }

    private void b()
    {
        Object obj;
        obj = an.a().b();
        ArrayList arraylist = new ArrayList();
        arraylist.add(Pair.create(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a, ((Profile) (obj)).t().getDisplayName()));
        arraylist.add(Pair.create(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b, "minutes"));
        f.setAdapter(new a(getActivity(), arraylist));
        obj = MobileRunSavedState.c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        c();
        f.setSelection(1);
        MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.TimeFrequency.a);
        MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b);
_L4:
        e.setOnItemSelectedListener(this);
        f.setOnItemSelectedListener(this);
        return;
_L2:
        switch (_cls3.a[((com.fitbit.savedstate.MobileRunSavedState.FrequencyType) (obj)).ordinal()])
        {
        case 1: // '\001'
            d();
            e.setSelection(MobileRunSavedState.d().ordinal());
            f.setSelection(0);
            break;

        case 2: // '\002'
            c();
            e.setSelection(MobileRunSavedState.e().ordinal());
            f.setSelection(1);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        ArrayList arraylist = new ArrayList();
        com.fitbit.savedstate.MobileRunSavedState.TimeFrequency atimefrequency[] = com.fitbit.savedstate.MobileRunSavedState.TimeFrequency.values();
        int k = atimefrequency.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.savedstate.MobileRunSavedState.TimeFrequency timefrequency = atimefrequency[j];
            arraylist.add(Pair.create(timefrequency, Long.toString(timefrequency.a(TimeUnit.MINUTES))));
        }

        e.setAdapter(new a(getActivity(), arraylist));
    }

    private void d()
    {
        ArrayList arraylist = new ArrayList();
        com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency adistancefrequency[] = com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency.values();
        int k = adistancefrequency.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency distancefrequency = adistancefrequency[j];
            arraylist.add(Pair.create(distancefrequency, Double.toString(distancefrequency.a())));
        }

        e.setAdapter(new a(getActivity(), arraylist));
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        MobileRunSavedState.a(flag);
        if (flag)
        {
            a();
            ObjectAnimator.ofFloat(c, "translationY", new float[] {
                (float)(-c.getHeight()), 0.0F
            }).setDuration(200L).start();
            return;
        } else
        {
            compoundbutton = ObjectAnimator.ofFloat(c, "translationY", new float[] {
                0.0F, (float)(-c.getHeight())
            }).setDuration(200L);
            compoundbutton.addListener(new android.animation.Animator.AnimatorListener() {

                final RunOptions a;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    RunOptions.a(a).setVisibility(0);
                    RunOptions.b(a).setVisibility(4);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = RunOptions.this;
                super();
            }
            });
            compoundbutton.start();
            return;
        }
    }

    public void onClick(View view)
    {
        Object obj = MobileRunSavedState.g();
        view = new boolean[com.fitbit.savedstate.MobileRunSavedState.AudioCue.values().length];
        for (obj = ((EnumSet) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            view[((com.fitbit.savedstate.MobileRunSavedState.AudioCue)((Iterator) (obj)).next()).ordinal()] = 1;
        }

        String as[] = new String[com.fitbit.savedstate.MobileRunSavedState.AudioCue.values().length];
        for (int j = 0; j < com.fitbit.savedstate.MobileRunSavedState.AudioCue.values().length; j++)
        {
            as[j] = com.fitbit.savedstate.MobileRunSavedState.AudioCue.values()[j].name();
        }

        view = MultiChoiceDialogFragment.a(0x7f110020, view, as);
        view.a(new MultiChoiceDialogFragment.c() {

            final RunOptions a;

            public void a(int k, boolean aflag[])
            {
                EnumSet enumset = EnumSet.noneOf(com/fitbit/savedstate/MobileRunSavedState$AudioCue);
                for (k = 0; k < aflag.length; k++)
                {
                    if (aflag[k])
                    {
                        enumset.add(com.fitbit.savedstate.MobileRunSavedState.AudioCue.values()[k]);
                    }
                }

                MobileRunSavedState.a(enumset);
                RunOptions.a(a, enumset);
            }

            
            {
                a = RunOptions.this;
                super();
            }
        });
        as = getFragmentManager().beginTransaction();
        android.support.v4.app.Fragment fragment = getFragmentManager().findFragmentByTag("choice");
        if (fragment != null)
        {
            as.remove(fragment);
        }
        view.show(as, "choice");
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400c6, viewgroup, false);
        c = layoutinflater.findViewById(0x7f11030e);
        d = (Spinner)layoutinflater.findViewById(0x7f11030c);
        e = (Spinner)layoutinflater.findViewById(0x7f110242);
        f = (Spinner)layoutinflater.findViewById(0x7f110243);
        g = (SwitchCompat)layoutinflater.findViewById(0x7f110312);
        h = (TextView)layoutinflater.findViewById(0x7f110311);
        i = layoutinflater.findViewById(0x7f1100b0);
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        MultiChoiceDialogFragment multichoicedialogfragment = (MultiChoiceDialogFragment)getFragmentManager().findFragmentByTag("choice");
        if (multichoicedialogfragment != null)
        {
            multichoicedialogfragment.a(null);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int j, long l)
    {
        adapterview.getId();
        JVM INSTR lookupswitch 3: default 40
    //                   2131821122: 56
    //                   2131821123: 86
    //                   2131821324: 41;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        MobileRunSavedState.a(((SupportedActivity)adapterview.getItemAtPosition(j)).type);
        return;
_L2:
        if (MobileRunSavedState.c().equals(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a))
        {
            MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency.values()[j]);
            return;
        } else
        {
            MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.TimeFrequency.values()[j]);
            return;
        }
_L3:
        adapterview = (Pair)adapterview.getItemAtPosition(j);
        if (!MobileRunSavedState.c().equals(((Pair) (adapterview)).first))
        {
            if (((com.fitbit.savedstate.MobileRunSavedState.FrequencyType)((Pair) (adapterview)).first).equals(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a))
            {
                MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency.values()[0]);
                MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a);
                d();
                return;
            } else
            {
                MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.TimeFrequency.values()[0]);
                MobileRunSavedState.a(com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b);
                c();
                return;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        d.setSelection(0);
    }

    public void onResume()
    {
        super.onResume();
        if (MobileRunSavedState.h())
        {
            a();
            return;
        } else
        {
            g.setChecked(false);
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        g.setOnCheckedChangeListener(this);
        d.setOnItemSelectedListener(this);
        view.findViewById(0x7f11030f).setOnClickListener(this);
        d.setAdapter(new b(getActivity(), SupportedActivity.b()));
        view = MobileRunSavedState.b();
        bundle = SupportedActivity.b().iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            SupportedActivity supportedactivity = (SupportedActivity)bundle.next();
            if (view != supportedactivity.type)
            {
                continue;
            }
            d.setSelection(supportedactivity.ordinal());
            break;
        } while (true);
    }

}
