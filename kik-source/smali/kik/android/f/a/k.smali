.class final Lkik/android/f/a/k;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1341
    iput-object p1, p0, Lkik/android/f/a/k;->b:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/k;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .prologue
    .line 1345
    iget-object v0, p0, Lkik/android/f/a/k;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1346
    iget-object v0, p0, Lkik/android/f/a/k;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 1348
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 1353
    iget-object v0, p0, Lkik/android/f/a/k;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1354
    iget-object v0, p0, Lkik/android/f/a/k;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Pick user failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1356
    :cond_0
    return-void
.end method
