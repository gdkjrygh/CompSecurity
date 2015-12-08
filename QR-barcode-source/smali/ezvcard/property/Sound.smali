.class public Lezvcard/property/Sound;
.super Lezvcard/property/BinaryProperty;
.source "Sound.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/property/BinaryProperty",
        "<",
        "Lezvcard/parameter/SoundType;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/File;Lezvcard/parameter/SoundType;)V
    .locals 0
    .param p1, "file"    # Ljava/io/File;
    .param p2, "type"    # Lezvcard/parameter/SoundType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 152
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/io/File;Lezvcard/parameter/MediaTypeParameter;)V

    .line 153
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lezvcard/parameter/SoundType;)V
    .locals 0
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "type"    # Lezvcard/parameter/SoundType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 142
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/io/InputStream;Lezvcard/parameter/MediaTypeParameter;)V

    .line 143
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lezvcard/parameter/SoundType;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "type"    # Lezvcard/parameter/SoundType;

    .prologue
    .line 123
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)V

    .line 124
    return-void
.end method

.method public constructor <init>([BLezvcard/parameter/SoundType;)V
    .locals 0
    .param p1, "data"    # [B
    .param p2, "type"    # Lezvcard/parameter/SoundType;

    .prologue
    .line 132
    invoke-direct {p0, p1, p2}, Lezvcard/property/BinaryProperty;-><init>([BLezvcard/parameter/MediaTypeParameter;)V

    .line 133
    return-void
.end method


# virtual methods
.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    invoke-super {p0}, Lezvcard/property/BinaryProperty;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 162
    invoke-super {p0, p1}, Lezvcard/property/BinaryProperty;->setLanguage(Ljava/lang/String;)V

    .line 163
    return-void
.end method
