// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            n

public interface o
{

    public abstract void a(n n, com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException recognitionfailedexception);

    public abstract void a(n n, StrokeList strokelist, RecognitionResult recognitionresult);
}
