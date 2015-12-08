// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.QRBS.QuickAction.QuickActionItem;
import com.QRBS.QuickAction.QuickActionPopup;
import com.QRBS.activity.MyResultActivity;
import com.QRBS.activity.Visualizza;
import com.QRBS.camera.RGBLuminanceSource;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.common.HybridBinarizer;
import com.scannerfire.db.DbAdapter;
import com.scannerfire.model.CustomListAdapter;
import com.scannerfire.model.Mail;
import com.scannerfire.model.MatMsg;
import com.scannerfire.model.QRModel;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.scannerfire.utils:
//            ResultParser, ResultUtils, EncodeUtils

public class Utils
{
    public static final class MODE extends Enum
    {

        private static final MODE ENUM$VALUES[];
        public static final MODE _calendar;
        public static final MODE _contact;
        public static final MODE _email;
        public static final MODE _geo;
        public static final MODE _isbn;
        public static final MODE _phone;
        public static final MODE _product;
        public static final MODE _text;
        public static final MODE _url;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(com/scannerfire/utils/Utils$MODE, s);
        }

        public static MODE[] values()
        {
            MODE amode[] = ENUM$VALUES;
            int i = amode.length;
            MODE amode1[] = new MODE[i];
            System.arraycopy(amode, 0, amode1, 0, i);
            return amode1;
        }

        static 
        {
            _contact = new MODE("_contact", 0);
            _email = new MODE("_email", 1);
            _url = new MODE("_url", 2);
            _text = new MODE("_text", 3);
            _geo = new MODE("_geo", 4);
            _phone = new MODE("_phone", 5);
            _calendar = new MODE("_calendar", 6);
            _product = new MODE("_product", 7);
            _isbn = new MODE("_isbn", 8);
            ENUM$VALUES = (new MODE[] {
                _contact, _email, _url, _text, _geo, _phone, _calendar, _product, _isbn
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE[];
    protected static final int CODE_ACTION = 2;
    protected static final int CODE_CLIPBOARD = 4;
    protected static final int CODE_DELETE = 1;
    protected static final int CODE_SEE = 0;
    protected static final int CODE_SHARE = 3;
    public static final boolean DEBUG = false;
    public static final int QR_DIM = 350;
    private static final String TAG = "Util";
    private static int lastElem = -1;
    private ProgressDialog lastPD;

    static int[] $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()
    {
        int ai[] = $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[MODE.values().length];
        try
        {
            ai[MODE._calendar.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[MODE._contact.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[MODE._email.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[MODE._geo.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[MODE._isbn.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[MODE._phone.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[MODE._product.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[MODE._text.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[MODE._url.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE = ai;
        return ai;
    }

    public Utils()
    {
    }

    public static String URICorrection(String s, String s1)
    {
        Object obj = s;
        if (s.startsWith("uri:"))
        {
            obj = s.replaceFirst("uri:", "");
        }
        s = ((String) (obj));
        if (((String) (obj)).startsWith("URI:"))
        {
            s = ((String) (obj)).replaceFirst("URI:", "");
        }
        obj = Uri.parse(s);
        if (((Uri) (obj)).getScheme() == null)
        {
            if (s1 == null)
            {
                s1 = "";
            }
            return (new StringBuilder(String.valueOf(s1))).append(s).toString();
        } else
        {
            s1 = ((Uri) (obj)).getScheme();
            return s.replaceFirst(s1, s1.toLowerCase(Locale.ENGLISH));
        }
    }

    public static int computeSampleSize(android.graphics.BitmapFactory.Options options, int i)
    {
        int k = Math.max(options.outWidth, options.outHeight);
        int j = 1;
        do
        {
            if (k / (j << 1) <= i)
            {
                return j;
            }
            j <<= 1;
        } while (true);
    }

    public static void copyToClipboard(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            ((ClipboardManager)context.getSystemService("clipboard")).setText(s);
        } else
        {
            ((android.content.ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", s));
        }
        Toast.makeText(context, 0x7f080154, 0).show();
    }

    public static QuickActionPopup createQuickMenu(final Activity startA, QRModel qrmodel, View view, final int position, final CustomListAdapter arrayAdapter)
    {
        new QuickActionPopup(startA);
        QuickActionItem quickactionitem = new QuickActionItem(0, startA.getResources().getString(0x7f08014a), startA.getResources().getDrawable(0x7f02010b));
        QuickActionItem quickactionitem1 = new QuickActionItem(1, startA.getResources().getString(0x7f080147), startA.getResources().getDrawable(0x7f0200be));
        final Result result = qrmodel.getResult();
        final ParsedResult parsed = ResultParser.parseResult(result);
        final MODE mode = ResultParser.getParsedResult(parsed);
        final ResultUtils ru = new ResultUtils(startA);
        Object obj = ru.getCustomString(mode);
        qrmodel = null;
        if (obj != null)
        {
            qrmodel = new QuickActionItem(2, ((String) (obj)), ru.getIconFromMode(mode));
        }
        obj = new QuickActionItem(3, startA.getResources().getString(0x7f080112), startA.getResources().getDrawable(0x7f02010e));
        QuickActionItem quickactionitem2 = new QuickActionItem(4, startA.getResources().getString(0x7f08013d), startA.getResources().getDrawable(0x7f0200d8));
        QuickActionPopup quickactionpopup = new QuickActionPopup(startA);
        quickactionpopup.addActionItem(quickactionitem);
        quickactionpopup.addActionItem(quickactionitem1);
        if (qrmodel != null)
        {
            quickactionpopup.addActionItem(qrmodel);
        }
        quickactionpopup.addActionItem(((QuickActionItem) (obj)));
        quickactionpopup.addActionItem(quickactionitem2);
        quickactionpopup.show(view);
        quickactionpopup.setAnimStyle(0x7f040006);
        quickactionpopup.setOnActionItemClickListener(new com.QRBS.QuickAction.QuickActionPopup.OnActionItemClickListener() {

            private final CustomListAdapter val$arrayAdapter;
            private final MODE val$mode;
            private final ParsedResult val$parsed;
            private final int val$position;
            private final Result val$result;
            private final ResultUtils val$ru;
            private final Activity val$startA;

            public void onItemClick(QuickActionPopup quickactionpopup1, int i, int j)
            {
                switch (j)
                {
                default:
                    return;

                case 1: // '\001'
                    quickactionpopup1 = new android.app.AlertDialog.Builder(startA);
                    quickactionpopup1.setTitle(startA.getResources().getString(0x7f080142));
                    quickactionpopup1.setMessage(startA.getResources().getString(0x7f08015a));
                    quickactionpopup1.setPositiveButton(startA.getResources().getString(0x7f0800b8), position. new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;
                        private final CustomListAdapter val$arrayAdapter;
                        private final int val$position;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            arrayAdapter.remove(position);
                            arrayAdapter.notifyDataSetChanged();
                            dialoginterface.dismiss();
                        }

            
            {
                this$1 = final__pcls2;
                arrayAdapter = customlistadapter;
                position = I.this;
                super();
            }
                    });
                    quickactionpopup1.setNegativeButton(startA.getResources().getString(0x7f0800b7), new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    quickactionpopup1.create().show();
                    return;

                case 0: // '\0'
                    quickactionpopup1 = Utils.makeBundle(result);
                    Intent intent = new Intent(startA, com/QRBS/activity/Visualizza);
                    intent.putExtra("bundle", quickactionpopup1);
                    startA.startActivity(intent);
                    return;

                case 2: // '\002'
                    ru.makeAction(parsed.getType().toString(), result.getBarcodeFormat().toString(), result.getText(), result);
                    return;

                case 3: // '\003'
                    quickactionpopup1 = Utils.getTextFromResult(mode, result);
                    (new EncodeUtils(startA)).start(result.getText(), quickactionpopup1);
                    return;

                case 4: // '\004'
                    quickactionpopup1 = Utils.getTextFromResult(mode, result);
                    break;
                }
                Utils.copyToClipboard(startA.getApplicationContext(), quickactionpopup1);
            }

            
            {
                startA = activity;
                result = result1;
                ru = resultutils;
                parsed = parsedresult;
                mode = mode1;
                arrayAdapter = customlistadapter;
                position = i;
                super();
            }
        });
        return quickactionpopup;
    }

    public static Result decodeBitmap(Bitmap bitmap)
    {
        bitmap = new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(bitmap)));
        bitmap = (new MultiFormatReader()).decode(bitmap);
        return bitmap;
        bitmap;
        bitmap.printStackTrace();
_L2:
        return null;
        bitmap;
        bitmap.printStackTrace();
        continue; /* Loop/switch isn't completed */
        bitmap;
        bitmap.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean getAutomaticRedPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_automat", false);
    }

    public static Bitmap getBitmap(ContentResolver contentresolver, Uri uri, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        try
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new BufferedInputStream(contentresolver.openInputStream(uri)), null, options);
            i = computeSampleSize(options, i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = i;
            contentresolver = BitmapFactory.decodeStream(new BufferedInputStream(contentresolver.openInputStream(uri)), null, options);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            Log.e("Util", (new StringBuilder("FileNotFound ")).append(uri).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            Log.e("Util", "Unexpected exception", contentresolver);
            return null;
        }
        return contentresolver;
    }

    public static boolean getClipboardPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_automatic_clipboard", false);
    }

    public static boolean getContinuousPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_continuous", false);
    }

    public static String getCustomUrlPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("preference_custom_url", "");
    }

    private static Bundle getExtraData(ParsedResult parsedresult)
    {
        Bundle bundle = new Bundle();
        parsedresult = (AddressBookParsedResult)parsedresult;
        bundle.putStringArray("names", parsedresult.getNames());
        bundle.putStringArray("emails", parsedresult.getEmails());
        bundle.putStringArray("phones", parsedresult.getPhoneNumbers());
        bundle.putString("org", parsedresult.getOrg());
        bundle.putString("title", parsedresult.getTitle());
        bundle.putStringArray("indirizzi", parsedresult.getAddresses());
        bundle.putStringArray("siti", parsedresult.getURLs());
        bundle.putString("note", parsedresult.getNote());
        Log.d("", (new StringBuilder("DISPLAY ")).append(parsedresult.getDisplayResult()).toString());
        return bundle;
    }

    public static int getLastElem()
    {
        return lastElem;
    }

    public static boolean getSoundPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_sound", false);
    }

    public static boolean getStartScanPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_start_scan", false);
    }

    public static String getTextFromResult(MODE mode, Result result)
    {
        Object obj;
        String s;
        obj = result.getText();
        s = "";
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[mode.ordinal()];
        JVM INSTR tableswitch 1 9: default 68
    //                   1 72
    //                   2 99
    //                   3 256
    //                   4 251
    //                   5 136
    //                   6 205
    //                   7 309
    //                   8 920
    //                   9 922;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        mode = ((MODE) (obj));
_L12:
        return mode;
_L2:
        result = ResultParser.parseResult(result);
        mode = s;
        if (result == null) goto _L12; else goto _L11
_L11:
        result = (AddressBookParsedResult)result;
        mode = s;
        if (result == null) goto _L12; else goto _L13
_L13:
        return result.getDisplayResult();
_L3:
        if (result.getText().contains("MATMSG:"))
        {
            MatMsg.getMatMsgFromString(result.getText());
            return MatMsg.getBODY();
        } else
        {
            Mail.getMailFromString(result.getText());
            return Mail.getString();
        }
_L6:
        result = ((Result) (obj));
        mode = result;
        if (((String) (obj)).contains("geo:"))
        {
            mode = result.replace("geo:", "");
        }
        result = mode;
        if (((String) (obj)).contains("GEO:"))
        {
            result = mode.replace("GEO:", "");
        }
        mode = result;
        if (!((String) (obj)).contains("?q=")) goto _L12; else goto _L14
_L14:
        return result.replace("?q=", " ");
_L7:
        mode = ((MODE) (obj));
        result = mode;
        if (((String) (obj)).contains("tel:"))
        {
            result = mode.replace("tel:", "");
        }
        mode = result;
        if (!((String) (obj)).contains("TEL:")) goto _L12; else goto _L15
_L15:
        return result.replace("TEL:", "");
_L5:
        return result.getText();
_L4:
        mode = result.getText();
        if (result.getText().startsWith("uri:"))
        {
            mode = result.getText().replaceFirst("uri:", "");
        }
        if (!result.getText().startsWith("URI:")) goto _L12; else goto _L16
_L16:
        return result.getText().replaceFirst("URI:", "");
_L8:
        String as[];
        int i;
        as = ((String) (obj)).split("\n|(:)");
        i = 0;
        obj = s;
_L22:
        mode = ((MODE) (obj));
        if (i >= as.length) goto _L12; else goto _L17
_L17:
        result = ((Result) (obj));
        if (!as[i].contains("DTSTART")) goto _L19; else goto _L18
_L18:
        mode = as[i + 1];
        if (!TextUtils.isEmpty(mode)) goto _L21; else goto _L20
_L20:
        mode = ((MODE) (obj));
_L26:
        i++;
        obj = mode;
          goto _L22
_L21:
        result = mode.replace("T", "").replace("00Z", "");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        mode = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        try
        {
            result = simpledateformat.parse(result);
            Log.d("", (new StringBuilder("START ")).append(result.getTime()).toString());
            result = (new StringBuilder(String.valueOf(obj))).append(mode.format(result)).append("\n").toString();
        }
        // Misplaced declaration of an exception variable
        catch (MODE mode)
        {
            mode.printStackTrace();
            result = ((Result) (obj));
        }
_L19:
        obj = result;
        if (!as[i].contains("DTEND")) goto _L24; else goto _L23
_L23:
        obj = as[i + 1];
        mode = result;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L26; else goto _L25
_L25:
        obj = ((String) (obj)).replace("T", "").replace("00Z", "");
        simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        mode = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        try
        {
            obj = simpledateformat.parse(((String) (obj)));
            Log.d("", (new StringBuilder("END ")).append(((Date) (obj)).getTime()).toString());
            obj = (new StringBuilder(String.valueOf(result))).append(mode.format(((Date) (obj)))).append("\n").toString();
        }
        // Misplaced declaration of an exception variable
        catch (MODE mode)
        {
            mode.printStackTrace();
            obj = result;
        }
_L24:
        result = ((Result) (obj));
        if (!as[i].contains("LOCATION")) goto _L28; else goto _L27
_L27:
        Log.d("", (new StringBuilder("Luogo ")).append(as[i + 1]).toString());
        mode = ((MODE) (obj));
        if (TextUtils.isEmpty(as[i + 1])) goto _L26; else goto _L29
_L29:
        result = (new StringBuilder(String.valueOf(obj))).append(as[i + 1]).append("\n").toString();
_L28:
        obj = result;
        if (!as[i].contains("DESCRIPTION")) goto _L31; else goto _L30
_L30:
        Log.d("", (new StringBuilder("Descrizione ")).append(as[i + 1]).toString());
        mode = result;
        if (TextUtils.isEmpty(as[i + 1])) goto _L26; else goto _L32
_L32:
        obj = (new StringBuilder(String.valueOf(result))).append(as[i + 1]).append("\n").toString();
_L31:
        mode = ((MODE) (obj));
        if (as[i].contains("SUMMARY"))
        {
            Log.d("", (new StringBuilder("Titolo ")).append(as[i + 1]).toString());
            mode = ((MODE) (obj));
            if (!TextUtils.isEmpty(as[i + 1]))
            {
                mode = (new StringBuilder(String.valueOf(obj))).append(as[i + 1]).append("\n").toString();
            }
        }
          goto _L26
_L9:
        return ((String) (obj));
_L10:
        return ((String) (obj));
          goto _L26
    }

    public static boolean getVibratePref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_vibrate", false);
    }

    public static void launchResultActivity(Context context, Bundle bundle, Bitmap bitmap)
    {
        Intent intent = new Intent(context, com/QRBS/activity/MyResultActivity);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        intent.putExtra("picture", bytearrayoutputstream.toByteArray());
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public static Bundle makeBundle(Result result)
    {
        Bundle bundle = new Bundle();
        bundle.putString("TEXT", result.getText());
        bundle.putString("format", result.getBarcodeFormat().toString());
        long l = result.getTimestamp();
        bundle.putString("details", (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(new Date(l)));
        ParsedResult parsedresult = ResultParser.parseResult(result);
        String s1 = parsedresult.getType().toString();
        bundle.putString("type", s1);
        String s = result.getText();
        if (s1 == "URI")
        {
            s = getTextFromResult(MODE._url, result);
        }
        if (s1 == "ADDRESSBOOK")
        {
            s = getTextFromResult(MODE._contact, result);
        }
        if (s1 == "GEO")
        {
            s = getTextFromResult(MODE._geo, result);
        }
        if (s1 == "TEL")
        {
            s = getTextFromResult(MODE._phone, result);
        }
        if (s1 == "TEXT")
        {
            s = getTextFromResult(MODE._text, result);
        }
        if (s1 == "EMAIL_ADDRESS")
        {
            s = getTextFromResult(MODE._email, result);
        }
        if (s1 == "CALENDAR")
        {
            s = getTextFromResult(MODE._calendar, result);
        }
        if (s1 == "PRODUCT")
        {
            s = getTextFromResult(MODE._product, result);
        }
        bundle.putString("label", s);
        if (s1 == "ADDRESSBOOK")
        {
            bundle.putBundle("extraData", getExtraData(parsedresult));
        }
        return bundle;
    }

    public static final String md5(String s)
    {
        byte abyte0[];
        StringBuffer stringbuffer;
        int i;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            abyte0 = messagedigest.digest();
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        i = 0;
        if (i >= abyte0.length)
        {
            return stringbuffer.toString();
        }
        s = Integer.toHexString(abyte0[i] & 0xff);
_L1:
        if (s.length() < 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        stringbuffer.append(s);
        i++;
        break MISSING_BLOCK_LABEL_30;
        s = (new StringBuilder("0")).append(s).toString();
          goto _L1
    }

    public static void saveInDB(Context context, Result result)
    {
        context = new DbAdapter(context);
        context.open();
        Calendar calendar = Calendar.getInstance();
        String s = (new SimpleDateFormat("dd-MM-yyyy")).format(calendar.getTime());
        context.createRecord(result, (new SimpleDateFormat("HH:mm:ss")).format(calendar.getTime()), s);
        context.close();
    }

    public static void setLastElem(int i)
    {
        lastElem = i;
    }

    public static void showToastNotification(Activity activity, String s)
    {
        Toast.makeText(activity, s, 0).show();
    }

    public boolean checkConnectivity(Activity activity)
    {
        ArrayList arraylist = new ArrayList();
        activity = (ConnectivityManager)activity.getSystemService("connectivity");
        NetworkInfo networkinfo = activity.getNetworkInfo(1);
        if (networkinfo != null)
        {
            arraylist.add(networkinfo);
        }
        networkinfo = activity.getNetworkInfo(0);
        if (networkinfo != null)
        {
            arraylist.add(networkinfo);
        }
        activity = activity.getNetworkInfo(6);
        if (activity != null)
        {
            arraylist.add(activity);
        }
        Log.d("", (new StringBuilder("size")).append(String.valueOf(arraylist.size())).toString());
        int i = 0;
        do
        {
            if (i >= arraylist.size())
            {
                return false;
            }
            if (((NetworkInfo)arraylist.get(i)).getState() == android.net.NetworkInfo.State.CONNECTED)
            {
                return true;
            }
            i++;
        } while (true);
    }

    public void clearScreen()
    {
        if (lastPD != null)
        {
            lastPD.dismiss();
        }
    }

    public boolean getCopyToClipboardPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_clipboard", false);
    }

    public boolean getPlaySoundPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_sound", false);
    }

    public boolean getRedirectPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_automat", false);
    }

    public float getScreenDensity(Activity activity)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.density;
    }

    public String getTimeDetails()
    {
        Object obj = Calendar.getInstance();
        int i = ((Calendar) (obj)).get(11);
        int j = ((Calendar) (obj)).get(12);
        int k = ((Calendar) (obj)).get(13);
        int l = ((Calendar) (obj)).get(5);
        int i1 = ((Calendar) (obj)).get(2);
        int j1 = ((Calendar) (obj)).get(1);
        obj = (new StringBuilder(String.valueOf(l))).append("/").append(i1 + 1).append("/").append(j1).toString();
        String s = (new StringBuilder(String.valueOf(i))).append(":").append(j).append(":").append(k).toString();
        return (new StringBuilder(String.valueOf(obj))).append(" ").append(s).toString();
    }

    public Vibrator getVibrator(Context context)
    {
        return (Vibrator)context.getSystemService("vibrator");
    }

    public android.app.AlertDialog.Builder makeAlertDialog(final Activity app, String s, String s1, boolean flag, final Intent intent, final boolean finish)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(app);
        builder.setCancelable(flag);
        builder.setTitle(s);
        builder.setMessage(s1);
        builder.setNeutralButton("OK", new android.content.DialogInterface.OnClickListener() {

            final Utils this$0;
            private final Activity val$app;
            private final boolean val$finish;
            private final Intent val$intent;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (Utils.getVibratePref(app))
                {
                    getVibrator(app).vibrate(60L);
                }
                if (intent != null)
                {
                    app.startActivity(intent);
                }
                dialoginterface.dismiss();
                if (finish)
                {
                    app.finish();
                }
            }

            
            {
                this$0 = Utils.this;
                app = activity;
                intent = intent1;
                finish = flag;
                super();
            }
        });
        return builder;
    }

    public ProgressDialog showProgress(Activity activity, String s, String s1)
    {
        clearScreen();
        activity = ProgressDialog.show(activity, s, s1, true);
        activity.show();
        lastPD = activity;
        return activity;
    }

}
