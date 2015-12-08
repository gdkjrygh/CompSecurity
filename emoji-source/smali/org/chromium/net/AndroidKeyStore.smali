.class public interface abstract Lorg/chromium/net/AndroidKeyStore;
.super Ljava/lang/Object;
.source "AndroidKeyStore.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "net::android"
.end annotation


# virtual methods
.method public abstract getDSAKeyParamQ(Lorg/chromium/net/AndroidPrivateKey;)[B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getECKeyOrder(Lorg/chromium/net/AndroidPrivateKey;)[B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getOpenSSLEngineForPrivateKey(Lorg/chromium/net/AndroidPrivateKey;)Ljava/lang/Object;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getOpenSSLHandleForPrivateKey(Lorg/chromium/net/AndroidPrivateKey;)J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getPrivateKeyEncodedBytes(Lorg/chromium/net/AndroidPrivateKey;)[B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getPrivateKeyType(Lorg/chromium/net/AndroidPrivateKey;)I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract getRSAKeyModulus(Lorg/chromium/net/AndroidPrivateKey;)[B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract rawSignDigestWithPrivateKey(Lorg/chromium/net/AndroidPrivateKey;[B)[B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract releaseKey(Lorg/chromium/net/AndroidPrivateKey;)V
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method
