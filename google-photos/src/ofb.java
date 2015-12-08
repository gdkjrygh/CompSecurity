// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ofb extends ofh
{

    ofb(oej oej)
    {
    }

    final void b(msm msm, qzv qzv, qyw qyw1)
    {
        msm = (ogy)msm;
        qyw1.b = new qzp();
        if (((ogy) (msm)).d.size() > 0)
        {
            qyw1.b.c = new int[((ogy) (msm)).d.size()];
            for (int i = 0; i < ((ogy) (msm)).d.size(); i++)
            {
                qyw1.b.c[i] = ((Integer)((ogy) (msm)).d.get(i)).intValue();
            }

        } else
        {
            qyw1.b.a = (String[])((ogy) (msm)).b.toArray(new String[((ogy) (msm)).b.size()]);
            qyw1.b.b = (String[])((ogy) (msm)).c.toArray(new String[((ogy) (msm)).c.size()]);
        }
    }
}
