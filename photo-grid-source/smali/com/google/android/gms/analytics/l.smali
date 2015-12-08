.class public final Lcom/google/android/gms/analytics/l;
.super Lcom/google/android/gms/analytics/internal/y;


# instance fields
.field private a:Z

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/analytics/internal/h;

.field private final e:Lcom/google/android/gms/analytics/n;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/aa;Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/y;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/l;->c:Ljava/util/Map;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v1, "&tid"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v1, "useSecure"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v1, "&a"

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const v3, 0x7fffffff

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/analytics/internal/h;

    const-string v1, "tracking"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/h;-><init>(Ljava/lang/String;B)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/l;->d:Lcom/google/android/gms/analytics/internal/h;

    new-instance v0, Lcom/google/android/gms/analytics/n;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/n;-><init>(Lcom/google/android/gms/analytics/l;Lcom/google/android/gms/analytics/internal/aa;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/l;->e:Lcom/google/android/gms/analytics/n;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->e:Lcom/google/android/gms/analytics/n;

    return-object v0
.end method

.method private static a(Ljava/util/Map$Entry;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 0
    .line 1000
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    const-string v2, "&"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 0
    :goto_0
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :cond_1
    move v0, v1

    .line 1000
    goto :goto_0

    .line 0
    :cond_2
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Key should be non-null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private static a(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->w()Lcom/google/android/gms/analytics/internal/b;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/Map;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/al;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->x()Lcom/google/android/gms/analytics/internal/al;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/bd;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->y()Lcom/google/android/gms/analytics/internal/bd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/bd;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->y()Lcom/google/android/gms/analytics/internal/bd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->d:Lcom/google/android/gms/analytics/internal/h;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/j;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->n()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/j;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->n()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/s;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->r()Lcom/google/android/gms/analytics/internal/s;

    move-result-object v0

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/s;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->r()Lcom/google/android/gms/analytics/internal/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->e:Lcom/google/android/gms/analytics/n;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/n;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->t()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "&an"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/analytics/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->t()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "&av"

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/analytics/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final a(D)V
    .locals 3

    const-string v0, "&sf"

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/analytics/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "&cd"

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/analytics/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->l()Lcom/google/android/gms/internal/wg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->a()J

    move-result-wide v6

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->q()Lcom/google/android/gms/analytics/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppOptOut is set to true. Not sending Google Analytics hit"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/l;->c(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->q()Lcom/google/android/gms/analytics/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/f;->d()Z

    move-result v8

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    invoke-static {v0, v3}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {p1, v3}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v1, "useSecure"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/q;->c(Ljava/lang/String;)Z

    move-result v9

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->c:Ljava/util/Map;

    invoke-static {v0, v3}, Lcom/google/android/gms/analytics/l;->b(Ljava/util/Map;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const-string v0, "t"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->n()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "Missing hit type parameter"

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "tid"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->n()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "Missing tracking id parameter"

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_0

    .line 2000
    :cond_2
    iget-boolean v4, p0, Lcom/google/android/gms/analytics/l;->a:Z

    .line 0
    monitor-enter p0

    :try_start_0
    const-string v0, "screenview"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "pageview"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "appview"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v1, "&a"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const v1, 0x7fffffff

    if-lt v0, v1, :cond_4

    const/4 v0, 0x1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/analytics/l;->b:Ljava/util/Map;

    const-string v2, "&a"

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/l;->p()Lcom/google/android/gms/c/f;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/m;

    move-object v2, p0

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/analytics/m;-><init>(Lcom/google/android/gms/analytics/l;Ljava/util/Map;ZLjava/lang/String;JZZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
