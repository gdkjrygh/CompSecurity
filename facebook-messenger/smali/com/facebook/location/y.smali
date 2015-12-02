.class Lcom/facebook/location/y;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/s;


# direct methods
.method private constructor <init>(Lcom/facebook/location/s;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/location/y;->a:Lcom/facebook/location/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0, p1}, Lcom/facebook/location/y;-><init>(Lcom/facebook/location/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/r;
    .locals 2

    .prologue
    .line 70
    new-instance v1, Lcom/facebook/location/r;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/location/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v1, v0}, Lcom/facebook/location/r;-><init>(Lcom/facebook/common/time/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/location/y;->a()Lcom/facebook/location/r;

    move-result-object v0

    return-object v0
.end method
