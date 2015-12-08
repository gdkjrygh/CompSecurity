.class final Lkik/android/chat/fragment/fj;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lkik/a/d/a/a;

.field final synthetic c:Lkik/a/d/k;

.field final synthetic d:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 4526
    iput-object p1, p0, Lkik/android/chat/fragment/fj;->d:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/fj;->a:Lkik/a/d/s;

    iput-object p3, p0, Lkik/android/chat/fragment/fj;->b:Lkik/a/d/a/a;

    iput-object p4, p0, Lkik/android/chat/fragment/fj;->c:Lkik/a/d/k;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 4526
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/fj;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/fj;->a:Lkik/a/d/s;

    iget-object v3, p0, Lkik/android/chat/fragment/fj;->b:Lkik/a/d/a/a;

    invoke-static {v1, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;)Z

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/fj;->b:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/fj;->b:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/fj;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Browser Screen Opened"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Reason"

    iget-object v0, p0, Lkik/android/chat/fragment/fj;->c:Lkik/a/d/k;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/fj;->c:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Brand Chat"

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "URL"

    invoke-virtual {v0, v3, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Domain"

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Depth"

    invoke-static {}, Lkik/android/chat/activity/k;->e()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v0, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    move v0, v1

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/fj;->d:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment;->j()V

    :cond_2
    return-void

    :cond_3
    const-string v0, "Content Message"

    goto :goto_0
.end method
