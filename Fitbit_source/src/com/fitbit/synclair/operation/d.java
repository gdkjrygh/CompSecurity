// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.util.Pair;
import com.fitbit.data.bl.StaticAPILogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.synclair.config.SynclairConfigType;
import com.fitbit.synclair.config.a;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.config.bean.DeviceScreenBean;
import com.fitbit.synclair.config.bean.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public abstract class d extends BaseSynclairOperation
{

    private String a;
    private String e;

    public d()
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.b);
    }

    private static int a(String s1, List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (((String)list.get(i)).equals(s1))
            {
                return i;
            }
        }

        return -1;
    }

    private boolean a(DeviceBaseConfigBean devicebaseconfigbean)
    {
label0:
        {
            Object obj1 = a(devicebaseconfigbean, true);
            if (obj1 == null || ((List) (obj1)).isEmpty())
            {
                break label0;
            }
            Object obj = new ArrayList();
            devicebaseconfigbean = new ArrayList();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Pair pair = (Pair)((Iterator) (obj1)).next();
                if (pair.first != null && pair.second != null)
                {
                    String s1 = ((com.fitbit.synclair.config.bean.d)pair.first).a();
                    if (s1 != null)
                    {
                        if (((Boolean)pair.second).booleanValue())
                        {
                            int i = a(s1, ((List) (devicebaseconfigbean)));
                            if (i >= 0)
                            {
                                devicebaseconfigbean.remove(i);
                            }
                            if (a(s1, ((List) (obj))) < 0)
                            {
                                ((List) (obj)).add(s1);
                            }
                        } else
                        if (a(s1, ((List) (obj))) < 0 && a(s1, ((List) (devicebaseconfigbean))) < 0)
                        {
                            devicebaseconfigbean.add(s1);
                        }
                    }
                }
            } while (true);
            obj1 = com.fitbit.synclair.config.bean.e.a();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                if (!((e) (obj1)).a((String)((Iterator) (obj)).next(), e, true))
                {
                    ((e) (obj1)).a(true);
                    return false;
                }
            }

            devicebaseconfigbean = devicebaseconfigbean.iterator();
            do
            {
                if (!devicebaseconfigbean.hasNext())
                {
                    break label0;
                }
            } while (((e) (obj1)).a((String)devicebaseconfigbean.next(), e, false));
            ((e) (obj1)).a(true);
            return false;
        }
        return true;
    }

    static boolean a(d d1, DeviceBaseConfigBean devicebaseconfigbean)
    {
        return d1.a(devicebaseconfigbean);
    }

    protected abstract a a(JSONObject jsonobject);

    protected List a(DeviceBaseConfigBean devicebaseconfigbean, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (devicebaseconfigbean != null)
        {
            com.fitbit.synclair.config.bean.d d1 = devicebaseconfigbean.a();
            if (d1 != null)
            {
                arraylist.add(new Pair(d1, Boolean.valueOf(true)));
            }
            com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType asynclairscreentype[] = com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.values();
            int k = asynclairscreentype.length;
label0:
            for (int i = 0; i < k; i++)
            {
                com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType synclairscreentype = asynclairscreentype[i];
                List list1 = devicebaseconfigbean.b(synclairscreentype);
                if (list1 == null || list1.isEmpty())
                {
                    continue;
                }
                int j = 0;
                do
                {
                    if (j >= list1.size())
                    {
                        continue label0;
                    }
                    Object obj = (DeviceScreenBean)list1.get(j);
                    com.fitbit.synclair.config.bean.d d2;
                    boolean flag1;
                    if (synclairscreentype == com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a && j == 0 && flag)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    d2 = ((DeviceScreenBean) (obj)).d();
                    if (d2 != null)
                    {
                        arraylist.add(new Pair(d2, Boolean.valueOf(flag1)));
                    }
                    obj = ((DeviceScreenBean) (obj)).f();
                    if (obj != null)
                    {
                        arraylist.add(new Pair(obj, Boolean.valueOf(flag1)));
                    }
                    j++;
                } while (true);
            }

            devicebaseconfigbean = devicebaseconfigbean.b().iterator();
            do
            {
                if (!devicebaseconfigbean.hasNext())
                {
                    break;
                }
                List list = a((DeviceBaseConfigBean)devicebaseconfigbean.next(), false);
                if (list != null && !list.isEmpty())
                {
                    arraylist.addAll(list);
                }
            } while (true);
        }
        return arraylist;
    }

    protected void a(TrackerType trackertype, SynclairConfigType synclairconfigtype)
    {
        this;
        JVM INSTR monitorenter ;
        if (trackertype == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        b(synclairconfigtype.a(trackertype));
        c(trackertype.c());
        this;
        JVM INSTR monitorexit ;
        return;
        trackertype;
        throw trackertype;
    }

    protected void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    protected void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        e = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    protected byte[] d(String s1)
        throws ServerCommunicationException
    {
        return StaticAPILogic.a().c(s1, s());
    }

    protected void l()
    {
        com.fitbit.synclair.config.bean.e.a().a(false);
        super.l();
    }

    protected void o()
    {
        a(new _cls1());
    }

    protected abstract JSONObject q()
        throws ServerCommunicationException, JSONException;

    protected String r()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = a;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    protected String s()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = e;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    protected Map t()
    {
        String s1 = s();
        if (s1 != null)
        {
            return Collections.singletonMap("Authorization", s1);
        } else
        {
            return null;
        }
    }

    /* member class not found */
    class _cls1 {}

}
