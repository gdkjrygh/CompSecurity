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

public interface NanoWalletMywallet
{
    public static final class DismissWalletTileRequest extends ExtendableMessageNano
    {

        public String walletTileId;

        private DismissWalletTileRequest clear()
        {
            walletTileId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DismissWalletTileRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    walletTileId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (walletTileId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, walletTileId);
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
            if (walletTileId != null)
            {
                codedoutputbytebuffernano.writeString(1, walletTileId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DismissWalletTileRequest()
        {
            clear();
        }
    }

    public static final class DismissWalletTileResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private DismissWalletTileResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DismissWalletTileResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DismissWalletTileResponse()
        {
            clear();
        }
    }

    public static final class FetchMyWalletRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.PhysicalLocation location;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public int supportedTileType[];

        private FetchMyWalletRequest clear()
        {
            location = null;
            renderInfo = null;
            supportedTileType = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchMyWalletRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L21:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 60
        //                       0: 70
        //                       10: 72
        //                       18: 101
        //                       24: 130
        //                       26: 380;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i))
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            return this;
_L3:
            if (location == null)
            {
                location = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
            }
            codedinputbytebuffernano.readMessage(location);
            continue; /* Loop/switch isn't completed */
_L4:
            if (renderInfo == null)
            {
                renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
            }
            codedinputbytebuffernano.readMessage(renderInfo);
            continue; /* Loop/switch isn't completed */
_L5:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
            ai = new int[i1];
            j = 0;
            i = 0;
_L13:
            if (j >= i1) goto _L8; else goto _L7
_L7:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readInt32();
            j1;
            JVM INSTR tableswitch 1 19: default 264
        //                       1 273
        //                       2 273
        //                       3 273
        //                       4 273
        //                       5 273
        //                       6 273
        //                       7 273
        //                       8 273
        //                       9 273
        //                       10 273
        //                       11 273
        //                       12 273
        //                       13 264
        //                       14 273
        //                       15 273
        //                       16 273
        //                       17 273
        //                       18 273
        //                       19 273;
               goto _L9 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L9 _L10 _L10 _L10 _L10 _L10 _L10
_L9:
            j++;
              goto _L11
_L10:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L9; else goto _L11
_L11:
            if (true) goto _L13; else goto _L12
_L12:
_L8:
            if (i != 0)
            {
                if (supportedTileType == null)
                {
                    j = 0;
                } else
                {
                    j = supportedTileType.length;
                }
                if (j == 0 && i == i1)
                {
                    supportedTileType = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(supportedTileType, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    supportedTileType = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j = 0;
            i = codedinputbytebuffernano.getPosition();
_L19:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 14: // '\016'
                case 15: // '\017'
                case 16: // '\020'
                case 17: // '\021'
                case 18: // '\022'
                case 19: // '\023'
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L15; else goto _L14
_L14:
            codedinputbytebuffernano.rewindToPosition(i);
            if (supportedTileType == null)
            {
                i = 0;
            } else
            {
                i = supportedTileType.length;
            }
            ai = new int[i + j];
            j = i;
            if (i != 0)
            {
                System.arraycopy(supportedTileType, 0, ai, 0, i);
                j = i;
            }
_L17:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 14: // '\016'
                case 15: // '\017'
                case 16: // '\020'
                case 17: // '\021'
                case 18: // '\022'
                case 19: // '\023'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            supportedTileType = ai;
              goto _L15
            if (true) goto _L17; else goto _L16
_L16:
            if (true) goto _L19; else goto _L18
_L18:
_L15:
            codedinputbytebuffernano.popLimit(l);
            if (true) goto _L21; else goto _L20
_L20:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (location != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, location);
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
            }
            j = i;
            if (supportedTileType != null)
            {
                j = i;
                if (supportedTileType.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < supportedTileType.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(supportedTileType[j]);
                    }

                    j = i + k + supportedTileType.length * 1;
                }
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
            if (location != null)
            {
                codedoutputbytebuffernano.writeMessage(1, location);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, renderInfo);
            }
            if (supportedTileType != null && supportedTileType.length > 0)
            {
                for (int i = 0; i < supportedTileType.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(3, supportedTileType[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchMyWalletRequest()
        {
            clear();
        }
    }

    public static final class FetchMyWalletResponse extends ExtendableMessageNano
    {

        public WalletTileGroup tileGroups[];

        private FetchMyWalletResponse clear()
        {
            tileGroups = WalletTileGroup.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchMyWalletResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    WalletTileGroup awallettilegroup[];
                    int j;
                    if (tileGroups == null)
                    {
                        j = 0;
                    } else
                    {
                        j = tileGroups.length;
                    }
                    awallettilegroup = new WalletTileGroup[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(tileGroups, 0, awallettilegroup, 0, j);
                        k = j;
                    }
                    for (; k < awallettilegroup.length - 1; k++)
                    {
                        awallettilegroup[k] = new WalletTileGroup();
                        codedinputbytebuffernano.readMessage(awallettilegroup[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    awallettilegroup[k] = new WalletTileGroup();
                    codedinputbytebuffernano.readMessage(awallettilegroup[k]);
                    tileGroups = awallettilegroup;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (tileGroups != null)
            {
                k = i;
                if (tileGroups.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= tileGroups.length)
                        {
                            break;
                        }
                        WalletTileGroup wallettilegroup = tileGroups[j];
                        k = i;
                        if (wallettilegroup != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, wallettilegroup);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (tileGroups != null && tileGroups.length > 0)
            {
                for (int i = 0; i < tileGroups.length; i++)
                {
                    WalletTileGroup wallettilegroup = tileGroups[i];
                    if (wallettilegroup != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, wallettilegroup);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchMyWalletResponse()
        {
            clear();
        }
    }

    public static final class WalletTile extends ExtendableMessageNano
    {

        private static volatile WalletTile _emptyArray[];
        public com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent dismissEvent;
        public com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent impressionEvent;
        public Boolean isDismissible;
        public Integer type;
        public String walletTileId;
        public WoblTileDetails woblTileDetails;

        private WalletTile clear()
        {
            walletTileId = null;
            isDismissible = null;
            type = null;
            woblTileDetails = null;
            impressionEvent = null;
            dismissEvent = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static WalletTile[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new WalletTile[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private WalletTile mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       16: 94
        //                       24: 108
        //                       34: 218
        //                       42: 247
        //                       50: 276;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            walletTileId = codedinputbytebuffernano.readString();
              goto _L9
_L4:
            isDismissible = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L9
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (woblTileDetails == null)
            {
                woblTileDetails = new WoblTileDetails();
            }
            codedinputbytebuffernano.readMessage(woblTileDetails);
            continue; /* Loop/switch isn't completed */
_L7:
            if (impressionEvent == null)
            {
                impressionEvent = new com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent();
            }
            codedinputbytebuffernano.readMessage(impressionEvent);
            continue; /* Loop/switch isn't completed */
_L8:
            if (dismissEvent == null)
            {
                dismissEvent = new com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent();
            }
            codedinputbytebuffernano.readMessage(dismissEvent);
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (walletTileId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, walletTileId);
            }
            j = i;
            if (isDismissible != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, isDismissible.booleanValue());
            }
            i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, type.intValue());
            }
            j = i;
            if (woblTileDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, woblTileDetails);
            }
            i = j;
            if (impressionEvent != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, impressionEvent);
            }
            j = i;
            if (dismissEvent != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, dismissEvent);
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
            if (walletTileId != null)
            {
                codedoutputbytebuffernano.writeString(1, walletTileId);
            }
            if (isDismissible != null)
            {
                codedoutputbytebuffernano.writeBool(2, isDismissible.booleanValue());
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(3, type.intValue());
            }
            if (woblTileDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(4, woblTileDetails);
            }
            if (impressionEvent != null)
            {
                codedoutputbytebuffernano.writeMessage(5, impressionEvent);
            }
            if (dismissEvent != null)
            {
                codedoutputbytebuffernano.writeMessage(6, dismissEvent);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletTile()
        {
            clear();
        }
    }

    public static final class WalletTileGroup extends ExtendableMessageNano
    {

        private static volatile WalletTileGroup _emptyArray[];
        public String anchor;
        public WalletTile tile[];
        public String title;

        private WalletTileGroup clear()
        {
            title = null;
            tile = WalletTile.emptyArray();
            anchor = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static WalletTileGroup[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new WalletTileGroup[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private WalletTileGroup mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    WalletTile awallettile[];
                    int j;
                    if (tile == null)
                    {
                        j = 0;
                    } else
                    {
                        j = tile.length;
                    }
                    awallettile = new WalletTile[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(tile, 0, awallettile, 0, j);
                        k = j;
                    }
                    for (; k < awallettile.length - 1; k++)
                    {
                        awallettile[k] = new WalletTile();
                        codedinputbytebuffernano.readMessage(awallettile[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    awallettile[k] = new WalletTile();
                    codedinputbytebuffernano.readMessage(awallettile[k]);
                    tile = awallettile;
                    break;

                case 26: // '\032'
                    anchor = codedinputbytebuffernano.readString();
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
            if (tile != null)
            {
                j = i;
                if (tile.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= tile.length)
                        {
                            break;
                        }
                        WalletTile wallettile = tile[k];
                        j = i;
                        if (wallettile != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, wallettile);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (anchor != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, anchor);
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
            if (tile != null && tile.length > 0)
            {
                for (int i = 0; i < tile.length; i++)
                {
                    WalletTile wallettile = tile[i];
                    if (wallettile != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, wallettile);
                    }
                }

            }
            if (anchor != null)
            {
                codedoutputbytebuffernano.writeString(3, anchor);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletTileGroup()
        {
            clear();
        }
    }

    public static final class WoblTileDetails extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletObjects.WoblRenderableItem woblRenderableItem;

        private WoblTileDetails clear()
        {
            woblRenderableItem = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WoblTileDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (woblRenderableItem == null)
                    {
                        woblRenderableItem = new com.google.wallet.proto.NanoWalletObjects.WoblRenderableItem();
                    }
                    codedinputbytebuffernano.readMessage(woblRenderableItem);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (woblRenderableItem != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, woblRenderableItem);
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
            if (woblRenderableItem != null)
            {
                codedoutputbytebuffernano.writeMessage(1, woblRenderableItem);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WoblTileDetails()
        {
            clear();
        }
    }

}
