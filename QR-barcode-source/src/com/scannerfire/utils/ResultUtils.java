// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.zxing.Result;
import com.google.zxing.client.android.Contents;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.scannerfire.utils:
//            Utils

public class ResultUtils
{

    private static int $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE[];
    Activity context;

    static int[] $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()
    {
        int ai[] = $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Utils.MODE.values().length];
        try
        {
            ai[Utils.MODE._calendar.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[Utils.MODE._contact.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[Utils.MODE._email.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[Utils.MODE._geo.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[Utils.MODE._isbn.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[Utils.MODE._phone.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[Utils.MODE._product.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[Utils.MODE._text.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Utils.MODE._url.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE = ai;
        return ai;
    }

    public ResultUtils(Activity activity)
    {
        context = activity;
    }

    public static void myAddressbookIntent(Bundle bundle, Activity activity)
    {
        Intent intent;
        intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle = bundle.getBundle("extraData");
        if (bundle == null) goto _L2; else goto _L3
_L3:
        Object obj;
        String as[] = bundle.getStringArray("names");
        if (as != null && as[0] != null)
        {
            intent.putExtra("name", as[0]);
        }
        obj = bundle.getStringArray("phones");
        if (obj == null) goto _L5; else goto _L4
_L4:
        int i = 0;
_L13:
        if (i < obj.length && i < Contents.PHONE_KEYS.length) goto _L6; else goto _L5
_L5:
        obj = bundle.getStringArray("emails");
        if (obj == null) goto _L8; else goto _L7
_L7:
        i = 0;
_L11:
        if (i < obj.length && i < Contents.EMAIL_KEYS.length) goto _L9; else goto _L8
_L8:
        if (bundle.getString("org") != null)
        {
            intent.putExtra("company", bundle.getString("org"));
        }
        if (bundle.getString("title") != null)
        {
            intent.putExtra("job_title", bundle.getString("title"));
        }
        obj = bundle.getStringArray("indirizzi");
        if (obj != null)
        {
            intent.putExtra("postal", obj[0]);
        }
        obj = bundle.getString("note");
        Log.d("", (new StringBuilder("Note: ")).append(((String) (obj))).toString());
        if (obj != null)
        {
            intent.putExtra("notes", ((String) (obj)));
        }
        bundle = bundle.getStringArray("siti");
        if (bundle != null && bundle[0] != null)
        {
            Log.d("", (new StringBuilder("WEBSITE: ")).append(bundle[0]).toString());
        }
_L2:
        try
        {
            activity.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Utils.showToastNotification(activity, activity.getString(0x7f080157));
        }
        break; /* Loop/switch isn't completed */
_L6:
        Log.d("", (new StringBuilder("Phone ")).append(i).append(":").append(obj[i]).toString());
        intent.putExtra(Contents.PHONE_KEYS[i], obj[i]);
        i++;
        continue; /* Loop/switch isn't completed */
_L9:
        intent.putExtra(Contents.EMAIL_KEYS[i], obj[i]);
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public String getCustomString(Utils.MODE mode)
    {
        switch ($SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[mode.ordinal()])
        {
        case 4: // '\004'
        default:
            return null;

        case 9: // '\t'
            return context.getString(0x7f080149);

        case 8: // '\b'
            return context.getString(0x7f08011a);

        case 5: // '\005'
            return context.getString(0x7f0800c0);

        case 3: // '\003'
            return context.getString(0x7f080114);

        case 6: // '\006'
            return context.getString(0x7f080117);

        case 1: // '\001'
            return context.getString(0x7f0800bf);

        case 7: // '\007'
            return context.getString(0x7f08014b);

        case 2: // '\002'
            return context.getString(0x7f0800be);
        }
    }

    public Drawable getIconFromMode(Utils.MODE mode)
    {
        switch ($SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[mode.ordinal()])
        {
        case 4: // '\004'
        default:
            return null;

        case 8: // '\b'
        case 9: // '\t'
            return context.getResources().getDrawable(0x7f02010a);

        case 5: // '\005'
            return context.getResources().getDrawable(0x7f0200da);

        case 3: // '\003'
            return context.getResources().getDrawable(0x7f02010a);

        case 6: // '\006'
            return context.getResources().getDrawable(0x7f0200d7);

        case 1: // '\001'
            return context.getResources().getDrawable(0x7f0200d9);

        case 7: // '\007'
            return context.getResources().getDrawable(0x7f0200db);

        case 2: // '\002'
            return context.getResources().getDrawable(0x7f0200dc);
        }
    }

    public void makeAction(String s, String s1, String s2, Result result)
    {
        if (!s1.equals("CODE_39") && !s1.equals("CODE_128")) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder("http://www.google.com/m/products?q=")).append(s2).toString();
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
_L4:
        return;
_L2:
        if (!s.equals("URI"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (s2 != null)
        {
            Log.d("", (new StringBuilder("URI -> ")).append(s2).append("\n").toString());
            Log.d("", (new StringBuilder("SCHEME -> ")).append(Uri.parse(s2).getScheme()).toString());
            Log.d("", (new StringBuilder("NEW URI -> ")).append(Utils.URICorrection(s2, "http://")).toString());
            s = Utils.URICorrection(s2, "http://");
            if (s.startsWith("market://details?id="))
            {
                s1 = s.split("=");
                try
                {
                    Log.d("", (new StringBuilder("SPLIT 1->")).append(s1[0]).append(" SPLIT 2->").append(s1[1]).toString());
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://play.google.com/store/apps/details?id=")).append(s1[1]).toString())));
                }
                return;
            }
            try
            {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Utils.showToastNotification(context, context.getString(0x7f080157));
            }
            Log.d("", (new StringBuilder("ActivityNotFoundException: url is ->")).append(s).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s.equals("ADDRESSBOOK"))
        {
            myAddressbookIntent(Utils.makeBundle(result), context);
            return;
        }
        if (!s.equals("GEO"))
        {
            break MISSING_BLOCK_LABEL_506;
        }
        s = Utils.URICorrection(s2, "geo:");
        Log.d("", (new StringBuilder("TEXT ->")).append(s2).toString());
        s1 = new Intent("android.intent.action.VIEW");
        if (!s.contains("?"))
        {
            break MISSING_BLOCK_LABEL_475;
        }
        s1.setData(Uri.parse((new StringBuilder(String.valueOf(s))).append("&z=16").toString()));
_L5:
        context.startActivity(s1);
        return;
        try
        {
            s1.setData(Uri.parse((new StringBuilder(String.valueOf(s))).append("?z=16").toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Utils.showToastNotification(context, context.getString(0x7f080116));
            return;
        }
          goto _L5
        int i;
        if (s.equals("TEL"))
        {
            s = new Intent("android.intent.action.DIAL", Uri.parse(s2));
            context.startActivity(s);
            return;
        }
        if (s.equals("EMAIL_ADDRESS"))
        {
            s = new Intent("android.intent.action.SENDTO", Uri.parse(s2));
            context.startActivity(Intent.createChooser(s, "Send with:"));
            return;
        }
        if (s.equals("TEXT"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s.equals("CALENDAR"))
        {
            break MISSING_BLOCK_LABEL_1069;
        }
        s = new Intent("android.intent.action.EDIT");
        s.setType("vnd.android.cursor.item/event");
        s1 = s2.split("\n|(:)");
        i = 0;
_L10:
        if (i >= s1.length)
        {
            context.startActivity(s);
            return;
        }
        if (!s1[i].contains("DTSTART")) goto _L7; else goto _L6
_L6:
        s2 = s1[i + 1];
        if (s2 != null) goto _L9; else goto _L8
_L8:
        i++;
          goto _L10
_L9:
        s2 = s2.replace("T", "").replace("00Z", "");
        result = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        try
        {
            s2 = result.parse(s2);
            Log.d("", (new StringBuilder("START ")).append(s2.getTime()).toString());
            s.putExtra("beginTime", s2.getTime());
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            s2.printStackTrace();
        }
_L7:
        if (!s1[i].contains("DTEND"))
        {
            break MISSING_BLOCK_LABEL_859;
        }
        s2 = s1[i + 1];
        if (s2 == null) goto _L8; else goto _L11
_L11:
        s2 = s2.replace("T", "").replace("00Z", "");
        result = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        try
        {
            s2 = result.parse(s2);
            Log.d("", (new StringBuilder("END ")).append(s2.getTime()).toString());
            s.putExtra("endTime", s2.getTime());
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            s2.printStackTrace();
        }
        if (s1[i].contains("LOCATION"))
        {
            Log.d("", (new StringBuilder("Luogo ")).append(s1[i + 1]).toString());
            if (s1[i + 1] != null)
            {
                s.putExtra("eventLocation", s1[i + 1]);
            }
        }
        if (s1[i].contains("DESCRIPTION"))
        {
            Log.d("", (new StringBuilder("Descrizione ")).append(s1[i + 1]).toString());
            if (s1[i + 1] != null)
            {
                s.putExtra("description", s1[i + 1]);
            }
        }
        if (s1[i].contains("SUMMARY"))
        {
            Log.d("", (new StringBuilder("Titolo ")).append(s1[i + 1]).toString());
            if (s1[i + 1] != null)
            {
                s.putExtra("title", s1[i + 1]);
            }
        }
          goto _L8
        if (s.equals("PRODUCT"))
        {
            s = (new StringBuilder("http://www.google.com/m/products?q=")).append(s2).toString();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return;
        }
        if (s.equals("ISBN"))
        {
            s = (new StringBuilder("http://books.google.com/books?vid=isbn")).append(s2).toString();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return;
        }
        if (true) goto _L4; else goto _L12
_L12:
    }
}
