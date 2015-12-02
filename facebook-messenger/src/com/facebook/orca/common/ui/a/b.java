// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.a;

import android.content.res.Resources;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.location.g;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.threads.Message;
import com.facebook.o;
import com.facebook.orca.emoji.z;
import com.facebook.orca.share.a;
import com.google.common.base.Objects;
import java.util.Locale;

public class b
{

    private final Resources a;
    private final a b;
    private final z c;

    public b(Resources resources, a a1, z z1)
    {
        a = resources;
        b = a1;
        c = z1;
    }

    private String a(String s, Message message)
    {
        message = b.a(message);
        if (message == null)
        {
            return s;
        }
        ShareMedia sharemedia = b.a(message);
        if (message.e() != null)
        {
            s = a(s, message.e());
        }
        message = s;
        if (sharemedia != null)
        {
            message = s;
            if (sharemedia.a() != null)
            {
                message = a(s, sharemedia.a());
            }
        }
        s = message;
        if (n.a(message))
        {
            if (sharemedia != null)
            {
                if ("photo".equals(sharemedia.c()))
                {
                    s = a.getString(o.share_attachment_shared_a_photo);
                } else
                if ("video".equals(sharemedia.c()))
                {
                    s = a.getString(o.share_attachment_shared_a_video);
                } else
                {
                    s = a.getString(o.share_attachment_shared_a_link);
                }
            } else
            {
                s = a.getString(o.share_attachment_shared_a_link);
            }
        }
        return s;
    }

    private String a(String s, String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        if (s.startsWith(s1))
        {
            return s.substring(s1.length()).trim();
        }
        s1 = Uri.parse(s1);
        if (!"http".equals(s1.getScheme()))
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s1.buildUpon().scheme("https").build().toString();
        if (s.startsWith(s1))
        {
            return b(s, s1);
        }
        continue; /* Loop/switch isn't completed */
        if (!"https".equals(s1.getScheme())) goto _L1; else goto _L3
_L3:
        s1 = s1.buildUpon().scheme("http").build().toString();
        if (s.startsWith(s1))
        {
            return b(s, s1);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private String[] a(g g1)
    {
        return (new String[] {
            g1.d(), g1.g()
        });
    }

    private String[] a(String s, g g1)
    {
        String as[] = a(g1);
        if (Objects.equal(s, g1.f()))
        {
            as[1] = b(g1);
        }
        return as;
    }

    private Spanned b(Message message)
    {
        String s = a(n.a(message.k()).trim(), message);
        int i;
        if (!n.a(message.j()))
        {
            message = n.a(message.j()).trim();
            message = a.getString(o.message_subject, new Object[] {
                message
            });
            message = new SpannableStringBuilder(android.text.Spannable.Factory.getInstance().newSpannable(message));
            message.insert(0, "<");
            message.append("> ");
            message.setSpan(new StyleSpan(2), 0, message.length(), 33);
            message.append(android.text.Spannable.Factory.getInstance().newSpannable(s));
        } else
        {
            message = new SpannableStringBuilder(android.text.Spannable.Factory.getInstance().newSpannable(s));
        }
        i = j.b(a, 14F);
        c.a(message, i);
        return message;
    }

    private String b(g g1)
    {
        if (Objects.equal(g1.f(), "CA") || Objects.equal(g1.f(), "US"))
        {
            return g1.e();
        } else
        {
            return null;
        }
    }

    private String b(String s, String s1)
    {
        s = s.substring(s1.length());
        int i = 0;
        do
        {
            if (i >= s.length() || Character.isWhitespace(s.charAt(i)))
            {
                if (i == s.length())
                {
                    return "";
                } else
                {
                    return s.substring(i).trim();
                }
            }
            i++;
        } while (true);
    }

    private String[] b(g g1, g g2)
    {
        String as[] = a(g2);
        if (Objects.equal(g1.f(), g2.f()))
        {
            as[1] = b(g2);
            if (Objects.equal(g1.d(), g2.d()))
            {
                as[1] = null;
                if (!n.a(g2.c()))
                {
                    as[0] = g2.c();
                    as[1] = g2.d();
                    if (as[0].contains(as[1]))
                    {
                        as[1] = null;
                    }
                }
            }
        }
        return as;
    }

    public Spanned a(Message message)
    {
        return b(message);
    }

    public String a(g g1, g g2)
    {
        if (g1 == null || n.a(g1.d()))
        {
            return null;
        }
        if (g2 != null)
        {
            g1 = b(g2, g1);
        } else
        if (!n.a(Locale.getDefault().getISO3Country()))
        {
            g1 = a(Locale.getDefault().getCountry(), g1);
        } else
        {
            g1 = a(g1);
        }
        if (n.a(g1[1]))
        {
            return a.getString(o.message_sent_x, new Object[] {
                g1[0]
            });
        } else
        {
            return a.getString(o.message_sent_x_y, new Object[] {
                g1[0], g1[1]
            });
        }
    }
}
