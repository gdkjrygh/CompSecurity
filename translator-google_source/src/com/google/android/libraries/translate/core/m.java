// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.core:
//            Entry

public final class m
{

    public final String a[];
    public final String b;

    public m(Entry entry)
    {
        this(entry.getOutputText());
    }

    public m(String s)
    {
        b = "";
        s = b(s);
        if (s.length == 7)
        {
            a = s;
            return;
        } else
        {
            a = (String[])Arrays.copyOf(s, 7);
            Arrays.fill(a, s.length, 7, "");
            return;
        }
    }

    private m(String as[], String s)
    {
        a = as;
        b = s;
    }

    public static m a(String s, String s1)
    {
        if (!s1.isNull("spell_res"))
        {
            as[4] = s1.getString("spell_res");
        }
        continue;
        boolean flag = false;
        String as[] = new String[7];
        Arrays.fill(as, "");
        JSONObject jsonobject = new JSONObject(s1);
        if (!jsonobject.isNull("sentences"))
        {
            s1 = new StringBuilder();
            StringBuilder stringbuilder = new StringBuilder();
            StringBuilder stringbuilder2 = new StringBuilder();
            JSONArray jsonarray = jsonobject.getJSONArray("sentences");
            int l = jsonarray.length();
            for (int i = 0; i < l; i++)
            {
                if (jsonarray.isNull(i))
                {
                    continue;
                }
                JSONObject jsonobject1 = jsonarray.getJSONObject(i);
                if (!jsonobject1.isNull("trans"))
                {
                    s1.append(jsonobject1.getString("trans"));
                }
                if (!jsonobject1.isNull("src_translit"))
                {
                    stringbuilder.append(jsonobject1.getString("src_translit"));
                }
                if (!jsonobject1.isNull("translit"))
                {
                    stringbuilder2.append(jsonobject1.getString("translit"));
                }
            }

            as[0] = s1.toString();
            as[3] = stringbuilder.toString();
            as[1] = stringbuilder2.toString();
        }
        if (!jsonobject.isNull("spell"))
        {
            s1 = jsonobject.getJSONObject("spell");
            if (s1.isNull("spell_html_res"))
            {
                break MISSING_BLOCK_LABEL_466;
            }
            as[4] = s1.getString("spell_html_res");
        }
        do
        {
            if (!jsonobject.isNull("ld_result"))
            {
                s1 = jsonobject.getJSONObject("ld_result");
                if (!s1.isNull("srclangs"))
                {
                    as[5] = s1.getJSONArray("srclangs").join(",").replace("\"", "");
                }
            }
            if (!jsonobject.isNull("dict"))
            {
                s1 = jsonobject.getJSONArray("dict");
                int j1 = s1.length();
                if (j1 > 0)
                {
                    StringBuilder stringbuilder1 = new StringBuilder();
                    for (int j = 0; j < j1; j++)
                    {
                        if (s1.isNull(j))
                        {
                            continue;
                        }
                        Object obj = s1.getJSONObject(j);
                        if (!((JSONObject) (obj)).isNull("pos"))
                        {
                            String s2 = ((JSONObject) (obj)).getString("pos");
                            if (!TextUtils.isEmpty(s2))
                            {
                                stringbuilder1.append(s2).append(":\n");
                            }
                        }
                        if (!((JSONObject) (obj)).isNull("terms"))
                        {
                            obj = ((JSONObject) (obj)).getJSONArray("terms");
                            int k1 = ((JSONArray) (obj)).length();
                            for (int i1 = 1; i1 <= k1; i1++)
                            {
                                stringbuilder1.append(" ").append(i1).append(". ").append(((JSONArray) (obj)).getString(i1 - 1)).append("\n");
                            }

                        }
                        stringbuilder1.append("\n");
                    }

                    as[2] = stringbuilder1.toString();
                }
            }
            int k = ((flag) ? 1 : 0);
            s1 = s;
            if ("auto".equals(s))
            {
                if (!jsonobject.isNull("src"))
                {
                    s1 = jsonobject.getString("src");
                    k = ((flag) ? 1 : 0);
                } else
                {
                    s1 = "en";
                    k = ((flag) ? 1 : 0);
                }
            }
            for (; k < 7; k++)
            {
                as[k] = as[k].replace('\t', ' ');
            }

            return new m(as, s1);
        } while (true);
    }

    public static m b(String s, String s1)
    {
        String as[] = new String[7];
        Arrays.fill(as, "");
        s1 = b(s1);
        as[0] = s1[0];
        if (s1.length > 1)
        {
            as[2] = s1[1];
        }
        as[6] = "offline";
        return new m(as, s);
    }

    private static String[] b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return (new String[] {
                ""
            });
        } else
        {
            return s.split("\t", 7);
        }
    }

    public final String a(int i)
    {
        if (i < a.length)
        {
            return a[i];
        } else
        {
            return "";
        }
    }

    public final String a(String s)
    {
        String s1;
        Iterator iterator;
        if (TextUtils.isEmpty(a(5)))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        android.text.TextUtils.SimpleStringSplitter simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter(',');
        simplestringsplitter.setString(a(5));
        s1 = null;
        iterator = simplestringsplitter.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s3 = (String)iterator.next();
        if (TextUtils.isEmpty(s3)) goto _L4; else goto _L3
_L3:
        String s2 = s1;
        if (s1 == null)
        {
            s2 = s3;
        }
        s1 = s2;
        if (!TextUtils.equals(s3, s)) goto _L4; else goto _L5
_L5:
        s = "";
_L7:
        return s;
_L2:
        s = s1;
        if (s1 != null) goto _L7; else goto _L6
_L6:
        return "";
        return "";
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(a(6));
    }

    public final boolean b()
    {
        int i = a.length;
        boolean flag1 = false;
        boolean flag = flag1;
        if (i > 4)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(a[4]))
            {
                a[4] = "";
                flag = true;
            }
        }
        if (i > 5 && !TextUtils.isEmpty(a[5]))
        {
            a[5] = "";
            return true;
        } else
        {
            return flag;
        }
    }

    public final String toString()
    {
        return TextUtils.join("\t", a);
    }
}
