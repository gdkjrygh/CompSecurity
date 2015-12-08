.class final Lkik/android/chat/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 472
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/f;->b()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v0}, Lcom/kik/android/a;->d()Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v0}, Lcom/kik/android/a;->a()V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v1}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    const-string v2, "app_cardsAppCache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    const-string v2, "localstorage"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;Ljava/io/File;)Z

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v1}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    const-string v2, "app_webview"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    const-string v2, "Local Storage"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;Ljava/io/File;)Z

    invoke-static {}, Lkik/android/chat/KikApplication;->p()Lkik/android/KikNotificationHandler;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/KikNotificationHandler;->a()V

    invoke-static {}, Lkik/android/chat/KikApplication;->p()Lkik/android/KikNotificationHandler;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/KikNotificationHandler;->b()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->k(Lkik/android/chat/KikApplication;)Lkik/android/util/bo;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/bo;->a()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->c:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->g()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->e:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->c()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->h:Lkik/a/c/c;

    invoke-virtual {v0}, Lkik/a/c/c;->a()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->i:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/c;->g()V

    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/a;->b()V

    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/a;->c()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->g()V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->n(Lkik/android/chat/KikApplication;)Lcom/kik/g/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->l(Lkik/android/chat/KikApplication;)Lkik/a/ab;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/ab;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->m(Lkik/android/chat/KikApplication;)Lcom/kik/g/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->p(Lkik/android/chat/KikApplication;)Ljava/util/Timer;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->o(Lkik/android/chat/KikApplication;)Ljava/util/TimerTask;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    iget-object v0, p0, Lkik/android/chat/d;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->q(Lkik/android/chat/KikApplication;)V

    return-void
.end method
