.class final Lkik/android/chat/fragment/aj;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ConversationsBaseFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 128
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/android/chat/fragment/ConversationsBaseFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0, p2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/aj;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Lkik/android/chat/fragment/ConversationsBaseFragment;)Z

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
