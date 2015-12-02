.class public Lcom/facebook/common/w/e;
.super Ljava/lang/Object;
.source "JSONUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;D)D
    .locals 1

    .prologue
    .line 99
    if-nez p0, :cond_1

    .line 114
    :cond_0
    :goto_0
    return-wide p1

    .line 102
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    :try_start_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p1

    goto :goto_0

    .line 111
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->doubleValue()D

    move-result-wide p1

    goto :goto_0

    .line 108
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;F)F
    .locals 1

    .prologue
    .line 123
    if-nez p0, :cond_1

    .line 138
    :cond_0
    :goto_0
    return p1

    .line 126
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 131
    :try_start_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p1

    goto :goto_0

    .line 135
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->numberValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result p1

    goto :goto_0

    .line 132
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;I)I
    .locals 1

    .prologue
    .line 75
    if-nez p0, :cond_1

    .line 90
    :cond_0
    :goto_0
    return p1

    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    :try_start_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p1

    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->intValue()I

    move-result p1

    goto :goto_0

    .line 84
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;J)J
    .locals 1

    .prologue
    .line 51
    if-nez p0, :cond_1

    .line 66
    :cond_0
    :goto_0
    return-wide p1

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    :try_start_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p1

    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->longValue()J

    move-result-wide p1

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 166
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 168
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 169
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 170
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 171
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 172
    instance-of v4, v1, Ljava/lang/String;

    if-eqz v4, :cond_1

    .line 173
    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 174
    :cond_1
    instance-of v4, v1, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    .line 175
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 176
    :cond_2
    instance-of v4, v1, Ljava/lang/Float;

    if-eqz v4, :cond_3

    .line 177
    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    goto :goto_0

    .line 178
    :cond_3
    instance-of v4, v1, Ljava/lang/Double;

    if-eqz v4, :cond_4

    .line 179
    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 180
    :cond_4
    instance-of v4, v1, Lorg/json/JSONArray;

    if-eqz v4, :cond_7

    .line 181
    check-cast v1, Lorg/json/JSONArray;

    .line 182
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-nez v4, :cond_5

    .line 183
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 184
    :cond_5
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Lorg/json/JSONObject;

    if-eqz v4, :cond_6

    .line 185
    invoke-static {v1}, Lcom/facebook/common/w/e;->a(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 186
    :cond_6
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 187
    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 189
    :cond_7
    instance-of v4, v1, Lorg/json/JSONObject;

    if-eqz v4, :cond_0

    .line 190
    check-cast v1, Lorg/json/JSONObject;

    invoke-static {v1}, Lcom/facebook/common/w/e;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto/16 :goto_0

    .line 193
    :cond_8
    return-object v2
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    if-nez p0, :cond_1

    .line 42
    :cond_0
    :goto_0
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->numberValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method public static a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .prologue
    .line 197
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 198
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 199
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 201
    :cond_0
    return-object v1
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;)Z
    .locals 1

    .prologue
    .line 23
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/fasterxml/jackson/databind/JsonNode;Z)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 147
    if-nez p0, :cond_1

    .line 161
    :cond_0
    :goto_0
    return p1

    .line 150
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v2

    if-nez v2, :cond_0

    .line 153
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isBoolean()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 154
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result p1

    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 156
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v2

    .line 157
    const-string v3, "on"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "1"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "true"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move v0, v1

    :cond_4
    move p1, v0

    goto :goto_0

    .line 158
    :cond_5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNumber()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 159
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->intValue()I

    move-result v2

    if-eqz v2, :cond_6

    :goto_1
    move p1, v1

    goto :goto_0

    :cond_6
    move v1, v0

    goto :goto_1
.end method

.method public static b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 205
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 206
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 207
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 209
    :cond_0
    return-object v1
.end method

.method public static c(Lcom/fasterxml/jackson/databind/JsonNode;)J
    .locals 2

    .prologue
    .line 47
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Lcom/fasterxml/jackson/databind/JsonNode;)I
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;I)I

    move-result v0

    return v0
.end method

.method public static e(Lcom/fasterxml/jackson/databind/JsonNode;)D
    .locals 2

    .prologue
    .line 95
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static f(Lcom/fasterxml/jackson/databind/JsonNode;)F
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;F)F

    move-result v0

    return v0
.end method

.method public static g(Lcom/fasterxml/jackson/databind/JsonNode;)Z
    .locals 1

    .prologue
    .line 143
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Z)Z

    move-result v0

    return v0
.end method
