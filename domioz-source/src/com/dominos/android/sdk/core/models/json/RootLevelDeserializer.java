// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.models.RootLevelPromptModel;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RootLevelDeserializer
    implements v
{

    public RootLevelDeserializer()
    {
    }

    public RootLevelPromptModel deserialize(w w1, Type type, u u1)
    {
        type = new RootLevelPromptModel();
        Object obj = w1.h();
        for (w1 = ((z) (obj)).a().iterator(); w1.hasNext();)
        {
            type.key = (String)((java.util.Map.Entry)w1.next()).getKey();
        }

        w1 = new HashMap();
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext();)
        {
            Iterator iterator = ((w)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).h().a().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                PromptCategoryModel promptcategorymodel = new PromptCategoryModel();
                HashMap hashmap = new HashMap();
                promptcategorymodel.prompters = hashmap;
                java.util.Map.Entry entry1;
                PrompterModel promptermodel;
                for (Iterator iterator1 = ((w)entry.getValue()).h().a().iterator(); iterator1.hasNext(); hashmap.put(entry1.getKey(), promptermodel))
                {
                    entry1 = (java.util.Map.Entry)iterator1.next();
                    promptermodel = (PrompterModel)u1.a((w)entry1.getValue(), com/dominos/android/sdk/core/models/PrompterModel);
                }

                w1.put(entry.getKey(), promptcategorymodel);
            }
        }

        type.categories = w1;
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u1)
    {
        return deserialize(w1, type, u1);
    }
}
