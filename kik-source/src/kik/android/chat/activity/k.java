// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.a.a.c.g;
import com.kik.g.e;
import com.kik.g.p;
import com.kik.ui.fragment.FragmentBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kik.android.chat.fragment.KikChatFragment;
import kik.android.chat.fragment.KikConversationsFragment;
import kik.android.chat.fragment.MissedConversationsFragment;
import kik.android.util.DeviceUtils;
import kik.android.util.an;
import kik.android.util.av;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.chat.activity:
//            l, FragmentWrapperActivity, ConversationsActivity, MissedConversationsActivity, 
//            ChatActivity

public final class k
{
    public static final class a
    {

        private String a;
        private String b;
        private String c;

        static String a(a a1)
        {
            return a1.c;
        }

        static String a(a a1, String s)
        {
            a1.b = s;
            return s;
        }

        static String b(a a1)
        {
            return a1.a;
        }

        static String c(a a1)
        {
            return a1.b;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (a == null)
            {
                if (((a) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((a) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((a) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((a) (obj)).b))
            {
                return false;
            }
            if (c != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((a) (obj)).c == null) goto _L1; else goto _L3
_L3:
            return false;
            if (c.equals(((a) (obj)).c)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int k1 = 0;
            int i1;
            int j1;
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.hashCode();
            }
            if (b == null)
            {
                j1 = 0;
            } else
            {
                j1 = b.hashCode();
            }
            if (c != null)
            {
                k1 = c.hashCode();
            }
            return (j1 + (i1 + 37) * 37) * 37 + k1;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(a).append("/").append(b).toString();
        }

        public a(Class class1, String s, String s1)
        {
            a = class1.getCanonicalName();
            b = s;
            c = s1;
        }
    }

    public static final class b
    {

        private final Context a;
        private final Bundle b;
        private int c;
        private boolean d;
        private int e;
        private int f;

        private Intent a(boolean flag)
        {
            Intent intent;
            Object obj = b.getString("kik.android.util.FragmentBundle.FragmentClass");
            if (obj == null)
            {
                com.a.a.a.d().c.a((new StringBuilder("Null target for class : ")).append(b.getClass()).toString());
            }
            if (kik/android/chat/fragment/KikConversationsFragment.getCanonicalName().equals(obj))
            {
                obj = kik/android/chat/activity/ConversationsActivity;
            } else
            if (kik/android/chat/fragment/MissedConversationsFragment.getCanonicalName().equals(obj))
            {
                obj = kik/android/chat/activity/MissedConversationsActivity;
            } else
            if (kik/android/chat/fragment/KikChatFragment.getCanonicalName().equals(obj))
            {
                obj = kik/android/chat/activity/ChatActivity;
            } else
            {
                obj = kik/android/chat/activity/FragmentWrapperActivity;
            }
            intent = new Intent(a, ((Class) (obj)));
            if (c != kik.android.chat.activity.a.b) goto _L2; else goto _L1
_L1:
            if (flag)
            {
                if (k.a(((Class) (obj)).getCanonicalName(), kik.android.chat.activity.k.g()))
                {
                    intent.addFlags(0x4000000);
                } else
                {
                    intent.putExtra("ActivityLaunchDescriptor.anim.override.enter", av.a(a, 0x10100bb));
                    intent.putExtra("ActivityLaunchDescriptor.anim.override.exit", av.a(a, 0x10100ba));
                    k.h();
                    k.a(UUID.randomUUID().toString());
                }
            } else
            {
                if (DeviceUtils.c())
                {
                    throw new RuntimeException("You are attempting to use UP on an ActivityLaunchDescriptor that is not being immediately started by KActivityLauncher.This behavior is undefined and unsupported because the returned intent could be used for a later launch.If you want UP, please use startForResult. Otherwise you may be looking for treatAsRoot() which is the behavior this will fall back to on non-debug builds");
                }
                a(intent);
            }
            if (d)
            {
                intent.putExtra("com.kik.util.KActivityLauncher.no.refresh", true);
            }
_L4:
            if (f != -1)
            {
                intent.putExtra("ActivityLaunchDescriptor.anim.override.exit", f);
            }
            if (e != -1)
            {
                intent.putExtra("ActivityLaunchDescriptor.anim.override.enter", e);
            }
            b.putString("com.kik.util.KActivityLauncher.synthTaskId", kik.android.chat.activity.k.g());
            intent.putExtras(b);
            return intent;
_L2:
            if (c == kik.android.chat.activity.a.c)
            {
                a(intent);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private static void a(Intent intent)
        {
            intent.putExtra("com.kik.util.KActivityLauncher.synthTaskId.treatAsRoot", true);
        }

        public final b a()
        {
            c = kik.android.chat.activity.a.b;
            return this;
        }

        public final b b()
        {
            e = 0x7f040007;
            f = 0x7f040012;
            return this;
        }

        public final b c()
        {
            c = kik.android.chat.activity.a.c;
            return this;
        }

        public final b d()
        {
            d = true;
            return this;
        }

        public final Intent e()
        {
            return a(false);
        }

        public final p f()
        {
            Intent intent = a(true);
            p p1 = k.a(intent, a);
            if (a != null)
            {
                if (!(a instanceof Activity))
                {
                    if (DeviceUtils.c())
                    {
                        k.i();
                    }
                } else
                {
                    int i1 = intent.getIntExtra("ActivityLaunchDescriptor.anim.override.enter", -1);
                    int j1 = intent.getIntExtra("ActivityLaunchDescriptor.anim.override.exit", -1);
                    if (i1 != -1 && j1 != -1)
                    {
                        ((Activity)a).overridePendingTransition(i1, j1);
                        return p1;
                    }
                }
            }
            return p1;
        }

        protected b(Bundle bundle, Context context)
        {
            e = -1;
            f = -1;
            a = context;
            b = bundle;
        }
    }

    public static final class b.a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private static List a = new ArrayList();
    private static List b = new ArrayList();
    private static final org.c.b c = org.c.c.a("KActivityLauncher");
    private static HashMap d = new HashMap();
    private static String e;
    private static com.kik.g.k f = new com.kik.g.k(new Object());
    private static com.kik.g.k g = new com.kik.g.k(new Object());

    public static e a()
    {
        return f.a();
    }

    public static p a(Intent intent, Context context)
    {
        if (context == null || intent == null)
        {
            intent = new p();
            intent.a(new Throwable("Null context or intent provided"));
            return intent;
        } else
        {
            p p1 = new p();
            String s = UUID.randomUUID().toString();
            d.put(s, p1);
            intent.putExtra("com.kik.util.KActivityLauncher.promiseId", s);
            intent.putExtra("com.kik.util.KActivityLauncher.synthTaskId", e);
            p1.a(new l(s));
            context.startActivity(intent);
            return p1;
        }
    }

    public static p a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return (p)d.get(b(bundle));
        }
    }

    public static b a(an an1, Context context)
    {
        if (an1 == null)
        {
            return null;
        } else
        {
            return new b(an1.i(), context);
        }
    }

    static void a(String s)
    {
        e = s;
    }

    public static void a(FragmentWrapperActivity fragmentwrapperactivity)
    {
        fragmentwrapperactivity = new a(fragmentwrapperactivity.getClass(), fragmentwrapperactivity.b(), fragmentwrapperactivity.c());
        a.remove(fragmentwrapperactivity);
        b.remove(fragmentwrapperactivity);
    }

    public static void a(FragmentWrapperActivity fragmentwrapperactivity, Fragment fragment)
    {
        int i1 = 0;
        if (fragmentwrapperactivity != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = new a(fragmentwrapperactivity.getClass(), fragmentwrapperactivity.b(), fragmentwrapperactivity.c());
        int j1;
        if (e == null)
        {
            if (fragmentwrapperactivity.b() != null)
            {
                e = fragmentwrapperactivity.b();
            } else
            {
                String s = UUID.randomUUID().toString();
                a(fragmentwrapperactivity, s);
                e = s;
                a.a(a1, s);
            }
        }
        if (a.contains(a1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (fragment != null && (fragment instanceof FragmentBase) && ((FragmentBase)fragment).B())
        {
            b.add(a1);
        }
        a.add(a1);
        break MISSING_BLOCK_LABEL_101;
        if (fragmentwrapperactivity != null && fragmentwrapperactivity.getIntent() != null && fragmentwrapperactivity.getIntent().getBooleanExtra("com.kik.util.KActivityLauncher.synthTaskId.treatAsRoot", false))
        {
            fragment = UUID.randomUUID().toString();
            a(fragmentwrapperactivity, ((String) (fragment)));
            j();
            e = fragment;
        }
        if (b.size() <= 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = b.size();
        fragmentwrapperactivity = new ArrayList();
        for (; i1 < j1 - 4; i1++)
        {
            fragmentwrapperactivity.add(b.get(i1));
        }

        break MISSING_BLOCK_LABEL_235;
        fragmentwrapperactivity = fragmentwrapperactivity.iterator();
        while (fragmentwrapperactivity.hasNext()) 
        {
            fragment = (a)fragmentwrapperactivity.next();
            if (fragment != null)
            {
                g.a(a.a(fragment));
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(FragmentWrapperActivity fragmentwrapperactivity, String s)
    {
        if (fragmentwrapperactivity == null)
        {
            return;
        }
        a a1 = new a(fragmentwrapperactivity.getClass(), fragmentwrapperactivity.b(), fragmentwrapperactivity.c());
        int i1 = a.indexOf(a1);
        if (i1 >= 0 && i1 < a.size())
        {
            a.a((a)a.get(i1), s);
        }
        i1 = b.indexOf(a1);
        if (i1 >= 0 && i1 < b.size())
        {
            a.a((a)b.get(i1), s);
        }
        fragmentwrapperactivity.a(s);
    }

    static boolean a(String s, String s1)
    {
        for (Iterator iterator = (new ArrayList(a)).iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1 != null && s != null && s.equals(kik.android.chat.activity.a.b(a1)) && s1 != null && s1.equals(kik.android.chat.activity.a.c(a1)))
            {
                return true;
            }
        }

        return false;
    }

    public static e b()
    {
        return g.a();
    }

    public static String b(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return bundle.getString("com.kik.util.KActivityLauncher.promiseId");
        }
    }

    public static String c()
    {
        return e;
    }

    public static String c(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return bundle.getString("com.kik.util.KActivityLauncher.synthTaskId");
        }
    }

    public static List d()
    {
        return new ArrayList(b);
    }

    public static int e()
    {
        if (b == null)
        {
            return 1;
        } else
        {
            return Math.min(4, b.size() + 1);
        }
    }

    static HashMap f()
    {
        return d;
    }

    static String g()
    {
        return e;
    }

    static void h()
    {
        j();
    }

    static org.c.b i()
    {
        return c;
    }

    private static void j()
    {
        f.a(e);
    }

}
