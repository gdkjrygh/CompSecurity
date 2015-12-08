.class Lcom/google/android/gms/analytics/x$d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic zQ:Lcom/google/android/gms/analytics/x;

.field private final zR:Ljava/util/Map;
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


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/x;Ljava/util/Map;)V
    .locals 4
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

    iput-object p1, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    const-string v0, "&ht"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    const-string v3, "&ht"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "useSecure"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "useSecure"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/analytics/an;->f(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "https:"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "http:"

    goto :goto_0

    :cond_1
    const-string v0, "https:"

    goto :goto_0
.end method

.method private w(Ljava/util/Map;)V
    .locals 2
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

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->a(Lcom/google/android/gms/analytics/x;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/a;->w(Landroid/content/Context;)Lcom/google/android/gms/analytics/q;

    move-result-object v0

    const-string v1, "&adid"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v1, "&ate"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    return-void
.end method

.method private x(Ljava/util/Map;)V
    .locals 2
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

    invoke-static {}, Lcom/google/android/gms/analytics/g;->dZ()Lcom/google/android/gms/analytics/g;

    move-result-object v0

    const-string v1, "&an"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v1, "&av"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v1, "&aid"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v1, "&aiid"

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/analytics/an;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/q;)V

    const-string v0, "&v"

    const-string v1, "1"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private y(Ljava/util/Map;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v2, 0x1

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const/4 v1, 0x0

    const-string v0, "&sf"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    const-string v0, "&sf"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8, v9}, Lcom/google/android/gms/analytics/an;->a(Ljava/lang/String;D)D

    move-result-wide v4

    cmpl-double v0, v4, v8

    if-ltz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const-string v0, "&cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->ah(Ljava/lang/String;)I

    move-result v0

    rem-int/lit16 v0, v0, 0x2710

    int-to-double v6, v0

    mul-double/2addr v4, v8

    cmpl-double v0, v6, v4

    if-ltz v0, :cond_3

    const-string v0, "&t"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "unknown"

    :goto_1
    const-string v3, "%s hit sampled out"

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/ae;->V(Ljava/lang/String;)V

    move v0, v2

    goto :goto_0

    :cond_2
    const-string v0, "&t"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/x$d;->w(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    const-string v1, "&cid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    const-string v1, "&cid"

    invoke-static {}, Lcom/google/android/gms/analytics/k;->el()Lcom/google/android/gms/analytics/k;

    move-result-object v2

    const-string v3, "&cid"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/k;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->a(Lcom/google/android/gms/analytics/x;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getAppOptOut()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/x$d;->y(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->b(Lcom/google/android/gms/analytics/x;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->D(Z)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v2}, Lcom/google/android/gms/analytics/x;->b(Lcom/google/android/gms/analytics/x;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->setCampaignParamsFromUrl(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/analytics/y;->eK()Lcom/google/android/gms/analytics/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/y;->D(Z)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/analytics/x;->a(Lcom/google/android/gms/analytics/x;Ljava/lang/String;)Ljava/lang/String;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/x$d;->x(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/android/gms/analytics/ac;->z(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v0}, Lcom/google/android/gms/analytics/x;->d(Lcom/google/android/gms/analytics/x;)Lcom/google/android/gms/analytics/ak;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    const-string v3, "&ht"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/analytics/x$d;->zR:Ljava/util/Map;

    invoke-direct {p0, v4}, Lcom/google/android/gms/analytics/x$d;->v(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/analytics/x$d;->zQ:Lcom/google/android/gms/analytics/x;

    invoke-static {v5}, Lcom/google/android/gms/analytics/x;->c(Lcom/google/android/gms/analytics/x;)Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/analytics/ak;->b(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    goto :goto_0
.end method
