.class Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;
.super Ljava/lang/Object;
.source "RemoteAndroidKeyStore.java"

# interfaces
.implements Lorg/chromium/net/AndroidPrivateKey;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/net/RemoteAndroidKeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RemotePrivateKey"
.end annotation


# instance fields
.field final mHandle:I

.field final mStore:Lorg/chromium/net/RemoteAndroidKeyStore;


# direct methods
.method constructor <init>(ILorg/chromium/net/RemoteAndroidKeyStore;)V
    .locals 0
    .param p1, "handle"    # I
    .param p2, "store"    # Lorg/chromium/net/RemoteAndroidKeyStore;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->mHandle:I

    .line 26
    iput-object p2, p0, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->mStore:Lorg/chromium/net/RemoteAndroidKeyStore;

    .line 27
    return-void
.end method


# virtual methods
.method public getHandle()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->mHandle:I

    return v0
.end method

.method public getKeyStore()Lorg/chromium/net/AndroidKeyStore;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lorg/chromium/net/RemoteAndroidKeyStore$RemotePrivateKey;->mStore:Lorg/chromium/net/RemoteAndroidKeyStore;

    return-object v0
.end method
