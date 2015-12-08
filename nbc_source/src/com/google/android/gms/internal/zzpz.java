// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzae

final class zzpz
{

    static zzag.zza zza(int i, JSONArray jsonarray, zzag.zza azza[], Set set)
        throws zzqf.zzg, JSONException
    {
        boolean flag = false;
        int j = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            zzeT((new StringBuilder()).append("Value cycle detected. Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        Object obj = zza(jsonarray, i, "values");
        if (azza[i] != null)
        {
            return azza[i];
        }
        set.add(Integer.valueOf(i));
        zzag.zza zza1 = new zzag.zza();
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            zza1.type = 2;
            zza1.zzjb = true;
            for (zza1.zziS = new zzag.zza[((JSONArray) (obj)).length()]; j < zza1.zziS.length; j++)
            {
                zza1.zziS[j] = zza(((JSONArray) (obj)).getInt(j), jsonarray, azza, set);
            }

        } else
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("escaping");
            if (jsonarray1 != null)
            {
                zza1.zzja = new int[jsonarray1.length()];
                for (int k = 0; k < zza1.zzja.length; k++)
                {
                    zza1.zzja[k] = jsonarray1.getInt(k);
                }

            }
            if (((JSONObject) (obj)).has("function_id"))
            {
                zza1.type = 5;
                zza1.zziW = ((JSONObject) (obj)).getString("function_id");
            } else
            if (((JSONObject) (obj)).has("macro_reference"))
            {
                zza1.type = 4;
                zza1.zzjb = true;
                zza1.zziV = zzdf.zzg(zza(((JSONObject) (obj)).getInt("macro_reference"), jsonarray, azza, set));
            } else
            if (((JSONObject) (obj)).has("template_token"))
            {
                zza1.type = 7;
                zza1.zzjb = true;
                obj = ((JSONObject) (obj)).getJSONArray("template_token");
                zza1.zziZ = new zzag.zza[((JSONArray) (obj)).length()];
                int l = ((flag) ? 1 : 0);
                while (l < zza1.zziZ.length) 
                {
                    zza1.zziZ[l] = zza(((JSONArray) (obj)).getInt(l), jsonarray, azza, set);
                    l++;
                }
            } else
            {
                zza1.type = 3;
                zza1.zzjb = true;
                int i1 = ((JSONObject) (obj)).length();
                zza1.zziT = new zzag.zza[i1];
                zza1.zziU = new zzag.zza[i1];
                Iterator iterator = ((JSONObject) (obj)).keys();
                i1 = 0;
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    zza1.zziT[i1] = zza((new Integer(s)).intValue(), jsonarray, azza, set);
                    zza1.zziU[i1] = zza(((JSONObject) (obj)).getInt(s), jsonarray, azza, set);
                    i1++;
                }
            }
        } else
        if (obj instanceof String)
        {
            zza1.zziR = (String)obj;
            zza1.type = 1;
        } else
        if (obj instanceof Boolean)
        {
            zza1.zziY = ((Boolean)obj).booleanValue();
            zza1.type = 8;
        } else
        if (obj instanceof Integer)
        {
            zza1.zziX = ((Integer)obj).intValue();
            zza1.type = 6;
        } else
        {
            zzeT((new StringBuilder()).append("Invalid value type: ").append(obj).toString());
        }
        azza[i] = zza1;
        set.remove(Integer.valueOf(i));
        return zza1;
    }

    static zzqf.zza zza(JSONObject jsonobject, JSONArray jsonarray, JSONArray jsonarray1, zzag.zza azza[], int i)
        throws zzqf.zzg, JSONException
    {
        zzqf.zzb zzb = zzqf.zza.zzAm();
        jsonobject = jsonobject.getJSONArray("property");
        i = 0;
        while (i < jsonobject.length()) 
        {
            Object obj = (JSONObject)zza(jsonarray, jsonobject.getInt(i), "properties");
            String s = (String)zza(jsonarray1, ((JSONObject) (obj)).getInt("key"), "key");
            obj = (zzag.zza)zza(((Object []) (azza)), ((JSONObject) (obj)).getInt("value"), "value");
            if (zzae.zzgs.toString().equals(s))
            {
                zzb.zzq(((zzag.zza) (obj)));
            } else
            {
                zzb.zzb(s, ((zzag.zza) (obj)));
            }
            i++;
        }
        return zzb.zzAo();
    }

    static zzqf.zze zza(JSONObject jsonobject, List list, List list1, List list2, zzag.zza azza[])
        throws JSONException
    {
        zzqf.zzf zzf = zzqf.zze.zzAt();
        JSONArray jsonarray = jsonobject.optJSONArray("positive_predicate");
        JSONArray jsonarray1 = jsonobject.optJSONArray("negative_predicate");
        JSONArray jsonarray2 = jsonobject.optJSONArray("add_tag");
        JSONArray jsonarray3 = jsonobject.optJSONArray("remove_tag");
        JSONArray jsonarray4 = jsonobject.optJSONArray("add_tag_rule_name");
        JSONArray jsonarray5 = jsonobject.optJSONArray("remove_tag_rule_name");
        JSONArray jsonarray6 = jsonobject.optJSONArray("add_macro");
        JSONArray jsonarray7 = jsonobject.optJSONArray("remove_macro");
        JSONArray jsonarray8 = jsonobject.optJSONArray("add_macro_rule_name");
        jsonobject = jsonobject.optJSONArray("remove_macro_rule_name");
        if (jsonarray != null)
        {
            for (int i = 0; i < jsonarray.length(); i++)
            {
                zzf.zzd((zzqf.zza)list2.get(jsonarray.getInt(i)));
            }

        }
        if (jsonarray1 != null)
        {
            for (int j = 0; j < jsonarray1.length(); j++)
            {
                zzf.zze((zzqf.zza)list2.get(jsonarray1.getInt(j)));
            }

        }
        if (jsonarray2 != null)
        {
            for (int k = 0; k < jsonarray2.length(); k++)
            {
                zzf.zzf((zzqf.zza)list.get(jsonarray2.getInt(k)));
            }

        }
        if (jsonarray3 != null)
        {
            for (int l = 0; l < jsonarray3.length(); l++)
            {
                zzf.zzg((zzqf.zza)list.get(jsonarray3.getInt(l)));
            }

        }
        if (jsonarray4 != null)
        {
            for (int i1 = 0; i1 < jsonarray4.length(); i1++)
            {
                zzf.zzeW(azza[jsonarray4.getInt(i1)].zziR);
            }

        }
        if (jsonarray5 != null)
        {
            for (int j1 = 0; j1 < jsonarray5.length(); j1++)
            {
                zzf.zzeX(azza[jsonarray5.getInt(j1)].zziR);
            }

        }
        if (jsonarray6 != null)
        {
            for (int k1 = 0; k1 < jsonarray6.length(); k1++)
            {
                zzf.zzh((zzqf.zza)list1.get(jsonarray6.getInt(k1)));
            }

        }
        if (jsonarray7 != null)
        {
            for (int l1 = 0; l1 < jsonarray7.length(); l1++)
            {
                zzf.zzi((zzqf.zza)list1.get(jsonarray7.getInt(l1)));
            }

        }
        if (jsonarray8 != null)
        {
            for (int i2 = 0; i2 < jsonarray8.length(); i2++)
            {
                zzf.zzeY(azza[jsonarray8.getInt(i2)].zziR);
            }

        }
        if (jsonobject != null)
        {
            for (int j2 = 0; j2 < jsonobject.length(); j2++)
            {
                zzf.zzeZ(azza[jsonobject.getInt(j2)].zziR);
            }

        }
        return zzf.zzAE();
    }

    private static Object zza(JSONArray jsonarray, int i, String s)
        throws zzqf.zzg
    {
        if (i < 0 || i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        jsonarray = ((JSONArray) (jsonarray.get(i)));
        return jsonarray;
        jsonarray;
        zzeT((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        return null;
    }

    private static Object zza(Object aobj[], int i, String s)
        throws zzqf.zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            zzeT((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    static List zza(JSONArray jsonarray, JSONArray jsonarray1, JSONArray jsonarray2, zzag.zza azza[])
        throws JSONException, zzqf.zzg
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(zza(jsonarray.getJSONObject(i), jsonarray1, jsonarray2, azza, i));
        }

        return arraylist;
    }

    private static void zzeT(String s)
        throws zzqf.zzg
    {
        zzbg.zzaz(s);
        throw new zzqf.zzg(s);
    }

    static zzqf.zzc zzey(String s)
        throws JSONException, zzqf.zzg
    {
        s = new JSONObject(s);
        Object obj = s.get("resource");
        zzag.zza azza[];
        List list;
        List list1;
        Object obj1;
        Object obj2;
        if (obj instanceof JSONObject)
        {
            obj1 = (JSONObject)obj;
            obj = zzqf.zzc.zzAp();
            azza = zzj(((JSONObject) (obj1)));
            obj2 = ((JSONObject) (obj1)).getJSONArray("properties");
            JSONArray jsonarray = ((JSONObject) (obj1)).getJSONArray("key");
            list = zza(((JSONObject) (obj1)).getJSONArray("tags"), ((JSONArray) (obj2)), jsonarray, azza);
            list1 = zza(((JSONObject) (obj1)).getJSONArray("predicates"), ((JSONArray) (obj2)), jsonarray, azza);
            obj2 = zza(((JSONObject) (obj1)).getJSONArray("macros"), ((JSONArray) (obj2)), jsonarray, azza);
            for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((zzqf.zzd) (obj)).zzc((zzqf.zza)iterator.next())) { }
        } else
        {
            throw new zzqf.zzg("Resource map not found");
        }
        obj1 = ((JSONObject) (obj1)).getJSONArray("rules");
        for (int i = 0; i < ((JSONArray) (obj1)).length(); i++)
        {
            ((zzqf.zzd) (obj)).zzb(zza(((JSONArray) (obj1)).getJSONObject(i), list, ((List) (obj2)), list1, azza));
        }

        ((zzqf.zzd) (obj)).zzeV("1");
        ((zzqf.zzd) (obj)).zzjb(1);
        if (s.optJSONArray("runtime") == null);
        return ((zzqf.zzd) (obj)).zzAs();
    }

    static zzag.zza[] zzj(JSONObject jsonobject)
        throws JSONException, zzqf.zzg
    {
        jsonobject = ((JSONObject) (jsonobject.opt("values")));
        zzag.zza azza[];
        if (jsonobject instanceof JSONArray)
        {
            jsonobject = (JSONArray)jsonobject;
            azza = new zzag.zza[jsonobject.length()];
            for (int i = 0; i < azza.length; i++)
            {
                zza(i, jsonobject, azza, new HashSet(0));
            }

        } else
        {
            throw new zzqf.zzg("Missing Values list");
        }
        return azza;
    }
}
