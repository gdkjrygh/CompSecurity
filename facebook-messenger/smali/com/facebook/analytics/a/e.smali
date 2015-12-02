.class Lcom/facebook/analytics/a/e;
.super Ljava/lang/Object;
.source "AnalyticsEventSender.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final a:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Lcom/facebook/analytics/cd;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/a/e;->a:Lcom/google/common/d/a/ab;

    .line 286
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/analytics/cd;",
            ">;"
        }
    .end annotation

    .prologue
    .line 281
    iget-object v0, p0, Lcom/facebook/analytics/a/e;->a:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 290
    invoke-static {}, Lcom/facebook/analytics/a/a;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onServiceConnected()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 291
    iget-object v0, p0, Lcom/facebook/analytics/a/e;->a:Lcom/google/common/d/a/ab;

    invoke-static {p2}, Lcom/facebook/analytics/ce;->a(Landroid/os/IBinder;)Lcom/facebook/analytics/cd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 292
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 296
    invoke-static {}, Lcom/facebook/analytics/a/a;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onServiceDisconnected()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 297
    return-void
.end method
