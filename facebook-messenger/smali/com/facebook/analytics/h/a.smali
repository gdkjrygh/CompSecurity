.class public Lcom/facebook/analytics/h/a;
.super Ljava/lang/Object;
.source "TimeSpentAnalyticsClientEvent.java"


# static fields
.field private static final i:Ljava/util/Random;


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:J

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/facebook/analytics/h/a;->i:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-boolean v2, p0, Lcom/facebook/analytics/h/a;->h:Z

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/h/a;->d:J

    .line 63
    iput v2, p0, Lcom/facebook/analytics/h/a;->e:I

    .line 64
    invoke-direct {p0}, Lcom/facebook/analytics/h/a;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/h/a;->f:Ljava/lang/String;

    .line 65
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->c:J

    .line 66
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->b:J

    .line 67
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->a:J

    .line 68
    return-void
.end method

.method private b(J)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    .line 110
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, v0, :cond_0

    .line 111
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->b:J

    iget-wide v4, p0, Lcom/facebook/analytics/h/a;->c:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    :goto_0
    iget-wide v1, p0, Lcom/facebook/analytics/h/a;->b:J

    iput-wide v1, p0, Lcom/facebook/analytics/h/a;->a:J

    .line 119
    iget-wide v1, p0, Lcom/facebook/analytics/h/a;->d:J

    iget-wide v3, p0, Lcom/facebook/analytics/h/a;->b:J

    iget-wide v5, p0, Lcom/facebook/analytics/h/a;->c:J

    sub-long/2addr v3, v5

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/facebook/analytics/h/a;->d:J

    .line 121
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->b:J

    .line 122
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->c:J

    .line 124
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_1

    :goto_1
    return v0

    .line 114
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->c:J

    iget-wide v4, p0, Lcom/facebook/analytics/h/a;->a:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v1, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->b:J

    iget-wide v4, p0, Lcom/facebook/analytics/h/a;->c:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 124
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/analytics/h/a;->i:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 75
    iget v0, p0, Lcom/facebook/analytics/h/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/analytics/h/a;->e:I

    .line 76
    iget-object v0, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 77
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 80
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/h/a;->d:J

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/analytics/h/a;->e:I

    .line 82
    invoke-direct {p0}, Lcom/facebook/analytics/h/a;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/h/a;->f:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 128
    iget-wide v0, p0, Lcom/facebook/analytics/h/a;->b:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 129
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/h/a;->b(J)Z

    move-result v0

    .line 133
    :goto_0
    return v0

    .line 131
    :cond_0
    iput-wide p1, p0, Lcom/facebook/analytics/h/a;->b:J

    .line 133
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/analytics/cb;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 86
    iget-object v0, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 87
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "time_spent"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "tos_array"

    iget-object v2, p0, Lcom/facebook/analytics/h/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "tos_sum"

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->d:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "tos_seq"

    iget v2, p0, Lcom/facebook/analytics/h/a;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "tos_id"

    iget-object v2, p0, Lcom/facebook/analytics/h/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 94
    iget-boolean v1, p0, Lcom/facebook/analytics/h/a;->h:Z

    if-eqz v1, :cond_0

    .line 95
    const-string v1, "trigger"

    const-string v2, "clock_change"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 96
    iput-boolean v4, p0, Lcom/facebook/analytics/h/a;->h:Z

    .line 99
    :cond_0
    invoke-direct {p0}, Lcom/facebook/analytics/h/a;->f()V

    .line 106
    :goto_0
    return-object v0

    .line 104
    :cond_1
    iput-boolean v4, p0, Lcom/facebook/analytics/h/a;->h:Z

    .line 106
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    .prologue
    .line 137
    iget-wide v0, p0, Lcom/facebook/analytics/h/a;->b:J

    iget-wide v2, p0, Lcom/facebook/analytics/h/a;->a:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 138
    iget-wide v0, p0, Lcom/facebook/analytics/h/a;->b:J

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/h/a;->b(J)Z

    .line 140
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/facebook/analytics/h/a;->c()V

    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/h/a;->h:Z

    .line 145
    return-void
.end method
