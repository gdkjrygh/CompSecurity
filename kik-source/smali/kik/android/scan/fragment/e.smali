.class final Lkik/android/scan/fragment/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/k$b;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lkik/android/chat/activity/k$b;)V
    .locals 0

    .prologue
    .line 529
    iput-object p1, p0, Lkik/android/scan/fragment/e;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/e;->a:Lkik/android/chat/activity/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 533
    iget-object v0, p0, Lkik/android/scan/fragment/e;->a:Lkik/android/chat/activity/k$b;

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v1

    .line 534
    iget-object v0, p0, Lkik/android/scan/fragment/e;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->j(Lkik/android/scan/fragment/ScanFragment;)Lkik/android/scan/fragment/ScanFragment$b;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/scan/fragment/ScanFragment$b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 536
    :goto_0
    new-instance v2, Lkik/android/scan/fragment/f;

    invoke-direct {v2, p0, v0}, Lkik/android/scan/fragment/f;-><init>(Lkik/android/scan/fragment/e;Z)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 545
    return-void

    .line 534
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
