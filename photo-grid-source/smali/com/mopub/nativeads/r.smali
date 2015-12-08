.class final Lcom/mopub/nativeads/r;
.super Lcom/mopub/nativeads/a;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;

.field private final c:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Landroid/content/Context;Lorg/json/JSONObject;Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/mopub/nativeads/a;-><init>()V

    .line 62
    iput-object p2, p0, Lcom/mopub/nativeads/r;->c:Lorg/json/JSONObject;

    .line 63
    iput-object p1, p0, Lcom/mopub/nativeads/r;->a:Landroid/content/Context;

    .line 64
    iput-object p3, p0, Lcom/mopub/nativeads/r;->b:Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/r;)Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/mopub/nativeads/r;->b:Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;

    return-object v0
.end method

.method private a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 155
    instance-of v0, p1, Lorg/json/JSONArray;

    if-nez v0, :cond_0

    .line 156
    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "Expected impression trackers of type JSONArray."

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_0
    check-cast p1, Lorg/json/JSONArray;

    .line 160
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 162
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/mopub/nativeads/r;->g(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 165
    :catch_0
    move-exception v1

    const-string v1, "Unable to parse impression trackers."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 168
    :cond_1
    return-void
.end method

.method private b()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getExtras()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getExtras()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 178
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2171
    if-eqz v1, :cond_1

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "image"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 178
    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 179
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2171
    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    .line 183
    :cond_2
    return-object v2
.end method


# virtual methods
.method final a()V
    .locals 6

    .prologue
    .line 68
    iget-object v0, p0, Lcom/mopub/nativeads/r;->c:Lorg/json/JSONObject;

    .line 1102
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1103
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 1104
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1108
    :cond_0
    sget-object v0, Lcom/mopub/nativeads/an;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "JSONObject did not contain required keys."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/r;->c:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 73
    :goto_1
    :pswitch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 75
    invoke-static {v1}, Lcom/mopub/nativeads/an;->a(Ljava/lang/String;)Lcom/mopub/nativeads/an;

    move-result-object v3

    .line 77
    if-eqz v3, :cond_3

    .line 79
    :try_start_0
    iget-object v0, p0, Lcom/mopub/nativeads/r;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 1114
    :try_start_1
    sget-object v4, Lcom/mopub/nativeads/q;->a:[I

    invoke-virtual {v3}, Lcom/mopub/nativeads/an;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 1142
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Unable to add JSON key to internal mapping: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 1145
    :catch_0
    move-exception v0

    .line 1146
    :try_start_2
    iget-boolean v4, v3, Lcom/mopub/nativeads/an;->b:Z

    if-nez v4, :cond_2

    .line 1147
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Ignoring class cast exception for optional key: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 81
    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "JSONObject key ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") contained unexpected value."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1116
    :pswitch_1
    :try_start_3
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 1119
    :pswitch_2
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 1122
    :pswitch_3
    invoke-direct {p0, v0}, Lcom/mopub/nativeads/r;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 1127
    :pswitch_4
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->c(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1130
    :pswitch_5
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1133
    :pswitch_6
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->e(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1136
    :pswitch_7
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->f(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1139
    :pswitch_8
    invoke-static {v0}, Lcom/mopub/common/util/Numbers;->parseDouble(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/r;->a(Ljava/lang/Double;)V
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_1

    .line 1149
    :cond_2
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_1

    .line 84
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/r;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/mopub/nativeads/r;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 88
    :cond_4
    iget-object v0, p0, Lcom/mopub/nativeads/r;->a:Landroid/content/Context;

    .line 1188
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1189
    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getMainImageUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 1190
    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getMainImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1192
    :cond_5
    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 1193
    invoke-virtual {p0}, Lcom/mopub/nativeads/r;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1196
    :cond_6
    invoke-direct {p0}, Lcom/mopub/nativeads/r;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 88
    new-instance v2, Lcom/mopub/nativeads/s;

    invoke-direct {v2, p0}, Lcom/mopub/nativeads/s;-><init>(Lcom/mopub/nativeads/r;)V

    invoke-static {v0, v1, v2}, Lcom/mopub/nativeads/r;->a(Landroid/content/Context;Ljava/util/List;Lcom/mopub/nativeads/CustomEventNative$ImageListener;)V

    .line 99
    return-void

    .line 1114
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
