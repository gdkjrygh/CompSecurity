.class public Lcom/hmobile/model/LikeShareInfo;
.super Ljava/lang/Object;
.source "LikeShareInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;
    }
.end annotation


# instance fields
.field public book:Ljava/lang/String;

.field public chapter:Ljava/lang/String;

.field public id:I

.field public likes:I

.field public packagename:Ljava/lang/String;

.field public shares:I

.field public verse:Ljava/lang/String;

.field public verseinfo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput v1, p0, Lcom/hmobile/model/LikeShareInfo;->id:I

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/LikeShareInfo;->packagename:Ljava/lang/String;

    .line 16
    iput v1, p0, Lcom/hmobile/model/LikeShareInfo;->likes:I

    .line 17
    iput v1, p0, Lcom/hmobile/model/LikeShareInfo;->shares:I

    .line 8
    return-void
.end method

.method public static parse(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .param p0, "res"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 20
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .local v6, "infos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/LikeShareInfo;>;"
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .local v7, "main":Lorg/json/JSONObject;
    const-string v10, "TaskList"

    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 24
    .local v9, "taskList":Lorg/json/JSONArray;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v10

    if-lt v4, v10, :cond_0

    .line 48
    .end local v4    # "i":I
    .end local v7    # "main":Lorg/json/JSONObject;
    .end local v9    # "taskList":Lorg/json/JSONArray;
    :goto_1
    return-object v6

    .line 25
    .restart local v4    # "i":I
    .restart local v7    # "main":Lorg/json/JSONObject;
    .restart local v9    # "taskList":Lorg/json/JSONArray;
    :cond_0
    invoke-virtual {v9, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 26
    .local v1, "data":Lorg/json/JSONObject;
    if-eqz v1, :cond_1

    .line 27
    new-instance v5, Lcom/hmobile/model/LikeShareInfo;

    invoke-direct {v5}, Lcom/hmobile/model/LikeShareInfo;-><init>()V

    .line 29
    .local v5, "info":Lcom/hmobile/model/LikeShareInfo;
    const-string v10, "task"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 31
    .local v8, "task":Lorg/json/JSONObject;
    const-string v10, "BibleInfo"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 32
    .local v0, "bible":Ljava/lang/String;
    const-string v10, "_"

    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 34
    .local v2, "details":[Ljava/lang/String;
    const/4 v10, 0x0

    aget-object v10, v2, v10

    iput-object v10, v5, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    .line 35
    const/4 v10, 0x1

    aget-object v10, v2, v10

    iput-object v10, v5, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    .line 36
    const/4 v10, 0x2

    aget-object v10, v2, v10

    iput-object v10, v5, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    .line 37
    const-string v10, "BibleLikeId"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    iput v10, v5, Lcom/hmobile/model/LikeShareInfo;->id:I

    .line 38
    const-string v10, "LikeCount"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    iput v10, v5, Lcom/hmobile/model/LikeShareInfo;->likes:I

    .line 39
    const-string v10, "ShareCount"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    iput v10, v5, Lcom/hmobile/model/LikeShareInfo;->shares:I

    .line 40
    const-string v10, "Verse"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v5, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    .line 41
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .end local v0    # "bible":Ljava/lang/String;
    .end local v2    # "details":[Ljava/lang/String;
    .end local v5    # "info":Lcom/hmobile/model/LikeShareInfo;
    .end local v8    # "task":Lorg/json/JSONObject;
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 45
    .end local v1    # "data":Lorg/json/JSONObject;
    .end local v4    # "i":I
    .end local v7    # "main":Lorg/json/JSONObject;
    .end local v9    # "taskList":Lorg/json/JSONArray;
    :catch_0
    move-exception v3

    .line 46
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method
