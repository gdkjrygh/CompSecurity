// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.common.udppriming.client:
//            EncryptChannelInformation, FBUDPPrimingCryptography, UDPPrimingDNSInfo

public class UDPPacketSender
{

    private static int a = 33000;

    private UDPPacketSender()
    {
    }

    public static int a(String s, String s1, long l, String s2)
    {
        byte byte0 = -1;
        com/facebook/common/udppriming/client/UDPPacketSender;
        JVM INSTR monitorenter ;
        int i = byte0;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (l != 0L) goto _L4; else goto _L3
_L3:
        i = byte0;
_L2:
        com/facebook/common/udppriming/client/UDPPacketSender;
        JVM INSTR monitorexit ;
        return i;
_L4:
        EncryptChannelInformation encryptchannelinformation = EncryptChannelInformation.a();
        i = byte0;
        if (encryptchannelinformation == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = encryptchannelinformation.a(s1);
        i = byte0;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = new JSONObject();
        s1.put("url", s);
        s1.put("timestamp", l);
        s = s1.toString().getBytes();
        i = byte0;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte0[] = Base64.decode(encryptchannelinformation.c(), 0);
        byte abyte1[] = Base64.decode(encryptchannelinformation.d(), 0);
        s1 = encryptchannelinformation.b().getBytes("UTF-8");
        FBUDPPrimingCryptography fbudpprimingcryptography = new FBUDPPrimingCryptography(abyte0, abyte1, new SecureRandom());
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(s);
        gzipoutputstream.close();
        s = fbudpprimingcryptography.a(bytearrayoutputstream.toByteArray(), s1);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        Log.e("UDPPacketSender", "UDP Priming packet encryption failed, might because of the preconditioncheck failed in function encryptMacForInitializationVector");
        i = byte0;
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("UDPPacketSender", "Json exception when apply json encoding in UDPPacketSender", s);
        throw new RuntimeException(s);
        s;
        com/facebook/common/udppriming/client/UDPPacketSender;
        JVM INSTR monitorexit ;
        throw s;
        s = Base64.encodeToString(s, 0);
        i = a(encryptchannelinformation.b(), s, s2);
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("UDPPacketSender", "Encryption exception in UDPPacketSender", s);
        throw new RuntimeException(s);
        s;
        Log.e("UDPPacketSender", "IO exception in UDPPacketSender", s);
        i = byte0;
        if (true) goto _L2; else goto _L5
_L5:
    }

    private static int a(String s, String s1, String s2)
    {
        byte abyte0[] = UDPPrimingDNSInfo.a().b(s2);
        int i;
        if (abyte0 == null)
        {
            i = -1;
        } else
        {
            InetAddress inetaddress = InetAddress.getByAddress(s2, abyte0);
            s = (new android.net.Uri.Builder()).scheme("https").encodedAuthority(s2).appendPath("encryptedrequest").appendQueryParameter("channel_id", s).appendQueryParameter("encrypted_request", s1).build().toString().getBytes("UTF-8");
            int j = s.length;
            i = j;
            if (j <= 1472)
            {
                s1 = new DatagramSocket();
                s1.send(new DatagramPacket(s, j, inetaddress, a));
                s1.close();
                return j;
            }
        }
        return i;
    }

}
