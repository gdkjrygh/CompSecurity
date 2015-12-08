.class public Lezvcard/property/Key;
.super Lezvcard/property/BinaryProperty;
.source "Key.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/property/BinaryProperty",
        "<",
        "Lezvcard/parameter/KeyType;",
        ">;"
    }
.end annotation


# instance fields
.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 132
    invoke-direct {p0}, Lezvcard/property/BinaryProperty;-><init>()V

    .line 133
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lezvcard/parameter/KeyType;)V
    .locals 0
    .param p1, "file"    # Ljava/io/File;
    .param p2, "type"    # Lezvcard/parameter/KeyType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 170
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/io/File;Lezvcard/parameter/MediaTypeParameter;)V

    .line 171
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lezvcard/parameter/KeyType;)V
    .locals 0
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "type"    # Lezvcard/parameter/KeyType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 160
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/io/InputStream;Lezvcard/parameter/MediaTypeParameter;)V

    .line 161
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lezvcard/parameter/KeyType;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "type"    # Lezvcard/parameter/KeyType;

    .prologue
    .line 150
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)V

    .line 151
    return-void
.end method

.method public constructor <init>([BLezvcard/parameter/KeyType;)V
    .locals 0
    .param p1, "data"    # [B
    .param p2, "type"    # Lezvcard/parameter/KeyType;

    .prologue
    .line 141
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>([BLezvcard/parameter/MediaTypeParameter;)V

    .line 142
    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 2
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
    .line 195
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/Key;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/Key;->data:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/Key;->text:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 196
    const-string v0, "Property has no value attached to it."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    :cond_0
    iget-object v0, p0, Lezvcard/property/Key;->url:Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p2, v0, :cond_1

    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_2

    .line 200
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "URL values are not permitted in version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_2
    return-void
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lezvcard/property/Key;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setText(Ljava/lang/String;Lezvcard/parameter/KeyType;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "type"    # Lezvcard/parameter/KeyType;

    .prologue
    const/4 v0, 0x0

    .line 179
    iput-object p1, p0, Lezvcard/property/Key;->text:Ljava/lang/String;

    .line 180
    iput-object v0, p0, Lezvcard/property/Key;->data:[B

    .line 181
    iput-object v0, p0, Lezvcard/property/Key;->url:Ljava/lang/String;

    .line 182
    invoke-virtual {p0, p2}, Lezvcard/property/Key;->setContentType(Lezvcard/parameter/MediaTypeParameter;)V

    .line 183
    return-void
.end method
