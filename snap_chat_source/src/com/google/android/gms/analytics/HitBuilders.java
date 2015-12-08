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
//            zzae, zzs, zzy, zzan

public class HitBuilders
{
    public static class HitBuilder
    {

        private Map zzED;
        ProductAction zzEE;
        Map zzEF;
        List zzEG;
        List zzEH;

        public HitBuilder addImpression(Product product, String s)
        {
            if (product == null)
            {
                zzae.zzac("product should be non-null");
                return this;
            }
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            if (!zzEF.containsKey(s1))
            {
                zzEF.put(s1, new ArrayList());
            }
            ((List)zzEF.get(s1)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product)
        {
            if (product == null)
            {
                zzae.zzac("product should be non-null");
                return this;
            } else
            {
                zzEH.add(product);
                return this;
            }
        }

        public HitBuilder addPromotion(Promotion promotion)
        {
            if (promotion == null)
            {
                zzae.zzac("promotion should be non-null");
                return this;
            } else
            {
                zzEG.add(promotion);
                return this;
            }
        }

        public Map build()
        {
            HashMap hashmap = new HashMap(zzED);
            if (zzEE != null)
            {
                hashmap.putAll(zzEE.build());
            }
            Iterator iterator = zzEG.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).zzaw(zzs.zzH(i)));
            }

            iterator = zzEH.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).zzaw(zzs.zzG(j)));
            }

            iterator = zzEF.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = zzs.zzJ(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).zzaw((new StringBuilder()).append(s).append(zzs.zzI(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        public final HitBuilder set(String s, String s1)
        {
            zzy.zzfV().zza(zzy.zza.zzCV);
            if (s != null)
            {
                zzED.put(s, s1);
                return this;
            } else
            {
                zzae.zzac(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final HitBuilder setAll(Map map)
        {
            zzy.zzfV().zza(zzy.zza.zzCW);
            if (map == null)
            {
                return this;
            } else
            {
                zzED.putAll(new HashMap(map));
                return this;
            }
        }

        public HitBuilder setCampaignParamsFromUrl(String s)
        {
            zzy.zzfV().zza(zzy.zza.zzCY);
            s = zzan.zzau(s);
            if (TextUtils.isEmpty(s))
            {
                return this;
            } else
            {
                s = zzan.zzat(s);
                set("&cc", (String)s.get("utm_content"));
                set("&cm", (String)s.get("utm_medium"));
                set("&cn", (String)s.get("utm_campaign"));
                set("&cs", (String)s.get("utm_source"));
                set("&ck", (String)s.get("utm_term"));
                set("&ci", (String)s.get("utm_id"));
                set("&gclid", (String)s.get("gclid"));
                set("&dclid", (String)s.get("dclid"));
                set("&gmob_t", (String)s.get("gmob_t"));
                return this;
            }
        }

        public HitBuilder setProductAction(ProductAction productaction)
        {
            zzEE = productaction;
            return this;
        }

        protected HitBuilder()
        {
            zzED = new HashMap();
            zzEF = new HashMap();
            zzEG = new ArrayList();
            zzEH = new ArrayList();
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
            zzy.zzfV().zza(zzy.zza.zzEf);
            set("&t", "screenview");
        }
    }

}
