// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//            a

final class b
    implements com.facebook.internal.o.a
{

    final AppInviteContent a;
    final a.a b;

    b(a.a a1, AppInviteContent appinvitecontent)
    {
        b = a1;
        a = appinvitecontent;
        super();
    }

    public final Bundle a()
    {
        return com.facebook.share.widget.a.a(a);
    }

    public final Bundle b()
    {
        return new Bundle();
    }
}
