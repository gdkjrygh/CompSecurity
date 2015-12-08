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

public interface NanoWalletNavigation
{
    public static final class DisplayNode extends ExtendableMessageNano
    {

        public String accessibilityLabel;
        public String iconUrl;
        public String id;
        public String title;
        public String value;

        private DisplayNode clear()
        {
            id = null;
            title = null;
            iconUrl = null;
            accessibilityLabel = null;
            value = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayNode mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    iconUrl = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    accessibilityLabel = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    value = codedinputbytebuffernano.readString();
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
            if (title != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
            i = j;
            if (iconUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, iconUrl);
            }
            j = i;
            if (accessibilityLabel != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, accessibilityLabel);
            }
            i = j;
            if (value != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, value);
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (iconUrl != null)
            {
                codedoutputbytebuffernano.writeString(3, iconUrl);
            }
            if (accessibilityLabel != null)
            {
                codedoutputbytebuffernano.writeString(4, accessibilityLabel);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(5, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayNode()
        {
            clear();
        }
    }

    public static final class FetchNavigationRequest extends ExtendableMessageNano
    {

        public Integer theme;
        public byte token[];

        private FetchNavigationRequest clear()
        {
            token = null;
            theme = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchNavigationRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       40: 62;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            token = codedinputbytebuffernano.readBytes();
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                theme = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (token != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, token);
            }
            j = i;
            if (theme != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(5, theme.intValue());
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
            if (token != null)
            {
                codedoutputbytebuffernano.writeBytes(1, token);
            }
            if (theme != null)
            {
                codedoutputbytebuffernano.writeInt32(5, theme.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchNavigationRequest()
        {
            clear();
        }
    }

    public static final class FetchNavigationResponse extends ExtendableMessageNano
    {

        public byte token[];
        public TopNavigation topNavigation;

        private FetchNavigationResponse clear()
        {
            topNavigation = null;
            token = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchNavigationResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (topNavigation == null)
                    {
                        topNavigation = new TopNavigation();
                    }
                    codedinputbytebuffernano.readMessage(topNavigation);
                    break;

                case 18: // '\022'
                    token = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (topNavigation != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, topNavigation);
            }
            j = i;
            if (token != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(2, token);
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
            if (topNavigation != null)
            {
                codedoutputbytebuffernano.writeMessage(1, topNavigation);
            }
            if (token != null)
            {
                codedoutputbytebuffernano.writeBytes(2, token);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchNavigationResponse()
        {
            clear();
        }
    }

    public static final class NavigationGroup extends ExtendableMessageNano
    {

        private static volatile NavigationGroup _emptyArray[];
        public DisplayNode header;
        public NavigationNode navigationNode[];

        private NavigationGroup clear()
        {
            header = null;
            navigationNode = NavigationNode.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static NavigationGroup[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new NavigationGroup[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private NavigationGroup mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (header == null)
                    {
                        header = new DisplayNode();
                    }
                    codedinputbytebuffernano.readMessage(header);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    NavigationNode anavigationnode[];
                    int j;
                    if (navigationNode == null)
                    {
                        j = 0;
                    } else
                    {
                        j = navigationNode.length;
                    }
                    anavigationnode = new NavigationNode[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(navigationNode, 0, anavigationnode, 0, j);
                        k = j;
                    }
                    for (; k < anavigationnode.length - 1; k++)
                    {
                        anavigationnode[k] = new NavigationNode();
                        codedinputbytebuffernano.readMessage(anavigationnode[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    anavigationnode[k] = new NavigationNode();
                    codedinputbytebuffernano.readMessage(anavigationnode[k]);
                    navigationNode = anavigationnode;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (header != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, header);
            }
            int l = i;
            if (navigationNode != null)
            {
                l = i;
                if (navigationNode.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= navigationNode.length)
                        {
                            break;
                        }
                        NavigationNode navigationnode = navigationNode[k];
                        l = i;
                        if (navigationnode != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, navigationnode);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (header != null)
            {
                codedoutputbytebuffernano.writeMessage(1, header);
            }
            if (navigationNode != null && navigationNode.length > 0)
            {
                for (int i = 0; i < navigationNode.length; i++)
                {
                    NavigationNode navigationnode = navigationNode[i];
                    if (navigationnode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, navigationnode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NavigationGroup()
        {
            clear();
        }
    }

    public static final class NavigationNode extends ExtendableMessageNano
    {

        private static volatile NavigationNode _emptyArray[];
        public SecondaryNavigationNode child[];
        public DisplayNode display;
        public String uri;

        private NavigationNode clear()
        {
            display = null;
            uri = null;
            child = SecondaryNavigationNode.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static NavigationNode[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new NavigationNode[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private NavigationNode mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (display == null)
                    {
                        display = new DisplayNode();
                    }
                    codedinputbytebuffernano.readMessage(display);
                    break;

                case 18: // '\022'
                    uri = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    SecondaryNavigationNode asecondarynavigationnode[];
                    int j;
                    if (child == null)
                    {
                        j = 0;
                    } else
                    {
                        j = child.length;
                    }
                    asecondarynavigationnode = new SecondaryNavigationNode[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(child, 0, asecondarynavigationnode, 0, j);
                        k = j;
                    }
                    for (; k < asecondarynavigationnode.length - 1; k++)
                    {
                        asecondarynavigationnode[k] = new SecondaryNavigationNode();
                        codedinputbytebuffernano.readMessage(asecondarynavigationnode[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    asecondarynavigationnode[k] = new SecondaryNavigationNode();
                    codedinputbytebuffernano.readMessage(asecondarynavigationnode[k]);
                    child = asecondarynavigationnode;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (display != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, display);
            }
            i = j;
            if (uri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, uri);
            }
            int l = i;
            if (child != null)
            {
                l = i;
                if (child.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= child.length)
                        {
                            break;
                        }
                        SecondaryNavigationNode secondarynavigationnode = child[k];
                        l = i;
                        if (secondarynavigationnode != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, secondarynavigationnode);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (display != null)
            {
                codedoutputbytebuffernano.writeMessage(1, display);
            }
            if (uri != null)
            {
                codedoutputbytebuffernano.writeString(2, uri);
            }
            if (child != null && child.length > 0)
            {
                for (int i = 0; i < child.length; i++)
                {
                    SecondaryNavigationNode secondarynavigationnode = child[i];
                    if (secondarynavigationnode != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, secondarynavigationnode);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NavigationNode()
        {
            clear();
        }
    }

    public static final class SecondaryNavigationNode extends ExtendableMessageNano
    {

        private static volatile SecondaryNavigationNode _emptyArray[];
        public DisplayNode display;
        public String uri;

        private SecondaryNavigationNode clear()
        {
            display = null;
            uri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SecondaryNavigationNode[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SecondaryNavigationNode[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SecondaryNavigationNode mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (display == null)
                    {
                        display = new DisplayNode();
                    }
                    codedinputbytebuffernano.readMessage(display);
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
            if (display != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, display);
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
            if (display != null)
            {
                codedoutputbytebuffernano.writeMessage(1, display);
            }
            if (uri != null)
            {
                codedoutputbytebuffernano.writeString(2, uri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SecondaryNavigationNode()
        {
            clear();
        }
    }

    public static final class TopNavigation extends ExtendableMessageNano
    {

        public NavigationGroup navigationGroup[];

        private TopNavigation clear()
        {
            navigationGroup = NavigationGroup.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TopNavigation mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    NavigationGroup anavigationgroup[];
                    int j;
                    if (navigationGroup == null)
                    {
                        j = 0;
                    } else
                    {
                        j = navigationGroup.length;
                    }
                    anavigationgroup = new NavigationGroup[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(navigationGroup, 0, anavigationgroup, 0, j);
                        k = j;
                    }
                    for (; k < anavigationgroup.length - 1; k++)
                    {
                        anavigationgroup[k] = new NavigationGroup();
                        codedinputbytebuffernano.readMessage(anavigationgroup[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    anavigationgroup[k] = new NavigationGroup();
                    codedinputbytebuffernano.readMessage(anavigationgroup[k]);
                    navigationGroup = anavigationgroup;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (navigationGroup != null)
            {
                k = i;
                if (navigationGroup.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= navigationGroup.length)
                        {
                            break;
                        }
                        NavigationGroup navigationgroup = navigationGroup[j];
                        k = i;
                        if (navigationgroup != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, navigationgroup);
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
            if (navigationGroup != null && navigationGroup.length > 0)
            {
                for (int i = 0; i < navigationGroup.length; i++)
                {
                    NavigationGroup navigationgroup = navigationGroup[i];
                    if (navigationgroup != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, navigationgroup);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TopNavigation()
        {
            clear();
        }
    }

}
