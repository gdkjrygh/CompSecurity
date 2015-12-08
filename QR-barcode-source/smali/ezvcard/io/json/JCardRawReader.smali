.class public Lezvcard/io/json/JCardRawReader;
.super Ljava/lang/Object;
.source "JCardRawReader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/json/JCardRawReader$1;,
        Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;
    }
.end annotation


# instance fields
.field private eof:Z

.field private jp:Lcom/fasterxml/jackson/core/JsonParser;

.field private listener:Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;

.field private final reader:Ljava/io/Reader;


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/json/JCardRawReader;->eof:Z

    .line 62
    iput-object p1, p0, Lezvcard/io/json/JCardRawReader;->reader:Ljava/io/Reader;

    .line 63
    return-void
.end method

.method private parseParameters()Lezvcard/parameter/VCardParameters;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 155
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_0

    .line 156
    new-instance v2, Lezvcard/io/json/JCardParseException;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v4, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v2

    .line 159
    :cond_0
    new-instance v1, Lezvcard/parameter/VCardParameters;

    invoke-direct {v1}, Lezvcard/parameter/VCardParameters;-><init>()V

    .line 160
    .local v1, "parameters":Lezvcard/parameter/VCardParameters;
    :cond_1
    :goto_0
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_3

    .line 161
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 163
    .local v0, "parameterName":Ljava/lang/String;
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v3, :cond_2

    .line 165
    :goto_1
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_1

    .line 166
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 169
    :cond_2
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 173
    .end local v0    # "parameterName":Ljava/lang/String;
    :cond_3
    return-object v1
.end method

.method private parseProperties()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 112
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_1

    .line 113
    new-instance v0, Lezvcard/io/json/JCardParseException;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v0

    .line 121
    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseProperty()V

    .line 117
    :cond_1
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_2

    .line 118
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_0

    .line 119
    new-instance v0, Lezvcard/io/json/JCardParseException;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v0

    .line 124
    :cond_2
    return-void
.end method

.method private parseProperty()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    .line 128
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v10, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v10, :cond_0

    .line 129
    new-instance v0, Lezvcard/io/json/JCardParseException;

    sget-object v9, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v10, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v10}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v10

    invoke-direct {v0, v9, v10}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v0

    .line 131
    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 134
    .local v2, "propertyName":Ljava/lang/String;
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v3

    .line 137
    .local v3, "parameters":Lezvcard/parameter/VCardParameters;
    const-string v0, "group"

    invoke-virtual {v3, v0}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 138
    .local v7, "removed":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v1, v9

    .line 141
    .local v1, "group":Ljava/lang/String;
    :goto_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v10, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v10, :cond_2

    .line 142
    new-instance v0, Lezvcard/io/json/JCardParseException;

    sget-object v9, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v10, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v10}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v10

    invoke-direct {v0, v9, v10}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v0

    .line 138
    .end local v1    # "group":Ljava/lang/String;
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    goto :goto_0

    .line 144
    .restart local v1    # "group":Ljava/lang/String;
    :cond_2
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 145
    .local v6, "dataTypeStr":Ljava/lang/String;
    const-string v0, "unknown"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v4, v9

    .line 148
    .local v4, "dataType":Lezvcard/VCardDataType;
    :goto_1
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValues()Ljava/util/List;

    move-result-object v8

    .line 150
    .local v8, "values":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    new-instance v5, Lezvcard/io/json/JCardValue;

    invoke-direct {v5, v8}, Lezvcard/io/json/JCardValue;-><init>(Ljava/util/List;)V

    .line 151
    .local v5, "value":Lezvcard/io/json/JCardValue;
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->listener:Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;

    invoke-interface/range {v0 .. v5}, Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;->readProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V

    .line 152
    return-void

    .line 145
    .end local v4    # "dataType":Lezvcard/VCardDataType;
    .end local v5    # "value":Lezvcard/io/json/JCardValue;
    .end local v8    # "values":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    :cond_3
    invoke-static {v6}, Lezvcard/VCardDataType;->get(Ljava/lang/String;)Lezvcard/VCardDataType;

    move-result-object v4

    goto :goto_1
.end method

.method private parseValue()Lezvcard/io/json/JsonValue;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 233
    sget-object v0, Lezvcard/io/json/JCardRawReader$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    iget-object v1, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 239
    new-instance v0, Lezvcard/io/json/JsonValue;

    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValueElement()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/io/json/JsonValue;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    .line 235
    :pswitch_0
    new-instance v0, Lezvcard/io/json/JsonValue;

    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValueArray()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/io/json/JsonValue;-><init>(Ljava/util/List;)V

    goto :goto_0

    .line 237
    :pswitch_1
    new-instance v0, Lezvcard/io/json/JsonValue;

    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValueObject()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/io/json/JsonValue;-><init>(Ljava/util/Map;)V

    goto :goto_0

    .line 233
    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private parseValueArray()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .local v0, "array":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    :goto_0
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_0

    .line 205
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValue()Lezvcard/io/json/JsonValue;

    move-result-object v1

    .line 206
    .local v1, "value":Lezvcard/io/json/JsonValue;
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 209
    .end local v1    # "value":Lezvcard/io/json/JsonValue;
    :cond_0
    return-object v0
.end method

.method private parseValueElement()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 186
    sget-object v0, Lezvcard/io/json/JCardRawReader$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    iget-object v1, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 197
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 189
    :pswitch_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getBooleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 191
    :pswitch_1
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getDoubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    .line 193
    :pswitch_2
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getLongValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 195
    :pswitch_3
    const/4 v0, 0x0

    goto :goto_0

    .line 186
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private parseValueObject()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 213
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 215
    .local v1, "object":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lezvcard/io/json/JsonValue;>;"
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 216
    :goto_0
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v3, v4, :cond_1

    .line 217
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v3, v4, :cond_0

    .line 218
    new-instance v3, Lezvcard/io/json/JCardParseException;

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iget-object v5, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lezvcard/io/json/JCardParseException;-><init>(Lcom/fasterxml/jackson/core/JsonToken;Lcom/fasterxml/jackson/core/JsonToken;)V

    throw v3

    .line 221
    :cond_0
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 222
    .local v0, "key":Ljava/lang/String;
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 223
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValue()Lezvcard/io/json/JsonValue;

    move-result-object v2

    .line 224
    .local v2, "value":Lezvcard/io/json/JsonValue;
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 229
    .end local v0    # "key":Ljava/lang/String;
    .end local v2    # "value":Lezvcard/io/json/JsonValue;
    :cond_1
    return-object v1
.end method

.method private parseValues()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 177
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .local v1, "values":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    :goto_0
    iget-object v2, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_0

    .line 179
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseValue()Lezvcard/io/json/JsonValue;

    move-result-object v0

    .line 180
    .local v0, "value":Lezvcard/io/json/JsonValue;
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 182
    .end local v0    # "value":Lezvcard/io/json/JsonValue;
    :cond_0
    return-object v1
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 276
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->reader:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 277
    return-void
.end method

.method public eof()Z
    .locals 1

    .prologue
    .line 248
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawReader;->eof:Z

    return v0
.end method

.method public getLineNum()I
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentLocation()Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonLocation;->getLineNr()I

    move-result v0

    goto :goto_0
.end method

.method public readNext(Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;)V
    .locals 5
    .param p1, "listener"    # Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 82
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    if-nez v3, :cond_2

    .line 83
    new-instance v1, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v1}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    .line 84
    .local v1, "factory":Lcom/fasterxml/jackson/core/JsonFactory;
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->reader:Ljava/io/Reader;

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/Reader;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v3

    iput-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    .line 89
    .end local v1    # "factory":Lcom/fasterxml/jackson/core/JsonFactory;
    :cond_0
    iput-object p1, p0, Lezvcard/io/json/JCardRawReader;->listener:Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;

    .line 92
    const/4 v2, 0x0

    .line 94
    .local v2, "prev":Lcom/fasterxml/jackson/core/JsonToken;
    :goto_0
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .local v0, "cur":Lcom/fasterxml/jackson/core/JsonToken;
    if-eqz v0, :cond_1

    .line 95
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v3, :cond_3

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v3, :cond_3

    const-string v3, "vcard"

    iget-object v4, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 100
    :cond_1
    if-nez v0, :cond_4

    .line 102
    const/4 v3, 0x1

    iput-boolean v3, p0, Lezvcard/io/json/JCardRawReader;->eof:Z

    .line 108
    .end local v0    # "cur":Lcom/fasterxml/jackson/core/JsonToken;
    .end local v2    # "prev":Lcom/fasterxml/jackson/core/JsonToken;
    :goto_1
    return-void

    .line 85
    :cond_2
    iget-object v3, p0, Lezvcard/io/json/JCardRawReader;->jp:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->isClosed()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 98
    .restart local v0    # "cur":Lcom/fasterxml/jackson/core/JsonToken;
    .restart local v2    # "prev":Lcom/fasterxml/jackson/core/JsonToken;
    :cond_3
    move-object v2, v0

    goto :goto_0

    .line 106
    :cond_4
    invoke-interface {p1}, Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;->beginVCard()V

    .line 107
    invoke-direct {p0}, Lezvcard/io/json/JCardRawReader;->parseProperties()V

    goto :goto_1
.end method
