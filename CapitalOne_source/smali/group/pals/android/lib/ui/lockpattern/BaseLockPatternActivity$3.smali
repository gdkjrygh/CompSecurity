.class Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;
.super Ljava/lang/Object;
.source "BaseLockPatternActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->doCreatePattern(Ljava/util/List;)V
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
    .line 570
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 573
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 574
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPattern()V

    .line 575
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;
    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;

    move-result-object v1

    # invokes: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V
    invoke-static {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$300(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V

    .line 577
    return-void
.end method
