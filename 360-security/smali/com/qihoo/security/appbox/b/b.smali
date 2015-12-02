.class public Lcom/qihoo/security/appbox/b/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static d:I


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field private final c:Ljava/lang/String;

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput v0, Lcom/qihoo/security/appbox/b/b;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qihoo/security/appbox/b/b;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 26
    iput-object p3, p0, Lcom/qihoo/security/appbox/b/b;->c:Ljava/lang/String;

    .line 27
    iput-wide p4, p0, Lcom/qihoo/security/appbox/b/b;->e:J

    .line 28
    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 4

    .prologue
    .line 73
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    .line 74
    const-string/jumbo v1, "end_state"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    .line 75
    const-string/jumbo v1, "total"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->total:I

    .line 76
    const-string/jumbo v1, "updateTime"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    .line 77
    const-string/jumbo v1, "data"

    sget v2, Lcom/qihoo/security/appbox/b/b;->d:I

    invoke-static {p0, p1, v1, v2}, Lcom/qihoo/security/appbox/b/a;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 78
    iget-object v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 82
    return-object v0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 4

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 69
    :goto_0
    return-object v0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    const-string/jumbo v1, "errno"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget v0, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    if-eqz v0, :cond_2

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->c:Ljava/lang/String;

    const-string/jumbo v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 47
    const-string/jumbo v0, "apps_app_box_previous_time"

    .line 56
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v0, v2, v3}, Lcom/qihoo/security/appbox/core/b;->b(Landroid/content/Context;Ljava/lang/String;J)V

    .line 58
    const-string/jumbo v0, "updateTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 63
    iget-wide v2, p0, Lcom/qihoo/security/appbox/b/b;->e:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_5

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 48
    :cond_4
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->c:Ljava/lang/String;

    const-string/jumbo v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 49
    const-string/jumbo v0, "games_app_box_previous_time"

    goto :goto_1

    .line 67
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/security/appbox/b/b;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/appbox/b/b;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 86
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 87
    const-string/jumbo v1, "client="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 89
    const-string/jumbo v1, "&version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/appbox/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 91
    const-string/jumbo v1, "&updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 92
    iget-wide v2, p0, Lcom/qihoo/security/appbox/b/b;->e:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 93
    const-string/jumbo v1, "&start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 94
    sget v1, Lcom/qihoo/security/appbox/b/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 95
    const-string/jumbo v1, "&count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 96
    const-string/jumbo v1, "20"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 97
    const-string/jumbo v1, "&type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 98
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 99
    const-string/jumbo v1, "&district="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 100
    iget-object v1, p0, Lcom/qihoo/security/appbox/b/b;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/appbox/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 101
    const-string/jumbo v1, "&lang="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 102
    invoke-static {}, Lcom/qihoo/security/appbox/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 31
    sput p1, Lcom/qihoo/security/appbox/b/b;->d:I

    .line 32
    return-void
.end method
