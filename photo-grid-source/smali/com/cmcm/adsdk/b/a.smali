.class public final Lcom/cmcm/adsdk/b/a;
.super Ljava/util/Observable;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/adsdk/b/d/b;


# static fields
.field private static e:Lcom/cmcm/adsdk/b/a;

.field private static f:Landroid/content/SharedPreferences;


# instance fields
.field private a:Lcom/cmcm/adsdk/b/d/a;

.field private b:Landroid/content/Context;

.field private c:Lcom/cmcm/adsdk/b/d;

.field private d:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/util/Observable;-><init>()V

    .line 37
    const-string v0, "cmcmadsdk_config"

    iput-object v0, p0, Lcom/cmcm/adsdk/b/a;->g:Ljava/lang/String;

    .line 74
    iput-object p1, p0, Lcom/cmcm/adsdk/b/a;->d:Ljava/lang/String;

    .line 75
    return-void
.end method

.method private static a()J
    .locals 4

    .prologue
    .line 292
    sget-object v0, Lcom/cmcm/adsdk/b/a;->f:Landroid/content/SharedPreferences;

    const-string v1, "request_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/b/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/cmcm/adsdk/b/a;->e:Lcom/cmcm/adsdk/b/a;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lcom/cmcm/adsdk/b/a;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/b/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/cmcm/adsdk/b/a;->e:Lcom/cmcm/adsdk/b/a;

    .line 70
    :cond_0
    sget-object v0, Lcom/cmcm/adsdk/b/a;->e:Lcom/cmcm/adsdk/b/a;

    return-object v0
.end method

.method static synthetic b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a;->c:Lcom/cmcm/adsdk/b/d;

    return-object v0
.end method

.method static synthetic c(Lcom/cmcm/adsdk/b/a;)V
    .locals 0

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/cmcm/adsdk/b/a;->setChanged()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 56
    iput-object p1, p0, Lcom/cmcm/adsdk/b/a;->b:Landroid/content/Context;

    .line 57
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e/b;->a(Landroid/content/Context;)V

    .line 58
    invoke-static {p1}, Lcom/cmcm/adsdk/b/c/a;->a(Landroid/content/Context;)V

    .line 59
    invoke-static {}, Lcom/cmcm/adsdk/b/d/a;->a()Lcom/cmcm/adsdk/b/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/cmcm/adsdk/b/a;->a:Lcom/cmcm/adsdk/b/d/a;

    .line 60
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a;->b:Landroid/content/Context;

    const-string v1, "cmcmadsdk_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/cmcm/adsdk/b/a;->f:Landroid/content/SharedPreferences;

    .line 63
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/b/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/e;->a(Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public final a(Lcom/cmcm/adsdk/b/d;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x3e8

    .line 78
    iput-object p1, p0, Lcom/cmcm/adsdk/b/a;->c:Lcom/cmcm/adsdk/b/d;

    .line 1202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    div-long/2addr v0, v4

    invoke-static {}, Lcom/cmcm/adsdk/b/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1c20

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 1203
    const-string v0, "RequestConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "time:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    div-long/2addr v2, v4

    invoke-static {}, Lcom/cmcm/adsdk/b/a;->a()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1204
    const/4 v0, 0x1

    .line 79
    :goto_0
    if-eqz v0, :cond_2

    .line 80
    iget-object v1, p0, Lcom/cmcm/adsdk/b/a;->a:Lcom/cmcm/adsdk/b/d/a;

    invoke-static {}, Lcom/cmcm/adsdk/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "http://unconf.mobad.ijinshan.com/b/"

    :goto_1
    iget-object v2, p0, Lcom/cmcm/adsdk/b/a;->d:Ljava/lang/String;

    invoke-static {v2}, Lcom/cmcm/adsdk/b/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p0}, Lcom/cmcm/adsdk/b/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/cmcm/adsdk/b/d/b;)V

    .line 91
    :goto_2
    return-void

    .line 1206
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 80
    :cond_1
    const-string v0, "http://unconf.adkmob.com/b/"

    goto :goto_1

    .line 83
    :cond_2
    const-string v0, "RequestConfig"

    const-string v1, "has request config has success within 2 hour "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-interface {p1}, Lcom/cmcm/adsdk/b/d;->b()V

    goto :goto_2
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 213
    const-string v0, "RequestConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "request failed..."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v0, Lcom/cmcm/adsdk/b/b;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/b/b;-><init>(Lcom/cmcm/adsdk/b/a;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/c/a;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 233
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x3e8

    .line 237
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    const-string v0, "RequestConfig"

    const-string v1, "server config is empty"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    :goto_0
    return-void

    .line 242
    :cond_0
    const-string v0, "RequestConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "request config success.,save time :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    div-long/2addr v0, v4

    .line 1282
    sget-object v2, Lcom/cmcm/adsdk/b/a;->f:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 1283
    const-string v3, "request_time"

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1284
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    .line 1285
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 244
    :goto_1
    const-string v0, ""

    invoke-static {v0}, Lcom/cmcm/adsdk/b/e/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 245
    const-string v1, "RequestConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "local config :"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 247
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e/b;->b(Ljava/lang/String;)V

    .line 248
    invoke-static {p1}, Lcom/cmcm/adsdk/b/a/e;->a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a/e;

    move-result-object v0

    .line 249
    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/a/e;->a()Ljava/util/List;

    move-result-object v1

    .line 250
    const-string v2, "RequestConfig"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "listBean:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1298
    const-string v2, "RequestConfig"

    const-string v3, "update config in db"

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1299
    new-instance v2, Lcom/cmcm/adsdk/b/c;

    invoke-direct {v2, p0, v1}, Lcom/cmcm/adsdk/b/c;-><init>(Lcom/cmcm/adsdk/b/a;Ljava/util/List;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-static {v2, v1}, Lcom/cmcm/adsdk/c/a;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 252
    const-string v1, "RequestConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "reponse:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1287
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_1

    .line 254
    :cond_2
    const-string v0, "RequestConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "config no changed "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
