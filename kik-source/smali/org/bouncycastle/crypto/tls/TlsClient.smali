.class public interface abstract Lorg/bouncycastle/crypto/tls/TlsClient;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getAuthentication()Lorg/bouncycastle/crypto/tls/TlsAuthentication;
.end method

.method public abstract getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;
.end method

.method public abstract getCipherSuites()[I
.end method

.method public abstract getClientExtensions()Ljava/util/Hashtable;
.end method

.method public abstract getCompression()Lorg/bouncycastle/crypto/tls/TlsCompression;
.end method

.method public abstract getCompressionMethods()[S
.end method

.method public abstract getKeyExchange()Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
.end method

.method public abstract init(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V
.end method

.method public abstract notifySecureRenegotiation(Z)V
.end method

.method public abstract notifySelectedCipherSuite(I)V
.end method

.method public abstract notifySelectedCompressionMethod(S)V
.end method

.method public abstract notifySessionID([B)V
.end method

.method public abstract processServerExtensions(Ljava/util/Hashtable;)V
.end method
