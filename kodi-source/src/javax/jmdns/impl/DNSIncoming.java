// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSLabel;
import javax.jmdns.impl.constants.DNSOptionCode;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSResultCode;

// Referenced classes of package javax.jmdns.impl:
//            DNSMessage, DNSRecord, DNSQuestion

public final class DNSIncoming extends DNSMessage
{
    public static class MessageInputStream extends ByteArrayInputStream
    {

        private static Logger logger1 = Logger.getLogger(javax/jmdns/impl/DNSIncoming$MessageInputStream.getName());
        final Map _names;

        public byte[] readBytes(int i)
        {
            byte abyte0[] = new byte[i];
            read(abyte0, 0, i);
            return abyte0;
        }

        public int readInt()
        {
            return readUnsignedShort() << 16 | readUnsignedShort();
        }

        public String readName()
        {
            HashMap hashmap = new HashMap();
            StringBuilder stringbuilder = new StringBuilder();
            int i = 0;
            do
            {
label0:
                {
                    int j;
label1:
                    {
                        if (i == 0)
                        {
                            j = read();
                            if (j != 0)
                            {
                                break label1;
                            }
                        }
                        Integer integer;
                        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); _names.put(integer, ((StringBuilder)hashmap.get(integer)).toString()))
                        {
                            integer = (Integer)iterator.next();
                        }

                        break label0;
                    }
                    static class _cls1
                    {

                        static final int $SwitchMap$javax$jmdns$impl$constants$DNSLabel[];
                        static final int $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[];
                        static final int $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[];

                        static 
                        {
                            $SwitchMap$javax$jmdns$impl$constants$DNSRecordType = new int[DNSRecordType.values().length];
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_A.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror16) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror15) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_CNAME.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror14) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_PTR.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror13) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_TXT.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror12) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_SRV.ordinal()] = 6;
                            }
                            catch (NoSuchFieldError nosuchfielderror11) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_HINFO.ordinal()] = 7;
                            }
                            catch (NoSuchFieldError nosuchfielderror10) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_OPT.ordinal()] = 8;
                            }
                            catch (NoSuchFieldError nosuchfielderror9) { }
                            $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode = new int[DNSOptionCode.values().length];
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.Owner.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror8) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.LLQ.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror7) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.NSID.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror6) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.UL.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror5) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSOptionCode[DNSOptionCode.Unknown.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            $SwitchMap$javax$jmdns$impl$constants$DNSLabel = new int[DNSLabel.values().length];
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Standard.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Compressed.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Extended.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                $SwitchMap$javax$jmdns$impl$constants$DNSLabel[DNSLabel.Unknown.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls1..SwitchMap.javax.jmdns.impl.constants.DNSLabel[DNSLabel.labelForByte(j).ordinal()])
                    {
                    default:
                        logger1.severe((new StringBuilder()).append("unsupported dns label type: '").append(Integer.toHexString(j & 0xc0)).append("'").toString());
                        break;

                    case 1: // '\001'
                        int k = pos;
                        String s = (new StringBuilder()).append(readUTF(j)).append(".").toString();
                        stringbuilder.append(s);
                        for (Iterator iterator1 = hashmap.values().iterator(); iterator1.hasNext(); ((StringBuilder)iterator1.next()).append(s)) { }
                        hashmap.put(Integer.valueOf(k - 1), new StringBuilder(s));
                        break;

                    case 2: // '\002'
                        i = DNSLabel.labelValue(j) << 8 | read();
                        String s2 = (String)_names.get(Integer.valueOf(i));
                        String s1 = s2;
                        if (s2 == null)
                        {
                            logger1.severe((new StringBuilder()).append("bad domain name: possible circular name detected. Bad offset: 0x").append(Integer.toHexString(i)).append(" at 0x").append(Integer.toHexString(pos - 2)).toString());
                            s1 = "";
                        }
                        stringbuilder.append(s1);
                        for (Iterator iterator2 = hashmap.values().iterator(); iterator2.hasNext(); ((StringBuilder)iterator2.next()).append(s1)) { }
                        i = 1;
                        break;

                    case 3: // '\003'
                        logger1.severe("Extended label are not currently supported.");
                        break;
                    }
                    continue;
                }
                return stringbuilder.toString();
            } while (true);
        }

        public String readNonNameString()
        {
            return readUTF(read());
        }

        public String readUTF(int i)
        {
            StringBuilder stringbuilder;
            int l;
            stringbuilder = new StringBuilder(i);
            l = 0;
_L2:
            int j;
            int k;
            int i1;
            if (l >= i)
            {
                break MISSING_BLOCK_LABEL_211;
            }
            i1 = read();
            j = i1;
            k = l;
            switch (i1 >> 4)
            {
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            default:
                j = (i1 & 0x3f) << 4 | read() & 0xf;
                k = l + 1;
                break;

            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                break;

            case 12: // '\f'
            case 13: // '\r'
                break; /* Loop/switch isn't completed */

            case 14: // '\016'
                break MISSING_BLOCK_LABEL_172;
            }
_L3:
            stringbuilder.append((char)j);
            l = k + 1;
            if (true) goto _L2; else goto _L1
_L1:
            j = (i1 & 0x1f) << 6 | read() & 0x3f;
            k = l + 1;
              goto _L3
            j = (i1 & 0xf) << 12 | (read() & 0x3f) << 6 | read() & 0x3f;
            k = l + 1 + 1;
              goto _L3
            return stringbuilder.toString();
        }

        public int readUnsignedShort()
        {
            return read() << 8 | read();
        }


        public MessageInputStream(byte abyte0[], int i)
        {
            this(abyte0, 0, i);
        }

        public MessageInputStream(byte abyte0[], int i, int j)
        {
            super(abyte0, i, j);
            _names = new HashMap();
        }
    }


    public static boolean USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET = true;
    private static final char _nibbleToHex[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static Logger logger = Logger.getLogger(javax/jmdns/impl/DNSIncoming.getName());
    private final MessageInputStream _messageInputStream;
    private final DatagramPacket _packet;
    private final long _receivedTime;
    private int _senderUDPPayload;

    private DNSIncoming(int i, int j, boolean flag, DatagramPacket datagrampacket, long l)
    {
        super(i, j, flag);
        _packet = datagrampacket;
        _messageInputStream = new MessageInputStream(datagrampacket.getData(), datagrampacket.getLength());
        _receivedTime = l;
    }

    public DNSIncoming(DatagramPacket datagrampacket)
        throws IOException
    {
        int i;
        int j;
        int k;
        int l;
        InetAddress inetaddress;
        int i1;
        boolean flag;
        if (datagrampacket.getPort() == DNSConstants.MDNS_PORT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(0, 0, flag);
        _packet = datagrampacket;
        inetaddress = datagrampacket.getAddress();
        _messageInputStream = new MessageInputStream(datagrampacket.getData(), datagrampacket.getLength());
        _receivedTime = System.currentTimeMillis();
        _senderUDPPayload = 1460;
        try
        {
            setId(_messageInputStream.readUnsignedShort());
            setFlags(_messageInputStream.readUnsignedShort());
            i1 = _messageInputStream.readUnsignedShort();
            l = _messageInputStream.readUnsignedShort();
            k = _messageInputStream.readUnsignedShort();
            j = _messageInputStream.readUnsignedShort();
        }
        // Misplaced declaration of an exception variable
        catch (DatagramPacket datagrampacket)
        {
            logger.log(Level.WARNING, (new StringBuilder()).append("DNSIncoming() dump ").append(print(true)).append("\n exception ").toString(), datagrampacket);
            IOException ioexception = new IOException("DNSIncoming corrupted message");
            ioexception.initCause(datagrampacket);
            throw ioexception;
        }
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        if (i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        _questions.add(readQuestion());
        i++;
        if (true) goto _L3; else goto _L2
_L14:
        if (i >= l) goto _L5; else goto _L4
_L4:
        datagrampacket = readAnswer(inetaddress);
        if (datagrampacket == null) goto _L7; else goto _L6
_L6:
        _answers.add(datagrampacket);
          goto _L7
_L16:
        if (i >= k) goto _L9; else goto _L8
_L8:
        datagrampacket = readAnswer(inetaddress);
        if (datagrampacket == null) goto _L11; else goto _L10
_L10:
        _authoritativeAnswers.add(datagrampacket);
          goto _L11
_L12:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        datagrampacket = readAnswer(inetaddress);
        if (datagrampacket == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        _additionals.add(datagrampacket);
        i++;
          goto _L12
_L18:
        return;
_L2:
        if (l <= 0) goto _L5; else goto _L13
_L13:
        i = 0;
          goto _L14
_L7:
        i++;
          goto _L14
_L5:
        if (k <= 0) goto _L9; else goto _L15
_L15:
        i = 0;
          goto _L16
_L11:
        i++;
          goto _L16
_L9:
        if (j <= 0) goto _L18; else goto _L17
_L17:
        i = 0;
          goto _L12
    }

    private String _hexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            stringbuilder.append(_nibbleToHex[j / 16]);
            stringbuilder.append(_nibbleToHex[j % 16]);
        }

        return stringbuilder.toString();
    }

    private DNSRecord readAnswer(InetAddress inetaddress)
    {
        Object obj;
        String s3;
        Object obj2;
        int i;
        int j;
        int k;
        boolean flag;
        s3 = _messageInputStream.readName();
        DNSRecordType dnsrecordtype = DNSRecordType.typeForIndex(_messageInputStream.readUnsignedShort());
        if (dnsrecordtype == DNSRecordType.TYPE_IGNORE)
        {
            logger.log(Level.SEVERE, (new StringBuilder()).append("Could not find record type. domain: ").append(s3).append("\n").append(print(true)).toString());
        }
        j = _messageInputStream.readUnsignedShort();
        if (dnsrecordtype == DNSRecordType.TYPE_OPT)
        {
            obj = DNSRecordClass.CLASS_UNKNOWN;
        } else
        {
            obj = DNSRecordClass.classForIndex(j);
        }
        if (obj == DNSRecordClass.CLASS_UNKNOWN && dnsrecordtype != DNSRecordType.TYPE_OPT)
        {
            logger.log(Level.SEVERE, (new StringBuilder()).append("Could not find record class. domain: ").append(s3).append(" type: ").append(dnsrecordtype).append("\n").append(print(true)).toString());
        }
        flag = ((DNSRecordClass) (obj)).isUnique(j);
        i = _messageInputStream.readInt();
        k = _messageInputStream.readUnsignedShort();
        obj2 = null;
        _cls1..SwitchMap.javax.jmdns.impl.constants.DNSRecordType[dnsrecordtype.ordinal()];
        JVM INSTR tableswitch 1 8: default 236
    //                   1 307
    //                   2 334
    //                   3 361
    //                   4 361
    //                   5 441
    //                   6 468
    //                   7 545
    //                   8 654;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L8
_L1:
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append("DNSIncoming() unknown type:").append(dnsrecordtype).toString());
        }
        _messageInputStream.skip(k);
        obj = obj2;
_L9:
        if (obj != null)
        {
            ((DNSRecord) (obj)).setRecordSource(inetaddress);
        }
        return ((DNSRecord) (obj));
_L2:
        obj = new DNSRecord.IPv4Address(s3, ((DNSRecordClass) (obj)), flag, i, _messageInputStream.readBytes(k));
          goto _L9
_L3:
        obj = new DNSRecord.IPv6Address(s3, ((DNSRecordClass) (obj)), flag, i, _messageInputStream.readBytes(k));
          goto _L9
_L4:
        String s = _messageInputStream.readName();
        if (s.length() > 0)
        {
            obj = new DNSRecord.Pointer(s3, ((DNSRecordClass) (obj)), flag, i, s);
        } else
        {
            logger.log(Level.WARNING, (new StringBuilder()).append("PTR record of class: ").append(obj).append(", there was a problem reading the service name of the answer for domain:").append(s3).toString());
            obj = obj2;
        }
          goto _L9
_L5:
        obj = new DNSRecord.Text(s3, ((DNSRecordClass) (obj)), flag, i, _messageInputStream.readBytes(k));
          goto _L9
_L6:
        j = _messageInputStream.readUnsignedShort();
        k = _messageInputStream.readUnsignedShort();
        int l = _messageInputStream.readUnsignedShort();
        String s1;
        if (USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET)
        {
            s1 = _messageInputStream.readName();
        } else
        {
            s1 = _messageInputStream.readNonNameString();
        }
        obj = new DNSRecord.Service(s3, ((DNSRecordClass) (obj)), flag, i, j, k, l, s1);
          goto _L9
_L7:
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_messageInputStream.readUTF(k));
        j = stringbuilder.indexOf(" ");
        String s2;
        String s4;
        if (j > 0)
        {
            s2 = stringbuilder.substring(0, j);
        } else
        {
            s2 = stringbuilder.toString();
        }
        s4 = s2.trim();
        if (j > 0)
        {
            s2 = stringbuilder.substring(j + 1);
        } else
        {
            s2 = "";
        }
        obj = new DNSRecord.HostInformation(s3, ((DNSRecordClass) (obj)), flag, i, s4, s2.trim());
          goto _L9
_L8:
        obj = DNSResultCode.resultCodeForFlags(getFlags(), i);
        i = (0xff0000 & i) >> 16;
        if (i != 0) goto _L11; else goto _L10
_L10:
        _senderUDPPayload = j;
_L17:
        obj = obj2;
        if (_messageInputStream.available() <= 0) goto _L9; else goto _L12
_L12:
        if (_messageInputStream.available() < 2) goto _L14; else goto _L13
_L13:
        i = _messageInputStream.readUnsignedShort();
        obj = DNSOptionCode.resultCodeForFlags(i);
        if (_messageInputStream.available() < 2) goto _L16; else goto _L15
_L15:
        byte abyte2[];
        j = _messageInputStream.readUnsignedShort();
        abyte2 = new byte[0];
        if (_messageInputStream.available() >= j)
        {
            abyte2 = _messageInputStream.readBytes(j);
        }
        _cls1..SwitchMap.javax.jmdns.impl.constants.DNSOptionCode[((DNSOptionCode) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 816
    //                   1 819
    //                   2 1356
    //                   3 1356
    //                   4 1356
    //                   5 1415;
           goto _L17 _L18 _L19 _L19 _L19 _L20
_L18:
        byte abyte0[];
        Object obj3;
        abyte0 = null;
        obj = null;
        obj3 = null;
        i = abyte2[0];
        j = abyte2[1];
        Object obj1 = new byte[6];
        byte abyte1[];
        obj1[0] = abyte2[2];
        obj1[1] = abyte2[3];
        obj1[2] = abyte2[4];
        obj1[3] = abyte2[5];
        obj1[4] = abyte2[6];
        obj1[5] = abyte2[7];
        abyte1 = ((byte []) (obj1));
        obj = abyte1;
        abyte0 = abyte1;
        if (abyte2.length <= 8) goto _L22; else goto _L21
_L21:
        abyte0 = abyte1;
        obj = (new byte[] {
            abyte2[8], abyte2[9], abyte2[10], abyte2[11], abyte2[12], abyte2[13]
        });
_L22:
        abyte0 = ((byte []) (obj));
        if (abyte2.length != 18) goto _L24; else goto _L23
_L23:
        abyte0 = ((byte []) (obj));
        abyte1 = new byte[4];
        abyte1[0] = abyte2[14];
        abyte1[1] = abyte2[15];
        abyte1[2] = abyte2[16];
        abyte1[3] = abyte2[17];
        abyte0 = abyte1;
_L27:
        if (abyte2.length != 22)
        {
            break MISSING_BLOCK_LABEL_1114;
        }
        abyte1 = new byte[8];
        abyte1[0] = abyte2[14];
        abyte1[1] = abyte2[15];
        abyte1[2] = abyte2[16];
        abyte1[3] = abyte2[17];
        abyte1[4] = abyte2[18];
        abyte1[5] = abyte2[19];
        abyte1[6] = abyte2[20];
        abyte1[7] = abyte2[21];
        abyte0 = abyte1;
_L25:
        if (logger.isLoggable(Level.FINE))
        {
            Logger logger1 = logger;
            abyte2 = (new StringBuilder()).append("Unhandled Owner OPT version: ").append(i).append(" sequence: ").append(j).append(" MAC address: ").append(_hexString(((byte []) (obj1))));
            Exception exception1;
            if (obj != obj1)
            {
                obj = (new StringBuilder()).append(" wakeup MAC address: ").append(_hexString(((byte []) (obj)))).toString();
            } else
            {
                obj = "";
            }
            obj1 = abyte2.append(((String) (obj)));
            if (abyte0 != null)
            {
                obj = (new StringBuilder()).append(" password: ").append(_hexString(abyte0)).toString();
            } else
            {
                obj = "";
            }
            logger1.fine(((StringBuilder) (obj1)).append(((String) (obj))).toString());
        }
          goto _L17
_L14:
        logger.log(Level.WARNING, "There was a problem reading the OPT record. Ignoring.");
        obj = obj2;
          goto _L9
_L16:
        logger.log(Level.WARNING, "There was a problem reading the OPT record. Ignoring.");
        obj = obj2;
          goto _L9
        exception1;
        exception1 = abyte0;
        logger1 = obj3;
_L26:
        logger.warning((new StringBuilder()).append("Malformed OPT answer. Option code: Owner data: ").append(_hexString(abyte2)).toString());
        abyte0 = logger1;
          goto _L25
_L19:
        if (logger.isLoggable(Level.FINE))
        {
            logger.log(Level.FINE, (new StringBuilder()).append("There was an OPT answer. Option code: ").append(obj).append(" data: ").append(_hexString(abyte2)).toString());
        }
          goto _L17
_L20:
        logger.log(Level.WARNING, (new StringBuilder()).append("There was an OPT answer. Not currently handled. Option code: ").append(i).append(" data: ").append(_hexString(abyte2)).toString());
          goto _L17
_L11:
        logger.log(Level.WARNING, (new StringBuilder()).append("There was an OPT answer. Wrong version number: ").append(i).append(" result code: ").append(obj).toString());
        obj = obj2;
          goto _L9
        Exception exception;
        exception;
        logger1 = obj3;
        exception = abyte0;
          goto _L26
        Exception exception2;
        exception2;
        exception2 = abyte0;
          goto _L26
_L24:
        abyte0 = null;
          goto _L27
    }

    private DNSQuestion readQuestion()
    {
        String s = _messageInputStream.readName();
        DNSRecordType dnsrecordtype = DNSRecordType.typeForIndex(_messageInputStream.readUnsignedShort());
        if (dnsrecordtype == DNSRecordType.TYPE_IGNORE)
        {
            logger.log(Level.SEVERE, (new StringBuilder()).append("Could not find record type: ").append(print(true)).toString());
        }
        int i = _messageInputStream.readUnsignedShort();
        DNSRecordClass dnsrecordclass = DNSRecordClass.classForIndex(i);
        return DNSQuestion.newQuestion(s, dnsrecordtype, dnsrecordclass, dnsrecordclass.isUnique(i));
    }

    void append(DNSIncoming dnsincoming)
    {
        if (isQuery() && isTruncated() && dnsincoming.isQuery())
        {
            _questions.addAll(dnsincoming.getQuestions());
            _answers.addAll(dnsincoming.getAnswers());
            _authoritativeAnswers.addAll(dnsincoming.getAuthorities());
            _additionals.addAll(dnsincoming.getAdditionals());
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public DNSIncoming clone()
    {
        DNSIncoming dnsincoming = new DNSIncoming(getFlags(), getId(), isMulticast(), _packet, _receivedTime);
        dnsincoming._senderUDPPayload = _senderUDPPayload;
        dnsincoming._questions.addAll(_questions);
        dnsincoming._answers.addAll(_answers);
        dnsincoming._authoritativeAnswers.addAll(_authoritativeAnswers);
        dnsincoming._additionals.addAll(_additionals);
        return dnsincoming;
    }

    public int elapseSinceArrival()
    {
        return (int)(System.currentTimeMillis() - _receivedTime);
    }

    public int getSenderUDPPayload()
    {
        return _senderUDPPayload;
    }

    String print(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(print());
        if (flag)
        {
            byte abyte0[] = new byte[_packet.getLength()];
            System.arraycopy(_packet.getData(), 0, abyte0, 0, abyte0.length);
            stringbuilder.append(print(abyte0));
        }
        return stringbuilder.toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        if (isQuery())
        {
            obj = "dns[query,";
        } else
        {
            obj = "dns[response,";
        }
        stringbuilder.append(((String) (obj)));
        if (_packet.getAddress() != null)
        {
            stringbuilder.append(_packet.getAddress().getHostAddress());
        }
        stringbuilder.append(':');
        stringbuilder.append(_packet.getPort());
        stringbuilder.append(", length=");
        stringbuilder.append(_packet.getLength());
        stringbuilder.append(", id=0x");
        stringbuilder.append(Integer.toHexString(getId()));
        if (getFlags() != 0)
        {
            stringbuilder.append(", flags=0x");
            stringbuilder.append(Integer.toHexString(getFlags()));
            if ((getFlags() & 0x8000) != 0)
            {
                stringbuilder.append(":r");
            }
            if ((getFlags() & 0x400) != 0)
            {
                stringbuilder.append(":aa");
            }
            if ((getFlags() & 0x200) != 0)
            {
                stringbuilder.append(":tc");
            }
        }
        if (getNumberOfQuestions() > 0)
        {
            stringbuilder.append(", questions=");
            stringbuilder.append(getNumberOfQuestions());
        }
        if (getNumberOfAnswers() > 0)
        {
            stringbuilder.append(", answers=");
            stringbuilder.append(getNumberOfAnswers());
        }
        if (getNumberOfAuthorities() > 0)
        {
            stringbuilder.append(", authorities=");
            stringbuilder.append(getNumberOfAuthorities());
        }
        if (getNumberOfAdditionals() > 0)
        {
            stringbuilder.append(", additionals=");
            stringbuilder.append(getNumberOfAdditionals());
        }
        if (getNumberOfQuestions() > 0)
        {
            stringbuilder.append("\nquestions:");
            DNSQuestion dnsquestion;
            for (obj = _questions.iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(dnsquestion))
            {
                dnsquestion = (DNSQuestion)((Iterator) (obj)).next();
                stringbuilder.append("\n\t");
            }

        }
        if (getNumberOfAnswers() > 0)
        {
            stringbuilder.append("\nanswers:");
            DNSRecord dnsrecord;
            for (Iterator iterator = _answers.iterator(); iterator.hasNext(); stringbuilder.append(dnsrecord))
            {
                dnsrecord = (DNSRecord)iterator.next();
                stringbuilder.append("\n\t");
            }

        }
        if (getNumberOfAuthorities() > 0)
        {
            stringbuilder.append("\nauthorities:");
            DNSRecord dnsrecord1;
            for (Iterator iterator1 = _authoritativeAnswers.iterator(); iterator1.hasNext(); stringbuilder.append(dnsrecord1))
            {
                dnsrecord1 = (DNSRecord)iterator1.next();
                stringbuilder.append("\n\t");
            }

        }
        if (getNumberOfAdditionals() > 0)
        {
            stringbuilder.append("\nadditionals:");
            DNSRecord dnsrecord2;
            for (Iterator iterator2 = _additionals.iterator(); iterator2.hasNext(); stringbuilder.append(dnsrecord2))
            {
                dnsrecord2 = (DNSRecord)iterator2.next();
                stringbuilder.append("\n\t");
            }

        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
