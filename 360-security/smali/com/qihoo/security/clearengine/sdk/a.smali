.class public Lcom/qihoo/security/clearengine/sdk/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/qihoo/security/clearengine/sdk/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    .line 321
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a$1;-><init>(Lcom/qihoo/security/clearengine/sdk/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->d:Ljava/util/Comparator;

    .line 19
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 133
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->d:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    :goto_0
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a;->b()V

    .line 142
    return-void

    .line 134
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 221
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 234
    :cond_0
    :goto_0
    return v0

    .line 224
    :cond_1
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "apkVersionName"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 225
    iget-object v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v3, "apkVersionCode"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 226
    iget-object v3, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "apkVersionName"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 227
    iget-object v4, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v5, "apkVersionCode"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 229
    iget-object v5, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iget-object v6, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    if-ne v2, v4, :cond_0

    .line 230
    if-eqz v1, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 231
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 119
    .line 121
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v4, 0xf731400

    cmp-long v1, v2, v4

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    .line 126
    :cond_0
    return v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 147
    if-nez v5, :cond_0

    .line 174
    :goto_0
    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    move v4, v2

    .line 152
    :goto_1
    if-lt v4, v5, :cond_1

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 153
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 154
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 157
    add-int/lit8 v1, v1, -0x1

    move v3, v1

    :goto_2
    if-gez v3, :cond_3

    move v1, v2

    .line 166
    :goto_3
    if-nez v1, :cond_2

    .line 167
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    :cond_2
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    .line 159
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/clearengine/sdk/a;->b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 160
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 161
    const/4 v1, 0x1

    .line 162
    goto :goto_3

    .line 157
    :cond_4
    add-int/lit8 v1, v3, -0x1

    move v3, v1

    goto :goto_2
.end method

.method private b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x2

    .line 85
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 86
    if-nez v2, :cond_1

    .line 110
    :cond_0
    return-void

    .line 90
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 91
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 93
    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v4, 0x5

    if-eq v3, v4, :cond_2

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v4, 0x7

    if-ne v3, v4, :cond_3

    .line 94
    :cond_2
    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-direct {p0, v3}, Lcom/qihoo/security/clearengine/sdk/a;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 96
    iput v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    .line 103
    :cond_3
    :goto_1
    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    if-eq v3, v6, :cond_4

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v4, 0x6

    if-ne v3, v4, :cond_6

    .line 104
    :cond_4
    const/4 v3, 0x1

    iput v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 90
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 98
    :cond_5
    iput v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    goto :goto_1

    .line 106
    :cond_6
    iput v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    goto :goto_2
.end method

.method private b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 243
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 251
    :cond_0
    :goto_0
    return v0

    .line 247
    :cond_1
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iget-object v2, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 248
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 178
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 179
    if-nez v4, :cond_1

    .line 192
    :cond_0
    return-void

    .line 183
    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v4, :cond_0

    move v2, v3

    .line 184
    :goto_1
    if-lt v2, v4, :cond_2

    .line 183
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 185
    :cond_2
    if-eq v3, v2, :cond_3

    .line 186
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/clearengine/sdk/a;->c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    .line 184
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1
.end method

.method private c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 256
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 317
    :cond_0
    :goto_0
    return v3

    .line 260
    :cond_1
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iget-object v1, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "apkVersionName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 264
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "apkVersionCode"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 265
    iget-object v2, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "apkVersionName"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 266
    iget-object v2, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v5, "apkVersionCode"

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 268
    const/4 v2, 0x0

    .line 269
    if-ge v1, v5, :cond_3

    .line 312
    :cond_2
    :goto_1
    if-eqz p1, :cond_0

    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 313
    const/4 v0, 0x3

    iput v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    .line 314
    const/4 v0, 0x2

    iput v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    goto :goto_0

    .line 271
    :cond_3
    if-le v1, v5, :cond_4

    move-object p1, p2

    .line 273
    goto :goto_1

    :cond_4
    if-ne v1, v5, :cond_8

    .line 275
    if-eqz v0, :cond_8

    if-eqz v4, :cond_8

    .line 277
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 282
    :try_start_0
    const-string/jumbo v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 283
    const-string/jumbo v0, "\\."

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 284
    if-eqz v5, :cond_8

    if-eqz v4, :cond_8

    .line 285
    array-length v1, v5

    .line 286
    array-length v0, v4

    .line 288
    if-le v1, v0, :cond_7

    :goto_2
    move v1, v3

    .line 291
    :goto_3
    if-lt v1, v0, :cond_5

    move-object p1, v2

    .line 303
    goto :goto_1

    .line 292
    :cond_5
    aget-object v6, v5, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 293
    aget-object v7, v4, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 294
    if-le v6, v7, :cond_6

    move-object p1, v2

    .line 295
    goto :goto_1

    .line 297
    :cond_6
    if-lt v6, v7, :cond_2

    .line 291
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 303
    :catch_0
    move-exception v0

    move-object p1, v2

    goto :goto_1

    :cond_7
    move v0, v1

    goto :goto_2

    :cond_8
    move-object p1, v2

    goto :goto_1
.end method

.method private d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 196
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    .line 197
    if-nez v4, :cond_1

    .line 213
    :cond_0
    return-void

    .line 201
    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v4, :cond_0

    move v2, v3

    .line 202
    :goto_1
    if-lt v2, v4, :cond_2

    .line 201
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 203
    :cond_2
    if-eq v3, v2, :cond_3

    .line 204
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/clearengine/sdk/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    const/4 v1, 0x1

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    .line 208
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 202
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x2

    .line 30
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/sdk/a;->d(Ljava/util/List;)V

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/sdk/a;->c(Ljava/util/List;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/sdk/a;->b(Ljava/util/List;)V

    .line 60
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a;->a()V

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    return-object v0

    .line 30
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 32
    iget v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v2, v4, :cond_1

    .line 33
    iget v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    if-eq v4, v2, :cond_1

    .line 34
    const/4 v2, 0x6

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    if-ne v2, v3, :cond_2

    .line 35
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/clearengine/sdk/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 37
    :cond_2
    iget v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v3, 0x4

    if-eq v2, v3, :cond_3

    .line 38
    iget v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    .line 40
    :cond_3
    iput v4, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 43
    :cond_4
    iget-object v2, p0, Lcom/qihoo/security/clearengine/sdk/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 62
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 63
    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_1
.end method
