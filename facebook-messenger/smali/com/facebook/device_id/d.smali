.class Lcom/facebook/device_id/d;
.super Lcom/facebook/inject/d;
.source "DeviceIdModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/device_id/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/device_id/b;


# direct methods
.method private constructor <init>(Lcom/facebook/device_id/b;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/device_id/d;->a:Lcom/facebook/device_id/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/device_id/d;-><init>(Lcom/facebook/device_id/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/device_id/g;
    .locals 2

    .prologue
    .line 56
    new-instance v1, Lcom/facebook/device_id/g;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v1, v0}, Lcom/facebook/device_id/g;-><init>(Lcom/facebook/common/time/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/facebook/device_id/d;->a()Lcom/facebook/device_id/g;

    move-result-object v0

    return-object v0
.end method
