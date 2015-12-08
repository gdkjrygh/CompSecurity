// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//            EditorCompatGingerbread

public class SharedPreferencesCompat
{
    public static class EditorCompat
    {

        private static EditorCompat sInstance;
        private final Helper mHelper;

        public static EditorCompat getInstance()
        {
            if (sInstance == null)
            {
                sInstance = new EditorCompat();
            }
            return sInstance;
        }

        public void apply(android.content.SharedPreferences.Editor editor)
        {
            mHelper.apply(editor);
        }

        private EditorCompat()
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                mHelper = new EditorHelperApi9Impl();
                return;
            } else
            {
                mHelper = new EditorHelperBaseImpl();
                return;
            }
        }
    }

    private static class EditorCompat.EditorHelperApi9Impl
        implements EditorCompat.Helper
    {

        public void apply(android.content.SharedPreferences.Editor editor)
        {
            EditorCompatGingerbread.apply(editor);
        }

        private EditorCompat.EditorHelperApi9Impl()
        {
        }

    }

    private static class EditorCompat.EditorHelperBaseImpl
        implements EditorCompat.Helper
    {

        public void apply(android.content.SharedPreferences.Editor editor)
        {
            editor.commit();
        }

        private EditorCompat.EditorHelperBaseImpl()
        {
        }

    }

    private static interface EditorCompat.Helper
    {

        public abstract void apply(android.content.SharedPreferences.Editor editor);
    }


    public SharedPreferencesCompat()
    {
    }
}
