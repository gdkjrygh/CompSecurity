.class final Lkik/a/j/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:[B

.field final synthetic d:Lcom/kik/g/p;

.field final synthetic e:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 462
    iput-object p1, p0, Lkik/a/j/k;->e:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/k;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/j/k;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/a/j/k;->c:[B

    iput-object p5, p0, Lkik/a/j/k;->d:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 466
    :try_start_0
    iget-object v0, p0, Lkik/a/j/k;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/j/k;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/a/j/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 468
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lkik/a/j/k;->e:Lkik/a/j/a;

    invoke-static {v2}, Lkik/a/j/a;->b(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 471
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkik/a/j/k;->e:Lkik/a/j/a;

    iget-object v2, p0, Lkik/a/j/k;->a:Ljava/lang/String;

    iget-object v3, p0, Lkik/a/j/k;->b:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lkik/a/j/a;->b(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 472
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 475
    :cond_1
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lkik/a/j/k;->e:Lkik/a/j/a;

    invoke-static {v2}, Lkik/a/j/a;->b(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 476
    iget-object v0, p0, Lkik/a/j/k;->e:Lkik/a/j/a;

    iget-object v2, p0, Lkik/a/j/k;->a:Ljava/lang/String;

    iget-object v3, p0, Lkik/a/j/k;->b:Ljava/lang/String;

    iget-object v4, p0, Lkik/a/j/k;->c:[B

    invoke-static {v0, v2, v3, v4}, Lkik/a/j/a;->a(Lkik/a/j/a;Ljava/lang/String;Ljava/lang/String;[B)Lkik/a/d/ab;

    move-result-object v0

    .line 478
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    .line 479
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 482
    :cond_2
    iget-object v1, p0, Lkik/a/j/k;->d:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 487
    :goto_0
    return-void

    .line 484
    :catch_0
    move-exception v0

    .line 485
    iget-object v1, p0, Lkik/a/j/k;->d:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
