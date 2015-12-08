.class public Lorg/chromium/net/RemoteAndroidKeyStore;
.super Ljava/lang/Object;
.source "RemoteAndroidKeyStore.java"

# interfaces
.implements Lorg/chromium/net/AndroidKeyStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "AndroidKeyStoreRemoteImpl"


# instance fields
.field private final mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lorg/chromium/net/RemoteAndroidKeyStore;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/net/RemoteAndroidKeyStore;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lorg/chromium/net/IRemoteAndroidKeyStore;)V
    .locals 0
    .param p1, "manager"    # Lorg/chromium/net/IRemoteAndroidKeyStore;

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    .line 43
    return-void
.end method


# virtual methods
.method public createKey(Ljava/lang/String;)Lorg/chromium/net/AndroidPrivateKey;
    .locals 3
    .param p1, "alias"    # Ljava/lang/String;

    .prologue
    .line 128
    :try_start_0
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-interface {v2, p1}, Lorg/chromium/net/IRemoteAndroidKeyStore;->getPrivateKeyHandle(Ljava/lang/String;)I

    move-result v1

    .line 129
    .local v1, "handle":I
    new-instance v2, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    invoke-direct {v2, v1, p0}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;-><init>(ILorg/chromium/net/RemoteAndroidKeyStore;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .end local v1    # "handle":I
    :goto_0
    return-object v2

    .line 130
    :catch_0
    move-exception v0

    .line 131
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 132
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getDSAKeyParamQ(Lorg/chromium/net/AndroidPrivateKey;)[B
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 59
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 61
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "getDSAKeyParamQ"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3}, Lorg/chromium/net/IRemoteAndroidKeyStore;->getDSAKeyParamQ(I)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 65
    :goto_0
    return-object v2

    .line 63
    :catch_0
    move-exception v0

    .line 64
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 65
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getECKeyOrder(Lorg/chromium/net/AndroidPrivateKey;)[B
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 71
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 73
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "getECKeyOrder"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3}, Lorg/chromium/net/IRemoteAndroidKeyStore;->getECKeyOrder(I)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 77
    :goto_0
    return-object v2

    .line 75
    :catch_0
    move-exception v0

    .line 76
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 77
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getOpenSSLEngineForPrivateKey(Lorg/chromium/net/AndroidPrivateKey;)Ljava/lang/Object;
    .locals 1
    .param p1, "privateKey"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 122
    sget-boolean v0, Lorg/chromium/net/RemoteAndroidKeyStore;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 123
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOpenSSLHandleForPrivateKey(Lorg/chromium/net/AndroidPrivateKey;)J
    .locals 2
    .param p1, "privateKey"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 115
    sget-boolean v0, Lorg/chromium/net/RemoteAndroidKeyStore;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 116
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getPrivateKeyEncodedBytes(Lorg/chromium/net/AndroidPrivateKey;)[B
    .locals 1
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 108
    sget-boolean v0, Lorg/chromium/net/RemoteAndroidKeyStore;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 109
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPrivateKeyType(Lorg/chromium/net/AndroidPrivateKey;)I
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 95
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 97
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "getPrivateKeyType"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3}, Lorg/chromium/net/IRemoteAndroidKeyStore;->getPrivateKeyType(I)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 101
    :goto_0
    return v2

    .line 99
    :catch_0
    move-exception v0

    .line 100
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 101
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getRSAKeyModulus(Lorg/chromium/net/AndroidPrivateKey;)[B
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 47
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 49
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "getRSAKeyModulus"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3}, Lorg/chromium/net/IRemoteAndroidKeyStore;->getRSAKeyModulus(I)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 53
    :goto_0
    return-object v2

    .line 51
    :catch_0
    move-exception v0

    .line 52
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 53
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public rawSignDigestWithPrivateKey(Lorg/chromium/net/AndroidPrivateKey;[B)[B
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;
    .param p2, "message"    # [B

    .prologue
    .line 83
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 85
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "rawSignDigestWithPrivateKey"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3, p2}, Lorg/chromium/net/IRemoteAndroidKeyStore;->rawSignDigestWithPrivateKey(I[B)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 89
    :goto_0
    return-object v2

    .line 87
    :catch_0
    move-exception v0

    .line 88
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 89
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public releaseKey(Lorg/chromium/net/AndroidPrivateKey;)V
    .locals 4
    .param p1, "key"    # Lorg/chromium/net/AndroidPrivateKey;

    .prologue
    .line 138
    move-object v1, p1

    check-cast v1, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;

    .line 140
    .local v1, "remoteKey":Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
    :try_start_0
    const-string v2, "AndroidKeyStoreRemoteImpl"

    const-string v3, "releaseKey"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    iget-object v2, p0, Lorg/chromium/net/RemoteAndroidKeyStore;->mRemoteManager:Lorg/chromium/net/IRemoteAndroidKeyStore;

    invoke-virtual {v1}, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->getHandle()I

    move-result v3

    invoke-interface {v2, v3}, Lorg/chromium/net/IRemoteAndroidKeyStore;->releaseKey(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :goto_0
    return-void

    .line 142
    :catch_0
    move-exception v0

    .line 143
    .local v0, "e":Landroid/os/RemoteException;
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method
