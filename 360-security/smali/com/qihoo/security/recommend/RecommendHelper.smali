.class public Lcom/qihoo/security/recommend/RecommendHelper;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;,
        Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;
    }
.end annotation


# static fields
.field public static a:Lcom/qihoo/security/recommend/RecommendHelper;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->d:Ljava/util/Map;

    .line 101
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->b:Landroid/content/Context;

    .line 102
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/recommend/RecommendHelper;
    .locals 2

    .prologue
    .line 94
    const-class v1, Lcom/qihoo/security/recommend/RecommendHelper;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper;->a:Lcom/qihoo/security/recommend/RecommendHelper;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lcom/qihoo/security/recommend/RecommendHelper;

    invoke-direct {v0}, Lcom/qihoo/security/recommend/RecommendHelper;-><init>()V

    sput-object v0, Lcom/qihoo/security/recommend/RecommendHelper;->a:Lcom/qihoo/security/recommend/RecommendHelper;

    .line 97
    :cond_0
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper;->a:Lcom/qihoo/security/recommend/RecommendHelper;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 94
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;I)V
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->countKey:Ljava/lang/String;

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 124
    return-void
.end method

.method private e(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)I
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->countKey:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private f(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 4

    .prologue
    .line 131
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->timeKey:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 132
    return-void
.end method

.method private g(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)J
    .locals 4

    .prologue
    .line 135
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->timeKey:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private h(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z
    .locals 6

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->g(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)J

    move-result-wide v0

    .line 140
    invoke-direct {p0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->e(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)I

    move-result v2

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v0, v4, v0

    .line 142
    const-wide/32 v4, 0x5265c00

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    const/4 v0, 0x2

    if-ge v2, v0, :cond_0

    const/4 v0, 0x1

    .line 149
    :goto_0
    return v0

    .line 142
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 2

    .prologue
    .line 105
    invoke-direct {p0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->e(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)I

    move-result v0

    .line 106
    add-int/lit8 v0, v0, 0x1

    .line 107
    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 108
    invoke-virtual {p0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 112
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;I)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    return-void
.end method

.method public b()Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->c:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    return-object v0
.end method

.method public b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 1

    .prologue
    .line 115
    if-nez p1, :cond_0

    .line 120
    :goto_0
    return-void

    .line 118
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;I)V

    .line 119
    invoke-direct {p0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->f(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    goto :goto_0
.end method

.method public c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
    .locals 6

    .prologue
    .line 157
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->values()[Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    .line 159
    if-ne p1, v4, :cond_1

    .line 158
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 162
    :cond_1
    invoke-direct {p0, v4}, Lcom/qihoo/security/recommend/RecommendHelper;->h(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 163
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 169
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    .line 173
    if-lez v0, :cond_3

    .line 174
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    int-to-double v4, v0

    mul-double/2addr v2, v4

    double-to-int v0, v2

    .line 175
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 178
    :goto_2
    return-object v0

    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public c()V
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/qihoo/security/recommend/RecommendHelper;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 201
    return-void
.end method

.method public d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/qihoo/security/recommend/RecommendHelper;->c:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 183
    return-void
.end method
