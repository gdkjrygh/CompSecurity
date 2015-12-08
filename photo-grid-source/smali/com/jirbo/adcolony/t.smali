.class Lcom/jirbo/adcolony/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/t$a;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field e:Z

.field f:Z


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    .line 15
    iput-boolean v1, p0, Lcom/jirbo/adcolony/t;->e:Z

    .line 16
    iput-boolean v1, p0, Lcom/jirbo/adcolony/t;->f:Z

    .line 20
    iput-object p1, p0, Lcom/jirbo/adcolony/t;->a:Lcom/jirbo/adcolony/d;

    .line 21
    return-void
.end method


# virtual methods
.method a(I)I
    .locals 2

    .prologue
    .line 114
    const-wide v0, 0x40f5180000000000L    # 86400.0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v0

    return v0
.end method

.method declared-synchronized a(ID)I
    .locals 8

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    sub-double v4, v0, p2

    .line 91
    const/4 v1, 0x0

    .line 92
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_0

    .line 94
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-wide v6, v0, Lcom/jirbo/adcolony/t$a;->d:D

    cmpg-double v0, v6, v4

    if-ltz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget v0, v0, Lcom/jirbo/adcolony/t$a;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_1

    add-int/lit8 v0, v1, 0x1

    .line 92
    :goto_1
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 98
    :cond_0
    monitor-exit p0

    return v1

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method declared-synchronized a(Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 51
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v4, v0, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    .line 56
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v2, v1

    :goto_0
    if-ltz v3, :cond_2

    .line 58
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/t$a;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 59
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/t$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v2, 0x1

    .line 62
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/t$a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, v1, 0x1

    move v1, v2

    .line 56
    :goto_1
    add-int/lit8 v2, v3, -0x1

    move v3, v2

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 66
    :cond_0
    if-nez v2, :cond_2

    :cond_1
    move v0, v1

    move v1, v2

    goto :goto_1

    .line 69
    :cond_2
    monitor-exit p0

    return v1

    .line 51
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;D)I
    .locals 8

    .prologue
    .line 74
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    sub-double v4, v0, p2

    .line 76
    const/4 v1, 0x0

    .line 77
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_0

    .line 79
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-wide v6, v0, Lcom/jirbo/adcolony/t$a;->d:D

    cmpg-double v0, v6, v4

    if-ltz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/t$a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, v1, 0x1

    .line 77
    :goto_1
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 82
    :cond_0
    monitor-exit p0

    return v1

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method a()V
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/jirbo/adcolony/t;->b()V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/t;->e:Z

    .line 27
    return-void
.end method

.method a(Ljava/lang/String;I)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 31
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Adding play event to play history"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 33
    iput-boolean v7, p0, Lcom/jirbo/adcolony/t;->e:Z

    .line 35
    iget-object v6, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    new-instance v0, Lcom/jirbo/adcolony/t$a;

    iget-object v1, p0, Lcom/jirbo/adcolony/t;->a:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v1, v1, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/t$a;-><init>(Ljava/lang/String;DLjava/lang/String;I)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 38
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Got play count of "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    const-string v2, " for this ad"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 39
    if-nez v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    :goto_0
    return-void

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method b(I)I
    .locals 2

    .prologue
    .line 115
    const-wide v0, 0x4122750000000000L    # 604800.0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v0

    return v0
.end method

.method b(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 85
    const-wide v0, 0x40f5180000000000L    # 86400.0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;D)I

    move-result v0

    return v0
.end method

.method b()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v6, 0x0

    .line 121
    sput-boolean v11, Lcom/jirbo/adcolony/a;->r:Z

    .line 122
    iget-boolean v0, p0, Lcom/jirbo/adcolony/t;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/t$a;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/jirbo/adcolony/t;->a:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v1, v1, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    if-ne v0, v1, :cond_1

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 124
    :cond_1
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "play_history_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v8

    .line 125
    if-eqz v8, :cond_0

    .line 126
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 128
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    .line 129
    const-string v0, "reward_credit"

    invoke-virtual {v8, v0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v1

    move v0, v6

    .line 130
    :goto_1
    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCData$g;->o()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 132
    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/ADCData$g;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v3

    .line 134
    iget-object v4, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 137
    :cond_2
    const-string v0, "play_events"

    invoke-virtual {v8, v0}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v9

    move v7, v6

    .line 138
    :goto_2
    invoke-virtual {v9}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 140
    invoke-virtual {v9, v7}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 141
    const-string v1, "timestamp"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    .line 142
    const-string v1, "zone_id"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 143
    const-string v1, "ad_id"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v5

    .line 144
    const-wide/16 v0, 0x0

    cmpl-double v0, v2, v0

    if-eqz v0, :cond_3

    if-eqz v4, :cond_3

    if-eqz v5, :cond_3

    .line 146
    iget-object v10, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    new-instance v0, Lcom/jirbo/adcolony/t$a;

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/jirbo/adcolony/t$a;-><init>(Ljava/lang/String;DLjava/lang/String;I)V

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    :cond_3
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    .line 150
    :cond_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    .line 151
    const-string v0, "play_counts"

    invoke-virtual {v8, v0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 152
    :goto_3
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$g;->o()I

    move-result v1

    if-ge v6, v1, :cond_5

    .line 154
    invoke-virtual {v0, v6}, Lcom/jirbo/adcolony/ADCData$g;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 155
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    .line 156
    iget-object v3, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 159
    :cond_5
    iput-boolean v11, p0, Lcom/jirbo/adcolony/t;->f:Z

    goto/16 :goto_0
.end method

.method b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/t;->e:Z

    .line 112
    return-void
.end method

.method c(I)I
    .locals 2

    .prologue
    .line 116
    const-wide v0, 0x41440cd000000000L    # 2628000.0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v0

    return v0
.end method

.method c(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 104
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 105
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method c()V
    .locals 12

    .prologue
    .line 166
    new-instance v2, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v2}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    .line 168
    new-instance v3, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v3}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 169
    new-instance v4, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v4}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 170
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    const-wide v6, 0x41446f4000000000L    # 2678400.0

    sub-double v6, v0, v6

    .line 171
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 173
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/t$a;

    .line 174
    iget-wide v8, v0, Lcom/jirbo/adcolony/t$a;->d:D

    cmpg-double v5, v8, v6

    if-ltz v5, :cond_0

    .line 175
    new-instance v5, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v5}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 176
    const-string v8, "zone_id"

    iget-object v9, v0, Lcom/jirbo/adcolony/t$a;->a:Ljava/lang/String;

    invoke-virtual {v5, v8, v9}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v8, "ad_id"

    iget v9, v0, Lcom/jirbo/adcolony/t$a;->b:I

    invoke-virtual {v5, v8, v9}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 178
    const-string v8, "timestamp"

    iget-wide v10, v0, Lcom/jirbo/adcolony/t$a;->d:D

    invoke-virtual {v5, v8, v10, v11}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 179
    invoke-virtual {v2, v5}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 171
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 181
    :cond_0
    const-string v0, "play_events"

    invoke-virtual {v3, v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 183
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 185
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->c:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 186
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    goto :goto_1

    .line 188
    :cond_1
    const-string v0, "play_counts"

    invoke-virtual {v3, v0, v4}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 190
    new-instance v2, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 191
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 193
    iget-object v0, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 195
    iget-object v1, p0, Lcom/jirbo/adcolony/t;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    goto :goto_2

    .line 198
    :cond_2
    const-string v0, "reward_credit"

    invoke-virtual {v3, v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 200
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Saving play history"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    .line 201
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "play_history_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 202
    return-void
.end method

.method d(I)I
    .locals 2

    .prologue
    .line 117
    const-wide v0, 0x416e133800000000L    # 1.5768E7

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/t;->a(ID)I

    move-result v0

    return v0
.end method

.method d()V
    .locals 1

    .prologue
    .line 209
    iget-boolean v0, p0, Lcom/jirbo/adcolony/t;->e:Z

    if-eqz v0, :cond_0

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/t;->e:Z

    .line 212
    invoke-virtual {p0}, Lcom/jirbo/adcolony/t;->c()V

    .line 214
    :cond_0
    return-void
.end method
