.class public Lcom/c/b/ax;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lcom/c/b/aq;


# instance fields
.field protected volatile a:Lcom/c/b/be;

.field private c:Lcom/c/b/f;

.field private d:Lcom/c/b/aq;

.field private volatile e:Lcom/c/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    invoke-static {}, Lcom/c/b/aq;->d()Lcom/c/b/aq;

    move-result-object v0

    sput-object v0, Lcom/c/b/ax;->b:Lcom/c/b/aq;

    return-void
.end method

.method public constructor <init>(Lcom/c/b/aq;Lcom/c/b/f;)V
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "found null ExtensionRegistry"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "found null ByteString"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_1
    iput-object p1, p0, Lcom/c/b/ax;->d:Lcom/c/b/aq;

    .line 78
    iput-object p2, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    .line 79
    return-void
.end method


# virtual methods
.method public final a(Lcom/c/b/be;)Lcom/c/b/be;
    .locals 3

    .prologue
    .line 146
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    if-nez v0, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    if-eqz v0, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    return-object v0

    .line 146
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/c/b/be;->t()Lcom/c/b/bk;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    iget-object v2, p0, Lcom/c/b/ax;->d:Lcom/c/b/aq;

    invoke-interface {v0, v1, v2}, Lcom/c/b/bk;->a(Lcom/c/b/f;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    iput-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;
    :try_end_1
    .catch Lcom/c/b/av; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    :try_start_3
    iput-object p1, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;
    :try_end_3
    .catch Lcom/c/b/av; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_4
    iput-object p1, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    invoke-virtual {v0}, Lcom/c/b/f;->a()I

    move-result v0

    .line 269
    :goto_0
    return v0

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    invoke-virtual {v0}, Lcom/c/b/f;->a()I

    move-result v0

    goto :goto_0

    .line 266
    :cond_1
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    if-eqz v0, :cond_2

    .line 267
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    invoke-interface {v0}, Lcom/c/b/be;->b()I

    move-result v0

    goto :goto_0

    .line 269
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lcom/c/b/be;)Lcom/c/b/be;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 157
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    .line 158
    iput-object v1, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    .line 159
    iput-object v1, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    .line 160
    iput-object p1, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    .line 161
    return-object v0
.end method

.method public final c()Lcom/c/b/f;
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/c/b/ax;->c:Lcom/c/b/f;

    .line 292
    :goto_0
    return-object v0

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    goto :goto_0

    .line 283
    :cond_1
    monitor-enter p0

    .line 284
    :try_start_0
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    if-eqz v0, :cond_2

    .line 285
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    monitor-exit p0

    goto :goto_0

    .line 293
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 287
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    if-nez v0, :cond_3

    .line 288
    sget-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    iput-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    .line 292
    :goto_1
    iget-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;

    monitor-exit p0

    goto :goto_0

    .line 290
    :cond_3
    iget-object v0, p0, Lcom/c/b/ax;->a:Lcom/c/b/be;

    invoke-interface {v0}, Lcom/c/b/be;->d()Lcom/c/b/f;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ax;->e:Lcom/c/b/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method
