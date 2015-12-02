.class public Lcom/facebook/selfupdate/c;
.super Ljava/lang/Object;
.source "AppServerResponse.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:J


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 3

    .prologue
    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    const-string v0, "update_check_minutes"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/selfupdate/c;->b:J

    .line 112
    const-string v0, "release_number"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/selfupdate/c;->c:I

    .line 113
    const-string v0, "download_url"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->e:Ljava/lang/String;

    .line 114
    const-string v0, "client_action"

    sget-object v1, Lcom/facebook/selfupdate/d;->DEFAULT:Lcom/facebook/selfupdate/d;

    iget v1, v1, Lcom/facebook/selfupdate/d;->value:I

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/selfupdate/c;->d:I

    .line 116
    const-string v0, "release_notes"

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->f:Ljava/lang/String;

    .line 117
    const-string v0, "application_name"

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->g:Ljava/lang/String;

    .line 118
    const-string v0, "application_version"

    const-string v1, ""

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->h:Ljava/lang/String;

    .line 119
    const-string v0, "allowed_networks"

    sget-object v1, Lcom/facebook/selfupdate/e;->DEFAULT:Lcom/facebook/selfupdate/e;

    iget v1, v1, Lcom/facebook/selfupdate/e;->value:I

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/selfupdate/c;->i:I

    .line 121
    const-string v0, "megaphone"

    const-string v1, "no_megaphone"

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 124
    if-eqz v0, :cond_0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 125
    iput-object v0, p0, Lcom/facebook/selfupdate/c;->a:Ljava/lang/String;

    .line 129
    :goto_0
    const-string v0, "file_mime_type"

    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->j:Ljava/lang/String;

    .line 131
    const-string v0, "file_size"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/selfupdate/c;->k:J

    .line 132
    return-void

    .line 127
    :cond_0
    const-string v0, "no_megaphone"

    iput-object v0, p0, Lcom/facebook/selfupdate/c;->a:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/selfupdate/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 72
    iget v0, p0, Lcom/facebook/selfupdate/c;->d:I

    sget-object v1, Lcom/facebook/selfupdate/d;->FORCE_UPDATE_NOTIFY_USER:Lcom/facebook/selfupdate/d;

    iget v1, v1, Lcom/facebook/selfupdate/d;->value:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()J
    .locals 4

    .prologue
    .line 76
    iget-wide v0, p0, Lcom/facebook/selfupdate/c;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/facebook/selfupdate/c;->b:J

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    :goto_0
    return-wide v0

    :cond_0
    const-wide/32 v0, 0xa4cb80

    goto :goto_0
.end method
