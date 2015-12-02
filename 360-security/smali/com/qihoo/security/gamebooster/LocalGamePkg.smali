.class public Lcom/qihoo/security/gamebooster/LocalGamePkg;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/LocalGamePkg$State;
    }
.end annotation


# static fields
.field public static ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 16
    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    const-string/jumbo v1, ""

    sget-object v2, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;)V

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->a:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->a:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    .line 47
    iput-wide p3, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->c:J

    .line 48
    return-void
.end method

.method public static fromJsonArray(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 132
    if-nez p0, :cond_0

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    :goto_0
    return-object v0

    .line 135
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 139
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_3

    .line 140
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 141
    if-nez v4, :cond_2

    .line 139
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 144
    :cond_2
    invoke-static {v4}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->fromJsonObject(Lorg/json/JSONObject;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v4

    .line 145
    if-eqz v4, :cond_1

    .line 148
    invoke-virtual {v4}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 151
    invoke-virtual {v4}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 152
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 154
    :cond_3
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    goto :goto_0
.end method

.method public static fromJsonObject(Lorg/json/JSONObject;)Lcom/qihoo/security/gamebooster/LocalGamePkg;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, -0x1

    .line 113
    if-nez p0, :cond_1

    .line 125
    :cond_0
    :goto_0
    return-object v0

    .line 116
    :cond_1
    const-string/jumbo v1, "pkg"

    const-string/jumbo v2, ""

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 117
    const-string/jumbo v2, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 118
    const-string/jumbo v4, "state"

    invoke-virtual {p0, v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 119
    invoke-static {}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->values()[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    move-result-object v5

    .line 120
    if-eq v4, v6, :cond_0

    array-length v5, v5

    if-ge v4, v5, :cond_0

    .line 123
    invoke-static {}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->values()[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    move-result-object v0

    aget-object v4, v0, v4

    .line 124
    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V

    goto :goto_0
.end method

.method public static toJsonArray(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    .line 82
    if-nez p0, :cond_0

    .line 83
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 93
    :goto_0
    return-object v0

    .line 85
    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 86
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 87
    invoke-static {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->toJsonObject(Lcom/qihoo/security/gamebooster/LocalGamePkg;)Lorg/json/JSONObject;

    move-result-object v0

    .line 88
    if-eqz v0, :cond_1

    .line 91
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 93
    goto :goto_0
.end method

.method public static toJsonObject(Lcom/qihoo/security/gamebooster/LocalGamePkg;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 98
    if-nez p0, :cond_0

    .line 109
    :goto_0
    return-object v0

    .line 102
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 103
    const-string/jumbo v2, "pkg"

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    const-string/jumbo v2, "state"

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getState()Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->ordinal()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 105
    const-string/jumbo v2, "time"

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getTime()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 106
    goto :goto_0

    .line 107
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public getPkgName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Lcom/qihoo/security/gamebooster/LocalGamePkg$State;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    return-object v0
.end method

.method public getTime()J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->c:J

    return-wide v0
.end method

.method public setPkgName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->a:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setState(Lcom/qihoo/security/gamebooster/LocalGamePkg$State;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    .line 60
    return-void
.end method

.method public setTime(J)V
    .locals 1

    .prologue
    .line 30
    iput-wide p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->c:J

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->a:Ljava/lang/String;

    return-object v0
.end method
