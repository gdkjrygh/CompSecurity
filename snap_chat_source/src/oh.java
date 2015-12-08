// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.fragments.cash.TransactionHistoryFragment;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public final class oh
    implements ni
{

    public static final String CLIENT_IDENTITY = "chartreuse";
    public static final String CLIENT_PARAM = "client";
    public static final String NAME = "SQUARE";
    private static final String TAG = "SquareProvider";
    protected na mCashErrorReporter;

    public oh()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public static com.snapchat.android.model.CashTransaction.TransactionStatus a(com.snapchat.android.api2.cash.square.data.CashPayment.State state, com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason cancellationreason)
    {
        if (state == com.snapchat.android.api2.cash.square.data.CashPayment.State.WAITING_ON_RECIPIENT)
        {
            return com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT;
        }
        if (state == com.snapchat.android.api2.cash.square.data.CashPayment.State.CANCELED)
        {
            if (cancellationreason == com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.EXPIRED_WAITING_ON_RECIPIENT)
            {
                return com.snapchat.android.model.CashTransaction.TransactionStatus.EXPIRED;
            }
            if (cancellationreason == com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.RECIPIENT_CANCELED)
            {
                return com.snapchat.android.model.CashTransaction.TransactionStatus.RECIPIENT_CANCELED;
            }
            if (cancellationreason == com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.SQUARE_CANCELED)
            {
                return com.snapchat.android.model.CashTransaction.TransactionStatus.CANCELED;
            } else
            {
                return com.snapchat.android.model.CashTransaction.TransactionStatus.SENDER_CANCELED;
            }
        }
        if (state == com.snapchat.android.api2.cash.square.data.CashPayment.State.COMPLETED)
        {
            return com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED;
        } else
        {
            return com.snapchat.android.model.CashTransaction.TransactionStatus.INITIATED;
        }
    }

    public static List a(np np1, int i)
    {
        i;
        JVM INSTR lookupswitch 2: default 28
    //                   401: 30
    //                   409: 49;
           goto _L1 _L2 _L3
_L1:
        return null;
_L2:
        return Arrays.asList(new np[] {
            new nz(true)
        });
_L3:
        if (np1 instanceof nH)
        {
            return Arrays.asList(new np[] {
                new nF()
            });
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static void a(com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason cancellationreason)
    {
        if (cancellationreason != null)
        {
            static final class _cls5
            {

                static final int $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason[];

                static 
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason = new int[com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.values().length];
                    try
                    {
                        $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason[com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.DECLINED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason[com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.LIMIT_EXCEEDED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason[com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.SQUARE_CANCELED.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$snapchat$android$api2$cash$square$data$CashPayment$CancellationReason[com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason.OTHER.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls5..SwitchMap.com.snapchat.android.api2.cash.square.data.CashPayment.CancellationReason[cancellationreason.ordinal()])
            {
            default:
                AnalyticsEvents.g("OTHER");
                na.a(0x7f0801d1, new Object[0]);
                return;

            case 1: // '\001'
                AnalyticsEvents.g("CARD_DECLINED");
                na.a(0x7f0801cf, new Object[0]);
                return;

            case 2: // '\002'
                AnalyticsEvents.g("LIMIT_EXCEEDED");
                cancellationreason = Mf.a();
                com.snapchat.android.util.eventbus.ShowDialogEvent.a a1 = new com.snapchat.android.util.eventbus.ShowDialogEvent.a(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.ONE_BUTTON);
                a1.mTitleResId = 0x7f0801cd;
                a1.mMessageResId = 0x7f0801d2;
                cancellationreason.a(a1.a());
                return;

            case 3: // '\003'
                AnalyticsEvents.g("SQUARE_CANCELED");
                break;
            }
            na.a(0x7f0801d5, new Object[0]);
            return;
        } else
        {
            AnalyticsEvents.g("UNKNOWN");
            na.a(0x7f0801d1, new Object[0]);
            return;
        }
    }

    public final void a()
    {
        Bt.ax();
        nz nz1 = new nz();
        nz1.mListener = new np.a() {

            final oh this$0;

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                if (list == null || list.isEmpty())
                {
                    (new nZ(new od() {

                        final oh this$0;

                        public final void a(int i)
                        {
                            if (i == 404)
                            {
                                Bt.av();
                            }
                        }

                        public final void a(oq oq)
                        {
                            Bt.a(new og(oq));
                        }

            
            {
                this$0 = oh.this;
                super();
            }
                    })).execute();
                }
            }

            public final void b(np np1)
            {
            }

            public final void b(np np1, List list, boolean flag)
            {
            }

            
            {
                this$0 = oh.this;
                super();
            }
        };
        nz1.a(null);
    }

    public final void a(CashFeedItem cashfeeditem)
    {
        if (!Bt.e())
        {
            throw new RuntimeException("Must have verified phone number before calling SquareProvider#getAccessToken!");
        } else
        {
            cashfeeditem.mBlockerPriorityQueue.clear();
            cashfeeditem.a(IA.a(new nz()));
            cashfeeditem.a(new mX.a() {

                final oh this$0;
                final CashTransaction val$cashTransaction;

                public final void a()
                {
                    (new nV(cashTransaction)).execute();
                }

                public final void b()
                {
                }

            
            {
                this$0 = oh.this;
                cashTransaction = cashtransaction;
                super();
            }
            });
            return;
        }
    }

    public final void a(final String title)
    {
        nz nz1 = new nz();
        nz1.mListener = new np.a() {

            final oh this$0;
            final String val$title;

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                np1 = new TransactionHistoryFragment(title);
                Pi.a();
                np1.a(Jh.a(Arrays.asList(new String[] {
                    Pi.c(), "cash/history"
                }), "/"));
                Mf.a().a(new Oi(np1));
            }

            public final void b(np np1)
            {
            }

            public final void b(np np1, List list, boolean flag)
            {
                Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f080151));
            }

            
            {
                this$0 = oh.this;
                title = s;
                super();
            }
        };
        nz1.a(null);
    }

    public final Collection b()
    {
        return Arrays.asList(new np[] {
            new nr(), new nB(), new nz()
        });
    }

    public final Collection c()
    {
        ArrayList arraylist = new ArrayList();
        if (Bt.aJ())
        {
            arraylist.add(new nJ());
        }
        return arraylist;
    }

    public final Collection d()
    {
        return Arrays.asList(new np[] {
            new nH()
        });
    }

    public final Collection e()
    {
        return Arrays.asList(new np[] {
            new nz(), new nN()
        });
    }

    public final Collection f()
    {
        return Arrays.asList(new np[] {
            new nr(), new nz(), new nM()
        });
    }

    public final Collection g()
    {
        return Arrays.asList(new np[] {
            new nR()
        });
    }
}
