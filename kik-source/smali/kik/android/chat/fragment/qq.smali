.class final Lkik/android/chat/fragment/qq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ScanCodeTabFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lkik/android/chat/fragment/qq;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .prologue
    .line 270
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 275
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 280
    if-nez p1, :cond_0

    .line 291
    :goto_0
    return-void

    .line 283
    :cond_0
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getMax()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_1

    .line 284
    iget-object v0, p0, Lkik/android/chat/fragment/qq;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->i(Lkik/android/chat/fragment/ScanCodeTabFragment;)V

    .line 285
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0

    .line 288
    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getMax()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 289
    iget-object v0, p0, Lkik/android/chat/fragment/qq;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->d()V

    goto :goto_0
.end method
