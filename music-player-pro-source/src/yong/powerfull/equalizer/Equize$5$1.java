// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

// Referenced classes of package yong.powerfull.equalizer:
//            Equize, MySeekBar

class _3B_
    implements android.content.face.OnClickListener
{

    final QLevel this$1;
    private final MySeekBar val$equizeBar[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Equize.access$4(_fld0).setText(Equize.access$5(_fld0)[i]);
        int j = 0;
        do
        {
            if (j > 4)
            {
                return;
            }
            val$equizeBar[j].setProgress(presetEQ[i][j] + maxEQLevel);
            j++;
        } while (true);
    }

    _3B_()
    {
        this$1 = final__p3b_;
        val$equizeBar = _5B_Lyong.powerfull.equalizer.MySeekBar_3B_.this;
        super();
    }

    // Unreferenced inner class yong/powerfull/equalizer/Equize$5

/* anonymous class */
    class Equize._cls5
        implements android.view.View.OnClickListener
    {

        final Equize this$0;
        private final MySeekBar val$equizeBar[];

        public void onClick(View view)
        {
            choose = true;
            (new android.app.AlertDialog.Builder(Equize.this)).setItems(Equize.access$5(Equize.this), equizeBar. new Equize._cls5._cls1()).create().show();
        }


            
            {
                this$0 = final_equize;
                equizeBar = _5B_Lyong.powerfull.equalizer.MySeekBar_3B_.this;
                super();
            }
    }

}
