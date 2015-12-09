// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity

class a
    implements com.fitbit.food.barcode.b.
{

    final BarcodeScannerActivity a;
    private com.fitbit.util.nt.a b;
    private com.fitbit.util.nt.a c;

    private com.fitbit.util.nt.a b()
    {
        if (b == null)
        {
            b = new com.fitbit.util.SimpleConfirmDialogFragment.a() {

                final BarcodeScannerActivity._cls4 a;

                public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    if (BarcodeScannerActivity.b(a.a))
                    {
                        BarcodeScannerActivity.a(a.a);
                    }
                }

                public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    a.a.finish();
                }

                public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                }

            
            {
                a = BarcodeScannerActivity._cls4.this;
                super();
            }
            };
        }
        return b;
    }

    private com.fitbit.util.nt.a c()
    {
        if (c == null)
        {
            c = new com.fitbit.util.SimpleConfirmDialogFragment.a() {

                final BarcodeScannerActivity._cls4 a;

                public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    if (BarcodeScannerActivity.b(a.a))
                    {
                        BarcodeScannerActivity.c(a.a);
                    }
                }

                public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    a.a.finish();
                }

                public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                }

            
            {
                a = BarcodeScannerActivity._cls4.this;
                super();
            }
            };
        }
        return c;
    }

    public void a()
    {
        a.b(anningState.d);
    }

    public void a(ServerCommunicationException servercommunicationexception)
    {
        com.fitbit.util.nt.a a1;
        if (com.fitbit.data.bl.exceptions.ion.ServerErrorType.a == servercommunicationexception.f())
        {
            a1 = b();
        } else
        {
            a1 = c();
        }
        RetryDialogFragment.a(a1, 0x7f08048f, servercommunicationexception.a()).show(a.getSupportFragmentManager(), "com.fitbit.food.barcode.ui.BarcodeScannerActivity.TAG_DIALOG_RETRY");
    }

    public void a(FoodItem fooditem)
    {
        a.finish();
        LogFoodActivity.a(a, fooditem, a.i);
    }

    _cls2.a(BarcodeScannerActivity barcodescanneractivity)
    {
        a = barcodescanneractivity;
        super();
    }
}
