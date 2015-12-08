// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.Window;
import com.snapchat.android.model.Friend;

final class lang.Object
    implements android.view.OnClickListener
{

    private su a;

    public final void onClick(View view)
    {
        if (a.n != null)
        {
            view = a;
            Object obj = a.n;
            String s = ((Friend) (obj)).g();
            obj = new (view, ((su) (view)).b, ((Friend) (obj)), ((Friend) (obj)), s);
            ((FX) (obj)).show();
            ((FX) (obj)).getWindow().setSoftInputMode(32);
            view.e = ((FW) (obj));
        }
    }

    >(su su1)
    {
        a = su1;
        super();
    }
}
