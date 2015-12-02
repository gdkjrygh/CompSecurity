.class Lcom/facebook/debug/d/b;
.super Ljava/lang/Object;
.source "TraceEvent.java"


# static fields
.field private static final g:Lcom/facebook/common/o/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/o/a",
            "<",
            "Lcom/facebook/debug/d/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/facebook/debug/d/d;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 27
    new-instance v0, Lcom/facebook/common/o/d;

    const-class v1, Lcom/facebook/debug/d/b;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/o/d;-><init>(Ljava/lang/Class;Lcom/facebook/common/time/a;)V

    new-instance v1, Lcom/facebook/debug/d/c;

    const-class v2, Lcom/facebook/debug/d/b;

    invoke-direct {v1, v2}, Lcom/facebook/debug/d/c;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/common/o/d;->a(Lcom/facebook/common/o/b;)Lcom/facebook/common/o/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/o/d;->a()Lcom/facebook/common/o/a;

    move-result-object v0

    sput-object v0, Lcom/facebook/debug/d/b;->g:Lcom/facebook/common/o/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/debug/d/c;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/facebook/debug/d/b;-><init>()V

    return-void
.end method

.method static a(Lcom/facebook/debug/d/d;JLjava/lang/String;Ljava/lang/String;J)Lcom/facebook/debug/d/b;
    .locals 3

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/debug/d/b;->g:Lcom/facebook/common/o/a;

    invoke-virtual {v0}, Lcom/facebook/common/o/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/d/b;

    .line 49
    iput-object p0, v0, Lcom/facebook/debug/d/b;->a:Lcom/facebook/debug/d/d;

    .line 50
    iput-wide p1, v0, Lcom/facebook/debug/d/b;->b:J

    .line 51
    iput-object p3, v0, Lcom/facebook/debug/d/b;->c:Ljava/lang/String;

    .line 52
    iput-object p4, v0, Lcom/facebook/debug/d/b;->d:Ljava/lang/String;

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/facebook/debug/d/b;->e:J

    .line 54
    iput-wide p5, v0, Lcom/facebook/debug/d/b;->f:J

    .line 55
    return-object v0
.end method

.method static a(J)Ljava/lang/String;
    .locals 5

    .prologue
    .line 137
    long-to-float v0, p0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v1, v0

    .line 138
    const-string v0, ""

    .line 139
    const-wide/16 v3, 0x2710

    cmp-long v3, v1, v3

    if-gez v3, :cond_0

    const-string v0, "_"

    .line 140
    :cond_0
    const-wide/16 v3, 0x3e8

    cmp-long v3, v1, v3

    if-gez v3, :cond_1

    const-string v0, "__"

    .line 141
    :cond_1
    const-wide/16 v3, 0x64

    cmp-long v3, v1, v3

    if-gez v3, :cond_2

    const-string v0, "___"

    .line 142
    :cond_2
    const-wide/16 v3, 0xa

    cmp-long v3, v1, v3

    if-gez v3, :cond_3

    const-string v0, "____"

    .line 143
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/debug/d/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 12
    iput-object p1, p0, Lcom/facebook/debug/d/b;->c:Ljava/lang/String;

    return-object p1
.end method

.method static b(J)Ljava/lang/String;
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v9, 0x1

    const-wide/16 v7, 0x3e8

    .line 154
    long-to-float v0, p0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v0, v0

    .line 155
    div-long v2, v0, v7

    const-wide/16 v4, 0x3c

    rem-long/2addr v2, v4

    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 156
    rem-long/2addr v0, v7

    invoke-static {v0, v1, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v5, 0x64

    add-long/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v2, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    add-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/debug/d/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 12
    iput-object p1, p0, Lcom/facebook/debug/d/b;->d:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method a(JJLjava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    const-wide/16 v1, -0x1

    cmp-long v1, p3, v1

    if-nez v1, :cond_0

    .line 94
    const-string v1, "-----"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :goto_0
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget-wide v1, p0, Lcom/facebook/debug/d/b;->e:J

    sub-long/2addr v1, p1

    invoke-static {v1, v2}, Lcom/facebook/debug/d/b;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget-object v1, p0, Lcom/facebook/debug/d/b;->a:Lcom/facebook/debug/d/d;

    sget-object v2, Lcom/facebook/debug/d/d;->START:Lcom/facebook/debug/d/d;

    if-ne v1, v2, :cond_1

    .line 102
    const-string v1, " Start         "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    :goto_1
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {p0}, Lcom/facebook/debug/d/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 96
    :cond_0
    iget-wide v1, p0, Lcom/facebook/debug/d/b;->e:J

    sub-long/2addr v1, p3

    invoke-static {v1, v2}, Lcom/facebook/debug/d/b;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 103
    :cond_1
    iget-object v1, p0, Lcom/facebook/debug/d/b;->a:Lcom/facebook/debug/d/d;

    sget-object v2, Lcom/facebook/debug/d/d;->STOP:Lcom/facebook/debug/d/d;

    if-ne v1, v2, :cond_2

    .line 104
    const-string v1, " Done "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    iget-wide v1, p0, Lcom/facebook/debug/d/b;->e:J

    iget-wide v3, p0, Lcom/facebook/debug/d/b;->f:J

    sub-long/2addr v1, v3

    .line 106
    invoke-static {v1, v2}, Lcom/facebook/debug/d/b;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const-string v1, " ms "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 109
    :cond_2
    const-string v1, " Comment       "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method a()V
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/facebook/debug/d/b;->g:Lcom/facebook/common/o/a;

    invoke-virtual {v0, p0}, Lcom/facebook/common/o/a;->a(Ljava/lang/Object;)V

    .line 60
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/facebook/debug/d/b;->b:J

    return-wide v0
.end method

.method public c()Lcom/facebook/debug/d/d;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/debug/d/b;->a:Lcom/facebook/debug/d/d;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/debug/d/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/debug/d/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 79
    iget-wide v0, p0, Lcom/facebook/debug/d/b;->e:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/debug/d/b;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/facebook/debug/d/b;->c:Ljava/lang/String;

    .line 124
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/debug/d/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/debug/d/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
