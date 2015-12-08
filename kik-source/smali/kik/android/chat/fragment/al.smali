.class final Lkik/android/chat/fragment/al;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ConversationsBaseFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 167
    check-cast p2, Lkik/a/d/s;

    invoke-static {p2}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v4

    iget-object v0, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->c(Lkik/android/chat/fragment/ConversationsBaseFragment;)I

    move-result v0

    if-eqz v0, :cond_0

    move v3, v1

    :goto_0
    if-eqz p2, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v5, v0}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    iget-object v5, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-virtual {v5}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a()I

    move-result v5

    and-int/2addr v0, v5

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    if-eqz v4, :cond_2

    if-nez v3, :cond_2

    if-eqz v0, :cond_2

    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/al;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->d(Lkik/android/chat/fragment/ConversationsBaseFragment;)Landroid/os/Handler;

    move-result-object v2

    if-eqz v1, :cond_3

    const/4 v0, 0x4

    :goto_3
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_0
    move v3, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2

    :cond_3
    const/4 v0, 0x3

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_1
.end method
