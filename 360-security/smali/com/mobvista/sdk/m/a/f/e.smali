.class public final Lcom/mobvista/sdk/m/a/f/e;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->a:Ljava/lang/String;

    .line 41
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->b:Ljava/lang/String;

    .line 42
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->c:Ljava/lang/String;

    .line 43
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->d:Ljava/lang/String;

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->e:Ljava/lang/String;

    .line 45
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->f:Ljava/lang/String;

    .line 46
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->g:Ljava/lang/String;

    .line 47
    const/4 v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/f/e;->h:I

    .line 51
    return-void
.end method

.method private static b(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/f/f;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 175
    new-instance v0, Lcom/mobvista/sdk/m/a/f/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mobvista/sdk/m/a/f/f;-><init>(B)V

    .line 181
    const-string/jumbo v1, "platform"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 184
    const-string/jumbo v1, "os_version"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 187
    const-string/jumbo v1, "package_name"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 190
    const-string/jumbo v1, "app_version_name"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 193
    const-string/jumbo v1, "app_version_code"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->i(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 196
    const-string/jumbo v1, "orientation"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 199
    const-string/jumbo v1, "model"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 202
    const-string/jumbo v1, "android_id"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 205
    const-string/jumbo v1, "imei"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 208
    const-string/jumbo v1, "mac"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 211
    const-string/jumbo v1, "gaid"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 214
    const-string/jumbo v1, "mnc"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 217
    const-string/jumbo v1, "mcc"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 220
    const-string/jumbo v1, "network_type"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->q(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 223
    const-string/jumbo v1, "language"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x2d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 226
    const-string/jumbo v1, "timezone"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 229
    const-string/jumbo v1, "useragent"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 232
    const-string/jumbo v1, "sdk_version"

    const-string/jumbo v2, "6.1.2 M"

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 235
    const-string/jumbo v1, "gp_version"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 238
    const-string/jumbo v1, "gpsv"

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 241
    const-string/jumbo v1, "screen_size"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->k(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x78

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/b;->l(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 250
    return-object v0
.end method

.method private c()Lcom/mobvista/sdk/m/a/f/f;
    .locals 4

    .prologue
    .line 115
    new-instance v0, Lcom/mobvista/sdk/m/a/f/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mobvista/sdk/m/a/f/f;-><init>(B)V

    .line 118
    const-string/jumbo v1, "app_id"

    sget-object v2, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 121
    const-string/jumbo v1, "unit_id"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 124
    const-string/jumbo v1, "sign"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/mobvista/sdk/m/core/p;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/f/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 127
    const-string/jumbo v1, "category"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 130
    const-string/jumbo v1, "ad_num"

    iget v2, p0, Lcom/mobvista/sdk/m/a/f/e;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 135
    const-string/jumbo v1, "ping_mode"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 141
    const-string/jumbo v1, "exclude_ids"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 144
    const-string/jumbo v1, "offset"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 149
    const-string/jumbo v1, "only_impression"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 163
    const-string/jumbo v1, "image_size"

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/f/e;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mobvista/sdk/m/a/f/f;

    .line 165
    return-object v0
.end method

.method static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 254
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 255
    :cond_0
    const-string/jumbo v0, ""

    .line 257
    :goto_0
    return-object v0

    :cond_1
    const-string/jumbo v0, "utf-8"

    invoke-static {p0, v0}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    .line 90
    const-string/jumbo v0, "1"

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->f:Ljava/lang/String;

    .line 91
    return-object p0
.end method

.method public final a(I)Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->b:Ljava/lang/String;

    .line 60
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/e;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/f/e;->a:Ljava/lang/String;

    .line 55
    return-object p0
.end method

.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 105
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/e;->b(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/f/f;

    move-result-object v0

    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/f/e;->c()Lcom/mobvista/sdk/m/a/f/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/a/f/f;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/f;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/f/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    .line 95
    const-string/jumbo v0, "1"

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->e:Ljava/lang/String;

    .line 96
    return-object p0
.end method

.method public final b(I)Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    const/16 v0, 0x14

    .line 64
    if-gtz p1, :cond_1

    .line 65
    const/4 p1, 0x1

    .line 70
    :cond_0
    :goto_0
    iput p1, p0, Lcom/mobvista/sdk/m/a/f/e;->h:I

    .line 71
    return-object p0

    .line 66
    :cond_1
    if-le p1, v0, :cond_0

    move p1, v0

    .line 67
    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/e;
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/f/e;->d:Ljava/lang/String;

    .line 81
    return-object p0
.end method

.method public final c(I)Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    .line 75
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->c:Ljava/lang/String;

    .line 76
    return-object p0
.end method

.method public final d(I)Lcom/mobvista/sdk/m/a/f/e;
    .locals 1

    .prologue
    .line 100
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/f/e;->g:Ljava/lang/String;

    .line 101
    return-object p0
.end method
