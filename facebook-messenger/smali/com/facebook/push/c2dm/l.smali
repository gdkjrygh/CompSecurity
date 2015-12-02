.class Lcom/facebook/push/c2dm/l;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/ad;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/push/c2dm/l;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 182
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/l;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/ad;
    .locals 3

    .prologue
    .line 187
    new-instance v2, Lcom/facebook/push/c2dm/ad;

    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    const-class v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {p0, v1}, Lcom/facebook/push/c2dm/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-direct {v2, v0, v1}, Lcom/facebook/push/c2dm/ad;-><init>(Lcom/facebook/push/c2dm/C2DMRegistrar;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/l;->a()Lcom/facebook/push/c2dm/ad;

    move-result-object v0

    return-object v0
.end method
