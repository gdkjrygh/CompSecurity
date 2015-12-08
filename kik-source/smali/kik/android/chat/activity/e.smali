.class final Lkik/android/chat/activity/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/FragmentWrapperActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lkik/android/chat/activity/e;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 320
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 321
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 297
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/activity/e;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->d(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/p;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/e;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->d(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 311
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 312
    iget-object v0, p0, Lkik/android/chat/activity/e;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->d(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/p;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 313
    iget-object v0, p0, Lkik/android/chat/activity/e;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->d(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 315
    :cond_0
    return-void
.end method
