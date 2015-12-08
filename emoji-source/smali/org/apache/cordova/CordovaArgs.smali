.class public Lorg/apache/cordova/CordovaArgs;
.super Ljava/lang/Object;
.source "CordovaArgs.java"


# instance fields
.field private baseArgs:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(Lorg/json/JSONArray;)V
    .locals 0
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    .line 32
    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getArrayBuffer(I)[B
    .locals 2
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 108
    iget-object v1, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 109
    .local v0, "encoded":Ljava/lang/String;
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    return-object v1
.end method

.method public getBoolean(I)Z
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v0

    return v0
.end method

.method public getDouble(I)D
    .locals 2
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public getInt(I)I
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v0

    return v0
.end method

.method public getJSONArray(I)Lorg/json/JSONArray;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v0

    return-object v0
.end method

.method public getJSONObject(I)Lorg/json/JSONObject;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public getLong(I)J
    .locals 2
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 65
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isNull(I)Z
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 102
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    return v0
.end method

.method public opt(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 70
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public optBoolean(I)Z
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 74
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optBoolean(I)Z

    move-result v0

    return v0
.end method

.method public optDouble(I)D
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 78
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public optInt(I)I
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 82
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optInt(I)I

    move-result v0

    return v0
.end method

.method public optJSONArray(I)Lorg/json/JSONArray;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 86
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v0

    return-object v0
.end method

.method public optJSONObject(I)Lorg/json/JSONObject;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 90
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public optLong(I)J
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 94
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public optString(I)Ljava/lang/String;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 98
    iget-object v0, p0, Lorg/apache/cordova/CordovaArgs;->baseArgs:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
