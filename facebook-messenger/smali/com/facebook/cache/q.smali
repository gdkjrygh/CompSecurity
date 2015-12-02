.class public Lcom/facebook/cache/q;
.super Ljava/lang/Object;
.source "MemoryCacheManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/e/a/e;

.field private final c:Lcom/facebook/cache/s;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/common/time/a;

.field private final f:Lcom/facebook/e/a/d;

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/cache/a;",
            "Lcom/facebook/cache/p;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/cache/j;

.field private i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/cache/q;

    sput-object v0, Lcom/facebook/cache/q;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/e/a/e;Lcom/facebook/cache/s;Ljavax/inject/a;Lcom/facebook/common/time/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/e/a/e;",
            "Lcom/facebook/cache/s;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/cache/q;->i:J

    .line 50
    const-string v0, "ResourceManager cannot be null"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/e;

    iput-object v0, p0, Lcom/facebook/cache/q;->b:Lcom/facebook/e/a/e;

    .line 52
    const-string v0, "MemoryCacheManagerConfig cannot be null"

    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/cache/s;

    iput-object v0, p0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    .line 54
    const-string v0, "GK Provider for isTrimmingEnabled cannot be null"

    invoke-static {p3, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/a;

    iput-object v0, p0, Lcom/facebook/cache/q;->d:Ljavax/inject/a;

    .line 56
    const-string v0, "Clock cannot be null"

    invoke-static {p4, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/cache/q;->e:Lcom/facebook/common/time/a;

    .line 58
    new-instance v0, Lcom/facebook/cache/r;

    invoke-direct {v0, p0}, Lcom/facebook/cache/r;-><init>(Lcom/facebook/cache/q;)V

    iput-object v0, p0, Lcom/facebook/cache/q;->f:Lcom/facebook/e/a/d;

    .line 69
    iget-object v0, p0, Lcom/facebook/cache/q;->b:Lcom/facebook/e/a/e;

    iget-object v1, p0, Lcom/facebook/cache/q;->f:Lcom/facebook/e/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/e/a/e;->a(Lcom/facebook/e/a/d;)V

    .line 70
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/cache/q;->g:Ljava/util/Map;

    .line 71
    return-void
.end method

.method private a(Lcom/facebook/cache/a;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 110
    iget-object v0, p0, Lcom/facebook/cache/q;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/cache/p;

    .line 112
    if-nez v0, :cond_0

    .line 113
    sget-object v0, Lcom/facebook/cache/q;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No budget is associated with cache. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Lcom/facebook/cache/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 119
    :goto_0
    return v1

    :cond_0
    invoke-interface {p1}, Lcom/facebook/cache/a;->c()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/facebook/cache/p;->b()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    invoke-interface {p1}, Lcom/facebook/cache/a;->d()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/facebook/cache/p;->a()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    :cond_1
    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method a()J
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 124
    iget-wide v0, p0, Lcom/facebook/cache/q;->i:J

    return-wide v0
.end method

.method public a(Lcom/facebook/cache/j;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/cache/q;->h:Lcom/facebook/cache/j;

    .line 79
    return-void
.end method

.method a(Lcom/facebook/common/c/i;)V
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/cache/q;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/cache/q;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    invoke-interface {v2}, Lcom/facebook/cache/s;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/cache/q;->b:Lcom/facebook/e/a/e;

    invoke-virtual {v0, p1}, Lcom/facebook/e/a/e;->a(Lcom/facebook/common/c/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {p0, p1}, Lcom/facebook/cache/q;->b(Lcom/facebook/common/c/i;)V

    .line 135
    :cond_0
    return-void
.end method

.method b(Lcom/facebook/common/c/i;)V
    .locals 21
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 150
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->h:Lcom/facebook/cache/j;

    const-string v2, "CacheSyndicator cannot be null"

    invoke-static {v1, v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->e:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    move-object/from16 v0, p0

    iput-wide v1, v0, Lcom/facebook/cache/q;->i:J

    .line 154
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->d:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq v1, v2, :cond_0

    .line 156
    sget-object v1, Lcom/facebook/cache/q;->a:Ljava/lang/Class;

    const-string v2, "GK not enabled, hence not trimming."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 203
    :goto_0
    return-void

    .line 160
    :cond_0
    new-instance v8, Ljava/util/TreeSet;

    new-instance v1, Lcom/facebook/cache/m;

    invoke-direct {v1}, Lcom/facebook/cache/m;-><init>()V

    invoke-direct {v8, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->h:Lcom/facebook/cache/j;

    invoke-virtual {v1}, Lcom/facebook/cache/j;->a()Lcom/google/common/a/fi;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/cache/t;

    .line 163
    instance-of v3, v1, Lcom/facebook/cache/a;

    if-eqz v3, :cond_1

    .line 164
    check-cast v1, Lcom/facebook/cache/a;

    invoke-virtual {v8, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 168
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    invoke-interface {v1}, Lcom/facebook/cache/s;->c()J

    move-result-wide v9

    .line 169
    const-wide/16 v5, 0x0

    .line 171
    const/4 v4, 0x1

    .line 172
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    invoke-interface {v1}, Lcom/facebook/cache/s;->d()D

    move-result-wide v2

    .line 173
    const/4 v1, 0x0

    move-wide/from16 v16, v2

    move v2, v1

    move/from16 v18, v4

    move-wide/from16 v3, v16

    move-wide/from16 v19, v5

    move-wide/from16 v6, v19

    move/from16 v5, v18

    .line 174
    :goto_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    invoke-interface {v1}, Lcom/facebook/cache/s;->b()I

    move-result v1

    if-ge v2, v1, :cond_7

    cmp-long v1, v6, v9

    if-gez v1, :cond_7

    .line 175
    invoke-virtual {v8}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/cache/a;

    .line 176
    if-eqz v5, :cond_4

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/facebook/cache/q;->a(Lcom/facebook/cache/a;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 181
    :cond_4
    invoke-interface {v1}, Lcom/facebook/cache/a;->c()J

    move-result-wide v12

    .line 182
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/facebook/cache/q;->h:Lcom/facebook/cache/j;

    invoke-virtual {v14, v1, v3, v4}, Lcom/facebook/cache/j;->a(Lcom/facebook/cache/t;D)V

    .line 183
    invoke-interface {v1}, Lcom/facebook/cache/a;->c()J

    move-result-wide v14

    sub-long/2addr v12, v14

    add-long/2addr v6, v12

    .line 185
    cmp-long v1, v6, v9

    if-ltz v1, :cond_3

    .line 190
    :cond_5
    if-eqz v5, :cond_6

    .line 192
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/cache/q;->c:Lcom/facebook/cache/s;

    invoke-interface {v1}, Lcom/facebook/cache/s;->e()D

    move-result-wide v3

    .line 193
    const/4 v5, 0x0

    .line 174
    :cond_6
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    .line 202
    :cond_7
    sget-object v1, Lcom/facebook/cache/q;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Memory Freed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",  Target: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
