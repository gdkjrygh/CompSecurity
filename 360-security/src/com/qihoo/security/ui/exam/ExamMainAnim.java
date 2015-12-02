// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.exam;


public class ExamMainAnim
{
    public static final class ExamStatus extends Enum
    {

        public static final ExamStatus EXCELLENT;
        public static final ExamStatus IN_DANGER;
        public static final ExamStatus NEED_OPTIMIZE;
        private static final ExamStatus b[];
        private final int a;

        public static ExamStatus valueOf(String s)
        {
            return (ExamStatus)Enum.valueOf(com/qihoo/security/ui/exam/ExamMainAnim$ExamStatus, s);
        }

        public static ExamStatus[] values()
        {
            return (ExamStatus[])b.clone();
        }

        public int getLevel()
        {
            return a;
        }

        public ExamStatus getStatusWithLevel(int i)
        {
            switch (i)
            {
            default:
                return EXCELLENT;

            case 0: // '\0'
                return EXCELLENT;

            case 1: // '\001'
                return NEED_OPTIMIZE;

            case 2: // '\002'
                return IN_DANGER;
            }
        }

        static 
        {
            IN_DANGER = new ExamStatus("IN_DANGER", 0, 2);
            NEED_OPTIMIZE = new ExamStatus("NEED_OPTIMIZE", 1, 1);
            EXCELLENT = new ExamStatus("EXCELLENT", 2, 0);
            b = (new ExamStatus[] {
                IN_DANGER, NEED_OPTIMIZE, EXCELLENT
            });
        }

        private ExamStatus(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }

}
