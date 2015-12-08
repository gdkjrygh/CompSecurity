.class final Lkik/android/chat/activity/h;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/IntroActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/IntroActivity;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->a(Lkik/android/chat/activity/IntroActivity;)Lcom/kik/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->b(Lkik/android/chat/activity/IntroActivity;)Ljava/util/TimerTask;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->c(Lkik/android/chat/activity/IntroActivity;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->d(Lkik/android/chat/activity/IntroActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->d(Lkik/android/chat/activity/IntroActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    new-instance v1, Lkik/android/chat/activity/i;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/i;-><init>(Lkik/android/chat/activity/h;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/activity/IntroActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
