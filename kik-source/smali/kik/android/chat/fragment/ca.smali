.class final Lkik/android/chat/fragment/ca;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 833
    iput-object p1, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 833
    check-cast p2, Lkik/a/d/s;

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Closed"

    iget-object v2, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Messages Received"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Session Ended"

    iget-object v2, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Messages Received"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->s(Lkik/android/chat/fragment/KikChatFragment;)V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->B(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    new-instance v1, Lkik/android/chat/fragment/cb;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/cb;-><init>(Lkik/android/chat/fragment/ca;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->x:Lkik/a/c/c;

    invoke-static {p2}, Lcom/kik/m/m;->a(Lkik/a/d/s;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/c/c;->a(Ljava/util/List;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/f;->v()V

    return-void

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->D(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->E(Lkik/android/chat/fragment/KikChatFragment;)I

    goto :goto_0
.end method
