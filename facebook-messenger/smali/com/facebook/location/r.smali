.class public Lcom/facebook/location/r;
.super Ljava/lang/Object;
.source "LocationCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private volatile a:Landroid/location/Location;

.field private final b:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/location/r;->b:Lcom/facebook/common/time/a;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 2

    .prologue
    .line 31
    const-wide/32 v0, 0x493e0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/location/r;->a(J)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Landroid/location/Location;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 35
    iget-object v1, p0, Lcom/facebook/location/r;->a:Landroid/location/Location;

    if-nez v1, :cond_1

    .line 42
    :cond_0
    :goto_0
    return-object v0

    .line 38
    :cond_1
    const-wide/16 v1, -0x1

    cmp-long v1, p1, v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/location/r;->b:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/location/r;->a:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    cmp-long v1, v1, p1

    if-lez v1, :cond_0

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/facebook/location/r;->a:Landroid/location/Location;

    goto :goto_0
.end method

.method public a(Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/location/r;->a:Landroid/location/Location;

    .line 47
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/location/r;->a:Landroid/location/Location;

    .line 51
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/facebook/location/r;->b()V

    .line 56
    return-void
.end method
