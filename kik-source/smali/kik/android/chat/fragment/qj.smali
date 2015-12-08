.class final Lkik/android/chat/fragment/qj;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/MissedConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/MissedConversationsFragment;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 192
    iget-object v0, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/MissedConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    iget-object v2, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/MissedConversationsFragment;->a:Lkik/a/e/i;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/MissedConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    iget-object v2, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/MissedConversationsFragment;->a:Lkik/a/e/i;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 192
    check-cast p1, Ljava/lang/Void;

    invoke-super {p0, p1}, Lkik/android/util/bf;->onPostExecute(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/qj;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/MissedConversationsFragment;->J()V

    return-void
.end method
