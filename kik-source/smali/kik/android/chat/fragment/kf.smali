.class final Lkik/android/chat/fragment/kf;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 858
    iput-object p1, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    const v2, 0x7f09035a

    const/4 v8, 0x0

    .line 858
    check-cast p1, Ljava/io/File;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->a(Z)V

    if-nez p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikConversationsFragment;I)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    const-string v0, ".mp4"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3}, Lkik/android/KikFileProvider;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-static {v3}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v0

    int-to-long v4, v0

    :cond_2
    const-wide/16 v0, 0x1

    cmp-long v0, v4, v0

    if-gez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikConversationsFragment;I)V

    goto :goto_0

    :cond_3
    const/16 v0, 0x12

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v3}, Lkik/android/util/ak;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    const v1, 0x7f0900a0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikConversationsFragment;I)V

    :cond_4
    invoke-static {v3, v4, v5}, Lkik/android/util/ct;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0, v4, v5, v3}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikConversationsFragment;JLjava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iput-object v8, v0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-virtual {v0, v8}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0

    :cond_5
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v7, v0, Lkik/android/chat/fragment/KikConversationsFragment;->q:Lcom/kik/l/ab;

    invoke-virtual/range {v1 .. v7}, Lkik/android/f/a/f;->a(Landroid/content/Context;Ljava/lang/String;JZLcom/kik/l/ab;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v8}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lkik/android/chat/fragment/kf;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->h(Lkik/android/chat/fragment/KikConversationsFragment;)V

    goto :goto_1
.end method
