// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.QRBS.activity.MyEncodeActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.scannerfire.utils:
//            Utils

public class EncodeUtils
{
    public class CalSel
    {

        long ID;
        String NAME;
        final EncodeUtils this$0;

        public long getId()
        {
            return ID;
        }

        public String getName()
        {
            return NAME;
        }

        public CalSel(long l, String s)
        {
            this$0 = EncodeUtils.this;
            super();
            ID = l;
            NAME = s;
        }
    }

    private class ChangeColorTask extends AsyncTask
    {

        MyEncodeActivity activity;
        Bitmap bmp;
        ImageView image;
        int newColor;
        final EncodeUtils this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            QRCodeWriter qrcodewriter = new QRCodeWriter();
            int ai[];
            int l;
            int i1;
            EnumMap enummap = new EnumMap(com/google/zxing/EncodeHintType);
            enummap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            as = qrcodewriter.encode(as[0], BarcodeFormat.QR_CODE, 350, 350, enummap);
            l = as.getWidth();
            i1 = as.getHeight();
            ai = new int[l * i1];
            int i = 0;
_L1:
            if (i >= i1)
            {
                int j;
                int k;
                try
                {
                    bmp = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_8888);
                    bmp.setPixels(ai, 0, l, 0, 0, l, i1);
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    as.printStackTrace();
                }
                return "OK";
            }
            j = 0;
label0:
            {
                if (j < l)
                {
                    break label0;
                }
                i++;
            }
              goto _L1
            if (!as.get(j, i))
            {
                break MISSING_BLOCK_LABEL_167;
            }
            k = newColor;
_L3:
            ai[i * l + j] = k;
            j++;
            break MISSING_BLOCK_LABEL_113;
            k = -1;
            if (true) goto _L3; else goto _L2
_L2:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            prog.dismiss();
            image.setImageBitmap(bmp);
            activity.changeBmp(bmp);
        }

        protected void onPreExecute()
        {
        }

        protected volatile transient void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        protected ChangeColorTask(int i, ImageView imageview, MyEncodeActivity myencodeactivity)
        {
            this$0 = EncodeUtils.this;
            super();
            newColor = i;
            image = imageview;
            activity = myencodeactivity;
        }
    }

    private class EncodeTask extends AsyncTask
    {

        final EncodeUtils this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            Object obj = new QRCodeWriter();
            Object obj1;
            int l;
            int i1;
            obj1 = new EnumMap(com/google/zxing/EncodeHintType);
            ((EnumMap) (obj1)).put(EncodeHintType.CHARACTER_SET, "UTF-8");
            obj1 = ((QRCodeWriter) (obj)).encode(as[0], BarcodeFormat.QR_CODE, 350, 350, ((java.util.Map) (obj1)));
            l = ((BitMatrix) (obj1)).getWidth();
            i1 = ((BitMatrix) (obj1)).getHeight();
            obj = new int[l * i1];
            int i = 0;
_L1:
            if (i >= i1)
            {
                int j;
                int k;
                try
                {
                    obj1 = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_8888);
                    ((Bitmap) (obj1)).setPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
                    obj = new Intent(activity, com/QRBS/activity/MyEncodeActivity);
                    ((Intent) (obj)).putExtra("image", ((android.os.Parcelable) (obj1)));
                    ((Intent) (obj)).putExtra("parametro", as[0]);
                    ((Intent) (obj)).putExtra("text", as[1]);
                    activity.startActivity(((Intent) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    as.printStackTrace();
                }
                return "OK";
            }
            j = 0;
label0:
            {
                if (j < l)
                {
                    break label0;
                }
                i++;
            }
              goto _L1
            if (((BitMatrix) (obj1)).get(j, i))
            {
                k = 0xff000000;
            } else
            {
                k = -1;
            }
            obj[i * l + j] = k;
            j++;
            break MISSING_BLOCK_LABEL_163;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            prog.dismiss();
        }

        protected void onPreExecute()
        {
        }

        protected volatile transient void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        private EncodeTask()
        {
            this$0 = EncodeUtils.this;
            super();
        }

        EncodeTask(EncodeTask encodetask)
        {
            this();
        }
    }

    public class ICal
    {

        String des;
        long end;
        long start;
        final EncodeUtils this$0;
        String what;
        String where;

        public String getDes()
        {
            return des;
        }

        public String getEnd()
        {
            return (new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())).format(new Date(end));
        }

        public String getStart()
        {
            return (new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())).format(new Date(start));
        }

        public long getStartMill()
        {
            return start;
        }

        public String getWhat()
        {
            return what;
        }

        public String getWhere()
        {
            return where;
        }

        public ICal(String s, String s1, String s2, long l, long l1)
        {
            this$0 = EncodeUtils.this;
            super();
            what = s;
            where = s1;
            des = s2;
            start = l;
            end = l1;
        }
    }

    private class ShareTask extends AsyncTask
    {

        final EncodeUtils this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            Object obj = new QRCodeWriter();
            Object obj1;
            int l;
            int i1;
            obj1 = new EnumMap(com/google/zxing/EncodeHintType);
            ((EnumMap) (obj1)).put(EncodeHintType.CHARACTER_SET, "UTF-8");
            obj1 = ((QRCodeWriter) (obj)).encode(as[0], BarcodeFormat.QR_CODE, 350, 350, ((java.util.Map) (obj1)));
            l = ((BitMatrix) (obj1)).getWidth();
            i1 = ((BitMatrix) (obj1)).getHeight();
            obj = new int[l * i1];
            int i = 0;
_L2:
            if (i < i1)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            as = as[0];
            obj1 = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_8888);
            ((Bitmap) (obj1)).setPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
            obj = EncodeUtils.getImageUri(activity.getApplicationContext(), ((Bitmap) (obj1)));
            if (obj != null)
            {
                break; /* Loop/switch isn't completed */
            }
            Utils.showToastNotification(activity, "Error");
            return "ERROR";
            int j = 0;
_L3:
label0:
            {
                if (j < l)
                {
                    break label0;
                }
                i++;
            }
            if (true) goto _L2; else goto _L1
            int k;
            if (((BitMatrix) (obj1)).get(j, i))
            {
                k = 0xff000000;
            } else
            {
                k = -1;
            }
            break MISSING_BLOCK_LABEL_298;
_L1:
            try
            {
                obj1 = new Intent();
                ((Intent) (obj1)).setAction("android.intent.action.SEND");
                ((Intent) (obj1)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
                ((Intent) (obj1)).putExtra("android.intent.extra.SUBJECT", (new StringBuilder("Powered by ")).append(activity.getString(0x7f0800b1)).append(" - http://goo.gl/pTAlm4").toString());
                ((Intent) (obj1)).putExtra("android.intent.extra.EMAIL", as);
                ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", as);
                ((Intent) (obj1)).setType("image/jpeg");
                activity.startActivity(Intent.createChooser(((Intent) (obj1)), activity.getString(0x7f080112)));
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                as.printStackTrace();
            }
            return "OK";
            obj[i * l + j] = k;
            j++;
              goto _L3
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            prog.dismiss();
        }

        protected void onPreExecute()
        {
        }

        protected volatile transient void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        private ShareTask()
        {
            this$0 = EncodeUtils.this;
            super();
        }

        ShareTask(ShareTask sharetask)
        {
            this();
        }
    }


    final Activity activity;
    ProgressDialog prog;

    public EncodeUtils(Activity activity1)
    {
        activity = activity1;
    }

    public static String ICalToString(ICal ical)
    {
        String as[] = ical.getStart().split("\\s+");
        String as1[] = ical.getEnd().split("\\s+");
        return createCalendarString(ical.getWhat(), ical.getWhere(), ical.getDes(), as[0], as[1], as1[0], as1[1]);
    }

    public static String createCalendarString(String s, String s1, String s2, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, CharSequence charsequence3)
    {
        String s3 = "BEGIN:VEVENT\n";
        if (s != null)
        {
            s3 = (new StringBuilder(String.valueOf("BEGIN:VEVENT\n"))).append("SUMMARY:").append(s).append("\n").toString();
        }
        s = s3;
        if (charsequence != null)
        {
            s = s3;
            if (charsequence1 != null)
            {
                s = (new StringBuilder(String.valueOf(s3))).append("DTSTART:").append(((String)charsequence).replace("/", "")).append("T").append(((String)charsequence1).replace(":", "")).append("00Z\n").toString();
            }
        }
        charsequence = s;
        if (charsequence2 != null)
        {
            charsequence = s;
            if (charsequence3 != null)
            {
                charsequence = (new StringBuilder(String.valueOf(s))).append("DTEND:").append(((String)charsequence2).replace("/", "")).append("T").append(((String)charsequence3).replace(":", "")).append("00Z\n").toString();
            }
        }
        s = charsequence;
        if (s2 != null)
        {
            s = (new StringBuilder(String.valueOf(charsequence))).append("DESCRIPTION:").append(s2).append("\n").toString();
        }
        s2 = s;
        if (s1 != null)
        {
            s2 = (new StringBuilder(String.valueOf(s))).append("LOCATION:").append(s1).append("\n").toString();
        }
        s = (new StringBuilder(String.valueOf(s2))).append("END:VEVENT").toString();
        Log.d("CALENDAR ", s);
        return s;
    }

    public static Uri getImageUri(Context context, Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, bytearrayoutputstream);
        context = android.provider.MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", null);
        if (context == null)
        {
            return null;
        } else
        {
            return Uri.parse(context);
        }
    }

    public void changeColor(String s, int i, ImageView imageview, Bitmap bitmap, MyEncodeActivity myencodeactivity)
    {
        prog = (new Utils()).showProgress(activity, activity.getString(0x7f08010a), activity.getString(0x7f0800f9));
        (new ChangeColorTask(i, imageview, myencodeactivity)).execute(new String[] {
            s
        });
    }

    public String[] generateVcard(Uri uri)
    {
        ContentResolver contentresolver;
        Cursor cursor;
        StringBuilder stringbuilder;
        contentresolver = activity.getContentResolver();
        cursor = contentresolver.query(uri, null, null, null, null);
        uri = "";
        stringbuilder = new StringBuilder();
        stringbuilder.append("MECARD:");
_L5:
        Object obj;
        String s;
        if (!cursor.moveToNext())
        {
            stringbuilder.append(";");
            cursor.close();
            return (new String[] {
                stringbuilder.toString(), uri
            });
        }
        s = cursor.getString(cursor.getColumnIndex("_id"));
        String s2 = cursor.getString(cursor.getColumnIndex("display_name"));
        obj = (new StringBuilder(String.valueOf(uri))).append(s2).toString();
        stringbuilder.append((new StringBuilder("N:")).append(s2).append(";").toString());
        uri = ((Uri) (obj));
        if (Integer.parseInt(cursor.getString(cursor.getColumnIndex("has_phone_number"))) <= 0) goto _L2; else goto _L1
_L1:
        Cursor cursor1;
        cursor1 = contentresolver.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[] {
            s
        }, null);
        uri = ((Uri) (obj));
_L6:
        if (cursor1.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor1.close();
_L2:
        obj = contentresolver.query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, (new StringBuilder(String.valueOf("contact_id"))).append(" = ?").toString(), new String[] {
            s
        }, null);
_L7:
        if (((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((Cursor) (obj)).close();
          goto _L5
_L4:
        obj = cursor1.getString(cursor1.getColumnIndex("data1"));
        stringbuilder.append((new StringBuilder("TEL:")).append(((String) (obj))).append(";").toString());
        uri = (new StringBuilder(String.valueOf(uri))).append("\n").append(((String) (obj))).toString();
          goto _L6
        String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
        stringbuilder.append((new StringBuilder("EMAIL:")).append(s1).append(";").toString());
        uri = (new StringBuilder(String.valueOf(uri))).append("\n").append(s1).toString();
          goto _L7
    }

    public List getCalendars(Application application, long l)
    {
        ArrayList arraylist = new ArrayList();
        application = application.getApplicationContext().getContentResolver();
        String s = (new StringBuilder("calendar_id=")).append(l).toString();
        application = application.query(Uri.parse("content://com.android.calendar/events"), new String[] {
            "calendar_id", "title", "description", "dtstart", "dtend", "eventLocation"
        }, s, null, "dtstart");
        if (!application.moveToFirst())
        {
            return null;
        }
        int i = 0;
        do
        {
            if (i >= application.getCount())
            {
                application.close();
                return arraylist;
            }
            arraylist.add(new ICal(application.getString(1), application.getString(5), application.getString(2), application.getLong(3), application.getLong(4)));
            Log.d("", (new StringBuilder("ID -> ")).append(application.getInt(0)).toString());
            application.moveToNext();
            i++;
        } while (true);
    }

    public List getCalendarsSel(Application application)
    {
        String as[] = {
            "_id", "displayName"
        };
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            as = (new String[] {
                "_id", "calendar_displayName"
            });
        }
        ArrayList arraylist = new ArrayList();
        application = application.getApplicationContext().getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), as, null, null, null);
        do
        {
            if (!application.moveToNext())
            {
                application.close();
                return arraylist;
            }
            Log.d("", (new StringBuilder("CALSEL OBJECT\n 0=")).append(application.getLong(0)).append("\n 1=").append(application.getString(1)).toString());
            arraylist.add(new CalSel(application.getLong(0), application.getString(1)));
        } while (true);
    }

    public String[] getEmail(Uri uri)
    {
        uri = activity.getContentResolver().query(uri, null, null, null, null);
        uri.moveToNext();
        String s = uri.getString(uri.getColumnIndex("data1"));
        uri.close();
        return (new String[] {
            (new StringBuilder("mailto:")).append(s).toString(), s
        });
    }

    public ArrayList getNameEmailDetails(Context context)
    {
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] {
            "_id", "display_name", "photo_id", "data1", "contact_id"
        }, "data1 NOT LIKE ''", null, "CASE WHEN display_name NOT LIKE '%@%' THEN 1 ELSE 2 END, display_name, data1 COLLATE NOCASE");
        if (context.moveToFirst())
        {
            do
            {
                context.getString(1);
                String s = context.getString(3);
                if (hashset.add(s.toLowerCase()))
                {
                    arraylist.add(s);
                }
            } while (context.moveToNext());
        }
        context.close();
        return arraylist;
    }

    public String[] getTel(Uri uri)
    {
        uri = activity.getContentResolver().query(uri, null, null, null, null);
        uri.moveToFirst();
        String s = uri.getString(uri.getColumnIndexOrThrow("data1"));
        uri.close();
        return (new String[] {
            (new StringBuilder("tel:")).append(s).toString(), s
        });
    }

    public void share(String s)
    {
        prog = (new Utils()).showProgress(activity, activity.getString(0x7f08010a), activity.getString(0x7f0800f9));
        (new ShareTask(null)).execute(new String[] {
            s
        });
    }

    public void start(String s, String s1)
    {
        prog = (new Utils()).showProgress(activity, activity.getString(0x7f08010a), activity.getString(0x7f0800f9));
        (new EncodeTask(null)).execute(new String[] {
            s, s1
        });
    }
}
