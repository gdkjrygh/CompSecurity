.class final Lkik/android/chat/ai;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 408
    iput-object p1, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 408
    check-cast p2, Lkik/a/d/s;

    iget-object v0, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/KikApplication;->c(Ljava/lang/String;)Z

    move-result v5

    iget-object v0, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p2}, Lkik/android/chat/KikApplication;->a(Lkik/a/d/s;)V

    iget-object v0, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-gt v2, v3, :cond_0

    iget-object v2, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->i(Lkik/android/chat/KikApplication;)Lkik/a/e/v;

    move-result-object v2

    invoke-interface {v2, v0, p2}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    :cond_0
    invoke-virtual {v0}, Lkik/a/d/f;->t()V

    :cond_1
    iget-object v0, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v0

    invoke-interface {v0, p2}, Lkik/a/e/i;->a(Lkik/a/d/s;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-class v0, Lkik/a/d/a/a;

    invoke-static {p2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkik/android/f/a/f;->c(Lkik/a/d/a/a;)Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v1

    move v4, v3

    :goto_0
    iget-object v1, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v1}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v1

    const-string v6, "content-preload"

    invoke-interface {v1, v6}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_2

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v1

    const-string v3, "file-url"

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lkik/a/d/s;->o()[B

    move-result-object v6

    invoke-virtual {v1, v3, v4, v6}, Lkik/android/util/a;->a(Ljava/lang/String;Ljava/lang/String;[B)V

    :cond_3
    if-eqz v2, :cond_4

    iget-object v1, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v1}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v4}, Lkik/android/chat/KikApplication;->i(Lkik/android/chat/KikApplication;)Lkik/a/e/v;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;Lkik/a/e/i;Lkik/a/e/v;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->j(Lkik/android/chat/KikApplication;)Lcom/kik/l/ab;

    move-result-object v1

    invoke-virtual {p2}, Lkik/a/d/s;->o()[B

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/ai;->a:Lkik/android/chat/KikApplication;

    iget-object v4, v4, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-interface {v1, v0, v2, v3, v4}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    :cond_4
    invoke-static {}, Lkik/android/chat/KikApplication;->p()Lkik/android/KikNotificationHandler;

    move-result-object v0

    invoke-virtual {v0, p2, v5}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/s;Z)V

    :cond_5
    return-void

    :cond_6
    invoke-static {v0}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v3

    move v4, v1

    goto :goto_0

    :cond_7
    move v2, v1

    move v4, v1

    goto :goto_0
.end method
