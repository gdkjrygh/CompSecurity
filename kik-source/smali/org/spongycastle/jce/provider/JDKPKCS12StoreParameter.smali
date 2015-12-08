.class public Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/KeyStore$LoadStoreParameter;


# instance fields
.field private a:Ljava/io/OutputStream;

.field private b:Ljava/security/KeyStore$ProtectionParameter;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;->a:Ljava/io/OutputStream;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;->c:Z

    return v0
.end method

.method public getProtectionParameter()Ljava/security/KeyStore$ProtectionParameter;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;->b:Ljava/security/KeyStore$ProtectionParameter;

    return-object v0
.end method
