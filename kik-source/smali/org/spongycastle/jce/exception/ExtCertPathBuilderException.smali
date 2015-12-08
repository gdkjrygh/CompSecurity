.class public Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;
.super Ljava/security/cert/CertPathBuilderException;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/exception/ExtException;


# instance fields
.field private a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    .line 15
    iput-object p2, p0, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;->a:Ljava/lang/Throwable;

    .line 16
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
