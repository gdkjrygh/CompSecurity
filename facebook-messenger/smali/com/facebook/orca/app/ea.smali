.class Lcom/facebook/orca/app/ea;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/cache/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0}, Lcom/facebook/orca/app/ea;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/cache/c;
    .locals 2

    .prologue
    .line 636
    new-instance v1, Lcom/facebook/ui/images/cache/c;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ea;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/ui/images/cache/c;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 631
    invoke-virtual {p0}, Lcom/facebook/orca/app/ea;->a()Lcom/facebook/ui/images/cache/c;

    move-result-object v0

    return-object v0
.end method
