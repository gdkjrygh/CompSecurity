// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.cache.ContactImageView;
import com.kik.cache.SoftwareContactImageView;
import com.kik.cache.ad;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.v;
import kik.a.e.w;
import kik.android.widget.RobotoTextView;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference, ad, af, ag

public class KikProfilePicPreference extends KikPreference
{
    public static abstract class a
    {

        public abstract void a();

        public a()
        {
        }
    }


    private static final b f = org.c.c.a("KikProfilePicPreference");
    protected w b;
    protected v c;
    protected com.kik.android.a d;
    ImageView e;
    private a g;
    private ContactImageView h;
    private RobotoTextView i;
    private SoftwareContactImageView j;
    private TextView k;
    private TextView l;
    private aa m;
    private ad n;
    private View o;
    private Toast p;

    public KikProfilePicPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public KikProfilePicPreference(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1, null);
        setLayoutResource(0x7f030059);
    }

    static Toast a(KikProfilePicPreference kikprofilepicpreference)
    {
        return kikprofilepicpreference.p;
    }

    private void a(String s)
    {
label0:
        {
            if (k != null)
            {
                if (s != null)
                {
                    break label0;
                }
                k.setText(getContext().getString(0x7f090202));
            }
            return;
        }
        k.setText(s);
    }

    static View b(KikProfilePicPreference kikprofilepicpreference)
    {
        return kikprofilepicpreference.o;
    }

    static ad c(KikProfilePicPreference kikprofilepicpreference)
    {
        return kikprofilepicpreference.n;
    }

    static a d(KikProfilePicPreference kikprofilepicpreference)
    {
        return kikprofilepicpreference.g;
    }

    public final void a(ad ad1)
    {
        n = ad1;
    }

    public final void a(com.kik.e.a a1)
    {
        a1.a(this);
    }

    public final void a(a a1)
    {
        g = a1;
    }

    public final void d()
    {
        notifyChanged();
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        j = (SoftwareContactImageView)view.findViewById(0x7f0e0030);
        h = (ContactImageView)view.findViewById(0x7f0e002f);
        k = (TextView)view.findViewById(0x7f0e0032);
        l = (TextView)view.findViewById(0x7f0e0033);
        o = view.findViewById(0x7f0e0131);
        i = (RobotoTextView)view.findViewById(0x7f0e0133);
        e = (ImageView)view.findViewById(0x7f0e0031);
        p = Toast.makeText(getContext(), "", 0);
        o.setOnClickListener(new kik.android.widget.preferences.ad(this));
        j.setOnClickListener(new af(this));
        i.setOnClickListener(new ag(this));
        view = b.d();
        if (((aa) (view)).i.booleanValue())
        {
            e.setVisibility(0);
        } else
        {
            e.setVisibility(8);
        }
        if (j != null && n != null)
        {
            j.a(view, n);
            h.b(view, n);
        }
        m = view;
        if (m != null)
        {
            if (((aa) (view)).d == null || ((aa) (view)).e == null)
            {
                a(((String) (null)));
            } else
            {
                a((new StringBuilder()).append(((aa) (view)).d).append(" ").append(((aa) (view)).e).toString());
            }
            view = ((aa) (view)).c;
            if (view != null && l != null)
            {
                l.setText(view);
            }
        }
    }

    public boolean onPreferenceClick(Preference preference)
    {
        return false;
    }

}
