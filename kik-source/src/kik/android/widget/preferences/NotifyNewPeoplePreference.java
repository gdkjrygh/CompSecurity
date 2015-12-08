// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.sdkutils.d;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikCheckBoxPreference, au, av, ay, 
//            ax, aw

public class NotifyNewPeoplePreference extends KikCheckBoxPreference
{

    protected w b;

    public NotifyNewPeoplePreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101008f);
    }

    public NotifyNewPeoplePreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.e);
    }

    static void a(NotifyNewPeoplePreference notifynewpeoplepreference)
    {
        notifynewpeoplepreference.notifyChanged();
    }

    static void a(NotifyNewPeoplePreference notifynewpeoplepreference, boolean flag)
    {
        notifynewpeoplepreference.b(flag);
    }

    private void b(boolean flag)
    {
        setEnabled(false);
        p p1 = b.a(flag);
        p1.a(d.a(b(), new au(this, flag)));
        p1.a(new av(this));
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = super.onCreateView(viewgroup);
        setChecked(b.d().h.booleanValue());
        return viewgroup;
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        boolean flag = ((KikCheckBoxPreference)preference).isChecked();
        if (flag)
        {
            obj = new kik.android.chat.fragment.KikDialogFragment.a(getContext().getResources());
            ((kik.android.chat.fragment.KikDialogFragment.a) (obj)).b(0x7f09002a).a(0x7f0902b2).b(false).b(0x7f090299, new ay(this)).a(0x7f0902b1, new ax(this, flag)).a(new aw(this, preference));
            b().a(((kik.android.chat.fragment.KikDialogFragment.a) (obj)).a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "notifyNew");
            return false;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        return true;
    }
}
