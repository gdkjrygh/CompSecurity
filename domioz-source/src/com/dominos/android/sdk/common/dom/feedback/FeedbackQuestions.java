// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;

import com.dominos.android.sdk.common.core.ListNode;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Xml;
import com.google.a.b.av;
import com.google.a.b.aw;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.dom.feedback:
//            FeedbackQuestion

public class FeedbackQuestions
{

    private final av questions;

    private FeedbackQuestions(av av1)
    {
        questions = av1;
    }

    FeedbackQuestions(av av1, _cls1 _pcls1)
    {
        this(av1);
    }

    public static FeedbackQuestions from(String s)
    {
        return from((new MapNode(Xml.parse(s))).get("Envelope").get("Body").get("GetFeedbackQuestionsResponse").asMap());
    }

    public static FeedbackQuestions from(Map map)
    {
        Object obj = new MapNode(map);
        map = av.h();
        FeedbackQuestion feedbackquestion;
        for (obj = ((MapNode) (obj)).get("Questions").getList("Question").iterator(); ((Iterator) (obj)).hasNext(); map.a(feedbackquestion.getCode(), feedbackquestion))
        {
            feedbackquestion = FeedbackQuestion.from(((MapNode)((Iterator) (obj)).next()).asMap());
        }

        return (new Builder()).setQuestions(map.a()).build();
    }

    public av getQuestions()
    {
        return questions;
    }

    private class Builder
    {

        private av questions;

        public FeedbackQuestions build()
        {
            return new FeedbackQuestions(questions, null);
        }

        public Builder setQuestions(av av1)
        {
            questions = av1;
            return this;
        }

        public Builder()
        {
            questions = av.g();
        }
    }

}
