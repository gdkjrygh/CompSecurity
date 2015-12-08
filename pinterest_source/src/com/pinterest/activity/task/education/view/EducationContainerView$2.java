// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;


// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationContainerView, EducationPromptView

class val.title
    implements Runnable
{

    final EducationContainerView this$0;
    final String val$title;

    public void run()
    {
        EducationContainerView.access$500(EducationContainerView.this).setTitle(val$title);
        class _cls1
            implements Runnable
        {

            final EducationContainerView._cls2 this$1;

            public void run()
            {
                EducationContainerView.access$500(this$0).hidePrompt();
            }

            _cls1()
            {
                this$1 = EducationContainerView._cls2.this;
                super();
            }
        }

        postDelayed(new _cls1(), 2000L);
    }

    _cls1()
    {
        this$0 = final_educationcontainerview;
        val$title = String.this;
        super();
    }
}
