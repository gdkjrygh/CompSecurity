.class Lcom/facebook/device_id/f;
.super Lcom/facebook/inject/d;
.source "DeviceIdModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/device_id/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/device_id/b;


# direct methods
.method private constructor <init>(Lcom/facebook/device_id/b;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/device_id/f;->a:Lcom/facebook/device_id/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/device_id/f;-><init>(Lcom/facebook/device_id/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/device_id/l;
    .locals 3

    .prologue
    .line 44
    new-instance v2, Lcom/facebook/device_id/l;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/device_id/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/device_id/l;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/device_id/f;->a()Lcom/facebook/device_id/l;

    move-result-object v0

    return-object v0
.end method
