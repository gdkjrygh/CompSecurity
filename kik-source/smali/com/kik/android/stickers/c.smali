.class public final Lcom/kik/android/stickers/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/u;


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Lkik/a/e/f;

.field private final c:Lcom/kik/g/f;

.field private final d:Lcom/kik/g/i;

.field private e:Ljava/util/LinkedHashMap;

.field private f:Lkik/a/j/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-string v0, "StickerManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/android/stickers/c;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkik/a/e/f;)V
    .locals 3

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/android/stickers/c;->c:Lcom/kik/g/f;

    .line 41
    new-instance v0, Lcom/kik/android/stickers/d;

    invoke-direct {v0, p0}, Lcom/kik/android/stickers/d;-><init>(Lcom/kik/android/stickers/c;)V

    iput-object v0, p0, Lcom/kik/android/stickers/c;->d:Lcom/kik/g/i;

    .line 50
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/stickers/c;->e:Ljava/util/LinkedHashMap;

    .line 55
    iput-object p2, p0, Lcom/kik/android/stickers/c;->b:Lkik/a/e/f;

    .line 56
    iget-object v0, p0, Lcom/kik/android/stickers/c;->b:Lkik/a/e/f;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/kik/android/stickers/c;->c:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/android/stickers/c;->b:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/android/stickers/c;->d:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 60
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "stickers"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v1, "stickers"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    invoke-static {v0}, Lkik/android/f/a/ae;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-static {v1}, Lkik/android/f/a/ae;->b(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    :cond_2
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method static synthetic a(Lcom/kik/android/stickers/c;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kik/android/stickers/c;->e:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .prologue
    .line 34
    invoke-static {p0}, Lcom/kik/android/stickers/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/List;)Ljava/util/List;
    .locals 6

    .prologue
    .line 126
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/x;

    .line 128
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/x;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/android/stickers/c;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 130
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lkik/a/d/x;->b()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 133
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/w;

    .line 134
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lkik/a/d/w;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/kik/android/stickers/c;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lkik/a/d/w;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/kik/android/stickers/c;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lkik/a/d/w;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/kik/android/stickers/c;->b(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 135
    :cond_2
    invoke-virtual {v0, v1}, Lkik/a/d/x;->a(Lkik/a/d/w;)V

    goto :goto_1

    .line 138
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    :cond_4
    return-object v2
.end method

.method static synthetic b(Lkik/a/d/x;)V
    .locals 3

    .prologue
    .line 34
    invoke-virtual {p0}, Lkik/a/d/x;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/w;

    invoke-virtual {v0}, Lkik/a/d/w;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/m/k;->a(Ljava/lang/String;)Z

    invoke-virtual {v0}, Lkik/a/d/w;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/k;->a(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 99
    if-eqz p0, :cond_0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Lkik/a/d/x;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 151
    :try_start_0
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 153
    invoke-virtual {p0}, Lkik/a/d/x;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 162
    :goto_0
    return-object v0

    .line 155
    :catch_0
    move-exception v0

    .line 156
    sget-object v1, Lcom/kik/android/stickers/c;->a:Lorg/c/b;

    const-string v2, "Error generating key for stickerPack"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 158
    :catch_1
    move-exception v0

    .line 159
    sget-object v1, Lcom/kik/android/stickers/c;->a:Lorg/c/b;

    const-string v2, "Error generating key for stickerPack"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method static synthetic c()Lorg/c/b;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/kik/android/stickers/c;->a:Lorg/c/b;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    .prologue
    .line 145
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/android/stickers/c;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 244
    invoke-static {p1}, Lcom/kik/m/k;->a(Ljava/lang/String;)Z

    .line 245
    return-void
.end method

.method public final a(Lkik/a/d/x;)V
    .locals 6

    .prologue
    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    if-eqz p1, :cond_0

    .line 108
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_0
    invoke-static {v0}, Lcom/kik/android/stickers/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 114
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/x;

    .line 115
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/kik/android/stickers/c;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lkik/a/d/x;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/kik/android/stickers/c;->f:Lkik/a/j/n;

    const-string v3, "sticker_pack"

    invoke-static {v0}, Lcom/kik/android/stickers/c;->c(Lkik/a/d/x;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lkik/a/d/x;->e()Lcom/kik/n/a/f/c;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    move-result-object v2

    new-instance v3, Lcom/kik/android/stickers/f;

    invoke-direct {v3, p0, v0}, Lcom/kik/android/stickers/f;-><init>(Lcom/kik/android/stickers/c;Lkik/a/d/x;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 117
    :cond_2
    return-void
.end method

.method public final a(Lkik/a/j/n;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/kik/android/stickers/c;->f:Lkik/a/j/n;

    .line 216
    return-void
.end method

.method public final b()Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 167
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 169
    iget-object v1, p0, Lcom/kik/android/stickers/c;->f:Lkik/a/j/n;

    const-string v2, "sticker_pack"

    const-class v3, Lcom/kik/n/a/f/c;

    invoke-interface {v1, v2, v3}, Lkik/a/j/n;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lcom/kik/android/stickers/e;

    invoke-direct {v2, p0, v0}, Lcom/kik/android/stickers/e;-><init>(Lcom/kik/android/stickers/c;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 209
    return-object v0
.end method
