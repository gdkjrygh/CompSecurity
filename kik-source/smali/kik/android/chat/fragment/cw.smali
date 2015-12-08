.class final Lkik/android/chat/fragment/cw;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lcom/kik/g/p;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 403
    iput-object p1, p0, Lkik/android/chat/fragment/cw;->c:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/cw;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/chat/fragment/cw;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 403
    check-cast p1, Lkik/a/d/r;

    invoke-virtual {p1}, Lkik/a/d/r;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    invoke-virtual {p1}, Lkik/a/d/r;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkik/a/d/r;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lkik/a/d/r;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/c/a/a/af;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/d/r;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/cw;->c:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090299

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/cx;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/cx;-><init>(Lkik/android/chat/fragment/cw;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    new-instance v1, Lkik/android/chat/fragment/cy;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/cy;-><init>(Lkik/android/chat/fragment/cw;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/content/DialogInterface$OnCancelListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/cw;->c:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0902a4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/cz;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/cz;-><init>(Lkik/android/chat/fragment/cw;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->b()V

    iget-object v1, p0, Lkik/android/chat/fragment/cw;->c:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->a:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "dialog"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/cw;->a:Lcom/kik/g/p;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 460
    iget-object v0, p0, Lkik/android/chat/fragment/cw;->a:Lcom/kik/g/p;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 462
    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    .line 463
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->ag:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "url"

    aput-object v6, v4, v5

    iget-object v5, p0, Lkik/android/chat/fragment/cw;->b:Ljava/lang/String;

    aput-object v5, v4, v7

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J[Ljava/lang/Object;)V

    .line 466
    :cond_0
    return-void
.end method
