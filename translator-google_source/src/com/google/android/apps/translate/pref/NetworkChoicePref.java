// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import com.google.android.apps.translate.r;

// Referenced classes of package com.google.android.apps.translate.pref:
//            h

public class NetworkChoicePref extends DialogPreference
{

    private static final int a[];

    public NetworkChoicePref(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NetworkChoicePref(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private int a()
    {
        int i;
label0:
        {
            int j = getPersistedInt(2);
            if (j >= 0)
            {
                i = j;
                if (j <= 2)
                {
                    break label0;
                }
            }
            i = 2;
        }
        return i;
    }

    static void a(NetworkChoicePref networkchoicepref)
    {
        networkchoicepref.notifyChanged();
    }

    static boolean a(NetworkChoicePref networkchoicepref, int i)
    {
        return networkchoicepref.persistInt(i);
    }

    public CharSequence getSummary()
    {
        return getContext().getString(a[a()]);
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        super.onPrepareDialogBuilder(builder);
        String s = getContext().getString(r.msg_wifi_only);
        String s1 = getContext().getString(r.msg_any_network);
        String s2 = getContext().getString(r.msg_ask_network);
        int i = a();
        h h1 = new h(this);
        builder.setSingleChoiceItems(new String[] {
            s, s1, s2
        }, i, h1).setPositiveButton(null, null);
    }

    static 
    {
        a = (new int[] {
            r.msg_wifi_only_summary, r.msg_any_network_summary, r.msg_ask_network_summary
        });
    }
}
