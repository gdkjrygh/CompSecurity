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
//            w, s, ac, al

public final class HitBuilders
{
    public static final class EventBuilder extends HitBuilder
    {

        private EventBuilder setAction(String s)
        {
            set("&ea", s);
            return this;
        }

        private EventBuilder setCategory(String s)
        {
            set("&ec", s);
            return this;
        }

        public final volatile Map build()
        {
            return super.build();
        }

        public final EventBuilder setLabel(String s)
        {
            set("&el", s);
            return this;
        }

        public final EventBuilder setValue(long l)
        {
            set("&ev", Long.toString(l));
            return this;
        }

        public EventBuilder()
        {
            w.eF().a(w.a.AS);
            set("&t", "event");
        }

        public EventBuilder(String s, String s1)
        {
            this();
            setCategory(s);
            setAction(s1);
        }
    }

    public static final class ExceptionBuilder extends HitBuilder
    {

        public final volatile Map build()
        {
            return super.build();
        }

        public final ExceptionBuilder setDescription(String s)
        {
            set("&exd", s);
            return this;
        }

        public final ExceptionBuilder setFatal(boolean flag)
        {
            set("&exf", al.E(flag));
            return this;
        }

        public ExceptionBuilder()
        {
            w.eF().a(w.a.AB);
            set("&t", "exception");
        }
    }

    public static class HitBuilder
    {

        Map BA;
        List BB;
        List BC;
        private Map By;
        ProductAction Bz;

        public Map build()
        {
            HashMap hashmap = new HashMap(By);
            if (Bz != null)
            {
                hashmap.putAll(Bz.build());
            }
            Iterator iterator = BB.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).ap(s.promotionPrefix(i)));
            }

            iterator = BC.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).ap(s.productPrefix(j)));
            }

            iterator = BA.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s1 = s.impressionListPrefix(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).ap((new StringBuilder()).append(s1).append(s.impressionPrefix(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s1).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        public final HitBuilder set(String s1, String s2)
        {
            w.eF().a(w.a.zU);
            if (s1 != null)
            {
                By.put(s1, s2);
                return this;
            } else
            {
                ac.w(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final HitBuilder setCampaignParamsFromUrl(String s1)
        {
            w.eF().a(w.a.zX);
            s1 = al.an(s1);
            if (TextUtils.isEmpty(s1))
            {
                return this;
            } else
            {
                s1 = al.am(s1);
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

        public final HitBuilder setCustomDimension(int i, String s1)
        {
            set(s.y(i), s1);
            return this;
        }

        public final HitBuilder setNewSession()
        {
            set("&sc", "start");
            return this;
        }

        protected HitBuilder()
        {
            By = new HashMap();
            BA = new HashMap();
            BB = new ArrayList();
            BC = new ArrayList();
        }
    }

    public static final class ScreenViewBuilder extends HitBuilder
    {

        public final volatile Map build()
        {
            return super.build();
        }

        public ScreenViewBuilder()
        {
            w.eF().a(w.a.Be);
            set("&t", "screenview");
        }
    }

    public static final class TimingBuilder extends HitBuilder
    {

        private TimingBuilder setCategory(String s)
        {
            set("&utc", s);
            return this;
        }

        private TimingBuilder setValue(long l)
        {
            set("&utt", Long.toString(l));
            return this;
        }

        private TimingBuilder setVariable(String s)
        {
            set("&utv", s);
            return this;
        }

        public final volatile Map build()
        {
            return super.build();
        }

        public TimingBuilder()
        {
            w.eF().a(w.a.AD);
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

}
