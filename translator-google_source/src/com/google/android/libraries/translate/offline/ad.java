// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.translate.b.b;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.l;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.logging.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ac, LocationProfileProf, x, j, 
//            ProfileManagerV2Profile, OfflinePackage, PackageType, e, 
//            ae, ProfileManagerV2PkgProfile, OfflineTranslationException, b, 
//            o

public abstract class ad
    implements ac
{

    public final int a;
    public final int b;
    public final Context c;
    public SharedPreferences d;
    ProfileManagerV2Profile e;
    final List f = new ArrayList();
    public final List g = new ArrayList();
    boolean h;
    public final LocationProfileProf i;
    public com.google.android.libraries.translate.offline.e j;
    private final List k = new ArrayList();
    private final Map l = new HashMap();
    private OfflinePackage m;

    protected ad(Context context, LocationProfileProf locationprofileprof, com.google.android.libraries.translate.offline.e e1)
    {
        h = false;
        c = context;
        a = locationprofileprof.b().a;
        d = n();
        i = locationprofileprof;
        b = locationprofileprof.b().b;
        j = e1;
    }

    private String a(int i1, int j1)
    {
        StringBuilder stringbuilder = new StringBuilder("ol_");
        stringbuilder.append(m());
        stringbuilder.append(i1);
        stringbuilder.append("r");
        stringbuilder.append(j1);
        stringbuilder.append("_op_");
        return stringbuilder.toString();
    }

    private String a(j j1, int i1, int k1)
    {
        StringBuilder stringbuilder = new StringBuilder("ol_");
        stringbuilder.append(l());
        stringbuilder.append(i1);
        stringbuilder.append("r");
        stringbuilder.append(k1);
        stringbuilder.append("_of_");
        j1 = j1.b;
        stringbuilder.append(j1.substring(j1.lastIndexOf("/") + 1, j1.length()));
        return stringbuilder.toString();
    }

    private String a(String s, int i1)
    {
        Object obj = new StringBuilder(i.c());
        StringBuilder stringbuilder = new StringBuilder("/r");
        stringbuilder.append(i1);
        if (!((StringBuilder) (obj)).toString().endsWith(stringbuilder.toString()))
        {
            ((StringBuilder) (obj)).append(stringbuilder);
        }
        ((StringBuilder) (obj)).append("/");
        obj = s.substring(((StringBuilder) (obj)).length()).replace(".zip", "");
        s = ((String) (obj));
        if (com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(((String) (obj))))
        {
            s = "en";
        }
        return s;
    }

    private String b(String s, int i1)
    {
        StringBuilder stringbuilder = new StringBuilder(i.c());
        StringBuilder stringbuilder1 = new StringBuilder("/r");
        stringbuilder1.append(i1);
        if (!stringbuilder.toString().endsWith(stringbuilder1.toString()))
        {
            stringbuilder.append(stringbuilder1);
        }
        stringbuilder.append("/");
        stringbuilder.append(s);
        stringbuilder.append(".zip");
        return stringbuilder.toString();
    }

    private SharedPreferences c(String s)
    {
        return c.getSharedPreferences(s, 0);
    }

    private void f(OfflinePackage offlinepackage)
    {
        offlinepackage.d.clear();
        if (offlinepackage.f)
        {
            return;
        }
        Object obj = offlinepackage.b;
        if (PackageType.TRANSLATE == obj)
        {
            obj = new j(this, offlinepackage.h, b("c", offlinepackage.h), a(j, "c", offlinepackage.g, offlinepackage.h), offlinepackage.b);
            ((j) (obj)).d();
            offlinepackage.a(((j) (obj)));
        }
        obj = new j(this, offlinepackage.h, b(offlinepackage.a, offlinepackage.h), a(j, offlinepackage.a, offlinepackage.g, offlinepackage.h), offlinepackage.b);
        ((j) (obj)).d();
        offlinepackage.a(((j) (obj)));
        offlinepackage.e();
    }

    private String g(OfflinePackage offlinepackage)
    {
        Object obj = offlinepackage.a;
        int i1 = offlinepackage.g;
        int j1 = offlinepackage.h;
        offlinepackage = ((OfflinePackage) (obj));
        if (com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(((String) (obj))))
        {
            offlinepackage = "en";
        }
        obj = new StringBuilder(a(i1, j1));
        ((StringBuilder) (obj)).append(offlinepackage);
        return ((StringBuilder) (obj)).toString();
    }

    private SharedPreferences n()
    {
        StringBuilder stringbuilder = new StringBuilder("ol_");
        stringbuilder.append(k());
        stringbuilder.append(a);
        return c(stringbuilder.toString());
    }

    private List o()
    {
        ArrayList arraylist;
        Map map;
        arraylist = new ArrayList();
        map = d.getAll();
        if (map == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = map.keySet().iterator();
_L4:
        if (iterator.hasNext())
        {
            Object obj3 = (String)iterator.next();
            Object obj = map.get(obj3);
            if (obj != null && TextUtils.equals("op_prefs", obj.toString()))
            {
                String s = ((String) (obj3)).substring(a(a, b).length());
                Object obj1 = s;
                if (com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(s))
                {
                    obj1 = "en";
                }
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    obj1 = null;
                } else
                {
                    obj3 = c(((String) (obj3)));
                    int i1 = ((SharedPreferences) (obj3)).getInt("key_major_version", a);
                    int j1 = ((SharedPreferences) (obj3)).getInt("key_revision", b);
                    PackageType packagetype = PackageType.valueOf(((SharedPreferences) (obj3)).getString("key_package_type", PackageType.TRANSLATE.name()));
                    Object obj2;
                    if (com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(((String) (obj1))))
                    {
                        obj2 = OfflinePackage.Status.DOWNLOADED_POST_PROCESSED;
                        obj1 = "en";
                    } else
                    {
                        obj2 = ((SharedPreferences) (obj3)).getString("key_status", null);
                        if (obj2 != null)
                        {
                            obj2 = OfflinePackage.Status.valueOf(((String) (obj2)));
                        } else
                        {
                            obj2 = OfflinePackage.Status.AVAILABLE;
                        }
                    }
                    obj1 = new OfflinePackage(this, ((String) (obj1)), i1, j1, ((OfflinePackage.Status) (obj2)), com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(((String) (obj1))), packagetype);
                    obj1.e = ((SharedPreferences) (obj3)).getString("key_error_msg", "");
                }
                if (obj1 != null)
                {
                    arraylist.add(obj1);
                }
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return arraylist;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final OfflinePackage a(String s)
    {
        s = com.google.android.libraries.translate.languages.c.b(s);
        return (OfflinePackage)l.get(s);
    }

    public final x a()
    {
        return new x(a, b, 2, i.b);
    }

    public final String a(com.google.android.libraries.translate.offline.e e1, int i1, int j1)
    {
        StringBuilder stringbuilder = new StringBuilder(e1.a());
        stringbuilder.append("/");
        stringbuilder.append(i());
        stringbuilder.append("/v");
        stringbuilder.append(i1);
        stringbuilder.append("r");
        stringbuilder.append(j1);
        e1.b(stringbuilder.toString());
        return stringbuilder.toString();
    }

    protected final String a(com.google.android.libraries.translate.offline.e e1, String s, int i1, int j1)
    {
        e1 = new StringBuilder(a(e1, i1, j1));
        e1.append("/tmp/");
        e1.append("v");
        e1.append(i1);
        e1.append("r");
        e1.append(j1);
        e1.append("/zip/");
        e1.append(s);
        e1.append(".zip");
        return e1.toString();
    }

    public final String a(j j1, OfflinePackage offlinepackage)
    {
        if (c(j1))
        {
            return c.getString(f.title_offline_download_notification_core_package);
        } else
        {
            return c.getString(f.title_offline_download_notification_lang_package, new Object[] {
                offlinepackage.a(c, false)
            });
        }
    }

    public final void a(OfflinePackage offlinepackage)
    {
        offlinepackage.e();
        if (offlinepackage.c.equals(OfflinePackage.Status.DOWNLOADED_POST_PROCESSED) && !a(j, offlinepackage))
        {
            Singleton.b().a(-508, offlinepackage.a);
            offlinepackage.e = c.getString(f.err_download_offline_language_failed);
        }
        offlinepackage.a(false);
        e();
    }

    public final void a(OfflinePackage offlinepackage, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        String s = g(offlinepackage);
        n().edit().putString(s, "op_prefs").commit();
        c(s).edit().putInt("key_major_version", offlinepackage.g).putInt("key_revision", offlinepackage.h).putInt("key_pm_version", offlinepackage.i).putString("key_status", offlinepackage.c.toString()).putString("key_error_msg", offlinepackage.g()).putString("key_package_type", offlinepackage.b.name()).commit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        for (offlinepackage = offlinepackage.d.iterator(); offlinepackage.hasNext(); d((j)offlinepackage.next())) { }
        break MISSING_BLOCK_LABEL_169;
        offlinepackage;
        throw offlinepackage;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(o o1, l l1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (i.b().b > b || !h) goto _L2; else goto _L1
_L1:
        l1.a(Boolean.valueOf(true));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        (new ae(this, i.a, flag, i.b, l1, o1)).a(new Void[0]);
        if (true) goto _L4; else goto _L3
_L3:
        o1;
        throw o1;
    }

    final boolean a(ProfileManagerV2PkgProfile profilemanagerv2pkgprofile)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = f.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag;
        ProfileManagerV2PkgProfile profilemanagerv2pkgprofile1 = (ProfileManagerV2PkgProfile)iterator.next();
        flag = TextUtils.equals(profilemanagerv2pkgprofile.a(), profilemanagerv2pkgprofile1.a());
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        profilemanagerv2pkgprofile;
        throw profilemanagerv2pkgprofile;
    }

    protected abstract boolean a(com.google.android.libraries.translate.offline.e e1, OfflinePackage offlinepackage);

    public final boolean a(j j1)
    {
        Object obj;
        j1.d();
        if (j1.e == OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
        {
            return true;
        }
        obj = a(j1.b, j1.i);
        a_(((String) (obj)));
        Object obj1;
        int ai[];
        long l1;
        if (com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(((String) (obj))))
        {
            obj = m;
        } else
        {
            obj = (OfflinePackage)l.get(obj);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        obj1 = com.google.android.libraries.translate.offline.b.a(c);
        l1 = j1.j;
        ai = ((com.google.android.libraries.translate.offline.b) (obj1)).c(((com.google.android.libraries.translate.offline.b) (obj1)).b.a(Long.valueOf(l1)));
        if (ai[0] != 16) goto _L2; else goto _L1
_L1:
        ai[1];
        JVM INSTR tableswitch 1006 1007: default 116
    //                   1006 234
    //                   1007 248;
           goto _L3 _L4 _L5
_L3:
        obj = String.valueOf(c.getString(f.err_download_offline_language_failed));
        ai = String.valueOf(c.getString(f.err_msg_code, new Object[] {
            Integer.valueOf(ai[1])
        }));
        obj = (new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(ai).length())).append(((String) (obj))).append("\n\n").append(ai).toString();
_L6:
        j1.e = OfflinePackage.Status.ERROR;
        j1.d = ((String) (obj));
        j1.c();
        return false;
_L4:
        obj = c.getString(f.msg_external_storage_insufficient_available_space);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = c.getString(f.msg_external_storage_inaccessible);
        if (true) goto _L6; else goto _L2
_L2:
        com.google.android.libraries.translate.offline.e e1 = j;
        boolean flag;
        if (TextUtils.isEmpty(j1.c))
        {
            flag = false;
        } else
        if (!e1.a(j1.c))
        {
            flag = false;
        } else
        if (!e1.e(j1.c))
        {
            flag = false;
        } else
        {
            long l2 = e1.f(j1.c);
            if (j1.k > 0L && l2 <= 0L)
            {
                long l3 = j1.k;
                flag = false;
            } else
            {
                obj = j1.a.b(j1, ((OfflinePackage) (obj)));
                if (!TextUtils.isEmpty(((CharSequence) (obj))) && !e1.a(j1.c, ((String) (obj))))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
        }
        if (!flag)
        {
            Singleton.b().a(-509, j1.c);
            j1.e = OfflinePackage.Status.ERROR;
            j1.d = c.getString(f.err_download_offline_language_failed);
            j1.c();
            return false;
        }
label0:
        {
            try
            {
                if (!j.b(j1, a(j, j1.h, j1.i)))
                {
                    break label0;
                }
                j1.e = OfflinePackage.Status.DOWNLOADED_POST_PROCESSED;
                j1.c();
            }
            catch (OfflineTranslationException offlinetranslationexception)
            {
                Singleton.b().a(offlinetranslationexception.getErrorCode(), j1.c);
                j1.e = OfflinePackage.Status.ERROR;
                j1.d = offlinetranslationexception.getErrorMessage(c);
                j1.c();
                return false;
            }
            return true;
        }
        return false;
    }

    protected void a_(String s)
    {
    }

    public final int b()
    {
        return a;
    }

    public final long b(j j1)
    {
label0:
        {
            if (e == null)
            {
                return -1L;
            }
            j1 = a(j1.b, j1.i);
            Object obj = e;
            if (((ProfileManagerV2Profile) (obj)).a == null)
            {
                break label0;
            }
            obj = ((ProfileManagerV2Profile) (obj)).a.iterator();
            ProfileManagerV2PkgProfile profilemanagerv2pkgprofile;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                profilemanagerv2pkgprofile = (ProfileManagerV2PkgProfile)((Iterator) (obj)).next();
            } while (!j1.equals(profilemanagerv2pkgprofile.a()));
            return profilemanagerv2pkgprofile.b;
        }
        return -1L;
    }

    public final String b(j j1, OfflinePackage offlinepackage)
    {
        if (c(j1))
        {
            j1 = e.a("c");
        } else
        {
            j1 = e.a(offlinepackage.a);
        }
        if (j1 == null)
        {
            return null;
        } else
        {
            return ((ProfileManagerV2PkgProfile) (j1)).e;
        }
    }

    public final boolean b(OfflinePackage offlinepackage)
    {
        return !c(g(offlinepackage)).contains("key_status");
    }

    public final int c()
    {
        return b;
    }

    public final void c(OfflinePackage offlinepackage)
    {
        this;
        JVM INSTR monitorenter ;
        e(offlinepackage);
        String s = g(offlinepackage);
        c(s).edit().clear().commit();
        n().edit().remove(s).commit();
        g.remove(offlinepackage);
        this;
        JVM INSTR monitorexit ;
        return;
        offlinepackage;
        throw offlinepackage;
    }

    public final boolean c(j j1)
    {
        return j1.b.endsWith("/c.zip");
    }

    public final void d(OfflinePackage offlinepackage)
    {
        Iterator iterator = o().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
            if (offlinepackage.a(offlinepackage1))
            {
                c(offlinepackage1);
            }
        } while (true);
    }

    public final void d(j j1)
    {
        Object obj = a(j1, j1.h, j1.i);
        n().edit().putString(((String) (obj)), "of_prefs").commit();
        obj = c(((String) (obj))).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("key_error_msg", j1.a());
        ((android.content.SharedPreferences.Editor) (obj)).putString("key_status", j1.e.toString());
        ((android.content.SharedPreferences.Editor) (obj)).putLong("key_total_bytes", j1.k);
        ((android.content.SharedPreferences.Editor) (obj)).putLong("key_downloaded_bytes", j1.l);
        ((android.content.SharedPreferences.Editor) (obj)).putLong("key_dm_download_id", j1.j);
        ((android.content.SharedPreferences.Editor) (obj)).putInt("key_major_version", j1.h);
        ((android.content.SharedPreferences.Editor) (obj)).putInt("key_revision", j1.i);
        ((android.content.SharedPreferences.Editor) (obj)).putInt("key_pm_version", j1.g);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

    public final boolean d()
    {
        return h;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = e;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.clear();
        k.clear();
        ProfileManagerV2PkgProfile profilemanagerv2pkgprofile;
        for (obj = e.a.iterator(); ((Iterator) (obj)).hasNext(); k.add(profilemanagerv2pkgprofile))
        {
            profilemanagerv2pkgprofile = (ProfileManagerV2PkgProfile)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        throw exception;
        HashSet hashset;
        exception = f();
        hashset = new HashSet();
        for (Iterator iterator = exception.iterator(); iterator.hasNext(); hashset.add(((OfflinePackage)iterator.next()).a)) { }
        Iterator iterator1 = e.a.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ProfileManagerV2PkgProfile profilemanagerv2pkgprofile1 = (ProfileManagerV2PkgProfile)iterator1.next();
            if (hashset.contains(profilemanagerv2pkgprofile1.a()))
            {
                f.add(profilemanagerv2pkgprofile1);
            }
        } while (true);
        g.clear();
        g.addAll(exception);
        l.clear();
        exception = g.iterator();
        while (exception.hasNext()) 
        {
            OfflinePackage offlinepackage = (OfflinePackage)exception.next();
            l.put(offlinepackage.a, offlinepackage);
        }
          goto _L1
    }

    protected abstract void e(OfflinePackage offlinepackage);

    public final void e(j j1)
    {
        SharedPreferences sharedpreferences = c(a(j1, j1.h, j1.i));
        int i1 = j1.h;
        int k1 = j1.i;
        j1.d = sharedpreferences.getString("key_error_msg", "");
        Object obj = sharedpreferences.getString("key_status", null);
        if (obj != null)
        {
            obj = OfflinePackage.Status.valueOf(((String) (obj)));
        } else
        {
            obj = OfflinePackage.Status.AVAILABLE;
        }
        j1.e = ((OfflinePackage.Status) (obj));
        j1.a(sharedpreferences.getLong("key_total_bytes", b(j1)));
        j1.b(sharedpreferences.getLong("key_downloaded_bytes", -1L));
        j1.j = sharedpreferences.getLong("key_dm_download_id", 0x7fffffffffffffffL);
        j1.h = sharedpreferences.getInt("key_major_version", i1);
        j1.i = sharedpreferences.getInt("key_revision", k1);
        j1.g = sharedpreferences.getInt("key_pm_version", 2);
    }

    public final List f()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = new HashMap();
        obj1 = o().iterator();
_L1:
        OfflinePackage offlinepackage;
        String s;
        OfflinePackage offlinepackage1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_158;
            }
            offlinepackage = (OfflinePackage)((Iterator) (obj1)).next();
            s = offlinepackage.a;
        } while (offlinepackage.f || offlinepackage.c == OfflinePackage.Status.AVAILABLE);
        offlinepackage1 = (OfflinePackage)((Map) (obj)).get(s);
        if (offlinepackage1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!offlinepackage.a(offlinepackage1))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        f(offlinepackage);
        offlinepackage.a(false);
        ((Map) (obj)).put(s, offlinepackage);
        int i1 = j();
        if (offlinepackage.g < i1)
        {
            offlinepackage.c = OfflinePackage.Status.ERROR;
            offlinepackage.e = c.getString(f.err_pkg_upgrade_required_to_use_offline);
            offlinepackage.a(false);
        }
          goto _L1
        obj;
        throw obj;
        obj1 = new ArrayList();
        if (i.b == PackageType.TRANSLATE)
        {
            m = new OfflinePackage(this, "en", a, b, OfflinePackage.Status.DOWNLOADED_POST_PROCESSED, true, PackageType.TRANSLATE);
            ((List) (obj1)).add(m);
        }
        ((List) (obj1)).addAll(((Map) (obj)).values());
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }

    public final void f(j j1)
    {
        Object obj = c(a(j1, j1.h, j1.i)).getString("key_status", null);
        if (obj != null)
        {
            obj = OfflinePackage.Status.valueOf(((String) (obj)));
        } else
        {
            obj = OfflinePackage.Status.AVAILABLE;
        }
        j1.e = ((OfflinePackage.Status) (obj));
    }

    public final OfflinePackage g()
    {
        return m;
    }

    public final void g(j j1)
    {
        j1 = a(j1, j1.h, j1.i);
        c(j1).edit().clear().commit();
        n().edit().remove(j1).commit();
    }

    public final List h()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = k.iterator();
_L2:
        Object obj1;
        String s;
        boolean flag;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_112;
            }
            obj1 = (ProfileManagerV2PkgProfile)iterator.next();
            s = ((ProfileManagerV2PkgProfile) (obj1)).a();
            flag = com.google.android.libraries.translate.offline.ProfileManagerV2Profile.b(s);
        } while (flag);
        obj1 = new OfflinePackage(this, s, e.b, ((ProfileManagerV2PkgProfile) (obj1)).d, OfflinePackage.Status.AVAILABLE, flag, i.b);
        f(((OfflinePackage) (obj1)));
        ((List) (obj)).add(obj1);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public final boolean h(j j1)
    {
        File file = new File((new StringBuilder(Singleton.a().getExternalFilesDir("").getAbsolutePath())).append("/").append(i()).append("/v").append(a).append("r").append(b).toString());
        j1 = j1.b;
        return (new File(file, j1.substring(j1.lastIndexOf('/') + 1).replace(".zip", ""))).exists();
    }

    protected abstract String i();

    protected abstract int j();

    protected abstract String k();

    protected abstract String l();

    protected abstract String m();
}
