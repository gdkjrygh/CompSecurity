.class Lcom/facebook/orca/f/ab;
.super Ljava/lang/Object;
.source "ThreadLocalState.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:J

.field private c:J

.field private d:Z

.field private e:Landroid/location/Location;

.field private f:J

.field private g:J


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-wide v0, p0, Lcom/facebook/orca/f/ab;->b:J

    .line 18
    iput-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/f/ab;->a:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .prologue
    .line 49
    iput-wide p1, p0, Lcom/facebook/orca/f/ab;->b:J

    .line 50
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 51
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    .line 53
    :cond_0
    return-void
.end method

.method public a(Landroid/location/Location;J)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/orca/f/ab;->e:Landroid/location/Location;

    .line 84
    iput-wide p2, p0, Lcom/facebook/orca/f/ab;->f:J

    .line 85
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/facebook/orca/f/ab;->d:Z

    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/f/ab;->d:Z

    .line 38
    return-void
.end method

.method public b(J)V
    .locals 2

    .prologue
    .line 60
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->b:J

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 61
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    .line 65
    :goto_0
    return-void

    .line 63
    :cond_0
    iput-wide p1, p0, Lcom/facebook/orca/f/ab;->c:J

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/f/ab;->d:Z

    .line 42
    return-void
.end method

.method public c(J)V
    .locals 0

    .prologue
    .line 92
    iput-wide p1, p0, Lcom/facebook/orca/f/ab;->g:J

    .line 93
    return-void
.end method

.method public d()J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->b:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    return-wide v0
.end method

.method public f()J
    .locals 4

    .prologue
    .line 68
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 69
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->c:J

    .line 71
    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->b:J

    goto :goto_0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 88
    iget-wide v0, p0, Lcom/facebook/orca/f/ab;->g:J

    return-wide v0
.end method
