.class public abstract Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;
.super Landroid/os/Binder;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string/jumbo v0, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-virtual {p0, p0, v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;
    .locals 2

    .prologue
    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    .line 33
    :goto_0
    return-object v0

    .line 29
    :cond_0
    const-string/jumbo v0, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-eqz v1, :cond_1

    .line 31
    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    goto :goto_0

    .line 33
    :cond_1
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub$a;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 37
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 41
    sparse-switch p1, :sswitch_data_0

    .line 81
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    .line 45
    :sswitch_0
    const-string/jumbo v1, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :sswitch_1
    const-string/jumbo v1, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;->create()I

    move-result v1

    .line 52
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 53
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 58
    :sswitch_2
    const-string/jumbo v1, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;->destroy()I

    move-result v1

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 66
    :sswitch_3
    const-string/jumbo v1, "com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {p0, v1}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;->scanApk(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;

    move-result-object v1

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    if-eqz v1, :cond_0

    .line 72
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    invoke-virtual {v1, p3, v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 76
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 41
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
