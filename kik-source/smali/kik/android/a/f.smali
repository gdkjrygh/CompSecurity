.class final Lkik/android/a/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a/b;


# direct methods
.method constructor <init>(Lkik/android/a/b;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lkik/android/a/b;->b:Z

    .line 249
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 250
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 213
    check-cast p1, Lcom/kik/n/a/d/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/kik/n/a/d/a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/kik/n/a/d/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-virtual {p1}, Lcom/kik/n/a/d/a;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/a/b;->c:Ljava/lang/String;

    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-static {v0}, Lkik/android/a/b;->b(Lkik/android/a/b;)Lkik/a/e/v;

    move-result-object v0

    const-string v1, "enc_metrics_anon_id"

    invoke-virtual {p1}, Lcom/kik/n/a/d/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnonymousId was in xData. It is "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    iget-object v1, v1, Lkik/android/a/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-static {v0}, Lkik/android/a/b;->a(Lkik/android/a/b;)Lkik/android/a/a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    iget-object v1, v1, Lkik/android/a/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/a/a;->c(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    iget-object v0, v0, Lkik/android/a/b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/a/b;->c:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnonymousId never existed in xData. Making it "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    iget-object v1, v1, Lkik/android/a/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lkik/android/a/f;->a:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->b()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 240
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 243
    return-void
.end method
