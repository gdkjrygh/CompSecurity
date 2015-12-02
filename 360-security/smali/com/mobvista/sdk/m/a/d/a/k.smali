.class public Lcom/mobvista/sdk/m/a/d/a/k;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static b:Lcom/mobvista/sdk/m/a/d/a/k;

.field private static c:Lcom/mobvista/sdk/m/a/d/a/a;

.field private static d:Ljava/util/concurrent/locks/Lock;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/k;->a:Landroid/content/Context;

    .line 32
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;
    .locals 2

    .prologue
    .line 35
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->b:Lcom/mobvista/sdk/m/a/d/a/k;

    if-nez v0, :cond_1

    .line 36
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->d:Ljava/util/concurrent/locks/Lock;

    .line 38
    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 39
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->b:Lcom/mobvista/sdk/m/a/d/a/k;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/k;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mobvista/sdk/m/a/d/a/k;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->b:Lcom/mobvista/sdk/m/a/d/a/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 48
    :cond_1
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    if-nez v0, :cond_2

    .line 49
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/c;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/a/d/a/c;-><init>()V

    .line 50
    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/d/a/c;->a(F)V

    .line 53
    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/a;->a(Lcom/mobvista/sdk/m/a/d/a/c;)Lcom/mobvista/sdk/m/a/d/a/a;

    move-result-object v0

    sput-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    .line 56
    :cond_2
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->b:Lcom/mobvista/sdk/m/a/d/a/k;

    return-object v0

    .line 44
    :catchall_0
    move-exception v0

    sget-object v1, Lcom/mobvista/sdk/m/a/d/a/k;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public static a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 60
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    if-eqz v0, :cond_0

    .line 61
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/d/a/a;->a()V

    .line 63
    :cond_0
    sput-object v1, Lcom/mobvista/sdk/m/a/d/a/k;->d:Ljava/util/concurrent/locks/Lock;

    .line 64
    sput-object v1, Lcom/mobvista/sdk/m/a/d/a/k;->b:Lcom/mobvista/sdk/m/a/d/a/k;

    .line 65
    sput-object v1, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    .line 66
    return-void
.end method

.method private static a(Ljava/io/InputStream;)V
    .locals 3

    .prologue
    .line 183
    if-eqz p0, :cond_0

    .line 184
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    :cond_0
    :goto_0
    return-void

    .line 187
    :catch_0
    move-exception v0

    .line 188
    const-string/jumbo v1, "LoadResource"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 99
    .line 107
    if-eqz p0, :cond_0

    :try_start_0
    const-string/jumbo v1, ""

    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 117
    :cond_0
    :goto_0
    return-object v0

    .line 111
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "/com/mobvista/sdk/m/res/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 112
    const-class v2, Lcom/mobvista/sdk/m/a/d/a/k;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 113
    :catch_0
    move-exception v1

    .line 114
    const-string/jumbo v2, "LoadResource"

    const-string/jumbo v3, "IOException"

    invoke-static {v2, v3, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 226
    .line 227
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    if-eqz v0, :cond_2

    .line 228
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/a/d/a/a;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 229
    if-eqz v1, :cond_0

    .line 231
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 271
    :goto_0
    return-object v0

    .line 236
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/d/a/k;->b(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 238
    if-eqz v2, :cond_5

    .line 239
    const-string/jumbo v0, ".9"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/k;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 247
    :goto_1
    :try_start_1
    invoke-static {v2}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 251
    :goto_2
    sget-object v1, Lcom/mobvista/sdk/m/a/d/a/k;->c:Lcom/mobvista/sdk/m/a/d/a/a;

    invoke-virtual {v1, p1, v0}, Lcom/mobvista/sdk/m/a/d/a/a;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 243
    :cond_1
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v2, v0}, Landroid/graphics/drawable/BitmapDrawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_1

    .line 248
    :catch_0
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    .line 249
    :goto_3
    const-string/jumbo v2, "LoadResource"

    const-string/jumbo v3, "Exception"

    invoke-static {v2, v3, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 256
    :cond_2
    :try_start_3
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/d/a/k;->b(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 258
    if-eqz v2, :cond_4

    .line 259
    const-string/jumbo v0, ".9"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 260
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/k;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v0

    .line 267
    :goto_4
    :try_start_4
    invoke-static {v2}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 268
    :catch_1
    move-exception v1

    .line 269
    :goto_5
    const-string/jumbo v2, "LoadResource"

    const-string/jumbo v3, "Exception"

    invoke-static {v2, v3, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 263
    :cond_3
    const/4 v0, 0x0

    :try_start_5
    invoke-static {v2, v0}, Landroid/graphics/drawable/BitmapDrawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    move-result-object v0

    goto :goto_4

    .line 268
    :catch_2
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_5

    .line 248
    :catch_3
    move-exception v1

    goto :goto_3

    :cond_4
    move-object v0, v1

    goto :goto_4

    :cond_5
    move-object v0, v1

    goto :goto_1
.end method
