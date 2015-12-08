.class public Lezvcard/io/scribe/KeyScribe;
.super Lezvcard/io/scribe/BinaryPropertyScribe;
.source "KeyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/BinaryPropertyScribe",
        "<",
        "Lezvcard/property/Key;",
        "Lezvcard/parameter/KeyType;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 37
    const-class v0, Lezvcard/property/Key;

    const-string v1, "KEY"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/BinaryPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 38
    return-void
.end method


# virtual methods
.method protected _buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/KeyType;
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-static {v0, p1, v0}, Lezvcard/parameter/KeyType;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lezvcard/parameter/KeyType;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/KeyScribe;->_buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/KeyType;

    move-result-object v0

    return-object v0
.end method

.method protected _buildTypeObj(Ljava/lang/String;)Lezvcard/parameter/KeyType;
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-static {p1, v0, v0}, Lezvcard/parameter/KeyType;->get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lezvcard/parameter/KeyType;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _buildTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/KeyScribe;->_buildTypeObj(Ljava/lang/String;)Lezvcard/parameter/KeyType;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/parameter/MediaTypeParameter;

    .prologue
    .line 35
    check-cast p2, Lezvcard/parameter/KeyType;

    .end local p2    # "x1":Lezvcard/parameter/MediaTypeParameter;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/KeyScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/KeyType;)Lezvcard/property/Key;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .locals 1
    .param p1, "x0"    # [B
    .param p2, "x1"    # Lezvcard/parameter/MediaTypeParameter;

    .prologue
    .line 35
    check-cast p2, Lezvcard/parameter/KeyType;

    .end local p2    # "x1":Lezvcard/parameter/MediaTypeParameter;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/KeyScribe;->_newInstance([BLezvcard/parameter/KeyType;)Lezvcard/property/Key;

    move-result-object v0

    return-object v0
.end method

.method protected _newInstance(Ljava/lang/String;Lezvcard/parameter/KeyType;)Lezvcard/property/Key;
    .locals 1
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "contentType"    # Lezvcard/parameter/KeyType;

    .prologue
    .line 52
    new-instance v0, Lezvcard/property/Key;

    invoke-direct {v0, p1, p2}, Lezvcard/property/Key;-><init>(Ljava/lang/String;Lezvcard/parameter/KeyType;)V

    return-object v0
.end method

.method protected _newInstance([BLezvcard/parameter/KeyType;)Lezvcard/property/Key;
    .locals 1
    .param p1, "data"    # [B
    .param p2, "contentType"    # Lezvcard/parameter/KeyType;

    .prologue
    .line 57
    new-instance v0, Lezvcard/property/Key;

    invoke-direct {v0, p1, p2}, Lezvcard/property/Key;-><init>([BLezvcard/parameter/KeyType;)V

    return-object v0
.end method
