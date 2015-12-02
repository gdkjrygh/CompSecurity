.class public Lcom/facebook/e/a/e;
.super Ljava/lang/Object;
.source "ResourceManager.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/prefs/shared/ae;

.field private static final c:Lcom/facebook/prefs/shared/ae;

.field private static final d:Lcom/facebook/prefs/shared/ae;

.field private static final e:Lcom/facebook/prefs/shared/ae;

.field private static final f:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final g:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/e/a/d;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/e/a/a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/Runtime;

.field private final j:Lcom/facebook/e/a/g;

.field private final k:Lcom/facebook/e/a/h;

.field private final l:Lcom/facebook/e/c;

.field private final m:Lcom/facebook/prefs/shared/d;

.field private final n:Lcom/facebook/base/activity/g;

.field private final o:Landroid/view/WindowManager;

.field private final p:Lcom/facebook/common/e/h;

.field private q:Lcom/facebook/common/c/i;

.field private r:Lcom/facebook/e/a/b;

.field private s:Lcom/facebook/e/a/b;

.field private t:Lcom/facebook/e/a/f;

.field private u:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 38
    const-class v0, Lcom/facebook/e/a/e;

    sput-object v0, Lcom/facebook/e/a/e;->a:Ljava/lang/Class;

    .line 40
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "resource_manager/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/a/e;->b:Lcom/facebook/prefs/shared/ae;

    .line 43
    sget-object v0, Lcom/facebook/e/a/e;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "data_wifi_received"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/a/e;->c:Lcom/facebook/prefs/shared/ae;

    .line 45
    sget-object v0, Lcom/facebook/e/a/e;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "data_wifi_sent"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/a/e;->d:Lcom/facebook/prefs/shared/ae;

    .line 47
    sget-object v0, Lcom/facebook/e/a/e;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "data_cell_received"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/a/e;->e:Lcom/facebook/prefs/shared/ae;

    .line 49
    sget-object v0, Lcom/facebook/e/a/e;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "data_cell_sent"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/a/e;->f:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/e/a/h;Lcom/facebook/e/a/g;Ljava/lang/Runtime;Lcom/facebook/e/c;Lcom/facebook/prefs/shared/d;Landroid/view/WindowManager;Lcom/facebook/base/activity/g;Lcom/facebook/common/e/h;)V
    .locals 10

    .prologue
    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Lcom/facebook/e/a/e;->k:Lcom/facebook/e/a/h;

    .line 127
    iput-object p2, p0, Lcom/facebook/e/a/e;->j:Lcom/facebook/e/a/g;

    .line 129
    iput-object p3, p0, Lcom/facebook/e/a/e;->i:Ljava/lang/Runtime;

    .line 130
    iput-object p4, p0, Lcom/facebook/e/a/e;->l:Lcom/facebook/e/c;

    .line 131
    iput-object p5, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    .line 132
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/facebook/e/a/e;->n:Lcom/facebook/base/activity/g;

    .line 133
    move-object/from16 v0, p6

    iput-object v0, p0, Lcom/facebook/e/a/e;->o:Landroid/view/WindowManager;

    .line 135
    new-instance v1, Lcom/google/common/a/hy;

    invoke-direct {v1}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v1}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/e/a/e;->g:Ljava/util/concurrent/ConcurrentMap;

    .line 136
    new-instance v1, Lcom/google/common/a/hy;

    invoke-direct {v1}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v1}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/e/a/e;->h:Ljava/util/concurrent/ConcurrentMap;

    .line 138
    invoke-static {}, Lcom/facebook/e/a/f;->a()Lcom/facebook/e/a/f;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/e/a/e;->t:Lcom/facebook/e/a/f;

    .line 140
    new-instance v1, Lcom/facebook/e/a/b;

    iget-object v2, p0, Lcom/facebook/e/a/e;->t:Lcom/facebook/e/a/f;

    invoke-virtual {v2}, Lcom/facebook/e/a/f;->b()J

    move-result-wide v2

    iget-object v4, p0, Lcom/facebook/e/a/e;->t:Lcom/facebook/e/a/f;

    invoke-static {v4}, Lcom/facebook/e/a/f;->b(Lcom/facebook/e/a/f;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/facebook/e/a/b;-><init>(JJJJ)V

    iput-object v1, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    .line 142
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/facebook/e/a/e;->p:Lcom/facebook/common/e/h;

    .line 143
    return-void
.end method

.method private h()Lcom/facebook/e/a/b;
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 215
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/e/a/e;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 216
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/e/a/e;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v3, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    .line 217
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/e/a/e;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v5, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v5

    .line 218
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    sget-object v7, Lcom/facebook/e/a/e;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v7, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v7

    .line 220
    new-instance v0, Lcom/facebook/e/a/b;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/e/a/b;-><init>(JJJJ)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 147
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 148
    iget-object v1, p0, Lcom/facebook/e/a/e;->o:Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 149
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/2addr v1, v2

    int-to-float v1, v1

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/facebook/e/a/e;->u:F

    .line 152
    :try_start_0
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->c()V

    .line 153
    invoke-direct {p0}, Lcom/facebook/e/a/e;->h()Lcom/facebook/e/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :goto_0
    iget-object v0, p0, Lcom/facebook/e/a/e;->k:Lcom/facebook/e/a/h;

    invoke-virtual {v0, p0}, Lcom/facebook/e/a/h;->a(Lcom/facebook/e/a/e;)V

    .line 159
    return-void

    .line 154
    :catch_0
    move-exception v0

    .line 155
    sget-object v1, Lcom/facebook/e/a/e;->a:Ljava/lang/Class;

    const-string v2, "mSharedPreferences.blockUntilInitialized() interrupted."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method declared-synchronized a(Lcom/facebook/e/a/b;)V
    .locals 4

    .prologue
    .line 227
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/e/a/e;->m:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/e/a/e;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/e/a/b;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/e/a/e;->d:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/e/a/b;->b()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/e/a/e;->e:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/e/a/b;->c()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/e/a/e;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/e/a/b;->d()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    monitor-exit p0

    return-void

    .line 227
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/facebook/e/a/d;)V
    .locals 2

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/e/a/e;->g:Ljava/util/concurrent/ConcurrentMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    return-void
.end method

.method public a(Lcom/facebook/common/c/i;)Z
    .locals 4

    .prologue
    .line 200
    invoke-virtual {p1}, Lcom/facebook/common/c/i;->a()J

    move-result-wide v0

    .line 207
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-gt v2, v3, :cond_0

    .line 208
    iget-object v2, p0, Lcom/facebook/e/a/e;->n:Lcom/facebook/base/activity/g;

    invoke-interface {v2}, Lcom/facebook/base/activity/g;->a()I

    move-result v2

    iget v3, p0, Lcom/facebook/e/a/e;->u:F

    float-to-int v3, v3

    mul-int/2addr v2, v3

    int-to-long v2, v2

    sub-long/2addr v0, v2

    .line 211
    :cond_0
    iget-object v2, p0, Lcom/facebook/e/a/e;->j:Lcom/facebook/e/a/g;

    invoke-interface {v2}, Lcom/facebook/e/a/g;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/common/c/i;
    .locals 2

    .prologue
    .line 181
    new-instance v0, Lcom/facebook/common/c/i;

    iget-object v1, p0, Lcom/facebook/e/a/e;->i:Ljava/lang/Runtime;

    invoke-direct {v0, v1}, Lcom/facebook/common/c/i;-><init>(Ljava/lang/Runtime;)V

    return-object v0
.end method

.method b(Lcom/facebook/common/c/i;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 295
    iput-object p1, p0, Lcom/facebook/e/a/e;->q:Lcom/facebook/common/c/i;

    .line 297
    iget-object v0, p0, Lcom/facebook/e/a/e;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/d;

    .line 298
    invoke-interface {v0, p1}, Lcom/facebook/e/a/d;->a(Lcom/facebook/common/c/i;)V

    goto :goto_0

    .line 301
    :cond_0
    sget-object v0, Lcom/facebook/e/a/e;->a:Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/facebook/common/c/i;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 302
    return-void
.end method

.method public c()Lcom/facebook/e/a/b;
    .locals 2

    .prologue
    .line 188
    invoke-virtual {p0}, Lcom/facebook/e/a/e;->f()V

    .line 190
    new-instance v0, Lcom/facebook/e/a/b;

    iget-object v1, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-direct {v0, v1}, Lcom/facebook/e/a/b;-><init>(Lcom/facebook/e/a/b;)V

    return-object v0
.end method

.method c(Lcom/facebook/common/c/i;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/e/a/e;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/d;

    .line 307
    invoke-interface {v0, p1}, Lcom/facebook/e/a/d;->b(Lcom/facebook/common/c/i;)V

    goto :goto_0

    .line 309
    :cond_0
    return-void
.end method

.method d()V
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 240
    new-instance v0, Lcom/facebook/common/c/i;

    iget-object v1, p0, Lcom/facebook/e/a/e;->i:Ljava/lang/Runtime;

    invoke-direct {v0, v1}, Lcom/facebook/common/c/i;-><init>(Ljava/lang/Runtime;)V

    .line 242
    iget-wide v1, v0, Lcom/facebook/common/c/i;->b:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    .line 244
    invoke-virtual {p0, v0}, Lcom/facebook/e/a/e;->a(Lcom/facebook/common/c/i;)Z

    move-result v1

    .line 245
    iget-object v2, p0, Lcom/facebook/e/a/e;->p:Lcom/facebook/common/e/h;

    const-string v3, "is_low_on_memory"

    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    if-eqz v1, :cond_0

    .line 247
    invoke-virtual {p0, v0}, Lcom/facebook/e/a/e;->c(Lcom/facebook/common/c/i;)V

    .line 250
    :cond_0
    iget-object v1, p0, Lcom/facebook/e/a/e;->q:Lcom/facebook/common/c/i;

    if-eqz v1, :cond_1

    iget-wide v1, v0, Lcom/facebook/common/c/i;->a:J

    iget-object v3, p0, Lcom/facebook/e/a/e;->q:Lcom/facebook/common/c/i;

    iget-wide v3, v3, Lcom/facebook/common/c/i;->a:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/e/a/e;->j:Lcom/facebook/e/a/g;

    invoke-interface {v3}, Lcom/facebook/e/a/g;->b()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    .line 253
    :cond_1
    invoke-virtual {p0, v0}, Lcom/facebook/e/a/e;->b(Lcom/facebook/common/c/i;)V

    .line 256
    :cond_2
    return-void
.end method

.method e()V
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 263
    invoke-virtual {p0}, Lcom/facebook/e/a/e;->f()V

    .line 265
    iget-object v0, p0, Lcom/facebook/e/a/e;->s:Lcom/facebook/e/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-virtual {v0}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/e/a/e;->s:Lcom/facebook/e/a/b;

    invoke-virtual {v2}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/facebook/e/a/e;->j:Lcom/facebook/e/a/g;

    invoke-interface {v2}, Lcom/facebook/e/a/g;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 269
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/e/a/e;->g()V

    .line 271
    :cond_1
    return-void
.end method

.method declared-synchronized f()V
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 278
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/facebook/e/a/f;->a()Lcom/facebook/e/a/f;

    move-result-object v0

    .line 279
    iget-object v1, p0, Lcom/facebook/e/a/e;->t:Lcom/facebook/e/a/f;

    invoke-virtual {v0, v1}, Lcom/facebook/e/a/f;->a(Lcom/facebook/e/a/f;)Lcom/facebook/e/a/f;

    move-result-object v1

    .line 280
    iput-object v0, p0, Lcom/facebook/e/a/e;->t:Lcom/facebook/e/a/f;

    .line 284
    iget-object v0, p0, Lcom/facebook/e/a/e;->l:Lcom/facebook/e/c;

    invoke-virtual {v0}, Lcom/facebook/e/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-virtual {v1}, Lcom/facebook/e/a/f;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/facebook/e/a/b;->a(J)V

    .line 286
    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-virtual {v1}, Lcom/facebook/e/a/f;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/e/a/b;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    :goto_0
    monitor-exit p0

    return-void

    .line 288
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-virtual {v1}, Lcom/facebook/e/a/f;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/facebook/e/a/b;->c(J)V

    .line 289
    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-virtual {v1}, Lcom/facebook/e/a/f;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/e/a/b;->d(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method g()V
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 314
    new-instance v1, Lcom/facebook/e/a/b;

    iget-object v0, p0, Lcom/facebook/e/a/e;->r:Lcom/facebook/e/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/e/a/b;-><init>(Lcom/facebook/e/a/b;)V

    .line 316
    iput-object v1, p0, Lcom/facebook/e/a/e;->s:Lcom/facebook/e/a/b;

    .line 317
    invoke-virtual {p0, v1}, Lcom/facebook/e/a/e;->a(Lcom/facebook/e/a/b;)V

    .line 319
    iget-object v0, p0, Lcom/facebook/e/a/e;->h:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/a;

    .line 320
    invoke-interface {v0, v1}, Lcom/facebook/e/a/a;->a(Lcom/facebook/e/a/b;)V

    goto :goto_0

    .line 323
    :cond_0
    sget-object v0, Lcom/facebook/e/a/e;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Lcom/facebook/e/a/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 324
    return-void
.end method
