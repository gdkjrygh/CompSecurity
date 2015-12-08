.class public Lcom/yong/jamendo/api/JamendoGet2ApiImpl;
.super Ljava/lang/Object;
.source "JamendoGet2ApiImpl.java"

# interfaces
.implements Lcom/yong/jamendo/api/JamendoGet2Api;


# static fields
.field private static GET_API_URL:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-string v0, "http://api.jamendo.com/v3.0/tracks/?client_id=13dd2d60&format=json&limit=50&order=downloads_total&include=stats&imagesize=200&groupby=artist_id&namesearch="

    sput-object v0, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;->GET_API_URL:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private doGet(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "query"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yong/jamendo/api/WSError;
        }
    .end annotation

    .prologue
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;->GET_API_URL:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/yong/jamendo/api/Caller;->doGet(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getMusics(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 5
    .param p0, "jsonArrayMusic"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 27
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 28
    .local v3, "n":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .local v2, "jamendoMp3Info":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/jamendo/api/JamendoMusic;>;"
    new-instance v0, Lcom/yong/jamendo/api/JamendoMusicBuilder;

    invoke-direct {v0}, Lcom/yong/jamendo/api/JamendoMusicBuilder;-><init>()V

    .line 31
    .local v0, "albumBuilder":Lcom/yong/jamendo/api/JamendoMusicBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v3, :cond_0

    .line 36
    return-object v2

    .line 33
    :cond_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 32
    invoke-virtual {v0, v4}, Lcom/yong/jamendo/api/JamendoMusicBuilder;->build(Lorg/json/JSONObject;)Lcom/yong/jamendo/api/JamendoMusic;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public searchForTracksByTag(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .param p1, "searchTag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/yong/jamendo/api/WSError;
        }
    .end annotation

    .prologue
    .line 43
    :try_start_0
    const-string v3, "UTF-8"

    invoke-static {p1, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;->doGet(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 45
    .local v2, "jsonString":Ljava/lang/String;
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    const-string v4, "results"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 47
    .local v1, "jsonArrayMusic":Lorg/json/JSONArray;
    invoke-static {v1}, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;->getMusics(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 50
    .end local v1    # "jsonArrayMusic":Lorg/json/JSONArray;
    .end local v2    # "jsonString":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 48
    :catch_0
    move-exception v0

    .line 49
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 50
    const/4 v3, 0x0

    goto :goto_0

    .line 51
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v0

    .line 52
    .local v0, "e":Ljava/lang/NullPointerException;
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    .line 53
    new-instance v3, Lorg/json/JSONException;

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v3
.end method
