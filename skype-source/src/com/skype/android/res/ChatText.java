// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Xml;
import android.view.View;
import com.skype.SkyLib;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSize;
import com.skype.android.mediacontent.EmoticonSpan;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.skype.android.res:
//            CountryFlags

public class ChatText
{
    private class InternalBrowserUrlSpan extends URLSpan
    {

        final ChatText a;

        public void onClick(View view)
        {
            ChatText.a(a).openUrlInExternalBrowser((Activity)view.getContext(), getURL());
        }

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
            textpaint.setColor(ChatText.b(a).getResources().getColor(0x7f0f0115));
        }

        public InternalBrowserUrlSpan(String s)
        {
            a = ChatText.this;
            super(s);
        }
    }

    private class SafeURLSpan extends URLSpan
    {

        final ChatText a;

        public void onClick(View view)
        {
            if (getURL().startsWith("skype:"))
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse(getURL()));
                view.setComponent(new ComponentName(ChatText.b(a), com/skype/android/app/main/SplashActivity));
                ChatText.b(a).startActivity(view);
                return;
            } else
            {
                super.onClick(view);
                return;
            }
        }

        public SafeURLSpan(String s)
        {
            a = ChatText.this;
            super(s);
        }
    }

    private static final class a
    {

        XmlPullParser a;
        SpannableStringBuilder b;
        Integer c;
        boolean d;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        private static final b r[];
        private final String p;
        private final boolean q;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/res/ChatText$b, s);
        }

        public static b[] values()
        {
            return (b[])r.clone();
        }

        public final boolean a()
        {
            return q;
        }

        public final String b()
        {
            return p;
        }

        static 
        {
            a = new b("BASE", 0, "**BASE**", false);
            b = new b("SS", 1, "ss", true);
            c = new b("FLAG", 2, "flag", true);
            d = new b("FONT", 3, "font", true);
            e = new b("A", 4, "a", true);
            f = new b("QUOTE", 5, "quote", true);
            g = new b("LEGACYQUOTE", 6, "legacyquote", true);
            h = new b("BOLD", 7, "b", true);
            i = new b("CODE", 8, "pre", true);
            j = new b("ITALIC", 9, "i", true);
            k = new b("STRIKETHROUGH", 10, "s", true);
            l = new b("UNKNOWN", 11, "**UNKNOWN**", false);
            m = new b("ALT", 12, "alt", false);
            n = new b("TYPE", 13, "type", false);
            o = new b("BR", 14, "br", true);
            r = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o
            });
        }

        private b(String s, int i1, String s1, boolean flag)
        {
            super(s, i1);
            p = s1;
            q = flag;
        }
    }


    private static Logger a = Logger.getLogger("ChatText");
    private static final HashMap b;
    private static final Pattern c = Pattern.compile("&\\w+;");
    private static final Pattern d = Pattern.compile("<.+?>");
    private CountryFlags e;
    private MediaContentRoster f;
    private Context g;
    private SkyLib h;
    private EcsConfiguration i;
    private Provider j;
    private TimeUtil k;
    private NavigationUrl l;
    private TimeAnomalyTelemetry m;
    private String n;

    public ChatText(Application application, SkyLib skylib, NavigationUrl navigationurl, CountryFlags countryflags, MediaContentRoster mediacontentroster, EcsConfiguration ecsconfiguration, Provider provider, 
            TimeUtil timeutil, TimeAnomalyTelemetry timeanomalytelemetry)
    {
        g = application;
        h = skylib;
        l = navigationurl;
        f = mediacontentroster;
        e = countryflags;
        i = ecsconfiguration;
        j = provider;
        k = timeutil;
        m = timeanomalytelemetry;
    }

    private int a(a a1)
        throws IOException, XmlPullParserException
    {
        String s3 = a("authorname", a1.a);
        Object obj = a("timestamp", a1.a);
        String s1 = null;
        String s2 = null;
        String s = s2;
        if (obj != null)
        {
            long l1 = Long.parseLong(((String) (obj)));
            s1 = DateFormat.getTimeFormat(g).format(Long.valueOf(l1 * 1000L));
            int i1;
            int j1;
            int k1;
            try
            {
                s = k.c(h.getServerTime(), TimeUtil.h(Long.parseLong(((String) (obj)))));
            }
            catch (TimeAnomalyException timeanomalyexception)
            {
                m.a(timeanomalyexception, "message#quoted", "ChatText#handleQuoteTag#strTimestamp#isNotNull");
                timeanomalyexception = s2;
            }
        }
        i1 = a1.b.length();
        if (i1 > 0)
        {
            s2 = "\n";
        } else
        {
            s2 = "";
        }
        obj = new StringBuilder();
        if (s != null && s1 != null)
        {
            ((StringBuilder) (obj)).append(g.getString(0x7f0804a0, new Object[] {
                s2, s3, s, s1, "\n> "
            }));
        } else
        {
            ((StringBuilder) (obj)).append(g.getString(0x7f0804a1, new Object[] {
                s2, s3, "\n> "
            }));
        }
        s = ((StringBuilder) (obj)).toString();
        a1.b.append(s);
        j1 = a1.b.length() - "\n> ".length();
        k1 = g.getResources().getColor(0x7f0f0052);
        a1.b.setSpan(new ForegroundColorSpan(k1), i1, j1, 33);
        a1.b.setSpan(new AbsoluteSizeSpan(g.getResources().getDimensionPixelSize(0x7f0c0260)), i1, j1, 33);
        a(a1, b.f.b());
        a1.b.append('\n');
        return 0;
    }

    private int a(a a1, b b1, Object obj)
        throws XmlPullParserException, IOException
    {
        int i1 = a1.b.length();
        a(a1, b1.b());
        if (a1.c != null)
        {
            int j1 = a1.b.length();
            a1.b.setSpan(obj, i1, j1, 33);
        }
        return 0;
    }

    private static int a(a a1, boolean flag)
    {
        String s;
        int i1;
        s = a1.a.getName();
        Object obj = a1.a;
        obj = a(b.m.b(), ((XmlPullParser) (obj)));
        if (obj == null && !flag)
        {
            a.info("no alt text - depthUp!");
            return 1;
        }
        if (obj != null)
        {
            a.info("has alt text - find the end tag!");
            a1.b.append(c(((String) (obj))));
            flag = true;
        }
        i1 = 0;
        int j1 = a1.a.next();
          goto _L1
_L5:
        if (j1 != 0) goto _L3; else goto _L2
_L2:
        int k1 = a1.a.next();
        i1 = j1;
        j1 = k1;
          goto _L1
_L10:
        j1 = i1;
        if (!s.equals(a1.a.getName())) goto _L5; else goto _L4
_L4:
        j1 = 1;
          goto _L5
_L11:
        j1 = i1;
        if (flag) goto _L5; else goto _L6
_L6:
        a1.b.append(c(a1.a.getText()));
        j1 = i1;
          goto _L5
        a1;
_L7:
        a1.printStackTrace();
_L3:
        return 0;
        a1;
          goto _L7
_L1:
        if (j1 == 1) goto _L3; else goto _L8
_L8:
        j1;
        JVM INSTR tableswitch 3 4: default 220
    //                   3 116
    //                   4 142;
           goto _L9 _L10 _L11
_L9:
        j1 = i1;
        if (true) goto _L5; else goto _L12
_L12:
    }

    static NavigationUrl a(ChatText chattext)
    {
        return chattext.l;
    }

    private CharSequence a(CharSequence charsequence, Integer integer, boolean flag)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        XmlPullParser xmlpullparser = Xml.newPullParser();
        Object obj = (new StringBuilder(charsequence.length() + 7 + 8)).append("<SKYPE>").append(charsequence).append("</SKYPE>").toString();
        try
        {
            xmlpullparser.setInput(new StringReader(((String) (obj))));
            obj = new a((byte)0);
            obj.a = xmlpullparser;
            obj.b = spannablestringbuilder;
            obj.c = integer;
            obj.d = flag;
            a(((a) (obj)), "SKYPE");
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            a.info((new StringBuilder("Likely parsing a non-Xml entity : ")).append(charsequence).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            a.info((new StringBuilder("Exception parsing:")).append(charsequence).append(" ex: ").append(integer).toString());
            integer.printStackTrace();
            return null;
        }
        return spannablestringbuilder;
    }

    private CharSequence a(String s, Integer integer, boolean flag)
    {
        if (s == null)
        {
            throw new RuntimeException("Contents is null");
        }
        CharSequence charsequence = a(((CharSequence) (s)), integer, flag);
        if (charsequence == null)
        {
            return s;
        }
        if (integer == null)
        {
            return charsequence.toString();
        }
        if (charsequence instanceof Spannable)
        {
            a((Spannable)charsequence);
        }
        return charsequence;
    }

    private static String a(String s, XmlPullParser xmlpullparser)
    {
        int j1 = xmlpullparser.getAttributeCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (s.equals(xmlpullparser.getAttributeName(i1)))
            {
                return xmlpullparser.getAttributeValue(i1);
            }
        }

        return null;
    }

    private void a(Spannable spannable)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j1 = aurlspan.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            URLSpan urlspan = aurlspan[i1];
            int k1 = spannable.getSpanStart(urlspan);
            int l1 = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new InternalBrowserUrlSpan(urlspan.getURL()), k1, l1, 0);
        }

    }

    private void a(SpannableStringBuilder spannablestringbuilder)
    {
        String s = spannablestringbuilder.toString().toLowerCase(Locale.US);
        int j1 = 0;
        int i1 = 0;
        do
        {
            if (j1 == -1)
            {
                break;
            }
            int k1 = s.indexOf("(flag:", i1);
            j1 = k1;
            if (k1 >= 0)
            {
                int l1 = s.indexOf(")", k1);
                if (l1 >= 0)
                {
                    Object obj = s.substring(k1 + 6, l1).toLowerCase(Locale.US);
                    obj = e.a(((String) (obj)));
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        spannablestringbuilder.setSpan(new ImageSpan(g, ((android.graphics.Bitmap) (obj)), 0), k1, l1 + 1, 33);
                        i1 = l1;
                        j1 = k1;
                    }
                } else
                {
                    i1 = k1 + 6;
                    j1 = k1;
                }
            }
        } while (true);
    }

    private void a(a a1, String s)
        throws XmlPullParserException, IOException
    {
        XmlPullParser xmlpullparser;
        int i1;
        int j1;
        xmlpullparser = a1.a;
        i1 = xmlpullparser.getEventType();
        j1 = xmlpullparser.getDepth();
_L7:
        if (i1 == 1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 2 4: default 60
    //                   2 95
    //                   3 662
    //                   4 695;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_695;
_L3:
        i1 = j1;
_L9:
        n = xmlpullparser.getText();
        int k1 = xmlpullparser.next();
        j1 = i1;
        i1 = k1;
          goto _L7
_L4:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[b.h.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[b.j.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[b.k.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[b.i.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[b.b.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[b.c.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[b.d.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[b.e.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.f.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.g.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.o.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.l.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        b b1;
        if (s != null && s.equals(xmlpullparser.getName()))
        {
            b1 = b.a;
        } else
        {
            b1 = (b)b.get(xmlpullparser.getName());
            if (b1 == null)
            {
                b1 = b.l;
            }
        }
        switch (_cls1.a[b1.ordinal()])
        {
        default:
            i1 = j1 + a(a1, false);
            break;

        case 1: // '\001'
            i1 = j1 + 1;
            break;

        case 2: // '\002'
            StyleSpan stylespan = new StyleSpan(1);
            i1 = j1 + a(a1, b.h, stylespan);
            break;

        case 3: // '\003'
            StyleSpan stylespan1 = new StyleSpan(2);
            i1 = j1 + a(a1, b.j, stylespan1);
            break;

        case 4: // '\004'
            i1 = j1 + a(a1, b.k, new StrikethroughSpan());
            break;

        case 5: // '\005'
            TypefaceSpan typefacespan = new TypefaceSpan("monospace");
            i1 = j1 + a(a1, b.i, typefacespan);
            break;

        case 6: // '\006'
            Object obj = a(b.n.b(), a1.a);
            i1 = a1.b.length();
            a(a1, b.b.b());
            obj = (EmoticonContent)f.a(((String) (obj)), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
            if (a1.c != null && obj != null)
            {
                obj = new EmoticonSpan(((EmoticonContent) (obj)), EmoticonSize.a, a1.c.intValue(), a1.d, n);
                a1.b.setSpan(obj, i1, a1.b.length(), 33);
            }
            i1 = j1 + 0;
            break;

        case 7: // '\007'
            Object obj1 = a1.a.getAttributeValue(0);
            i1 = a1.b.length();
            a(a1, b.c.b());
            if (a1.c != null)
            {
                int l1 = a1.b.length();
                obj1 = e.a(((String) (obj1)));
                if (obj1 != null)
                {
                    obj1 = new ImageSpan(g, ((android.graphics.Bitmap) (obj1)), a1.c.intValue());
                    a1.b.setSpan(obj1, i1, (l1 - i1) + i1, 33);
                }
            }
            i1 = j1 + 0;
            break;

        case 8: // '\b'
            i1 = j1 + b(a1);
            break;

        case 9: // '\t'
            SafeURLSpan safeurlspan = new SafeURLSpan(a("href", a1.a));
            i1 = j1 + a(a1, b.e, safeurlspan);
            break;

        case 10: // '\n'
            i1 = j1 + a(a1);
            break;

        case 11: // '\013'
            i1 = j1 + a(a1, true);
            break;

        case 12: // '\f'
            a1.b.append('\n');
            i1 = j1 + 1;
            break;
        }
        if (true) goto _L9; else goto _L8
_L8:
_L5:
        j1--;
        i1 = j1;
        if (s == null) goto _L9; else goto _L10
_L10:
        i1 = j1;
        if (!s.equals(xmlpullparser.getName())) goto _L9; else goto _L2
_L2:
        return;
        i1 = j1;
        if (xmlpullparser.getDepth() <= j1)
        {
            a1.b.append(c(xmlpullparser.getText()));
            i1 = j1;
        }
          goto _L9
    }

    private boolean a()
    {
        return i.getCloudEmoticonsEnabled() && ((UserPreferences)j.get()).getShowAnimatedEmoticons();
    }

    private int b(a a1)
    {
        String s;
        s = a("color", a1.a);
        if (a1.c == null || TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int i1 = Color.parseColor(s);
        int j1 = a1.b.length();
        a(a1, b.d.b());
        a1.b.setSpan(new ForegroundColorSpan(i1), j1, a1.b.length(), 33);
        return 0;
        a1;
        a.warning((new StringBuilder("handleFontTag - bad color - ")).append(s).toString());
        return 1;
    }

    static Context b(ChatText chattext)
    {
        return chattext.g;
    }

    private transient CharSequence b(String s, Object aobj[])
    {
        return a(String.format(s, aobj), Integer.valueOf(0), a());
    }

    private static CharSequence c(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = s.replaceAll("\u2028", "\n");
        StringBuilder stringbuilder = new StringBuilder();
        Matcher matcher = c.matcher(s);
        Matcher matcher1 = d.matcher(s);
        int i1 = 0;
        while (matcher.find()) 
        {
            stringbuilder.append(s.substring(i1, matcher.start()));
            int j1 = 1;
            matcher1.region(i1, s.length());
            i1 = j1;
            do
            {
                if (!matcher1.find() || matcher1.start() >= matcher.end())
                {
                    break;
                }
                if (matcher.start() > matcher1.start() && matcher.end() < matcher1.end())
                {
                    a.warning((new StringBuilder("Found an entity inside a tag! ")).append(s.substring(matcher.start(), matcher.end())).append(" inside ").append(s.substring(matcher1.start(), matcher1.end())).toString());
                    i1 = 0;
                }
            } while (true);
            j1 = matcher.end();
            if (i1 != 0)
            {
                stringbuilder.append(Html.fromHtml(s.substring(matcher.start(), j1).replaceAll("\n", "<br>")));
                i1 = j1;
            } else
            {
                stringbuilder.append(s.substring(matcher.start(), j1));
                i1 = j1;
            }
        }
        stringbuilder.append(s.substring(i1));
        return stringbuilder.toString();
    }

    public final transient CharSequence a(int i1, Object aobj[])
    {
        return b(g.getString(i1), aobj);
    }

    public final CharSequence a(String s)
    {
        return a(s, a());
    }

    public final CharSequence a(String s, Integer integer)
    {
        return a(s, integer, a());
    }

    public final CharSequence a(String s, boolean flag)
    {
        s = a(h.contentEncodeCloud(s, true, true).m_result, Integer.valueOf(0), flag);
        if (s instanceof SpannableStringBuilder)
        {
            s = (SpannableStringBuilder)s;
        } else
        {
            s = new SpannableStringBuilder(s);
        }
        if (((ImageSpan[])s.getSpans(0, s.length(), android/text/style/ImageSpan)).length == 0)
        {
            a(((SpannableStringBuilder) (s)));
        }
        return s;
    }

    public final transient CharSequence a(String s, Object aobj[])
    {
        return b(s, aobj);
    }

    public final CharSequence b(String s)
    {
        CharSequence charsequence = a(s, a());
        s = charsequence;
        if (charsequence.length() > g.getResources().getInteger(0x7f0e0027))
        {
            s = charsequence.subSequence(0, g.getResources().getInteger(0x7f0e0027));
        }
        return String.format(g.getString(0x7f0803b3), new Object[] {
            s
        });
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b ab[] = b.values();
        int j1 = ab.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            b b1 = ab[i1];
            if (b1.a())
            {
                hashmap.put(b1.b(), b1);
            }
        }

        b = hashmap;
    }
}
