.class public final Lcom/roidapp/cloudlib/ads/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/ads/f;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/cmcm/adsdk/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/roidapp/cloudlib/ads/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->c:Ljava/util/Map;

    .line 36
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->b:Ljava/util/Map;

    .line 37
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->d:Ljava/util/Map;

    .line 38
    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/ads/f;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/roidapp/cloudlib/ads/f;->a:Lcom/roidapp/cloudlib/ads/f;

    if-nez v0, :cond_0

    new-instance v0, Lcom/roidapp/cloudlib/ads/f;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/ads/f;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/ads/f;->a:Lcom/roidapp/cloudlib/ads/f;

    .line 27
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/ads/f;->a:Lcom/roidapp/cloudlib/ads/f;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/cmcm/a/a/a;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/f;

    .line 82
    if-nez v0, :cond_0

    move-object v0, v3

    .line 130
    :goto_0
    return-object v0

    .line 83
    :cond_0
    invoke-virtual {v0}, Lcom/cmcm/adsdk/f;->b()Ljava/util/List;

    move-result-object v2

    .line 85
    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move-object v0, v3

    .line 86
    goto :goto_0

    .line 89
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 91
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 92
    if-eqz v0, :cond_3

    const-string v6, "fb"

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 93
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 97
    :cond_4
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v0

    const/4 v4, 0x2

    if-lt v0, v4, :cond_5

    move-object v2, v1

    .line 103
    :cond_5
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    int-to-double v4, v4

    mul-double/2addr v0, v4

    double-to-int v4, v0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 104
    if-nez v0, :cond_6

    move-object v0, v3

    .line 105
    goto :goto_0

    .line 107
    :cond_6
    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 108
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 110
    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 114
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v5, 0x1

    if-le v1, v5, :cond_a

    .line 116
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    int-to-double v6, v5

    mul-double/2addr v0, v6

    double-to-int v0, v0

    .line 117
    if-lt v0, v4, :cond_8

    .line 118
    add-int/lit8 v0, v0, 0x1

    .line 120
    :cond_8
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 121
    if-nez v0, :cond_9

    move-object v0, v3

    .line 122
    goto/16 :goto_0

    .line 124
    :cond_9
    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 129
    :cond_a
    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0
.end method

.method public final a(Landroid/content/Context;I)Lcom/cmcm/adsdk/f;
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/f;

    .line 42
    if-nez v0, :cond_0

    .line 43
    new-instance v0, Lcom/cmcm/adsdk/f;

    new-instance v1, Lcom/roidapp/baselib/c/w;

    invoke-direct {v1, p1}, Lcom/roidapp/baselib/c/w;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/cmcm/adsdk/f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 44
    iget-object v1, p0, Lcom/roidapp/cloudlib/ads/f;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    :cond_0
    return-object v0
.end method

.method public final a(ILcom/cmcm/a/a/d;)V
    .locals 2

    .prologue
    .line 74
    if-nez p2, :cond_1

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/h;

    .line 76
    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/ads/h;->b(Lcom/cmcm/a/a/d;)V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;ILcom/cmcm/a/a/d;)V
    .locals 4

    .prologue
    .line 60
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/ads/f;->a(Landroid/content/Context;I)Lcom/cmcm/adsdk/f;

    move-result-object v1

    .line 1050
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/h;

    .line 1051
    if-nez v0, :cond_0

    .line 1052
    new-instance v0, Lcom/roidapp/cloudlib/ads/h;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/ads/h;-><init>()V

    .line 1053
    iget-object v2, p0, Lcom/roidapp/cloudlib/ads/f;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_0
    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/ads/h;->a(Lcom/cmcm/a/a/d;)V

    .line 63
    invoke-virtual {v1, v0}, Lcom/cmcm/adsdk/f;->a(Lcom/cmcm/a/a/d;)V

    .line 64
    invoke-virtual {v1}, Lcom/cmcm/adsdk/f;->a()V

    .line 65
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/f;->d:Ljava/util/Map;

    const v1, 0x9c48

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/h;

    .line 69
    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/h;->b()V

    .line 71
    :cond_0
    return-void
.end method
