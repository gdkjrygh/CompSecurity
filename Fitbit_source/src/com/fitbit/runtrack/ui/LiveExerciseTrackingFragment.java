// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.format.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            FitbitFragment, f, TimeDeltaView

public class LiveExerciseTrackingFragment extends FitbitFragment
    implements f
{

    private TextView a;
    private TimeDeltaView b;
    private TextView c;
    private com.fitbit.data.domain.Length.LengthUnits d;

    public LiveExerciseTrackingFragment()
    {
    }

    public void a()
    {
        if (b != null)
        {
            b.b();
        }
    }

    public void a(ExerciseSession exercisesession)
    {
    }

    public void a(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
    }

    public void a(ExerciseSession exercisesession, b b1)
    {
        a(b1.i(exercisesession));
        b.b();
        exercisesession = b1.g(exercisesession);
        a((ExerciseStat)((Pair) (exercisesession)).first, (List)((Pair) (exercisesession)).second);
    }

    public void a(ExerciseStat exercisestat, List list)
    {
        if (getView() == null)
        {
            return;
        }
        double d1 = exercisestat.a().a(d).b();
        if (!Double.isNaN(d1))
        {
            a.setText(e.b(d1, 1));
        } else
        {
            a.setText(e.b(0.0D, 1));
        }
        exercisestat = exercisestat.a(d);
        if (exercisestat != null)
        {
            c.setText(String.format("%s'%s\"", new Object[] {
                Integer.valueOf(exercisestat.d()), Integer.valueOf(exercisestat.f())
            }));
            return;
        } else
        {
            c.setText("--:--");
            return;
        }
    }

    public void a(List list)
    {
        if (b != null)
        {
            Iterator iterator = list.iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ExerciseSegment exercisesegment = (ExerciseSegment)iterator.next();
                if (exercisesegment.a())
                {
                    long l = i;
                    i = (int)(exercisesegment.b() + l);
                }
            } while (true);
            b.a(i);
            list = (ExerciseSegment)list.get(list.size() - 1);
            if (!list.a())
            {
                b.a(list.c());
                b.b();
                return;
            }
        }
    }

    public void b(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = an.a().b().t();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400b2, viewgroup, false);
        a = (TextView)layoutinflater.findViewById(0x7f11029e);
        c = (TextView)layoutinflater.findViewById(0x7f1102ca);
        b = (TimeDeltaView)layoutinflater.findViewById(0x7f1102c9);
        ((TextView)layoutinflater.findViewById(0x7f11029d)).setText(d.getDisplayName());
        return layoutinflater;
    }
}
