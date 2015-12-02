// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.dialog.j;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.filemanager.FileBrowseActivity;
import com.qihoo360.common.utils.StorageDeviceUtils;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.support.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g
{

    private static j a(Context context, String s1, String s2, String s3, TrashInfo trashinfo)
    {
        j j1 = new j(context);
        j1.setDialogTitle(0x7f0c007c);
        String s4 = d.a().a(0x7f0c007a);
        String s5 = d.a().a(0x7f0c007b);
        context = new android.widget.AdapterView.OnItemClickListener(context, s1, s3, trashinfo, s2, j1) {

            final Context a;
            final String b;
            final String c;
            final TrashInfo d;
            final String e;
            final j f;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                i;
                JVM INSTR tableswitch 0 1: default 24
            //                           0 32
            //                           1 54;
                   goto _L1 _L2 _L3
_L1:
                s.a(f);
                return;
_L2:
                com.qihoo.security.opti.trashclear.ui.g.a(a, b, c, d);
                continue; /* Loop/switch isn't completed */
_L3:
                com.qihoo.security.opti.trashclear.ui.g.a(a, e, c, d);
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = context;
                b = s1;
                c = s2;
                d = trashinfo;
                e = s3;
                f = j1;
                super();
            }
        };
        j1.a(new String[] {
            s4, s5
        }, 0, context);
        j1.getShownButtons();
        return j1;
    }

    public static CharSequence a(Context context, String s1)
    {
        String s2 = "";
        Object obj = s1.toString();
        if (s1.contains("<"))
        {
            for (obj = Pattern.compile("<(.*?)>").matcher(s1); ((Matcher) (obj)).find();)
            {
                s2 = ((Matcher) (obj)).group(1);
            }

            s1 = s1.toString().replace("<", "").replace(">", "");
        } else
        {
            s2 = "";
            s1 = ((String) (obj));
        }
        return r.a(context, s1, 0x7f080018, s2);
    }

    public static String a(String s1, int i, String s2)
    {
        int k = 0;
        String s4 = (new StringBuilder()).append(".").append(s1.substring(s1.lastIndexOf(".") + 1)).toString();
        String s3 = "";
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            char ac[] = s1.toCharArray();
            if (ac.length >= i + 5)
            {
label0:
                {
                    int l = 0;
                    s1 = s3;
                    for (; k < ac.length && i > l; k++)
                    {
                        l += String.valueOf(ac[k]).getBytes().length;
                        s1 = (new StringBuilder()).append(s1).append(ac[k]).toString();
                    }

                    if (i != l && i != l - 1)
                    {
                        s3 = s1;
                        if (i != l + 1)
                        {
                            break label0;
                        }
                    }
                    s3 = s1;
                    if (!s1.contains(s4))
                    {
                        s3 = (new StringBuilder()).append(s1).append(s2).toString();
                    }
                }
                return s3;
            }
        }
        return s1;
    }

    public static String a(String s1, Context context)
    {
        context = StorageDeviceUtils.getStorageDevice(context);
        int k = context.size();
        if (k < 2)
        {
            context = s1;
            if (o.c())
            {
                String s2 = StorageDeviceUtils.getSDPathBySDKApi();
                context = s1;
                if (!TextUtils.isEmpty(s2))
                {
                    context = s1;
                    if (s1.contains(s2))
                    {
                        context = s1.replace(s2, "");
                    }
                }
            }
            return context;
        }
        for (int i = 1; i < k; i++)
        {
            String s3 = ((com.qihoo360.common.utils.StorageDeviceUtils.StorageDevice)context.get(i)).path;
            if (!TextUtils.isEmpty(s3) && s1.contains(s3))
            {
                s1 = s1.replace(s3, "");
            }
        }

        return s1;
    }

    public static ArrayList a(Context context)
    {
        ArrayList arraylist = s.a(context);
        if (arraylist == null || arraylist.size() == 0 || com.qihoo360.mobilesafe.support.a.c(context))
        {
            return arraylist;
        }
        int i = arraylist.size() - 1;
        do
        {
            if (i >= 0)
            {
                long l = System.currentTimeMillis();
                context = new File((new StringBuilder()).append((String)arraylist.get(i)).append(File.separator).append(l).toString());
                boolean flag1;
                if (context.exists())
                {
                    flag1 = context.delete();
                } else
                {
                    boolean flag;
                    try
                    {
                        flag = context.createNewFile();
                    }
                    catch (IOException ioexception)
                    {
                        ioexception.printStackTrace();
                        flag = false;
                    }
                    flag1 = flag;
                    if (flag)
                    {
                        context.delete();
                        flag1 = flag;
                    }
                }
            } else
            {
                return arraylist;
            }
            if (!flag1)
            {
                arraylist.remove(i);
            }
            i--;
        } while (true);
    }

    protected static void a(Context context, TrashInfo trashinfo, String s1)
    {
        if ((321 == trashinfo.type || 33 == trashinfo.type) && trashinfo.bundle.getStringArrayList("multiPathList") != null)
        {
            a(context, s1, trashinfo);
        } else
        {
            Object obj = trashinfo.bundle.getParcelableArrayList("subList");
            if (trashinfo.path != null)
            {
                obj = trashinfo.path;
            } else
            if (obj != null && !((ArrayList) (obj)).isEmpty())
            {
                obj = ((TrashInfo)((ArrayList) (obj)).get(0)).path;
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                if (!(new File(((String) (obj)))).exists())
                {
                    ArrayList arraylist = a(context);
                    if (arraylist != null && !arraylist.isEmpty())
                    {
                        if (arraylist.size() == 1)
                        {
                            a(context, (new StringBuilder()).append((String)arraylist.get(0)).append("/").append(((String) (obj))).toString(), s1, trashinfo);
                            return;
                        }
                        String s2 = (new StringBuilder()).append((String)arraylist.get(0)).append("/").append(((String) (obj))).toString();
                        obj = (new StringBuilder()).append((String)arraylist.get(1)).append("/").append(((String) (obj))).toString();
                        File file = new File(s2);
                        File file1 = new File(((String) (obj)));
                        String as[] = file.list();
                        String as1[] = file1.list();
                        int i;
                        int k;
                        boolean flag;
                        boolean flag1;
                        boolean flag2;
                        boolean flag3;
                        if (as != null)
                        {
                            i = as.length;
                        } else
                        {
                            i = 0;
                        }
                        if (as1 != null)
                        {
                            k = as1.length;
                        } else
                        {
                            k = 0;
                        }
                        if (file.exists() && i > 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (file1.exists() && k > 0)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        flag1 = flag3;
                        flag2 = flag;
                        if (trashinfo.type == 33)
                        {
                            flag1 = flag3;
                            flag2 = flag;
                            if (trashinfo.bundle != null)
                            {
                                flag1 = flag3;
                                flag2 = flag;
                                if (trashinfo.bundle.getBoolean("isUninstalledOtherItem", false))
                                {
                                    ArrayList arraylist1 = trashinfo.bundle.getStringArrayList("unintalledRootDirList");
                                    if (arraylist1 != null && arraylist1.size() > 0)
                                    {
                                        flag2 = arraylist1.contains(((String)arraylist.get(0)).toLowerCase(Locale.US));
                                        flag1 = arraylist1.contains(((String)arraylist.get(1)).toLowerCase(Locale.US));
                                    } else
                                    {
                                        flag1 = false;
                                        flag2 = false;
                                    }
                                }
                            }
                        }
                        if (!flag2 && flag1)
                        {
                            a(context, ((String) (obj)), s1, trashinfo);
                            return;
                        }
                        if (flag2 && flag1)
                        {
                            a(context, s2, ((String) (obj)), s1, trashinfo).show();
                            return;
                        } else
                        {
                            a(context, s2, s1, trashinfo);
                            return;
                        }
                    }
                } else
                {
                    a(context, ((String) (obj)), s1, trashinfo);
                    return;
                }
            }
        }
    }

    private static void a(Context context, String s1, TrashInfo trashinfo)
    {
        ArrayList arraylist1 = trashinfo.bundle.getStringArrayList("multiPathList");
        if (arraylist1 != null && arraylist1.size() != 0 && context != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = a(context)) == null || ((List) (obj)).size() == 0) goto _L1; else goto _L3
_L3:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s2 = (String)((Iterator) (obj)).next();
            Iterator iterator = arraylist1.iterator();
            while (iterator.hasNext()) 
            {
                String s3 = (String)iterator.next();
                s3 = (new StringBuilder()).append(s2).append(File.separator).append(s3).toString();
                if ((new File(s3)).exists())
                {
                    arraylist.add(s3);
                }
            }
        } while (true);
        if (arraylist.size() == 0) goto _L1; else goto _L4
_L4:
        if (arraylist.size() == 1)
        {
            a(context, (String)arraylist.get(0), s1, trashinfo);
            return;
        } else
        {
            String as[] = new String[arraylist.size()];
            arraylist.toArray(as);
            j j1 = new j(context);
            j1.setDialogTitle(0x7f0c007c);
            j1.a(as, new android.widget.AdapterView.OnItemClickListener(context, arraylist, s1, trashinfo, j1) {

                final Context a;
                final List b;
                final String c;
                final TrashInfo d;
                final j e;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    com.qihoo.security.opti.trashclear.ui.g.a(a, (String)b.get(i), c, d);
                    if (e.isShowing())
                    {
                        e.dismiss();
                    }
                }

            
            {
                a = context;
                b = list;
                c = s1;
                d = trashinfo;
                e = j1;
                super();
            }
            });
            j1.show();
            return;
        }
    }

    public static void a(Context context, String s1, String s2, TrashInfo trashinfo)
    {
        boolean flag = false;
        FileBrowseActivity.y = trashinfo;
        Intent intent = new Intent(context, com/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity);
        intent.putExtra("current_directory", s1);
        intent.putExtra("current_directory_name", s2);
        s2 = a(context);
        Collections.sort(s2, Collections.reverseOrder());
        s2 = s2.iterator();
        do
        {
            if (!s2.hasNext())
            {
                break;
            }
            String s3 = (String)s2.next();
            if (!s1.startsWith(s3))
            {
                continue;
            }
            intent.putExtra("current_sdcard_directory", s3.toLowerCase());
            break;
        } while (true);
        if (trashinfo.bundle != null)
        {
            s1 = trashinfo.bundle.getStringArrayList("unintalledIgnoreDirList");
        } else
        {
            s1 = null;
        }
        if (s1 != null && s1.size() > 0)
        {
            s2 = new Bundle();
            String as[] = new String[s1.size()];
            for (int i = 0; i < as.length; i++)
            {
                as[i] = (String)s1.get(i);
            }

            s2.putStringArray("current_filter_directory", as);
            intent.putExtras(s2);
        }
        if (trashinfo.bundle != null)
        {
            s1 = trashinfo.bundle.getStringArrayList("unintalledParentDirList");
        } else
        {
            s1 = null;
        }
        if (s1 != null && s1.size() > 0)
        {
            s2 = new Bundle();
            trashinfo = new String[s1.size()];
            for (int k = ((flag) ? 1 : 0); k < trashinfo.length; k++)
            {
                trashinfo[k] = (String)s1.get(k);
            }

            s2.putStringArray("current_prefix_directory", trashinfo);
            intent.putExtras(s2);
        }
        context.startActivity(intent);
    }
}
