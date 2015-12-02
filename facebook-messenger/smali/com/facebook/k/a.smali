.class public Lcom/facebook/k/a;
.super Ljava/lang/Object;
.source "NetworkActivityBroadcastManager.java"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private b:J

.field private final c:Lcom/facebook/base/broadcast/j;

.field private final d:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/k/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_NETWORK_ACTIVITY"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/k/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/base/broadcast/j;Lcom/facebook/common/time/a;)V
    .locals 0
    .param p1    # Lcom/facebook/base/broadcast/j;
        .annotation runtime Lcom/facebook/base/broadcast/CrossFbAppBroadcast;
        .end annotation
    .end param

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/k/a;->c:Lcom/facebook/base/broadcast/j;

    .line 43
    iput-object p2, p0, Lcom/facebook/k/a;->d:Lcom/facebook/common/time/a;

    .line 44
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/k/a;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 56
    iget-wide v2, p0, Lcom/facebook/k/a;->b:J

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    cmp-long v2, v2, v0

    if-gtz v2, :cond_0

    .line 57
    iput-wide v0, p0, Lcom/facebook/k/a;->b:J

    .line 58
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/facebook/k/a;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/facebook/k/a;->c:Lcom/facebook/base/broadcast/j;

    invoke-interface {v1, v0}, Lcom/facebook/base/broadcast/j;->a(Landroid/content/Intent;)V

    .line 61
    :cond_0
    return-void
.end method
