.class public Lcom/facebook/common/i/b;
.super Ljava/lang/Object;
.source "IncrementalTaskExecutor.java"


# instance fields
.field private final a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/common/i/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/os/Handler;

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/common/v/j;

.field private e:J

.field private f:J

.field private g:Z

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/common/v/f;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/i/b;->a:Ljava/util/LinkedList;

    .line 31
    const-wide/16 v0, 0x4

    iput-wide v0, p0, Lcom/facebook/common/i/b;->e:J

    .line 32
    const-wide/16 v0, 0x11

    iput-wide v0, p0, Lcom/facebook/common/i/b;->f:J

    .line 33
    iput-boolean v2, p0, Lcom/facebook/common/i/b;->g:Z

    .line 34
    iput-boolean v2, p0, Lcom/facebook/common/i/b;->h:Z

    .line 35
    iput-boolean v2, p0, Lcom/facebook/common/i/b;->i:Z

    .line 45
    iput-object p1, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    .line 46
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/facebook/common/i/c;

    invoke-direct {v1, p0}, Lcom/facebook/common/i/c;-><init>(Lcom/facebook/common/i/b;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/facebook/common/i/b;->b:Landroid/os/Handler;

    .line 55
    if-eqz p2, :cond_0

    .line 56
    new-instance v0, Lcom/facebook/common/i/d;

    invoke-direct {v0, p0}, Lcom/facebook/common/i/d;-><init>(Lcom/facebook/common/i/b;)V

    iput-object v0, p0, Lcom/facebook/common/i/b;->d:Lcom/facebook/common/v/j;

    .line 65
    iget-object v0, p0, Lcom/facebook/common/i/b;->d:Lcom/facebook/common/v/j;

    invoke-virtual {p2, v0}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/j;)V

    .line 69
    :goto_0
    return-void

    .line 67
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/i/b;->d:Lcom/facebook/common/v/j;

    goto :goto_0
.end method

.method private a()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 185
    iget-boolean v0, p0, Lcom/facebook/common/i/b;->h:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/facebook/common/i/b;->i:Z

    if-nez v0, :cond_1

    .line 211
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 190
    iput-boolean v7, p0, Lcom/facebook/common/i/b;->h:Z

    .line 194
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/facebook/common/i/b;->e:J

    add-long/2addr v3, v5

    .line 196
    :goto_1
    iget-object v0, p0, Lcom/facebook/common/i/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    .line 198
    cmp-long v0, v5, v3

    if-ltz v0, :cond_2

    .line 200
    iget-wide v3, p0, Lcom/facebook/common/i/b;->f:J

    add-long v0, v1, v3

    sub-long/2addr v0, v5

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/common/i/b;->a(J)V

    goto :goto_0

    .line 203
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/common/i/b;->g:Z

    .line 204
    iget-object v0, p0, Lcom/facebook/common/i/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/i/a;

    .line 205
    invoke-direct {p0, v0, v3, v4}, Lcom/facebook/common/i/b;->a(Lcom/facebook/common/i/a;J)Z

    .line 206
    invoke-virtual {v0}, Lcom/facebook/common/i/a;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    iget-object v0, p0, Lcom/facebook/common/i/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 209
    :cond_3
    iput-boolean v7, p0, Lcom/facebook/common/i/b;->g:Z

    goto :goto_1
.end method

.method private a(J)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 247
    iget-object v0, p0, Lcom/facebook/common/i/b;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/i/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/facebook/common/i/b;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 250
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/i/b;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/common/i/b;->a()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/common/i/b;J)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/facebook/common/i/b;->a(J)V

    return-void
.end method

.method private a(Lcom/facebook/common/i/a;J)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 215
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/common/i/a;->c()Z

    move-result v0

    if-nez v0, :cond_4

    .line 216
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    .line 217
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    cmp-long v0, v2, p2

    if-ltz v0, :cond_0

    move v0, v1

    .line 242
    :goto_1
    return v0

    .line 220
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/common/i/a;->d()Ljava/util/LinkedList;

    move-result-object v2

    .line 222
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 223
    invoke-virtual {v2}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/i/a;

    .line 224
    :cond_1
    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/common/i/b;->a(Lcom/facebook/common/i/a;J)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 225
    iget-object v3, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    .line 226
    cmp-long v3, v3, p2

    if-ltz v3, :cond_1

    move v0, v1

    .line 230
    goto :goto_1

    .line 233
    :cond_2
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 237
    :goto_2
    iget-object v0, p0, Lcom/facebook/common/i/b;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    goto :goto_0

    .line 235
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/common/i/a;->a()V

    goto :goto_2

    .line 242
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/common/i/b;Z)Z
    .locals 0

    .prologue
    .line 22
    iput-boolean p1, p0, Lcom/facebook/common/i/b;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/common/i/b;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/facebook/common/i/b;->h:Z

    return v0
.end method

.method static synthetic c(Lcom/facebook/common/i/b;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/facebook/common/i/b;->i:Z

    return v0
.end method
