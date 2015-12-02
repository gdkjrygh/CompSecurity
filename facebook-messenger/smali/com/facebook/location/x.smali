.class Lcom/facebook/location/x;
.super Lcom/facebook/inject/d;
.source "LocationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/location/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/s;


# direct methods
.method private constructor <init>(Lcom/facebook/location/s;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/location/x;->a:Lcom/facebook/location/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0, p1}, Lcom/facebook/location/x;-><init>(Lcom/facebook/location/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/q;
    .locals 2

    .prologue
    .line 107
    new-instance v1, Lcom/facebook/location/q;

    const-class v0, Lcom/facebook/location/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/location/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/aa;

    invoke-direct {v1, v0}, Lcom/facebook/location/q;-><init>(Lcom/facebook/location/aa;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 103
    invoke-virtual {p0}, Lcom/facebook/location/x;->a()Lcom/facebook/location/q;

    move-result-object v0

    return-object v0
.end method
