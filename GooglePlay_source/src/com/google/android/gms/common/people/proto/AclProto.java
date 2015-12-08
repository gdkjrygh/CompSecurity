// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.proto;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class AclProto
{
    public static final class ApplicationSharingPolicy extends MessageMicro
    {

        private boolean allowSquares_;
        private List allowedGroupType_;
        private int applicationId_;
        private int cachedSize;
        private boolean hasAllowSquares;
        private boolean hasApplicationId;
        private boolean hasShowUnderageWarnings;
        private boolean showUnderageWarnings_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int i = 0;
            for (Iterator iterator = allowedGroupType_.iterator(); iterator.hasNext();)
            {
                i += CodedOutputStreamMicro.computeInt32SizeNoTag(((Integer)iterator.next()).intValue());
            }

            int j = i + 0 + allowedGroupType_.size() * 1;
            i = j;
            if (hasShowUnderageWarnings)
            {
                i = j + (CodedOutputStreamMicro.computeTagSize(2) + 1);
            }
            j = i;
            if (hasAllowSquares)
            {
                j = i + (CodedOutputStreamMicro.computeTagSize(3) + 1);
            }
            i = j;
            if (hasApplicationId)
            {
                i = j + CodedOutputStreamMicro.computeInt32Size(4, applicationId_);
            }
            cachedSize = i;
            return i;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    int j = codedinputstreammicro.readRawVarint32();
                    if (allowedGroupType_.isEmpty())
                    {
                        allowedGroupType_ = new ArrayList();
                    }
                    allowedGroupType_.add(Integer.valueOf(j));
                    break;

                case 16: // '\020'
                    boolean flag = codedinputstreammicro.readBool();
                    hasShowUnderageWarnings = true;
                    showUnderageWarnings_ = flag;
                    break;

                case 24: // '\030'
                    boolean flag1 = codedinputstreammicro.readBool();
                    hasAllowSquares = true;
                    allowSquares_ = flag1;
                    break;

                case 32: // ' '
                    int k = codedinputstreammicro.readRawVarint32();
                    hasApplicationId = true;
                    applicationId_ = k;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            for (Iterator iterator = allowedGroupType_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeInt32(1, ((Integer)iterator.next()).intValue())) { }
            if (hasShowUnderageWarnings)
            {
                codedoutputstreammicro.writeBool(2, showUnderageWarnings_);
            }
            if (hasAllowSquares)
            {
                codedoutputstreammicro.writeBool(3, allowSquares_);
            }
            if (hasApplicationId)
            {
                codedoutputstreammicro.writeInt32(4, applicationId_);
            }
        }

        public ApplicationSharingPolicy()
        {
            applicationId_ = 1;
            allowedGroupType_ = Collections.emptyList();
            showUnderageWarnings_ = true;
            allowSquares_ = true;
            cachedSize = -1;
        }
    }

    public static final class RenderedSharingRosters extends MessageMicro
    {

        private List applicationPolicies_;
        private int cachedSize;
        public List resourceSharingRosters_;
        public List targets_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int i = 0;
            for (Iterator iterator = resourceSharingRosters_.iterator(); iterator.hasNext();)
            {
                i += CodedOutputStreamMicro.computeMessageSize(1, (ResourceSharingRoster)iterator.next());
            }

            for (Iterator iterator1 = applicationPolicies_.iterator(); iterator1.hasNext();)
            {
                i += CodedOutputStreamMicro.computeMessageSize(2, (ApplicationSharingPolicy)iterator1.next());
            }

            for (Iterator iterator2 = targets_.iterator(); iterator2.hasNext();)
            {
                i += CodedOutputStreamMicro.computeMessageSize(3, (SharingTarget)iterator2.next());
            }

            cachedSize = i;
            return i;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    ResourceSharingRoster resourcesharingroster = new ResourceSharingRoster();
                    codedinputstreammicro.readMessage(resourcesharingroster);
                    if (resourceSharingRosters_.isEmpty())
                    {
                        resourceSharingRosters_ = new ArrayList();
                    }
                    resourceSharingRosters_.add(resourcesharingroster);
                    break;

                case 18: // '\022'
                    ApplicationSharingPolicy applicationsharingpolicy = new ApplicationSharingPolicy();
                    codedinputstreammicro.readMessage(applicationsharingpolicy);
                    if (applicationPolicies_.isEmpty())
                    {
                        applicationPolicies_ = new ArrayList();
                    }
                    applicationPolicies_.add(applicationsharingpolicy);
                    break;

                case 26: // '\032'
                    SharingTarget sharingtarget = new SharingTarget();
                    codedinputstreammicro.readMessage(sharingtarget);
                    if (targets_.isEmpty())
                    {
                        targets_ = new ArrayList();
                    }
                    targets_.add(sharingtarget);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            for (Iterator iterator = resourceSharingRosters_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeMessage(1, (ResourceSharingRoster)iterator.next())) { }
            for (Iterator iterator1 = applicationPolicies_.iterator(); iterator1.hasNext(); codedoutputstreammicro.writeMessage(2, (ApplicationSharingPolicy)iterator1.next())) { }
            for (Iterator iterator2 = targets_.iterator(); iterator2.hasNext(); codedoutputstreammicro.writeMessage(3, (SharingTarget)iterator2.next())) { }
        }

        public RenderedSharingRosters()
        {
            resourceSharingRosters_ = Collections.emptyList();
            applicationPolicies_ = Collections.emptyList();
            targets_ = Collections.emptyList();
            cachedSize = -1;
        }
    }

    public static final class ResourceSharingRoster extends MessageMicro
    {

        private int cachedSize;
        private boolean hasId;
        public boolean hasSharingRoster;
        private SharedResourceId id_;
        public SharingRoster sharingRoster_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int i = 0;
            if (hasId)
            {
                i = CodedOutputStreamMicro.computeMessageSize(1, id_) + 0;
            }
            int j = i;
            if (hasSharingRoster)
            {
                j = i + CodedOutputStreamMicro.computeMessageSize(2, sharingRoster_);
            }
            cachedSize = j;
            return j;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    SharedResourceId sharedresourceid = new SharedResourceId();
                    codedinputstreammicro.readMessage(sharedresourceid);
                    hasId = true;
                    id_ = sharedresourceid;
                    break;

                case 18: // '\022'
                    SharingRoster sharingroster = new SharingRoster();
                    codedinputstreammicro.readMessage(sharingroster);
                    hasSharingRoster = true;
                    sharingRoster_ = sharingroster;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            if (hasId)
            {
                codedoutputstreammicro.writeMessage(1, id_);
            }
            if (hasSharingRoster)
            {
                codedoutputstreammicro.writeMessage(2, sharingRoster_);
            }
        }

        public ResourceSharingRoster()
        {
            id_ = null;
            sharingRoster_ = null;
            cachedSize = -1;
        }
    }

    public static final class SharedResourceId extends MessageMicro
    {

        private int applicationId_;
        private int cachedSize;
        private boolean hasApplicationId;
        private boolean hasItemId;
        private String itemId_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int i = 0;
            if (hasApplicationId)
            {
                i = CodedOutputStreamMicro.computeInt32Size(1, applicationId_) + 0;
            }
            int j = i;
            if (hasItemId)
            {
                j = i + CodedOutputStreamMicro.computeStringSize(2, itemId_);
            }
            cachedSize = j;
            return j;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    int j = codedinputstreammicro.readRawVarint32();
                    hasApplicationId = true;
                    applicationId_ = j;
                    break;

                case 18: // '\022'
                    String s = codedinputstreammicro.readString();
                    hasItemId = true;
                    itemId_ = s;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            if (hasApplicationId)
            {
                codedoutputstreammicro.writeInt32(1, applicationId_);
            }
            if (hasItemId)
            {
                codedoutputstreammicro.writeString(2, itemId_);
            }
        }

        public SharedResourceId()
        {
            applicationId_ = 1;
            itemId_ = "";
            cachedSize = -1;
        }
    }

    public static final class SharingRoster extends MessageMicro
    {

        private int cachedSize;
        private boolean hasRequiredScopeId;
        private SharingTargetId requiredScopeId_;
        private List sharingTargetId_;

        public final SharingRoster addSharingTargetId(SharingTargetId sharingtargetid)
        {
            if (sharingTargetId_.isEmpty())
            {
                sharingTargetId_ = new ArrayList();
            }
            sharingTargetId_.add(sharingtargetid);
            return this;
        }

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int i = 0;
            for (Iterator iterator = sharingTargetId_.iterator(); iterator.hasNext();)
            {
                i += CodedOutputStreamMicro.computeMessageSize(1, (SharingTargetId)iterator.next());
            }

            int j = i;
            if (hasRequiredScopeId)
            {
                j = i + CodedOutputStreamMicro.computeMessageSize(2, requiredScopeId_);
            }
            cachedSize = j;
            return j;
        }

        public final SharingTargetId getSharingTargetId(int i)
        {
            return (SharingTargetId)sharingTargetId_.get(i);
        }

        public final int getSharingTargetIdCount()
        {
            return sharingTargetId_.size();
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    SharingTargetId sharingtargetid = new SharingTargetId();
                    codedinputstreammicro.readMessage(sharingtargetid);
                    addSharingTargetId(sharingtargetid);
                    break;

                case 18: // '\022'
                    SharingTargetId sharingtargetid1 = new SharingTargetId();
                    codedinputstreammicro.readMessage(sharingtargetid1);
                    hasRequiredScopeId = true;
                    requiredScopeId_ = sharingtargetid1;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            for (Iterator iterator = sharingTargetId_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeMessage(1, (SharingTargetId)iterator.next())) { }
            if (hasRequiredScopeId)
            {
                codedoutputstreammicro.writeMessage(2, requiredScopeId_);
            }
        }

        public SharingRoster()
        {
            sharingTargetId_ = Collections.emptyList();
            requiredScopeId_ = null;
            cachedSize = -1;
        }
    }

    public static final class SharingTarget extends MessageMicro
    {

        private int cachedSize;
        public String displayName_;
        private String email_;
        private boolean hasDisplayName;
        private boolean hasEmail;
        private boolean hasId;
        public SharingTargetId id_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int j = 0;
            if (hasId)
            {
                j = CodedOutputStreamMicro.computeMessageSize(1, id_) + 0;
            }
            int i = j;
            if (hasDisplayName)
            {
                i = j + CodedOutputStreamMicro.computeStringSize(2, displayName_);
            }
            j = i;
            if (hasEmail)
            {
                j = i + CodedOutputStreamMicro.computeStringSize(3, email_);
            }
            cachedSize = j;
            return j;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    SharingTargetId sharingtargetid = new SharingTargetId();
                    codedinputstreammicro.readMessage(sharingtargetid);
                    hasId = true;
                    id_ = sharingtargetid;
                    break;

                case 18: // '\022'
                    String s = codedinputstreammicro.readString();
                    hasDisplayName = true;
                    displayName_ = s;
                    break;

                case 26: // '\032'
                    String s1 = codedinputstreammicro.readString();
                    hasEmail = true;
                    email_ = s1;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            if (hasId)
            {
                codedoutputstreammicro.writeMessage(1, id_);
            }
            if (hasDisplayName)
            {
                codedoutputstreammicro.writeString(2, displayName_);
            }
            if (hasEmail)
            {
                codedoutputstreammicro.writeString(3, email_);
            }
        }

        public SharingTarget()
        {
            id_ = null;
            displayName_ = "";
            email_ = "";
            cachedSize = -1;
        }
    }

    public static final class SharingTargetId extends MessageMicro
    {

        private int cachedSize;
        public String circleId_;
        public int groupType_;
        public boolean hasCircleId;
        public boolean hasGroupType;
        private boolean hasPersonId;
        public AclProtoData.data.CircleMemberId personId_;

        public final int getCachedSize()
        {
            if (cachedSize < 0)
            {
                getSerializedSize();
            }
            return cachedSize;
        }

        public final int getSerializedSize()
        {
            int j = 0;
            if (hasPersonId)
            {
                j = CodedOutputStreamMicro.computeMessageSize(1, personId_) + 0;
            }
            int i = j;
            if (hasCircleId)
            {
                i = j + CodedOutputStreamMicro.computeStringSize(2, circleId_);
            }
            j = i;
            if (hasGroupType)
            {
                j = i + CodedOutputStreamMicro.computeInt32Size(3, groupType_);
            }
            cachedSize = j;
            return j;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
            do
            {
                int i = codedinputstreammicro.readTag();
                switch (i)
                {
                default:
                    if (codedinputstreammicro.skipField(i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    AclProtoData.data.CircleMemberId circlememberid = new AclProtoData.data.CircleMemberId();
                    codedinputstreammicro.readMessage(circlememberid);
                    setPersonId(circlememberid);
                    break;

                case 18: // '\022'
                    setCircleId(codedinputstreammicro.readString());
                    break;

                case 24: // '\030'
                    setGroupType(codedinputstreammicro.readRawVarint32());
                    break;
                }
            } while (true);
        }

        public final SharingTargetId setCircleId(String s)
        {
            hasCircleId = true;
            circleId_ = s;
            return this;
        }

        public final SharingTargetId setGroupType(int i)
        {
            hasGroupType = true;
            groupType_ = i;
            return this;
        }

        public final SharingTargetId setPersonId(AclProtoData.data.CircleMemberId circlememberid)
        {
            hasPersonId = true;
            personId_ = circlememberid;
            return this;
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
            throws IOException
        {
            if (hasPersonId)
            {
                codedoutputstreammicro.writeMessage(1, personId_);
            }
            if (hasCircleId)
            {
                codedoutputstreammicro.writeString(2, circleId_);
            }
            if (hasGroupType)
            {
                codedoutputstreammicro.writeInt32(3, groupType_);
            }
        }

        public SharingTargetId()
        {
            personId_ = null;
            circleId_ = "";
            groupType_ = 1;
            cachedSize = -1;
        }
    }

}
