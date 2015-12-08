.class final Lb/a/a/a/k;
.super Lb/a/a/a/a/c/j;
.source "SourceFile"


# instance fields
.field final a:Lb/a/a/a/l;


# direct methods
.method public constructor <init>(Lb/a/a/a/l;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lb/a/a/a/a/c/j;-><init>()V

    .line 34
    iput-object p1, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    .line 35
    return-void
.end method

.method private a(Ljava/lang/String;)Lb/a/a/a/a/b/aa;
    .locals 3

    .prologue
    .line 91
    new-instance v0, Lb/a/a/a/a/b/aa;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    invoke-virtual {v2}, Lb/a/a/a/l;->b()Ljava/lang/String;

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

    invoke-direct {v0, v1, v2}, Lb/a/a/a/a/b/aa;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, Lb/a/a/a/a/b/aa;->a()V

    .line 94
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 87
    sget v0, Lb/a/a/a/a/c/i;->c:I

    return v0
.end method

.method protected final b()V
    .locals 5

    .prologue
    .line 39
    invoke-super {p0}, Lb/a/a/a/a/c/j;->b()V

    .line 41
    const-string v0, "onPreExecute"

    invoke-direct {p0, v0}, Lb/a/a/a/k;->a(Ljava/lang/String;)Lb/a/a/a/a/b/aa;

    move-result-object v1

    .line 42
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    invoke-virtual {v0}, Lb/a/a/a/l;->a_()Z
    :try_end_0
    .catch Lb/a/a/a/a/c/r; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 51
    invoke-virtual {v1}, Lb/a/a/a/a/b/aa;->b()V

    .line 52
    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0}, Lb/a/a/a/k;->i()Z

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 45
    :catch_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lb/a/a/a/a/b/aa;->b()V

    .line 52
    invoke-virtual {p0}, Lb/a/a/a/k;->i()Z

    throw v0

    .line 48
    :catch_1
    move-exception v0

    .line 49
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failure onPreExecute()"

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    invoke-virtual {v1}, Lb/a/a/a/a/b/aa;->b()V

    .line 52
    invoke-virtual {p0}, Lb/a/a/a/k;->i()Z

    goto :goto_0
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    iget-object v0, v0, Lb/a/a/a/l;->h:Lb/a/a/a/i;

    invoke-interface {v0}, Lb/a/a/a/i;->a()V

    .line 74
    return-void
.end method

.method protected final d()V
    .locals 2

    .prologue
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    invoke-virtual {v1}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Initialization was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Lb/a/a/a/j;

    invoke-direct {v1, v0}, Lb/a/a/a/j;-><init>(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    iget-object v0, v0, Lb/a/a/a/l;->h:Lb/a/a/a/i;

    invoke-interface {v0, v1}, Lb/a/a/a/i;->a(Ljava/lang/Exception;)V

    .line 83
    return-void
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 28
    const-string v0, "doInBackground"

    invoke-direct {p0, v0}, Lb/a/a/a/k;->a(Ljava/lang/String;)Lb/a/a/a/a/b/aa;

    move-result-object v1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lb/a/a/a/k;->h()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lb/a/a/a/k;->a:Lb/a/a/a/l;

    invoke-virtual {v0}, Lb/a/a/a/l;->e()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-virtual {v1}, Lb/a/a/a/a/b/aa;->b()V

    return-object v0
.end method
