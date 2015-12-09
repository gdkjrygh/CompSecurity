// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.Context;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class PermissionsReporter
{

    private static final String ALL_PERMISSIONS_SAMPLES[] = {
        "android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.BODY_SENSORS", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"
    };
    public static final String TAG = "PermissionsReporter";

    public PermissionsReporter()
    {
    }

    public static String getAppGrantedPermissions(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        int i = 0;
        while (i < ALL_PERMISSIONS_SAMPLES.length) 
        {
            String s1 = getGroupPermission(ALL_PERMISSIONS_SAMPLES[i]);
            int j = s1.lastIndexOf('.');
            String s = s1;
            if (j >= 0)
            {
                s = s1.substring(j + 1);
            }
            boolean flag = isPermissionGranted(context, ALL_PERMISSIONS_SAMPLES[i]);
            try
            {
                jsonobject.put(s, flag);
            }
            catch (JSONException jsonexception)
            {
                Log.e("PermissionsReporter", (new StringBuilder("Caught JSONException ")).append(jsonexception).toString());
            }
            i++;
        }
        return jsonobject.toString();
    }

    public static String getGroupPermission(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 23: default 200
    //                   -2062386608: 589
    //                   -1928411001: 310
    //                   -1921431796: 469
    //                   -1888586689: 394
    //                   -1479758289: 604
    //                   -1238066820: 544
    //                   -895673731: 574
    //                   -406040016: 619
    //                   -63024214: 409
    //                   -5573545: 439
    //                   52602690: 559
    //                   112197485: 454
    //                   214526995: 366
    //                   463403621: 338
    //                   603653886: 324
    //                   610633091: 484
    //                   784519842: 514
    //                   952819282: 529
    //                   1271781903: 380
    //                   1365911975: 634
    //                   1831139720: 424
    //                   1977429404: 352
    //                   2133799037: 499;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        break; /* Loop/switch isn't completed */
_L21:
        break MISSING_BLOCK_LABEL_634;
_L25:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
        case 1: // '\001'
            return "android.permission-group.CALENDAR";

        case 2: // '\002'
            return "android.permission-group.CAMERA";

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return "android.permission-group.CONTACTS";

        case 6: // '\006'
        case 7: // '\007'
            return "android.permission-group.LOCATION";

        case 8: // '\b'
            return "android.permission-group.MICROPHONE";

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            return "android.permission-group.PHONE";

        case 16: // '\020'
            return "android.permission-group.SENSORS";

        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
            return "android.permission-group.SMS";

        case 21: // '\025'
        case 22: // '\026'
            return "android.permission-group.STORAGE";
        }
_L3:
        if (s.equals("android.permission.READ_CALENDAR"))
        {
            byte0 = 0;
        }
          goto _L25
_L16:
        if (s.equals("android.permission.WRITE_CALENDAR"))
        {
            byte0 = 1;
        }
          goto _L25
_L15:
        if (s.equals("android.permission.CAMERA"))
        {
            byte0 = 2;
        }
          goto _L25
_L23:
        if (s.equals("android.permission.READ_CONTACTS"))
        {
            byte0 = 3;
        }
          goto _L25
_L14:
        if (s.equals("android.permission.WRITE_CONTACTS"))
        {
            byte0 = 4;
        }
          goto _L25
_L20:
        if (s.equals("android.permission.GET_ACCOUNTS"))
        {
            byte0 = 5;
        }
          goto _L25
_L5:
        if (s.equals("android.permission.ACCESS_FINE_LOCATION"))
        {
            byte0 = 6;
        }
          goto _L25
_L10:
        if (s.equals("android.permission.ACCESS_COARSE_LOCATION"))
        {
            byte0 = 7;
        }
          goto _L25
_L22:
        if (s.equals("android.permission.RECORD_AUDIO"))
        {
            byte0 = 8;
        }
          goto _L25
_L11:
        if (s.equals("android.permission.READ_PHONE_STATE"))
        {
            byte0 = 9;
        }
          goto _L25
_L13:
        if (s.equals("android.permission.CALL_PHONE"))
        {
            byte0 = 10;
        }
          goto _L25
_L4:
        if (s.equals("android.permission.READ_CALL_LOG"))
        {
            byte0 = 11;
        }
          goto _L25
_L17:
        if (s.equals("android.permission.WRITE_CALL_LOG"))
        {
            byte0 = 12;
        }
          goto _L25
_L24:
        if (s.equals("com.android.voicemail.permission.ADD_VOICEMAIL"))
        {
            byte0 = 13;
        }
          goto _L25
_L18:
        if (s.equals("android.permission.USE_SIP"))
        {
            byte0 = 14;
        }
          goto _L25
_L19:
        if (s.equals("android.permission.PROCESS_OUTGOING_CALLS"))
        {
            byte0 = 15;
        }
          goto _L25
_L7:
        if (s.equals("android.permission.BODY_SENSORS"))
        {
            byte0 = 16;
        }
          goto _L25
_L12:
        if (s.equals("android.permission.SEND_SMS"))
        {
            byte0 = 17;
        }
          goto _L25
_L8:
        if (s.equals("android.permission.RECEIVE_SMS"))
        {
            byte0 = 18;
        }
          goto _L25
_L2:
        if (s.equals("android.permission.READ_SMS"))
        {
            byte0 = 19;
        }
          goto _L25
_L6:
        if (s.equals("android.permission.RECEIVE_WAP_PUSH"))
        {
            byte0 = 20;
        }
          goto _L25
_L9:
        if (s.equals("android.permission.READ_EXTERNAL_STORAGE"))
        {
            byte0 = 21;
        }
          goto _L25
        if (s.equals("android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            byte0 = 22;
        }
          goto _L25
    }

    private static boolean isPermissionGranted(Context context, String s)
    {
        boolean flag = false;
        int i;
        try
        {
            i = context.checkCallingOrSelfPermission(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

}
