// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.skype.ContactImpl;
import com.skype.Message;
import com.skype.MessageAnnotation;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            AnnotationUtil, HeartsDialogAdapter

public class HeartsDialog extends SkypeDialogFragment
{

    AnnotationUtil annotationUtil;
    ContactUtil contactUtil;
    ImageCache imageCache;
    SkyLib lib;
    private Message message;

    public HeartsDialog()
    {
    }

    private List getContactList(Message message1)
    {
        ArrayList arraylist = new ArrayList();
        message1 = message1.getAnnotations(com.skype.MessageAnnotation.TYPE.EMOTICON);
        if (((com.skype.Message.GetAnnotations_Result) (message1)).m_annotationObjectIDList != null && ((com.skype.Message.GetAnnotations_Result) (message1)).m_annotationObjectIDList.length > 0)
        {
            for (int i = 0; i < ((com.skype.Message.GetAnnotations_Result) (message1)).m_annotationObjectIDList.length; i++)
            {
                Object obj = annotationUtil.getAnnotationObj(message1, i);
                if (!((MessageAnnotation) (obj)).getKeyProp().contentEquals("heart"))
                {
                    continue;
                }
                obj = ((MessageAnnotation) (obj)).getAuthorProp();
                ContactImpl contactimpl = new ContactImpl();
                if (lib.getContact(((String) (obj)), contactimpl))
                {
                    arraylist.add(contactimpl);
                }
            }

        }
        return arraylist;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        message = (Message)getObjectInterface(com/skype/Message);
        int i = annotationUtil.getAnnotationCount(message, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
        bundle = new HeartsDialogAdapter(contactUtil, getActivity(), (ArrayList)getContactList(message), imageCache);
        android.support.v7.app.AlertDialog.a a = getMaterialDialogBuilder(getActivity());
        a.a(bundle, null);
        a.a(getContext().getString(0x7f08055f, new Object[] {
            Integer.valueOf(i)
        }));
        a.b(0x7f0802f6, null);
        return a.c();
    }
}
