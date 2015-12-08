// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.libraries.translate.c;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.d;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a;
import com.google.android.libraries.translate.offline.am;
import com.google.android.libraries.translate.offline.e;
import com.google.android.libraries.translate.offline.j;
import com.google.android.libraries.translate.offline.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            m, j, k, l

public class i
    implements android.view.View.OnClickListener
{

    private final o a;
    private final Context b;
    private OfflinePackage c[];
    private final Runnable d;
    private final Event e;
    private final boolean f;
    private final boolean g;

    public i(OfflinePackage offlinepackage, o o1, Context context, Event event, Runnable runnable, boolean flag)
    {
        this(new OfflinePackage[] {
            offlinepackage
        }, o1, context, event, runnable, false, flag);
    }

    public i(OfflinePackage aofflinepackage[], o o1, Context context, Event event, Runnable runnable, boolean flag, boolean flag1)
    {
        c = aofflinepackage;
        a = o1;
        b = context;
        e = event;
        d = runnable;
        f = flag;
        g = flag1;
    }

    static Runnable a(i i1)
    {
        return i1.d;
    }

    public static String a(Context context, OfflinePackage aofflinepackage[])
    {
        boolean flag2 = true;
        int i1;
        boolean flag;
        if (aofflinepackage[aofflinepackage.length - 1].b == PackageType.TRANSLATE)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        OfflinePackage offlinepackage;
        StringBuilder stringbuilder;
        HashSet hashset;
        long l1;
        if (i1 != 0 && 1 < aofflinepackage.length)
        {
            i1 = 0;
            flag = true;
            while (i1 < aofflinepackage.length - 1) 
            {
                boolean flag1;
                if (aofflinepackage[i1].b == PackageType.WORD_LENS)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag &= flag1;
                i1++;
            }
            int j1;
            if (flag)
            {
                offlinepackage = aofflinepackage[aofflinepackage.length - 1];
            } else
            {
                offlinepackage = null;
            }
        } else
        if (i1 == 0 && 2 == aofflinepackage.length)
        {
            offlinepackage = aofflinepackage[0];
        } else
        {
            offlinepackage = null;
        }
        stringbuilder = new StringBuilder();
        hashset = new HashSet();
        l1 = 0L;
        j1 = aofflinepackage.length;
        i1 = 0;
        flag = false;
        while (i1 < j1) 
        {
            OfflinePackage offlinepackage1 = aofflinepackage[i1];
            if (offlinepackage != null)
            {
                l1 += com.google.android.libraries.translate.offline.a.a(hashset, new OfflinePackage[] {
                    offlinepackage1
                });
            } else
            {
                if (flag)
                {
                    stringbuilder.append('\n');
                }
                stringbuilder.append(offlinepackage1.a(context, false)).append(": ").append(Formatter.formatFileSize(context, com.google.android.libraries.translate.offline.a.a(hashset, new OfflinePackage[] {
                    offlinepackage1
                })));
                flag = true;
            }
            i1++;
        }
        if (offlinepackage != null)
        {
            if (offlinepackage.b != PackageType.WORD_LENS)
            {
                flag2 = false;
            }
            stringbuilder.append(offlinepackage.a(context, flag2)).append(": ").append(Formatter.formatFileSize(context, l1));
        }
        return stringbuilder.toString();
    }

    static void a(SharedPreferences sharedpreferences, int i1)
    {
        sharedpreferences.edit().putInt("key_offline_download_network", i1).commit();
    }

    public static boolean a(o o1, OfflinePackage aofflinepackage[])
    {
        long l2;
        long l5;
        l2 = 0L;
        l5 = o1.b.b();
        if (l5 < 0L)
        {
            throw new OfflineTranslationException(-5004, "");
        }
        HashSet hashset = new HashSet();
        int k1 = aofflinepackage.length;
        int i1 = 0;
        long l3;
        long l4;
        for (l3 = 0L; i1 < k1; l3 = l4)
        {
            Iterator iterator = aofflinepackage[i1].d.iterator();
            l4 = l2;
            l2 = l3;
            for (l3 = l4; iterator.hasNext(); l3 = Math.max(l3, l4))
            {
                l4 = com.google.android.libraries.translate.offline.a.a(hashset, (j)iterator.next());
                l2 += l4;
            }

            i1++;
            l4 = l2;
            l2 = l3;
        }

        o1 = o1.c().iterator();
        l2 += l3;
_L5:
        if (!o1.hasNext()) goto _L2; else goto _L1
_L1:
        OfflinePackage offlinepackage;
        int j1;
        int l1;
        offlinepackage = (OfflinePackage)o1.next();
        l1 = aofflinepackage.length;
        j1 = 0;
_L6:
        OfflinePackage offlinepackage1;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        offlinepackage1 = aofflinepackage[j1];
        if (!offlinepackage1.equals(offlinepackage)) goto _L4; else goto _L3
_L3:
        offlinepackage1.j();
        j1 = 1;
_L7:
        if (j1 == 0 && offlinepackage.f())
        {
            l2 = (offlinepackage.b() - offlinepackage.c()) + l2;
        }
          goto _L5
_L4:
        j1++;
          goto _L6
_L2:
        return l5 > l2;
        j1 = 0;
          goto _L7
    }

    public static OfflinePackage[] a(OfflinePackage offlinepackage, o o1)
    {
        Object obj = offlinepackage.a;
        String as[];
        switch (com.google.android.libraries.translate.offline.a.m.a[offlinepackage.b.ordinal()])
        {
        default:
            return (new OfflinePackage[] {
                offlinepackage
            });

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            Object obj1 = new ArrayList();
            if ("zh".equals(obj))
            {
                ((List) (obj1)).add(new String[] {
                    "en", "zh-Hans"
                });
                ((List) (obj1)).add(new String[] {
                    "en", "zh-Hant"
                });
            } else
            if ("sr".equals(obj))
            {
                ((List) (obj1)).add(new String[] {
                    "en", "sr-Cyrl"
                });
                ((List) (obj1)).add(new String[] {
                    "sr-Cyrl", "en"
                });
            } else
            {
                ((List) (obj1)).add(new String[] {
                    "en", obj
                });
                ((List) (obj1)).add(new String[] {
                    obj, "en"
                });
            }
            obj = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (String[])((Iterator) (obj)).next();
                obj1 = o1.b(obj1[0], obj1[1]);
                if (obj1 != null && ((OfflinePackage) (obj1)).c == com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE)
                {
                    arraylist.add(obj1);
                }
            } while (true);
            if (arraylist.size() > 0)
            {
                arraylist.add(offlinepackage);
                return (OfflinePackage[])arraylist.toArray(new OfflinePackage[arraylist.size()]);
            } else
            {
                return (new OfflinePackage[] {
                    offlinepackage
                });
            }

        case 2: // '\002'
            as = am.c(((String) (obj)));
            o1 = o1.b(as[1], as[0]);
            break;
        }
        if (o1 != null && ((OfflinePackage) (o1)).c != com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
        {
            if ("en".equals(as[0]))
            {
                return (new OfflinePackage[] {
                    offlinepackage, o1
                });
            } else
            {
                return (new OfflinePackage[] {
                    o1, offlinepackage
                });
            }
        } else
        {
            return (new OfflinePackage[] {
                offlinepackage
            });
        }
    }

    static Context b(i i1)
    {
        return i1.b;
    }

    protected void a(boolean flag)
    {
        a(flag, false, c);
        if (e != null)
        {
            Singleton.b().a(e, null, null);
        }
    }

    protected final void a(boolean flag, boolean flag1, OfflinePackage aofflinepackage[])
    {
        byte byte2 = 0;
        try
        {
            if (!a(a, aofflinepackage))
            {
                m.a(f.msg_external_storage_insufficient_available_space, 1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (OfflinePackage aofflinepackage[])
        {
            m.a(aofflinepackage.getErrorMessage(b), 1);
            return;
        }
        boolean flag2;
        byte byte0;
        byte byte1;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (f)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        if (g)
        {
            byte2 = 8;
        }
        (new com.google.android.libraries.translate.offline.a.j(this, b, a, byte1 | (flag2 | false | byte0) | byte2 | 0x10)).a(aofflinepackage);
    }

    public void onClick(View view)
    {
        boolean flag = true;
        view = PreferenceManager.getDefaultSharedPreferences(b);
        if (1 == c.length)
        {
            c = a(c[0], a);
        }
        int i1 = view.getInt("key_offline_download_network", 2);
        switch (i1)
        {
        default:
            View view1 = LayoutInflater.from(b).inflate(d.wifi_download_dialog, null);
            CheckBox checkbox = (CheckBox)view1.findViewById(c.use_wifi);
            CheckBox checkbox1 = (CheckBox)view1.findViewById(c.ask_again);
            String s;
            if (i1 != 2)
            {
                flag = false;
            }
            checkbox1.setChecked(flag);
            if (f)
            {
                view1.findViewById(c.msg_offline_usage).setVisibility(8);
            }
            s = a(b, c);
            ((TextView)view1.findViewById(c.msg_package_detail)).setText(s);
            view = p.a(b, "").setTitle(f.title_non_wifi_download).setView(view1).setNegativeButton(f.label_cancel, null).setPositiveButton(f.label_ok, new k(this, checkbox, checkbox1, i1, view));
            if (!com.google.android.libraries.translate.e.o.c(b))
            {
                Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                if (b.getPackageManager().resolveActivity(intent, 0) != null)
                {
                    view.setNeutralButton(f.msg_setup_wifi, new l(this, intent));
                }
            }
            view.show();
            return;

        case 0: // '\0'
            a(false);
            return;

        case 1: // '\001'
            a(true);
            return;
        }
    }
}
