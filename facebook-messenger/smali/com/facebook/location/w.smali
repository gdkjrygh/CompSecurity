.class Lcom/facebook/location/w;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/s;


# direct methods
.method private constructor <init>(Lcom/facebook/location/s;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/facebook/location/w;->a:Lcom/facebook/location/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/facebook/location/w;-><init>(Lcom/facebook/location/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/h;
    .locals 5

    .prologue
    .line 58
    new-instance v4, Lcom/facebook/location/h;

    invoke-virtual {p0}, Lcom/facebook/location/w;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/location/LocationManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-class v1, Lcom/facebook/location/r;

    invoke-virtual {p0, v1}, Lcom/facebook/location/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/location/r;

    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v3, Lcom/facebook/common/executors/ForLightweightTaskHandlerThread;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/location/w;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/location/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/location/h;-><init>(Landroid/location/LocationManager;Lcom/facebook/location/r;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/location/w;->a()Lcom/facebook/location/h;

    move-result-object v0

    return-object v0
.end method
