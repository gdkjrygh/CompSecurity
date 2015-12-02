// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.user.Name;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.i;
import com.facebook.user.j;
import com.facebook.user.n;
import com.facebook.user.o;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.sms:
//            bp

public class bo
{

    private Context a;
    private a b;
    private a c;
    private s d;
    private i e;

    public bo(Context context, a a1, a a2, s s1, i k)
    {
        a = context;
        b = a1;
        c = a2;
        d = s1;
        e = k;
    }

    private void a(j j1, String s1)
    {
        Object obj = j1.a(0);
        j1 = new UserWithIdentifier((new o()).a(n.PHONE_NUMBER, j1.b()).a(new Name(null, null, j1.c())).x(), ((com.facebook.user.UserIdentifier) (obj)));
        obj = new Intent(a, com/facebook/orca/creation/CreateThreadActivity);
        ((Intent) (obj)).putExtra("to", j1);
        ((Intent) (obj)).putExtra("composer_initial_text", s1);
        ((Intent) (obj)).putExtra("focus_compose", true);
        ((Intent) (obj)).setFlags(0x4000000);
        d.a(((Intent) (obj)), a);
    }

    private void b(j j1, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:"));
        intent.setType("vnd.android-dir/mms-sms");
        intent.putExtra("address", j1.b());
        intent.putExtra("sms_body", s1);
        d.b(intent, a);
    }

    public bp a(String s1, String s2)
    {
        s1 = e.a(s1);
        if (((Boolean)b.b()).booleanValue() && ((Boolean)c.b()).booleanValue())
        {
            a(((j) (s1)), s2);
            return bp.Internal;
        } else
        {
            b(s1, s2);
            return bp.External;
        }
    }
}
