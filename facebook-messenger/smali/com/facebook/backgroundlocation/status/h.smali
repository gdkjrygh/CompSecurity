.class Lcom/facebook/backgroundlocation/status/h;
.super Lcom/facebook/inject/d;
.source "BackgroundLocationStatusModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/backgroundlocation/status/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/backgroundlocation/status/e;


# direct methods
.method private constructor <init>(Lcom/facebook/backgroundlocation/status/e;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/backgroundlocation/status/h;->a:Lcom/facebook/backgroundlocation/status/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/backgroundlocation/status/e;Lcom/facebook/backgroundlocation/status/f;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/facebook/backgroundlocation/status/h;-><init>(Lcom/facebook/backgroundlocation/status/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/backgroundlocation/status/d;
    .locals 6

    .prologue
    .line 48
    new-instance v3, Lcom/facebook/backgroundlocation/status/d;

    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/backgroundlocation/status/IsBackgroundLocationEnabled;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/backgroundlocation/status/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/facebook/nux/status/j;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/j;

    const-class v1, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v1}, Lcom/facebook/backgroundlocation/status/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/ops/k;

    const-class v2, Lcom/facebook/base/broadcast/j;

    const-class v5, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-virtual {p0, v2, v5}, Lcom/facebook/backgroundlocation/status/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/base/broadcast/j;

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/facebook/backgroundlocation/status/d;-><init>(Ljavax/inject/a;Lcom/facebook/nux/status/j;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/broadcast/j;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/backgroundlocation/status/h;->a()Lcom/facebook/backgroundlocation/status/d;

    move-result-object v0

    return-object v0
.end method
