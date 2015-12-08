.class Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;
.super Ljava/lang/Object;
.source "BaseLockPatternActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 702
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 707
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_save:I

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 709
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_next:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 711
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    .line 713
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_an_unlock_pattern:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 716
    :cond_0
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTag(Ljava/lang/Object;)V

    .line 720
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->enableInput()V

    .line 722
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_an_unlock_pattern_inital_text:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 724
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPattern()V

    .line 726
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;

    move-result-object v1

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 727
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 729
    return-void
.end method
