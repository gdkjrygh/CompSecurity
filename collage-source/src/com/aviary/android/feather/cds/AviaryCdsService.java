// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.aviary.android.feather.cds.a.c;
import com.aviary.android.feather.cds.a.e;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.threading.ThreadPool;
import com.aviary.android.feather.common.utils.b;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.i;
import com.aviary.android.feather.common.utils.j;
import com.aviary.android.feather.common.utils.k;
import com.aviary.android.feather.common.utils.os.AviaryIntentService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.cds:
//            h, p, AviaryCdsReceiver, j

public final class AviaryCdsService extends AviaryIntentService
    implements com.aviary.android.feather.cds.billing.util.d.d
{
    public static class a extends Exception
    {

        private int a;

        public int a()
        {
            return a;
        }

        public String getLocalizedMessage()
        {
            String s1;
            if (getCause() != null)
            {
                s1 = getCause().getLocalizedMessage();
            } else
            {
                s1 = super.getLocalizedMessage();
            }
            return (new StringBuilder()).append(s1).append(" (ErrorCode: ").append(a).append(")").toString();
        }

        public a(int i1, String s1)
        {
            super(s1);
            a = i1;
        }

        a(int i1, Throwable throwable)
        {
            super(throwable);
            a = i1;
        }
    }


    static final com.aviary.android.feather.common.a.a.c a;
    private static String b;
    private static boolean c;
    private static int d = 3;
    private static String e;
    private static String f;
    private static String g;
    private static String m;
    private static String n;
    private static long o = 0L;
    private static final ThreadPool p = new ThreadPool(10, 10);
    private static final Object r = new Object();
    private final Locale h = Locale.getDefault();
    private String i;
    private String j;
    private String k;
    private SharedPreferences l;
    private com.aviary.android.feather.cds.j q;
    private final Object s = new Object();
    private com.aviary.android.feather.cds.billing.util.e t;

    public AviaryCdsService()
    {
        super("AviaryCdsService");
    }

    private int a(long l1, long l2, File file, String s1, InputStream inputstream)
        throws IOException, AssertionError
    {
        a.c("onUpdatePackIcon(%d - %d): %s", new Object[] {
            Long.valueOf(l2), Long.valueOf(l1), s1
        });
        Assert.assertNotNull("iconDir is null", file);
        synchronized (r)
        {
            file.mkdirs();
        }
        Assert.assertTrue("iconDir is not a valid directory", file.isDirectory());
        int i1;
        boolean flag;
        if (s1 != null)
        {
            file = new File(file, s1);
        } else
        {
            file = File.createTempFile("icon-", ".png", file);
        }
        a.b("saving icon to: %s", new Object[] {
            file.getAbsolutePath()
        });
        obj = new FileOutputStream(file, true);
        synchronized (r)
        {
            com.aviary.android.feather.common.utils.d.a(inputstream, ((java.io.OutputStream) (obj)));
        }
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
        s1 = new ContentValues();
        s1.put("content_iconPath", file.getAbsolutePath());
        s1.put("content_iconNeedDownload", Integer.valueOf(0));
        i1 = getContentResolver().update(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(l2).append("/content/id/").append(l1).append("/update").toString()), s1, null, null);
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("!(result > 0)", flag);
        return i1;
        file;
        obj;
        JVM INSTR monitorexit ;
        throw file;
        file;
        s1;
        JVM INSTR monitorexit ;
        throw file;
    }

    static int a(AviaryCdsService aviarycdsservice, long l1, long l2, File file, String s1, InputStream inputstream)
        throws IOException, AssertionError
    {
        return aviarycdsservice.a(l1, l2, file, s1, inputstream);
    }

    private PendingIntent a(Context context, String s1, String s2)
    {
        Intent intent = new Intent(context, com/aviary/android/feather/cds/AviaryCdsService);
        intent.setAction("aviary.intent.action.CDS_VERIFY_SUBSCRIPTIONS");
        intent.putExtra("extra-api-key-secret", s1);
        intent.putExtra("extra-billing-public-key", s2);
        return PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    private String a(String s1, String s2)
    {
        StringBuffer stringbuffer = new StringBuffer(b);
        stringbuffer.append("/content?");
        stringbuffer.append("formatListId=");
        stringbuffer.append(s2);
        stringbuffer.append("&identifier=");
        stringbuffer.append(s1);
        if (a())
        {
            stringbuffer.append("&language=");
            stringbuffer.append(c());
        }
        if (c)
        {
            stringbuffer.append("&staging=2");
        }
        return stringbuffer.toString();
    }

    private void a(Context context, long l1)
    {
        if (TextUtils.isEmpty(n))
        {
            return;
        } else
        {
            a(context, l1, m, n);
            return;
        }
    }

    public static void a(Context context, long l1, Intent intent)
    {
        a.c("addAlarm: %d", new Object[] {
            Long.valueOf(l1)
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l1));
        intent = PendingIntent.getService(context, 0, intent, 0x8000000);
        ((AlarmManager)context.getSystemService("alarm")).set(0, calendar.getTimeInMillis(), intent);
    }

    private void a(Context context, long l1, String s1, String s2)
    {
        a.c("setSubscriptionValidationAlarm: %d", new Object[] {
            Long.valueOf(l1)
        });
        s1 = a(context, s1, s2);
        ((AlarmManager)context.getSystemService("alarm")).set(3, l1, s1);
    }

    private void a(Context context, long l1, boolean flag, String s1, String s2)
    {
        a.c("createCdsDownloadStartAlarm: %d, wifionly: %b", new Object[] {
            Long.valueOf(l1), Boolean.valueOf(flag)
        });
        s1 = b(context, flag, s1, s2);
        ((AlarmManager)context.getSystemService("alarm")).set(3, l1, s1);
    }

    private void a(Context context, com.aviary.android.feather.cds.a.a a1, int i1, int j1, String s1)
        throws AssertionError
    {
        boolean flag1 = true;
        a.b(">> onAddNewJsonContent");
        Assert.assertNotNull(a1);
        ContentValues contentvalues;
        boolean flag;
        if (a1.n() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("Invalid Error Code", flag);
        if (!TextUtils.isEmpty(a1.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("Identifier is null", flag);
        a.b("adding: %s", new Object[] {
            a1.e()
        });
        if (com.aviary.android.feather.cds.h.b(context, a1.b(), new String[] {
    "pack_id"
}) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("pack already exists in the database", flag);
        context = new ArrayList();
        contentvalues = new ContentValues();
        contentvalues.put("pack_identifier", a1.b());
        contentvalues.put("pack_type", a1.d());
        contentvalues.put("pack_versionKey", a1.c());
        contentvalues.put("pack_displayOrder", Integer.valueOf(i1));
        contentvalues.put("pack_visible", Integer.valueOf(j1));
        context.add(contentvalues);
        contentvalues = new ContentValues();
        contentvalues.put("content_previewURL", (new StringBuilder()).append(s1).append(a1.i()).toString());
        contentvalues.put("content_previewVersion", a1.j());
        contentvalues.put("content_contentURL", (new StringBuilder()).append(s1).append(a1.k()).toString());
        contentvalues.put("content_contentVersion", a1.l());
        contentvalues.put("content_iconUrl", (new StringBuilder()).append(s1).append(a1.g()).toString());
        contentvalues.put("content_iconVersion", a1.h());
        if (a1.m())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("content_isFree", Integer.valueOf(i1));
        contentvalues.put("content_purchased", Integer.valueOf(0));
        contentvalues.put("content_iconNeedDownload", Integer.valueOf(1));
        contentvalues.put("content_displayName", a1.e());
        contentvalues.put("content_displayDescription", a1.f());
        contentvalues.put("content_numItems", Integer.valueOf(a1.a().size()));
        context.add(contentvalues);
        ContentValues contentvalues1;
        for (a1 = a1.a().iterator(); a1.hasNext(); context.add(contentvalues1))
        {
            s1 = (com.aviary.android.feather.cds.a.a.a)a1.next();
            contentvalues1 = new ContentValues();
            contentvalues1.put("item_identifier", s1.a());
            contentvalues1.put("item_displayName", s1.b());
            if (s1.c() != null)
            {
                contentvalues1.put("item_options", s1.c());
            }
        }

        context = (ContentValues[])context.toArray(new ContentValues[context.size()]);
        i1 = getContentResolver().bulkInsert(com.aviary.android.feather.cds.h.b(getBaseContext(), "bulk/insertPackContentAndItems"), context);
        a.b("result: %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (i1 > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
    }

    private void a(Context context, InputStream inputstream)
        throws JSONException, IOException
    {
        a.b(">> onParseManifest");
        c c1 = new c();
        if (c1.a(inputstream) != 0)
        {
            throw new JSONException(c1.o());
        }
        a.b("new versionKey: %s", new Object[] {
            c1.b()
        });
        a.b("assetsBaseURL: %s", new Object[] {
            c1.a()
        });
        a.b("has content: %b", new Object[] {
            Boolean.valueOf(c1.h())
        });
        a.b("hasPacks: %b", new Object[] {
            Boolean.valueOf(c1.d())
        });
        a.b("hasDeletedPacks: %b", new Object[] {
            Boolean.valueOf(c1.e())
        });
        long l2 = System.currentTimeMillis();
        a(context, c1.l(), c1.m());
        boolean flag1;
        if (c1.h())
        {
            boolean flag;
            long l1;
            if (!b(c1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = false | flag;
            l1 = System.currentTimeMillis();
            a.d("*** parse packs completed (%dms): %b ***", new Object[] {
                Long.valueOf(l1 - l2), Boolean.valueOf(flag1)
            });
            if (!e(c1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            l2 = System.currentTimeMillis();
            a.d("*** hard remove packs completed (%dms): %b ***", new Object[] {
                Long.valueOf(l2 - l1), Boolean.valueOf(flag1)
            });
            if (!c(c1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            l1 = System.currentTimeMillis();
            a.d("*** parse messages completed (%dms): %b ***", new Object[] {
                Long.valueOf(l1 - l2), Boolean.valueOf(flag1)
            });
            if (com.aviary.android.feather.common.utils.f.c(getBaseContext()))
            {
                long l3;
                if (!d(c1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag | flag1;
                l3 = System.currentTimeMillis();
                a.d("*** parse subscriptions completed (%dms): %b ***", new Object[] {
                    Long.valueOf(l3 - l1), Boolean.valueOf(flag1)
                });
            } else
            {
                a.c("*** skipping subscription parsing");
            }
        } else
        {
            a.a("manifest has no content");
            flag1 = false;
        }
        l3 = System.currentTimeMillis();
        a.e("hasException: %b", new Object[] {
            Boolean.valueOf(flag1)
        });
        if (flag1)
        {
            a.d("something went wrong, don't update the version key");
            a(((Throwable) (null)));
        } else
        {
            a(c1);
            o = System.currentTimeMillis();
            m();
        }
        if (c1.h())
        {
            g(c1);
            l1 = System.currentTimeMillis();
            a.d("*** hide unavailable packs completed (%dms): %b ***", new Object[] {
                Long.valueOf(l1 - l3), Boolean.valueOf(flag1)
            });
            f(c1);
            l3 = System.currentTimeMillis();
            a.d("*** remove unavailable messages completed (%dms): %b ***", new Object[] {
                Long.valueOf(l3 - l1), Boolean.valueOf(flag1)
            });
        }
        l1 = System.currentTimeMillis();
        e(c1.a());
        l3 = System.currentTimeMillis();
        a.d("*** download pack icons completed (%dms)***", new Object[] {
            Long.valueOf(l3 - l1)
        });
        com.aviary.android.feather.cds.h.e(getBaseContext());
    }

    private void a(Context context, InputStream inputstream, int i1, int j1, String s1)
        throws JSONException, IOException, AssertionError
    {
        com.aviary.android.feather.cds.a.a a1 = new com.aviary.android.feather.cds.a.a();
        if (a1.a(inputstream) != 0)
        {
            throw new JSONException(a1.o());
        } else
        {
            a(context, a1, i1, j1, s1);
            return;
        }
    }

    private void a(Context context, InputStream inputstream, k.a a1, String s1, String s2)
        throws JSONException, IOException, AssertionError
    {
        boolean flag;
        a.c(">> onUpdateMessageContent: %s", new Object[] {
            a1.c()
        });
        com.aviary.android.feather.cds.a.d d1 = new com.aviary.android.feather.cds.a.d();
        if (d1.a(inputstream) != 0)
        {
            throw new JSONException(d1.o());
        }
        if (d1.b().equals(a1.b()))
        {
            a.c("versionKey identical");
            return;
        }
        a.b("message content identifier: %s", new Object[] {
            d1.d()
        });
        inputstream = com.aviary.android.feather.cds.h.a(context, d1.a(), new String[] {
            "msg_id"
        });
        ContentValues contentvalues;
        int i1;
        if (inputstream != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("currentContent is null", flag);
        contentvalues = new ContentValues();
        contentvalues.put("msg_identifier", d1.a());
        contentvalues.put("msg_versionKey", d1.b());
        contentvalues.put("msg_type", s1);
        s1 = new ContentValues();
        if (d1.m())
        {
            context = d1.j();
        } else
        {
            context = null;
        }
        s1.put("msgcnt_actionButton", context);
        s1.put("msgcnt_beginDate", com.aviary.android.feather.common.utils.c.a(d1.e()));
        s1.put("msgcnt_contentIdentifier", d1.d());
        s1.put("msgcnt_contentURL", (new StringBuilder()).append(s2).append(d1.c()).toString());
        s1.put("msgcnt_dismissButton", d1.i());
        s1.put("msgcnt_endDate", com.aviary.android.feather.common.utils.c.a(d1.f()));
        s1.put("msgcnt_layoutStyle", d1.k());
        s1.put("msgcnt_paragraph", d1.h());
        if (d1.l())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s1.put("msgcnt_showNewBanner", Integer.valueOf(i1));
        s1.put("msgcnt_title", d1.g());
        context = new Bundle();
        context.putLong("messageId", a1.p());
        context.putLong("messageContentId", inputstream.p());
        context.putParcelable("messageValues", contentvalues);
        context.putParcelable("messageContentValues", s1);
        s2 = new ArrayList();
        s2.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("message/id/").append(a1.p()).append("/update").toString())).withValues(contentvalues).build());
        s2.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("message/id/").append(a1.p()).append("/content/id/").append(inputstream.p()).append("/update").toString())).withValues(s1).build());
        inputstream = com.aviary.android.feather.cds.h.b(getBaseContext(), null);
        context = null;
        a.b("authority: %s - %s", new Object[] {
            inputstream, inputstream.getAuthority()
        });
        inputstream = getContentResolver().applyBatch(inputstream.getAuthority(), s2);
        context = inputstream;
_L1:
        Assert.assertNotNull("batch result is null", context);
        if (context.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("batch result size != 2", flag);
        if (context[0] != null && ((ContentProviderResult) (context[0])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        if (context[1] != null && ((ContentProviderResult) (context[1])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        com.aviary.android.feather.cds.h.f(getBaseContext(), a1.p());
        return;
        inputstream;
        inputstream.printStackTrace();
          goto _L1
        inputstream;
        inputstream.printStackTrace();
          goto _L1
    }

    private void a(Context context, InputStream inputstream, m.a a1, int i1, String s1)
        throws IOException, JSONException, AssertionError
    {
        boolean flag;
        a.c(">> onUpdateJsonContent: %s", new Object[] {
            a1.a()
        });
        context = new com.aviary.android.feather.cds.a.a();
        if (context.a(inputstream) != 0)
        {
            throw new AssertionFailedError((new StringBuilder()).append("parser failure: ").append(context.o()).toString());
        }
        a.b("%s == %s", new Object[] {
            context.c(), a1.c()
        });
        if (context.c().equals(a1.c()))
        {
            break MISSING_BLOCK_LABEL_961;
        }
        inputstream = com.aviary.android.feather.cds.h.b(getBaseContext(), a1.p(), null);
        ContentValues contentvalues;
        ContentValues contentvalues1;
        boolean flag1;
        boolean flag2;
        if (inputstream != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("currentContent is null", flag);
        if (!context.h().equals(inputstream.m()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!context.j().equals(inputstream.l()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!context.l().equals(inputstream.k()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        a.b("iconChanged: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        a.b("previewChanged: %b", new Object[] {
            Boolean.valueOf(flag1)
        });
        a.b("contentChanged: %b", new Object[] {
            Boolean.valueOf(flag2)
        });
        contentvalues = new ContentValues();
        contentvalues.put("pack_versionKey", context.c());
        contentvalues.put("pack_displayOrder", Integer.valueOf(i1));
        contentvalues.put("pack_visible", Integer.valueOf(1));
        contentvalues1 = new ContentValues();
        contentvalues1.put("content_displayName", context.e());
        contentvalues1.put("content_displayDescription", context.f());
        if (context.m())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues1.put("content_isFree", Integer.valueOf(i1));
        contentvalues1.put("content_numItems", Integer.valueOf(context.a().size()));
        if (flag)
        {
            contentvalues1.put("content_iconVersion", context.h());
            contentvalues1.put("content_iconUrl", (new StringBuilder()).append(s1).append(context.g()).toString());
            contentvalues1.put("content_iconNeedDownload", Integer.valueOf(1));
        }
        if (flag1)
        {
            a.a("need to remove the previews");
            if (!TextUtils.isEmpty(inputstream.h()))
            {
                try
                {
                    a.a("trying to delete previews");
                    com.aviary.android.feather.common.utils.d.c(new File(inputstream.h()));
                }
                catch (Throwable throwable)
                {
                    a.d("error while deleting previews");
                    throwable.printStackTrace();
                }
            }
            contentvalues1.put("content_previewVersion", context.j());
            contentvalues1.put("content_previewURL", (new StringBuilder()).append(s1).append(context.i()).toString());
            contentvalues1.putNull("content_previewPath");
            contentvalues1.put("content_previewNeedDownload", Integer.valueOf(1));
        }
        if (flag2)
        {
            contentvalues1.put("content_contentVersion", context.l());
            contentvalues1.put("content_contentURL", (new StringBuilder()).append(s1).append(context.k()).toString());
            contentvalues1.put("content_contentNeedDownload", Integer.valueOf(1));
        }
        s1 = new ArrayList();
        s1.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(a1.p()).append("/update").toString())).withValues(contentvalues).build());
        s1.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(a1.p()).append("/content/id/").append(inputstream.p()).append("/update").toString())).withValues(contentvalues1).build());
        inputstream = com.aviary.android.feather.cds.h.b(getBaseContext(), null);
        context = null;
        a.b("authority: %s - %s", new Object[] {
            inputstream, inputstream.getAuthority()
        });
        inputstream = getContentResolver().applyBatch(inputstream.getAuthority(), s1);
        context = inputstream;
_L1:
        Assert.assertNotNull("batch result is null", context);
        if (context.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("batch result size != 2", flag);
        if (context[0] != null && ((ContentProviderResult) (context[0])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        if (context[1] != null && ((ContentProviderResult) (context[1])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        com.aviary.android.feather.cds.h.g(getBaseContext(), a1.p());
        return;
        inputstream;
        inputstream.printStackTrace();
          goto _L1
        inputstream;
        inputstream.printStackTrace();
          goto _L1
        a.c("versionKey identical");
        return;
    }

    private void a(Context context, InputStream inputstream, q.a a1, String s1)
        throws JSONException, IOException, AssertionError
    {
        a.c(">> onUpdateSubscriptionContent: %s", new Object[] {
            a1.a()
        });
        s1 = new e();
        if (s1.a(inputstream) != 0)
        {
            throw new JSONException(s1.o());
        }
        if (!s1.b().equals(a1.b())) goto _L2; else goto _L1
_L1:
        a.c("versionKey identical");
_L4:
        return;
_L2:
        a.b("subscription content identifier: %s", new Object[] {
            s1.a()
        });
        context = com.aviary.android.feather.cds.h.d(context, s1.a(), null);
        if (context == null) goto _L4; else goto _L3
_L3:
        inputstream = new ContentValues();
        inputstream.put("subscription_version_key", s1.b());
        inputstream.put("subscription_identifier", s1.a());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("subscriptions_content_display_description", s1.d());
        contentvalues.put("subscriptions_content_display_name", s1.c());
        contentvalues.put("subscriptions_content_unlock_type", s1.e());
        contentvalues.put("subscriptions_content_duration_tier", Integer.valueOf(s1.f()));
        contentvalues.put("subscriptions_content_purchased", Integer.valueOf(0));
        s1 = new Bundle();
        s1.putLong("subscriptionId", a1.p());
        s1.putLong("subscriptionContentId", context.p());
        s1.putParcelable("subscriptionValues", inputstream);
        s1.putParcelable("subscriptionContentValues", contentvalues);
        s1 = new ArrayList();
        s1.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("subscription/id/").append(a1.p()).append("/update").toString())).withValues(inputstream).build());
        s1.add(ContentProviderOperation.newUpdate(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("subscription/id/").append(a1.p()).append("/content/id/").append(context.p()).append("/update").toString())).withValues(contentvalues).build());
        inputstream = com.aviary.android.feather.cds.h.b(getBaseContext(), null);
        context = null;
        a.b("authority: %s - %s", new Object[] {
            inputstream, inputstream.getAuthority()
        });
        inputstream = getContentResolver().applyBatch(inputstream.getAuthority(), s1);
        context = inputstream;
_L5:
        Assert.assertNotNull("batch result is null", context);
        boolean flag;
        if (context.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("batch result size != 2", flag);
        if (context[0] != null && ((ContentProviderResult) (context[0])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        if (context[1] != null && ((ContentProviderResult) (context[1])).count.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        return;
        inputstream;
        inputstream.printStackTrace();
          goto _L5
        inputstream;
        inputstream.printStackTrace();
          goto _L5
    }

    private void a(Context context, InputStream inputstream, String s1)
        throws JSONException, IOException, AssertionError
    {
        boolean flag = true;
        a.c(">> onAddNewSubscriptionContent: %s ", new Object[] {
            s1
        });
        s1 = new e();
        if (s1.a(inputstream) != 0)
        {
            throw new JSONException(s1.o());
        }
        a.b("subscription content identifier: %s", new Object[] {
            s1.a()
        });
        if (com.aviary.android.feather.cds.h.c(context, s1.a(), new String[] {
    "subscription_id"
}) != null)
        {
            return;
        }
        context = new ContentValues();
        context.put("subscription_version_key", s1.b());
        context.put("subscription_identifier", s1.a());
        inputstream = new ContentValues();
        inputstream.put("subscriptions_content_display_description", s1.d());
        inputstream.put("subscriptions_content_display_name", s1.c());
        inputstream.put("subscriptions_content_unlock_type", s1.e());
        inputstream.put("subscriptions_content_duration_tier", Integer.valueOf(s1.f()));
        inputstream.put("subscriptions_content_purchased", Integer.valueOf(0));
        int i1 = getContentResolver().bulkInsert(com.aviary.android.feather.cds.h.b(getBaseContext(), "bulk/insertSubscriptionAndContent"), new ContentValues[] {
            context, inputstream
        });
        a.b("result: %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (i1 <= 0)
        {
            flag = false;
        }
        Assert.assertTrue(flag);
    }

    private void a(Context context, InputStream inputstream, String s1, String s2)
        throws JSONException, IOException, AssertionError
    {
        boolean flag = true;
        a.b(">> onAddNewMessageContent");
        com.aviary.android.feather.cds.a.d d1 = new com.aviary.android.feather.cds.a.d();
        if (d1.a(inputstream) != 0)
        {
            throw new JSONException(d1.o());
        }
        a.b("message content identifier: %s", new Object[] {
            d1.d()
        });
        if (com.aviary.android.feather.cds.h.a(context, d1.a(), new String[] {
    "msg_id"
}) != null)
        {
            return;
        }
        inputstream = new ContentValues();
        inputstream.put("msg_identifier", d1.a());
        inputstream.put("msg_versionKey", d1.b());
        inputstream.put("msg_type", s1);
        s1 = new ContentValues();
        int i1;
        if (d1.m())
        {
            context = d1.j();
        } else
        {
            context = null;
        }
        s1.put("msgcnt_actionButton", context);
        s1.put("msgcnt_beginDate", com.aviary.android.feather.common.utils.c.a(d1.e()));
        s1.put("msgcnt_contentIdentifier", d1.d());
        s1.put("msgcnt_contentURL", (new StringBuilder()).append(s2).append(d1.c()).toString());
        s1.put("msgcnt_dismissButton", d1.i());
        s1.put("msgcnt_endDate", com.aviary.android.feather.common.utils.c.a(d1.f()));
        s1.put("msgcnt_layoutStyle", d1.k());
        s1.put("msgcnt_paragraph", d1.h());
        if (d1.l())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s1.put("msgcnt_showNewBanner", Integer.valueOf(i1));
        s1.put("msgcnt_title", d1.g());
        i1 = getContentResolver().bulkInsert(com.aviary.android.feather.cds.h.b(getBaseContext(), "bulk/insertMessageAndContent"), new ContentValues[] {
            inputstream, s1
        });
        a.b("result: %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (i1 <= 0)
        {
            flag = false;
        }
        Assert.assertTrue(flag);
    }

    private void a(Context context, List list, String s1)
    {
        Cursor cursor;
        a.c(">> onUpdatePermissions: %s (%s)", new Object[] {
            list, s1
        });
        cursor = getContentResolver().query(com.aviary.android.feather.cds.h.b(context, "permissions/list"), null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        Object obj = com.aviary.android.feather.cds.o.a.a(cursor);
        if (obj == null) goto _L2; else goto _L3
_L3:
        a.b("old permissions: %s - %s", new Object[] {
            ((o.a) (obj)).b(), ((o.a) (obj)).a()
        });
        obj = ((o.a) (obj)).a();
        if (obj == null) goto _L2; else goto _L4
_L4:
        boolean flag;
        if (!s1.equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L5:
        com.aviary.android.feather.common.utils.d.a(cursor);
_L6:
        a.b("permissions need update? %b", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag)
        {
            String s2 = com.aviary.android.feather.common.utils.k.a(list, ",");
            a.b("permissionString: '%s'", new Object[] {
                s2
            });
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("perm_value", s2);
            contentvalues.put("perm_hash", s1);
            if (getContentResolver().insert(com.aviary.android.feather.cds.h.b(context, "permissions/replace"), contentvalues) != null)
            {
                com.aviary.android.feather.cds.h.f(context);
            }
        }
        if (list.contains(com.aviary.android.feather.cds.a.c.c.name()))
        {
            list = new Intent("aviary.intent.action.KILL");
            list.setPackage(context.getPackageName());
            context.sendBroadcast(list);
            throw new IllegalStateException("application has been banned!");
        } else
        {
            return;
        }
_L2:
        flag = true;
          goto _L5
        flag = true;
          goto _L6
    }

    private void a(Context context, boolean flag, String s1, String s2)
    {
        a.b("cancelCdsDownloadStartAlarm");
        s1 = b(context, flag, s1, s2);
        ((AlarmManager)context.getSystemService("alarm")).cancel(s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, com.aviary.android.feather.cds.a.a a1, int i1, int j1, String s1)
        throws AssertionError
    {
        aviarycdsservice.a(context, a1, i1, j1, s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, int i1, int j1, String s1)
        throws JSONException, IOException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, i1, j1, s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, k.a a1, String s1, String s2)
        throws JSONException, IOException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, a1, s1, s2);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, m.a a1, int i1, String s1)
        throws IOException, JSONException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, a1, i1, s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, q.a a1, String s1)
        throws JSONException, IOException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, a1, s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, String s1)
        throws JSONException, IOException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, s1);
    }

    static void a(AviaryCdsService aviarycdsservice, Context context, InputStream inputstream, String s1, String s2)
        throws JSONException, IOException, AssertionError
    {
        aviarycdsservice.a(context, inputstream, s1, s2);
    }

    private void a(Throwable throwable)
    {
    }

    private boolean a(long l1, int i1)
    {
        a.c(">> onUpdatePackDisplayOrder: %d, displayOrder: %d", new Object[] {
            Long.valueOf(l1), Integer.valueOf(i1)
        });
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pack_displayOrder", Integer.valueOf(i1));
        return getContentResolver().update(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(l1).append("/update").toString()), contentvalues, null, null) > 0;
    }

    private boolean a(c c1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (c1 == null)
                    {
                        break label0;
                    }
                    if (c1.h())
                    {
                        if (c1.b() == null || c1.b().length() <= 0 || c1.a() == null || c1.a().length() <= 0)
                        {
                            break label1;
                        }
                        a.b("** adding the new versionKey: %s", new Object[] {
                            c1.b()
                        });
                        ContentValues contentvalues = new ContentValues();
                        contentvalues.put("version_versionKey", c1.b());
                        contentvalues.put("version_assetsBaseURL", c1.a());
                        c1 = getContentResolver().insert(com.aviary.android.feather.cds.h.b(getBaseContext(), "manifestVersion/insert"), contentvalues);
                        a.b("updated manifest version: %s", new Object[] {
                            c1
                        });
                        if (c1 == null)
                        {
                            break label2;
                        }
                    }
                    return true;
                }
                return false;
            }
            a.d("versionKey or assetsBaseUrl is null");
            return false;
        }
        return false;
    }

    private PendingIntent b(Context context, boolean flag, String s1, String s2)
    {
        Intent intent = new Intent(context, com/aviary/android/feather/cds/AviaryCdsService);
        intent.setAction("aviary.intent.action.CDS_DOWNLOAD_START");
        intent.putExtra("extra-api-key-secret", s1);
        intent.putExtra("extra-billing-public-key", s2);
        intent.putExtra("wifiOnly", flag);
        return PendingIntent.getService(context, 0, intent, 0x8000000);
    }

    private List b(String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("apiKey", j()));
        arraylist.add(new BasicNameValuePair("formFactor", k()));
        arraylist.add(new BasicNameValuePair("osVersion", String.valueOf(android.os.Build.VERSION.SDK_INT)));
        arraylist.add(new BasicNameValuePair("platform", "android"));
        arraylist.add(new BasicNameValuePair("resolution", l()));
        arraylist.add(new BasicNameValuePair("sdkVersion", "3.4.3"));
        arraylist.add(new BasicNameValuePair("contentGroup", d()));
        if (b())
        {
            arraylist.add(new BasicNameValuePair("country", e()));
        }
        if (a())
        {
            arraylist.add(new BasicNameValuePair("language", c()));
        }
        if (s1 != null)
        {
            arraylist.add(new BasicNameValuePair("versionKey", s1));
        }
        return arraylist;
    }

    private void b(Context context)
    {
        a.b(">> restartCdsInBackground");
        if (TextUtils.isEmpty(n))
        {
            return;
        } else
        {
            long l1 = SystemClock.elapsedRealtime();
            a(context, true, m, n);
            a(context, 0x5265c00L + l1, true, m, n);
            return;
        }
    }

    private void b(Intent intent)
    {
        if (m == null && intent != null)
        {
            m = intent.getStringExtra("extra-api-key-secret");
        }
        if (n == null && intent != null)
        {
            n = intent.getStringExtra("extra-billing-public-key");
        }
        if ((TextUtils.isEmpty(m) || TextUtils.isEmpty(n)) && com.aviary.android.feather.common.utils.f.c(getBaseContext()))
        {
            intent = com.aviary.android.feather.common.utils.i.b(getBaseContext());
            m = intent[1];
            n = intent[2];
        }
    }

    private boolean b(long l1, int i1)
    {
        a.c(">> onChangePackVisibility: %d, visibility: %d", new Object[] {
            Long.valueOf(l1), Integer.valueOf(i1)
        });
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pack_visible", Integer.valueOf(i1));
        return getContentResolver().update(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(l1).append("/update").toString()), contentvalues, null, null) > 0;
    }

    private boolean b(c c1)
    {
        AtomicBoolean atomicboolean;
        AtomicInteger atomicinteger;
        HashMap hashmap;
        Context context;
        String s2;
        a.b(">> onParsePacks");
        context = getBaseContext();
        atomicinteger = new AtomicInteger(0);
        atomicboolean = new AtomicBoolean(false);
        hashmap = new HashMap();
        s2 = c1.a();
        if (!c1.h()) goto _L2; else goto _L1
_L1:
        HashMap hashmap1;
        Iterator iterator;
        hashmap1 = c1.j();
        iterator = hashmap1.keySet().iterator();
_L12:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Iterator iterator1;
        int k1;
        c1 = (String)iterator.next();
        a.b("processing: %s", new Object[] {
            c1
        });
        iterator1 = ((List)hashmap1.get(c1)).iterator();
        k1 = 0;
_L6:
        com.aviary.android.feather.common.threading.ThreadPool.b b1;
        String s3;
        com.aviary.android.feather.cds.a.c.a a1;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            a1 = (com.aviary.android.feather.cds.a.c.a)iterator1.next();
        } while (a1 == null);
        a.c("processing item: %s", new Object[] {
            a1.a()
        });
        c1 = com.aviary.android.feather.cds.h.b(context, a1.a(), new String[] {
            "pack_id", "pack_identifier"
        });
        s3 = c(a1.b());
        b1 = null;
        if (c1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = o();
        c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, k1, s2, s3, atomicinteger) {

            final AtomicBoolean a;
            final int b;
            final String c;
            final String d;
            final AtomicInteger e;
            final AviaryCdsService f;

            public void a(com.aviary.android.feather.common.threading.a a2)
            {
                if (!a2.a()) goto _L2; else goto _L1
_L1:
                com.aviary.android.feather.cds.AviaryCdsService.a.e("future hasException: %s", new Object[] {
                    a2.b()
                });
                a.set(true);
_L3:
                synchronized (e)
                {
                    int l1 = e.decrementAndGet();
                    com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d ", new Object[] {
                        Integer.valueOf(l1)
                    });
                    e.notify();
                }
                return;
_L2:
                a2 = (InputStream)a2.get();
                com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a2, b, 1, c);
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                Object obj;
                obj;
                com.aviary.android.feather.cds.AviaryCdsService.a.e("onParseJsonContent failed: '%s' for packUrl: %s", new Object[] {
                    ((Throwable) (obj)).getMessage(), d
                });
                a.set(true);
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                obj;
                com.aviary.android.feather.common.utils.d.a(a2);
                throw obj;
                exception;
                a2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                f = AviaryCdsService.this;
                a = atomicboolean;
                b = i1;
                c = s1;
                d = s2;
                e = atomicinteger;
                super();
            }
        };
_L8:
        int i1 = k1 + 1;
        k1 = i1;
        if (b1 != null)
        {
            k1 = i1;
            if (c1 != null)
            {
                atomicinteger.incrementAndGet();
                p.a(b1, c1, new String[] {
                    s3
                });
                k1 = i1;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
label0:
        {
            if (c1.c().equals(a1.b()) && c1.e() == k1 && c1.d() == 1)
            {
                break MISSING_BLOCK_LABEL_513;
            }
            a.b("need to update %s ( versionKey, displayOrder or visibility changed )", new Object[] {
                c1.a()
            });
            if (c1.c().equals(a1.b()))
            {
                break label0;
            }
            a.d("%s need to be updated", new Object[] {
                a1.a()
            });
            b1 = o();
            c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, c1, k1, s2, hashmap, atomicinteger) {

                final AtomicBoolean a;
                final m.a b;
                final int c;
                final String d;
                final HashMap e;
                final AtomicInteger f;
                final AviaryCdsService g;

                public void a(com.aviary.android.feather.common.threading.a a2)
                {
                    if (!a2.a()) goto _L2; else goto _L1
_L1:
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("future hasException: %s", new Object[] {
                        a2.b()
                    });
                    a.set(true);
_L3:
                    synchronized (f)
                    {
                        int l1 = f.decrementAndGet();
                        com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                            Integer.valueOf(l1)
                        });
                        f.notify();
                    }
                    return;
_L2:
                    a2 = (InputStream)a2.get();
                    com.aviary.android.feather.cds.AviaryCdsService.a(g, g.getBaseContext(), a2, b, c, d);
                    e.put(b.b(), Boolean.valueOf(true));
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    Object obj;
                    obj;
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("onUpdateJsonContent failed: %s", new Object[] {
                        ((Throwable) (obj)).getMessage()
                    });
                    a.set(true);
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    obj;
                    com.aviary.android.feather.common.utils.d.a(a2);
                    throw obj;
                    exception;
                    a2;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                g = AviaryCdsService.this;
                a = atomicboolean;
                b = a1;
                c = i1;
                d = s1;
                e = hashmap;
                f = atomicinteger;
                super();
            }
            };
        }
        if (true) goto _L8; else goto _L7
_L7:
        boolean flag1 = false;
        boolean flag = flag1;
        if (c1.e() != k1)
        {
            if (a(c1.p(), k1))
            {
                flag = true;
            } else
            {
                a.d("onUpdatePackDisplayOrder failed. %s", new Object[] {
                    c1.a()
                });
                flag = flag1;
            }
        }
        flag1 = flag;
        if (c1.d() != 1)
        {
            if (b(c1.p(), 1))
            {
                flag1 = true;
            } else
            {
                a.d("onSetPackVisible failed. %s", new Object[] {
                    c1.a()
                });
                flag1 = flag;
            }
        }
        if (flag1)
        {
            com.aviary.android.feather.cds.h.g(getBaseContext(), c1.p());
            hashmap.put(c1.b(), Boolean.valueOf(true));
        }
        c1 = null;
          goto _L8
_L2:
        a.c("manifest has no packs");
_L4:
        atomicinteger;
        JVM INSTR monitorenter ;
        a.a("waiting..");
_L9:
        int j1 = atomicinteger.get();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_635;
        }
        atomicinteger.wait();
          goto _L9
        c1;
        c1.printStackTrace();
          goto _L9
        c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        throw c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        if (hashmap.size() > 0)
        {
            String s1;
            for (c1 = hashmap.keySet().iterator(); c1.hasNext(); com.aviary.android.feather.cds.h.d(getBaseContext(), s1))
            {
                s1 = (String)c1.next();
            }

        }
        if (!atomicboolean.get())
        {
            return true;
        }
        return false;
        if (true) goto _L6; else goto _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
    }

    private String c(String s1)
    {
        StringBuffer stringbuffer = new StringBuffer(b);
        stringbuffer.append("/content?");
        stringbuffer.append("versionKey=");
        stringbuffer.append(s1);
        if (a())
        {
            stringbuffer.append("&language=");
            stringbuffer.append(c());
        }
        if (c)
        {
            stringbuffer.append("&staging=2");
        }
        return stringbuffer.toString();
    }

    private void c(Context context)
    {
        a(context, SystemClock.elapsedRealtime() + 1000L);
    }

    private void c(Intent intent)
        throws IOException, JSONException
    {
        Context context;
        a.b(">> onDownloadStart");
        long l1 = System.currentTimeMillis();
        if (com.aviary.android.feather.common.a.a.a)
        {
            intent = new Date(l1);
            Date date = new Date(o);
            a.b("last update date: %s", new Object[] {
                date
            });
            a.b("now date: %s", new Object[] {
                intent
            });
            a.b("now - last update: %d", new Object[] {
                Long.valueOf(l1 - o)
            });
        }
        if (l1 - o < 7000L)
        {
            a.c("wait at least 7secs before start downloading again");
            return;
        }
        context = getBaseContext();
        if (context == null)
        {
            a.d("invalid context");
            return;
        }
        intent = a(context);
        a(context, intent);
        c(context);
        com.aviary.android.feather.common.utils.d.a(intent);
        return;
        Exception exception;
        exception;
        com.aviary.android.feather.common.utils.d.a(intent);
        throw exception;
    }

    private boolean c(c c1)
    {
        a.b(">> onParseMessages");
        if (!c1.g()) goto _L2; else goto _L1
_L1:
        AtomicBoolean atomicboolean;
        AtomicInteger atomicinteger;
        HashMap hashmap;
        HashMap hashmap1;
        Iterator iterator;
        String s1;
        atomicinteger = new AtomicInteger(0);
        atomicboolean = new AtomicBoolean(false);
        hashmap1 = c1.i();
        iterator = hashmap1.keySet().iterator();
        hashmap = new HashMap();
        s1 = c1.a();
_L11:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s2;
        Iterator iterator1;
        s2 = (String)iterator.next();
        a.b("checking: %s", new Object[] {
            s2
        });
        iterator1 = ((List)hashmap1.get(s2)).iterator();
_L6:
        com.aviary.android.feather.cds.a.c.a a1;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            a1 = (com.aviary.android.feather.cds.a.c.a)iterator1.next();
        } while (a1 == null);
        a.b("checking message: %s", new Object[] {
            a1.a()
        });
        c1 = com.aviary.android.feather.cds.h.a(getBaseContext(), a1.a(), new String[] {
            "msg_id", "msg_identifier", "msg_versionKey"
        });
        Object obj = null;
        String s3 = c(a1.b());
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c1.b() == null)
        {
            a.d("message has no versionKey!!!");
            continue; /* Loop/switch isn't completed */
        }
        int i1;
        if (!c1.b().equals(a1.b()))
        {
            a.b("need to update the message: %s", new Object[] {
                c1.c()
            });
            obj = o();
            c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, c1, s2, s1, hashmap, atomicinteger) {

                final AtomicBoolean a;
                final k.a b;
                final String c;
                final String d;
                final HashMap e;
                final AtomicInteger f;
                final AviaryCdsService g;

                public void a(com.aviary.android.feather.common.threading.a a2)
                {
                    if (!a2.a()) goto _L2; else goto _L1
_L1:
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("future hasException: %s", new Object[] {
                        a2.b()
                    });
                    a.set(true);
_L3:
                    synchronized (f)
                    {
                        int j1 = f.decrementAndGet();
                        com.aviary.android.feather.cds.AviaryCdsService.a.b("completed.. remaining tasks %d", new Object[] {
                            Integer.valueOf(j1)
                        });
                        f.notify();
                    }
                    return;
_L2:
                    a2 = (InputStream)a2.get();
                    com.aviary.android.feather.cds.AviaryCdsService.a(g, g.getBaseContext(), a2, b, c, d);
                    e.put(c, Boolean.valueOf(true));
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    Object obj1;
                    obj1;
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("onUpdateMessageContent failed: %s", new Object[] {
                        ((Throwable) (obj1)).getMessage()
                    });
                    a.set(true);
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    obj1;
                    com.aviary.android.feather.common.utils.d.a(a2);
                    throw obj1;
                    exception;
                    a2;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                g = AviaryCdsService.this;
                a = atomicboolean;
                b = a1;
                c = s1;
                d = s2;
                e = hashmap;
                f = atomicinteger;
                super();
            }
            };
        } else
        {
            c1 = null;
        }
_L7:
        if (obj != null && c1 != null)
        {
            atomicinteger.incrementAndGet();
            p.a(((com.aviary.android.feather.common.threading.ThreadPool.b) (obj)), c1, new String[] {
                s3
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
        obj = o();
        c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, s2, s1, hashmap, atomicinteger) {

            final AtomicBoolean a;
            final String b;
            final String c;
            final HashMap d;
            final AtomicInteger e;
            final AviaryCdsService f;

            public void a(com.aviary.android.feather.common.threading.a a2)
            {
                if (!a2.a()) goto _L2; else goto _L1
_L1:
                com.aviary.android.feather.cds.AviaryCdsService.a.e("future hasException: %s", new Object[] {
                    a2.b()
                });
                a.set(true);
_L3:
                synchronized (e)
                {
                    int j1 = e.decrementAndGet();
                    com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                        Integer.valueOf(j1)
                    });
                    e.notify();
                }
                return;
_L2:
                a2 = (InputStream)a2.get();
                com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a2, b, c);
                d.put(b, Boolean.valueOf(true));
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                Object obj1;
                obj1;
                com.aviary.android.feather.cds.AviaryCdsService.a.e("onAddNewMessageContent failed: %s", new Object[] {
                    ((Throwable) (obj1)).getMessage()
                });
                a.set(true);
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                obj1;
                com.aviary.android.feather.common.utils.d.a(a2);
                throw obj1;
                exception;
                a2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                f = AviaryCdsService.this;
                a = atomicboolean;
                b = s1;
                c = s2;
                d = hashmap;
                e = atomicinteger;
                super();
            }
        };
          goto _L7
_L4:
        atomicinteger;
        JVM INSTR monitorenter ;
        a.a("waiting..");
_L8:
        i1 = atomicinteger.get();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        atomicinteger.wait();
          goto _L8
        c1;
        c1.printStackTrace();
          goto _L8
        c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        throw c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        if (hashmap.size() > 0)
        {
            for (c1 = hashmap.keySet().iterator(); c1.hasNext(); com.aviary.android.feather.cds.h.c(getBaseContext(), ((String) (obj))))
            {
                obj = (String)c1.next();
            }

        }
        a.b("finished download messages (hasException: %b)", new Object[] {
            Boolean.valueOf(atomicboolean.get())
        });
        return !atomicboolean.get();
_L2:
        return true;
        if (true) goto _L6; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void d(Context context)
    {
        a.b(">> onClearPermissions");
        ArrayList arraylist = new ArrayList();
        a(context, arraylist, com.aviary.android.feather.common.utils.k.a(arraylist));
    }

    private void d(String s1)
    {
        a.c(">> onRestoreAllUserItems (%s)", new Object[] {
            s1
        });
        s1 = new p(this, com.aviary.android.feather.cds.a.b.a(s1));
        s1.b();
        s1.a();
    }

    private boolean d(c c1)
    {
        a.b(">> onParseSubscriptions");
        if (!c1.f()) goto _L2; else goto _L1
_L1:
        AtomicInteger atomicinteger;
        AtomicBoolean atomicboolean;
        HashMap hashmap;
        Iterator iterator;
        HashMap hashmap1;
        a.a("has available subscriptions");
        atomicinteger = new AtomicInteger(0);
        atomicboolean = new AtomicBoolean(false);
        hashmap = c1.k();
        iterator = hashmap.keySet().iterator();
        hashmap1 = new HashMap();
_L11:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s1;
        Iterator iterator1;
        s1 = (String)iterator.next();
        a.b("checking: %s", new Object[] {
            s1
        });
        iterator1 = ((List)hashmap.get(s1)).iterator();
_L6:
        com.aviary.android.feather.cds.a.c.a a1;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            a1 = (com.aviary.android.feather.cds.a.c.a)iterator1.next();
        } while (a1 == null);
        a.b("checking: %s", new Object[] {
            a1.a()
        });
        com.aviary.android.feather.common.threading.ThreadPool.b b1 = null;
        String s2 = c(a1.b());
        c1 = com.aviary.android.feather.cds.h.c(getBaseContext(), a1.a(), null);
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(c1.b()))
        {
            a.d("subscription has no versionKey!!!");
            continue; /* Loop/switch isn't completed */
        }
        int i1;
        if (!c1.b().equals(a1.b()))
        {
            a.b("need to update the subscription: %s", new Object[] {
                c1.a()
            });
            b1 = o();
            c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, c1, s1, hashmap1, atomicinteger) {

                final AtomicBoolean a;
                final q.a b;
                final String c;
                final HashMap d;
                final AtomicInteger e;
                final AviaryCdsService f;

                public void a(com.aviary.android.feather.common.threading.a a2)
                {
                    if (!a2.a()) goto _L2; else goto _L1
_L1:
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("error: %s", new Object[] {
                        a2.b()
                    });
                    a.set(true);
_L3:
                    synchronized (e)
                    {
                        int j1 = e.decrementAndGet();
                        com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                            Integer.valueOf(j1)
                        });
                        e.notify();
                    }
                    return;
_L2:
                    a2 = (InputStream)a2.get();
                    com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a2, b, c);
                    d.put(c, Boolean.valueOf(true));
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    Object obj;
                    obj;
                    com.aviary.android.feather.cds.AviaryCdsService.a.e("onUpdateSubscriptionContent failed: %s", new Object[] {
                        ((Throwable) (obj)).getMessage()
                    });
                    a.set(true);
                    com.aviary.android.feather.common.utils.d.a(a2);
                      goto _L3
                    obj;
                    com.aviary.android.feather.common.utils.d.a(a2);
                    throw obj;
                    exception;
                    a2;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                f = AviaryCdsService.this;
                a = atomicboolean;
                b = a1;
                c = s1;
                d = hashmap;
                e = atomicinteger;
                super();
            }
            };
        } else
        {
            c1 = null;
        }
_L7:
        if (b1 != null && c1 != null)
        {
            atomicinteger.incrementAndGet();
            p.a(b1, c1, new String[] {
                s2
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
        b1 = o();
        c1 = new com.aviary.android.feather.common.threading.b(atomicboolean, s1, hashmap1, atomicinteger) {

            final AtomicBoolean a;
            final String b;
            final HashMap c;
            final AtomicInteger d;
            final AviaryCdsService e;

            public void a(com.aviary.android.feather.common.threading.a a2)
            {
                if (!a2.a()) goto _L2; else goto _L1
_L1:
                com.aviary.android.feather.cds.AviaryCdsService.a.e("future hasException: %s", new Object[] {
                    a2.b().getMessage()
                });
                a.set(true);
_L3:
                synchronized (d)
                {
                    int j1 = d.decrementAndGet();
                    com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                        Integer.valueOf(j1)
                    });
                    d.notify();
                }
                return;
_L2:
                a2 = (InputStream)a2.get();
                com.aviary.android.feather.cds.AviaryCdsService.a(e, e.getBaseContext(), a2, b);
                c.put(b, Boolean.valueOf(true));
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                Object obj;
                obj;
                com.aviary.android.feather.cds.AviaryCdsService.a.e("onAddNewMessageContent failed: %s", new Object[] {
                    ((Throwable) (obj)).getMessage()
                });
                a.set(true);
                com.aviary.android.feather.common.utils.d.a(a2);
                  goto _L3
                obj;
                com.aviary.android.feather.common.utils.d.a(a2);
                throw obj;
                exception;
                a2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                e = AviaryCdsService.this;
                a = atomicboolean;
                b = s1;
                c = hashmap;
                d = atomicinteger;
                super();
            }
        };
          goto _L7
_L4:
        atomicinteger;
        JVM INSTR monitorenter ;
        a.a("waiting.. ");
_L8:
        i1 = atomicinteger.get();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        atomicinteger.wait();
          goto _L8
        c1;
        c1.printStackTrace();
          goto _L8
        c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        throw c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        a.b("finished download subscriptions (hasException: %b)", new Object[] {
            Boolean.valueOf(atomicboolean.get())
        });
        return !atomicboolean.get();
_L2:
        return true;
        if (true) goto _L6; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void e(Context context)
        throws AssertionError
    {
        context = getContentResolver().getType(com.aviary.android.feather.cds.h.b(context, null));
        if (context == null)
        {
            com.aviary.android.feather.common.a.a.a("'AviaryCdsProvider' not found. Did you forget to include it in your AndroidManifest.xml file?");
        }
        Assert.assertNotNull(context);
    }

    private boolean e(c c1)
    {
label0:
        {
            a.b(">> onRageRemovePacks");
            if (!c1.h() || !c1.e())
            {
                break label0;
            }
            c1 = c1.p().iterator();
            Object obj;
            m.a a1;
            do
            {
                do
                {
                    if (!c1.hasNext())
                    {
                        break label0;
                    }
                    obj = (com.aviary.android.feather.cds.a.c.a)c1.next();
                } while (obj == null);
                a.d("%s need to be hard removed", new Object[] {
                    ((com.aviary.android.feather.cds.a.c.a) (obj)).a()
                });
                a1 = com.aviary.android.feather.cds.h.b(getBaseContext(), ((com.aviary.android.feather.cds.a.c.a) (obj)).a(), null);
            } while (a1 == null);
            int i1 = getContentResolver().delete(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(a1.p()).append("/remove").toString()), null, null);
            if (i1 > 0)
            {
                a.b("removed %s, now remove its contents", new Object[] {
                    ((com.aviary.android.feather.cds.a.c.a) (obj)).a()
                });
                if (i1 > 0)
                {
                    com.aviary.android.feather.cds.h.g(getBaseContext(), a1.p());
                    com.aviary.android.feather.cds.h.d(getBaseContext(), a1.b());
                }
                c1 = com.aviary.android.feather.cds.h.f(((com.aviary.android.feather.cds.a.c.a) (obj)).a());
                obj = new File(getFilesDir(), c1);
                a.b("folder to remove: %s", new Object[] {
                    c1
                });
                boolean flag = com.aviary.android.feather.common.utils.d.e(((File) (obj)));
                a.b("deleted: %b", new Object[] {
                    Boolean.valueOf(flag)
                });
                return true;
            } else
            {
                a.d("failed to remove entry. result = 0");
                return false;
            }
        }
        return true;
    }

    private boolean e(String s1)
    {
        AtomicInteger atomicinteger;
        AtomicBoolean atomicboolean;
        Cursor cursor;
        a.b(">> onRestorePacksIcons");
        atomicinteger = new AtomicInteger(0);
        atomicboolean = new AtomicBoolean(false);
        cursor = getBaseContext().getContentResolver().query(com.aviary.android.feather.cds.h.b(getBaseContext(), "pack/content/list"), null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        a.b("cursor.size: %d", new Object[] {
            Integer.valueOf(cursor.getCount())
        });
_L5:
        if (cursor.moveToNext())
        {
            n.a a1 = com.aviary.android.feather.cds.n.a.a(cursor);
            Object obj = com.aviary.android.feather.cds.m.a.a(cursor);
            ((m.a) (obj)).a(a1);
            if (obj != null && ((m.a) (obj)).f() != null)
            {
                boolean flag;
                if (((m.a) (obj)).f().j() == null || ((m.a) (obj)).f().a() > 0)
                {
                    flag = true;
                } else
                if (!(new File(((m.a) (obj)).f().j())).exists())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a.b("%s need to download icon", new Object[] {
                        ((m.a) (obj)).a()
                    });
                    String s2 = ((m.a) (obj)).f().c();
                    if (!TextUtils.isEmpty(s2) && !s2.startsWith("http://") && !s2.startsWith("https://"))
                    {
                        s2 = (new StringBuilder()).append(s1).append(s2).toString();
                    }
                    a.b("iconUrl: %s", new Object[] {
                        s2
                    });
                    Uri uri = Uri.parse(s2);
                    com.aviary.android.feather.common.threading.ThreadPool.b b1 = o();
                    obj = new com.aviary.android.feather.common.threading.b(atomicboolean, ((m.a) (obj)), uri, atomicinteger) {

                        final AtomicBoolean a;
                        final m.a b;
                        final Uri c;
                        final AtomicInteger d;
                        final AviaryCdsService e;

                        public void a(com.aviary.android.feather.common.threading.a a2)
                        {
                            if (!a2.a()) goto _L2; else goto _L1
_L1:
                            com.aviary.android.feather.cds.AviaryCdsService.a.e("error: %s", new Object[] {
                                a2.b()
                            });
                            a.set(true);
_L5:
                            synchronized (d)
                            {
                                int j1 = d.decrementAndGet();
                                com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                                    Integer.valueOf(j1)
                                });
                                d.notify();
                            }
                            return;
_L2:
                            obj1 = (InputStream)a2.get();
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            File file = new File((new StringBuilder()).append(e.getBaseContext().getFilesDir()).append("/").append(com.aviary.android.feather.cds.h.c(b.a())).toString());
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            int k1 = com.aviary.android.feather.cds.AviaryCdsService.a(e, b.f().p(), b.p(), file, c.getLastPathSegment(), ((InputStream) (obj1)));
                            if (k1 <= 0) goto _L4; else goto _L3
_L3:
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            com.aviary.android.feather.cds.h.g(e.getBaseContext(), b.p());
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            com.aviary.android.feather.cds.h.d(e.getBaseContext(), b.b());
_L6:
                            com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj1)));
                              goto _L5
_L4:
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            com.aviary.android.feather.cds.AviaryCdsService.a.e("onUpdatedPackIcon result: %d", new Object[] {
                                Integer.valueOf(k1)
                            });
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            a.set(true);
                              goto _L6
                            Throwable throwable;
                            throwable;
_L9:
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            com.aviary.android.feather.cds.AviaryCdsService.a.d("failed to update icon");
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            throwable.printStackTrace();
                            a2 = ((com.aviary.android.feather.common.threading.a) (obj1));
                            a.set(true);
                            com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj1)));
                              goto _L5
                            obj1;
                            a2 = null;
_L8:
                            com.aviary.android.feather.common.utils.d.a(a2);
                            throw obj1;
                            Exception exception;
                            exception;
                            a2;
                            JVM INSTR monitorexit ;
                            throw exception;
                            exception;
                            if (true) goto _L8; else goto _L7
_L7:
                            throwable;
                            exception = null;
                              goto _L9
                        }

            
            {
                e = AviaryCdsService.this;
                a = atomicboolean;
                b = a1;
                c = uri;
                d = atomicinteger;
                super();
            }
                    };
                    atomicinteger.incrementAndGet();
                    p.a(b1, ((com.aviary.android.feather.common.threading.b) (obj)), new String[] {
                        s2
                    });
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        com.aviary.android.feather.common.utils.d.a(cursor);
_L2:
        atomicinteger;
        JVM INSTR monitorenter ;
        a.a("waiting..");
_L3:
        int i1 = atomicinteger.get();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        atomicinteger.wait();
          goto _L3
        s1;
        s1.printStackTrace();
          goto _L3
        s1;
        atomicinteger;
        JVM INSTR monitorexit ;
        throw s1;
        atomicinteger;
        JVM INSTR monitorexit ;
        if (!atomicboolean.get())
        {
            return true;
        }
        return false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void f(c c1)
    {
        a.b(">> onRemoveUnavailableMessages");
        if (!c1.h()) goto _L2; else goto _L1
_L1:
        Cursor cursor = getContentResolver().query(com.aviary.android.feather.cds.h.b(getBaseContext(), "message/list"), null, null, null, null);
        if (cursor == null) goto _L2; else goto _L3
_L3:
        if (!cursor.moveToNext()) goto _L5; else goto _L4
_L4:
        k.a a1 = com.aviary.android.feather.cds.k.a.a(cursor);
        if (a1 == null) goto _L3; else goto _L6
_L6:
        if (c1.c(a1.c())) goto _L3; else goto _L7
_L7:
        Cursor cursor1;
        a.d("%s need to be removed", new Object[] {
            a1.c()
        });
        cursor1 = getContentResolver().query(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("message/id/").append(a1.p()).append("/content").toString()), new String[] {
            "msgcnt_id", "msgcnt_messageId", "msgcnt_contentPath"
        }, null, null, null);
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        if (!cursor1.moveToFirst()) goto _L9; else goto _L8
_L8:
        String s1 = com.aviary.android.feather.cds.l.a.a(cursor1).b();
_L10:
        com.aviary.android.feather.common.utils.d.a(cursor1);
_L11:
        int i1;
        i1 = getContentResolver().delete(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("message/id/").append(a1.p()).append("/remove").toString()), null, null);
        a.b("contentPath: %s", new Object[] {
            s1
        });
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        a.b("trying to delete.. %s", new Object[] {
            s1
        });
        boolean flag = com.aviary.android.feather.common.utils.d.e(new File(s1));
        a.b("deleted content path: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        com.aviary.android.feather.cds.h.c(getBaseContext(), a1.a());
          goto _L3
        c1;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw c1;
        c1;
        com.aviary.android.feather.common.utils.d.a(cursor1);
        throw c1;
        a.d("failed to remove message entry. result = 0");
          goto _L3
_L5:
        com.aviary.android.feather.common.utils.d.a(cursor);
_L2:
        return;
_L9:
        s1 = null;
          goto _L10
        s1 = null;
          goto _L11
    }

    private void f(String s1)
    {
        s1 = getBaseContext();
        AlarmManager alarmmanager = (AlarmManager)getBaseContext().getSystemService("alarm");
        Intent intent = new Intent(s1, com/aviary/android/feather/cds/AviaryCdsService);
        intent.setAction("aviary.intent.action.CDS_DOWNLOAD_START");
        alarmmanager.cancel(PendingIntent.getBroadcast(s1, 0, intent, 0x8000000));
        alarmmanager.cancel(PendingIntent.getBroadcast(s1, 0, new Intent(s1, com/aviary/android/feather/cds/AviaryCdsReceiver), 0x8000000));
    }

    private boolean g(c c1)
    {
        Cursor cursor;
        a.b(">> onHideUnavailablePacks");
        if (!c1.h() || !c1.d())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        cursor = com.aviary.android.feather.cds.h.a(getBaseContext(), new String[] {
            "pack_id", "pack_identifier", "pack_type"
        }, "pack_visible=1", null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
_L2:
        m.a a1;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = com.aviary.android.feather.cds.m.a.a(cursor);
        if (a1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c1.b(a1.a()))
        {
            continue; /* Loop/switch isn't completed */
        }
        a.d("%s need to be hidden", new Object[] {
            a1.a()
        });
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pack_visible", Integer.valueOf(0));
        if (getContentResolver().update(com.aviary.android.feather.cds.h.b(getBaseContext(), (new StringBuilder()).append("pack/id/").append(a1.p()).append("/update").toString()), contentvalues, null, null) > 0)
        {
            com.aviary.android.feather.cds.h.g(getBaseContext(), a1.p());
            com.aviary.android.feather.cds.h.d(getBaseContext(), a1.b());
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_215;
        c1;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw c1;
        a.d("failed to update entry. result = 0");
        if (true) goto _L2; else goto _L1
_L1:
        com.aviary.android.feather.common.utils.d.a(cursor);
        return true;
    }

    private String i()
    {
        return (new StringBuilder()).append(b).append("/manifest?").toString();
    }

    private String j()
    {
        if (e == null)
        {
            e = com.aviary.android.feather.common.utils.i.a(getBaseContext());
        }
        return e;
    }

    private String k()
    {
        if (f == null)
        {
            String s1;
            if (com.aviary.android.feather.common.utils.j.b(getBaseContext()))
            {
                s1 = "tablet";
            } else
            {
                s1 = "phone";
            }
            f = s1;
        }
        return f;
    }

    private String l()
    {
        if (g == null)
        {
            g = com.aviary.android.feather.cds.h.c(getBaseContext());
        }
        return g;
    }

    private void m()
    {
    }

    private void n()
    {
        a.b(">> onVerifySubscriptions");
        if (!com.aviary.android.feather.common.utils.f.c(getBaseContext()))
        {
            a.c("skipping subscription verification...");
            return;
        }
        if (q == null)
        {
            a.c("mIapWrapper is null");
            return;
        }
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
        Object obj2 = t;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s.wait(2000L);
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (!q.b_())
        {
            a.c("verify subscription: mIapWrapper is not setup");
            return;
        }
        break MISSING_BLOCK_LABEL_115;
        Object obj3;
        obj3;
        ((InterruptedException) (obj3)).printStackTrace();
          goto _L1
        obj3;
        obj;
        JVM INSTR monitorexit ;
        throw obj3;
        HashSet hashset;
        Object obj4;
        if (t == null || !t.c())
        {
            a.c("verify subscription: mIabResult is null, or it was not successful");
            return;
        }
        obj4 = getBaseContext().getContentResolver().query(com.aviary.android.feather.cds.h.b(getBaseContext(), "subscription/list"), null, null, null, null);
        if (obj4 == null)
        {
            a.c("subscriptionsCursor is null");
            return;
        }
        a.b("subscriptionsCursor size: %d", new Object[] {
            Integer.valueOf(((Cursor) (obj4)).getCount())
        });
        hashset = new HashSet();
_L3:
        String s1;
        if (!((Cursor) (obj4)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = com.aviary.android.feather.cds.q.a.a(((Cursor) (obj4))).a();
        if (!q.b(s1))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        a.b("has subscription: %s", new Object[] {
            s1
        });
        obj3 = com.aviary.android.feather.cds.h.d(getBaseContext(), s1, null);
        obj = obj3;
        if (((r.a) (obj3)).a() != 1)
        {
            com.aviary.android.feather.cds.h.c(getBaseContext(), s1, 1);
            obj = com.aviary.android.feather.cds.h.d(getBaseContext(), s1, null);
        }
        hashset.add(((r.a) (obj)).b());
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        ((com.aviary.android.feather.cds.billing.util.c) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj4)));
        throw obj1;
        a.b("has no subscription: %s", new Object[] {
            s1
        });
        if (com.aviary.android.feather.cds.h.d(getBaseContext(), s1, null).a() != 0)
        {
            com.aviary.android.feather.cds.h.c(getBaseContext(), s1, 0);
        }
        if (true) goto _L3; else goto _L2
_L2:
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj4)));
        a.b("unlocked types: %s", new Object[] {
            hashset
        });
        obj1 = getBaseContext().getContentResolver().query(com.aviary.android.feather.cds.h.b(getBaseContext(), "pack/content/installed/list"), new String[] {
            "pack_id", "pack_identifier", "pack_type", "content_displayName", "content_id", "content_packId", "content_isFree"
        }, null, null, null);
        if (obj1 == null)
        {
            a.c("cursor is null");
            return;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_708;
        }
        if (hashset.contains("all"))
        {
            break MISSING_BLOCK_LABEL_708;
        }
_L5:
        if (!((Cursor) (obj1)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_708;
        }
        obj4 = com.aviary.android.feather.cds.n.a.a(((Cursor) (obj1)));
        obj3 = com.aviary.android.feather.cds.m.a.a(((Cursor) (obj1)));
        ((m.a) (obj3)).a(((n.a) (obj4)));
        a.b("checking: %s", new Object[] {
            ((m.a) (obj3)).a()
        });
        if (((m.a) (obj3)).f().n() == 1 || hashset.contains(((m.a) (obj3)).b()) || q.a(((m.a) (obj3)).a())) goto _L5; else goto _L4
_L4:
        obj4 = com.aviary.android.feather.cds.h.a(((m.a) (obj3)).a());
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_671;
        }
        if (com.aviary.android.feather.common.utils.f.a(getBaseContext(), ((String) (obj4)), 0) == null)
        {
            break MISSING_BLOCK_LABEL_671;
        }
        a.b("ok, you own the legacy apk: %s", new Object[] {
            obj4
        });
          goto _L5
        obj3;
        ((com.aviary.android.feather.cds.billing.util.c) (obj3)).printStackTrace();
          goto _L5
        obj3;
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj1)));
        throw obj3;
        a.d("uninstalling: %s", new Object[] {
            ((m.a) (obj3)).a()
        });
        com.aviary.android.feather.cds.h.e(getBaseContext(), ((m.a) (obj3)).p());
          goto _L5
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj1)));
        com.aviary.android.feather.cds.h.g(getBaseContext());
        return;
    }

    private com.aviary.android.feather.common.threading.ThreadPool.b o()
    {
        return new com.aviary.android.feather.common.threading.ThreadPool.b() {

            final AviaryCdsService a;

            public transient InputStream a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, String as[])
                throws Exception
            {
                return com.aviary.android.feather.common.utils.d.a(as[0], null);
            }

            public volatile Object a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Object aobj[])
                throws Exception
            {
                return a(worker, (String[])aobj);
            }

            
            {
                a = AviaryCdsService.this;
                super();
            }
        };
    }

    InputStream a(Context context)
        throws IOException
    {
        String s1 = i();
        context = com.aviary.android.feather.cds.h.b(context);
        if (context != null && context.a() != null)
        {
            a.b("current versionKey: %s", new Object[] {
                context.a()
            });
            context = b(context.a());
        } else
        {
            context = b(((String) (null)));
        }
        com.aviary.android.feather.cds.h.a(context, m);
        if (c)
        {
            context.add(new BasicNameValuePair("staging", "2"));
        }
        return com.aviary.android.feather.common.utils.d.a(s1, context);
    }

    List a(c c1, String s1)
        throws a
    {
        List list1;
        a.b(">> onRestoreOwnedPacks");
        list1 = Collections.synchronizedList(new ArrayList());
        if (q != null) goto _L2; else goto _L1
_L1:
        return list1;
_L2:
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
        com.aviary.android.feather.cds.billing.util.e e1 = t;
        if (e1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        s.wait(2000L);
        obj;
        JVM INSTR monitorexit ;
        if (t == null)
        {
            throw new a(1, "in-app service returned null");
        }
        break MISSING_BLOCK_LABEL_104;
        c1;
        c1.printStackTrace();
        throw new a(1, "in-app service timeout error");
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        if (!t.c())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        List list;
        try
        {
            list = q.d().a();
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            c1.printStackTrace();
            throw new a(1, c1);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        com.aviary.android.feather.cds.h.b(list, s1);
        a.b("owned items: %d", new Object[] {
            Integer.valueOf(list.size())
        });
        if (list.size() <= 0) goto _L1; else goto _L3
_L3:
        list1.addAll(a(c1, list.iterator()));
        return list1;
        a.e("iabresult: %s", new Object[] {
            t
        });
        throw new a(1, "in-app service failed");
    }

    List a(c c1, Iterator iterator)
    {
        AtomicInteger atomicinteger;
        List list;
        String s1;
        Object obj;
        a.b(">> onRestoreMissingPacks");
        Object obj2 = getBaseContext();
        atomicinteger = new AtomicInteger(0);
        list = Collections.synchronizedList(new ArrayList());
        s1 = c1.a();
        Object obj1 = new StringBuilder();
        obj = new ArrayList();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = (String)iterator.next();
            ((ArrayList) (obj)).add(s3);
            ((StringBuilder) (obj1)).append("'").append(s3).append("'");
            if (iterator.hasNext())
            {
                ((StringBuilder) (obj1)).append(",");
            }
        } while (true);
        a.b("legacy packs size: %d", new Object[] {
            Integer.valueOf(((ArrayList) (obj)).size())
        });
        iterator = ((Context) (obj2)).getContentResolver();
        obj2 = com.aviary.android.feather.cds.h.b(((Context) (obj2)), "pack/content/list");
        obj1 = (new StringBuilder()).append("pack_identifier IN (").append(((StringBuilder) (obj1)).toString()).append(")").toString();
        iterator = iterator.query(((Uri) (obj2)), new String[] {
            "pack_identifier"
        }, ((String) (obj1)), null, null);
        if (iterator == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        a.b("cursor size: %d", new Object[] {
            Integer.valueOf(iterator.getCount())
        });
        String s2;
        for (; iterator.moveToNext(); ((ArrayList) (obj)).remove(s2))
        {
            s2 = iterator.getString(0);
            a.b("remove '%s' from the legacy array", new Object[] {
                s2
            });
        }

        break MISSING_BLOCK_LABEL_313;
        c1;
        com.aviary.android.feather.common.utils.d.a(iterator);
        throw c1;
        com.aviary.android.feather.common.utils.d.a(iterator);
        com.aviary.android.feather.common.threading.ThreadPool.b b1;
        Object obj3;
        for (iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); p.a(b1, ((com.aviary.android.feather.common.threading.b) (obj3)), new String[] {
    obj
}))
        {
            obj3 = (String)iterator.next();
            a.b("download content for: %s", new Object[] {
                obj3
            });
            obj = a(((String) (obj3)), c1.c());
            b1 = o();
            obj3 = new com.aviary.android.feather.common.threading.b(list, ((String) (obj3)), s1, ((String) (obj)), atomicinteger) {

                final List a;
                final String b;
                final String c;
                final String d;
                final AtomicInteger e;
                final AviaryCdsService f;

                public void a(com.aviary.android.feather.common.threading.a a1)
                {
                    if (!a1.a()) goto _L2; else goto _L1
_L1:
                    a.add(new a(4, a1.b()));
_L3:
                    synchronized (e)
                    {
                        int j1 = e.decrementAndGet();
                        com.aviary.android.feather.cds.AviaryCdsService.a.b("completed. remaining tasks: %d", new Object[] {
                            Integer.valueOf(j1)
                        });
                        e.notify();
                    }
                    return;
_L2:
                    a1 = (InputStream)a1.get();
                    com.aviary.android.feather.cds.a.a a2;
                    a2 = new com.aviary.android.feather.cds.a.a();
                    if (a2.a(a1) == 0)
                    {
                        break MISSING_BLOCK_LABEL_159;
                    }
                    a.add(new a(3, (new StringBuilder()).append(b).append(": ").append(a2.o()).toString()));
_L4:
                    com.aviary.android.feather.common.utils.d.a(a1);
                      goto _L3
                    com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a2, 10000, 0, c);
                    com.aviary.android.feather.cds.AviaryCdsService.a.b("restored: %s", new Object[] {
                        b
                    });
                      goto _L4
                    Object obj4;
                    obj4;
                    com.aviary.android.feather.cds.AviaryCdsService.a.d((new StringBuilder()).append("onAddNewJsonContent failed on '%s'").append(d).toString());
                    ((Throwable) (obj4)).printStackTrace();
                    a.add(new a(5, ((Throwable) (obj4))));
                    com.aviary.android.feather.common.utils.d.a(a1);
                      goto _L3
                    obj4;
                    com.aviary.android.feather.common.utils.d.a(a1);
                    throw obj4;
                    exception;
                    a1;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                f = AviaryCdsService.this;
                a = list;
                b = s1;
                c = s2;
                d = s3;
                e = atomicinteger;
                super();
            }
            };
            atomicinteger.incrementAndGet();
        }

        atomicinteger;
        JVM INSTR monitorenter ;
        a.a("waiting..");
_L1:
        int i1 = atomicinteger.get();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        atomicinteger.wait();
          goto _L1
        c1;
        c1.printStackTrace();
          goto _L1
        c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        throw c1;
        atomicinteger;
        JVM INSTR monitorexit ;
        return list;
    }

    protected void a(Intent intent)
    {
        boolean flag1;
        String s1 = intent.getAction();
        if (b == null)
        {
            flag1 = com.aviary.android.feather.common.utils.i.d(getBaseContext());
            a.d("cds_debug: %b", new Object[] {
                Boolean.valueOf(flag1)
            });
            if (flag1)
            {
                b = "http://cd-lb.aviary.com/v1";
                c = true;
            } else
            {
                b = "http://cd.aviary.com/v1";
                c = false;
            }
            Log.d("AviaryCdsService", (new StringBuilder()).append("debug: ").append(c).toString());
            Log.d("AviaryCdsService", (new StringBuilder()).append("root: ").append(b).toString());
            a.c("SDK_BUILD_TYPE: %s", new Object[] {
                "release"
            });
            a.c("SDK_FLAVOR: %s", new Object[] {
                "production"
            });
            a.c("SDK_PACKAGE_NAME: %s", new Object[] {
                "com.aviary.android.feather.sdk"
            });
            a.c("SDK_DEBUG: %b", new Object[] {
                Boolean.valueOf(false)
            });
            a.c("SDK_VERSION_NAME: %s", new Object[] {
                "3.4.3"
            });
        }
        a.c("handleIntent: %s", new Object[] {
            s1
        });
        f(s1);
        b(intent);
        e(this);
        Object obj;
        boolean flag;
        if (intent != null)
        {
            flag1 = intent.getBooleanExtra("wifiOnly", false);
        } else
        {
            flag1 = false;
        }
        a.b("wifiOnly: %b", new Object[] {
            Boolean.valueOf(flag1)
        });
        if (TextUtils.isEmpty(m))
        {
            com.aviary.android.feather.common.a.a.a("API-SECRET not found. Did you forget to pass the AviaryIntent.EXTRA_API_KEY_SECRET ?");
            d(this);
            throw new IllegalStateException("Missing required api key secret");
        }
        if (TextUtils.isEmpty(n))
        {
            a.c("billing public key not found. Did you forget to pass the AviaryIntent.EXTRA_BILLING_PUBLIC_KEY ?");
        }
        if (!TextUtils.isEmpty(n))
        {
            t = null;
            q = com.aviary.android.feather.cds.j.a(this, n);
            q.a(this);
        } else
        {
            a.c("skip billing");
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (com.aviary.android.feather.common.utils.b.a(getBaseContext())) goto _L3; else goto _L2
_L3:
        if (!"aviary.intent.action.CDS_DOWNLOAD_START".equals(s1)) goto _L5; else goto _L4
_L4:
        c(intent);
_L6:
        flag = false;
_L7:
        if (flag)
        {
            a.d("exception handled, let's try again");
            h();
            intent = new Intent(intent);
            if (d > 0)
            {
                a(getBaseContext(), System.currentTimeMillis() + 15000L, intent);
                d--;
                a.d("adding alarm, try again: %d", new Object[] {
                    Integer.valueOf(d)
                });
                flag1 = false;
            } else
            {
                a.d("try again reset, no more tries: %d", new Object[] {
                    Integer.valueOf(d)
                });
                d = 3;
                flag1 = true;
            }
            a.d("try again: %d", new Object[] {
                Integer.valueOf(d)
            });
        } else
        {
            flag1 = true;
        }
        a.b("postpone cds in background: %b", new Object[] {
            Boolean.valueOf(flag1)
        });
        if (flag1 && "aviary.intent.action.CDS_DOWNLOAD_START".equals(s1))
        {
            b(getBaseContext());
        }
        return;
_L5:
        if (!"aviary.intent.action.CDS_RESTORE_USER_ITEMS".equals(s1))
        {
            break MISSING_BLOCK_LABEL_630;
        }
        d(intent.getStringExtra("type"));
          goto _L6
        obj;
        a(((Throwable) (obj)));
        flag = true;
          goto _L7
        if (!"aviary.intent.action.CDS_VERIFY_SUBSCRIPTIONS".equals(s1)) goto _L9; else goto _L8
_L8:
        n();
          goto _L6
        obj;
        a(((Throwable) (obj)));
        flag = true;
          goto _L7
_L9:
        if (!"aviary.intent.action.CDS_RESTORE_OWNED_PACKS".equals(s1)) goto _L6; else goto _L10
_L10:
        a(intent.getStringExtra("type"));
          goto _L6
        obj;
        a(((Throwable) (obj)));
        a.d("exception not handled");
        flag = false;
          goto _L7
        obj;
        a(((Throwable) (obj)));
        a.d("exception not handled");
        flag = false;
          goto _L7
        obj;
        a(((Throwable) (obj)));
        a.d("exception not handled");
        flag = false;
          goto _L7
_L2:
        if (flag1) goto _L6; else goto _L3
    }

    public void a(com.aviary.android.feather.cds.billing.util.e e1)
    {
        a.c("onIabSetupFinished: %s", new Object[] {
            e1
        });
        synchronized (s)
        {
            t = e1;
            s.notifyAll();
        }
        return;
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
    }

    void a(String s1)
        throws a
    {
        int i1 = 0;
        a.c(">> onRestoreOwnedPacks: %s", new Object[] {
            s1
        });
        try
        {
            c c1 = f();
            a(c1, s1);
            e(c1.a());
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
            i1 = 1;
        }
        com.aviary.android.feather.cds.h.a(getBaseContext(), s1, i1);
    }

    public boolean a()
    {
        return !"".equals(c());
    }

    boolean a(Context context, String s1, boolean flag, m.a a1)
        throws IOException, AssertionError
    {
        Object obj1;
        File file;
        Object obj = null;
        Assert.assertNotNull(a1);
        Assert.assertNotNull(a1.f());
        a.c("downloadPackIcon: %s", new Object[] {
            a1.a()
        });
        obj1 = a1.f().c();
        context = ((Context) (obj1));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            context = ((Context) (obj1));
            if (!((String) (obj1)).startsWith("http://"))
            {
                context = ((Context) (obj1));
                if (!((String) (obj1)).startsWith("https://"))
                {
                    context = (new StringBuilder()).append(s1).append(((String) (obj1))).toString();
                }
            }
        }
        s1 = a1.f().j();
        a.b("iconUrl: %s", new Object[] {
            context
        });
        a.b("iconPath: %s", new Object[] {
            s1
        });
        if (s1 != null && !flag && (new File(s1)).exists())
        {
            return true;
        }
        obj1 = Uri.parse(context);
        file = new File((new StringBuilder()).append(getBaseContext().getFilesDir()).append("/").append(com.aviary.android.feather.cds.h.c(a1.a())).toString());
        s1 = obj;
        context = com.aviary.android.feather.common.utils.d.a(context, null);
        s1 = context;
        int i1 = a(a1.f().p(), a1.p(), file, ((Uri) (obj1)).getLastPathSegment(), ((InputStream) (context)));
        s1 = context;
        a.b("result: %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.aviary.android.feather.common.utils.d.a(context);
        return flag;
        context;
        com.aviary.android.feather.common.utils.d.a(s1);
        throw context;
    }

    public boolean b()
    {
        return !"".equals(e());
    }

    public String c()
    {
        if (i == null)
        {
            String s2 = h.getLanguage();
            String s1 = s2;
            if (!com.aviary.android.feather.cds.h.c.contains(s2))
            {
                s1 = "";
            }
            i = s1;
        }
        return i;
    }

    public String d()
    {
        if (k == null)
        {
            if (l != null)
            {
                long l1 = l.getLong("content-group-update-time", 0L);
                k = l.getString("content-group-name", "A");
                if (System.currentTimeMillis() - l1 > 0x5265c00L)
                {
                    a.a("need to update contentgroup!");
                    int i1 = (int)(Math.random() * 10D);
                    a.b("content group rand: %d", new Object[] {
                        Integer.valueOf(i1)
                    });
                    k = new String(new char[] {
                        (char)(i1 + 65)
                    });
                    android.content.SharedPreferences.Editor editor = l.edit();
                    editor.putLong("content-group-update-time", System.currentTimeMillis());
                    editor.putString("content-group-name", k);
                    editor.commit();
                } else
                {
                    a.b("using old content group: %s", new Object[] {
                        k
                    });
                }
            } else
            {
                k = "A";
            }
        }
        if (k == null || !k.matches("[A-J]"))
        {
            a.c("content group doesn't match the regex");
            k = "A";
        }
        a.a("contentGroup: %s", new Object[] {
            k
        });
        return k;
    }

    public String e()
    {
        if (j == null)
        {
            String s2 = h.getCountry();
            String s1 = s2;
            if (!com.aviary.android.feather.cds.h.d.contains(s2))
            {
                s1 = "";
            }
            j = s1;
        }
        return j;
    }

    c f()
        throws a
    {
        Object obj;
        Object obj1;
        a.b(">> downloadAndParseManifest");
        int i1;
        try
        {
            obj = a(getBaseContext());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            throw new a(4, ((Throwable) (obj)));
        }
        obj1 = new c();
        i1 = ((c) (obj1)).a(((InputStream) (obj)));
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
        if (i1 != 0)
        {
            throw new a(3, ((c) (obj1)).o());
        } else
        {
            return ((c) (obj1));
        }
        obj1;
        ((Exception) (obj1)).printStackTrace();
        throw new a(3, ((Throwable) (obj1)));
        obj1;
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
        throw obj1;
    }

    com.aviary.android.feather.cds.j g()
    {
        return q;
    }

    public void onCreate()
    {
        a.b("onCreate");
        a.c("** StrictMode OFF **");
        l = getBaseContext().getSharedPreferences("aviary-cds-service", 0);
        super.onCreate();
    }

    public void onDestroy()
    {
        a.b("onDestroy");
        if (q != null)
        {
            q.e();
            q = null;
        }
        super.onDestroy();
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("AviaryCdsService", com.aviary.android.feather.common.a.a.d.a);
    }
}
