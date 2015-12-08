.class public Lezvcard/property/Logo;
.super Lezvcard/property/ImageProperty;
.source "Logo.java"


# direct methods
.method public constructor <init>(Ljava/io/File;Lezvcard/parameter/ImageType;)V
    .locals 0
    .param p1, "file"    # Ljava/io/File;
    .param p2, "type"    # Lezvcard/parameter/ImageType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 152
    invoke-direct {p0, p1, p2}, Lezvcard/property/ImageProperty;-><init>(Ljava/io/File;Lezvcard/parameter/ImageType;)V

    .line 153
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lezvcard/parameter/ImageType;)V
    .locals 0
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "type"    # Lezvcard/parameter/ImageType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 142
    invoke-direct {p0, p1, p2}, Lezvcard/property/ImageProperty;-><init>(Ljava/io/InputStream;Lezvcard/parameter/ImageType;)V

    .line 143
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lezvcard/parameter/ImageType;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "type"    # Lezvcard/parameter/ImageType;

    .prologue
    .line 123
    invoke-direct {p0, p1, p2}, Lezvcard/property/ImageProperty;-><init>(Ljava/lang/String;Lezvcard/parameter/ImageType;)V

    .line 124
    return-void
.end method

.method public constructor <init>([BLezvcard/parameter/ImageType;)V
    .locals 0
    .param p1, "data"    # [B
    .param p2, "type"    # Lezvcard/parameter/ImageType;

    .prologue
    .line 132
    invoke-direct {p0, p1, p2}, Lezvcard/property/ImageProperty;-><init>([BLezvcard/parameter/ImageType;)V

    .line 133
    return-void
.end method


# virtual methods
.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    invoke-super {p0}, Lezvcard/property/ImageProperty;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 162
    invoke-super {p0, p1}, Lezvcard/property/ImageProperty;->setLanguage(Ljava/lang/String;)V

    .line 163
    return-void
.end method
