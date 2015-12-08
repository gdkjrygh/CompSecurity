.class final Lcom/b/a/a/u;
.super La/a/a/a/a/b/a;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/d/l;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 28
    sget v5, La/a/a/a/a/e/d;->b:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, La/a/a/a/a/b/a;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;I)V

    .line 29
    iput-object p5, p0, Lcom/b/a/a/u;->b:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 34
    invoke-virtual {p0}, Lcom/b/a/a/u;->b()La/a/a/a/a/e/e;

    move-result-object v0

    .line 37
    const-string v1, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v3, "android"

    invoke-virtual {v0, v1, v3}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"

    iget-object v3, p0, Lcom/b/a/a/u;->a:La/a/a/a/p;

    invoke-virtual {v3}, La/a/a/a/p;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-KEY"

    iget-object v3, p0, Lcom/b/a/a/u;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v3

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "session_analytics_file_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "application/vnd.crashlytics.android.events"

    invoke-virtual {v3, v5, v6, v7, v0}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)La/a/a/a/a/e/e;

    .line 46
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 47
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Sending "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " analytics files to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/b/a/a/u;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {v3}, La/a/a/a/a/e/e;->b()I

    move-result v0

    .line 52
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 55
    invoke-static {v0}, La/a/a/a/a/b/ag;->a(I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method
