.class Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;
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
    .line 487
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 490
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 491
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPattern()V

    .line 492
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;
    invoke-static {v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$100(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    move-result-object v0

    invoke-interface {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternCleared()V

    .line 493
    return-void
.end method
