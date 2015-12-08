// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.webkit.WebView;
import android.widget.TextView;
import com.kik.android.c.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package kik.android.util:
//            w, x, y, ca, 
//            bt, z, bw, ci

public final class v
{
    public static interface a
    {

        public abstract boolean a(CharSequence charsequence, int i, int j);
    }

    public static interface b
    {

        public abstract String a(Matcher matcher);
    }


    public static final a a = new w();
    public static final a b = new x();
    public static final b c = new y();
    private static final Pattern d = Pattern.compile("[^\\s]{200,}");

    private static String a(String s, String as[], Matcher matcher, b b1)
    {
        boolean flag1 = true;
        int i;
        boolean flag;
        if (b1 != null)
        {
            matcher = b1.a(matcher);
        } else
        {
            matcher = s;
        }
        i = 0;
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (!matcher.regionMatches(true, 0, as[i], 0, as[i].length())) goto _L2; else goto _L1
_L1:
        s = matcher;
        flag = flag1;
        if (!matcher.regionMatches(false, 0, as[i], 0, as[i].length()))
        {
            s = (new StringBuilder()).append(as[i]).append(matcher.substring(as[i].length())).toString();
            flag = flag1;
        }
_L4:
        matcher = s;
        if (!flag)
        {
            matcher = (new StringBuilder()).append(as[0]).append(s).toString();
        }
        return matcher;
_L2:
        i++;
        break MISSING_BLOCK_LABEL_18;
        flag = false;
        s = matcher;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List a(String s)
    {
        return a(s, new String[] {
            "http://", "https://", "rtsp://"
        });
    }

    public static List a(String s, String as[])
    {
        ArrayList arraylist = new ArrayList();
        a(((List) (arraylist)), ((Spannable) (SpannableString.valueOf(s))), kik.android.util.ca.b, as, a);
        s = new ArrayList(arraylist.size());
        for (as = arraylist.iterator(); as.hasNext(); s.add(((bt)as.next()).a)) { }
        return s;
    }

    private static void a(ArrayList arraylist)
    {
        Collections.sort(arraylist, new z());
        int k = arraylist.size();
        int j = 0;
        do
        {
            if (j >= k - 1)
            {
                break;
            }
            bt bt1 = (bt)arraylist.get(j);
            bt bt2 = (bt)arraylist.get(j + 1);
            if (bt1.b <= bt2.b && bt1.c > bt2.b)
            {
                int i;
                if (bt2.c <= bt1.c)
                {
                    i = j + 1;
                } else
                if (bt1.c - bt1.b > bt2.c - bt2.b)
                {
                    i = j + 1;
                } else
                if (bt1.c - bt1.b < bt2.c - bt2.b)
                {
                    i = j;
                } else
                {
                    i = -1;
                }
                if (i != -1)
                {
                    arraylist.remove(i);
                    k--;
                    continue;
                }
            }
            j++;
        } while (true);
    }

    private static void a(ArrayList arraylist, Spannable spannable)
    {
        int i;
        spannable = spannable.toString();
        i = 0;
_L2:
        bt bt1;
        String s;
        s = WebView.findAddress(spannable);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        int j = spannable.indexOf(s);
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        bt1 = new bt();
        int k = s.length() + j;
        bt1.b = j + i;
        bt1.c = i + k;
        spannable = spannable.substring(k);
        i += k;
        s = URLEncoder.encode(s, "UTF-8");
        bt1.a = (new StringBuilder("geo:0,0?q=")).append(s).toString();
        arraylist.add(bt1);
        continue; /* Loop/switch isn't completed */
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(ArrayList arraylist, Spannable spannable, Pattern pattern, String as[])
    {
        String as1[] = as;
        if (as == null)
        {
            as1 = new String[0];
        }
        as = spannable.toString();
        spannable = pattern.matcher(spannable);
        do
        {
            if (!spannable.find())
            {
                break;
            }
            int i = spannable.start();
            if (i < 0)
            {
                break;
            }
            pattern = new bt();
            int j = spannable.end();
            pattern.b = i;
            pattern.c = j;
            pattern.a = a(as.substring(i, j), as1, ((Matcher) (null)), ((b) (null)));
            arraylist.add(pattern);
        } while (true);
    }

    private static void a(List list, Spannable spannable, Pattern pattern, String as[], a a1)
    {
        if (d.matcher(spannable).find())
        {
            return;
        } else
        {
            a(list, spannable, pattern, as, a1, null);
            return;
        }
    }

    private static void a(List list, Spannable spannable, Pattern pattern, String as[], a a1, b b1)
    {
        pattern = pattern.matcher(spannable);
        do
        {
            if (!pattern.find())
            {
                break;
            }
            int i = pattern.start();
            int j = pattern.end();
            if (a1 == null || a1.a(spannable, i, j))
            {
                bt bt1 = new bt();
                bt1.a = a(pattern.group(0), as, ((Matcher) (pattern)), b1);
                bt1.b = i;
                bt1.c = j;
                list.add(bt1);
            }
        } while (true);
    }

    private static boolean a(Spannable spannable, Pattern pattern, String as[], bw.a a1)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        for (int i = aurlspan.length - 1; i >= 0; i--)
        {
            spannable.removeSpan(aurlspan[i]);
        }

        ArrayList arraylist = new ArrayList();
        Pattern pattern1 = kik.android.util.ca.b;
        a a2 = a;
        a(((List) (arraylist)), spannable, pattern1, new String[] {
            "http://", "https://", "rtsp://"
        }, a2);
        a(((List) (arraylist)), spannable, ca.e, new String[] {
            "mailto:"
        }, null, null);
        pattern1 = ca.f;
        a2 = b;
        b b1 = c;
        a(((List) (arraylist)), spannable, pattern1, new String[] {
            "tel:"
        }, a2, b1);
        a(arraylist, spannable);
        if (pattern != null)
        {
            a(arraylist, spannable, pattern, as);
        }
        a(arraylist);
        if (arraylist.size() == 0)
        {
            return false;
        }
        int j;
        int k;
        for (pattern = arraylist.iterator(); pattern.hasNext(); spannable.setSpan(new bw(((bt) (as)).a, a1), j, k, 33))
        {
            as = (bt)pattern.next();
            j = ((bt) (as)).b;
            k = ((bt) (as)).c;
        }

        return true;
    }

    public static boolean a(TextView textview)
    {
        if (textview == null)
        {
            return false;
        }
        CharSequence charsequence = textview.getText();
        if ((charsequence instanceof Spannable) && ((com.kik.android.c.b[])((Spannable)charsequence).getSpans(0, textview.length(), com/kik/android/c/b)).length > 0)
        {
            android.text.method.MovementMethod movementmethod = textview.getMovementMethod();
            if (movementmethod == null || !(movementmethod instanceof ci))
            {
                textview.setMovementMethod(ci.a());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static final boolean a(TextView textview, Pattern pattern, String as[], bw.a a1)
    {
        Object obj = textview.getText();
        if (obj instanceof Spannable)
        {
            if (a((Spannable)obj, pattern, as, a1))
            {
                b(textview);
                return true;
            } else
            {
                return false;
            }
        }
        obj = SpannableString.valueOf(((CharSequence) (obj)));
        if (a(((Spannable) (obj)), pattern, as, a1))
        {
            b(textview);
            textview.setText(((CharSequence) (obj)));
            return true;
        } else
        {
            return false;
        }
    }

    private static void b(TextView textview)
    {
        android.text.method.MovementMethod movementmethod = textview.getMovementMethod();
        if ((movementmethod == null || !(movementmethod instanceof LinkMovementMethod)) && textview.getLinksClickable())
        {
            textview.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

}
