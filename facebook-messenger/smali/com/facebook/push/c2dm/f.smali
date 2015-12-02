.class Lcom/facebook/push/c2dm/f;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/facebook/push/c2dm/f;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 160
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/f;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/m;
    .locals 2

    .prologue
    .line 165
    new-instance v1, Lcom/facebook/push/c2dm/m;

    const-class v0, Lcom/facebook/common/hardware/n;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/n;

    invoke-direct {v1, v0}, Lcom/facebook/push/c2dm/m;-><init>(Lcom/facebook/common/hardware/n;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 160
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/f;->a()Lcom/facebook/push/c2dm/m;

    move-result-object v0

    return-object v0
.end method
