.class final Lorg/bouncycastle/crypto/encodings/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field final synthetic a:Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/encodings/a;->a:Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 1

    const-string v0, "org.bouncycastle.pkcs1.strict"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
