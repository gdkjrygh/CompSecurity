// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ai, aj

public class ah extends f
{

    private final Button a;
    private aj b;

    public ah(Context context)
    {
        this(context, null, 0);
    }

    public ah(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_contact_picker_invite_friends);
        a = (Button)getView(i.invite_friends_button);
        a.setOnClickListener(new ai(this));
    }

    static aj a(ah ah1)
    {
        return ah1.b;
    }

    public ah a(aj aj)
    {
        b = aj;
        return this;
    }
}
