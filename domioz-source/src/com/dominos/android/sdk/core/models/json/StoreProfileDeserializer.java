// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.core.Seq;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.PaymentType;
import com.dominos.android.sdk.common.dom.order.WalletType;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.google.a.b.be;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StoreProfileDeserializer
    implements v
{

    public StoreProfileDeserializer()
    {
    }

    public StoreProfile deserialize(w w1, Type type, u u)
    {
        boolean flag2 = true;
        be.g();
        type = (z)w1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        t t1;
        boolean flag;
        if (type.a("IsOnlineNow"))
        {
            flag = type.b("IsOnlineNow").g();
        } else
        {
            flag = false;
        }
        u = type.d("ServiceHoursDescription");
        obj3 = type.c("AcceptablePaymentTypes");
        t1 = type.c("AcceptableCreditCards");
        if (type.a("AcceptableWalletTypes"))
        {
            w1 = type.c("AcceptableWalletTypes");
        } else
        {
            w1 = new t();
        }
        obj2 = new ArrayList();
        obj1 = new ArrayList();
        obj = new ArrayList();
        if (obj3 != null)
        {
            for (int i = 0; i < ((t) (obj3)).a(); i++)
            {
                ((List) (obj2)).add(((t) (obj3)).a(i).c());
            }

        }
        if (t1 != null)
        {
            for (int j = 0; j < t1.a(); j++)
            {
                ((List) (obj1)).add(t1.a(j).c());
            }

        }
        if (w1 != null)
        {
            for (int k = 0; k < w1.a(); k++)
            {
                ((List) (obj)).add(w1.a(k).c());
            }

        }
        obj3 = new com.dominos.android.sdk.common.power.StoreProfile.Builder();
        double d;
        boolean flag1;
        if (type.a("StoreID"))
        {
            w1 = type.b("StoreID").c();
        } else
        {
            w1 = "";
        }
        obj3 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj3)).setStoreId(w1);
        if (type.a("AddressDescription"))
        {
            w1 = type.b("AddressDescription").c();
        } else
        {
            w1 = "";
        }
        obj3 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj3)).setAddressDescription(w1);
        if (type.a("Phone"))
        {
            w1 = type.b("Phone").c();
        } else
        {
            w1 = "";
        }
        obj3 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj3)).setPhone(w1);
        if (!((List) (obj2)).isEmpty())
        {
            w1 = Util.seq(((Iterable) (obj2))).transform(PaymentType.fromStringFn).toImmutableSet();
        } else
        {
            w1 = be.g();
        }
        obj2 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj3)).setAcceptablePaymentTypes(w1);
        if (!((List) (obj1)).isEmpty())
        {
            w1 = Util.seq(StoreProfile.standardizeCreditCardTypeNames(((List) (obj1)))).transform(CreditCardType.fromStringFn).toImmutableSet();
        } else
        {
            w1 = be.g();
        }
        obj1 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj2)).setAcceptableCreditCardTypes(w1);
        if (!((List) (obj)).isEmpty())
        {
            w1 = Util.seq(((Iterable) (obj))).transform(WalletType.fromStringFn).toImmutableSet();
        } else
        {
            w1 = be.g();
        }
        obj = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj1)).setAcceptableWalletTypes(w1);
        if (type.a("MinimumDeliveryOrderAmount"))
        {
            w1 = type.b("MinimumDeliveryOrderAmount").c();
        } else
        {
            w1 = "";
        }
        w1 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj)).setMinimumDeliveryAmount(w1);
        if (type.a("CashLimit"))
        {
            d = type.b("CashLimit").d();
        } else
        {
            d = 0.0D;
        }
        obj = w1.setCashLimit(d);
        if (u != null)
        {
            if (u.a("Carryout"))
            {
                w1 = u.b("Carryout").c();
            } else
            {
                w1 = "";
            }
        } else
        {
            w1 = "";
        }
        obj = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj)).setCarryoutHoursDescription(w1);
        if (u != null)
        {
            if (u.a("Delivery"))
            {
                w1 = u.b("Delivery").c();
            } else
            {
                w1 = "";
            }
        } else
        {
            w1 = "";
        }
        w1 = ((com.dominos.android.sdk.common.power.StoreProfile.Builder) (obj)).setDeliveryHoursDescription(w1);
        if (type.a("AllowCarryoutOrders") && type.b("AllowCarryoutOrders").g() && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        w1 = w1.setCarryoutAvailable(flag1);
        if (type.a("AllowDeliveryOrders") && type.b("AllowDeliveryOrders").g() && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        w1 = w1.setDeliveryAvailable(flag1);
        if (type.a("IsOpen"))
        {
            flag1 = type.b("IsOpen").g();
        } else
        {
            flag1 = false;
        }
        w1 = w1.setOpen(flag1).setOnline(flag).setIsGoogleWalletAvailable();
        if (type.a("IsAVSEnabled"))
        {
            flag = type.b("IsAVSEnabled").g();
        } else
        {
            flag = true;
        }
        w1 = w1.setIsAvsEnabled(flag);
        if (type.a("Pop") && type.b("Pop").g())
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        return w1.setPop(flag).build();
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
