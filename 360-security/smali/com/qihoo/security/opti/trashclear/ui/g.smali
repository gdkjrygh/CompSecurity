.class public Lcom/qihoo/security/opti/trashclear/ui/g;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/dialog/j;
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 259
    new-instance v6, Lcom/qihoo/security/dialog/j;

    invoke-direct {v6, p0}, Lcom/qihoo/security/dialog/j;-><init>(Landroid/content/Context;)V

    .line 260
    const v0, 0x7f0c007c

    invoke-virtual {v6, v0}, Lcom/qihoo/security/dialog/j;->setDialogTitle(I)V

    .line 261
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c007a

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c007b

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v7, v0

    .line 264
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/g$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/opti/trashclear/ui/g$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/lang/String;Lcom/qihoo/security/dialog/j;)V

    invoke-virtual {v6, v7, v8, v0}, Lcom/qihoo/security/dialog/j;->a([Ljava/lang/String;ILandroid/widget/AdapterView$OnItemClickListener;)V

    .line 279
    invoke-virtual {v6}, Lcom/qihoo/security/dialog/j;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 280
    return-object v6
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 5

    .prologue
    .line 405
    .line 406
    const-string/jumbo v0, ""

    .line 407
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 409
    const-string/jumbo v2, "<"

    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 410
    const-string/jumbo v1, "<(.*?)>"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 411
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 412
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 413
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 415
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "<"

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ">"

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    .line 417
    :goto_1
    const v2, 0x7f080018

    invoke-static {p0, v0, v2, v1}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 421
    return-object v0

    :cond_1
    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 94
    const-string/jumbo v1, ""

    .line 95
    if-nez p0, :cond_1

    .line 96
    const-string/jumbo p0, ""

    .line 114
    :cond_0
    :goto_0
    return-object p0

    .line 98
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 99
    array-length v2, v4

    add-int/lit8 v5, p1, 0x5

    if-lt v2, v5, :cond_0

    move v2, v0

    .line 102
    :goto_1
    array-length v5, v4

    if-ge v0, v5, :cond_2

    if-le p1, v2, :cond_2

    .line 104
    aget-char v5, v4, v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    .line 106
    array-length v5, v5

    add-int/2addr v2, v5

    .line 107
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-char v5, v4, v0

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 102
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 109
    :cond_2
    if-eq p1, v2, :cond_3

    add-int/lit8 v0, v2, -0x1

    if-eq p1, v0, :cond_3

    add-int/lit8 v0, v2, 0x1

    if-ne p1, v0, :cond_4

    .line 110
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object p0, v1

    .line 114
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 54
    const-string/jumbo v0, ""

    .line 55
    invoke-static {p1}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getStorageDevice(Landroid/content/Context;)Ljava/util/List;

    move-result-object v3

    .line 56
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 57
    const/4 v0, 0x2

    if-ge v4, v0, :cond_1

    .line 59
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/o;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-static {}, Lcom/qihoo360/common/utils/StorageDeviceUtils;->getSDPathBySDKApi()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    const-string/jumbo v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 74
    :cond_0
    :goto_0
    return-object p0

    .line 67
    :cond_1
    const/4 v0, 0x1

    move v2, v0

    move-object v1, p0

    :goto_1
    if-ge v2, v4, :cond_2

    .line 68
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;

    iget-object v0, v0, Lcom/qihoo360/common/utils/StorageDeviceUtils$StorageDevice;->path:Ljava/lang/String;

    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 70
    const-string/jumbo v5, ""

    invoke-virtual {v1, v0, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 67
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object p0, v1

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 335
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    .line 338
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 368
    :goto_0
    return-object v0

    .line 342
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 344
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_1
    if-ltz v3, :cond_5

    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 348
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 349
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 350
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v0

    .line 363
    :cond_2
    :goto_2
    if-nez v0, :cond_3

    .line 364
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 344
    :cond_3
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_1

    .line 353
    :cond_4
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 358
    :goto_3
    if-eqz v0, :cond_2

    .line 359
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    goto :goto_2

    .line 354
    :catch_0
    move-exception v0

    .line 355
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v2

    goto :goto_3

    :cond_5
    move-object v0, v1

    .line 368
    goto :goto_0
.end method

.method protected static a(Landroid/content/Context;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/lang/String;)V
    .locals 11

    .prologue
    const/16 v10, 0x21

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 173
    const/16 v0, 0x141

    iget v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-eq v0, v2, :cond_0

    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-ne v10, v0, :cond_2

    .line 174
    :cond_0
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "multiPathList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 175
    if-eqz v0, :cond_2

    .line 176
    invoke-static {p0, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 255
    :cond_1
    :goto_0
    return-void

    .line 181
    :cond_2
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 182
    const/4 v0, 0x0

    .line 183
    iget-object v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 184
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    move-object v2, v0

    .line 189
    :goto_1
    if-eqz v2, :cond_1

    .line 192
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 193
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_a

    .line 194
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    .line 195
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 198
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_4

    .line 199
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 203
    invoke-static {p0, v0, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_0

    .line 185
    :cond_3
    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    .line 186
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 187
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    move-object v2, v0

    goto :goto_1

    .line 205
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v5, "/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 206
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v6, "/"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 210
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 211
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v7}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    .line 216
    invoke-virtual {v8}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v9

    .line 217
    if-eqz v0, :cond_d

    .line 218
    array-length v0, v0

    move v2, v0

    .line 220
    :goto_2
    if-eqz v9, :cond_c

    .line 221
    array-length v0, v9

    .line 224
    :goto_3
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_6

    if-lez v2, :cond_6

    move v2, v3

    .line 225
    :goto_4
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_7

    if-lez v0, :cond_7

    move v0, v3

    .line 227
    :goto_5
    iget v7, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-ne v7, v10, :cond_5

    .line 228
    iget-object v7, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v7, :cond_5

    .line 229
    iget-object v7, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v8, "isUninstalledOtherItem"

    invoke-virtual {v7, v8, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 230
    if-eqz v7, :cond_5

    .line 233
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "unintalledRootDirList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 235
    if-eqz v7, :cond_b

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 236
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    .line 237
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 243
    :cond_5
    :goto_6
    if-nez v2, :cond_8

    if-eqz v0, :cond_8

    .line 244
    invoke-static {p0, v6, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto/16 :goto_0

    :cond_6
    move v2, v1

    .line 224
    goto :goto_4

    :cond_7
    move v0, v1

    .line 225
    goto :goto_5

    .line 245
    :cond_8
    if-eqz v2, :cond_9

    if-eqz v0, :cond_9

    .line 246
    invoke-static {p0, v5, v6, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/dialog/j;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Lcom/qihoo/security/dialog/j;->show()V

    goto/16 :goto_0

    .line 249
    :cond_9
    invoke-static {p0, v5, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto/16 :goto_0

    .line 253
    :cond_a
    invoke-static {p0, v2, p2, p1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto/16 :goto_0

    :cond_b
    move v0, v1

    move v2, v1

    goto :goto_6

    :cond_c
    move v0, v1

    goto :goto_3

    :cond_d
    move v2, v1

    goto/16 :goto_2

    :cond_e
    move-object v2, v0

    goto/16 :goto_1
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 8

    .prologue
    .line 285
    iget-object v0, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "multiPathList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 286
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    if-nez p0, :cond_1

    .line 332
    :cond_0
    :goto_0
    return-void

    .line 289
    :cond_1
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 290
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    .line 295
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 296
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 297
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 298
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 299
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 300
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 301
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 306
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 312
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_0

    .line 317
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v6, v0, [Ljava/lang/String;

    .line 318
    invoke-interface {v2, v6}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 320
    new-instance v5, Lcom/qihoo/security/dialog/j;

    invoke-direct {v5, p0}, Lcom/qihoo/security/dialog/j;-><init>(Landroid/content/Context;)V

    .line 321
    const v0, 0x7f0c007c

    invoke-virtual {v5, v0}, Lcom/qihoo/security/dialog/j;->setDialogTitle(I)V

    .line 322
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/g$2;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/g$2;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/dialog/j;)V

    invoke-virtual {v5, v6, v0}, Lcom/qihoo/security/dialog/j;->a([Ljava/lang/String;Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 331
    invoke-virtual {v5}, Lcom/qihoo/security/dialog/j;->show()V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 125
    sput-object p3, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 126
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    const-string/jumbo v0, "current_directory"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    const-string/jumbo v0, "current_directory_name"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 133
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 134
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 136
    const-string/jumbo v1, "current_sdcard_directory"

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    :cond_1
    iget-object v0, p3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v0, :cond_7

    .line 142
    iget-object v0, p3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "unintalledIgnoreDirList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    move-object v4, v0

    .line 144
    :goto_0
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 145
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 146
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    new-array v7, v0, [Ljava/lang/String;

    move v1, v2

    .line 147
    :goto_1
    array-length v0, v7

    if-ge v1, v0, :cond_2

    .line 148
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v7, v1

    .line 147
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 150
    :cond_2
    const-string/jumbo v0, "current_filter_directory"

    invoke-virtual {v6, v0, v7}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 151
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 154
    :cond_3
    iget-object v0, p3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    .line 155
    iget-object v0, p3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "unintalledParentDirList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    move-object v1, v0

    .line 157
    :goto_2
    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 158
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 159
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v4, v0, [Ljava/lang/String;

    .line 160
    :goto_3
    array-length v0, v4

    if-ge v2, v0, :cond_4

    .line 161
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v2

    .line 160
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 163
    :cond_4
    const-string/jumbo v0, "current_prefix_directory"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 164
    invoke-virtual {v5, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 166
    :cond_5
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 167
    return-void

    :cond_6
    move-object v1, v3

    goto :goto_2

    :cond_7
    move-object v4, v3

    goto :goto_0
.end method
