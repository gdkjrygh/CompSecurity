.class public Lorg/spongycastle/jcajce/provider/symmetric/IDEA$PBEWithSHAAndIDEAKeyGen;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/IDEA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAndIDEAKeyGen"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 68
    const-string v0, "PBEwithSHAandIDEA-CBC"

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBESecretKeyFactory;-><init>(Ljava/lang/String;)V

    .line 69
    return-void
.end method
