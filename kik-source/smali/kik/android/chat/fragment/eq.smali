.class final Lkik/android/chat/fragment/eq;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Z

.field final synthetic c:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Z)V
    .locals 0

    .prologue
    .line 3403
    iput-object p1, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/eq;->a:Lkik/a/d/a/a;

    iput-boolean p3, p0, Lkik/android/chat/fragment/eq;->b:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 3403
    check-cast p1, Ljava/io/File;

    iget-object v0, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v1, p0, Lkik/android/chat/fragment/eq;->a:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lkik/android/chat/fragment/eq;->b:Z

    invoke-static {v0, v3, v1, v2, v3}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    iget-object v0, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->b(Ljava/io/File;)V

    iget-object v0, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/er;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/er;-><init>(Lkik/android/chat/fragment/eq;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    .line 3422
    iget-object v0, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/eq;->a:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p0, Lkik/android/chat/fragment/eq;->b:Z

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 3423
    iget-object v0, p0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/es;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/es;-><init>(Lkik/android/chat/fragment/eq;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    .line 3436
    return-void
.end method
