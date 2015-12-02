.class public Lcom/qihoo/security/appbox/b/d;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field private final c:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;J)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 33
    iput-wide p3, p0, Lcom/qihoo/security/appbox/b/d;->c:J

    .line 34
    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 4

    .prologue
    .line 65
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    .line 66
    const-string/jumbo v1, "errno"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    .line 67
    const-string/jumbo v1, "end_state"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    .line 68
    const-string/jumbo v1, "total"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->total:I

    .line 69
    const-string/jumbo v1, "updateTime"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    .line 70
    const-string/jumbo v1, "data"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 71
    const-string/jumbo v2, "banner"

    const/4 v3, 0x0

    invoke-static {p0, v1, v2, v3}, Lcom/qihoo/security/appbox/b/a;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    .line 72
    return-object v0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 4

    .prologue
    .line 37
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 61
    :goto_0
    return-object v0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    const-string/jumbo v1, "errno"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget v0, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    if-eqz v0, :cond_2

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 47
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    const-string/jumbo v1, "pickers_app_box_previous_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/appbox/core/b;->b(Landroid/content/Context;Ljava/lang/String;J)V

    .line 50
    const-string/jumbo v0, "updateTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 55
    iget-wide v2, p0, Lcom/qihoo/security/appbox/b/d;->c:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 59
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/security/appbox/b/d;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/d;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 76
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 77
    const-string/jumbo v1, "client="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 78
    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 79
    const-string/jumbo v1, "&version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 80
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/appbox/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 81
    const-string/jumbo v1, "&updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    iget-wide v2, p0, Lcom/qihoo/security/appbox/b/d;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 83
    const-string/jumbo v1, "&start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 84
    const-string/jumbo v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 85
    const-string/jumbo v1, "&count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    const-string/jumbo v1, "50"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 87
    const-string/jumbo v1, "&district="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/appbox/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 89
    const-string/jumbo v1, "&lang="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    invoke-static {}, Lcom/qihoo/security/appbox/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 91
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/d;->a:Landroid/content/Context;

    const-string/jumbo v2, "appbox_last_time_use_language"

    invoke-static {}, Lcom/qihoo/security/appbox/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
