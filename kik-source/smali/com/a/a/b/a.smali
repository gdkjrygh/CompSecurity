.class public Lcom/a/a/b/a;
.super Lb/a/a/a/l;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/b/o;


# instance fields
.field private final a:Lb/a/a/a/a/a/b;

.field private final b:Lcom/a/a/b/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Lb/a/a/a/l;-><init>()V

    .line 37
    new-instance v0, Lb/a/a/a/a/a/b;

    invoke-direct {v0}, Lb/a/a/a/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/a;->a:Lb/a/a/a/a/a/b;

    .line 38
    new-instance v0, Lcom/a/a/b/g;

    invoke-direct {v0}, Lcom/a/a/b/g;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/a;->b:Lcom/a/a/b/g;

    return-void
.end method

.method private static a(Landroid/content/Context;)Lcom/a/a/b/b;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 164
    .line 168
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "crashlytics-build.properties"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 170
    if-eqz v3, :cond_2

    .line 171
    :try_start_1
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    const-string v1, "version_code"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "version_name"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "build_id"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "package_name"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/a/a/b/b;

    invoke-direct {v1, v4, v5, v6, v0}, Lcom/a/a/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v1, Lcom/a/a/b/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " build properties: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/a/a/b/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/a/a/b/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ") - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/a/a/b/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v1

    .line 180
    :goto_0
    if-eqz v3, :cond_0

    .line 182
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 189
    :cond_0
    :goto_1
    return-object v0

    .line 183
    :catch_0
    move-exception v1

    .line 184
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 177
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    .line 178
    :goto_2
    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Beta"

    const-string v5, "Error reading Beta build properties"

    invoke-interface {v3, v4, v5, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 180
    if-eqz v2, :cond_0

    .line 182
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    .line 183
    :catch_2
    move-exception v1

    .line 184
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 180
    :catchall_0
    move-exception v0

    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_1

    .line 182
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 185
    :cond_1
    :goto_4
    throw v0

    .line 183
    :catch_3
    move-exception v1

    .line 184
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 180
    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_3

    .line 177
    :catch_4
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    goto :goto_2

    :catch_5
    move-exception v0

    move-object v2, v3

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_2

    :cond_2
    move-object v0, v2

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 136
    .line 138
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-ge v0, v2, :cond_2

    if-nez p2, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    .line 139
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 141
    :try_start_0
    iget-object v0, p0, Lcom/a/a/b/a;->a:Lb/a/a/a/a/a/b;

    iget-object v2, p0, Lcom/a/a/b/a;->b:Lcom/a/a/b/g;

    invoke-virtual {v0, p1, v2}, Lb/a/a/a/a/a/b;->a(Landroid/content/Context;Lb/a/a/a/a/a/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 142
    const-string v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    move-object v1, v0

    .line 150
    :goto_1
    return-object v1

    .line 138
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const-string v0, "io.crash.air"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 143
    :catch_0
    move-exception v0

    .line 144
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Failed to load the Beta device token"

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 147
    :cond_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    const-string v0, "1.1.2.37"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    const-string v0, "com.crashlytics.sdk.android:beta"

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 3

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/a/a/b/a;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->h()Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {p0}, Lcom/a/a/b/a;->v()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/a/a/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 78
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 81
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 82
    sget-object v2, Lb/a/a/a/a/b/t$a;->c:Lb/a/a/a/a/b/t$a;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_0
    return-object v1
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v0, 0x0

    .line 28
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-virtual {p0}, Lcom/a/a/b/a;->v()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/a/a/b/a;->u()Lb/a/a/a/a/b/t;

    move-result-object v3

    invoke-virtual {v3}, Lb/a/a/a/a/b/t;->h()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/a/a/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v2

    invoke-virtual {v2}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v4, v2, Lb/a/a/a/a/g/t;->f:Lb/a/a/a/a/g/f;

    :goto_1
    invoke-static {v1}, Lcom/a/a/b/a;->a(Landroid/content/Context;)Lcom/a/a/b/b;

    move-result-object v5

    if-eqz v4, :cond_1

    iget-object v2, v4, Lb/a/a/a/a/g/f;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v5, :cond_1

    move v0, v9

    :cond_1
    if-eqz v0, :cond_2

    new-instance v0, Lcom/a/a/b/c;

    new-instance v6, Lb/a/a/a/a/f/c;

    const-class v2, Lcom/a/a/b/a;

    invoke-static {v2}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v2

    invoke-direct {v6, v2}, Lb/a/a/a/a/f/c;-><init>(Lb/a/a/a/l;)V

    new-instance v7, Lb/a/a/a/a/b/z;

    invoke-direct {v7}, Lb/a/a/a/a/b/z;-><init>()V

    new-instance v8, Lb/a/a/a/a/e/b;

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    invoke-direct {v8, v2}, Lb/a/a/a/a/e/b;-><init>(Lb/a/a/a/o;)V

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/a/a/b/c;-><init>(Landroid/content/Context;Lcom/a/a/b/a;Lb/a/a/a/a/b/t;Lb/a/a/a/a/g/f;Lcom/a/a/b/b;Lb/a/a/a/a/f/b;Lb/a/a/a/a/b/m;Lb/a/a/a/a/e/g;)V

    invoke-virtual {v0}, Lcom/a/a/b/c;->a()V

    :cond_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    goto :goto_1
.end method
