// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.snapchat.android.model.FriendAction;

public final class um extends AlertDialog
{

    public um(Context context, String s)
    {
        super(context);
        setTitle(IC.a(context, 0x7f080033, new Object[] {
            s
        }));
        setButton(-1, context.getString(0x7f080020), new android.content.DialogInterface.OnClickListener(s) {

            private String a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                um.a(a);
                dialoginterface.cancel();
            }

            
            {
                a = s;
                super();
            }
        });
        setButton(-2, context.getString(0x7f08007f), new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        });
    }

    protected static void a(String s)
    {
        (new mh(FriendAction.ADD, null, s, null, null, null, null)).execute();
    }
}
