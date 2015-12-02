.class public Lcom/qihoo/security/engine/a/c;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:[Lcom/qihoo/security/engine/a/b;

.field private d:Z

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/qihoo/security/engine/a/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/a/c;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a/c;->d:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/engine/a/c;->e:J

    iput-object p1, p0, Lcom/qihoo/security/engine/a/c;->b:Landroid/content/Context;

    return-void
.end method

.method private a(Lorg/json/JSONObject;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string/jumbo v0, "version"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    iput-wide p2, p0, Lcom/qihoo/security/engine/a/c;->e:J

    invoke-direct {p0}, Lcom/qihoo/security/engine/a/c;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/qihoo/security/engine/a/c;->e:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/a/c;->d:Z

    :cond_0
    return-void
.end method

.method private c()J
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/a/c;->b:Landroid/content/Context;

    const-string/jumbo v1, "adblock_pref"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string/jumbo v1, "key_ad_data_ts"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method a(Ljava/lang/String;J)V
    .locals 6

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "head"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Lcom/qihoo/security/engine/a/c;->a(Lorg/json/JSONObject;J)V

    const-string/jumbo v1, "ads"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v0, v2, [Lcom/qihoo/security/engine/a/b;

    iput-object v0, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/security/engine/a/b;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/engine/a/b;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    aput-object v3, v4, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public a()[Lcom/qihoo/security/engine/a/b;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    return-object v0
.end method

.method b()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/a/c;->c:[Lcom/qihoo/security/engine/a/b;

    :cond_0
    return-void
.end method
