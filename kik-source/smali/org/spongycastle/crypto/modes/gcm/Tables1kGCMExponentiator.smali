.class public Lorg/spongycastle/crypto/modes/gcm/Tables1kGCMExponentiator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;


# instance fields
.field a:[[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/16 v0, 0x40

    new-array v0, v0, [[B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    return-void
.end method
