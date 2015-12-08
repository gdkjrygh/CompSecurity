.class final Lkik/android/chat/fragment/kb;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 806
    iput-object p1, p0, Lkik/android/chat/fragment/kb;->c:Lkik/android/chat/fragment/KikConversationsFragment;

    iput-wide p2, p0, Lkik/android/chat/fragment/kb;->a:J

    iput-object p4, p0, Lkik/android/chat/fragment/kb;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 824
    iget-object v0, p0, Lkik/android/chat/fragment/kb;->b:Ljava/lang/String;

    invoke-static {v0}, Lkik/android/KikFileProvider;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 825
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/android/chat/fragment/kb;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 826
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 828
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 806
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "photoUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lkik/android/chat/fragment/kb;->c:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    iget-wide v4, p0, Lkik/android/chat/fragment/kb;->a:J

    const-string v1, "Video Selected"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "From Trimmer"

    invoke-virtual {v0, v1, v8}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Length"

    invoke-static {v3}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v2

    int-to-long v6, v2

    invoke-virtual {v0, v1, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Orginal Length"

    invoke-virtual {v0, v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is From Intent"

    invoke-virtual {v0, v1, v8}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-static {v0, v3}, Lkik/android/util/by;->b(Lcom/kik/android/a$f;Ljava/lang/String;)V

    const/16 v0, 0x12

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v6

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/kb;->c:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-wide v4, p0, Lkik/android/chat/fragment/kb;->a:J

    iget-object v0, p0, Lkik/android/chat/fragment/kb;->c:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v7, v0, Lkik/android/chat/fragment/KikConversationsFragment;->q:Lcom/kik/l/ab;

    invoke-virtual/range {v1 .. v7}, Lkik/android/f/a/f;->a(Landroid/content/Context;Ljava/lang/String;JZLcom/kik/l/ab;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v8, v2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lkik/android/chat/fragment/kb;->c:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->h(Lkik/android/chat/fragment/KikConversationsFragment;)V

    return-void
.end method
