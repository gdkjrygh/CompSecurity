// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.scannerfire.utils.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.scannerfire.model:
//            BizCard, MatMsg, Mail

public class ListenerObjects
{

    private static int $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE[];
    BizCard biz;
    android.view.View.OnClickListener browser;
    android.view.View.OnClickListener calendar;
    android.view.View.OnClickListener contact;
    Activity context;
    android.view.View.OnClickListener email;
    android.view.View.OnClickListener geo;
    android.view.View.OnClickListener isbn;
    MatMsg matMsg;
    Mail msg;
    android.view.View.OnClickListener phone;
    android.view.View.OnClickListener product;
    android.view.View.OnClickListener text;
    String value;

    static int[] $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()
    {
        int ai[] = $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.scannerfire.utils.Utils.MODE.values().length];
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._calendar.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._contact.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._email.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._geo.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._isbn.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._phone.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._product.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._text.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._url.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE = ai;
        return ai;
    }

    public ListenerObjects(Activity activity)
    {
        browser = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                String s = value.toLowerCase();
                view = s;
                if (!s.startsWith("http://"))
                {
                    view = s;
                    if (!s.startsWith("https://"))
                    {
                        view = s;
                        if (!s.startsWith("market://"))
                        {
                            view = (new StringBuilder("http://")).append(s).toString();
                        }
                    }
                }
                view = new Intent("android.intent.action.VIEW", Uri.parse(view));
                context.startActivity(view);
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        email = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                Log.d("", (new StringBuilder("msg->  ")).append(msg.toString()).toString());
                if (msg != null)
                {
                    view = Mail.getString();
                } else
                {
                    view = MatMsg.getTO();
                }
                view = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("mailto:")).append(view).toString()));
                context.startActivity(Intent.createChooser(view, context.getString(0x7f080148)));
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        text = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                view.getRootView().setVisibility(8);
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        phone = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.DIAL");
                view.setData(Uri.parse(value));
                context.startActivity(view);
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        contact = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                if (value == null) goto _L2; else goto _L1
_L1:
                view = value;
                if (!view.startsWith("MECARD")) goto _L4; else goto _L3
_L3:
                Intent intent;
                int i;
                Log.d("", "MECARD");
                intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                view = view.split("(;)|(:)");
                i = 0;
_L10:
                if (i < view.length) goto _L6; else goto _L5
_L5:
                context.startActivity(intent);
_L8:
                return;
_L6:
                Log.d("", (new StringBuilder(String.valueOf(view[i]))).append("\n").toString());
                if (view[i].contains("N"))
                {
                    intent.putExtra("name", view[i + 1]);
                }
                if (view[i].contains("TEL"))
                {
                    intent.putExtra("phone", view[i + 1]);
                }
                if (view[i].contains("EMAIL"))
                {
                    intent.putExtra("email", view[i + 1]);
                }
                i++;
                continue; /* Loop/switch isn't completed */
_L4:
                if (!view.startsWith("BEGIN:VCARD")) goto _L8; else goto _L7
_L7:
                Log.d("", "VCARD");
                Intent intent1 = new Intent("android.intent.action.INSERT");
                intent1.setType("vnd.android.cursor.dir/raw_contact");
                view = view.split("\n|(:)");
                int j = 0;
                do
                {
                    if (j >= view.length)
                    {
                        context.startActivity(intent1);
                        return;
                    }
                    Log.d("", (new StringBuilder(String.valueOf(view[j]))).append("\n").toString());
                    if (view[j].contains("N"))
                    {
                        intent1.putExtra("name", view[j + 1]);
                    }
                    if (view[j].contains("TEL"))
                    {
                        intent1.putExtra("phone", view[j + 1]);
                    }
                    if (view[j].contains("EMAIL"))
                    {
                        intent1.putExtra("email", view[j + 1]);
                    }
                    j++;
                } while (true);
_L2:
                view = new Intent("android.intent.action.INSERT");
                view.setType("vnd.android.cursor.dir/contact");
                view.putExtra("phone", BizCard.getB());
                view.putExtra("name", (new StringBuilder(String.valueOf(BizCard.getN()))).append(" ").append(BizCard.getX()).toString());
                context.startActivity(view);
                return;
                if (true) goto _L10; else goto _L9
_L9:
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        geo = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                String s = value;
                Log.d("", (new StringBuilder("GEO VALUE ")).append(value).toString());
                if (value.startsWith("geo:"))
                {
                    try
                    {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder(String.valueOf(value))).append("&z=16").toString())));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Utils.showToastNotification(context, context.getString(0x7f080116));
                    }
                    return;
                }
                view = s;
                if (!s.startsWith("http://"))
                {
                    view = s;
                    if (!s.startsWith("https://"))
                    {
                        view = s;
                        if (!s.startsWith("market://"))
                        {
                            view = (new StringBuilder("http://")).append(s).toString();
                        }
                    }
                }
                view = new Intent("android.intent.action.VIEW", Uri.parse(view));
                context.startActivity(view);
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        calendar = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.EDIT");
                view.setType("vnd.android.cursor.item/event");
                String as[] = value.split("\n|(:)");
                int i = 0;
                do
                {
                    if (i >= as.length)
                    {
                        context.startActivity(view);
                        return;
                    }
                    if (as[i].contains("DTSTART"))
                    {
                        Object obj = as[i + 1].replace("T", "").replace("00Z", "");
                        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
                        try
                        {
                            obj = simpledateformat.parse(((String) (obj)));
                            Log.d("", (new StringBuilder("START ")).append(((Date) (obj)).getTime()).toString());
                            view.putExtra("beginTime", ((Date) (obj)).getTime());
                        }
                        catch (ParseException parseexception)
                        {
                            parseexception.printStackTrace();
                        }
                    }
                    if (as[i].contains("DTEND"))
                    {
                        obj = as[i + 1].replace("T", "").replace("00Z", "");
                        simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
                        try
                        {
                            obj = simpledateformat.parse(((String) (obj)));
                            Log.d("", (new StringBuilder("END ")).append(((Date) (obj)).getTime()).toString());
                            view.putExtra("endTime", ((Date) (obj)).getTime());
                        }
                        catch (ParseException parseexception1)
                        {
                            parseexception1.printStackTrace();
                        }
                    }
                    if (as[i].contains("LOCATION"))
                    {
                        Log.d("", (new StringBuilder("Luogo ")).append(as[i + 1]).toString());
                        view.putExtra("eventLocation", as[i + 1]);
                    }
                    if (as[i].contains("DESCRIPTION"))
                    {
                        Log.d("", (new StringBuilder("Descrizione ")).append(as[i + 1]).toString());
                        view.putExtra("description", as[i + 1]);
                    }
                    if (as[i].contains("SUMMARY"))
                    {
                        Log.d("", (new StringBuilder("Titolo ")).append(as[i + 1]).toString());
                        view.putExtra("title", as[i + 1]);
                    }
                    i++;
                } while (true);
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        product = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                view = (new StringBuilder("http://www.google.com/m/products?q=")).append(value).toString();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        isbn = new android.view.View.OnClickListener() {

            final ListenerObjects this$0;

            public void onClick(View view)
            {
                view = (new StringBuilder("http://books.google.com/books?vid=isbn")).append(value).toString();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
            }

            
            {
                this$0 = ListenerObjects.this;
                super();
            }
        };
        context = activity;
    }

    public BizCard getBiz()
    {
        return biz;
    }

    public MatMsg getMatMsg()
    {
        return matMsg;
    }

    public Mail getMsg()
    {
        return msg;
    }

    public android.view.View.OnClickListener getOnClickListener(com.scannerfire.utils.Utils.MODE mode)
    {
        Log.d("", (new StringBuilder("MODE IS: ")).append(mode).toString());
        switch ($SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[mode.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return contact;

        case 2: // '\002'
            return email;

        case 5: // '\005'
            return geo;

        case 6: // '\006'
            return phone;

        case 4: // '\004'
            return text;

        case 3: // '\003'
            return browser;

        case 7: // '\007'
            return calendar;

        case 8: // '\b'
            return product;

        case 9: // '\t'
            return isbn;
        }
    }

    public String getValue()
    {
        return value;
    }

    public void setBiz(BizCard bizcard)
    {
        biz = bizcard;
    }

    public void setMatMsg(MatMsg matmsg)
    {
        matMsg = matmsg;
    }

    public void setMsg(Mail mail)
    {
        msg = mail;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
