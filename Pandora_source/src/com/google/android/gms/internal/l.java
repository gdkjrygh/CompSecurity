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
//            zzb

final class l
{

    static zzd.zza a(int i, JSONArray jsonarray, zzd.zza azza[], Set set)
        throws zzmq.zzg, JSONException
    {
        boolean flag = false;
        int j = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            b((new StringBuilder()).append("Value cycle detected. Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        Object obj = a(jsonarray, i, "values");
        if (azza[i] != null)
        {
            return azza[i];
        }
        set.add(Integer.valueOf(i));
        zzd.zza zza = new zzd.zza();
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            zza.type = 2;
            zza.zzhu = true;
            for (zza.zzhl = new zzd.zza[((JSONArray) (obj)).length()]; j < zza.zzhl.length; j++)
            {
                zza.zzhl[j] = a(((JSONArray) (obj)).getInt(j), jsonarray, azza, set);
            }

        } else
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("escaping");
            if (jsonarray1 != null)
            {
                zza.zzht = new int[jsonarray1.length()];
                for (int k = 0; k < zza.zzht.length; k++)
                {
                    zza.zzht[k] = jsonarray1.getInt(k);
                }

            }
            if (((JSONObject) (obj)).has("function_id"))
            {
                zza.type = 5;
                zza.zzhp = ((JSONObject) (obj)).getString("function_id");
            } else
            if (((JSONObject) (obj)).has("macro_reference"))
            {
                zza.type = 4;
                zza.zzhu = true;
                zza.zzho = zzdf.zzg(a(((JSONObject) (obj)).getInt("macro_reference"), jsonarray, azza, set));
            } else
            if (((JSONObject) (obj)).has("template_token"))
            {
                zza.type = 7;
                zza.zzhu = true;
                obj = ((JSONObject) (obj)).getJSONArray("template_token");
                zza.zzhs = new zzd.zza[((JSONArray) (obj)).length()];
                int i1 = ((flag) ? 1 : 0);
                while (i1 < zza.zzhs.length) 
                {
                    zza.zzhs[i1] = a(((JSONArray) (obj)).getInt(i1), jsonarray, azza, set);
                    i1++;
                }
            } else
            {
                zza.type = 3;
                zza.zzhu = true;
                int j1 = ((JSONObject) (obj)).length();
                zza.zzhm = new zzd.zza[j1];
                zza.zzhn = new zzd.zza[j1];
                Iterator iterator = ((JSONObject) (obj)).keys();
                j1 = 0;
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    zza.zzhm[j1] = a((new Integer(s)).intValue(), jsonarray, azza, set);
                    zza.zzhn[j1] = a(((JSONObject) (obj)).getInt(s), jsonarray, azza, set);
                    j1++;
                }
            }
        } else
        if (obj instanceof String)
        {
            zza.zzhk = (String)obj;
            zza.type = 1;
        } else
        if (obj instanceof Boolean)
        {
            zza.zzhr = ((Boolean)obj).booleanValue();
            zza.type = 8;
        } else
        if (obj instanceof Integer)
        {
            zza.zzhq = ((Integer)obj).intValue();
            zza.type = 6;
        } else
        {
            b((new StringBuilder()).append("Invalid value type: ").append(obj).toString());
        }
        azza[i] = zza;
        set.remove(Integer.valueOf(i));
        return zza;
    }

    static zzmq.zza a(JSONObject jsonobject, JSONArray jsonarray, JSONArray jsonarray1, zzd.zza azza[], int i)
        throws zzmq.zzg, JSONException
    {
        zzmq.zzb zzb1 = zzmq.zza.zzys();
        jsonobject = jsonobject.getJSONArray("property");
        i = 0;
        while (i < jsonobject.length()) 
        {
            Object obj = (JSONObject)a(jsonarray, jsonobject.getInt(i), "properties");
            String s = (String)a(jsonarray1, ((JSONObject) (obj)).getInt("key"), "key");
            obj = (zzd.zza)a(((Object []) (azza)), ((JSONObject) (obj)).getInt("value"), "value");
            if (zzb.zzeK.toString().equals(s))
            {
                zzb1.zzq(((zzd.zza) (obj)));
            } else
            {
                zzb1.zzb(s, ((zzd.zza) (obj)));
            }
            i++;
        }
        return zzb1.zzyu();
    }

    static zzmq.zzc a(String s)
        throws JSONException, zzmq.zzg
    {
        s = new JSONObject(s);
        Object obj = s.get("resource");
        zzd.zza azza[];
        List list;
        List list1;
        Object obj1;
        Object obj2;
        if (obj instanceof JSONObject)
        {
            obj1 = (JSONObject)obj;
            obj = zzmq.zzc.zzyv();
            azza = a(((JSONObject) (obj1)));
            obj2 = ((JSONObject) (obj1)).getJSONArray("properties");
            JSONArray jsonarray = ((JSONObject) (obj1)).getJSONArray("key");
            list = a(((JSONObject) (obj1)).getJSONArray("tags"), ((JSONArray) (obj2)), jsonarray, azza);
            list1 = a(((JSONObject) (obj1)).getJSONArray("predicates"), ((JSONArray) (obj2)), jsonarray, azza);
            obj2 = a(((JSONObject) (obj1)).getJSONArray("macros"), ((JSONArray) (obj2)), jsonarray, azza);
            for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((zzmq.zzd) (obj)).zzc((zzmq.zza)iterator.next())) { }
        } else
        {
            throw new zzmq.zzg("Resource map not found");
        }
        obj1 = ((JSONObject) (obj1)).getJSONArray("rules");
        for (int i = 0; i < ((JSONArray) (obj1)).length(); i++)
        {
            ((zzmq.zzd) (obj)).zzb(a(((JSONArray) (obj1)).getJSONObject(i), list, ((List) (obj2)), list1, azza));
        }

        ((zzmq.zzd) (obj)).zzen("1");
        ((zzmq.zzd) (obj)).zzhM(1);
        if (s.optJSONArray("runtime") == null);
        return ((zzmq.zzd) (obj)).zzyy();
    }

    static zzmq.zze a(JSONObject jsonobject, List list, List list1, List list2, zzd.zza azza[])
        throws JSONException
    {
        zzmq.zzf zzf = zzmq.zze.zzyz();
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
                zzf.zzd((zzmq.zza)list2.get(jsonarray.getInt(i)));
            }

        }
        if (jsonarray1 != null)
        {
            for (int j = 0; j < jsonarray1.length(); j++)
            {
                zzf.zze((zzmq.zza)list2.get(jsonarray1.getInt(j)));
            }

        }
        if (jsonarray2 != null)
        {
            for (int k = 0; k < jsonarray2.length(); k++)
            {
                zzf.zzf((zzmq.zza)list.get(jsonarray2.getInt(k)));
            }

        }
        if (jsonarray3 != null)
        {
            for (int i1 = 0; i1 < jsonarray3.length(); i1++)
            {
                zzf.zzg((zzmq.zza)list.get(jsonarray3.getInt(i1)));
            }

        }
        if (jsonarray4 != null)
        {
            for (int j1 = 0; j1 < jsonarray4.length(); j1++)
            {
                zzf.zzeo(azza[jsonarray4.getInt(j1)].zzhk);
            }

        }
        if (jsonarray5 != null)
        {
            for (int k1 = 0; k1 < jsonarray5.length(); k1++)
            {
                zzf.zzep(azza[jsonarray5.getInt(k1)].zzhk);
            }

        }
        if (jsonarray6 != null)
        {
            for (int l1 = 0; l1 < jsonarray6.length(); l1++)
            {
                zzf.zzh((zzmq.zza)list1.get(jsonarray6.getInt(l1)));
            }

        }
        if (jsonarray7 != null)
        {
            for (int i2 = 0; i2 < jsonarray7.length(); i2++)
            {
                zzf.zzi((zzmq.zza)list1.get(jsonarray7.getInt(i2)));
            }

        }
        if (jsonarray8 != null)
        {
            for (int j2 = 0; j2 < jsonarray8.length(); j2++)
            {
                zzf.zzeq(azza[jsonarray8.getInt(j2)].zzhk);
            }

        }
        if (jsonobject != null)
        {
            for (int k2 = 0; k2 < jsonobject.length(); k2++)
            {
                zzf.zzer(azza[jsonobject.getInt(k2)].zzhk);
            }

        }
        return zzf.zzyK();
    }

    private static Object a(JSONArray jsonarray, int i, String s)
        throws zzmq.zzg
    {
        if (i < 0 || i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        jsonarray = ((JSONArray) (jsonarray.get(i)));
        return jsonarray;
        jsonarray;
        b((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        return null;
    }

    private static Object a(Object aobj[], int i, String s)
        throws zzmq.zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            b((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    static List a(JSONArray jsonarray, JSONArray jsonarray1, JSONArray jsonarray2, zzd.zza azza[])
        throws JSONException, zzmq.zzg
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(a(jsonarray.getJSONObject(i), jsonarray1, jsonarray2, azza, i));
        }

        return arraylist;
    }

    static zzd.zza[] a(JSONObject jsonobject)
        throws JSONException, zzmq.zzg
    {
        jsonobject = ((JSONObject) (jsonobject.opt("values")));
        zzd.zza azza[];
        if (jsonobject instanceof JSONArray)
        {
            jsonobject = (JSONArray)jsonobject;
            azza = new zzd.zza[jsonobject.length()];
            for (int i = 0; i < azza.length; i++)
            {
                a(i, ((JSONArray) (jsonobject)), azza, ((Set) (new HashSet(0))));
            }

        } else
        {
            throw new zzmq.zzg("Missing Values list");
        }
        return azza;
    }

    private static void b(String s)
        throws zzmq.zzg
    {
        zzbg.zzak(s);
        throw new zzmq.zzg(s);
    }
}
