.class Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;
.super Ljava/lang/Object;
.source "BaseLockPatternActivity.java"

# interfaces
.implements Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;


# direct methods
.method constructor <init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V
    .locals 0

    .prologue
    .line 593
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPatternCellAdded(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 653
    .local p1, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_next:I

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 655
    if-eqz p1, :cond_0

    .line 657
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$400(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    move-result-object v1

    invoke-virtual {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 698
    :cond_0
    :goto_0
    return-void

    .line 662
    :pswitch_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 664
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$300(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 665
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;

    move-result-object v1

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$300(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 669
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 672
    :pswitch_1
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_4_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 676
    :pswitch_2
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_5_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 680
    :pswitch_3
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_6_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 684
    :pswitch_4
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_7_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 688
    :pswitch_5
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_8_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 692
    :pswitch_6
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_password_strength_msg_9_dots:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 657
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 669
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public onPatternCleared()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 624
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    .line 626
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$400(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    move-result-object v1

    invoke-virtual {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 649
    :goto_0
    return-void

    .line 629
    :pswitch_0
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 630
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;

    move-result-object v1

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 632
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_next:I

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    .line 634
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_an_unlock_pattern_inital_text:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 636
    :cond_0
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_redraw_pattern_to_confirm:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 640
    :pswitch_1
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_ELI_compare_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 641
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->headerContainer:Landroid/view/View;

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 642
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 643
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 644
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->ELI_LockImage:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 645
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    sget v3, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_pattern_to_unlock:I

    invoke-virtual {v2, v3}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v2, v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 626
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onPatternDetected(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 612
    .local p1, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$400(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    move-result-object v1

    invoke-virtual {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 620
    :goto_0
    return-void

    .line 614
    :pswitch_0
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->doCreatePattern(Ljava/util/List;)V
    invoke-static {v0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$600(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Ljava/util/List;)V

    goto :goto_0

    .line 617
    :pswitch_1
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->doComparePattern(Ljava/util/List;)V
    invoke-static {v0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$700(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Ljava/util/List;)V

    goto :goto_0

    .line 612
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onPatternStart()V
    .locals 2

    .prologue
    .line 597
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    .line 599
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    invoke-static {v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$400(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    move-result-object v0

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    if-ne v0, v1, :cond_0

    .line 602
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 603
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;

    move-result-object v1

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 605
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_next:I

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    .line 608
    :cond_0
    return-void
.end method
