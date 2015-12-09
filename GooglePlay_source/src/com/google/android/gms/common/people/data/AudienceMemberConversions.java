// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.people.data:
//            AudienceMember

public final class AudienceMemberConversions
{

    private static AudienceMember toAudienceMember(com.google.android.gms.common.people.proto.AclProto.SharingTargetId sharingtargetid, String s)
    {
        com.google.android.gms.common.people.proto.AclProtoData.data.CircleMemberId circlememberid = sharingtargetid.personId_;
        if (!sharingtargetid.hasGroupType) goto _L2; else goto _L1
_L1:
        int i = sharingtargetid.groupType_;
        i;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 72
    //                   2 81
    //                   3 87
    //                   4 93;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        throw new IllegalArgumentException((new StringBuilder("Unknown system group type: ")).append(i).toString());
_L4:
        sharingtargetid = "public";
_L8:
        return AudienceMember.forGroup(sharingtargetid, s);
_L5:
        sharingtargetid = "domain";
        continue; /* Loop/switch isn't completed */
_L6:
        sharingtargetid = "myCircles";
        continue; /* Loop/switch isn't completed */
_L7:
        sharingtargetid = "extendedCircles";
        if (true) goto _L8; else goto _L2
_L2:
        if (sharingtargetid.hasCircleId)
        {
            return AudienceMember.forCircle(sharingtargetid.circleId_, s);
        }
        if (circlememberid.hasObfuscatedGaiaId)
        {
            return AudienceMember.forPersonWithGaiaId$4a62ecd5(circlememberid.obfuscatedGaiaId_, s);
        }
        if (circlememberid.hasEmail)
        {
            return AudienceMember.forPersonWithEmail(circlememberid.email_, circlememberid.email_);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unrecognized sharing target (")).append(sharingtargetid).append(")").toString());
        }
    }

    public static List toAudienceMembersFromRenderedSharingRosters(byte abyte0[])
        throws InvalidProtocolBufferMicroException
    {
        abyte0 = (com.google.android.gms.common.people.proto.AclProto.RenderedSharingRosters)(new com.google.android.gms.common.people.proto.AclProto.RenderedSharingRosters()).mergeFrom$e0bd1db(abyte0, abyte0.length);
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        AudienceMember audiencemember;
        for (Iterator iterator = toKnownAudienceMembers(abyte0).iterator(); iterator.hasNext(); hashmap.put(audiencemember, audiencemember))
        {
            audiencemember = (AudienceMember)iterator.next();
        }

        int k = ((com.google.android.gms.common.people.proto.AclProto.RenderedSharingRosters) (abyte0)).resourceSharingRosters_.size();
label0:
        for (int i = 0; i < k; i++)
        {
            Object obj = (com.google.android.gms.common.people.proto.AclProto.ResourceSharingRoster)((com.google.android.gms.common.people.proto.AclProto.RenderedSharingRosters) (abyte0)).resourceSharingRosters_.get(i);
            if (!((com.google.android.gms.common.people.proto.AclProto.ResourceSharingRoster) (obj)).hasSharingRoster)
            {
                continue;
            }
            obj = ((com.google.android.gms.common.people.proto.AclProto.ResourceSharingRoster) (obj)).sharingRoster_;
            int l = ((com.google.android.gms.common.people.proto.AclProto.SharingRoster) (obj)).getSharingTargetIdCount();
            int j = 0;
            do
            {
                if (j >= l)
                {
                    continue label0;
                }
                AudienceMember audiencemember1 = (AudienceMember)hashmap.get(toAudienceMember(((com.google.android.gms.common.people.proto.AclProto.SharingRoster) (obj)).getSharingTargetId(j), null));
                if (audiencemember1 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder("No rendered information for ")).append(audiencemember1).append(" available.").toString());
                }
                arraylist.add(audiencemember1);
                j++;
            } while (true);
        }

        return arraylist;
    }

    private static List toKnownAudienceMembers(com.google.android.gms.common.people.proto.AclProto.RenderedSharingRosters renderedsharingrosters)
    {
        ArrayList arraylist = new ArrayList();
        int j = renderedsharingrosters.targets_.size();
        for (int i = 0; i < j; i++)
        {
            com.google.android.gms.common.people.proto.AclProto.SharingTarget sharingtarget = (com.google.android.gms.common.people.proto.AclProto.SharingTarget)renderedsharingrosters.targets_.get(i);
            arraylist.add(toAudienceMember(sharingtarget.id_, sharingtarget.displayName_));
        }

        return arraylist;
    }
}
