.class final Lcom/cm/kinfoc/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/a/j;


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/z;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/z;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 186
    if-nez p1, :cond_0

    .line 214
    :goto_0
    return-void

    .line 191
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->d(Lcom/cm/kinfoc/z;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 192
    :try_start_1
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->e(Lcom/cm/kinfoc/z;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0, v1}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;Z)Z

    goto :goto_0

    .line 195
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;Z)Z

    .line 197
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    :try_start_3
    invoke-static {}, Lcom/cm/kinfoc/ag;->b()Ljava/io/File;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v0

    .line 201
    if-nez v0, :cond_2

    .line 213
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0, v1}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;Z)Z

    goto :goto_0

    .line 197
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 213
    :catchall_1
    move-exception v0

    iget-object v2, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v2, v1}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;Z)Z

    throw v0

    :cond_2
    move v0, v1

    .line 205
    :goto_1
    const/4 v2, 0x2

    if-ge v0, v2, :cond_3

    .line 206
    :try_start_6
    iget-object v2, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v2, v0}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 205
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 213
    :cond_3
    iget-object v0, p0, Lcom/cm/kinfoc/af;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0, v1}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;Z)Z

    goto :goto_0
.end method
