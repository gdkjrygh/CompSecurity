.class public abstract Lezvcard/property/BinaryProperty;
.super Lezvcard/property/VCardProperty;
.source "BinaryProperty.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/parameter/MediaTypeParameter;",
        ">",
        "Lezvcard/property/VCardProperty;",
        "Lezvcard/property/HasAltId;"
    }
.end annotation


# instance fields
.field protected contentType:Lezvcard/parameter/MediaTypeParameter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected data:[B

.field protected url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 66
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lezvcard/parameter/MediaTypeParameter;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 105
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/io/InputStream;Lezvcard/parameter/MediaTypeParameter;)V

    .line 106
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lezvcard/parameter/MediaTypeParameter;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 95
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lezvcard/util/IOUtils;->toByteArray(Ljava/io/InputStream;Z)[B

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lezvcard/property/BinaryProperty;-><init>([BLezvcard/parameter/MediaTypeParameter;)V

    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 75
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 76
    invoke-virtual {p0, p1, p2}, Lezvcard/property/BinaryProperty;->setUrl(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)V

    .line 77
    return-void
.end method

.method public constructor <init>([BLezvcard/parameter/MediaTypeParameter;)V
    .locals 0
    .param p1, "data"    # [B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BTT;)V"
        }
    .end annotation

    .prologue
    .line 84
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 85
    invoke-virtual {p0, p1, p2}, Lezvcard/property/BinaryProperty;->setData([BLezvcard/parameter/MediaTypeParameter;)V

    .line 86
    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 225
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/BinaryProperty;->data:[B

    if-nez v0, :cond_0

    .line 226
    const-string v0, "Property has neither a URL nor binary data attached to it."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_0
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 195
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 196
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 215
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentType()Lezvcard/parameter/MediaTypeParameter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 151
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->contentType:Lezvcard/parameter/MediaTypeParameter;

    return-object v0
.end method

.method public getData()[B
    .locals 1

    .prologue
    .line 113
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->data:[B

    return-object v0
.end method

.method public getPids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 190
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 205
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 172
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 132
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->url:Ljava/lang/String;

    return-object v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 200
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 201
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 220
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 221
    return-void
.end method

.method public setContentType(Lezvcard/parameter/MediaTypeParameter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 159
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p1, "contentType":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    iput-object p1, p0, Lezvcard/property/BinaryProperty;->contentType:Lezvcard/parameter/MediaTypeParameter;

    .line 160
    return-void
.end method

.method public setData([BLezvcard/parameter/MediaTypeParameter;)V
    .locals 1
    .param p1, "data"    # [B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BTT;)V"
        }
    .end annotation

    .prologue
    .line 122
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/BinaryProperty;->url:Ljava/lang/String;

    .line 123
    iput-object p1, p0, Lezvcard/property/BinaryProperty;->data:[B

    .line 124
    invoke-virtual {p0, p2}, Lezvcard/property/BinaryProperty;->setContentType(Lezvcard/parameter/MediaTypeParameter;)V

    .line 125
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 210
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 211
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 185
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/BinaryProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 186
    return-void
.end method

.method public setUrl(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 141
    .local p0, "this":Lezvcard/property/BinaryProperty;, "Lezvcard/property/BinaryProperty<TT;>;"
    .local p2, "type":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    iput-object p1, p0, Lezvcard/property/BinaryProperty;->url:Ljava/lang/String;

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/BinaryProperty;->data:[B

    .line 143
    invoke-virtual {p0, p2}, Lezvcard/property/BinaryProperty;->setContentType(Lezvcard/parameter/MediaTypeParameter;)V

    .line 144
    return-void
.end method
