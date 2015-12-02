.class public Lcom/qihoo360/mobilesafe/core/b/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo360/mobilesafe/core/b/a;


# instance fields
.field private b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/b/a;->a:Lcom/qihoo360/mobilesafe/core/b/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    .line 45
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/b/a;->b(Landroid/content/Context;)Z

    .line 46
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;
    .locals 3

    .prologue
    .line 38
    const-class v1, Lcom/qihoo360/mobilesafe/core/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/b/a;->a:Lcom/qihoo360/mobilesafe/core/b/a;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo360/mobilesafe/core/b/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo360/mobilesafe/core/b/a;->a:Lcom/qihoo360/mobilesafe/core/b/a;

    .line 41
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/b/a;->a:Lcom/qihoo360/mobilesafe/core/b/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 38
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Lorg/json/JSONObject;)Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;
    .locals 2

    .prologue
    .line 250
    :try_start_0
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;-><init>()V

    .line 251
    const-string/jumbo v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->setName(Ljava/lang/String;)V

    .line 252
    const-string/jumbo v1, "category"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/qihoo360/mobilesafe/core/b/a;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->setCategory(I)V

    .line 253
    const-string/jumbo v1, "flag"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/qihoo360/mobilesafe/core/b/a;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->setFlag(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    :goto_0
    return-object v0

    .line 255
    :catch_0
    move-exception v0

    .line 256
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 236
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 237
    :cond_0
    const/4 v0, 0x0

    .line 245
    :cond_1
    return-object v0

    .line 239
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 240
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 241
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 242
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 243
    invoke-direct {p0, v3}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONObject;)Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private a(Ljava/io/InputStream;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 270
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 272
    const/16 v1, 0x400

    :try_start_0
    new-array v1, v1, [B

    .line 274
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 277
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 275
    :cond_0
    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 278
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private b(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 261
    const/4 v0, 0x0

    .line 263
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 266
    :goto_0
    return v0

    .line 264
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public a(ILjava/lang/String;)I
    .locals 4

    .prologue
    .line 139
    const/4 v1, 0x0

    .line 140
    const/4 v0, 0x0

    .line 142
    packed-switch p1, :pswitch_data_0

    .line 164
    :goto_0
    if-eqz v0, :cond_1

    .line 165
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    move v0, v1

    .line 174
    :goto_1
    return v0

    .line 144
    :pswitch_0
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->b()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 148
    :pswitch_1
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 152
    :pswitch_2
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->c()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 156
    :pswitch_3
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->d()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 165
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;

    .line 166
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getName()Ljava/lang/String;

    move-result-object v3

    .line 167
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 168
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getFlag()I

    move-result v0

    goto :goto_1

    .line 142
    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v4, 0x4

    .line 109
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->b()Ljava/util/List;

    move-result-object v0

    .line 110
    const/4 v1, 0x0

    .line 111
    if-eqz v0, :cond_1

    .line 112
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 119
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 120
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->a()Ljava/util/List;

    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_3
    move v0, v1

    .line 130
    :goto_1
    return v0

    .line 112
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;

    .line 113
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getFlag()I

    move-result v3

    if-ne v3, v4, :cond_0

    .line 114
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getCategory()I

    move-result v1

    goto :goto_0

    .line 122
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;

    .line 123
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getFlag()I

    move-result v3

    if-ne v3, v4, :cond_2

    .line 124
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->getCategory()I

    move-result v0

    goto :goto_1
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->getProcess_()Ljava/util/List;

    move-result-object v0

    .line 56
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 60
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->getPackage_()Ljava/util/List;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 181
    const-string/jumbo v1, "o_c_spb.dat"

    invoke-static {p1, v1}, Lcom/qihoo360/common/utils/Utils;->openLatestInputFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 182
    if-eqz v1, :cond_0

    .line 185
    sget-object v2, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/qihoo360/common/utils/Utils;->getDESDecryptInputStream(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 189
    :try_start_0
    invoke-direct {p0, v1}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Ljava/io/InputStream;)[B

    move-result-object v2

    .line 190
    new-instance v3, Ljava/lang/String;

    const-string/jumbo v4, "UTF-8"

    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 191
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 202
    new-instance v3, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    invoke-direct {v3}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;-><init>()V

    iput-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    .line 203
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    const-string/jumbo v4, "system_"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->setSystem_(Ljava/util/List;)V

    .line 204
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    const-string/jumbo v4, "process_"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->setProcess_(Ljava/util/List;)V

    .line 205
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    const-string/jumbo v4, "sharedUserId_"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->setSharedUserId_(Ljava/util/List;)V

    .line 206
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    const-string/jumbo v4, "super_"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->setSuper_(Ljava/util/List;)V

    .line 207
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    const-string/jumbo v4, "package_"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->setPackage_(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 220
    if-eqz v1, :cond_0

    .line 221
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 232
    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 223
    :catch_0
    move-exception v1

    goto :goto_0

    .line 213
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 67
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->getSuper_()Ljava/util/List;

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/a;->b:Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->getSharedUserId_()Ljava/util/List;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
