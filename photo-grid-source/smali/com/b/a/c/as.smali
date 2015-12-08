.class final Lcom/b/a/c/as;
.super La/a/a/a/a/b/a;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/c/ar;


# direct methods
.method public constructor <init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;)V
    .locals 6

    .prologue
    .line 37
    sget v5, La/a/a/a/a/e/d;->b:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, La/a/a/a/a/b/a;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;I)V

    .line 38
    return-void
.end method


# virtual methods
.method public final a(Lcom/b/a/c/aq;)Z
    .locals 6

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/b/a/c/as;->b()La/a/a/a/a/e/e;

    move-result-object v0

    .line 3074
    const-string v1, "X-CRASHLYTICS-API-KEY"

    iget-object v2, p1, Lcom/b/a/c/aq;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v2, "android"

    invoke-virtual {v0, v1, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"

    invoke-static {}, Lcom/b/a/c/h;->f()Lcom/b/a/c/h;

    .line 3399
    const-string v2, "2.3.5.79"

    .line 3074
    invoke-virtual {v0, v1, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    .line 3079
    iget-object v1, p1, Lcom/b/a/c/aq;->b:Lcom/b/a/c/bq;

    invoke-interface {v1}, Lcom/b/a/c/bq;->e()Ljava/util/Map;

    move-result-object v1

    .line 3081
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 3863
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    move-object v2, v0

    .line 3083
    goto :goto_0

    .line 4088
    :cond_0
    iget-object v0, p1, Lcom/b/a/c/aq;->b:Lcom/b/a/c/bq;

    .line 4090
    const-string v1, "report[file]"

    invoke-interface {v0}, Lcom/b/a/c/bq;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "application/octet-stream"

    invoke-interface {v0}, Lcom/b/a/c/bq;->d()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v2, v1, v3, v4, v5}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)La/a/a/a/a/e/e;

    move-result-object v1

    const-string v2, "report[identifier]"

    invoke-interface {v0}, Lcom/b/a/c/bq;->c()Ljava/lang/String;

    move-result-object v0

    .line 4511
    invoke-virtual {v1, v2, v0}, La/a/a/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    .line 62
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sending report to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/b/a/c/as;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v0}, La/a/a/a/a/e/e;->b()I

    move-result v1

    .line 66
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Create report request ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v0, v3}, La/a/a/a/a/e/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 70
    invoke-static {v1}, La/a/a/a/a/b/ag;->a(I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
