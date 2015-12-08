.class public abstract Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;
.super Landroid/os/Binder;
.source "IRemoteAndroidKeyStore.java"

# interfaces
.implements Lorg/chromium/net/IRemoteAndroidKeyStore;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/net/IRemoteAndroidKeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/net/IRemoteAndroidKeyStore$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "org.chromium.net.IRemoteAndroidKeyStore"

.field static final TRANSACTION_getClientCertificateAlias:I = 0x1

.field static final TRANSACTION_getDSAKeyParamQ:I = 0x7

.field static final TRANSACTION_getECKeyOrder:I = 0x8

.field static final TRANSACTION_getEncodedCertificateChain:I = 0x2

.field static final TRANSACTION_getPrivateKeyEncodedBytes:I = 0x6

.field static final TRANSACTION_getPrivateKeyHandle:I = 0x3

.field static final TRANSACTION_getPrivateKeyType:I = 0xa

.field static final TRANSACTION_getRSAKeyModulus:I = 0x5

.field static final TRANSACTION_rawSignDigestWithPrivateKey:I = 0x9

.field static final TRANSACTION_releaseKey:I = 0xb

.field static final TRANSACTION_setClientCallbacks:I = 0x4


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p0, p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lorg/chromium/net/IRemoteAndroidKeyStore;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

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
    const-string v1, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 30
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lorg/chromium/net/IRemoteAndroidKeyStore;

    if-eqz v1, :cond_1

    .line 31
    check-cast v0, Lorg/chromium/net/IRemoteAndroidKeyStore;

    goto :goto_0

    .line 33
    :cond_1
    new-instance v0, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub$Proxy;

    .end local v0    # "iin":Landroid/os/IInterface;
    invoke-direct {v0, p0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

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
    .locals 5
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
    const/4 v3, 0x1

    .line 41
    sparse-switch p1, :sswitch_data_0

    .line 157
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v3

    :goto_0
    return v3

    .line 45
    :sswitch_0
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :sswitch_1
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getClientCertificateAlias()Ljava/lang/String;

    move-result-object v2

    .line 52
    .local v2, "_result":Ljava/lang/String;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 53
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 58
    .end local v2    # "_result":Ljava/lang/String;
    :sswitch_2
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 61
    .local v0, "_arg0":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getEncodedCertificateChain(Ljava/lang/String;)[B

    move-result-object v2

    .line 62
    .local v2, "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 63
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    .line 68
    .end local v0    # "_arg0":Ljava/lang/String;
    .end local v2    # "_result":[B
    :sswitch_3
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 71
    .restart local v0    # "_arg0":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getPrivateKeyHandle(Ljava/lang/String;)I

    move-result v2

    .line 72
    .local v2, "_result":I
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 73
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 78
    .end local v0    # "_arg0":Ljava/lang/String;
    .end local v2    # "_result":I
    :sswitch_4
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 80
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v4

    invoke-static {v4}, Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks;

    move-result-object v0

    .line 81
    .local v0, "_arg0":Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks;
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->setClientCallbacks(Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks;)V

    .line 82
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 87
    .end local v0    # "_arg0":Lorg/chromium/net/IRemoteAndroidKeyStoreCallbacks;
    :sswitch_5
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 90
    .local v0, "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getRSAKeyModulus(I)[B

    move-result-object v2

    .line 91
    .local v2, "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    .line 97
    .end local v0    # "_arg0":I
    .end local v2    # "_result":[B
    :sswitch_6
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 100
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getPrivateKeyEncodedBytes(I)[B

    move-result-object v2

    .line 101
    .restart local v2    # "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 102
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    .line 107
    .end local v0    # "_arg0":I
    .end local v2    # "_result":[B
    :sswitch_7
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 110
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getDSAKeyParamQ(I)[B

    move-result-object v2

    .line 111
    .restart local v2    # "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 112
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto/16 :goto_0

    .line 117
    .end local v0    # "_arg0":I
    .end local v2    # "_result":[B
    :sswitch_8
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 120
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getECKeyOrder(I)[B

    move-result-object v2

    .line 121
    .restart local v2    # "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 122
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto/16 :goto_0

    .line 127
    .end local v0    # "_arg0":I
    .end local v2    # "_result":[B
    :sswitch_9
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 131
    .restart local v0    # "_arg0":I
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    .line 132
    .local v1, "_arg1":[B
    invoke-virtual {p0, v0, v1}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->rawSignDigestWithPrivateKey(I[B)[B

    move-result-object v2

    .line 133
    .restart local v2    # "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 134
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto/16 :goto_0

    .line 139
    .end local v0    # "_arg0":I
    .end local v1    # "_arg1":[B
    .end local v2    # "_result":[B
    :sswitch_a
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 141
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 142
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->getPrivateKeyType(I)I

    move-result v2

    .line 143
    .local v2, "_result":I
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 144
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_0

    .line 149
    .end local v0    # "_arg0":I
    .end local v2    # "_result":I
    :sswitch_b
    const-string v4, "org.chromium.net.IRemoteAndroidKeyStore"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 152
    .restart local v0    # "_arg0":I
    invoke-virtual {p0, v0}, Lorg/chromium/net/IRemoteAndroidKeyStore$Stub;->releaseKey(I)V

    .line 153
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 41
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
