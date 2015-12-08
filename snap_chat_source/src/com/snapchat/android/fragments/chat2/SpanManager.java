// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.text.Spannable;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            SnapchatTextStyle

public final class SpanManager
{
    public static class SnapchatUnderlineSpan extends UnderlineSpan
    {

        public SnapchatUnderlineSpan()
        {
        }
    }


    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public SpanManager()
    {
        Qn.a aa[] = Qn.a.values();
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            Qn.a a1 = aa[i];
            if (!a1.equals(Qn.a.UNRECOGNIZED_VALUE))
            {
                a.put(a1, new ArrayList());
                b.put(a1, Boolean.FALSE);
            }
        }

        c.put(Qn.a.BOLD, android/text/style/StyleSpan);
        c.put(Qn.a.ITALIC, android/text/style/StyleSpan);
        c.put(Qn.a.UNDERLINE, android/text/style/UnderlineSpan);
    }

    private static boolean a(CharacterStyle characterstyle, Qn.a a1)
    {
        if (!(characterstyle instanceof StyleSpan)) goto _L2; else goto _L1
_L1:
        int i = ((StyleSpan)characterstyle).getStyle();
        if ((i != 1 || a1 != Qn.a.BOLD) && (i != 2 || a1 != Qn.a.ITALIC)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!(characterstyle instanceof UnderlineSpan))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void a(int i, int j, Qn.a a1)
    {
        List list = (List)a.get(a1);
        Collections.sort(list, new Comparator() {

            public final volatile int compare(Object obj, Object obj1)
            {
                obj = (SnapchatTextStyle)obj;
                obj1 = (SnapchatTextStyle)obj1;
                return ((SnapchatTextStyle) (obj)).b - ((SnapchatTextStyle) (obj1)).b;
            }

        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        boolean flag = false;
        int k = i;
        i = ((flag) ? 1 : 0);
        while (iterator.hasNext()) 
        {
            SnapchatTextStyle snapchattextstyle = (SnapchatTextStyle)iterator.next();
            int i1 = snapchattextstyle.b;
            int l = snapchattextstyle.c;
            if (l < k)
            {
                arraylist.add(new SnapchatTextStyle(a1, i1, l));
            } else
            if (j < i1)
            {
                if (i == 0)
                {
                    arraylist.add(new SnapchatTextStyle(a1, k, j));
                    i = 1;
                }
                arraylist.add(new SnapchatTextStyle(a1, i1, l));
            } else
            if (k >= i1 && j <= l)
            {
                if (i1 < k)
                {
                    arraylist.add(new SnapchatTextStyle(a1, i1, k));
                }
                if (j < l)
                {
                    arraylist.add(new SnapchatTextStyle(a1, j, l));
                }
                i = 1;
            } else
            {
                k = Math.min(k, i1);
                j = Math.max(j, l);
            }
        }
        if (i == 0)
        {
            arraylist.add(new SnapchatTextStyle(a1, k, j));
        }
        list.clear();
        list.addAll(arraylist);
    }

    public final void a(Spannable spannable)
    {
        Qn.a aa[] = Qn.a.values();
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            Qn.a a1 = aa[i];
            if (c.containsKey(a1))
            {
                a(spannable, a1);
            }
        }

    }

    public final void a(Spannable spannable, Qn.a a1)
    {
        Object obj;
        int i = 0;
        obj = (Class)c.get(a1);
        CharacterStyle acharacterstyle[] = (CharacterStyle[])spannable.getSpans(0, spannable.length(), ((Class) (obj)));
        for (int k = acharacterstyle.length; i < k; i++)
        {
            CharacterStyle characterstyle = acharacterstyle[i];
            if (a(characterstyle, a1))
            {
                spannable.removeSpan(characterstyle);
            }
        }

        acharacterstyle = ((List)a.get(a1)).iterator();
_L7:
        if (!acharacterstyle.hasNext()) goto _L2; else goto _L1
_L1:
        SnapchatTextStyle snapchattextstyle;
        snapchattextstyle = (SnapchatTextStyle)acharacterstyle.next();
        a1 = null;
        if (snapchattextstyle.a != Qn.a.BOLD) goto _L4; else goto _L3
_L3:
        a1 = new StyleSpan(1);
_L5:
        int j = Math.min(snapchattextstyle.c, spannable.length());
        if (a1 != null && snapchattextstyle.b < j)
        {
            spannable.setSpan(a1, snapchattextstyle.b, j, 33);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (snapchattextstyle.a == Qn.a.ITALIC)
        {
            a1 = new StyleSpan(2);
        } else
        if (snapchattextstyle.a == Qn.a.UNDERLINE)
        {
            a1 = new SnapchatUnderlineSpan();
        }
        if (true) goto _L5; else goto _L2
_L2:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(List list)
    {
        if (list != null)
        {
            Qn.a aa[] = Qn.a.values();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                Qn.a a1 = aa[i];
                if (c.containsKey(a1))
                {
                    ((List)a.get(a1)).clear();
                }
            }

            list = list.iterator();
            while (list.hasNext()) 
            {
                SnapchatTextStyle snapchattextstyle = (SnapchatTextStyle)list.next();
                List list1 = (List)a.get(snapchattextstyle.a);
                if (list1 != null)
                {
                    list1.add(new SnapchatTextStyle(snapchattextstyle.a, snapchattextstyle.b, snapchattextstyle.c));
                }
            }
        }
    }

    public final List b(Spannable spannable)
    {
        ArrayList arraylist = new ArrayList();
        Qn.a aa[] = Qn.a.values();
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            Qn.a a1 = aa[i];
            if (c.containsKey(a1))
            {
                b(spannable, a1);
                arraylist.addAll((Collection)a.get(a1));
            }
        }

        return arraylist;
    }

    public final void b(Spannable spannable, Qn.a a1)
    {
        int i = 0;
        List list = (List)a.get(a1);
        Class class1 = (Class)c.get(a1);
        list.clear();
        CharacterStyle acharacterstyle[] = (CharacterStyle[])spannable.getSpans(0, spannable.length(), class1);
        for (int j = acharacterstyle.length; i < j; i++)
        {
            CharacterStyle characterstyle = acharacterstyle[i];
            if (a(characterstyle, a1))
            {
                list.add(new SnapchatTextStyle(a1, spannable.getSpanStart(characterstyle), spannable.getSpanEnd(characterstyle)));
            }
        }

    }
}
