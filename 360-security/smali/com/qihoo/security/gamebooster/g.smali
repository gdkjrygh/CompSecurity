.class public Lcom/qihoo/security/gamebooster/g;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:J

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLjava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-wide p1, p0, Lcom/qihoo/security/gamebooster/g;->a:J

    .line 28
    iput-object p3, p0, Lcom/qihoo/security/gamebooster/g;->b:Ljava/util/List;

    .line 29
    iput-object p4, p0, Lcom/qihoo/security/gamebooster/g;->c:Ljava/util/List;

    .line 30
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/qihoo/security/gamebooster/g;
    .locals 5

    .prologue
    .line 49
    .line 53
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    const-string/jumbo v1, "v5_version"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 55
    const-string/jumbo v1, "pkgs"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 56
    const-string/jumbo v4, "delete_pkgs"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 57
    invoke-static {v1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->fromJsonArray(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    .line 58
    invoke-static {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->fromJsonArray(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    .line 63
    new-instance v0, Lcom/qihoo/security/gamebooster/g;

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/qihoo/security/gamebooster/g;-><init>(JLjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :goto_0
    return-object v0

    .line 65
    :catch_0
    move-exception v0

    .line 70
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/qihoo/security/gamebooster/g;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 74
    if-nez p0, :cond_0

    .line 75
    const/4 v0, 0x0

    .line 87
    :goto_0
    return-object v0

    .line 77
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 79
    :try_start_0
    const-string/jumbo v1, "v5_version"

    iget-wide v2, p0, Lcom/qihoo/security/gamebooster/g;->a:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 80
    const-string/jumbo v1, "pkgs"

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->toJsonArray(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string/jumbo v1, "delete_pkgs"

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->toJsonArray(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 82
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public static d()Lcom/qihoo/security/gamebooster/g;
    .locals 5

    .prologue
    .line 92
    new-instance v0, Lcom/qihoo/security/gamebooster/g;

    const-wide/16 v2, 0x0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/qihoo/security/gamebooster/g;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 94
    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/g;->c:Ljava/util/List;

    return-object v0
.end method

.method public a(J)V
    .locals 1

    .prologue
    .line 37
    iput-wide p1, p0, Lcom/qihoo/security/gamebooster/g;->a:J

    .line 38
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 33
    iget-wide v0, p0, Lcom/qihoo/security/gamebooster/g;->a:J

    return-wide v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/g;->b:Ljava/util/List;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 14
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/g;->e()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/qihoo/security/gamebooster/g;
    .locals 6

    .prologue
    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 99
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/g;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 100
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/g;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 101
    new-instance v2, Lcom/qihoo/security/gamebooster/g;

    iget-wide v4, p0, Lcom/qihoo/security/gamebooster/g;->a:J

    invoke-direct {v2, v4, v5, v0, v1}, Lcom/qihoo/security/gamebooster/g;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 102
    return-object v2
.end method
