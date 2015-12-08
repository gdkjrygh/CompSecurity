.class public Lorg/apache/cordova/FileProgressResult;
.super Ljava/lang/Object;
.source "FileProgressResult.java"


# instance fields
.field private lengthComputable:Z

.field private loaded:J

.field private total:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/FileProgressResult;->lengthComputable:Z

    .line 30
    iput-wide v2, p0, Lorg/apache/cordova/FileProgressResult;->loaded:J

    .line 31
    iput-wide v2, p0, Lorg/apache/cordova/FileProgressResult;->total:J

    return-void
.end method


# virtual methods
.method public getLengthComputable()Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lorg/apache/cordova/FileProgressResult;->lengthComputable:Z

    return v0
.end method

.method public getLoaded()J
    .locals 2

    .prologue
    .line 42
    iget-wide v0, p0, Lorg/apache/cordova/FileProgressResult;->loaded:J

    return-wide v0
.end method

.method public getTotal()J
    .locals 2

    .prologue
    .line 50
    iget-wide v0, p0, Lorg/apache/cordova/FileProgressResult;->total:J

    return-wide v0
.end method

.method public setLengthComputable(Z)V
    .locals 0
    .param p1, "computable"    # Z

    .prologue
    .line 38
    iput-boolean p1, p0, Lorg/apache/cordova/FileProgressResult;->lengthComputable:Z

    .line 39
    return-void
.end method

.method public setLoaded(J)V
    .locals 1
    .param p1, "bytes"    # J

    .prologue
    .line 46
    iput-wide p1, p0, Lorg/apache/cordova/FileProgressResult;->loaded:J

    .line 47
    return-void
.end method

.method public setTotal(J)V
    .locals 1
    .param p1, "bytes"    # J

    .prologue
    .line 54
    iput-wide p1, p0, Lorg/apache/cordova/FileProgressResult;->total:J

    .line 55
    return-void
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 58
    new-instance v1, Lorg/json/JSONObject;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{loaded:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lorg/apache/cordova/FileProgressResult;->loaded:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",total:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lorg/apache/cordova/FileProgressResult;->total:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",lengthComputable:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v0, p0, Lorg/apache/cordova/FileProgressResult;->lengthComputable:Z

    if-eqz v0, :cond_0

    const-string v0, "true"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "}"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method
