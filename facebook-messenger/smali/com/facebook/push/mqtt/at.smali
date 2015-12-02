.class public Lcom/facebook/push/mqtt/at;
.super Ljava/lang/Object;
.source "MqttPersistentServiceFeatureStatusReporter.java"

# interfaces
.implements Lcom/facebook/analytics/d/a;


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/push/mqtt/ar;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/push/mqtt/ar;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/push/mqtt/at;->a:Ljavax/inject/a;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    const-string v0, "persistent_mqtt"

    return-object v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/push/mqtt/at;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    return-object v0
.end method
