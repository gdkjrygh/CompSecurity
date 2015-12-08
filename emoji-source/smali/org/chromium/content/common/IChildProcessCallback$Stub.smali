.class public abstract Lorg/chromium/content/common/IChildProcessCallback$Stub;
.super Landroid/os/Binder;
.source "IChildProcessCallback.java"

# interfaces
.implements Lorg/chromium/content/common/IChildProcessCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/common/IChildProcessCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/common/IChildProcessCallback$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "org.chromium.content.common.IChildProcessCallback"

.field static final TRANSACTION_establishSurfacePeer:I = 0x1

.field static final TRANSACTION_getSurfaceTextureSurface:I = 0x3

.field static final TRANSACTION_getViewSurface:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "org.chromium.content.common.IChildProcessCallback"

    invoke-virtual {p0, p0, v0}, Lorg/chromium/content/common/IChildProcessCallback$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lorg/chromium/content/common/IChildProcessCallback;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 30
    :goto_0
    return-object v0

    .line 26
    :cond_0
    const-string v1, "org.chromium.content.common.IChildProcessCallback"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lorg/chromium/content/common/IChildProcessCallback;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lorg/chromium/content/common/IChildProcessCallback;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lorg/chromium/content/common/IChildProcessCallback$Stub$Proxy;

    .end local v0    # "iin":Landroid/os/IInterface;
    invoke-direct {v0, p0}, Lorg/chromium/content/common/IChildProcessCallback$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 8
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v5, 0x1

    .line 38
    sparse-switch p1, :sswitch_data_0

    .line 100
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v5

    :goto_0
    return v5

    .line 42
    :sswitch_0
    const-string v6, "org.chromium.content.common.IChildProcessCallback"

    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :sswitch_1
    const-string v6, "org.chromium.content.common.IChildProcessCallback"

    invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 51
    .local v0, "_arg0":I
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_0

    .line 52
    sget-object v6, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    .line 58
    .local v1, "_arg1":Landroid/view/Surface;
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 60
    .local v2, "_arg2":I
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 61
    .local v3, "_arg3":I
    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/chromium/content/common/IChildProcessCallback$Stub;->establishSurfacePeer(ILandroid/view/Surface;II)V

    .line 62
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 55
    .end local v1    # "_arg1":Landroid/view/Surface;
    .end local v2    # "_arg2":I
    .end local v3    # "_arg3":I
    :cond_0
    const/4 v1, 0x0

    .restart local v1    # "_arg1":Landroid/view/Surface;
    goto :goto_1

    .line 67
    .end local v0    # "_arg0":I
    .end local v1    # "_arg1":Landroid/view/Surface;
    :sswitch_2
    const-string v6, "org.chromium.content.common.IChildProcessCallback"

    invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 70
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/content/common/IChildProcessCallback$Stub;->getViewSurface(I)Lorg/chromium/content/common/SurfaceWrapper;

    move-result-object v4

    .line 71
    .local v4, "_result":Lorg/chromium/content/common/SurfaceWrapper;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 72
    if-eqz v4, :cond_1

    .line 73
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    invoke-virtual {v4, p3, v5}, Lorg/chromium/content/common/SurfaceWrapper;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 83
    .end local v0    # "_arg0":I
    .end local v4    # "_result":Lorg/chromium/content/common/SurfaceWrapper;
    :sswitch_3
    const-string v6, "org.chromium.content.common.IChildProcessCallback"

    invoke-virtual {p2, v6}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 87
    .restart local v0    # "_arg0":I
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 88
    .local v1, "_arg1":I
    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/common/IChildProcessCallback$Stub;->getSurfaceTextureSurface(II)Lorg/chromium/content/common/SurfaceWrapper;

    move-result-object v4

    .line 89
    .restart local v4    # "_result":Lorg/chromium/content/common/SurfaceWrapper;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 90
    if-eqz v4, :cond_2

    .line 91
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    invoke-virtual {v4, p3, v5}, Lorg/chromium/content/common/SurfaceWrapper;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 38
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
