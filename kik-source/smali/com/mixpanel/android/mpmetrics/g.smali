.class final Lcom/mixpanel/android/mpmetrics/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/mixpanel/android/mpmetrics/t;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/t;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/g;->b:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/g;->a:Lcom/mixpanel/android/mpmetrics/t;

    .line 39
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/g;->c:Ljava/util/List;

    .line 40
    return-void
.end method

.method private static a(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/g$a;
    .locals 9

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 86
    new-instance v2, Lcom/mixpanel/android/mpmetrics/g$a;

    invoke-direct {v2}, Lcom/mixpanel/android/mpmetrics/g$a;-><init>()V

    .line 89
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    const-string v0, "surveys"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    :try_start_1
    const-string v0, "surveys"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 104
    :goto_0
    if-eqz v4, :cond_1

    move v0, v1

    .line 105
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v0, v6, :cond_1

    .line 107
    :try_start_2
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 108
    new-instance v7, Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-direct {v7, v6}, Lcom/mixpanel/android/mpmetrics/Survey;-><init>(Lorg/json/JSONObject;)V

    .line 109
    iget-object v6, v2, Lcom/mixpanel/android/mpmetrics/g$a;->a:Ljava/util/List;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/mixpanel/android/mpmetrics/e; {:try_start_2 .. :try_end_2} :catch_3

    .line 105
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 90
    :catch_0
    move-exception v0

    .line 91
    const-string v1, "MixpanelAPI DecideChecker"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Mixpanel endpoint returned unparsable result:\n"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v2

    .line 144
    :goto_3
    return-object v0

    .line 100
    :catch_1
    move-exception v0

    const-string v0, "MixpanelAPI DecideChecker"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Mixpanel endpoint returned non-array JSON for surveys: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    move-object v4, v3

    goto :goto_0

    .line 111
    :catch_2
    move-exception v6

    const-string v6, "MixpanelAPI DecideChecker"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Received a strange response from surveys service: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 113
    :catch_3
    move-exception v6

    const-string v6, "MixpanelAPI DecideChecker"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Received a strange response from surveys service: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 119
    :cond_1
    const-string v0, "notifications"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    :try_start_3
    const-string v0, "notifications"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    move-result-object v0

    move-object v3, v0

    .line 127
    :cond_2
    :goto_4
    if-eqz v3, :cond_3

    .line 128
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v4, 0x2

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 129
    :goto_5
    if-eqz v3, :cond_3

    if-ge v1, v4, :cond_3

    .line 131
    :try_start_4
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 132
    new-instance v5, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-direct {v5, v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;-><init>(Lorg/json/JSONObject;)V

    .line 133
    iget-object v0, v2, Lcom/mixpanel/android/mpmetrics/g$a;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/mixpanel/android/mpmetrics/e; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_7

    .line 129
    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 123
    :catch_4
    move-exception v0

    const-string v0, "MixpanelAPI DecideChecker"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Mixpanel endpoint returned non-array JSON for notifications: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 134
    :catch_5
    move-exception v0

    .line 135
    const-string v5, "MixpanelAPI DecideChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Received a strange response from notifications service: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    .line 136
    :catch_6
    move-exception v0

    .line 137
    const-string v5, "MixpanelAPI DecideChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Received a strange response from notifications service: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    .line 138
    :catch_7
    move-exception v0

    .line 139
    const-string v5, "MixpanelAPI DecideChecker"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Not enough memory to show load notification from package: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    :cond_3
    move-object v0, v2

    .line 144
    goto/16 :goto_3
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 151
    :try_start_0
    const-string v0, "utf-8"

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 152
    const-string v1, "utf-8"

    invoke-static {p2, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 156
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "?version=1&lib=android&token="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "&distinct_id="

    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 162
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/g;->a:Lcom/mixpanel/android/mpmetrics/t;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/t;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/g;->a:Lcom/mixpanel/android/mpmetrics/t;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/t;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v5

    .line 164
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_0

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Querying decide server at "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v2, v1, v4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "    (with fallback "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v2, v1, v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/g;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/mixpanel/android/mpmetrics/ae;->a(Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v1

    .line 170
    if-nez v1, :cond_1

    .line 171
    const/4 v0, 0x0

    .line 174
    :goto_0
    return-object v0

    .line 153
    :catch_0
    move-exception v0

    .line 154
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Mixpanel library requires utf-8 string encoding to be available"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 174
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 175
    :catch_1
    move-exception v0

    .line 176
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "UTF not supported on this platform?"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 47
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 48
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 49
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/h;

    .line 50
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/mixpanel/android/mpmetrics/g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-boolean v1, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    new-instance v1, Lcom/mixpanel/android/mpmetrics/g$a;

    invoke-direct {v1}, Lcom/mixpanel/android/mpmetrics/g$a;-><init>()V

    if-eqz v2, :cond_7

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/g;->a(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/g$a;

    move-result-object v1

    move-object v3, v1

    :goto_1
    iget-object v1, v3, Lcom/mixpanel/android/mpmetrics/g$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    iget-object v8, p0, Lcom/mixpanel/android/mpmetrics/g;->b:Landroid/content/Context;

    const/4 v5, 0x0

    new-array v4, v12, [Ljava/lang/String;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v11

    const-string v2, "window"

    invoke-virtual {v8, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0xd

    if-ge v9, v10, :cond_1

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v2

    :goto_3
    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->c()Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    move-result-object v9

    sget-object v10, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->c:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    if-ne v9, v10, :cond_6

    const/16 v9, 0x2d0

    if-lt v2, v9, :cond_6

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->g()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v11

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->f()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v12

    :goto_4
    invoke-static {v8, v2}, Lcom/mixpanel/android/mpmetrics/ae;->a(Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v4

    if-eqz v4, :cond_2

    array-length v2, v4

    invoke-static {v4, v11, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_5
    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Could not retrieve image for notification "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->b()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", will not show the notification."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_1
    new-instance v9, Landroid/graphics/Point;

    invoke-direct {v9}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v2, v9}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v2, v9, Landroid/graphics/Point;->x:I

    goto :goto_3

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "Failed to download images from "

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v5

    goto :goto_5

    :cond_3
    invoke-virtual {v1, v2}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_2

    .line 54
    :cond_4
    iget-object v1, v3, Lcom/mixpanel/android/mpmetrics/g$a;->a:Ljava/util/List;

    iget-object v2, v3, Lcom/mixpanel/android/mpmetrics/g$a;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/h;->a(Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_0

    .line 57
    :cond_5
    return-void

    :cond_6
    move-object v2, v4

    goto :goto_4

    :cond_7
    move-object v3, v1

    goto/16 :goto_1
.end method

.method public final a(Lcom/mixpanel/android/mpmetrics/h;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/g;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    return-void
.end method
