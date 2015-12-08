.class public final Lcom/roidapp/photogrid/release/rc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:Lcom/roidapp/photogrid/release/rc;


# instance fields
.field protected a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private g:[Ljava/lang/String;

.field private h:[Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->c:Ljava/util/ArrayList;

    .line 28
    new-array v0, v2, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->g:[Ljava/lang/String;

    .line 29
    new-array v0, v2, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->h:[Ljava/lang/String;

    .line 35
    new-instance v0, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    .line 1051
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1052
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/aj;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->g:[Ljava/lang/String;

    .line 39
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rc;->h:[Ljava/lang/String;

    move v1, v2

    .line 40
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 41
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/ak;

    .line 42
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rc;->g:[Ljava/lang/String;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    .line 43
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rc;->h:[Ljava/lang/String;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ak;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v1

    .line 40
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/rc;->b(Landroid/content/Context;)V

    .line 47
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/rc;->f()V

    .line 48
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;
    .locals 2

    .prologue
    .line 57
    const-class v1, Lcom/roidapp/photogrid/release/rc;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Lcom/roidapp/photogrid/release/rc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/rc;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;

    .line 60
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 57
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized b()V
    .locals 3

    .prologue
    .line 160
    const-class v1, Lcom/roidapp/photogrid/release/rc;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;

    if-eqz v0, :cond_0

    .line 161
    sget-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 162
    const-string v0, "typeface utils"

    const-string v2, "destory"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    sget-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 166
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/release/rc;->f:Lcom/roidapp/photogrid/release/rc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit v1

    return-void

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .prologue
    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/roidapp/.Fonts"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 261
    return-object v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 150
    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 151
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 155
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V

    .line 157
    :cond_0
    return-void
.end method

.method private g()V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 175
    invoke-static {}, Lcom/roidapp/photogrid/release/rc;->e()Ljava/lang/String;

    move-result-object v4

    .line 176
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 180
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    .line 181
    new-array v0, v2, [Ljava/io/File;

    .line 189
    :goto_0
    array-length v1, v0

    new-array v5, v1, [Ljava/lang/String;

    move v1, v2

    .line 190
    :goto_1
    array-length v3, v0

    if-ge v1, v3, :cond_4

    move v3, v2

    .line 192
    :goto_2
    array-length v6, v0

    add-int/lit8 v6, v6, -0x1

    sub-int/2addr v6, v1

    if-ge v3, v6, :cond_3

    .line 193
    aget-object v6, v0, v3

    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    add-int/lit8 v8, v3, 0x1

    aget-object v8, v0, v8

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_0

    .line 195
    aget-object v6, v0, v3

    .line 196
    add-int/lit8 v7, v3, 0x1

    aget-object v7, v0, v7

    aput-object v7, v0, v3

    .line 197
    add-int/lit8 v7, v3, 0x1

    aput-object v6, v0, v7

    .line 192
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 183
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 186
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 190
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    move v1, v2

    .line 203
    :goto_3
    array-length v3, v0

    if-ge v1, v3, :cond_5

    .line 204
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v1

    .line 203
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    move v0, v2

    .line 206
    :goto_4
    array-length v1, v5

    if-ge v0, v1, :cond_b

    .line 207
    aget-object v1, v5, v0

    const-string v3, ".ttf"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 208
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "/"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v6, v5, v0

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    aget-object v1, v5, v0

    aget-object v3, v5, v0

    const-string v6, ".ttf"

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    const-string v1, "chinese"

    invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_6

    const-string v1, "japanese"

    invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_6

    const-string v1, "korean"

    invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_6

    const-string v1, "arabic"

    invoke-virtual {v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_9

    :cond_6
    move v1, v2

    .line 216
    :goto_5
    iget-object v6, p0, Lcom/roidapp/photogrid/release/rc;->g:[Ljava/lang/String;

    array-length v6, v6

    if-ge v1, v6, :cond_7

    .line 217
    iget-object v6, p0, Lcom/roidapp/photogrid/release/rc;->g:[Ljava/lang/String;

    aget-object v6, v6, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 218
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/rc;->h:[Ljava/lang/String;

    aget-object v1, v6, v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_7
    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 216
    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 223
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 226
    :cond_a
    aget-object v1, v5, v0

    const-string v3, ".otf"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 228
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "/"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v6, v5, v0

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    aget-object v3, v5, v0

    aget-object v6, v5, v0

    const-string v7, ".otf"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->c:Ljava/util/ArrayList;

    aget-object v3, v5, v0

    aget-object v6, v5, v0

    const-string v7, ".otf"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 234
    :cond_b
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Landroid/graphics/Typeface;
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 73
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 91
    :cond_0
    :goto_0
    return-object v0

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 80
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move v1, v2

    .line 86
    :goto_1
    if-nez v1, :cond_0

    .line 87
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 82
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/RuntimeException;->printStackTrace()V

    .line 83
    const/4 v1, 0x1

    .line 84
    goto :goto_1
.end method

.method public final a()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/rc;->f()V

    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 99
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 143
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 104
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 105
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    sget-object v3, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    sget-object v3, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    sget-object v3, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/ahundredmiles.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Blunt.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Binz.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/desyrel.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/FreeUniversal-Bold.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/gtw.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/HandTest.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Impact.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Jester.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Junction 02.otf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Laine.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/NotCourierSans.otf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/OSP-DIN.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/otfpoc.otf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Polsku.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/PressStart2P.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Quicksand-Regular.otf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Roboto-Thin.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/RomanAntique.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/SerreriaSobria.otf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Strato-linked.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/Thonburi.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const-string v3, "fonts/waltographUI.ttf"

    invoke-static {v1, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/rc;->g()V

    move v1, v0

    .line 134
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 135
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rc;->e:Ljava/util/ArrayList;

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 139
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 240
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/rc;->g()V

    .line 241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 248
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/rc;->g()V

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rc;->b:Ljava/util/ArrayList;

    return-object v0
.end method
