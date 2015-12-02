.class public Landroid_src/mms/a/b/n;
.super Landroid_src/mms/a/b/g;
.source "SmilRegionElementImpl.java"

# interfaces
.implements Lorg/a/a/b/l;


# direct methods
.method constructor <init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method private a(Ljava/lang/String;Z)I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 254
    const-string v0, "px"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    const-string v0, "px"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 266
    :goto_0
    return v0

    .line 257
    :cond_0
    const-string v0, "%"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 258
    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    int-to-double v2, v2

    mul-double v1, v0, v2

    .line 259
    if-eqz p2, :cond_1

    .line 260
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->e()I

    move-result v0

    int-to-double v3, v0

    mul-double v0, v1, v3

    .line 264
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    .line 262
    :cond_1
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->d()I

    move-result v0

    int-to-double v3, v0

    mul-double v0, v1, v3

    goto :goto_1

    .line 266
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 241
    const-string v0, "id"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 224
    const-string v0, "height"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "px"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/a/b/n;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    return-void
.end method

.method public b()I
    .locals 4

    .prologue
    .line 78
    :try_start_0
    const-string v0, "left"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 94
    :goto_0
    return v0

    .line 79
    :catch_0
    move-exception v0

    .line 85
    :try_start_1
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->e()I

    move-result v0

    .line 86
    const-string v1, "right"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I

    move-result v1

    .line 87
    const-string v2, "width"

    invoke-virtual {p0, v2}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {p0, v2, v3}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    .line 88
    sub-int/2addr v0, v1

    sub-int/2addr v0, v2

    goto :goto_0

    .line 89
    :catch_1
    move-exception v0

    .line 94
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)V
    .locals 3

    .prologue
    .line 232
    const-string v0, "width"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "px"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/a/b/n;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    return-void
.end method

.method public c()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 99
    :try_start_0
    const-string v0, "top"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 115
    :goto_0
    return v0

    .line 100
    :catch_0
    move-exception v0

    .line 106
    :try_start_1
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->d()I

    move-result v0

    .line 107
    const-string v2, "bottom"

    invoke-virtual {p0, v2}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I

    move-result v2

    .line 108
    const-string v3, "height"

    invoke-virtual {p0, v3}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {p0, v3, v4}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v1

    .line 109
    sub-int/2addr v0, v2

    sub-int/2addr v0, v1

    goto :goto_0

    .line 110
    :catch_1
    move-exception v0

    move v0, v1

    .line 115
    goto :goto_0
.end method

.method public d()I
    .locals 3

    .prologue
    .line 159
    :try_start_0
    const-string v0, "height"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I

    move-result v0

    .line 160
    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->d()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 183
    :cond_0
    :goto_0
    return v0

    .line 163
    :catch_0
    move-exception v0

    .line 168
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->d()I

    move-result v0

    .line 170
    :try_start_1
    const-string v1, "top"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    move-result v1

    sub-int/2addr v0, v1

    .line 177
    :goto_1
    :try_start_2
    const-string v1, "bottom"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    .line 178
    :catch_1
    move-exception v1

    goto :goto_0

    .line 171
    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method public e()I
    .locals 3

    .prologue
    .line 192
    :try_start_0
    const-string v0, "width"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I

    move-result v0

    .line 193
    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->e()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 216
    :cond_0
    :goto_0
    return v0

    .line 196
    :catch_0
    move-exception v0

    .line 201
    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/f;

    invoke-interface {v0}, Lorg/a/a/b/f;->d()Lorg/a/a/b/h;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/h;->b()Lorg/a/a/b/n;

    move-result-object v0

    invoke-interface {v0}, Lorg/a/a/b/n;->e()I

    move-result v0

    .line 203
    :try_start_1
    const-string v1, "left"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    move-result v1

    sub-int/2addr v0, v1

    .line 210
    :goto_1
    :try_start_2
    const-string v1, "right"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/n;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Landroid_src/mms/a/b/n;->a(Ljava/lang/String;Z)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    .line 211
    :catch_1
    move-exception v1

    goto :goto_0

    .line 204
    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", left="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid_src/mms/a/b/n;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
