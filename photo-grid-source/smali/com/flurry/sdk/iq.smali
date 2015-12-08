.class public Lcom/flurry/sdk/iq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/kx",
        "<",
        "Lcom/flurry/sdk/hq;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/flurry/sdk/iq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/iq;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/flurry/sdk/in;
    .locals 2

    .prologue
    .line 267
    sget-object v1, Lcom/flurry/sdk/in;->a:Lcom/flurry/sdk/in;

    .line 269
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    const-class v0, Lcom/flurry/sdk/in;

    invoke-static {v0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/in;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/flurry/sdk/hn;Lorg/json/JSONArray;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 207
    if-eqz p2, :cond_7

    .line 208
    const/4 v0, 0x0

    move v4, v2

    .line 210
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v4, v1, :cond_6

    .line 211
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 213
    if-eqz v1, :cond_1

    .line 215
    const-string v3, "string"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 217
    if-nez v0, :cond_0

    .line 218
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 221
    :cond_0
    new-instance v3, Lcom/flurry/sdk/ht;

    invoke-direct {v3}, Lcom/flurry/sdk/ht;-><init>()V

    .line 222
    const-string v5, "string"

    const-string v6, ""

    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lcom/flurry/sdk/ht;->a:Ljava/lang/String;

    .line 223
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_1
    :goto_1
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_0

    .line 227
    :cond_2
    const-string v3, "com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 229
    if-nez v0, :cond_3

    .line 230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 233
    :cond_3
    const-string v3, "com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 235
    if-eqz v1, :cond_1

    .line 236
    new-instance v5, Lcom/flurry/sdk/hu;

    invoke-direct {v5}, Lcom/flurry/sdk/hu;-><init>()V

    .line 237
    const-string v3, "event_name"

    const-string v6, ""

    invoke-virtual {v1, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v5, Lcom/flurry/sdk/hu;->a:Ljava/lang/String;

    .line 238
    const-string v3, "event_parameter_name"

    const-string v6, ""

    invoke-virtual {v1, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v5, Lcom/flurry/sdk/hu;->c:Ljava/lang/String;

    .line 240
    const-string v3, "event_parameter_values"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 242
    if-eqz v6, :cond_5

    .line 243
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v3, v1, [Ljava/lang/String;

    move v1, v2

    .line 245
    :goto_2
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v1, v7, :cond_4

    .line 247
    const-string v7, ""

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v1

    .line 245
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    move-object v1, v3

    .line 254
    :goto_3
    iput-object v1, v5, Lcom/flurry/sdk/hu;->d:[Ljava/lang/String;

    .line 256
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 251
    :cond_5
    new-array v1, v2, [Ljava/lang/String;

    goto :goto_3

    .line 261
    :cond_6
    iput-object v0, p1, Lcom/flurry/sdk/hn;->c:Ljava/util/List;

    .line 263
    :cond_7
    return-void
.end method

.method private a(Lcom/flurry/sdk/ho;Lorg/json/JSONArray;)V
    .locals 9

    .prologue
    const/16 v8, 0x14

    .line 160
    if-eqz p2, :cond_4

    .line 161
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 163
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 164
    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 166
    if-eqz v2, :cond_2

    .line 167
    new-instance v3, Lcom/flurry/sdk/hn;

    invoke-direct {v3}, Lcom/flurry/sdk/hn;-><init>()V

    .line 168
    const-string v4, "partner"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/flurry/sdk/hn;->b:Ljava/lang/String;

    .line 170
    const-string v4, "events"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 171
    invoke-direct {p0, v3, v4}, Lcom/flurry/sdk/iq;->a(Lcom/flurry/sdk/hn;Lorg/json/JSONArray;)V

    .line 173
    const-string v4, "method"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/flurry/sdk/iq;->a(Ljava/lang/String;)Lcom/flurry/sdk/in;

    move-result-object v4

    iput-object v4, v3, Lcom/flurry/sdk/hn;->d:Lcom/flurry/sdk/in;

    .line 174
    const-string v4, "uri_template"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/flurry/sdk/hn;->e:Ljava/lang/String;

    .line 176
    const-string v4, "body_template"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 177
    if-eqz v4, :cond_0

    .line 178
    const-string v5, "string"

    const-string v6, "null"

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 179
    const-string v5, "null"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 180
    iput-object v4, v3, Lcom/flurry/sdk/hn;->f:Ljava/lang/String;

    .line 184
    :cond_0
    const-string v4, "max_redirects"

    const/4 v5, 0x5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lcom/flurry/sdk/hn;->g:I

    .line 185
    const-string v4, "connect_timeout"

    invoke-virtual {v2, v4, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lcom/flurry/sdk/hn;->h:I

    .line 186
    const-string v4, "request_timeout"

    invoke-virtual {v2, v4, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lcom/flurry/sdk/hn;->i:I

    .line 187
    const-string v4, "callback_id"

    const-wide/16 v6, -0x1

    invoke-virtual {v2, v4, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, v3, Lcom/flurry/sdk/hn;->a:J

    .line 189
    const-string v4, "headers"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 190
    if-eqz v2, :cond_1

    .line 191
    const-string v4, "map"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 192
    if-eqz v2, :cond_1

    .line 193
    invoke-static {v2}, Lcom/flurry/sdk/lq;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    .line 194
    iput-object v2, v3, Lcom/flurry/sdk/hn;->j:Ljava/util/Map;

    .line 198
    :cond_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 201
    :cond_3
    iput-object v1, p1, Lcom/flurry/sdk/ho;->a:Ljava/util/List;

    .line 203
    :cond_4
    return-void
.end method

.method private a(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V
    .locals 3

    .prologue
    .line 123
    const-string v0, "global_settings"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 125
    new-instance v1, Lcom/flurry/sdk/hx;

    invoke-direct {v1}, Lcom/flurry/sdk/hx;-><init>()V

    iput-object v1, p1, Lcom/flurry/sdk/hq;->d:Lcom/flurry/sdk/hx;

    .line 126
    if-eqz v0, :cond_0

    .line 127
    iget-object v1, p1, Lcom/flurry/sdk/hq;->d:Lcom/flurry/sdk/hx;

    const-string v2, "log_level"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/flurry/sdk/iq;->b(Ljava/lang/String;)Lcom/flurry/sdk/hy;

    move-result-object v0

    iput-object v0, v1, Lcom/flurry/sdk/hx;->a:Lcom/flurry/sdk/hy;

    .line 129
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Lcom/flurry/sdk/hy;
    .locals 2

    .prologue
    .line 279
    sget-object v1, Lcom/flurry/sdk/hy;->f:Lcom/flurry/sdk/hy;

    .line 281
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    const-class v0, Lcom/flurry/sdk/hy;

    invoke-static {v0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private b(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    .line 132
    const-string v0, "pulse"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 134
    new-instance v1, Lcom/flurry/sdk/ho;

    invoke-direct {v1}, Lcom/flurry/sdk/ho;-><init>()V

    .line 136
    if-eqz v0, :cond_0

    .line 137
    const-string v2, "callbacks"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 138
    invoke-direct {p0, v1, v2}, Lcom/flurry/sdk/iq;->a(Lcom/flurry/sdk/ho;Lorg/json/JSONArray;)V

    .line 140
    const-string v2, "max_callback_retries"

    const/4 v3, 0x3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, v1, Lcom/flurry/sdk/ho;->b:I

    .line 141
    const-string v2, "max_callback_attempts_per_report"

    const/16 v3, 0xf

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, v1, Lcom/flurry/sdk/ho;->c:I

    .line 142
    const-string v2, "max_report_delay_seconds"

    const/16 v3, 0x258

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, v1, Lcom/flurry/sdk/ho;->d:I

    .line 143
    const-string v2, "agent_report_url"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/flurry/sdk/ho;->e:Ljava/lang/String;

    .line 146
    :cond_0
    iput-object v1, p1, Lcom/flurry/sdk/hq;->e:Lcom/flurry/sdk/ho;

    .line 147
    return-void
.end method

.method private c(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    .line 150
    const-string v0, "analytics"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 152
    new-instance v1, Lcom/flurry/sdk/ia;

    invoke-direct {v1}, Lcom/flurry/sdk/ia;-><init>()V

    iput-object v1, p1, Lcom/flurry/sdk/hq;->f:Lcom/flurry/sdk/ia;

    .line 153
    if-eqz v0, :cond_0

    .line 154
    iget-object v1, p1, Lcom/flurry/sdk/hq;->f:Lcom/flurry/sdk/ia;

    const-string v2, "analytics_enabled"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v1, Lcom/flurry/sdk/ia;->b:Z

    .line 155
    iget-object v1, p1, Lcom/flurry/sdk/hq;->f:Lcom/flurry/sdk/ia;

    const-string v2, "max_session_properties"

    const/16 v3, 0xa

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v1, Lcom/flurry/sdk/ia;->a:I

    .line 157
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lcom/flurry/sdk/hq;
    .locals 6

    .prologue
    .line 97
    if-nez p1, :cond_0

    .line 98
    const/4 v0, 0x0

    .line 119
    :goto_0
    return-object v0

    .line 101
    :cond_0
    invoke-static {p1}, Lcom/flurry/sdk/lp;->a(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 102
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 104
    const/4 v0, 0x5

    sget-object v2, Lcom/flurry/sdk/iq;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Proton response string: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    new-instance v0, Lcom/flurry/sdk/hq;

    invoke-direct {v0}, Lcom/flurry/sdk/hq;-><init>()V

    .line 108
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 109
    const-string v1, "issued_at"

    const-wide/16 v4, -0x1

    invoke-virtual {v2, v1, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/flurry/sdk/hq;->a:J

    .line 110
    const-string v1, "refresh_ttl"

    const-wide/16 v4, 0xe10

    invoke-virtual {v2, v1, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/flurry/sdk/hq;->b:J

    .line 111
    const-string v1, "expiration_ttl"

    const-wide/32 v4, 0x15180

    invoke-virtual {v2, v1, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/flurry/sdk/hq;->c:J

    .line 113
    invoke-direct {p0, v0, v2}, Lcom/flurry/sdk/iq;->a(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V

    .line 114
    invoke-direct {p0, v0, v2}, Lcom/flurry/sdk/iq;->b(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V

    .line 115
    invoke-direct {p0, v0, v2}, Lcom/flurry/sdk/iq;->c(Lcom/flurry/sdk/hq;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 116
    :catch_0
    move-exception v0

    .line 117
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Exception while deserialize: "

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Ljava/io/OutputStream;Lcom/flurry/sdk/hq;)V
    .locals 2

    .prologue
    .line 92
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Serialize not supported for response"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic a(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 33
    check-cast p2, Lcom/flurry/sdk/hq;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/iq;->a(Ljava/io/OutputStream;Lcom/flurry/sdk/hq;)V

    return-void
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/iq;->a(Ljava/io/InputStream;)Lcom/flurry/sdk/hq;

    move-result-object v0

    return-object v0
.end method
