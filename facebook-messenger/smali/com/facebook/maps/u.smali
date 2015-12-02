.class Lcom/facebook/maps/u;
.super Lcom/facebook/inject/d;
.source "MapsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/maps/o;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/maps/t;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/maps/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/maps/o;
    .locals 3

    .prologue
    .line 32
    new-instance v1, Lcom/facebook/maps/o;

    const-class v0, Ljava/lang/String;

    const-class v2, Lcom/facebook/maps/annotation/MapApiKeyString;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/maps/u;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/facebook/maps/o;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/maps/u;->a()Lcom/facebook/maps/o;

    move-result-object v0

    return-object v0
.end method
