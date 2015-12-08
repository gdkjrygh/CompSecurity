.class public Lezvcard/io/scribe/LogoScribe;
.super Lezvcard/io/scribe/ImagePropertyScribe;
.source "LogoScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/ImagePropertyScribe",
        "<",
        "Lezvcard/property/Logo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 37
    const-class v0, Lezvcard/property/Logo;

    const-string v1, "LOGO"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/ImagePropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 38
    return-void
.end method


# virtual methods
.method protected bridge synthetic _newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/parameter/MediaTypeParameter;

    .prologue
    .line 35
    check-cast p2, Lezvcard/parameter/ImageType;

    .end local p2    # "x1":Lezvcard/parameter/MediaTypeParameter;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/LogoScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/ImageType;)Lezvcard/property/Logo;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .locals 1
    .param p1, "x0"    # [B
    .param p2, "x1"    # Lezvcard/parameter/MediaTypeParameter;

    .prologue
    .line 35
    check-cast p2, Lezvcard/parameter/ImageType;

    .end local p2    # "x1":Lezvcard/parameter/MediaTypeParameter;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/LogoScribe;->_newInstance([BLezvcard/parameter/ImageType;)Lezvcard/property/Logo;

    move-result-object v0

    return-object v0
.end method

.method protected _newInstance(Ljava/lang/String;Lezvcard/parameter/ImageType;)Lezvcard/property/Logo;
    .locals 1
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "contentType"    # Lezvcard/parameter/ImageType;

    .prologue
    .line 42
    new-instance v0, Lezvcard/property/Logo;

    invoke-direct {v0, p1, p2}, Lezvcard/property/Logo;-><init>(Ljava/lang/String;Lezvcard/parameter/ImageType;)V

    return-object v0
.end method

.method protected _newInstance([BLezvcard/parameter/ImageType;)Lezvcard/property/Logo;
    .locals 1
    .param p1, "data"    # [B
    .param p2, "contentType"    # Lezvcard/parameter/ImageType;

    .prologue
    .line 47
    new-instance v0, Lezvcard/property/Logo;

    invoke-direct {v0, p1, p2}, Lezvcard/property/Logo;-><init>([BLezvcard/parameter/ImageType;)V

    return-object v0
.end method
