.class Lcom/facebook/push/mqtt/ak;
.super Ljava/lang/Object;
.source "MqttForegroundStateSender.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ai;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ai;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/push/mqtt/ak;->a:Lcom/facebook/push/mqtt/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/push/mqtt/ak;->a:Lcom/facebook/push/mqtt/ai;

    invoke-static {v0, p2}, Lcom/facebook/push/mqtt/ai;->a(Lcom/facebook/push/mqtt/ai;Lcom/facebook/prefs/shared/ae;)V

    .line 97
    return-void
.end method
