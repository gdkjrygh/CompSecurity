.class Ltwitter4j/internal/json/UserMentionEntityJSONImpl;
.super Ltwitter4j/internal/json/EntityIndex;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/UserMentionEntity;


# static fields
.field private static final serialVersionUID:J = 0x5b5263422916aeb6L


# instance fields
.field private id:J

.field private name:Ljava/lang/String;

.field private screenName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ltwitter4j/internal/json/EntityIndex;-><init>()V

    .line 54
    return-void
.end method

.method constructor <init>(IILjava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Ltwitter4j/internal/json/EntityIndex;-><init>()V

    .line 44
    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->setStart(I)V

    .line 45
    invoke-virtual {p0, p2}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->setEnd(I)V

    .line 46
    iput-object p3, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    .line 47
    iput-object p4, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    .line 48
    iput-wide p5, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    .line 49
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ltwitter4j/internal/json/EntityIndex;-><init>()V

    .line 39
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 40
    return-void
.end method

.method private init(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 2

    .prologue
    .line 58
    :try_start_0
    const-string v0, "indices"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    .line 59
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONArray;->getInt(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->setStart(I)V

    .line 60
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONArray;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->setEnd(I)V

    .line 62
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    .line 65
    :cond_0
    const-string v0, "screen_name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    const-string v0, "screen_name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    .line 68
    :cond_1
    const-string v0, "id"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-void

    .line 69
    :catch_0
    move-exception v0

    .line 70
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 124
    if-ne p0, p1, :cond_1

    .line 133
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 127
    :cond_3
    check-cast p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;

    .line 129
    iget-wide v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    iget-wide v4, p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 130
    :cond_4
    iget-object v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 131
    :cond_7
    iget-object v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public getEnd()I
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Ltwitter4j/internal/json/EntityIndex;->getEnd()I

    move-result v0

    return v0
.end method

.method public getId()J
    .locals 2

    .prologue
    .line 103
    iget-wide v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public getStart()I
    .locals 1

    .prologue
    .line 111
    invoke-super {p0}, Ltwitter4j/internal/json/EntityIndex;->getStart()I

    move-result v0

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 138
    iget-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 139
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 140
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    iget-wide v4, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    const/16 v1, 0x20

    ushr-long/2addr v4, v1

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 141
    return v0

    :cond_1
    move v0, v1

    .line 138
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v2, 0x27

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UserMentionEntityJSONImpl{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", screenName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->screenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;->id:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
