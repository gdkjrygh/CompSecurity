.class public final Lcom/b/a/b/e;
.super La/a/a/a/p;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/b/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/p",
        "<",
        "Ljava/lang/Boolean;",
        ">;",
        "La/a/a/a/a/b/s;"
    }
.end annotation


# instance fields
.field private final a:La/a/a/a/a/a/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/a/a/b",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/b/a/b/j;

.field private c:Lcom/b/a/b/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, La/a/a/a/p;-><init>()V

    .line 40
    new-instance v0, La/a/a/a/a/a/b;

    invoke-direct {v0}, La/a/a/a/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/b/a/b/e;->a:La/a/a/a/a/a/b;

    .line 41
    new-instance v0, Lcom/b/a/b/j;

    invoke-direct {v0}, Lcom/b/a/b/j;-><init>()V

    iput-object v0, p0, Lcom/b/a/b/e;->b:Lcom/b/a/b/j;

    return-void
.end method

.method private static a(Landroid/content/Context;)Lcom/b/a/b/f;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 185
    .line 189
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "crashlytics-build.properties"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 191
    if-eqz v3, :cond_2

    .line 2035
    :try_start_1
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 2036
    invoke-virtual {v0, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 3026
    const-string v1, "version_code"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3027
    const-string v1, "version_name"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3028
    const-string v1, "build_id"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3029
    const-string v1, "package_name"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3031
    new-instance v1, Lcom/b/a/b/f;

    invoke-direct {v1, v4, v5, v6, v0}, Lcom/b/a/b/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v1, Lcom/b/a/b/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " build properties: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/b/a/b/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/b/a/b/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ") - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lcom/b/a/b/f;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, v1

    .line 201
    :goto_0
    if-eqz v3, :cond_0

    .line 203
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 210
    :cond_0
    :goto_1
    return-object v0

    .line 204
    :catch_0
    move-exception v1

    .line 205
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 198
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    .line 199
    :goto_2
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Beta"

    const-string v5, "Error reading Beta build properties"

    invoke-interface {v3, v4, v5, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 201
    if-eqz v2, :cond_0

    .line 203
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    .line 204
    :catch_2
    move-exception v1

    .line 205
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 201
    :catchall_0
    move-exception v0

    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_1

    .line 203
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 206
    :cond_1
    :goto_4
    throw v0

    .line 204
    :catch_3
    move-exception v1

    .line 205
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Error closing Beta build properties asset"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 201
    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_3

    .line 198
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

    .line 157
    .line 159
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1139
    const/16 v2, 0xb

    if-ge v0, v2, :cond_2

    .line 1143
    if-nez p2, :cond_1

    const/4 v0, 0x1

    .line 159
    :goto_0
    if-eqz v0, :cond_3

    .line 160
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 162
    :try_start_0
    iget-object v0, p0, Lcom/b/a/b/e;->a:La/a/a/a/a/a/b;

    iget-object v2, p0, Lcom/b/a/b/e;->b:Lcom/b/a/b/j;

    invoke-virtual {v0, p1, v2}, La/a/a/a/a/a/b;->a(Landroid/content/Context;La/a/a/a/a/a/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 163
    const-string v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    move-object v1, v0

    .line 171
    :goto_1
    return-object v1

    .line 1143
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1146
    :cond_2
    const-string v0, "io.crash.air"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 164
    :catch_0
    move-exception v0

    .line 165
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Beta"

    const-string v4, "Failed to load the Beta device token"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 168
    :cond_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    const-string v0, "1.1.3.61"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    const-string v0, "com.crashlytics.sdk.android:beta"

    return-object v0
.end method

.method protected final synthetic d()Ljava/lang/Object;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v0, 0x0

    .line 31
    .line 3061
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3063
    invoke-virtual {p0}, Lcom/b/a/b/e;->v()Landroid/content/Context;

    move-result-object v1

    .line 3064
    invoke-virtual {p0}, Lcom/b/a/b/e;->u()La/a/a/a/a/b/x;

    move-result-object v3

    .line 3065
    invoke-virtual {v3}, La/a/a/a/a/b/x;->h()Ljava/lang/String;

    move-result-object v2

    .line 3066
    invoke-direct {p0, v1, v2}, Lcom/b/a/b/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3068
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3069
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3070
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    .line 3073
    :cond_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3175
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;

    move-result-object v2

    .line 3177
    if-eqz v2, :cond_3

    .line 3178
    iget-object v4, v2, La/a/a/a/a/g/v;->f:La/a/a/a/a/g/f;

    .line 3076
    :goto_1
    invoke-static {v1}, Lcom/b/a/b/e;->a(Landroid/content/Context;)Lcom/b/a/b/f;

    move-result-object v5

    .line 4151
    if-eqz v4, :cond_1

    iget-object v2, v4, La/a/a/a/a/g/f;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v5, :cond_1

    move v0, v9

    .line 3078
    :cond_1
    if-eqz v0, :cond_2

    .line 3079
    iget-object v0, p0, Lcom/b/a/b/e;->c:Lcom/b/a/b/l;

    new-instance v6, La/a/a/a/a/f/d;

    invoke-direct {v6, p0}, La/a/a/a/a/f/d;-><init>(La/a/a/a/p;)V

    new-instance v7, La/a/a/a/a/b/ah;

    invoke-direct {v7}, La/a/a/a/a/b/ah;-><init>()V

    new-instance v8, La/a/a/a/a/e/b;

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    invoke-direct {v8, v2}, La/a/a/a/a/e/b;-><init>(La/a/a/a/s;)V

    move-object v2, p0

    invoke-interface/range {v0 .. v8}, Lcom/b/a/b/l;->a(Landroid/content/Context;Lcom/b/a/b/e;La/a/a/a/a/b/x;La/a/a/a/a/g/f;Lcom/b/a/b/f;La/a/a/a/a/f/c;La/a/a/a/a/b/q;La/a/a/a/a/e/m;)V

    .line 3090
    :cond_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 3181
    :cond_3
    const/4 v4, 0x0

    goto :goto_1
.end method

.method public final e()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "La/a/a/a/a/b/y;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 114
    invoke-virtual {p0}, Lcom/b/a/b/e;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->h()Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-virtual {p0}, Lcom/b/a/b/e;->v()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/b/a/b/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 120
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 121
    sget-object v2, La/a/a/a/a/b/y;->c:La/a/a/a/a/b/y;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    :cond_0
    return-object v1
.end method

.method protected final e_()Z
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/b/a/b/e;->v()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1098
    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 1102
    invoke-virtual {p0}, Lcom/b/a/b/e;->w()La/a/a/a/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/f;->b()La/a/a/a/a;

    move-result-object v1

    .line 1104
    invoke-virtual {p0}, Lcom/b/a/b/e;->w()La/a/a/a/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/f;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    .line 1105
    new-instance v0, Lcom/b/a/b/b;

    invoke-direct {v0, v1, v2}, Lcom/b/a/b/b;-><init>(La/a/a/a/a;Ljava/util/concurrent/ExecutorService;)V

    .line 55
    :goto_0
    iput-object v0, p0, Lcom/b/a/b/e;->c:Lcom/b/a/b/l;

    .line 56
    const/4 v0, 0x1

    return v0

    .line 1108
    :cond_0
    new-instance v0, Lcom/b/a/b/k;

    invoke-direct {v0}, Lcom/b/a/b/k;-><init>()V

    goto :goto_0
.end method
