.class public Lcom/facebook/push/mqtt/an;
.super Ljava/lang/Object;
.source "MqttKickFbPushDataHandler.java"

# interfaces
.implements Lcom/facebook/push/fbpushdata/a;


# instance fields
.field private final a:Landroid/support/v4/a/e;


# direct methods
.method public constructor <init>(Landroid/support/v4/a/e;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/push/mqtt/an;->a:Landroid/support/v4/a/e;

    .line 23
    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/push/g;)V
    .locals 2

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/push/g;->C2DM:Lcom/facebook/push/g;

    invoke-virtual {v0, p2}, Lcom/facebook/push/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 31
    sget-object v1, Lcom/facebook/push/mqtt/ca;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    iget-object v1, p0, Lcom/facebook/push/mqtt/an;->a:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 34
    :cond_0
    return-void
.end method
