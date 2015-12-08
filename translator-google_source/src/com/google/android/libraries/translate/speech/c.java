// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.speech.s3.a;
import com.google.g.a.a.e;
import com.google.g.a.a.h;
import com.google.g.a.a.o;
import com.google.g.a.a.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.speech:
//            d

public final class c
{

    public final Set a = new HashSet();
    public final Set b = new HashSet();
    final Set c = new HashSet();
    public final Set d = new HashSet();
    String e;
    String f;
    private final Context g;
    private final Set h = new HashSet();
    private boolean i;
    private long j;

    public c(Context context)
    {
        j = 0L;
        g = context;
        i = false;
    }

    public static List a(String s, List list)
    {
        if (list == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            if (!TextUtils.equals(s, s1) && !arraylist.contains(s1))
            {
                arraylist.add(s1);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            return null;
        } else
        {
            return arraylist;
        }
    }

    static void a(String s, Set set, Set set1)
    {
        set.add(s);
        s = com.google.android.libraries.translate.e.f.b(s);
        if (!TextUtils.isEmpty(s))
        {
            set1.add(s);
        }
    }

    public final String a(Context context, Language language)
    {
        context = com.google.android.libraries.translate.core.b.h(context, language.getShortName());
        if (!TextUtils.isEmpty(context) && (a(((String) (context))) || b(context)))
        {
            return context;
        }
        if (!TextUtils.isEmpty(f) && f.equals(language.getShortName()))
        {
            return e;
        }
        context = language.getShortName();
        if (context.equals("zh-CN"))
        {
            if (!TextUtils.isEmpty(e) && e.endsWith("-HK"))
            {
                return "cmn-Hans-HK";
            } else
            {
                return "cmn-Hans-CN";
            }
        }
        if (context.equals("zh-TW"))
        {
            if (!TextUtils.isEmpty(e) && e.endsWith("-HK"))
            {
                return "yue-Hant-HK";
            } else
            {
                return "cmn-Hant-TW";
            }
        } else
        {
            return language.getShortName();
        }
    }

    public final void a()
    {
        boolean flag;
label0:
        {
            boolean flag2 = true;
            if (!i)
            {
                e e1 = (new a(g)).b;
                if (e1 != null)
                {
                    h.clear();
                    a.clear();
                    i = true;
                    o ao[] = e1.b;
                    int j1 = ao.length;
                    for (int k = 0; k < j1; k++)
                    {
                        h ah[] = ao[k].a;
                        int k1 = ah.length;
                        for (int l = 0; l < k1; l++)
                        {
                            a(ah[l].a, a, h);
                        }

                    }

                    b.clear();
                    p ap[] = e1.e;
                    j1 = ap.length;
                    int i1 = 0;
                    do
                    {
                        flag = flag2;
                        if (i1 >= j1)
                        {
                            break;
                        }
                        String s = com.google.android.libraries.translate.e.f.b(ap[i1].a);
                        b.add(com.google.android.libraries.translate.languages.c.b(s));
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            flag = false;
        }
        boolean flag1 = flag;
        if (System.currentTimeMillis() - j > 0x927c0L)
        {
            flag1 = flag;
            if (!g.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).isEmpty())
            {
                j = System.currentTimeMillis();
                g.sendOrderedBroadcast(new Intent("android.speech.action.GET_LANGUAGE_DETAILS"), null, new d(this), null, -1, null, null);
                flag1 = false;
            }
        }
        if (flag1)
        {
            com.google.android.libraries.translate.e.h.a(18);
        }
    }

    public final boolean a(String s)
    {
        return a.contains(s) || h.contains(s);
    }

    public final transient boolean a(Language alanguage[])
    {
        int l = alanguage.length;
        for (int k = 0; k < l; k++)
        {
            Language language = alanguage[k];
            if (!h.contains(language.getShortName()) && !c.contains(language.getShortName()))
            {
                return false;
            }
        }

        return true;
    }

    public final boolean b(String s)
    {
        return d.contains(s) || c.contains(s);
    }
}
