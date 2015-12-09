// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;

public final class fao
{

    public dfi a;
    private Context b;

    public fao(Context context)
    {
        b = context;
    }

    public final void a(fap fap)
    {
        dfj dfj1 = new dfj(b, 0x7f0b017f);
        dfj1.a(0x7f080509, new android.content.DialogInterface.OnClickListener(fap) {

            private fap a;
            private fao b;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.a();
                b.a.dismiss();
            }

            
            {
                b = fao.this;
                a = fap1;
                super();
            }
        });
        dfj1.b(0x7f08050a, new android.content.DialogInterface.OnClickListener(fap) {

            private fap a;
            private fao b;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.b();
                b.a.dismiss();
            }

            
            {
                b = fao.this;
                a = fap1;
                super();
            }
        });
        dfj1.b(0x7f08050b);
        fap = dfj1.b();
        a = fap;
        fap.show();
    }
}
