.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;
.super Ljava/lang/Object;
.source "360Security"


# virtual methods
.method public abstract clear()V
.end method

.method public abstract getList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
.end method

.method public abstract remove(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
.end method

.method public abstract save()V
.end method
