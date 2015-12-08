.class public final Lcom/roidapp/cloudlib/template/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field private static volatile a:Z


# instance fields
.field private b:Landroid/content/SharedPreferences;

.field private c:Lcom/roidapp/cloudlib/template/i;

.field private d:Lcom/roidapp/cloudlib/template/h;

.field private e:Lcom/roidapp/baselib/e/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1034
    const-string v0, "cloudlib_prefs"

    invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    .line 1118
    new-instance v0, Lcom/roidapp/cloudlib/template/i;

    invoke-direct {v0, p0, v3}, Lcom/roidapp/cloudlib/template/i;-><init>(Lcom/roidapp/cloudlib/template/g;B)V

    .line 1119
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    const-string v2, "template_serverVer"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    .line 1120
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    const-string v2, "template_localVer"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/template/i;->b:I

    .line 1035
    iput-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    .line 1036
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v0, v0, Lcom/roidapp/cloudlib/template/i;->b:I

    if-nez v0, :cond_1

    .line 1038
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->k()I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/template/i;->b:I

    .line 1039
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v0, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v1, v1, Lcom/roidapp/cloudlib/template/i;->b:I

    if-ge v0, v1, :cond_0

    .line 1040
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v1, v1, Lcom/roidapp/cloudlib/template/i;->b:I

    iput v1, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    .line 1041
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v1, v1, Lcom/roidapp/cloudlib/template/i;->a:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v2, v2, Lcom/roidapp/cloudlib/template/i;->b:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/g;->a(Landroid/content/SharedPreferences;II)Z

    .line 31
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/roidapp/cloudlib/template/i;
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 97
    if-nez p1, :cond_0

    .line 108
    :goto_0
    return-object v1

    .line 99
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/template/i;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/cloudlib/template/i;-><init>(Lcom/roidapp/cloudlib/template/g;B)V

    .line 101
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 102
    const-string v3, "version"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, v0, Lcom/roidapp/cloudlib/template/i;->a:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v1, v0

    .line 108
    goto :goto_0

    .line 105
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move-object v0, v1

    .line 106
    goto :goto_1
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 133
    if-nez p0, :cond_0

    .line 135
    :goto_0
    return v0

    :cond_0
    const-string v1, "cloudlib_prefs"

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const/high16 v1, -0x80000000

    invoke-static {v0, v1, p1}, Lcom/roidapp/cloudlib/template/g;->a(Landroid/content/SharedPreferences;II)Z

    move-result v0

    goto :goto_0
.end method

.method private static a(Landroid/content/SharedPreferences;II)Z
    .locals 3

    .prologue
    const/high16 v2, -0x80000000

    .line 139
    if-nez p0, :cond_0

    .line 140
    const/4 v0, 0x0

    .line 147
    :goto_0
    return v0

    .line 141
    :cond_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 142
    if-eq p1, v2, :cond_1

    .line 143
    const-string v1, "template_serverVer"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 144
    :cond_1
    if-eq p2, v2, :cond_2

    .line 145
    const-string v1, "template_localVer"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 146
    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 147
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/roidapp/cloudlib/template/i;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    return-object v0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    .line 115
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 2080
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    .line 2081
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/template/g;->a(Ljava/lang/String;)Lcom/roidapp/cloudlib/template/i;

    move-result-object v0

    .line 2082
    if-eqz v0, :cond_1

    .line 2083
    iget v1, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v2, v2, Lcom/roidapp/cloudlib/template/i;->a:I

    if-eq v1, v2, :cond_1

    .line 2084
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    iget v2, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    const/high16 v3, -0x80000000

    invoke-static {v1, v2, v3}, Lcom/roidapp/cloudlib/template/g;->a(Landroid/content/SharedPreferences;II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2085
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_0

    .line 2086
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "templateTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2087
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    iget v0, v0, Lcom/roidapp/cloudlib/template/i;->a:I

    iput v0, v1, Lcom/roidapp/cloudlib/template/i;->a:I

    .line 2089
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->d:Lcom/roidapp/cloudlib/template/h;

    if-eqz v0, :cond_1

    .line 2090
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->d:Lcom/roidapp/cloudlib/template/h;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/g;->c:Lcom/roidapp/cloudlib/template/i;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/template/h;->a(Lcom/roidapp/cloudlib/template/i;)V

    .line 15
    :cond_1
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/template/h;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 61
    sget-boolean v2, Lcom/roidapp/cloudlib/template/g;->a:Z

    if-eqz v2, :cond_1

    .line 75
    :cond_0
    :goto_0
    return v0

    .line 65
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/roidapp/cloudlib/template/g;->b:Landroid/content/SharedPreferences;

    const-string v5, "templateTime"

    const-wide/16 v6, 0x0

    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x5265c00

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 69
    sput-boolean v1, Lcom/roidapp/cloudlib/template/g;->a:Z

    .line 70
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/g;->d:Lcom/roidapp/cloudlib/template/h;

    .line 71
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    if-eqz v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/r;->f()V

    .line 73
    :cond_2
    new-instance v0, Lcom/roidapp/baselib/e/r;

    const-string v2, "http://dl.pg.ksmobile.com/templates/version"

    invoke-direct {v0, v2, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    .line 74
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/g;->e:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    move v0, v1

    .line 75
    goto :goto_0
.end method
