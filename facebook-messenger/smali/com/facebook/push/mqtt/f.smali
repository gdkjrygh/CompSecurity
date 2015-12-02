.class public Lcom/facebook/push/mqtt/f;
.super Ljava/lang/Object;
.source "DeviceForegroundMqttPersistenceRequirement.java"

# interfaces
.implements Lcom/facebook/push/mqtt/as;


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/push/annotations/IsDeviceForegroundEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/push/mqtt/f;->a:Ljavax/inject/a;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/push/mqtt/f;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/push/mqtt/ar;->DEVICE_USE:Lcom/facebook/push/mqtt/ar;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    goto :goto_0
.end method
