.class Lcom/facebook/maps/v;
.super Lcom/facebook/inject/d;
.source "MapsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/maps/r;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/maps/t;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/maps/v;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/maps/r;
    .locals 2

    .prologue
    .line 41
    new-instance v1, Lcom/facebook/maps/r;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    invoke-direct {v1, v0}, Lcom/facebook/maps/r;-><init>(Landroid/content/res/Resources;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/maps/v;->a()Lcom/facebook/maps/r;

    move-result-object v0

    return-object v0
.end method
