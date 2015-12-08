// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.android.Contents;
import com.google.zxing.client.android.clipboard.ClipboardInterface;

// Referenced classes of package com.google.zxing.client.android.share:
//            BookmarkPickerActivity, AppPickerActivity

public final class ShareActivity extends Activity
{

    private static final int PICK_APP = 2;
    private static final int PICK_BOOKMARK = 0;
    private static final int PICK_CONTACT = 1;
    private static final String TAG = com/google/zxing/client/android/share/ShareActivity.getSimpleName();
    private final android.view.View.OnClickListener appListener = new android.view.View.OnClickListener() {

        final ShareActivity this$0;

        public void onClick(View view)
        {
            view = new Intent("android.intent.action.PICK");
            view.addFlags(0x80000);
            view.setClassName(ShareActivity.this, com/google/zxing/client/android/share/AppPickerActivity.getName());
            startActivityForResult(view, 2);
        }

            
            {
                this$0 = ShareActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener bookmarkListener = new android.view.View.OnClickListener() {

        final ShareActivity this$0;

        public void onClick(View view)
        {
            view = new Intent("android.intent.action.PICK");
            view.addFlags(0x80000);
            view.setClassName(ShareActivity.this, com/google/zxing/client/android/share/BookmarkPickerActivity.getName());
            startActivityForResult(view, 0);
        }

            
            {
                this$0 = ShareActivity.this;
                super();
            }
    };
    private View clipboardButton;
    private final android.view.View.OnClickListener clipboardListener = new android.view.View.OnClickListener() {

        final ShareActivity this$0;

        public void onClick(View view)
        {
            view = ClipboardInterface.getText(ShareActivity.this);
            if (view != null)
            {
                launchSearch(view.toString());
            }
        }

            
            {
                this$0 = ShareActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener contactListener = new android.view.View.OnClickListener() {

        final ShareActivity this$0;

        public void onClick(View view)
        {
            view = new Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI);
            view.addFlags(0x80000);
            startActivityForResult(view, 1);
        }

            
            {
                this$0 = ShareActivity.this;
                super();
            }
    };
    private final android.view.View.OnKeyListener textListener = new android.view.View.OnKeyListener() {

        final ShareActivity this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (i == 66 && keyevent.getAction() == 0)
            {
                view = ((TextView)view).getText().toString();
                if (view != null && !view.isEmpty())
                {
                    launchSearch(view);
                }
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = ShareActivity.this;
                super();
            }
    };

    public ShareActivity()
    {
    }

    private void launchSearch(String s)
    {
        Intent intent = new Intent("com.google.zxing.client.android.ENCODE");
        intent.addFlags(0x80000);
        intent.putExtra("ENCODE_TYPE", "TEXT_TYPE");
        intent.putExtra("ENCODE_DATA", s);
        intent.putExtra("ENCODE_FORMAT", BarcodeFormat.QR_CODE.toString());
        startActivity(intent);
    }

    private static String massageContactData(String s)
    {
        String s1 = s;
        if (s.indexOf('\n') >= 0)
        {
            s1 = s.replace("\n", " ");
        }
        s = s1;
        if (s1.indexOf('\r') >= 0)
        {
            s = s1.replace("\r", " ");
        }
        return s;
    }

    private void showContactAsBarcode(Uri uri)
    {
        Log.i(TAG, (new StringBuilder()).append("Showing contact URI as barcode: ").append(uri).toString());
        if (uri != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = getContentResolver();
        boolean flag;
        try
        {
            uri = ((ContentResolver) (obj)).query(uri, null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return;
        }
        if (uri == null) goto _L1; else goto _L3
_L3:
        flag = uri.moveToFirst();
        if (!flag)
        {
            uri.close();
            return;
        }
        String s;
        Object obj1;
        int i;
        s = uri.getString(uri.getColumnIndex("_id"));
        obj1 = uri.getString(uri.getColumnIndex("display_name"));
        i = uri.getInt(uri.getColumnIndex("has_phone_number"));
        String s1;
        int j;
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        uri.close();
        uri = new Bundle();
        if (obj1 != null && !((String) (obj1)).isEmpty())
        {
            uri.putString("name", massageContactData(((String) (obj1))));
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj1 = ((ContentResolver) (obj)).query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, (new StringBuilder()).append("contact_id=").append(s).toString(), null, null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        i = 0;
        j = ((Cursor) (obj1)).getColumnIndex("data1");
_L4:
        if (!((Cursor) (obj1)).moveToNext() || i >= Contents.PHONE_KEYS.length)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        s1 = ((Cursor) (obj1)).getString(j);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (!s1.isEmpty())
        {
            uri.putString(Contents.PHONE_KEYS[i], massageContactData(s1));
        }
        i++;
          goto _L4
        obj;
        uri.close();
        throw obj;
        ((Cursor) (obj1)).close();
        obj1 = ((ContentResolver) (obj)).query(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, null, (new StringBuilder()).append("contact_id=").append(s).toString(), null, null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        String s2;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_397;
        }
        s2 = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("data1"));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_397;
        }
        if (!s2.isEmpty())
        {
            uri.putString("postal", massageContactData(s2));
        }
        ((Cursor) (obj1)).close();
        obj = ((ContentResolver) (obj)).query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, (new StringBuilder()).append("contact_id=").append(s).toString(), null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        i = 0;
        int k = ((Cursor) (obj)).getColumnIndex("data1");
_L5:
        if (!((Cursor) (obj)).moveToNext() || i >= Contents.EMAIL_KEYS.length)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        s = ((Cursor) (obj)).getString(k);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        if (!s.isEmpty())
        {
            uri.putString(Contents.EMAIL_KEYS[i], massageContactData(s));
        }
        i++;
          goto _L5
        uri;
        ((Cursor) (obj1)).close();
        throw uri;
        uri;
        ((Cursor) (obj1)).close();
        throw uri;
        ((Cursor) (obj)).close();
        obj = new Intent("com.google.zxing.client.android.ENCODE");
        ((Intent) (obj)).addFlags(0x80000);
        ((Intent) (obj)).putExtra("ENCODE_TYPE", "CONTACT_TYPE");
        ((Intent) (obj)).putExtra("ENCODE_DATA", uri);
        ((Intent) (obj)).putExtra("ENCODE_FORMAT", BarcodeFormat.QR_CODE.toString());
        Log.i(TAG, (new StringBuilder()).append("Sending bundle for encoding: ").append(uri).toString());
        startActivity(((Intent) (obj)));
        return;
        uri;
        ((Cursor) (obj)).close();
        throw uri;
    }

    private void showTextAsBarcode(String s)
    {
        Log.i(TAG, (new StringBuilder()).append("Showing text as barcode: ").append(s).toString());
        if (s == null)
        {
            return;
        } else
        {
            Intent intent = new Intent("com.google.zxing.client.android.ENCODE");
            intent.addFlags(0x80000);
            intent.putExtra("ENCODE_TYPE", "TEXT_TYPE");
            intent.putExtra("ENCODE_DATA", s);
            intent.putExtra("ENCODE_FORMAT", BarcodeFormat.QR_CODE.toString());
            startActivity(intent);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j != -1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 44
    //                   2 33;
           goto _L2 _L3 _L4 _L3
_L2:
        return;
_L3:
        showTextAsBarcode(intent.getStringExtra("url"));
        return;
_L4:
        showContactAsBarcode(intent.getData());
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.google.zxing.client.android.R.layout.share);
        findViewById(com.google.zxing.client.android.R.id.share_contact_button).setOnClickListener(contactListener);
        findViewById(com.google.zxing.client.android.R.id.share_bookmark_button).setOnClickListener(bookmarkListener);
        findViewById(com.google.zxing.client.android.R.id.share_app_button).setOnClickListener(appListener);
        clipboardButton = findViewById(com.google.zxing.client.android.R.id.share_clipboard_button);
        clipboardButton.setOnClickListener(clipboardListener);
        findViewById(com.google.zxing.client.android.R.id.share_text_view).setOnKeyListener(textListener);
    }

    protected void onResume()
    {
        super.onResume();
        clipboardButton.setEnabled(ClipboardInterface.hasText(this));
    }


}
