.class final Lkik/android/chat/fragment/ch;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 909
    iput-object p1, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 909
    check-cast p2, [Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->y(Lkik/android/chat/fragment/KikChatFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->y(Lkik/android/chat/fragment/KikChatFragment;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    if-eqz p2, :cond_0

    array-length v0, p2

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, p2, v0

    iget-object v1, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ch;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->G(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/s;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    :cond_0
    return-void
.end method
