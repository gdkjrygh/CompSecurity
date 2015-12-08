.class public final Lcom/bumptech/glide/load/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lcom/bumptech/glide/load/c/s;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Lcom/bumptech/glide/load/c/t;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Lcom/bumptech/glide/load/c/s;",
            ">;>;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Lcom/bumptech/glide/load/c/d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/d;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/c/c;->c:Lcom/bumptech/glide/load/c/s;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/c/c;->b:Ljava/util/Map;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/c/c;->d:Landroid/content/Context;

    .line 38
    return-void
.end method

.method private a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TY;>;",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;TY;>;)V"
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/bumptech/glide/load/c/c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 155
    if-nez v0, :cond_0

    .line 156
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 157
    iget-object v1, p0, Lcom/bumptech/glide/load/c/c;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_0
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/c/s;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TY;>;)",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;TY;>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 126
    monitor-enter p0

    .line 1163
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1165
    if-eqz v0, :cond_7

    .line 1166
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/c/s;

    move-object v2, v0

    .line 127
    :goto_0
    if-eqz v2, :cond_1

    .line 131
    sget-object v0, Lcom/bumptech/glide/load/c/c;->c:Lcom/bumptech/glide/load/c/s;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    move-object v2, v1

    .line 146
    :cond_0
    :goto_1
    monitor-exit p0

    return-object v2

    .line 1173
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1175
    if-eqz v0, :cond_6

    .line 1176
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/c/t;

    .line 1179
    :goto_2
    if-nez v0, :cond_3

    .line 1180
    iget-object v1, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 1186
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1187
    iget-object v4, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1189
    if-eqz v0, :cond_5

    .line 1190
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/c/t;

    .line 1191
    if-nez v0, :cond_3

    :goto_4
    move-object v1, v0

    .line 1196
    goto :goto_3

    :cond_2
    move-object v0, v1

    .line 139
    :cond_3
    if-eqz v0, :cond_4

    .line 140
    iget-object v1, p0, Lcom/bumptech/glide/load/c/c;->d:Landroid/content/Context;

    invoke-interface {v0, v1, p0}, Lcom/bumptech/glide/load/c/t;->a(Landroid/content/Context;Lcom/bumptech/glide/load/c/c;)Lcom/bumptech/glide/load/c/s;

    move-result-object v0

    .line 141
    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/load/c/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;)V

    :goto_5
    move-object v2, v0

    .line 146
    goto :goto_1

    .line 2150
    :cond_4
    sget-object v0, Lcom/bumptech/glide/load/c/c;->c:Lcom/bumptech/glide/load/c/s;

    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/load/c/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_5

    .line 126
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    move-object v0, v1

    goto :goto_4

    :cond_6
    move-object v0, v1

    goto :goto_2

    :cond_7
    move-object v2, v1

    goto :goto_0
.end method

.method public final declared-synchronized a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)Lcom/bumptech/glide/load/c/t;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TY;>;",
            "Lcom/bumptech/glide/load/c/t",
            "<TT;TY;>;)",
            "Lcom/bumptech/glide/load/c/t",
            "<TT;TY;>;"
        }
    .end annotation

    .prologue
    .line 73
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 75
    iget-object v0, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 76
    if-nez v0, :cond_0

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 78
    iget-object v1, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_0
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/c/t;

    .line 83
    if-eqz v0, :cond_2

    .line 86
    iget-object v1, p0, Lcom/bumptech/glide/load/c/c;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 87
    invoke-interface {v1, v0}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_1

    .line 88
    const/4 v0, 0x0

    .line 94
    :cond_2
    monitor-exit p0

    return-object v0

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
