// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletObjects
{
    public static final class MenuItem extends ExtendableMessageNano
    {

        private static volatile MenuItem _emptyArray[];
        public String text;
        public String uri;

        private MenuItem clear()
        {
            text = null;
            uri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static MenuItem[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new MenuItem[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private MenuItem mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    text = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    uri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
            }
            j = i;
            if (uri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, uri);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (uri != null)
            {
                codedoutputbytebuffernano.writeString(2, uri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MenuItem()
        {
            clear();
        }
    }

    public static final class UiLabel extends ExtendableMessageNano
    {

        public String iconUrl;
        public String imageUrl;
        public Long labelOrdinal;
        public String localizedTitle;
        public Integer mainNavDisplayPolicy;
        public Boolean showInMainNav;

        private UiLabel clear()
        {
            labelOrdinal = null;
            localizedTitle = null;
            mainNavDisplayPolicy = null;
            showInMainNav = null;
            imageUrl = null;
            iconUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UiLabel mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       8: 83
        //                       18: 97
        //                       24: 108
        //                       32: 122
        //                       42: 170
        //                       50: 181;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            labelOrdinal = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L9
_L4:
            localizedTitle = codedinputbytebuffernano.readString();
              goto _L9
_L5:
            showInMainNav = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L9
_L6:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                mainNavDisplayPolicy = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            imageUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            iconUrl = codedinputbytebuffernano.readString();
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (labelOrdinal != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, labelOrdinal.longValue());
            }
            j = i;
            if (localizedTitle != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, localizedTitle);
            }
            i = j;
            if (showInMainNav != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, showInMainNav.booleanValue());
            }
            j = i;
            if (mainNavDisplayPolicy != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, mainNavDisplayPolicy.intValue());
            }
            i = j;
            if (imageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, imageUrl);
            }
            j = i;
            if (iconUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, iconUrl);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (labelOrdinal != null)
            {
                codedoutputbytebuffernano.writeInt64(1, labelOrdinal.longValue());
            }
            if (localizedTitle != null)
            {
                codedoutputbytebuffernano.writeString(2, localizedTitle);
            }
            if (showInMainNav != null)
            {
                codedoutputbytebuffernano.writeBool(3, showInMainNav.booleanValue());
            }
            if (mainNavDisplayPolicy != null)
            {
                codedoutputbytebuffernano.writeInt32(4, mainNavDisplayPolicy.intValue());
            }
            if (imageUrl != null)
            {
                codedoutputbytebuffernano.writeString(5, imageUrl);
            }
            if (iconUrl != null)
            {
                codedoutputbytebuffernano.writeString(6, iconUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UiLabel()
        {
            clear();
        }
    }

    public static final class WobInstance extends ExtendableMessageNano
    {

        private static volatile WobInstance _emptyArray[];
        public Integer categoryId;
        public Long creationTimeMillis;
        public NanoWalletAnalytics.GoogleAnalyticsEvent deleteEvent;
        public Boolean deleted;
        public Long expirationTimeMillis;
        public Long holderVersion;
        public String id;
        public String issuerName;
        public long labelOrdinals[];
        public Long lastActivityTimeMillis;
        public Long lastTouchTimeMillis;
        public MenuItem menuItems[];
        public WobNotificationSettings notificationSettings;
        public NanoWalletWobl.RenderOutput renderOutput;
        public byte serverData[];
        public String sortKey;
        public String title;
        public Long version;

        private WobInstance clear()
        {
            id = null;
            lastTouchTimeMillis = null;
            lastActivityTimeMillis = null;
            renderOutput = null;
            labelOrdinals = WireFormatNano.EMPTY_LONG_ARRAY;
            deleted = null;
            version = null;
            holderVersion = null;
            title = null;
            issuerName = null;
            creationTimeMillis = null;
            expirationTimeMillis = null;
            notificationSettings = null;
            serverData = null;
            sortKey = null;
            categoryId = null;
            menuItems = MenuItem.emptyArray();
            deleteEvent = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static WobInstance[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new WobInstance[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private WobInstance mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    id = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    lastTouchTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 26: // '\032'
                    if (renderOutput == null)
                    {
                        renderOutput = new NanoWalletWobl.RenderOutput();
                    }
                    codedinputbytebuffernano.readMessage(renderOutput);
                    break;

                case 32: // ' '
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                    long al[];
                    int j;
                    if (labelOrdinals == null)
                    {
                        j = 0;
                    } else
                    {
                        j = labelOrdinals.length;
                    }
                    al = new long[j + i1];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(labelOrdinals, 0, al, 0, j);
                        i1 = j;
                    }
                    for (; i1 < al.length - 1; i1++)
                    {
                        al[i1] = codedinputbytebuffernano.readInt64();
                        codedinputbytebuffernano.readTag();
                    }

                    al[i1] = codedinputbytebuffernano.readInt64();
                    labelOrdinals = al;
                    break;

                case 34: // '"'
                    int l1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int j1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt64();
                        j1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    long al1[];
                    if (labelOrdinals == null)
                    {
                        k = 0;
                    } else
                    {
                        k = labelOrdinals.length;
                    }
                    al1 = new long[k + j1];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(labelOrdinals, 0, al1, 0, k);
                        j1 = k;
                    }
                    for (; j1 < al1.length; j1++)
                    {
                        al1[j1] = codedinputbytebuffernano.readInt64();
                    }

                    labelOrdinals = al1;
                    codedinputbytebuffernano.popLimit(l1);
                    break;

                case 40: // '('
                    version = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 50: // '2'
                    title = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    issuerName = codedinputbytebuffernano.readString();
                    break;

                case 64: // '@'
                    holderVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 72: // 'H'
                    deleted = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 80: // 'P'
                    expirationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 90: // 'Z'
                    if (notificationSettings == null)
                    {
                        notificationSettings = new WobNotificationSettings();
                    }
                    codedinputbytebuffernano.readMessage(notificationSettings);
                    break;

                case 96: // '`'
                    lastActivityTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 106: // 'j'
                    serverData = codedinputbytebuffernano.readBytes();
                    break;

                case 112: // 'p'
                    creationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 130: 
                    sortKey = codedinputbytebuffernano.readString();
                    break;

                case 136: 
                    categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 146: 
                    int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 146);
                    MenuItem amenuitem[];
                    int l;
                    if (menuItems == null)
                    {
                        l = 0;
                    } else
                    {
                        l = menuItems.length;
                    }
                    amenuitem = new MenuItem[l + k1];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(menuItems, 0, amenuitem, 0, l);
                        k1 = l;
                    }
                    for (; k1 < amenuitem.length - 1; k1++)
                    {
                        amenuitem[k1] = new MenuItem();
                        codedinputbytebuffernano.readMessage(amenuitem[k1]);
                        codedinputbytebuffernano.readTag();
                    }

                    amenuitem[k1] = new MenuItem();
                    codedinputbytebuffernano.readMessage(amenuitem[k1]);
                    menuItems = amenuitem;
                    break;

                case 154: 
                    if (deleteEvent == null)
                    {
                        deleteEvent = new NanoWalletAnalytics.GoogleAnalyticsEvent();
                    }
                    codedinputbytebuffernano.readMessage(deleteEvent);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
            }
            j = i;
            if (lastTouchTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, lastTouchTimeMillis.longValue());
            }
            i = j;
            if (renderOutput != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderOutput);
            }
            j = i;
            if (labelOrdinals != null)
            {
                j = i;
                if (labelOrdinals.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < labelOrdinals.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt64SizeNoTag(labelOrdinals[j]);
                    }

                    j = i + k + labelOrdinals.length * 1;
                }
            }
            i = j;
            if (version != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(5, version.longValue());
            }
            j = i;
            if (title != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, title);
            }
            i = j;
            if (issuerName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, issuerName);
            }
            j = i;
            if (holderVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(8, holderVersion.longValue());
            }
            i = j;
            if (deleted != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(9, deleted.booleanValue());
            }
            j = i;
            if (expirationTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(10, expirationTimeMillis.longValue());
            }
            i = j;
            if (notificationSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, notificationSettings);
            }
            j = i;
            if (lastActivityTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(12, lastActivityTimeMillis.longValue());
            }
            i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(13, serverData);
            }
            j = i;
            if (creationTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(14, creationTimeMillis.longValue());
            }
            int l = j;
            if (sortKey != null)
            {
                l = j + CodedOutputByteBufferNano.computeStringSize(16, sortKey);
            }
            i = l;
            if (categoryId != null)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(17, categoryId.intValue());
            }
            j = i;
            if (menuItems != null)
            {
                j = i;
                if (menuItems.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        j = i;
                        if (i1 >= menuItems.length)
                        {
                            break;
                        }
                        MenuItem menuitem = menuItems[i1];
                        j = i;
                        if (menuitem != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(18, menuitem);
                        }
                        i1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (deleteEvent != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(19, deleteEvent);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(1, id);
            }
            if (lastTouchTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastTouchTimeMillis.longValue());
            }
            if (renderOutput != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderOutput);
            }
            if (labelOrdinals != null && labelOrdinals.length > 0)
            {
                for (int i = 0; i < labelOrdinals.length; i++)
                {
                    codedoutputbytebuffernano.writeInt64(4, labelOrdinals[i]);
                }

            }
            if (version != null)
            {
                codedoutputbytebuffernano.writeInt64(5, version.longValue());
            }
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(6, title);
            }
            if (issuerName != null)
            {
                codedoutputbytebuffernano.writeString(7, issuerName);
            }
            if (holderVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(8, holderVersion.longValue());
            }
            if (deleted != null)
            {
                codedoutputbytebuffernano.writeBool(9, deleted.booleanValue());
            }
            if (expirationTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(10, expirationTimeMillis.longValue());
            }
            if (notificationSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(11, notificationSettings);
            }
            if (lastActivityTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(12, lastActivityTimeMillis.longValue());
            }
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(13, serverData);
            }
            if (creationTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(14, creationTimeMillis.longValue());
            }
            if (sortKey != null)
            {
                codedoutputbytebuffernano.writeString(16, sortKey);
            }
            if (categoryId != null)
            {
                codedoutputbytebuffernano.writeInt32(17, categoryId.intValue());
            }
            if (menuItems != null && menuItems.length > 0)
            {
                for (int j = 0; j < menuItems.length; j++)
                {
                    MenuItem menuitem = menuItems[j];
                    if (menuitem != null)
                    {
                        codedoutputbytebuffernano.writeMessage(18, menuitem);
                    }
                }

            }
            if (deleteEvent != null)
            {
                codedoutputbytebuffernano.writeMessage(19, deleteEvent);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobInstance()
        {
            clear();
        }
    }

    public static final class WobNotificationSettings extends ExtendableMessageNano
    {

        public Boolean geofencedNotificationsEnabled;
        public int geofencingControlledBy[];
        public int updatesControlledBy[];
        public Boolean updatesEnabled;

        private WobNotificationSettings clear()
        {
            geofencedNotificationsEnabled = null;
            updatesEnabled = null;
            geofencingControlledBy = WireFormatNano.EMPTY_INT_ARRAY;
            updatesControlledBy = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WobNotificationSettings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    geofencedNotificationsEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 16: // '\020'
                    updatesEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 24: // '\030'
                    int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                    int ai[];
                    int j;
                    if (geofencingControlledBy == null)
                    {
                        j = 0;
                    } else
                    {
                        j = geofencingControlledBy.length;
                    }
                    ai = new int[j + j1];
                    j1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(geofencingControlledBy, 0, ai, 0, j);
                        j1 = j;
                    }
                    for (; j1 < ai.length - 1; j1++)
                    {
                        ai[j1] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[j1] = codedinputbytebuffernano.readInt32();
                    geofencingControlledBy = ai;
                    break;

                case 26: // '\032'
                    int j2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int k1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        k1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    int ai1[];
                    if (geofencingControlledBy == null)
                    {
                        k = 0;
                    } else
                    {
                        k = geofencingControlledBy.length;
                    }
                    ai1 = new int[k + k1];
                    k1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(geofencingControlledBy, 0, ai1, 0, k);
                        k1 = k;
                    }
                    for (; k1 < ai1.length; k1++)
                    {
                        ai1[k1] = codedinputbytebuffernano.readInt32();
                    }

                    geofencingControlledBy = ai1;
                    codedinputbytebuffernano.popLimit(j2);
                    break;

                case 32: // ' '
                    int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                    int ai2[];
                    int l;
                    if (updatesControlledBy == null)
                    {
                        l = 0;
                    } else
                    {
                        l = updatesControlledBy.length;
                    }
                    ai2 = new int[l + l1];
                    l1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(updatesControlledBy, 0, ai2, 0, l);
                        l1 = l;
                    }
                    for (; l1 < ai2.length - 1; l1++)
                    {
                        ai2[l1] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai2[l1] = codedinputbytebuffernano.readInt32();
                    updatesControlledBy = ai2;
                    break;

                case 34: // '"'
                    int k2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i2 = 0;
                    int i1 = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        i2++;
                    }
                    codedinputbytebuffernano.rewindToPosition(i1);
                    int ai3[];
                    if (updatesControlledBy == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = updatesControlledBy.length;
                    }
                    ai3 = new int[i1 + i2];
                    i2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(updatesControlledBy, 0, ai3, 0, i1);
                        i2 = i1;
                    }
                    for (; i2 < ai3.length; i2++)
                    {
                        ai3[i2] = codedinputbytebuffernano.readInt32();
                    }

                    updatesControlledBy = ai3;
                    codedinputbytebuffernano.popLimit(k2);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (geofencedNotificationsEnabled != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(1, geofencedNotificationsEnabled.booleanValue());
            }
            i = j;
            if (updatesEnabled != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(2, updatesEnabled.booleanValue());
            }
            j = i;
            if (geofencingControlledBy != null)
            {
                j = i;
                if (geofencingControlledBy.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < geofencingControlledBy.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(geofencingControlledBy[j]);
                    }

                    j = i + k + geofencingControlledBy.length * 1;
                }
            }
            i = j;
            if (updatesControlledBy != null)
            {
                i = j;
                if (updatesControlledBy.length > 0)
                {
                    int l = 0;
                    for (i = 0; i < updatesControlledBy.length; i++)
                    {
                        l += CodedOutputByteBufferNano.computeInt32SizeNoTag(updatesControlledBy[i]);
                    }

                    i = j + l + updatesControlledBy.length * 1;
                }
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (geofencedNotificationsEnabled != null)
            {
                codedoutputbytebuffernano.writeBool(1, geofencedNotificationsEnabled.booleanValue());
            }
            if (updatesEnabled != null)
            {
                codedoutputbytebuffernano.writeBool(2, updatesEnabled.booleanValue());
            }
            if (geofencingControlledBy != null && geofencingControlledBy.length > 0)
            {
                for (int i = 0; i < geofencingControlledBy.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(3, geofencingControlledBy[i]);
                }

            }
            if (updatesControlledBy != null && updatesControlledBy.length > 0)
            {
                for (int j = 0; j < updatesControlledBy.length; j++)
                {
                    codedoutputbytebuffernano.writeInt32(4, updatesControlledBy[j]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobNotificationSettings()
        {
            clear();
        }
    }

    public static final class WoblRenderableItem extends ExtendableMessageNano
    {

        public String entityUri;
        public NanoWalletWobl.RenderOutput renderOutput;

        private WoblRenderableItem clear()
        {
            renderOutput = null;
            entityUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WoblRenderableItem mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    if (renderOutput == null)
                    {
                        renderOutput = new NanoWalletWobl.RenderOutput();
                    }
                    codedinputbytebuffernano.readMessage(renderOutput);
                    break;

                case 18: // '\022'
                    entityUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (renderOutput != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, renderOutput);
            }
            j = i;
            if (entityUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, entityUri);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (renderOutput != null)
            {
                codedoutputbytebuffernano.writeMessage(1, renderOutput);
            }
            if (entityUri != null)
            {
                codedoutputbytebuffernano.writeString(2, entityUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WoblRenderableItem()
        {
            clear();
        }
    }

}
