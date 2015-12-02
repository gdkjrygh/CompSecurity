.class public Lcom/qihoo360/mobilesafe/core/b/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/qihoo360/mobilesafe/core/b/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/b/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/b/b;->b:Landroid/content/Context;

    .line 24
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 39
    .line 43
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 47
    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->c()Ljava/util/Map;

    move-result-object v3

    .line 48
    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->d()Ljava/util/Map;

    move-result-object v4

    .line 49
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 50
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 52
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 141
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_1
    return-object v2

    .line 53
    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 55
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 57
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_3

    .line 58
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_3
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v10, 0x1

    if-ne v1, v10, :cond_0

    .line 65
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x2

    if-ne v1, v10, :cond_4

    .line 66
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 72
    :cond_4
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x4

    if-ne v1, v10, :cond_6

    .line 73
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/b;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v1

    iget-object v10, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 74
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    if-nez v1, :cond_5

    .line 75
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/b;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v1

    iget-object v10, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 77
    :cond_5
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 83
    :cond_6
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x3

    if-ne v1, v10, :cond_7

    .line 84
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 89
    :cond_7
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-nez v1, :cond_0

    .line 90
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 98
    :cond_8
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 99
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 106
    :cond_9
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x4

    if-ne v1, v10, :cond_b

    .line 107
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/b;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v1

    iget-object v10, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 108
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    if-nez v1, :cond_a

    .line 109
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/b;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v1

    iget-object v10, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 111
    :cond_a
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 118
    :cond_b
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x3

    if-ne v1, v10, :cond_c

    .line 119
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 123
    :cond_c
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-nez v1, :cond_d

    .line 124
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 128
    :cond_d
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x1

    if-eq v1, v10, :cond_0

    .line 132
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x2

    if-ne v1, v10, :cond_0

    .line 133
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 163
    .line 167
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 168
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 170
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 171
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 184
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    :cond_0
    return-object v2

    .line 171
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 172
    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/core/b/e;->c()Ljava/util/Map;

    move-result-object v1

    .line 174
    iget-object v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 175
    iget-object v6, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v6, 0x1

    if-ne v1, v6, :cond_2

    .line 176
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 181
    :cond_2
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
