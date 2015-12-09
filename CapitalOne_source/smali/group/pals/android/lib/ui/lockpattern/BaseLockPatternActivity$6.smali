.class Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;
.super Ljava/lang/Object;
.source "BaseLockPatternActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 792
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 796
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPattern()V

    .line 797
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    # getter for: Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;
    invoke-static {v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->access$100(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    move-result-object v0

    invoke-interface {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternCleared()V

    .line 798
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;->this$0:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setEnabled(Z)V

    .line 799
    return-void
.end method
