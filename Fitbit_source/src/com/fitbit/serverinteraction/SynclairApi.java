// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.FirmwareImage;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.serverinteraction.validators.f;
import com.fitbit.util.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction:
//            ServerGateway, o, RequestParametersBuilder, j, 
//            k

public class SynclairApi
{
    static abstract class DumpFormat extends Enum
    {

        public static final DumpFormat a;
        public static final DumpFormat b;
        private static final DumpFormat c[];
        final String name;

        public static DumpFormat valueOf(String s)
        {
            return (DumpFormat)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$DumpFormat, s);
        }

        public static DumpFormat[] values()
        {
            return (DumpFormat[])c.clone();
        }

        abstract byte[] a(byte abyte0[]);

        abstract byte[] b(byte abyte0[]);

        static 
        {
        /* block-local class not found */
        class _cls1 {}

            a = new _cls1("BASE_64", 0, "base64");
        /* block-local class not found */
        class _cls2 {}

            b = new _cls2("HEX", 1, "hex");
            c = (new DumpFormat[] {
                a, b
            });
        }

        private DumpFormat(String s, int i1, String s1)
        {
            super(s, i1);
            name = s1;
        }

    }

    public static final class FirmwareUpdateStatus extends Enum
        implements s
    {

        public static final FirmwareUpdateStatus a;
        public static final FirmwareUpdateStatus b;
        public static final FirmwareUpdateStatus c;
        public static final FirmwareUpdateStatus d;
        private static final FirmwareUpdateStatus e[];
        private final String serializableName;

        public static FirmwareUpdateStatus a(String s1)
        {
            FirmwareUpdateStatus firmwareupdatestatus = d;
            try
            {
                s1 = (FirmwareUpdateStatus)w.a(s1, com/fitbit/serverinteraction/SynclairApi$FirmwareUpdateStatus);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.fitbit.e.a.e(com.fitbit.serverinteraction.SynclairApi.a(), com.fitbit.e.a.a(s1), new Object[0]);
                return firmwareupdatestatus;
            }
            return s1;
        }

        public static FirmwareUpdateStatus valueOf(String s1)
        {
            return (FirmwareUpdateStatus)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$FirmwareUpdateStatus, s1);
        }

        public static FirmwareUpdateStatus[] values()
        {
            return (FirmwareUpdateStatus[])e.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            a = new FirmwareUpdateStatus("REQUIRED", 0, "REQUIRED");
            b = new FirmwareUpdateStatus("OPTIONAL", 1, "OPTIONAL");
            c = new FirmwareUpdateStatus("LANG", 2, "LANG");
            d = new FirmwareUpdateStatus("NONE", 3, "NONE");
            e = (new FirmwareUpdateStatus[] {
                a, b, c, d
            });
        }

        private FirmwareUpdateStatus(String s1, int i1, String s2)
        {
            super(s1, i1);
            serializableName = s2;
        }
    }

    public static final class SyncTrigger extends Enum
    {

        public static final SyncTrigger a;
        public static final SyncTrigger b;
        public static final SyncTrigger c;
        public static final String d = "SynclairApi.EXTRA_SYNC_TRIGGER";
        private static final SyncTrigger e[];
        protected final String trigger;

        public static SyncTrigger b(Intent intent)
        {
            int i1 = intent.getIntExtra("SynclairApi.EXTRA_SYNC_TRIGGER", -1);
            if (i1 < 0 || i1 >= values().length)
            {
                return a;
            } else
            {
                return values()[i1];
            }
        }

        public static SyncTrigger valueOf(String s)
        {
            return (SyncTrigger)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$SyncTrigger, s);
        }

        public static SyncTrigger[] values()
        {
            return (SyncTrigger[])e.clone();
        }

        public Intent a(Intent intent)
        {
            return intent.putExtra("SynclairApi.EXTRA_SYNC_TRIGGER", ordinal());
        }

        public String a()
        {
            return trigger;
        }

        static 
        {
            a = new SyncTrigger("CLIENT", 0, "client");
            b = new SyncTrigger("USER", 1, "user");
            c = new SyncTrigger("TRACKER", 2, "tracker");
            e = (new SyncTrigger[] {
                a, b, c
            });
        }

        private SyncTrigger(String s, int i1, String s1)
        {
            super(s, i1);
            trigger = s1;
        }
    }

    public static class a
    {

        public byte a[];
        public Map b;

        public a()
        {
        }
    }

    public static class b
    {

        public byte a[];
        public Map b;

        public b(byte abyte0[], Map map)
        {
            a = abyte0;
            b = map;
        }
    }


    public static final String a = "devices/client/tracker/data/sync";
    public static final int b = 0;
    public static final int c = 1;
    public static final String d = "ACTION_FW_UPDATE_STATUS_RECEIVED";
    public static final String e = "EXTRA_FW_UPDATE_STATUS";
    public static final String f = "EXTRA_FW_UPDATE_DEVICE";
    public static final String g = "Fitbit-Fw-Update";
    private static final String h = com/fitbit/serverinteraction/SynclairApi.getSimpleName();
    private static final String i = "Device-Data-Encoding";
    private static final String j = "targetVersions";
    private static final String k = "images";
    private static final String l = "deviceType";
    private static final String m = "%s/%s.json";
    private static final int n = 1;
    private final ServerGateway o;
    private final DumpFormat p;

    public SynclairApi(ServerGateway servergateway)
    {
        o = servergateway;
        p = com.fitbit.serverinteraction.DumpFormat.a;
    }

    private FirmwareImage a(JSONObject jsonobject, FirmwareVersion firmwareversion)
        throws JSONException
    {
        String s = jsonobject.getString("deviceMode");
        com.fitbit.data.domain.device.FirmwareImage.TypeOfData typeofdata = com.fitbit.data.domain.device.FirmwareImage.TypeOfData.MEGA;
        if (!jsonobject.isNull("isV2Data"))
        {
            if (jsonobject.getBoolean("isV2Data"))
            {
                typeofdata = com.fitbit.data.domain.device.FirmwareImage.TypeOfData.MICROV2;
            } else
            {
                typeofdata = com.fitbit.data.domain.device.FirmwareImage.TypeOfData.MICRO;
            }
        }
        jsonobject = jsonobject.getString("data");
        jsonobject = p.b(jsonobject.getBytes());
        return new FirmwareImage(com.fitbit.data.domain.device.FirmwareImage.DeviceMode.valueOf(s), firmwareversion, typeofdata, jsonobject);
    }

    static String a()
    {
        return h;
    }

    private static String a(TrackerType trackertype)
    {
        if (trackertype == null)
        {
            return null;
        } else
        {
            return a(GalileoTrackerType.a(trackertype.a()));
        }
    }

    private static String a(GalileoTrackerType galileotrackertype)
    {
        if (GalileoTrackerType.d.equals(galileotrackertype))
        {
            return "NEUTRINO";
        }
        if (GalileoTrackerType.g.equals(galileotrackertype))
        {
            return "TAU";
        } else
        {
            return null;
        }
    }

    private static transient String a(String s, Pair apair[])
    {
        s = Uri.parse(com.fitbit.serverinteraction.ServerGateway.a().c().d()).buildUpon().encodedPath(String.format("%s/%s.json", new Object[] {
            Integer.valueOf(1), s
        }));
        int j1 = apair.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Pair pair = apair[i1];
            s.appendQueryParameter((String)pair.first, (String)pair.second);
        }

        return String.valueOf(s.build());
    }

    private List a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return Collections.emptyList();
        }
        List list = b(jsonobject);
        if (jsonobject.isNull("images"))
        {
            if (com.fitbit.config.b.a.a())
            {
                com.fitbit.e.a.e(h, String.format("Missing %s key, \n%s", new Object[] {
                    "images", jsonobject.toString(2)
                }), new Object[0]);
            } else
            {
                com.fitbit.e.a.e(h, String.format("Missing %s key when parsing Firmware Image", new Object[] {
                    "images"
                }), new Object[0]);
            }
            return Collections.emptyList();
        }
        JSONArray jsonarray = jsonobject.optJSONArray("images");
        ArrayList arraylist = new ArrayList();
        int j1 = jsonarray.length();
        int i1 = 0;
        while (i1 < j1) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i1);
            if (list.isEmpty())
            {
                jsonobject = new FirmwareVersion(new int[] {
                    5, 0, 0
                });
            } else
            {
                jsonobject = (FirmwareVersion)list.get(i1);
            }
            arraylist.add(a(jsonobject1, ((FirmwareVersion) (jsonobject))));
            i1++;
        }
        return arraylist;
    }

    private List b(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("targetVersions");
        if (jsonarray != null && jsonarray.length() > 0)
        {
            ArrayList arraylist = new ArrayList();
            int i1 = 0;
            int j1 = jsonarray.length();
            do
            {
                jsonobject = arraylist;
                if (i1 >= j1)
                {
                    break;
                }
                if (!jsonarray.isNull(i1))
                {
                    arraylist.add(FirmwareVersion.a(jsonarray.optString(i1)));
                }
                i1++;
            } while (true);
        } else
        {
            jsonobject = Collections.emptyList();
        }
        return jsonobject;
    }

    public a a(String s, byte abyte0[], String s1, TrackerType trackertype)
        throws ServerCommunicationException, IOException
    {
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a(h, String.format("Finalizing pair with access token %s and %s bytes of data", new Object[] {
                s, Integer.valueOf(abyte0.length)
            }), new Object[0]);
        }
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(Pair.create("pairingToken", s));
        trackertype = a(trackertype);
        if (trackertype != null)
        {
            if (s1 != null)
            {
                s = a(GalileoTrackerType.a(s1));
            } else
            {
                s = s1;
            }
            if (s == null)
            {
                s = trackertype;
            }
            arraylist.add(Pair.create("deviceType", s));
        }
        s = new RequestParametersBuilder();
        s.a(a("devices/client/tracker/data/pair", (Pair[])arraylist.toArray(new Pair[0]))).a(p.a(abyte0)).a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b).a(com.fitbit.serverinteraction.validators.f.b()).a(Collections.singletonList(new BasicHeader("Device-Data-Encoding", p.name))).a(com.fitbit.serverinteraction.b.f.a());
        s = (j)o.b(s.a());
        abyte0 = new a();
        abyte0.a = p.b(((String)s.f()).getBytes());
        abyte0.b = s.c();
        return abyte0;
    }

    public b a(byte abyte0[], SyncTrigger synctrigger)
        throws ServerCommunicationException, IOException, JSONException
    {
        com.fitbit.e.a.a(h, String.format("Attempting a %s sync with %s bytes of data", new Object[] {
            synctrigger, Integer.valueOf(abyte0.length)
        }), new Object[0]);
        byte abyte1[] = p.a(abyte0);
        RequestParametersBuilder.a a1 = new RequestParametersBuilder.a();
        RequestParametersBuilder requestparametersbuilder = a1.a(true).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.b);
        if (synctrigger != null)
        {
            abyte0 = synctrigger.trigger;
        } else
        {
            abyte0 = com.fitbit.serverinteraction.SyncTrigger.a.trigger;
        }
        requestparametersbuilder.a(a("devices/client/tracker/data/sync", new Pair[] {
            Pair.create("trigger", abyte0)
        })).a(abyte1).a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b).a(com.fitbit.serverinteraction.validators.f.b()).a(Collections.singletonList(new BasicHeader("Device-Data-Encoding", p.name))).a(com.fitbit.serverinteraction.b.f.d());
        try
        {
            abyte0 = (j)o.b(a1.a());
            abyte0 = new b(p.b((byte[])abyte0.f()), abyte0.c());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.fitbit.e.a.e(h, "There was a runtime exception while syncing", abyte0, new Object[0]);
            throw abyte0;
        }
        return abyte0;
    }

    public List a(String s, String s1, byte abyte0[], TrackerType trackertype)
        throws ServerCommunicationException, IOException, JSONException
    {
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a(h, String.format("Validating a new tracker [%s] with code %s, and %s bytes of data", new Object[] {
                s1, s, Integer.valueOf(abyte0.length)
            }), new Object[0]);
        }
        ArrayList arraylist = new ArrayList(3);
        arraylist.add(Pair.create("secret", s));
        arraylist.add(Pair.create("btAddress", s1));
        s = a(trackertype);
        if (s != null)
        {
            arraylist.add(Pair.create("deviceType", s));
        }
        s = new RequestParametersBuilder.c();
        s.a(a("devices/client/tracker/data/validate", (Pair[])arraylist.toArray(new Pair[0]))).a(p.a(abyte0)).a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b).a(Collections.singletonList(new BasicHeader("Device-Data-Encoding", p.name))).a(com.fitbit.serverinteraction.validators.f.b()).a(com.fitbit.serverinteraction.b.f.b());
        s1 = o.b(s.a());
        s = ((JSONObject)s1.f()).getString("pairingToken");
        s1 = ((JSONObject)s1.f()).getString("deviceType");
        abyte0 = new ArrayList();
        abyte0.add(s);
        abyte0.add(s1);
        return abyte0;
    }

    public List a(byte abyte0[])
        throws ServerCommunicationException, JSONException
    {
        RequestParametersBuilder.c c1 = new RequestParametersBuilder.c();
        c1.a(a("devices/client/tracker/data/firmware", new Pair[0])).a(p.a(abyte0)).a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b).a(com.fitbit.serverinteraction.validators.f.b()).a(com.fitbit.serverinteraction.b.f.b()).a(Collections.singletonList(new BasicHeader("Device-Data-Encoding", p.name)));
        return a((JSONObject)o.b(c1.a()).f());
    }

    public void a(String s)
        throws ServerCommunicationException, IOException
    {
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a(h, String.format("Sending an sync-Ack to the server with %s", new Object[] {
                s
            }), new Object[0]);
        }
        RequestParametersBuilder requestparametersbuilder = new RequestParametersBuilder();
        requestparametersbuilder.a(a("devices/client/tracker/data/ack", new Pair[] {
            Pair.create("ackToken", s)
        }));
        requestparametersbuilder.a(com.fitbit.serverinteraction.RequestParametersBuilder.RequestParameters.ContentType.b);
        requestparametersbuilder.a(com.fitbit.serverinteraction.validators.f.b());
        o.b(requestparametersbuilder.a());
    }

}
