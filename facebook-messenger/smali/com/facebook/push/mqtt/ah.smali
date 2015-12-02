.class public Lcom/facebook/push/mqtt/ah;
.super Ljava/lang/Object;
.source "MqttEndpointCapabilityProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/ck;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/ck;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/push/mqtt/ah;->a:Ljava/util/Set;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 3

    .prologue
    .line 28
    const-class v0, Lcom/facebook/push/mqtt/t;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    .line 29
    iget-object v0, p0, Lcom/facebook/push/mqtt/ah;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ck;

    .line 30
    invoke-interface {v0}, Lcom/facebook/push/mqtt/ck;->a()Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/EnumSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v1}, Lcom/facebook/common/w/a;->a(Ljava/util/Set;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/ah;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
