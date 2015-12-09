// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.cb:
//            c

public class e extends p.cb.c
{

    public CompoundButton a;
    public Button b;
    private View c;

    public e()
    {
    }

    public static e e()
    {
        return new e();
    }

    public CharSequence d()
    {
        return getString(0x7f080136);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        c = layoutinflater.inflate(0x7f04004c, viewgroup, false);
        a = (CompoundButton)c.findViewById(0x7f100156);
        b = (Button)c.findViewById(0x7f100157);
        layoutinflater = b.a.b().k();
        viewgroup = a;
        boolean flag;
        if (!layoutinflater.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setChecked(flag);
        a.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(layoutinflater) {

            final ag a;
            final e b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                compoundbutton = a;
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                compoundbutton.d(flag1);
            }

            
            {
                b = e.this;
                a = ag1;
                super();
            }
        });
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final e a;

            public void onClick(View view)
            {
                view = view.getContext().getString(0x7f08020a);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(view));
                try
                {
                    a.startActivity(intent);
                    return;
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    p.df.a.b("DevicesSettingsFragment", (new StringBuilder()).append("Can't open url:").append(view).append("  Is the Pebble app installed?").toString());
                }
            }

            
            {
                a = e.this;
                super();
            }
        });
        return c;
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.J;
    }
}
