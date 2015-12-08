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
    implements com.fitbit.util..a
{

    final sh a;

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

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/fitbit/food/barcode/ui/BarcodeScannerActivity$4

/* anonymous class */
    class BarcodeScannerActivity._cls4
        implements com.fitbit.food.barcode.b.b.a
    {

        final BarcodeScannerActivity a;
        private com.fitbit.util.SimpleConfirmDialogFragment.a b;
        private com.fitbit.util.SimpleConfirmDialogFragment.a c;

        private com.fitbit.util.SimpleConfirmDialogFragment.a b()
        {
            if (b == null)
            {
                b = new BarcodeScannerActivity._cls4._cls1(this);
            }
            return b;
        }

        private com.fitbit.util.SimpleConfirmDialogFragment.a c()
        {
            if (c == null)
            {
                c = new BarcodeScannerActivity._cls4._cls2();
            }
            return c;
        }

        public void a()
        {
            a.b(BarcodeScannerActivity.ScanningState.d);
        }

        public void a(ServerCommunicationException servercommunicationexception)
        {
            com.fitbit.util.SimpleConfirmDialogFragment.a a1;
            if (com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a == servercommunicationexception.f())
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

            
            {
                a = barcodescanneractivity;
                super();
            }

        // Unreferenced inner class com/fitbit/food/barcode/ui/BarcodeScannerActivity$4$2

/* anonymous class */
        class BarcodeScannerActivity._cls4._cls2
            implements com.fitbit.util.SimpleConfirmDialogFragment.a
        {

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
        }

    }

}
