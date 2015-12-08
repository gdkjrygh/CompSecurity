.class final Lkik/android/chat/fragment/en;
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
    .line 3360
    iput-object p1, p0, Lkik/android/chat/fragment/en;->c:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/en;->a:Lkik/a/d/a/a;

    iput-boolean p3, p0, Lkik/android/chat/fragment/en;->b:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    .line 3377
    iget-object v0, p0, Lkik/android/chat/fragment/en;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/en;->a:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p0, Lkik/android/chat/fragment/en;->b:Z

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 3378
    iget-object v0, p0, Lkik/android/chat/fragment/en;->c:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/ep;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ep;-><init>(Lkik/android/chat/fragment/en;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    .line 3385
    return-void
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 3364
    iget-object v0, p0, Lkik/android/chat/fragment/en;->c:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v1, p0, Lkik/android/chat/fragment/en;->a:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lkik/android/chat/fragment/en;->b:Z

    invoke-static {v0, v3, v1, v2, v3}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 3365
    iget-object v0, p0, Lkik/android/chat/fragment/en;->c:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/eo;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/eo;-><init>(Lkik/android/chat/fragment/en;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    .line 3372
    return-void
.end method
