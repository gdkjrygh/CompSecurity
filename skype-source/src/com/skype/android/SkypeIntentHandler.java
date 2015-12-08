// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.media.OnMediaUploadAutoRetry;
import com.skype.android.app.transfer.TransferPhotoPickConversationFragment;
import com.skype.android.app.transfer.TransferPickConversationFragment;
import com.skype.android.config.FileUtil;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.util.Charsets;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android:
//            SkypeConstants

public class SkypeIntentHandler
    implements SkypeConstants
{

    private static final Logger a = Logger.getLogger("SkypeIntentHandler");
    private Context b;
    private SkyLib c;
    private Account d;
    private Navigation e;
    private AccountProvider f;
    private ContactUtil g;
    private PermissionRequest h;
    private ConversationUtil i;

    public SkypeIntentHandler(Activity activity, Navigation navigation, AccountProvider accountprovider, ContactUtil contactutil, PermissionRequest permissionrequest, ConversationUtil conversationutil)
    {
        b = activity;
        e = navigation;
        f = accountprovider;
        g = contactutil;
        h = permissionrequest;
        i = conversationutil;
    }

    static SkyLib a(SkypeIntentHandler skypeintenthandler)
    {
        return skypeintenthandler.c;
    }

    private static String a(Uri uri)
    {
        {
            if (uri == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            uri = uri.toString().split("\\?");
            if (uri.length <= 1)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            uri = uri[1];
            String as[];
            int j;
            int k;
            try
            {
                uri = uri.split("&");
                k = uri.length;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return "";
            }
            j = 0;
        }
        if (j >= k)
        {
            break;
        }
        as = uri[j].split("=");
        if (URLDecoder.decode(as[0], "UTF-8").compareTo("content") != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (as.length <= 1)
        {
            break;
        }
        uri = URLDecoder.decode(as[1], "UTF-8");
        return uri;
        for (j++; true;)
        {
            break MISSING_BLOCK_LABEL_36;
        }

        return "";
    }

    public static boolean a(String s)
    {
        return s != null && (s.equals("android.intent.action.VIEW") || s.equals("android.intent.action.CALL_PRIVILEGED") || s.equals("android.intent.action.CALL") || s.equals("android.intent.action.SENDTO") || s.equals("android.intent.action.SEND") || s.equals("android.intent.action.DIAL") || s.equals("android.intent.action.SEND_MULTIPLE") || s.equals("com.skype.playVoicemail") || s.equals("share") || s.equals("com.skype.callback"));
    }

    private final Uri b(Intent intent)
    {
        Object obj;
        Object obj1;
        java.io.FileInputStream fileinputstream;
        FileOutputStream fileoutputstream;
        Object obj2;
        java.io.FileInputStream fileinputstream1;
        FileOutputStream fileoutputstream1;
        byte abyte0[];
        Uri uri;
        Object obj3;
        String s1;
        uri = (Uri)intent.getExtras().getParcelable("android.intent.extra.STREAM");
        obj = uri;
        if (uri.getScheme().equals("file"))
        {
            break MISSING_BLOCK_LABEL_417;
        }
        s1 = null;
        obj1 = null;
        abyte0 = null;
        fileinputstream = null;
        fileoutputstream1 = null;
        obj3 = null;
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = s1;
        obj = abyte0;
        fileoutputstream = fileoutputstream1;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = s1;
        obj = abyte0;
        fileoutputstream = fileoutputstream1;
        Toast.makeText(b, 0x7f0803c8, 1).show();
        FileUtil.closeStream(null);
        FileUtil.closeStream(null);
        return null;
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = s1;
        obj = abyte0;
        fileoutputstream = fileoutputstream1;
        obj1 = b.getContentResolver().openAssetFileDescriptor(uri, "r");
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = abyte0;
        fileoutputstream = fileoutputstream1;
        fileinputstream = ((AssetFileDescriptor) (obj1)).createInputStream();
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        abyte0 = new byte[(int)((AssetFileDescriptor) (obj1)).getDeclaredLength()];
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        FileUtil.readFully(abyte0, fileinputstream);
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        String s = new String(abyte0, Charsets.a);
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        s1 = (new StringBuilder()).append(b(s)).append(".vcf").toString();
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        s1 = (new StringBuilder()).append(b.getExternalCacheDir().toString()).append(File.separator).append(s1).toString();
        obj2 = obj1;
        fileinputstream1 = fileinputstream;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        fileoutputstream1 = new FileOutputStream(s1, false);
        fileoutputstream1.write(s.getBytes(Charsets.a));
        intent = Uri.fromFile(new File(s1));
        FileUtil.closeStream(fileinputstream);
        FileUtil.closeStream(fileoutputstream1);
        obj = intent;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        ((AssetFileDescriptor) (obj1)).close();
        obj = intent;
_L1:
        return ((Uri) (obj));
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = intent;
          goto _L1
        Exception exception1;
        exception1;
        fileoutputstream1 = obj3;
        fileinputstream = fileinputstream1;
        obj1 = obj2;
_L5:
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        fileoutputstream = fileoutputstream1;
        exception1.printStackTrace();
        FileUtil.closeStream(fileinputstream);
        FileUtil.closeStream(fileoutputstream1);
        obj = uri;
        if (obj1 == null) goto _L1; else goto _L2
_L2:
        ((AssetFileDescriptor) (obj1)).close();
        obj = uri;
          goto _L1
        intent;
        intent.printStackTrace();
        obj = uri;
          goto _L1
        obj1;
_L4:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        FileUtil.closeStream(fileoutputstream);
        if (intent != null)
        {
            try
            {
                intent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
            }
        }
        throw obj1;
        Exception exception;
        exception;
        fileoutputstream = fileoutputstream1;
        intent = ((Intent) (obj1));
        obj = fileinputstream;
        obj1 = exception;
        if (true) goto _L4; else goto _L3
_L3:
        exception1;
          goto _L5
    }

    static Navigation b(SkypeIntentHandler skypeintenthandler)
    {
        return skypeintenthandler.e;
    }

    private static final String b(String s)
    {
        String s1 = "contact";
        String as[] = s.split("\n");
        int k = as.length;
        int j = 0;
        do
        {
label0:
            {
                s = s1;
                if (j < k)
                {
                    s = as[j];
                    if (!s.startsWith("N:") && !s.startsWith("ORG:"))
                    {
                        break label0;
                    }
                    s = s.substring(s.indexOf(':') + 1, s.length() - 1).replaceAll("(\\s)|(\\p{Punct})", "");
                }
                return s;
            }
            j++;
        } while (true);
    }

    public final void a(Intent intent)
    {
        Object obj;
        boolean flag;
        obj = intent.getAction();
        c = SkyLibInitializer.a().c();
        flag = false;
        if (c != null)
        {
            d = f.get();
            ConversationImpl conversationimpl;
            if (d.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).equals("android.intent.action.VIEW")) goto _L4; else goto _L3
_L3:
        if (intent.getData() != null && intent.getData().getScheme().equals("tel"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L4; else goto _L5
_L5:
        if (!intent.hasExtra("com.skype.identitiy")) goto _L7; else goto _L6
_L6:
        obj = intent.getStringExtra("com.skype.identitiy");
        conversationimpl = new ConversationImpl();
        if (c.getConversationByIdentity(((String) (obj)), conversationimpl, false))
        {
            e.chat(conversationimpl);
        }
        if (intent.hasExtra("autoRetry"))
        {
            EventBusInstance.a().a(new OnMediaUploadAutoRetry(((String) (obj))));
        }
_L15:
        return;
_L7:
        Object obj1 = intent.getData();
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        obj = b.getContentResolver().query(((Uri) (obj1)), null, null, null, null);
        if (obj == null) goto _L11; else goto _L10
_L10:
        obj1 = intent.resolveType(b);
        intent = null;
        if (((Cursor) (obj)).moveToFirst())
        {
            intent = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
        }
        if (!TextUtils.isEmpty(intent)) goto _L13; else goto _L12
_L12:
        a.warning("Spurious intent is being ignored");
_L16:
        if (obj == null) goto _L15; else goto _L14
_L14:
        ((Cursor) (obj)).close();
        return;
_L13:
        Object obj2;
        SkyLib skylib = SkyLibInitializer.a().c();
        obj2 = new ContactImpl();
        if (skylib.getContact(intent, ((Contact) (obj2))))
        {
            if (!((String) (obj1)).equals("vnd.android.cursor.item/com.skype.android.chat.action"))
            {
                break MISSING_BLOCK_LABEL_343;
            }
            e.chat(((Contact) (obj2)));
        }
          goto _L16
        intent;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw intent;
        if (!((String) (obj1)).equals("vnd.android.cursor.item/com.skype.android.skypecall.action")) goto _L18; else goto _L17
_L17:
        e.placeCall(((Contact) (obj2)));
          goto _L16
_L18:
        if (!((String) (obj1)).equals("vnd.android.cursor.item/com.skype.android.videocall.action")) goto _L16; else goto _L19
_L19:
        e.placeCallWithVideo(((Contact) (obj2)));
          goto _L16
_L11:
        if (!((Uri) (obj1)).getScheme().equals("skype")) goto _L21; else goto _L20
_L20:
        Object obj3;
        String s2;
        intent = ((Uri) (obj1)).getSchemeSpecificPart();
        obj3 = new UrlQuerySanitizer(((Uri) (obj1)).toString());
        ((UrlQuerySanitizer) (obj3)).setAllowUnregisteredParamaters(true);
        s2 = intent.split("\\?")[0];
        if (((UrlQuerySanitizer) (obj3)).getParameterList().size() <= 0)
        {
            break MISSING_BLOCK_LABEL_1868;
        }
        intent = ((android.net.UrlQuerySanitizer.ParameterValuePair)((UrlQuerySanitizer) (obj3)).getParameterList().get(0)).mParameter;
_L36:
        String s;
        String s1;
        ArrayList arraylist;
        s = ((UrlQuerySanitizer) (obj3)).getValue("topic");
        s1 = ((UrlQuerySanitizer) (obj3)).getValue("video");
        obj2 = ((UrlQuerySanitizer) (obj3)).getValue("blob");
        obj3 = ((UrlQuerySanitizer) (obj3)).getValue("id");
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s2)) goto _L23; else goto _L22
_L22:
        String as[];
        int k;
        as = s2.split(";");
        k = as.length;
        int j = 0;
_L35:
        if (j >= k) goto _L23; else goto _L24
_L24:
        String s3 = as[j];
        ContactImpl contactimpl1 = new ContactImpl();
        if (!d.getSkypenameProp().equalsIgnoreCase(s3)) goto _L26; else goto _L25
_L25:
        a.info((new StringBuilder("skype uri:")).append(obj1).append(" contains our own identity, ignoring").toString());
          goto _L27
_L26:
        if (c.getContact(s3, contactimpl1)) goto _L29; else goto _L28
_L28:
        a.info((new StringBuilder("skype uri:")).append(obj1).append(" contains an invalid contact and will be ignored").toString());
          goto _L27
_L29:
        arraylist.add(contactimpl1);
          goto _L27
_L23:
        if (!"chat".equals(intent))
        {
            break MISSING_BLOCK_LABEL_793;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_721;
        }
        intent = new ConversationImpl();
        if (c.getConversationByBlob(((String) (obj2)), intent, true))
        {
            e.chat(intent);
        }
          goto _L16
        if (obj3 == null) goto _L31; else goto _L30
_L30:
        intent = new ConversationImpl();
        if (c.getConversationByIdentity(((String) (obj3)), intent))
        {
            e.chat(intent, false);
        }
          goto _L16
_L31:
        if (arraylist.size() <= 0) goto _L16; else goto _L32
_L32:
        intent = i.a(arraylist, s);
        e.chat(intent, false);
          goto _L16
        if (!"call".equals(intent) || s1 != null)
        {
            break MISSING_BLOCK_LABEL_930;
        }
label0:
        {
            if (arraylist.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_930;
            }
            intent = (Contact)arraylist.get(0);
            if (arraylist.size() != 1 || !ContactUtil.g(intent))
            {
                break label0;
            }
            obj1 = new Intent("android.intent.action.DIAL");
            ((Intent) (obj1)).setData(Uri.parse(String.format("%s:%s", new Object[] {
                "tel", intent.getPstnnumberProp()
            })));
            ((Intent) (obj1)).setFlags(0x10000000);
            b.startActivity(((Intent) (obj1)));
        }
          goto _L16
        h.a(Permission.n, true, new PermissionHandlerAdapter(arraylist, s) {

            final ArrayList a;
            final String b;
            final SkypeIntentHandler c;

            public final void onGranted()
            {
                SkypeIntentHandler.b(c).placeCall(a, b);
            }

            
            {
                c = SkypeIntentHandler.this;
                a = arraylist;
                b = s;
                super();
            }
        });
          goto _L16
label1:
        {
            if (!"profile".equals(intent) || arraylist.size() != 1)
            {
                break label1;
            }
            e.profile((Contact)arraylist.get(0));
        }
          goto _L16
        if (!"call".equals(intent) || s1 == null)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        if (arraylist.size() != 1)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        e.placeCallWithVideo(arraylist, s);
          goto _L16
label2:
        {
            if (!"recents".equals(intent))
            {
                break label2;
            }
            e.upToRecents();
        }
          goto _L16
label3:
        {
            if (!"focus".equals(intent))
            {
                break label3;
            }
            e.home();
        }
          goto _L16
label4:
        {
            if (!"contacts".equals(intent))
            {
                break label4;
            }
            e.people();
        }
          goto _L16
label5:
        {
            if (!"share".equals(intent))
            {
                break label5;
            }
            intent = a(((Uri) (obj1)));
            e.share(intent);
        }
          goto _L16
label6:
        {
            if (!"mnv".equals(intent))
            {
                break label6;
            }
            e.toMnvCheckingAccount(com.skype.android.app.mnv.MnvCases.REFERRER.EXTERNAL_URI);
        }
          goto _L16
        a.info((new StringBuilder("skype uri:")).append(obj1).append(" not handled").toString());
          goto _L16
_L21:
        a.warning("Spurious intent received and is being ignored by the app.");
          goto _L16
_L9:
        a.info((new StringBuilder("no uri present for intent: ")).append(intent).toString());
        return;
_L4:
        if (!((String) (obj)).equals("android.intent.action.CALL_PRIVILEGED") && !((String) (obj)).equals("android.intent.action.CALL") && !((String) (obj)).equals("android.intent.action.SENDTO") && !((String) (obj)).equals("android.intent.action.SEND") && !((String) (obj)).equals("android.intent.action.SEND_MULTIPLE") && !((String) (obj)).equals("android.intent.action.VIEW") && !((String) (obj)).equals("android.intent.action.DIAL"))
        {
            break MISSING_BLOCK_LABEL_1659;
        }
        obj = intent.getAction();
        if (!((String) (obj)).equals("android.intent.action.SEND") && !((String) (obj)).equals("android.intent.action.SEND_MULTIPLE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = intent.getExtras();
        if (obj == null) goto _L15; else goto _L33
_L33:
        if (((Bundle) (obj)).containsKey("android.intent.extra.STREAM") && (((Bundle) (obj)).get("android.intent.extra.STREAM").toString().contains("vcard") || intent.getType() != null && intent.getType().contains("vcard")))
        {
            obj = b(intent);
            if (obj != null)
            {
                intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
            }
        }
        obj = new Intent(b, com/skype/android/app/contacts/PickerActivity);
        Class class1 = TransferPickConversationFragment.getFragmentClassForIntent(intent);
        if (class1.equals(com/skype/android/app/transfer/TransferPhotoPickConversationFragment))
        {
            ((Intent) (obj)).putExtra("CUSTOM_TITLE", 0x7f080189);
        } else
        {
            ((Intent) (obj)).putExtra("CUSTOM_TITLE", 0x7f080183);
        }
        ((Intent) (obj)).putExtra("fragmentClass", class1);
        ((Intent) (obj)).putExtra("INTENT_ORIGIN", intent.getSerializableExtra("INTENT_ORIGIN"));
        ((Intent) (obj)).addFlags(0x10000000);
        ((Intent) (obj)).putExtra("com.skype.sendIntent", intent);
        ((Intent) (obj)).putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.bs);
        ((Intent) (obj)).putExtra("HINT_TEXT_ID", 0x7f08017f);
        ((Intent) (obj)).putExtra("CHECKBOX_MODE", true);
        ((Intent) (obj)).putExtra("objectClass", com/skype/Conversation);
        ((Intent) (obj)).putExtra("SELECT_CONVERSATION", true);
        b.startActivity(((Intent) (obj)));
        return;
        if (!((String) (obj)).equals("android.intent.action.CALL_PRIVILEGED") && !((String) (obj)).equals("android.intent.action.CALL") && !((String) (obj)).equals("android.intent.action.SENDTO") && !((String) (obj)).equals("android.intent.action.VIEW") && !((String) (obj)).equals("android.intent.action.DIAL")) goto _L15; else goto _L34
_L34:
        intent = intent.getData().getSchemeSpecificPart();
        ContactUtil contactutil = g;
        intent = contactutil.a(intent, contactutil.b().b());
        if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (intent)).m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            ContactImpl contactimpl = new ContactImpl();
            c.getContact(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (intent)).m_normalized, contactimpl);
            if (((String) (obj)).equals("android.intent.action.SENDTO"))
            {
                e.sms(contactimpl);
                return;
            }
            if (((String) (obj)).equals("android.intent.action.VIEW") || ((String) (obj)).equals("android.intent.action.DIAL"))
            {
                e.dialWithNumber(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (intent)).m_normalized);
                return;
            } else
            {
                e.placeCall(contactimpl);
                return;
            }
        }
          goto _L15
        if (((String) (obj)).equals("com.skype.playVoicemail"))
        {
            if (intent.hasExtra("com.skype.identitiy"))
            {
                obj = intent.getStringExtra("com.skype.identitiy");
                ConversationImpl conversationimpl1 = new ConversationImpl();
                if (c.getConversationByIdentity(((String) (obj)), conversationimpl1, false))
                {
                    obj = e.intentFor(conversationimpl1, com/skype/android/app/chat/ChatActivity);
                    ((Intent) (obj)).addFlags(0x4000000);
                    if (intent.hasExtra("voicemailToPlay"))
                    {
                        ((Intent) (obj)).putExtra("voicemailToPlay", intent.getIntExtra("voicemailToPlay", 0));
                    }
                    b.startActivity(((Intent) (obj)));
                    return;
                }
            }
        } else
        if (((String) (obj)).equals("com.skype.callback"))
        {
            h.a(Permission.n, true, new PermissionHandlerAdapter(intent) {

                final Intent a;
                final SkypeIntentHandler b;

                public final void onGranted()
                {
                    String s4 = a.getStringExtra("com.skype.identitiy");
                    String s5 = a.getStringExtra("android.intent.extra.PHONE_NUMBER");
                    ContactImpl contactimpl2 = new ContactImpl();
                    SkypeIntentHandler.a(b).getContact(s4, contactimpl2);
                    if (s5 == null)
                    {
                        SkypeIntentHandler.b(b).placeCall(contactimpl2);
                        return;
                    } else
                    {
                        SkypeIntentHandler.b(b).placeCall(contactimpl2, s5);
                        return;
                    }
                }

            
            {
                b = SkypeIntentHandler.this;
                a = intent;
                super();
            }
            });
            return;
        } else
        {
            a.info((new StringBuilder("can't handle intent: ")).append(intent).toString());
            return;
        }
          goto _L15
_L2:
        Intent intent1 = new Intent(b, com/skype/android/app/main/SplashActivity);
        intent1.setFlags(0x10000004);
        intent1.putExtra("com.skype.nextIntent", intent);
        b.startActivity(intent1);
        return;
_L27:
        j++;
          goto _L35
        intent = "call";
          goto _L36
    }

}
