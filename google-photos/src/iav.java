// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.photos.settings.DataStatsFragment;

public final class iav
    implements android.view.View.OnLongClickListener
{

    private DataStatsFragment a;

    public iav(DataStatsFragment datastatsfragment)
    {
        a = datastatsfragment;
        super();
    }

    public final boolean onLongClick(View view)
    {
        ((ClipboardManager)a.O_().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("library_stats", DataStatsFragment.a(a).getText()));
        Toast.makeText(a.O_(), "Statistics copied to clipboard", 0).show();
        return true;
    }
}
