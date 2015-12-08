.class public Lcom/roidapp/cloudlib/sns/g/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/roidapp/cloudlib/sns/g/b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/roidapp/cloudlib/sns/g/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/roidapp/cloudlib/sns/g/e;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/g/c;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->a:Ljava/util/Map;

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    .line 30
    return-void
.end method

.method private static a(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;
    .locals 3

    .prologue
    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/f;->i:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/a;

    .line 158
    if-nez v0, :cond_0

    .line 159
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/g/a;-><init>()V

    .line 160
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/g/f;->i:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    :cond_0
    return-object v0
.end method

.method public static a()Lcom/roidapp/cloudlib/sns/g/b;
    .locals 2

    .prologue
    .line 33
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    if-nez v0, :cond_1

    .line 34
    const-class v1, Lcom/roidapp/cloudlib/sns/g/b;

    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/g/b;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    .line 38
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    return-object v0

    .line 38
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(J)Lcom/roidapp/cloudlib/sns/g/f;
    .locals 3

    .prologue
    .line 148
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->a:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/f;

    .line 149
    if-nez v0, :cond_0

    .line 150
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/f;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/g/f;-><init>()V

    .line 151
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/g/b;->a:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_0
    return-object v0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;
    .locals 4

    .prologue
    .line 50
    if-eqz p0, :cond_0

    .line 51
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/g/b;->a:Ljava/util/Map;

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/f;

    .line 53
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 3

    .prologue
    .line 74
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-nez v0, :cond_1

    .line 99
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    monitor-enter v1

    .line 81
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->a:Lcom/roidapp/cloudlib/sns/b/c;

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    .line 83
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    .line 87
    if-eqz p0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->e:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 91
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    iput v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    .line 92
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/o;->h:I

    iput v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->c:I

    .line 93
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->b:Lcom/roidapp/cloudlib/sns/b/g;

    .line 94
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->a:Z

    .line 97
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;Z)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 216
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-nez v0, :cond_1

    .line 230
    :cond_0
    :goto_0
    return-void

    .line 220
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/o;->b:J

    invoke-direct {p0, v4, v5}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v3

    .line 221
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v3, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v4

    .line 222
    monitor-enter v3

    .line 223
    if-eqz p3, :cond_2

    .line 224
    :try_start_0
    iget-object v5, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v6, v4, Lcom/roidapp/cloudlib/sns/g/a;->c:I

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v7, v0, Lcom/roidapp/cloudlib/sns/b/o;->h:I

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->b:Lcom/roidapp/cloudlib/sns/b/g;

    if-ne p2, v0, :cond_3

    move v0, v1

    :goto_1
    invoke-static {v6, v7, v0}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v0

    iput v0, v4, Lcom/roidapp/cloudlib/sns/g/a;->c:I

    iput v0, v5, Lcom/roidapp/cloudlib/sns/b/o;->h:I

    .line 226
    :cond_2
    iput-object p2, v4, Lcom/roidapp/cloudlib/sns/g/a;->b:Lcom/roidapp/cloudlib/sns/b/g;

    .line 227
    iput-object p2, p1, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    .line 228
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    new-array v0, v1, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    goto :goto_0

    :cond_3
    move v0, v2

    .line 224
    goto :goto_1

    .line 228
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;Z)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 182
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p2, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v0, :cond_1

    .line 197
    :cond_0
    :goto_0
    return-void

    .line 186
    :cond_1
    iget-wide v4, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v4, v5}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v3

    .line 187
    iget-object v0, p2, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v4, v5}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v4

    .line 188
    monitor-enter v3

    .line 189
    if-eqz p4, :cond_2

    .line 190
    :try_start_0
    iget v5, v3, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    iget v6, p1, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne p3, v0, :cond_3

    move v0, v1

    :goto_1
    invoke-static {v5, v6, v0}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v0

    iput v0, v3, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    .line 191
    iget-object v5, p2, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v6, v4, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    iget-object v0, p2, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v7, v0, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne p3, v0, :cond_4

    move v0, v1

    :goto_2
    invoke-static {v6, v7, v0}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v0

    iput v0, v4, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    iput v0, v5, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    .line 193
    :cond_2
    iput-object p3, p1, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    .line 194
    iput-object p3, v3, Lcom/roidapp/cloudlib/sns/g/f;->a:Lcom/roidapp/cloudlib/sns/b/c;

    .line 195
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    new-array v0, v8, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v3, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v3, v0, v2

    sget-object v3, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v3, v0, v1

    new-array v3, v8, [Ljava/lang/Object;

    iget-wide v4, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v2

    iget-wide v4, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-direct {p0, v0, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move v0, v2

    .line 190
    goto :goto_1

    :cond_4
    move v0, v2

    .line 191
    goto :goto_2

    .line 195
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private declared-synchronized a([Lcom/roidapp/cloudlib/sns/g/e;)V
    .locals 1

    .prologue
    .line 143
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    monitor-exit p0

    return-void

    .line 143
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a([Lcom/roidapp/cloudlib/sns/g/e;[Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 128
    monitor-enter p0

    if-nez p1, :cond_1

    .line 140
    :cond_0
    monitor-exit p0

    return-void

    .line 132
    :cond_1
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    :try_start_0
    array-length v0, p1

    if-ge v2, v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    aget-object v1, p1, v2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 134
    if-eqz v0, :cond_3

    .line 135
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/c;

    .line 136
    aget-object v4, p1, v2

    if-eqz p2, :cond_2

    aget-object v1, p2, v2

    :goto_2
    invoke-interface {v0, v4, v1}, Lcom/roidapp/cloudlib/sns/g/c;->a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 128
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 136
    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    .line 132
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 2

    .prologue
    .line 57
    if-nez p0, :cond_1

    .line 71
    :cond_0
    :goto_0
    return-void

    .line 61
    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    monitor-enter v1

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->a:Lcom/roidapp/cloudlib/sns/b/c;

    .line 65
    iget v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    .line 66
    iget v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->f:I

    .line 67
    iget v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->h:I

    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    .line 69
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/a;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 248
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-nez v0, :cond_1

    .line 263
    :cond_0
    :goto_0
    return-void

    .line 252
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->b:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 253
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v0

    .line 254
    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    if-nez v2, :cond_2

    .line 255
    new-instance v2, Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/b/a/a;-><init>()V

    iput-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 257
    :cond_2
    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v2, v5, p2}, Lcom/roidapp/cloudlib/sns/b/a/a;->add(ILjava/lang/Object;)V

    .line 258
    monitor-enter v1

    .line 259
    :try_start_0
    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->e:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 260
    iget v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v3, v3, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v2

    iput v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    .line 261
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    new-array v0, v6, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v5

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    goto :goto_0

    .line 261
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;)V
    .locals 1

    .prologue
    .line 212
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;Z)V

    .line 213
    return-void
.end method

.method public final declared-synchronized a(Lcom/roidapp/cloudlib/sns/b/p;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 283
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 284
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 285
    :try_start_1
    iput-object p2, v1, Lcom/roidapp/cloudlib/sns/g/f;->b:Ljava/lang/String;

    .line 286
    iput-object p3, v1, Lcom/roidapp/cloudlib/sns/g/f;->c:Ljava/lang/String;

    .line 287
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    const/4 v0, 0x1

    :try_start_2
    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 289
    monitor-exit p0

    return-void

    .line 287
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 283
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 2

    .prologue
    .line 166
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;Z)V

    .line 167
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;Z)V

    .line 179
    return-void
.end method

.method public final declared-synchronized a(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V
    .locals 2

    .prologue
    .line 102
    monitor-enter p0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 114
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 106
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 107
    if-nez v0, :cond_2

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_2
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 112
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/b;->c:Lcom/roidapp/cloudlib/sns/g/b;

    .line 47
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 2

    .prologue
    .line 200
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->b:Lcom/roidapp/cloudlib/sns/b/g;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;Z)V

    .line 201
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/a;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 266
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    if-nez v0, :cond_1

    .line 280
    :cond_0
    :goto_0
    return-void

    .line 270
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/sns/b/a/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 272
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v0

    .line 273
    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v2, p2}, Lcom/roidapp/cloudlib/sns/b/a/a;->remove(Ljava/lang/Object;)Z

    .line 274
    monitor-enter v1

    .line 275
    :try_start_0
    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->e:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 276
    iget v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v3, v3, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v2

    iput v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->d:I

    .line 277
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v5

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    goto :goto_0

    .line 277
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized b(Lcom/roidapp/cloudlib/sns/b/p;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 292
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 293
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 294
    :try_start_1
    iput-object p2, v1, Lcom/roidapp/cloudlib/sns/g/f;->d:Ljava/lang/String;

    .line 295
    iput-object p3, v1, Lcom/roidapp/cloudlib/sns/g/f;->e:Ljava/lang/String;

    .line 296
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    const/4 v0, 0x1

    :try_start_2
    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 298
    monitor-exit p0

    return-void

    .line 296
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 292
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 2

    .prologue
    .line 170
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->a:Lcom/roidapp/cloudlib/sns/b/c;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;Z)V

    .line 171
    return-void
.end method

.method public final declared-synchronized b(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V
    .locals 1

    .prologue
    .line 117
    monitor-enter p0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 125
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 121
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/g/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 122
    if-eqz v0, :cond_0

    .line 123
    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c()V
    .locals 3

    .prologue
    .line 301
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->e:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    monitor-exit p0

    return-void

    .line 301
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 2

    .prologue
    .line 204
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->a:Lcom/roidapp/cloudlib/sns/b/g;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;Z)V

    .line 205
    return-void
.end method

.method public final c(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 2

    .prologue
    .line 174
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;Z)V

    .line 175
    return-void
.end method

.method public final d(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 2

    .prologue
    .line 208
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->c:Lcom/roidapp/cloudlib/sns/b/g;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/g;Z)V

    .line 209
    return-void
.end method

.method public final e(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 234
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-nez v0, :cond_1

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 238
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(J)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 239
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v0

    .line 240
    monitor-enter v1

    .line 241
    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/g/a;->a:Z

    .line 242
    iget v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/g/d;->a(IIZ)I

    move-result v0

    iput v0, v1, Lcom/roidapp/cloudlib/sns/g/f;->g:I

    .line 243
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    new-array v0, v5, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v4

    new-array v1, v5, [Ljava/lang/Object;

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/g/b;->a([Lcom/roidapp/cloudlib/sns/g/e;[Ljava/lang/Object;)V

    goto :goto_0

    .line 243
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
