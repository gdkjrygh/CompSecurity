.class final Lcom/b/a/c/bo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/c/av;


# instance fields
.field private final a:Ljava/io/File;

.field private final b:I

.field private c:La/a/a/a/a/b/ab;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/b/a/c/bo;->a:Ljava/io/File;

    .line 40
    const/high16 v0, 0x10000

    iput v0, p0, Lcom/b/a/c/bo;->b:I

    .line 41
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/c/b;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 51
    iget-object v1, p0, Lcom/b/a/c/bo;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 87
    :cond_0
    :goto_0
    return-object v0

    .line 1103
    :cond_1
    iget-object v1, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    if-nez v1, :cond_2

    .line 1105
    :try_start_0
    new-instance v1, La/a/a/a/a/b/ab;

    iget-object v2, p0, Lcom/b/a/c/bo;->a:Ljava/io/File;

    invoke-direct {v1, v2}, La/a/a/a/a/b/ab;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    if-eqz v1, :cond_0

    .line 66
    const/4 v0, 0x1

    new-array v1, v0, [I

    aput v6, v1, v6

    .line 68
    iget-object v0, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    invoke-virtual {v0}, La/a/a/a/a/b/ab;->a()I

    move-result v0

    new-array v2, v0, [B

    .line 71
    :try_start_1
    iget-object v0, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    new-instance v3, Lcom/b/a/c/bp;

    invoke-direct {v3, p0, v2, v1}, Lcom/b/a/c/bp;-><init>(Lcom/b/a/c/bo;[B[I)V

    invoke-virtual {v0, v3}, La/a/a/a/a/b/ab;->a(La/a/a/a/a/b/af;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 87
    :goto_2
    aget v0, v1, v6

    invoke-static {v2, v0}, Lcom/b/a/c/b;->a([BI)Lcom/b/a/c/b;

    move-result-object v0

    goto :goto_0

    .line 1106
    :catch_0
    move-exception v1

    .line 1107
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Could not open log file: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/b/a/c/bo;->a:Ljava/io/File;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 82
    :catch_1
    move-exception v0

    .line 83
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "CrashlyticsCore"

    const-string v5, "A problem occurred while reading the Crashlytics log file."

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    const-string v1, "There was a problem closing the Crashlytics log file."

    invoke-static {v0, v1}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/c/bo;->c:La/a/a/a/a/b/ab;

    .line 94
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 98
    invoke-virtual {p0}, Lcom/b/a/c/bo;->b()V

    .line 99
    iget-object v0, p0, Lcom/b/a/c/bo;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 100
    return-void
.end method
