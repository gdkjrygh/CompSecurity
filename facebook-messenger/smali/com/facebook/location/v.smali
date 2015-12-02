.class Lcom/facebook/location/v;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/s;


# direct methods
.method private constructor <init>(Lcom/facebook/location/s;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/location/v;->a:Lcom/facebook/location/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/location/v;-><init>(Lcom/facebook/location/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/d;
    .locals 5

    .prologue
    .line 95
    new-instance v3, Lcom/facebook/location/d;

    const-class v0, Landroid/location/Geocoder;

    invoke-virtual {p0, v0}, Lcom/facebook/location/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Geocoder;

    const-class v1, Lcom/facebook/location/c;

    invoke-virtual {p0, v1}, Lcom/facebook/location/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/location/c;

    const-class v2, Lcom/google/common/d/a/u;

    const-class v4, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/location/v;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/d/a/u;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/location/d;-><init>(Landroid/location/Geocoder;Lcom/facebook/location/c;Lcom/google/common/d/a/u;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/location/v;->a()Lcom/facebook/location/d;

    move-result-object v0

    return-object v0
.end method
