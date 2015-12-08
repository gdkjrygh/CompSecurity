// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.paypal.android.sdk:
//            bw, cH, cF

public class d
{

    public d()
    {
    }

    public static String a(File file)
    {
        file = new RandomAccessFile(file, "r");
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        file.close();
        return new String(abyte0, "UTF-8");
    }

    public static String a(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return (new StringBuilder("unable_to_encode:")).append(s).toString();
        }
        return s1;
    }

    public static String a(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        map = map.entrySet().iterator();
        boolean flag = true;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!flag)
            {
                stringbuilder.append("&");
            } else
            {
                flag = false;
            }
            stringbuilder.append((new StringBuilder()).append((String)entry.getKey()).append("=").append((String)entry.getValue()).toString());
        }
        return stringbuilder.toString();
    }

    public static Header a(String s, List list, String s1)
    {
        s = String.format("Trace: [%s] %s, %s", new Object[] {
            s, "\"%08.8x: Operation = %80s Duration: %8.2f Iterations: %+4d\"", "memorySize * 8 + offset"
        });
        ArrayList arraylist = new ArrayList();
        Header header;
        for (list = list.iterator(); list.hasNext(); arraylist.add((new StringBuilder()).append(header.getName()).append(": ").append(header.getValue()).toString()))
        {
            header = (Header)list.next();
        }

        Collections.sort(arraylist);
        list = (new StringBuilder()).append(TextUtils.join(";", arraylist.toArray())).append(s1).toString();
        s1 = Mac.getInstance("HmacSHA1");
        s1.init(new SecretKeySpec(s.getBytes(), "HmacSHA1"));
        s1.update(list.getBytes());
        s = s1.doFinal();
        list = new StringBuilder();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            list.append(String.format("%02x", new Object[] {
                Byte.valueOf(s[i])
            }));
        }

        return new BasicHeader("PayPal-Item-Id", list.toString());
    }

    public static void a(Activity activity)
    {
        if (a())
        {
            activity.requestWindowFeature(8);
        }
    }

    public static void a(Activity activity, TextView textview, String s, String s1, Drawable drawable)
    {
        activity.setTitle((new StringBuilder()).append(s1).append(s).toString());
        if (a())
        {
            s1 = activity.getActionBar();
            s1.setBackgroundDrawable(bw.c);
            s1.setTitle(s);
            activity = (TextView)activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
            if (activity != null)
            {
                activity.setTextColor(-1);
            }
            s1.setDisplayHomeAsUpEnabled(false);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                s1.setIcon(drawable);
            } else
            {
                s1.setDisplayShowHomeEnabled(false);
            }
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        } else
        if (textview != null)
        {
            textview.setText(s);
            return;
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(File file, String s)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        fileoutputstream.write(s.getBytes("UTF-8"));
        a(((Closeable) (fileoutputstream)));
        return;
        file;
        s = null;
_L2:
        a(((Closeable) (s)));
        throw file;
        file;
        s = fileoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean a(String s, String s1, String s2)
    {
        boolean flag = a(((CharSequence) (s1)));
        if (flag)
        {
            Log.e(s, (new StringBuilder()).append(s2).append(" is empty.").toString());
        }
        boolean flag1 = d(s1);
        if (flag1)
        {
            Log.e(s, (new StringBuilder()).append(s2).append(" contains whitespace.").toString());
        }
        return !flag && !flag1;
    }

    public static SpannableString b(String s)
    {
        String s1 = Locale.getDefault().getCountry().toLowerCase(Locale.US);
        boolean flag;
        if (b(((CharSequence) (s1))) || !s1.equals("jp"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        }
        s1 = cF.a(cH.ao);
        if (c(s) && s.equals("ja"))
        {
            s = "https://cms.paypal.com/jp/cgi-bin/marketingweb?cmd=_render-content&content_ID=ua/Legal_Hub_full&locale.x=ja_JP";
        } else
        {
            s = "https://cms.paypal.com/jp/cgi-bin/marketingweb?cmd=_render-content&content_ID=ua/Legal_Hub_full&locale.x=en_US";
        }
        return new SpannableString(Html.fromHtml(String.format(s1, new Object[] {
            s, "https://www.paypal.jp/jp/contents/regulation/info/overseas-remittance/"
        })));
    }

    public static void b(Activity activity)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            activity.setTheme(0x103006e);
            return;
        } else
        {
            activity.setTheme(0x103000c);
            return;
        }
    }

    public static boolean b(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        int j = charsequence.length();
        if (j != 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        return flag;
_L3:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                flag = flag1;
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public static boolean c(CharSequence charsequence)
    {
        return !b(charsequence);
    }

    private static boolean d(CharSequence charsequence)
    {
        if (!a(charsequence))
        {
            int j = charsequence.length();
            int i = 0;
            while (i < j) 
            {
                if (Character.isWhitespace(charsequence.charAt(i)))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
