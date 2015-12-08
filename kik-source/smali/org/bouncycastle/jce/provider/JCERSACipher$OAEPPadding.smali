.class public Lorg/bouncycastle/jce/provider/JCERSACipher$OAEPPadding;
.super Lorg/bouncycastle/jce/provider/JCERSACipher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCERSACipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OAEPPadding"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Ljavax/crypto/spec/OAEPParameterSpec;->DEFAULT:Ljavax/crypto/spec/OAEPParameterSpec;

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JCERSACipher;-><init>(Ljavax/crypto/spec/OAEPParameterSpec;)V

    return-void
.end method
