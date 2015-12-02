.class Lcom/facebook/location/u;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/facebook/location/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/c;
    .locals 1

    .prologue
    .line 88
    new-instance v0, Lcom/facebook/location/c;

    invoke-direct {v0}, Lcom/facebook/location/c;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/facebook/location/u;->a()Lcom/facebook/location/c;

    move-result-object v0

    return-object v0
.end method
