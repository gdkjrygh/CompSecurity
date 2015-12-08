.class final Lkik/a/j/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/a/j/a;


# direct methods
.method constructor <init>(Lkik/a/j/a;Ljava/lang/String;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lkik/a/j/g;->c:Lkik/a/j/a;

    iput-object p2, p0, Lkik/a/j/g;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/j/g;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 298
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 300
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lkik/a/j/g;->c:Lkik/a/j/a;

    invoke-static {v2}, Lkik/a/j/a;->a(Lkik/a/j/a;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lkik/a/j/g;->a:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 302
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 304
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 307
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 308
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 310
    iget-object v6, p0, Lkik/a/j/g;->a:Ljava/lang/String;

    invoke-static {v6, v5, v4}, Lkik/a/j/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;

    move-result-object v4

    .line 312
    if-eqz v4, :cond_0

    .line 314
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 318
    :cond_1
    iget-object v0, p0, Lkik/a/j/g;->b:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 337
    :goto_1
    return-void

    .line 320
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 321
    iget-object v2, p0, Lkik/a/j/g;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Lkik/a/j/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lkik/a/d/ab;

    move-result-object v0

    .line 323
    if-eqz v0, :cond_3

    .line 325
    const-string v2, ""

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    :cond_3
    iget-object v0, p0, Lkik/a/j/g;->b:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 336
    :catch_0
    move-exception v0

    .line 335
    iget-object v1, p0, Lkik/a/j/g;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 331
    :cond_4
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No cached files found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
.end method
