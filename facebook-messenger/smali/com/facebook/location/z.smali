.class Lcom/facebook/location/z;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/s;


# direct methods
.method private constructor <init>(Lcom/facebook/location/s;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/location/z;->a:Lcom/facebook/location/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/location/z;-><init>(Lcom/facebook/location/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/aa;
    .locals 4

    .prologue
    .line 77
    new-instance v2, Lcom/facebook/location/aa;

    invoke-virtual {p0}, Lcom/facebook/location/z;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/location/z;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v3, Landroid/location/LocationManager;

    invoke-interface {v1, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    invoke-direct {v2, v0, v1}, Lcom/facebook/location/aa;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/location/z;->a()Lcom/facebook/location/aa;

    move-result-object v0

    return-object v0
.end method
