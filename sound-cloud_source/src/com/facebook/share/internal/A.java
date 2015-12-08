// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class A
{
    public static interface a
    {

        public abstract JSONObject a(SharePhoto sharephoto);
    }


    private static Object a(Object obj, a a1)
        throws JSONException
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = JSONObject.NULL;
        } else
        {
            obj1 = obj;
            if (!(obj instanceof String))
            {
                obj1 = obj;
                if (!(obj instanceof Boolean))
                {
                    obj1 = obj;
                    if (!(obj instanceof Double))
                    {
                        obj1 = obj;
                        if (!(obj instanceof Float))
                        {
                            obj1 = obj;
                            if (!(obj instanceof Integer))
                            {
                                obj1 = obj;
                                if (!(obj instanceof Long))
                                {
                                    if (obj instanceof SharePhoto)
                                    {
                                        if (a1 != null)
                                        {
                                            return a1.a((SharePhoto)obj);
                                        } else
                                        {
                                            return null;
                                        }
                                    }
                                    if (obj instanceof ShareOpenGraphObject)
                                    {
                                        obj = (ShareOpenGraphObject)obj;
                                        JSONObject jsonobject = new JSONObject();
                                        String s;
                                        for (Iterator iterator = ((ShareOpenGraphValueContainer) (obj)).a.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, a(((ShareOpenGraphObject) (obj)).a(s), a1)))
                                        {
                                            s = (String)iterator.next();
                                        }

                                        return jsonobject;
                                    }
                                    if (obj instanceof List)
                                    {
                                        return a((List)obj, a1);
                                    } else
                                    {
                                        throw new IllegalArgumentException((new StringBuilder("Invalid object found for JSON serialization: ")).append(obj.toString()).toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return obj1;
    }

    private static JSONArray a(List list, a a1)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(a(list.next(), a1))) { }
        return jsonarray;
    }

    public static JSONObject a(ShareOpenGraphAction shareopengraphaction, a a1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = ((ShareOpenGraphValueContainer) (shareopengraphaction)).a.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, a(shareopengraphaction.a(s), a1)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }
}
