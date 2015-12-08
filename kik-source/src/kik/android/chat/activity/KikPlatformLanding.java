// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.widget.Toast;
import com.kik.l.ab;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kik.a.d.d;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.chat.a;
import kik.android.f.a.f;
import kik.android.util.ae;
import kik.android.util.cq;
import kik.android.util.e;

// Referenced classes of package kik.android.chat.activity:
//            k, IntroActivity, ak

public class KikPlatformLanding extends Activity
{

    protected com.kik.android.a a;
    protected v b;
    protected ab c;
    private String d;
    private f e;

    public KikPlatformLanding()
    {
    }

    static f a(KikPlatformLanding kikplatformlanding)
    {
        return kikplatformlanding.e;
    }

    private void a(String s)
    {
        if (d != null)
        {
            e.d(d);
        }
        if (s != null)
        {
            kik.android.chat.fragment.KikChatFragment.a a1 = new kik.android.chat.fragment.KikChatFragment.a();
            a1.a(s);
            kik.android.chat.activity.k.a(a1, this).f();
        } else
        {
            s = new kik.android.chat.fragment.KikConversationsFragment.a();
            s.a();
            kik.android.chat.activity.k.a(s, this).f();
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent();
        bundle = ((Intent) (obj)).getData();
        boolean flag1;
        if (bundle != null)
        {
            if (bundle != null && "kikapi".equals(bundle.getScheme()) && "send".equals(bundle.getHost()) || "send.kik.com".equalsIgnoreCase(bundle.getHost()))
            {
                String s = bundle.getEncodedQuery();
                bundle.getEncodedSchemeSpecificPart();
                bundle = new UrlQuerySanitizer();
                bundle.setAllowUnregisteredParamaters(true);
                bundle.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getUrlAndSpaceLegal());
                bundle.parseQuery(s);
                Object obj3 = bundle.getParameterSet();
                if (!((Set) (obj3)).contains("app-id") || !((Set) (obj3)).contains("app-name") || !((Set) (obj3)).contains("uri"))
                {
                    bundle = null;
                } else
                {
                    String s1 = bundle.getValue("app-id");
                    Object obj1 = bundle.getValue("app-name");
                    String s3 = bundle.getValue("uri");
                    Object obj2 = bundle.getValue("text");
                    String s4 = bundle.getValue("title");
                    Hashtable hashtable = new Hashtable();
                    if (s4 != null)
                    {
                        hashtable.put("title", s4);
                    }
                    if (obj2 != null)
                    {
                        hashtable.put("text", obj2);
                    }
                    if (obj1 != null)
                    {
                        hashtable.put("app-name", obj1);
                    }
                    hashtable.put("allow-forward", "true");
                    obj1 = new Hashtable();
                    obj2 = new ArrayList();
                    ((ArrayList) (obj2)).add(new com.kik.f.a.a.a(s3, "app-name"));
                    obj3 = ((Set) (obj3)).iterator();
                    do
                    {
                        if (!((Iterator) (obj3)).hasNext())
                        {
                            break;
                        }
                        Object obj4 = (String)((Iterator) (obj3)).next();
                        if (((String) (obj4)).startsWith("extra-"))
                        {
                            String s5 = bundle.getValue(((String) (obj4)));
                            if (s5 != null && !"".equals(s5))
                            {
                                ((Hashtable) (obj1)).put(((String) (obj4)).substring("extra-".length()), s5);
                            } else
                            {
                                ((Hashtable) (obj1)).put(((String) (obj4)).substring("extra-".length()), "true");
                            }
                        } else
                        if ("android-uri".equals(obj4))
                        {
                            obj4 = new com.kik.f.a.a.a(bundle.getValue(((String) (obj4))), "app-name");
                            ((com.kik.f.a.a.a) (obj4)).a("android");
                            ((ArrayList) (obj2)).add(obj4);
                        } else
                        if ("iphone-uri".equals(obj4))
                        {
                            obj4 = new com.kik.f.a.a.a(bundle.getValue(((String) (obj4))), "app-name");
                            ((com.kik.f.a.a.a) (obj4)).a("iphone");
                            ((ArrayList) (obj2)).add(obj4);
                        }
                    } while (true);
                    bundle = new kik.a.d.a.a(UUID.randomUUID().toString(), s1, "2", ((ArrayList) (obj2)), hashtable, new Hashtable(), ((Hashtable) (obj1)));
                    bundle.a("icon", new d(kik.android.util.e.a(f.a(KikApplication.c(0x7f0202f5)))));
                    bundle.a("app-pkg", "WebApp");
                }
            } else
            {
                bundle = null;
            }
        } else
        {
            bundle = null;
        }
        ((a)getApplication()).a().a(this);
        e = f.a();
        if (!z.a(b))
        {
            Toast.makeText(this, 0x7f09014f, 1).show();
            startActivity(new Intent(this, kik/android/chat/activity/IntroActivity));
            finish();
            return;
        }
        if ("kik.platform.send".equals(((Intent) (obj)).getAction()))
        {
            bundle = ((Intent) (obj)).getExtras();
            if (bundle != null)
            {
                d = bundle.getString("com.kik.platform.content.EXTRA_CONVO_ID");
            }
            String s2 = e.b(d);
            kik.a.d.a.a a1 = e.a(this, getIntent());
            obj = ae.a(a1);
            bundle = ((Bundle) (obj));
            if (obj != null)
            {
                bundle = ((String) (obj)).trim();
            }
            boolean flag;
            if (!getPackageName().equals(getCallingPackage()) && "camera".equalsIgnoreCase(bundle))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (!flag)
            {
                finish();
                return;
            }
            bundle = a1.k();
            e.a(a1, true, null);
            obj = a1.g("file-size");
            if (obj != null)
            {
                long l = Long.parseLong(((String) (obj)));
                if (bundle == null || !bundle.exists() || bundle.length() != l || bundle.length() > 0x989680L)
                {
                    bundle = new android.app.AlertDialog.Builder(this);
                    bundle.setTitle(0x7f0902e7);
                    bundle.setMessage(0x7f0902bc);
                    bundle.setNeutralButton(0x7f090193, new ak(this)).setCancelable(false).show();
                    return;
                } else
                {
                    a(s2);
                    return;
                }
            } else
            {
                a(s2);
                return;
            }
        }
        if (obj != null && "android.intent.action.SEND".equals(((Intent) (obj)).getAction()) && ((Intent) (obj)).getType() != null && ((Intent) (obj)).getType().startsWith("image/"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            bundle = kik.android.util.e.a(((Intent) (obj)));
            if (bundle != null)
            {
                bundle = kik.android.util.e.a(bundle, this);
                if (bundle == null)
                {
                    Toast.makeText(this, 0x7f090134, 0).show();
                } else
                {
                    e.a(this, bundle, "com.kik.ext.gallery", null, false, b);
                }
            }
            finish();
            return;
        }
        if (obj != null && "android.intent.action.SEND".equals(((Intent) (obj)).getAction()) && ((Intent) (obj)).getType() != null && ((Intent) (obj)).getType().startsWith("video/"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            bundle = kik.android.util.e.a(((Intent) (obj)));
            if (bundle != null)
            {
                e.a(true);
                obj = new kik.android.chat.fragment.KikConversationsFragment.a();
                ((kik.android.chat.fragment.KikConversationsFragment.a) (obj)).b(bundle.toString());
                kik.android.chat.activity.k.a(((kik.android.util.an) (obj)), this).f();
            } else
            {
                Toast.makeText(this, 0x7f0900a0, 0).show();
            }
            finish();
            return;
        }
        if (bundle != null)
        {
            e.a(bundle, true, null);
            a(((String) (null)));
            return;
        }
        if ("android.intent.action.SEND".equals(((Intent) (obj)).getAction()) && ((Intent) (obj)).getExtras() != null && ((Intent) (obj)).getExtras().getString("android.intent.extra.TEXT") != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = ((Intent) (obj)).getExtras();
            bundle = ((Bundle) (obj)).getString("android.intent.extra.SUBJECT");
            obj = ((Bundle) (obj)).getString("android.intent.extra.TEXT");
            if (!cq.c(bundle) && !((String) (obj)).contains(bundle))
            {
                e.e((new StringBuilder()).append(bundle).append(" - ").append(((String) (obj))).toString());
            } else
            {
                e.e(((String) (obj)));
            }
            a(((String) (null)));
            return;
        } else
        {
            Toast.makeText(this, 0x7f0900ae, 1).show();
            finish();
            return;
        }
    }
}
