.class public Lezvcard/parameter/MediaTypeParameter;
.super Lezvcard/parameter/VCardParameter;
.source "MediaTypeParameter.java"


# instance fields
.field protected final extension:Ljava/lang/String;

.field protected final mediaType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "mediaType"    # Ljava/lang/String;
    .param p3, "extension"    # Ljava/lang/String;

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 49
    iput-object p2, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    .line 50
    iput-object p3, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 80
    if-ne p0, p1, :cond_1

    .line 97
    :cond_0
    :goto_0
    return v1

    .line 82
    :cond_1
    invoke-super {p0, p1}, Lezvcard/parameter/VCardParameter;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    move v1, v2

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 85
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 86
    check-cast v0, Lezvcard/parameter/MediaTypeParameter;

    .line 87
    .local v0, "other":Lezvcard/parameter/MediaTypeParameter;
    iget-object v3, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 88
    iget-object v3, v0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    if-eqz v3, :cond_5

    move v1, v2

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    iget-object v3, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    move v1, v2

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    iget-object v3, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    if-nez v3, :cond_6

    .line 93
    iget-object v3, v0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    if-eqz v3, :cond_0

    move v1, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    iget-object v3, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v2

    .line 96
    goto :goto_0
.end method

.method public getExtension()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 71
    const/16 v0, 0x1f

    .line 72
    .local v0, "prime":I
    invoke-super {p0}, Lezvcard/parameter/VCardParameter;->hashCode()I

    move-result v1

    .line 73
    .local v1, "result":I
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v3

    :goto_0
    add-int v1, v4, v2

    .line 74
    mul-int/lit8 v2, v1, 0x1f

    iget-object v4, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    if-nez v4, :cond_1

    :goto_1
    add-int v1, v2, v3

    .line 75
    return v1

    .line 73
    :cond_0
    iget-object v2, p0, Lezvcard/parameter/MediaTypeParameter;->extension:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    .line 74
    :cond_1
    iget-object v3, p0, Lezvcard/parameter/MediaTypeParameter;->mediaType:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_1
.end method
