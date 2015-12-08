// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class FZ extends AlertDialog
{

    private String a;
    private Context b;

    public FZ(Context context, String s)
    {
        super(context);
        a = s;
        b = context;
    }

    public void a()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setMessage(a);
        setCancelable(true);
        setButton(-1, b.getString(0x7f0801bc), new android.content.DialogInterface.OnClickListener() {

            private FZ a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
                a.a();
            }

            
            {
                a = FZ.this;
                super();
            }
        });
        super.onCreate(bundle);
    }
}
