.class public interface abstract Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;
    }
.end annotation


# virtual methods
.method public abstract create()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract destroy()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract scanApk(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
