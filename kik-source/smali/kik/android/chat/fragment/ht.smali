.class final Lkik/android/chat/fragment/ht;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/hs;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/hs;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 346
    iget-object v0, p0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    iget-object v0, v0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->g(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    iget-object v0, v0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 358
    iget-object v0, p0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    iget-object v0, v0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->g(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 359
    iget-object v0, p0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    iget-object v0, v0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->g(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/hu;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/hu;-><init>(Lkik/android/chat/fragment/ht;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 366
    return-void
.end method
