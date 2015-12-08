// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            y, ae, s, an

public class HitBuilders
{
    public static class AppViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public AppViewBuilder()
        {
            y.eK().a(y.a.Bg);
            set("&t", "screenview");
        }
    }

    public static class EventBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public EventBuilder setAction(String s)
        {
            set("&ea", s);
            return this;
        }

        public EventBuilder setCategory(String s)
        {
            set("&ec", s);
            return this;
        }

        public EventBuilder setLabel(String s)
        {
            set("&el", s);
            return this;
        }

        public EventBuilder setValue(long l)
        {
            set("&ev", Long.toString(l));
            return this;
        }

        public EventBuilder()
        {
            y.eK().a(y.a.AU);
            set("&t", "event");
        }

        public EventBuilder(String s, String s1)
        {
            this();
            setCategory(s);
            setAction(s1);
        }
    }

    public static class ExceptionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ExceptionBuilder setDescription(String s)
        {
            set("&exd", s);
            return this;
        }

        public ExceptionBuilder setFatal(boolean flag)
        {
            set("&exf", an.E(flag));
            return this;
        }

        public ExceptionBuilder()
        {
            y.eK().a(y.a.AD);
            set("&t", "exception");
        }
    }

    protected static class HitBuilder
    {

        private Map BA;
        ProductAction BB;
        Map BC;
        List BD;
        List BE;

        public HitBuilder addImpression(Product product, String s1)
        {
            if (product == null)
            {
                ae.W("product should be non-null");
                return this;
            }
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "";
            }
            if (!BC.containsKey(s2))
            {
                BC.put(s2, new ArrayList());
            }
            ((List)BC.get(s2)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product)
        {
            if (product == null)
            {
                ae.W("product should be non-null");
                return this;
            } else
            {
                BE.add(product);
                return this;
            }
        }

        public HitBuilder addPromotion(Promotion promotion)
        {
            if (promotion == null)
            {
                ae.W("promotion should be non-null");
                return this;
            } else
            {
                BD.add(promotion);
                return this;
            }
        }

        public Map build()
        {
            HashMap hashmap = new HashMap(BA);
            if (BB != null)
            {
                hashmap.putAll(BB.build());
            }
            Iterator iterator = BD.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).aq(s.B(i)));
            }

            iterator = BE.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).aq(s.A(j)));
            }

            iterator = BC.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s1 = s.D(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).aq((new StringBuilder()).append(s1).append(s.C(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s1).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        protected String get(String s1)
        {
            return (String)BA.get(s1);
        }

        public final HitBuilder set(String s1, String s2)
        {
            y.eK().a(y.a.zW);
            if (s1 != null)
            {
                BA.put(s1, s2);
                return this;
            } else
            {
                ae.W(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final HitBuilder setAll(Map map)
        {
            y.eK().a(y.a.zX);
            if (map == null)
            {
                return this;
            } else
            {
                BA.putAll(new HashMap(map));
                return this;
            }
        }

        public HitBuilder setCampaignParamsFromUrl(String s1)
        {
            y.eK().a(y.a.zZ);
            s1 = an.ao(s1);
            if (TextUtils.isEmpty(s1))
            {
                return this;
            } else
            {
                s1 = an.an(s1);
                set("&cc", (String)s1.get("utm_content"));
                set("&cm", (String)s1.get("utm_medium"));
                set("&cn", (String)s1.get("utm_campaign"));
                set("&cs", (String)s1.get("utm_source"));
                set("&ck", (String)s1.get("utm_term"));
                set("&ci", (String)s1.get("utm_id"));
                set("&gclid", (String)s1.get("gclid"));
                set("&dclid", (String)s1.get("dclid"));
                set("&gmob_t", (String)s1.get("gmob_t"));
                return this;
            }
        }

        public HitBuilder setCustomDimension(int i, String s1)
        {
            set(s.y(i), s1);
            return this;
        }

        public HitBuilder setCustomMetric(int i, float f)
        {
            set(s.z(i), Float.toString(f));
            return this;
        }

        protected HitBuilder setHitType(String s1)
        {
            set("&t", s1);
            return this;
        }

        public HitBuilder setNewSession()
        {
            set("&sc", "start");
            return this;
        }

        public HitBuilder setNonInteraction(boolean flag)
        {
            set("&ni", an.E(flag));
            return this;
        }

        public HitBuilder setProductAction(ProductAction productaction)
        {
            BB = productaction;
            return this;
        }

        public HitBuilder setPromotionAction(String s1)
        {
            BA.put("&promoa", s1);
            return this;
        }

        protected HitBuilder()
        {
            BA = new HashMap();
            BC = new HashMap();
            BD = new ArrayList();
            BE = new ArrayList();
        }
    }

    public static class ItemBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ItemBuilder setCategory(String s)
        {
            set("&iv", s);
            return this;
        }

        public ItemBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public ItemBuilder setName(String s)
        {
            set("&in", s);
            return this;
        }

        public ItemBuilder setPrice(double d)
        {
            set("&ip", Double.toString(d));
            return this;
        }

        public ItemBuilder setQuantity(long l)
        {
            set("&iq", Long.toString(l));
            return this;
        }

        public ItemBuilder setSku(String s)
        {
            set("&ic", s);
            return this;
        }

        public ItemBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public ItemBuilder()
        {
            y.eK().a(y.a.AV);
            set("&t", "item");
        }
    }

    public static class ScreenViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ScreenViewBuilder()
        {
            y.eK().a(y.a.Bg);
            set("&t", "screenview");
        }
    }

    public static class SocialBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public SocialBuilder setAction(String s)
        {
            set("&sa", s);
            return this;
        }

        public SocialBuilder setNetwork(String s)
        {
            set("&sn", s);
            return this;
        }

        public SocialBuilder setTarget(String s)
        {
            set("&st", s);
            return this;
        }

        public SocialBuilder()
        {
            y.eK().a(y.a.AG);
            set("&t", "social");
        }
    }

    public static class TimingBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TimingBuilder setCategory(String s)
        {
            set("&utc", s);
            return this;
        }

        public TimingBuilder setLabel(String s)
        {
            set("&utl", s);
            return this;
        }

        public TimingBuilder setValue(long l)
        {
            set("&utt", Long.toString(l));
            return this;
        }

        public TimingBuilder setVariable(String s)
        {
            set("&utv", s);
            return this;
        }

        public TimingBuilder()
        {
            y.eK().a(y.a.AF);
            set("&t", "timing");
        }

        public TimingBuilder(String s, String s1, long l)
        {
            this();
            setVariable(s1);
            setValue(l);
            setCategory(s);
        }
    }

    public static class TransactionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TransactionBuilder setAffiliation(String s)
        {
            set("&ta", s);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public TransactionBuilder setRevenue(double d)
        {
            set("&tr", Double.toString(d));
            return this;
        }

        public TransactionBuilder setShipping(double d)
        {
            set("&ts", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTax(double d)
        {
            set("&tt", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public TransactionBuilder()
        {
            y.eK().a(y.a.AC);
            set("&t", "transaction");
        }
    }


    public HitBuilders()
    {
    }
}
