.class final Lkik/android/chat/fragment/dt;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 2459
    iput-object p1, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/dt;->a:Lkik/a/d/a/a;

    iput-object p3, p0, Lkik/android/chat/fragment/dt;->b:Lkik/a/d/s;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 11

    .prologue
    .line 2459
    iget-object v0, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    new-instance v0, Lkik/android/net/a/c;

    iget-object v1, p0, Lkik/android/chat/fragment/dt;->a:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/chat/fragment/dt;->b:Lkik/a/d/s;

    invoke-virtual {v2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/dt;->b:Lkik/a/d/s;

    invoke-virtual {v3}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/dt;->b:Lkik/a/d/s;

    invoke-virtual {v4}, Lkik/a/d/s;->o()[B

    move-result-object v4

    iget-object v5, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikChatFragment;->i:Lkik/a/f/k;

    iget-object v7, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikChatFragment;->h:Lkik/a/e/n;

    iget-object v8, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v8, v8, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v9, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v9, v9, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v10, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v10, v10, Lkik/android/chat/fragment/KikChatFragment;->p:Lkik/a/e/t;

    invoke-direct/range {v0 .. v10}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 2472
    iget-object v0, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 2473
    iget-object v0, p0, Lkik/android/chat/fragment/dt;->c:Lkik/android/chat/fragment/KikChatFragment;

    const v1, 0x7f090266

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    .line 2474
    return-void
.end method
