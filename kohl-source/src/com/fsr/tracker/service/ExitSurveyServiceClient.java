// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.service;


// Referenced classes of package com.fsr.tracker.service:
//            Callback

public interface ExitSurveyServiceClient
{
    public static final class ValidationResult extends Enum
    {

        private static final ValidationResult $VALUES[];
        public static final ValidationResult INVALID_FORMAT;
        public static final ValidationResult REQUIRED_FIELD;
        public static final ValidationResult SERVER_ERROR;
        public static final ValidationResult UNKNOWN;
        public static final ValidationResult VALID;

        public static ValidationResult valueOf(String s)
        {
            return (ValidationResult)Enum.valueOf(com/fsr/tracker/service/ExitSurveyServiceClient$ValidationResult, s);
        }

        public static ValidationResult[] values()
        {
            return (ValidationResult[])$VALUES.clone();
        }

        static 
        {
            VALID = new ValidationResult("VALID", 0);
            REQUIRED_FIELD = new ValidationResult("REQUIRED_FIELD", 1);
            INVALID_FORMAT = new ValidationResult("INVALID_FORMAT", 2);
            SERVER_ERROR = new ValidationResult("SERVER_ERROR", 3);
            UNKNOWN = new ValidationResult("UNKNOWN", 4);
            $VALUES = (new ValidationResult[] {
                VALID, REQUIRED_FIELD, INVALID_FORMAT, SERVER_ERROR, UNKNOWN
            });
        }

        private ValidationResult(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Void initializeNotification(String s, String s1, String s2, String s3, String s4, Callback callback);
}
