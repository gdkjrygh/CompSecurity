.class public Lcom/facebook/i/a/a/g;
.super Ljava/lang/Object;
.source "StatefulPeerManagerImpl.java"

# interfaces
.implements Lcom/facebook/i/a/a/f;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field protected final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/i/a/a/e;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/i/a/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/net/Uri;",
            "Ljava/util/SortedSet",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/net/Uri;",
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/facebook/i/a/a/a;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final f:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/i/a/b;

.field private final h:Ljava/lang/ClassLoader;

.field private final i:Lcom/facebook/common/e/h;

.field private final j:Z


# direct methods
.method public constructor <init>(Lcom/facebook/i/a/a/e;Lcom/google/common/a/fi;Lcom/facebook/i/a/c;Ljava/lang/String;Lcom/facebook/base/broadcast/j;Ljava/lang/ClassLoader;Lcom/facebook/common/e/h;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/i/a/a/e;",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;",
            "Lcom/facebook/i/a/c;",
            "Ljava/lang/String;",
            "Lcom/facebook/base/broadcast/j;",
            "Ljava/lang/ClassLoader;",
            "Lcom/facebook/common/e/h;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    .line 82
    iput-object p1, p0, Lcom/facebook/i/a/a/g;->b:Lcom/facebook/i/a/a/e;

    .line 83
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/fi;

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    .line 84
    iput-object p7, p0, Lcom/facebook/i/a/a/g;->i:Lcom/facebook/common/e/h;

    .line 85
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->c:Ljava/util/Map;

    .line 86
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    .line 87
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->e:Ljava/util/Map;

    .line 88
    iput-boolean p8, p0, Lcom/facebook/i/a/a/g;->j:Z

    .line 89
    invoke-virtual {p3, p4, p5, p8}, Lcom/facebook/i/a/c;->a(Ljava/lang/String;Lcom/facebook/base/broadcast/j;Z)Lcom/facebook/i/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    .line 91
    new-instance v0, Lcom/facebook/i/a/a/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/i/a/a/i;-><init>(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a/h;)V

    .line 92
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v1, v0}, Lcom/facebook/i/a/b;->a(Lcom/facebook/i/a/r;)V

    .line 93
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    const v2, 0x3b9aca00

    invoke-interface {v1, v2, v0}, Lcom/facebook/i/a/b;->a(ILcom/facebook/i/a/q;)V

    .line 94
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    const v2, 0x3b9aca01

    invoke-interface {v1, v2, v0}, Lcom/facebook/i/a/b;->a(ILcom/facebook/i/a/q;)V

    .line 95
    iput-object p6, p0, Lcom/facebook/i/a/a/g;->h:Ljava/lang/ClassLoader;

    .line 96
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v0}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-direct {p0, v0, v1}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a;Ljava/util/Set;)V

    .line 97
    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/a/g;)Ljava/lang/ClassLoader;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->h:Ljava/lang/ClassLoader;

    return-object v0
.end method

.method private a(Landroid/net/Uri;Z)V
    .locals 4

    .prologue
    .line 201
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 202
    monitor-enter p0

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 205
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-static {p1, v1}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 206
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 209
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/a;

    .line 211
    invoke-interface {v0, p1, p2, p0}, Lcom/facebook/i/a/a/a;->a(Landroid/net/Uri;ZLcom/facebook/i/a/a/f;)V

    goto :goto_1

    .line 213
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/a/g;Landroid/net/Uri;Z)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a;Landroid/os/Bundle;)V

    return-void
.end method

.method private a(Lcom/facebook/i/a/a;Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 308
    const-string v0, "__STATE_URI__"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 310
    monitor-enter p0

    .line 311
    :try_start_0
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 312
    if-nez v1, :cond_1

    .line 313
    monitor-exit p0

    .line 327
    :cond_0
    :goto_0
    return-void

    .line 316
    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/i/a/a/b;

    .line 317
    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 318
    invoke-virtual {v1, p2}, Lcom/facebook/i/a/a/b;->b(Landroid/os/Bundle;)V

    .line 319
    const/4 v1, 0x1

    .line 323
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    if-eqz v1, :cond_0

    .line 325
    invoke-direct {p0, v0, v2}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Z)V

    goto :goto_0

    .line 323
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    move v1, v2

    goto :goto_1
.end method

.method private declared-synchronized a(Lcom/facebook/i/a/a;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/i/a/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 330
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 333
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/SortedSet;

    .line 334
    if-nez v1, :cond_0

    .line 335
    sget-object v1, Lcom/facebook/i/a/a/b;->a:Ljava/util/Comparator;

    invoke-static {v1}, Lcom/google/common/a/kl;->a(Ljava/util/Comparator;)Ljava/util/TreeSet;

    move-result-object v1

    .line 337
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 338
    iget-object v3, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 330
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 340
    :cond_1
    monitor-exit p0

    return-void
.end method

.method private static a(Landroid/net/Uri;Landroid/net/Uri;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 388
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 402
    :cond_0
    :goto_0
    return v2

    .line 391
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v3

    .line 392
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v4

    .line 394
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    move v1, v2

    .line 397
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 398
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 402
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method private declared-synchronized b()Landroid/os/Message;
    .locals 8

    .prologue
    .line 343
    monitor-enter p0

    const/4 v0, 0x0

    const v1, 0x3b9aca00

    :try_start_0
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 344
    invoke-virtual {v1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 345
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 346
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 347
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 348
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 349
    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 352
    invoke-virtual {v0, v7}, Lcom/facebook/i/a/a/b;->a(Landroid/os/Bundle;)V

    .line 353
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 343
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 355
    :cond_0
    :try_start_1
    const-string v0, "__BASE_URIS__"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 356
    const-string v0, "__PRIORITIES__"

    invoke-virtual {v2, v0, v5}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 357
    const-string v0, "__ROLES_DATA__"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 358
    monitor-exit p0

    return-object v1
.end method

.method static synthetic b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a;Landroid/os/Bundle;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/i/a/a;Landroid/os/Bundle;)V
    .locals 9

    .prologue
    .line 362
    monitor-enter p0

    :try_start_0
    const-string v0, "__BASE_URIS__"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 363
    const-string v0, "__PRIORITIES__"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 364
    const-string v0, "__ROLES_DATA__"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 366
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 367
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 368
    iget-object v7, p0, Lcom/facebook/i/a/a/g;->b:Lcom/facebook/i/a/a/e;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v7, v0, v1}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v1

    .line 369
    if-nez v1, :cond_0

    .line 370
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->i:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Can not create PeerStateRole for base uri "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " with priority "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " in process "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v8}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v8

    iget-object v8, v8, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v7}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 377
    :cond_0
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Lcom/facebook/i/a/a/b;->b(Landroid/os/Bundle;)V

    .line 378
    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 362
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 380
    :cond_1
    :try_start_1
    invoke-direct {p0, p1, v6}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    monitor-exit p0

    return-void
.end method

.method static synthetic c(Lcom/facebook/i/a/a/g;)Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/i/a/a/g;)Landroid/os/Message;
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/i/a/a/g;->b()Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/i/a/a/g;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->c:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/i/a/a/g;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/i/a/a/g;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->i:Lcom/facebook/common/e/h;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Landroid/net/Uri;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 122
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-static {p1, v1}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 124
    new-instance v1, Lcom/facebook/i/a/a/d;

    invoke-direct {v1}, Lcom/facebook/i/a/a/d;-><init>()V

    .line 125
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/SortedSet;

    invoke-interface {v0}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 126
    invoke-virtual {v0, p1, v1}, Lcom/facebook/i/a/a/b;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V

    .line 127
    iget-boolean v0, v1, Lcom/facebook/i/a/a/d;->b:Z

    if-eqz v0, :cond_1

    .line 128
    iget-object v0, v1, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    :goto_0
    monitor-exit p0

    return-object v0

    .line 131
    :cond_2
    :try_start_1
    iget-object v0, v1, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 134
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v0}, Lcom/facebook/i/a/b;->a()V

    .line 102
    return-void
.end method

.method public declared-synchronized a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V
    .locals 2

    .prologue
    .line 176
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/WeakHashMap;

    .line 177
    if-nez v0, :cond_0

    .line 178
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 180
    :cond_0
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    iget-object v1, p0, Lcom/facebook/i/a/a/g;->e:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    monitor-exit p0

    return-void

    .line 176
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Landroid/net/Uri;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 139
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 141
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 142
    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 147
    :goto_0
    if-eqz v0, :cond_2

    .line 149
    const v2, 0x3b9aca01

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 150
    invoke-virtual {v1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 151
    monitor-enter p0

    .line 152
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lcom/facebook/i/a/a/b;->a(Landroid/net/Uri;Ljava/lang/Object;)Z

    move-result v3

    .line 153
    if-eqz v3, :cond_1

    .line 154
    invoke-virtual {v0, v2}, Lcom/facebook/i/a/a/b;->a(Landroid/os/Bundle;)V

    .line 156
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    if-eqz v3, :cond_2

    .line 158
    const-string v0, "__STATE_URI__"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 159
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v0, v1}, Lcom/facebook/i/a/b;->a(Landroid/os/Message;)V

    .line 160
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/i/a/a/g;->a(Landroid/net/Uri;Z)V

    .line 167
    :cond_2
    return-void

    .line 156
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 164
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current process "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v2}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v2

    iget-object v2, v2, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a stateful peer."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method public declared-synchronized b(Landroid/net/Uri;)Z
    .locals 1

    .prologue
    .line 171
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/facebook/i/a/a/g;->j:Z

    if-eqz v0, :cond_1

    .line 108
    monitor-enter p0

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 110
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 111
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 112
    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->a()V

    goto :goto_0

    .line 115
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 114
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v0}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/i/a/a/g;->f:Lcom/google/common/a/fi;

    invoke-direct {p0, v0, v1}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a;Ljava/util/Set;)V

    .line 115
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    iget-object v0, p0, Lcom/facebook/i/a/a/g;->g:Lcom/facebook/i/a/b;

    invoke-interface {v0}, Lcom/facebook/i/a/b;->d()V

    .line 118
    :cond_1
    return-void
.end method
