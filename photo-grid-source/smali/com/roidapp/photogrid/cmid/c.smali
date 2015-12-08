.class public final Lcom/roidapp/photogrid/cmid/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cmid/a;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cmid/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 134
    iput-object p1, p0, Lcom/roidapp/photogrid/cmid/c;->a:Lcom/roidapp/photogrid/cmid/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 138
    const-string v1, "regist_sid"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1154
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/c;->b:Ljava/lang/String;

    .line 139
    const-string v1, "regist_sid_sig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1162
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/c;->c:Ljava/lang/String;

    .line 140
    const-string v1, "third_sid"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1170
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/c;->d:Ljava/lang/String;

    .line 141
    const-string v1, "third_sid_sig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1178
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/c;->e:Ljava/lang/String;

    .line 142
    const-string v1, "login_sid"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1186
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/c;->f:Ljava/lang/String;

    .line 143
    const-string v1, "login_sid_sig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1194
    iput-object v0, p0, Lcom/roidapp/photogrid/cmid/c;->g:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :goto_0
    return-void

    .line 145
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/c;->g:Ljava/lang/String;

    return-object v0
.end method
