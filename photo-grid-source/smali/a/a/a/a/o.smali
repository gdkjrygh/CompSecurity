.class final La/a/a/a/o;
.super La/a/a/a/a/c/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "La/a/a/a/a/c/p",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "TResult;>;"
    }
.end annotation


# instance fields
.field final a:La/a/a/a/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/p",
            "<TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/a/a/a/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/a/p",
            "<TResult;>;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, La/a/a/a/a/c/p;-><init>()V

    .line 34
    iput-object p1, p0, La/a/a/a/o;->a:La/a/a/a/p;

    .line 35
    return-void
.end method

.method private a(Ljava/lang/String;)La/a/a/a/a/b/ai;
    .locals 3

    .prologue
    .line 91
    new-instance v0, La/a/a/a/a/b/ai;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, La/a/a/a/o;->a:La/a/a/a/p;

    invoke-virtual {v2}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "KitInitialization"

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/ai;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, La/a/a/a/a/b/ai;->a()V

    .line 94
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 87
    sget v0, La/a/a/a/a/c/o;->c:I

    return v0
.end method

.method protected final b()V
    .locals 5

    .prologue
    .line 39
    invoke-super {p0}, La/a/a/a/a/c/p;->b()V

    .line 41
    const-string v0, "onPreExecute"

    invoke-direct {p0, v0}, La/a/a/a/o;->a(Ljava/lang/String;)La/a/a/a/a/b/ai;

    move-result-object v1

    .line 44
    :try_start_0
    iget-object v0, p0, La/a/a/a/o;->a:La/a/a/a/p;

    invoke-virtual {v0}, La/a/a/a/p;->e_()Z
    :try_end_0
    .catch La/a/a/a/a/c/z; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 51
    invoke-virtual {v1}, La/a/a/a/a/b/ai;->b()V

    .line 52
    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0}, La/a/a/a/o;->i()Z

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 47
    :catch_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, La/a/a/a/a/b/ai;->b()V

    .line 53
    invoke-virtual {p0}, La/a/a/a/o;->i()Z

    throw v0

    .line 48
    :catch_1
    move-exception v0

    .line 49
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failure onPreExecute()"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    invoke-virtual {v1}, La/a/a/a/a/b/ai;->b()V

    .line 53
    invoke-virtual {p0}, La/a/a/a/o;->i()Z

    goto :goto_0
.end method

.method protected final c()V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, La/a/a/a/o;->a:La/a/a/a/p;

    iget-object v0, v0, La/a/a/a/p;->h:La/a/a/a/l;

    invoke-interface {v0}, La/a/a/a/l;->a()V

    .line 74
    return-void
.end method

.method protected final d()V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/a/a/a/o;->a:La/a/a/a/p;

    invoke-virtual {v1}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Initialization was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, La/a/a/a/n;

    invoke-direct {v1, v0}, La/a/a/a/n;-><init>(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, La/a/a/a/o;->a:La/a/a/a/p;

    iget-object v0, v0, La/a/a/a/p;->h:La/a/a/a/l;

    invoke-interface {v0, v1}, La/a/a/a/l;->a(Ljava/lang/Exception;)V

    .line 83
    return-void
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 28
    .line 1060
    const-string v0, "doInBackground"

    invoke-direct {p0, v0}, La/a/a/a/o;->a(Ljava/lang/String;)La/a/a/a/a/b/ai;

    move-result-object v1

    .line 1061
    const/4 v0, 0x0

    .line 1062
    invoke-virtual {p0}, La/a/a/a/o;->h()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1063
    iget-object v0, p0, La/a/a/a/o;->a:La/a/a/a/p;

    invoke-virtual {v0}, La/a/a/a/p;->d()Ljava/lang/Object;

    move-result-object v0

    .line 1066
    :cond_0
    invoke-virtual {v1}, La/a/a/a/a/b/ai;->b()V

    .line 28
    return-object v0
.end method
