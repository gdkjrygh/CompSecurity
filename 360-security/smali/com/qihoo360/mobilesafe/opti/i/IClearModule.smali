.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/IClearModule;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/IModule;


# virtual methods
.method public abstract getInterface(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getSDKVersionName()Ljava/lang/String;
.end method

.method public abstract setOption(Ljava/lang/String;Ljava/lang/String;)V
.end method
