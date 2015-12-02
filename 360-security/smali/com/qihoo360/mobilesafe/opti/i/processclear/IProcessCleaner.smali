.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/processclear/IProcessCleaner;
.super Ljava/lang/Object;
.source "360Security"


# virtual methods
.method public abstract cancelClear()V
.end method

.method public abstract cancelScan()V
.end method

.method public abstract clearByPid(Ljava/util/List;ILcom/qihoo360/mobilesafe/opti/i/processclear/ICallbackClear;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/qihoo360/mobilesafe/opti/i/processclear/ICallbackClear;",
            ")V"
        }
    .end annotation
.end method

.method public abstract clearByPkg(Ljava/util/List;ILcom/qihoo360/mobilesafe/opti/i/processclear/ICallbackClear;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/qihoo360/mobilesafe/opti/i/processclear/ICallbackClear;",
            ")V"
        }
    .end annotation
.end method

.method public abstract destroy()V
.end method

.method public abstract getClearableInstalledAppList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract init(Landroid/content/Context;Z)V
.end method

.method public abstract scan(ILcom/qihoo360/mobilesafe/opti/i/processclear/ICallbackScan;)V
.end method

.method public abstract setOption(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract syncScan(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract updateConfigure()V
.end method
