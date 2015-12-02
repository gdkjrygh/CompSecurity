.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;
.super Ljava/lang/Object;
.source "360Security"


# virtual methods
.method public abstract getSysProcessWhiteList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/SysBWRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUserBWList(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;
.end method

.method public abstract init(Landroid/content/Context;)V
.end method
