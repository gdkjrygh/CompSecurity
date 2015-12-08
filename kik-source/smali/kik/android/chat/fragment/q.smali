.class final Lkik/android/chat/fragment/q;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 4

    .prologue
    .line 1231
    iput-object p1, p0, Lkik/android/chat/fragment/q;->a:Lkik/android/chat/fragment/CameraFragment;

    const-wide/16 v0, 0x3a98

    const-wide/16 v2, 0xa

    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 1

    .prologue
    .line 1243
    iget-object v0, p0, Lkik/android/chat/fragment/q;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/CameraFragment;->b()V

    .line 1244
    return-void
.end method

.method public final onTick(J)V
    .locals 5

    .prologue
    .line 1235
    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x3a98

    sub-long/2addr v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    .line 1236
    iget-object v1, p0, Lkik/android/chat/fragment/q;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1237
    iget-object v1, p0, Lkik/android/chat/fragment/q;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/ct;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1238
    return-void
.end method
