.class final Lkik/android/b/n;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/b/m;


# direct methods
.method constructor <init>(Lkik/android/b/m;Lcom/kik/g/p;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    iput-object p2, p0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/b/n;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 106
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v1, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v1}, Lkik/android/b/m;->a(Lkik/android/b/m;)Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v3}, Lkik/android/b/m;->a(Lkik/android/b/m;)Lkik/a/d/aa;

    move-result-object v3

    iget-object v3, v3, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v3}, Lkik/android/b/m;->a(Lkik/android/b/m;)Lkik/a/d/aa;

    move-result-object v3

    iget-object v3, v3, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v3}, Lkik/android/b/m;->a(Lkik/android/b/m;)Lkik/a/d/aa;

    move-result-object v3

    iget-object v3, v3, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkik/android/b/m;->a(J)J

    iget-object v0, p0, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v0}, Lkik/android/b/m;->d(Lkik/android/b/m;)Lcom/kik/cards/web/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/kik/cards/web/av;->a()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/b/o;

    invoke-direct {v1, p0}, Lkik/android/b/o;-><init>(Lkik/android/b/n;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 185
    return-void
.end method
