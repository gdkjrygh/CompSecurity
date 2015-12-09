// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{
    public static final class DigestDescription extends ExtendableMessageNano
    {

        public String expandedDescription;
        public String title;

        private DigestDescription clear()
        {
            expandedDescription = null;
            title = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DigestDescription mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    expandedDescription = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (expandedDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, expandedDescription);
            }
            j = i;
            if (title != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
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
            if (expandedDescription != null)
            {
                codedoutputbytebuffernano.writeString(1, expandedDescription);
            }
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DigestDescription()
        {
            clear();
        }
    }

    public static final class LongDescription extends ExtendableMessageNano
    {

        public String description;
        public String title;

        private LongDescription clear()
        {
            title = null;
            description = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LongDescription mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    title = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LongDescription()
        {
            clear();
        }
    }

    public static final class P2pNotificationDetails extends ExtendableMessageNano
    {

        public String displayName;
        public String email;
        public String imageUrl;
        public com.google.wallet.proto.NanoWalletShared.PurchaseRecordId purchaseRecordId;
        public String purchaseRecordLookupId;

        private P2pNotificationDetails clear()
        {
            purchaseRecordLookupId = null;
            purchaseRecordId = null;
            displayName = null;
            email = null;
            imageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pNotificationDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    purchaseRecordLookupId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    displayName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    email = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    imageUrl = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (purchaseRecordId == null)
                    {
                        purchaseRecordId = new com.google.wallet.proto.NanoWalletShared.PurchaseRecordId();
                    }
                    codedinputbytebuffernano.readMessage(purchaseRecordId);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (purchaseRecordLookupId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, purchaseRecordLookupId);
            }
            j = i;
            if (displayName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, displayName);
            }
            i = j;
            if (email != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, email);
            }
            j = i;
            if (imageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, imageUrl);
            }
            i = j;
            if (purchaseRecordId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, purchaseRecordId);
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
            if (purchaseRecordLookupId != null)
            {
                codedoutputbytebuffernano.writeString(1, purchaseRecordLookupId);
            }
            if (displayName != null)
            {
                codedoutputbytebuffernano.writeString(2, displayName);
            }
            if (email != null)
            {
                codedoutputbytebuffernano.writeString(3, email);
            }
            if (imageUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, imageUrl);
            }
            if (purchaseRecordId != null)
            {
                codedoutputbytebuffernano.writeMessage(5, purchaseRecordId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pNotificationDetails()
        {
            clear();
        }
    }

    public static final class ReceiptNotificationDetails extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.PurchaseRecordId purchaseRecordId;
        public String purchaseRecordLookupId;

        private ReceiptNotificationDetails clear()
        {
            purchaseRecordLookupId = null;
            purchaseRecordId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ReceiptNotificationDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    purchaseRecordLookupId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (purchaseRecordId == null)
                    {
                        purchaseRecordId = new com.google.wallet.proto.NanoWalletShared.PurchaseRecordId();
                    }
                    codedinputbytebuffernano.readMessage(purchaseRecordId);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (purchaseRecordLookupId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, purchaseRecordLookupId);
            }
            j = i;
            if (purchaseRecordId != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, purchaseRecordId);
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
            if (purchaseRecordLookupId != null)
            {
                codedoutputbytebuffernano.writeString(1, purchaseRecordLookupId);
            }
            if (purchaseRecordId != null)
            {
                codedoutputbytebuffernano.writeMessage(2, purchaseRecordId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ReceiptNotificationDetails()
        {
            clear();
        }
    }

    public static final class SecondaryCallToAction extends ExtendableMessageNano
    {

        private static volatile SecondaryCallToAction _emptyArray[];
        public Integer iconType;
        public String targetUri;
        public String title;

        private SecondaryCallToAction clear()
        {
            title = null;
            targetUri = null;
            iconType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SecondaryCallToAction[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SecondaryCallToAction[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SecondaryCallToAction mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       18: 70
        //                       32: 81;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            title = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            targetUri = codedinputbytebuffernano.readString();
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                iconType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            j = i;
            if (targetUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, targetUri);
            }
            i = j;
            if (iconType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, iconType.intValue());
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (targetUri != null)
            {
                codedoutputbytebuffernano.writeString(2, targetUri);
            }
            if (iconType != null)
            {
                codedoutputbytebuffernano.writeInt32(4, iconType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SecondaryCallToAction()
        {
            clear();
        }
    }

    public static final class WobNotificationDetails extends ExtendableMessageNano
    {

        public String wobInstanceId;
        public Integer wobNotificationType;

        private WobNotificationDetails clear()
        {
            wobInstanceId = null;
            wobNotificationType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WobNotificationDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 62;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            wobInstanceId = codedinputbytebuffernano.readString();
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                wobNotificationType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobInstanceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, wobInstanceId);
            }
            j = i;
            if (wobNotificationType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, wobNotificationType.intValue());
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
            if (wobInstanceId != null)
            {
                codedoutputbytebuffernano.writeString(1, wobInstanceId);
            }
            if (wobNotificationType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, wobNotificationType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobNotificationDetails()
        {
            clear();
        }
    }


    public DigestDescription digestDescription;
    public Long eventTimeMillis;
    public LongDescription longDescription;
    public String notificationId;
    public Long notificationTimeMillis;
    public Integer notificationType;
    public P2pNotificationDetails p2PNotificationDetails;
    public ReceiptNotificationDetails receiptNotificationDetails;
    public SecondaryCallToAction secondaryCallsToAction[];
    public String shortDescription;
    public Boolean shouldBuzzUser;
    public String targetUri[];
    public WobNotificationDetails wobNotificationDetails;

    private WobNotificationDetails.wobNotificationType clear()
    {
        notificationId = null;
        notificationTimeMillis = null;
        notificationType = null;
        shortDescription = null;
        longDescription = null;
        receiptNotificationDetails = null;
        shouldBuzzUser = null;
        eventTimeMillis = null;
        p2PNotificationDetails = null;
        targetUri = WireFormatNano.EMPTY_STRING_ARRAY;
        wobNotificationDetails = null;
        secondaryCallsToAction = SecondaryCallToAction.emptyArray();
        digestDescription = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L16:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   10: 139
    //                   16: 150
    //                   24: 164
    //                   34: 302
    //                   42: 313
    //                   58: 342
    //                   64: 371
    //                   72: 385
    //                   82: 399
    //                   90: 428
    //                   98: 530
    //                   106: 559
    //                   114: 683;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        notificationId = codedinputbytebuffernano.readString();
          goto _L16
_L4:
        notificationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L16
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 26: // '\032'
            notificationType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        shortDescription = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        if (longDescription == null)
        {
            longDescription = new LongDescription();
        }
        codedinputbytebuffernano.readMessage(longDescription);
        continue; /* Loop/switch isn't completed */
_L8:
        if (receiptNotificationDetails == null)
        {
            receiptNotificationDetails = new ReceiptNotificationDetails();
        }
        codedinputbytebuffernano.readMessage(receiptNotificationDetails);
        continue; /* Loop/switch isn't completed */
_L9:
        shouldBuzzUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L10:
        eventTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L11:
        if (p2PNotificationDetails == null)
        {
            p2PNotificationDetails = new P2pNotificationDetails();
        }
        codedinputbytebuffernano.readMessage(p2PNotificationDetails);
        continue; /* Loop/switch isn't completed */
_L12:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
        String as[];
        int k;
        if (targetUri == null)
        {
            k = 0;
        } else
        {
            k = targetUri.length;
        }
        as = new String[k + i1];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(targetUri, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[i1] = codedinputbytebuffernano.readString();
        targetUri = as;
        continue; /* Loop/switch isn't completed */
_L13:
        if (wobNotificationDetails == null)
        {
            wobNotificationDetails = new WobNotificationDetails();
        }
        codedinputbytebuffernano.readMessage(wobNotificationDetails);
        continue; /* Loop/switch isn't completed */
_L14:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 106);
        SecondaryCallToAction asecondarycalltoaction[];
        int l;
        if (secondaryCallsToAction == null)
        {
            l = 0;
        } else
        {
            l = secondaryCallsToAction.length;
        }
        asecondarycalltoaction = new SecondaryCallToAction[l + j1];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(secondaryCallsToAction, 0, asecondarycalltoaction, 0, l);
            j1 = l;
        }
        for (; j1 < asecondarycalltoaction.length - 1; j1++)
        {
            asecondarycalltoaction[j1] = new SecondaryCallToAction();
            codedinputbytebuffernano.readMessage(asecondarycalltoaction[j1]);
            codedinputbytebuffernano.readTag();
        }

        asecondarycalltoaction[j1] = new SecondaryCallToAction();
        codedinputbytebuffernano.readMessage(asecondarycalltoaction[j1]);
        secondaryCallsToAction = asecondarycalltoaction;
        continue; /* Loop/switch isn't completed */
_L15:
        if (digestDescription == null)
        {
            digestDescription = new DigestDescription();
        }
        codedinputbytebuffernano.readMessage(digestDescription);
        if (true) goto _L16; else goto _L17
_L17:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (notificationId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, notificationId);
        }
        j = i;
        if (notificationTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, notificationTimeMillis.longValue());
        }
        i = j;
        if (notificationType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, notificationType.intValue());
        }
        j = i;
        if (shortDescription != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, shortDescription);
        }
        i = j;
        if (longDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, longDescription);
        }
        j = i;
        if (receiptNotificationDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(7, receiptNotificationDetails);
        }
        i = j;
        if (shouldBuzzUser != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(8, shouldBuzzUser.booleanValue());
        }
        j = i;
        if (eventTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(9, eventTimeMillis.longValue());
        }
        i = j;
        if (p2PNotificationDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(10, p2PNotificationDetails);
        }
        j = i;
        if (targetUri != null)
        {
            j = i;
            if (targetUri.length > 0)
            {
                int j1 = 0;
                int k = 0;
                for (j = 0; j < targetUri.length;)
                {
                    String s = targetUri[j];
                    int k1 = j1;
                    int i1 = k;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    j1 = k1;
                    k = i1;
                }

                j = i + k + j1 * 1;
            }
        }
        i = j;
        if (wobNotificationDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(12, wobNotificationDetails);
        }
        j = i;
        if (secondaryCallsToAction != null)
        {
            j = i;
            if (secondaryCallsToAction.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= secondaryCallsToAction.length)
                    {
                        break;
                    }
                    SecondaryCallToAction secondarycalltoaction = secondaryCallsToAction[l];
                    j = i;
                    if (secondarycalltoaction != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(13, secondarycalltoaction);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (digestDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(14, digestDescription);
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
        if (notificationId != null)
        {
            codedoutputbytebuffernano.writeString(1, notificationId);
        }
        if (notificationTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, notificationTimeMillis.longValue());
        }
        if (notificationType != null)
        {
            codedoutputbytebuffernano.writeInt32(3, notificationType.intValue());
        }
        if (shortDescription != null)
        {
            codedoutputbytebuffernano.writeString(4, shortDescription);
        }
        if (longDescription != null)
        {
            codedoutputbytebuffernano.writeMessage(5, longDescription);
        }
        if (receiptNotificationDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(7, receiptNotificationDetails);
        }
        if (shouldBuzzUser != null)
        {
            codedoutputbytebuffernano.writeBool(8, shouldBuzzUser.booleanValue());
        }
        if (eventTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(9, eventTimeMillis.longValue());
        }
        if (p2PNotificationDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(10, p2PNotificationDetails);
        }
        if (targetUri != null && targetUri.length > 0)
        {
            for (int i = 0; i < targetUri.length; i++)
            {
                String s = targetUri[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(11, s);
                }
            }

        }
        if (wobNotificationDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(12, wobNotificationDetails);
        }
        if (secondaryCallsToAction != null && secondaryCallsToAction.length > 0)
        {
            for (int j = 0; j < secondaryCallsToAction.length; j++)
            {
                SecondaryCallToAction secondarycalltoaction = secondaryCallsToAction[j];
                if (secondarycalltoaction != null)
                {
                    codedoutputbytebuffernano.writeMessage(13, secondarycalltoaction);
                }
            }

        }
        if (digestDescription != null)
        {
            codedoutputbytebuffernano.writeMessage(14, digestDescription);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public WobNotificationDetails.clear()
    {
        clear();
    }
}
