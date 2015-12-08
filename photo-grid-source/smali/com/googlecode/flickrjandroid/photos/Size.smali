.class public Lcom/googlecode/flickrjandroid/photos/Size;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/googlecode/flickrjandroid/photos/Size;",
        ">;"
    }
.end annotation


# static fields
.field public static final LARGE:I = 0x4

.field public static final LARGE_1600:I = 0xd

.field public static final LARGE_2048:I = 0xe

.field public static final LARGE_SQUARE:I = 0x6

.field public static final MEDIUM:I = 0x3

.field public static final MEDIUM_640:I = 0xb

.field public static final MEDIUM_800:I = 0xc

.field public static final MOBILE_MP4:I = 0x9

.field public static final ORIGINAL:I = 0x5

.field public static final SITE_MP4:I = 0x8

.field public static final SMALL:I = 0x2

.field public static final SMALL_320:I = 0xa

.field public static final SQUARE:I = 0x1

.field public static final THUMB:I = 0x0

.field public static final VIDEO_PLAYER:I = 0x7

.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private height:I

.field private label:I

.field private source:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private width:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/googlecode/flickrjandroid/photos/Size;)I
    .locals 2

    .prologue
    .line 364
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLongestDimension()I

    move-result v0

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/photos/Size;->getLongestDimension()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/photos/Size;->compareTo(Lcom/googlecode/flickrjandroid/photos/Size;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 324
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 359
    :cond_0
    :goto_0
    return v3

    .line 328
    :cond_1
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/Size;

    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    move v2, v3

    .line 331
    :goto_1
    array-length v0, v4

    if-lt v2, v0, :cond_2

    .line 359
    const/4 v3, 0x1

    goto :goto_0

    .line 332
    :cond_2
    sget-object v0, Lcom/googlecode/flickrjandroid/util/StringUtilities;->getterPattern:Ljava/util/regex/Pattern;

    aget-object v1, v4, v2

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 333
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_3

    aget-object v0, v4, v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getClass"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 335
    :try_start_0
    aget-object v0, v4, v2

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 336
    aget-object v1, v4, v2

    const/4 v5, 0x0

    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 337
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    .line 338
    const-string v6, "class"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_4

    .line 339
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    :cond_3
    :goto_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 344
    :cond_4
    const-string v6, "int"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 345
    check-cast v0, Ljava/lang/Integer;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 347
    :cond_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "|"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 348
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 350
    :catch_0
    move-exception v0

    .line 351
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Size equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 354
    :catch_1
    move-exception v0

    .line 355
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Size equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 352
    :catch_2
    move-exception v0

    goto/16 :goto_2
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 283
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->height:I

    return v0
.end method

.method public getLabel()I
    .locals 1

    .prologue
    .line 176
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    return v0
.end method

.method public getLongestDimension()I
    .locals 2

    .prologue
    .line 220
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 221
    const/16 v0, 0x4b

    .line 243
    :goto_0
    return v0

    .line 222
    :cond_0
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    if-nez v0, :cond_1

    .line 223
    const/16 v0, 0x64

    goto :goto_0

    .line 224
    :cond_1
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 225
    const/16 v0, 0x96

    goto :goto_0

    .line 226
    :cond_2
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 227
    const/16 v0, 0xf0

    goto :goto_0

    .line 228
    :cond_3
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 229
    const/16 v0, 0x140

    goto :goto_0

    .line 230
    :cond_4
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 231
    const/16 v0, 0x1f4

    goto :goto_0

    .line 232
    :cond_5
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_6

    .line 233
    const/16 v0, 0x280

    goto :goto_0

    .line 234
    :cond_6
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_7

    .line 235
    const/16 v0, 0x320

    goto :goto_0

    .line 236
    :cond_7
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    .line 237
    const/16 v0, 0x400

    goto :goto_0

    .line 238
    :cond_8
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_9

    .line 239
    const/16 v0, 0x640

    goto :goto_0

    .line 240
    :cond_9
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_a

    .line 241
    const/16 v0, 0x800

    goto :goto_0

    .line 243
    :cond_a
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Size;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->source:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 269
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Size;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 370
    new-instance v0, Ljava/lang/Integer;

    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 371
    new-instance v1, Ljava/lang/Integer;

    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Size;->width:I

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 372
    new-instance v1, Ljava/lang/Integer;

    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Size;->height:I

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 373
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->source:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->source:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 374
    :cond_0
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->url:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 375
    :cond_1
    return v0
.end method

.method public setHeight(I)V
    .locals 0

    .prologue
    .line 287
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->height:I

    .line 288
    return-void
.end method

.method public setHeight(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 291
    if-eqz p1, :cond_0

    .line 292
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setHeight(I)V

    .line 294
    :cond_0
    return-void
.end method

.method public setLabel(I)V
    .locals 0

    .prologue
    .line 265
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->label:I

    .line 266
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 186
    const-string v0, "Square"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    .line 217
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    const-string v0, "Large Square"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 190
    :cond_2
    const-string v0, "Thumbnail"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 192
    :cond_3
    const-string v0, "Small"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 193
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 194
    :cond_4
    const-string v0, "Small 320"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 195
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 196
    :cond_5
    const-string v0, "Medium"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 197
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 198
    :cond_6
    const-string v0, "Medium 640"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 199
    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 200
    :cond_7
    const-string v0, "Medium 800"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 201
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 202
    :cond_8
    const-string v0, "Large"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 203
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 204
    :cond_9
    const-string v0, "Large 1600"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 205
    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto :goto_0

    .line 206
    :cond_a
    const-string v0, "Large 2048"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 35
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto/16 :goto_0

    .line 208
    :cond_b
    const-string v0, "Original"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 209
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto/16 :goto_0

    .line 210
    :cond_c
    const-string v0, "Video Player"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 211
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto/16 :goto_0

    .line 212
    :cond_d
    const-string v0, "Site MP4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 213
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto/16 :goto_0

    .line 214
    :cond_e
    const-string v0, "Mobile MP4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    goto/16 :goto_0
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 306
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->source:Ljava/lang/String;

    .line 307
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 319
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->url:Ljava/lang/String;

    .line 320
    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .prologue
    .line 273
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Size;->width:I

    .line 274
    return-void
.end method

.method public setWidth(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 277
    if-eqz p1, :cond_0

    .line 278
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setWidth(I)V

    .line 280
    :cond_0
    return-void
.end method
