.class public interface abstract Lcom/facebook/push/mqtt/j;
.super Ljava/lang/Object;
.source "IMqttPushService.java"

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public abstract a(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract a()Z
.end method

.method public abstract a(J)Z
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;J)Z
.end method

.method public abstract b(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b()Z
.end method

.method public abstract c()Ljava/lang/String;
.end method
