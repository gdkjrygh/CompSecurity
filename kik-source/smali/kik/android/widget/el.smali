.class final Lkik/android/widget/el;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lkik/android/widget/VideoController;


# direct methods
.method constructor <init>(Lkik/android/widget/VideoController;)V
    .locals 0

    .prologue
    .line 514
    iput-object p1, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .prologue
    .line 531
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v0}, Lkik/android/widget/VideoController;->c(Lkik/android/widget/VideoController;)Lkik/android/widget/VideoController$a;

    move-result-object v0

    if-nez v0, :cond_1

    .line 545
    :cond_0
    :goto_0
    return-void

    .line 535
    :cond_1
    if-eqz p3, :cond_0

    .line 541
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v0}, Lkik/android/widget/VideoController;->c(Lkik/android/widget/VideoController;)Lkik/android/widget/VideoController$a;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/widget/VideoController$a;->c()I

    move-result v0

    int-to-long v0, v0

    .line 542
    int-to-long v2, p2

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 543
    iget-object v2, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v2}, Lkik/android/widget/VideoController;->d(Lkik/android/widget/VideoController;)Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 544
    iget-object v2, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v2}, Lkik/android/widget/VideoController;->d(Lkik/android/widget/VideoController;)Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    long-to-int v0, v0

    invoke-static {v3, v0}, Lkik/android/widget/VideoController;->a(Lkik/android/widget/VideoController;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 518
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    const v1, 0x36ee80

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoController;->a(I)V

    .line 519
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/VideoController;->a(Lkik/android/widget/VideoController;Z)Z

    .line 526
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v0}, Lkik/android/widget/VideoController;->b(Lkik/android/widget/VideoController;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 527
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 549
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v0, v1}, Lkik/android/widget/VideoController;->a(Lkik/android/widget/VideoController;Z)Z

    .line 550
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->d()I

    .line 551
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->e()V

    .line 552
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoController;->a(I)V

    .line 557
    iget-object v0, p0, Lkik/android/widget/el;->a:Lkik/android/widget/VideoController;

    invoke-static {v0}, Lkik/android/widget/VideoController;->b(Lkik/android/widget/VideoController;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 558
    return-void
.end method
