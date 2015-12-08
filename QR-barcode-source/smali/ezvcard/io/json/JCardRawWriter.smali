.class public Lezvcard/io/json/JCardRawWriter;
.super Ljava/lang/Object;
.source "JCardRawWriter.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field private indent:Z

.field private jg:Lcom/fasterxml/jackson/core/JsonGenerator;

.field private open:Z

.field private final wrapInArray:Z

.field private final writer:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/Writer;Z)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "wrapInArray"    # Z

    .prologue
    const/4 v0, 0x0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->indent:Z

    .line 56
    iput-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    .line 65
    iput-object p1, p0, Lezvcard/io/json/JCardRawWriter;->writer:Ljava/io/Writer;

    .line 66
    iput-boolean p2, p0, Lezvcard/io/json/JCardRawWriter;->wrapInArray:Z

    .line 67
    return-void
.end method

.method private indent(I)V
    .locals 3
    .param p1, "spaces"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 258
    iget-boolean v1, p0, Lezvcard/io/json/JCardRawWriter;->indent:Z

    if-nez v1, :cond_1

    .line 266
    :cond_0
    return-void

    .line 262
    :cond_1
    iget-object v1, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    sget-object v2, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(Ljava/lang/String;)V

    .line 263
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p1, :cond_0

    .line 264
    iget-object v1, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(C)V

    .line 263
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private init()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 316
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    .line 317
    .local v0, "factory":Lcom/fasterxml/jackson/core/JsonFactory;
    sget-object v1, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->AUTO_CLOSE_TARGET:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/core/JsonFactory;->configure(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;Z)Lcom/fasterxml/jackson/core/JsonFactory;

    .line 318
    iget-object v1, p0, Lezvcard/io/json/JCardRawWriter;->writer:Ljava/io/Writer;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 320
    iget-boolean v1, p0, Lezvcard/io/json/JCardRawWriter;->wrapInArray:Z

    if-eqz v1, :cond_0

    .line 321
    iget-object v1, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 322
    invoke-direct {p0, v2}, Lezvcard/io/json/JCardRawWriter;->indent(I)V

    .line 324
    :cond_0
    return-void
.end method

.method private writeValue(Lezvcard/io/json/JsonValue;)V
    .locals 10
    .param p1, "jsonValue"    # Lezvcard/io/json/JsonValue;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 202
    invoke-virtual {p1}, Lezvcard/io/json/JsonValue;->isNull()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 203
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 207
    :cond_1
    invoke-virtual {p1}, Lezvcard/io/json/JsonValue;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 208
    .local v5, "val":Ljava/lang/Object;
    if-eqz v5, :cond_9

    .line 209
    instance-of v6, v5, Ljava/lang/Byte;

    if-eqz v6, :cond_2

    .line 210
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Byte;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Byte;->byteValue()B

    move-result v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    goto :goto_0

    .line 211
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_2
    instance-of v6, v5, Ljava/lang/Short;

    if-eqz v6, :cond_3

    .line 212
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Short;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Short;->shortValue()S

    move-result v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    goto :goto_0

    .line 213
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_3
    instance-of v6, v5, Ljava/lang/Integer;

    if-eqz v6, :cond_4

    .line 214
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Integer;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    goto :goto_0

    .line 215
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_4
    instance-of v6, v5, Ljava/lang/Long;

    if-eqz v6, :cond_5

    .line 216
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Long;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(J)V

    goto :goto_0

    .line 217
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_5
    instance-of v6, v5, Ljava/lang/Float;

    if-eqz v6, :cond_6

    .line 218
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Float;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(F)V

    goto :goto_0

    .line 219
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_6
    instance-of v6, v5, Ljava/lang/Double;

    if-eqz v6, :cond_7

    .line 220
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Double;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(D)V

    goto :goto_0

    .line 221
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_7
    instance-of v6, v5, Ljava/lang/Boolean;

    if-eqz v6, :cond_8

    .line 222
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast v5, Ljava/lang/Boolean;

    .end local v5    # "val":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBoolean(Z)V

    goto :goto_0

    .line 224
    .restart local v5    # "val":Ljava/lang/Object;
    :cond_8
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 229
    :cond_9
    invoke-virtual {p1}, Lezvcard/io/json/JsonValue;->getArray()Ljava/util/List;

    move-result-object v0

    .line 230
    .local v0, "array":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    if-eqz v0, :cond_b

    .line 231
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 232
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/io/json/JsonValue;

    .line 233
    .local v1, "element":Lezvcard/io/json/JsonValue;
    invoke-direct {p0, v1}, Lezvcard/io/json/JCardRawWriter;->writeValue(Lezvcard/io/json/JsonValue;)V

    goto :goto_1

    .line 235
    .end local v1    # "element":Lezvcard/io/json/JsonValue;
    :cond_a
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto/16 :goto_0

    .line 239
    .end local v3    # "i$":Ljava/util/Iterator;
    :cond_b
    invoke-virtual {p1}, Lezvcard/io/json/JsonValue;->getObject()Ljava/util/Map;

    move-result-object v4

    .line 240
    .local v4, "object":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lezvcard/io/json/JsonValue;>;"
    if-eqz v4, :cond_0

    .line 241
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 242
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .restart local v3    # "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 243
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lezvcard/io/json/JsonValue;>;"
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 244
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lezvcard/io/json/JsonValue;

    invoke-direct {p0, v6}, Lezvcard/io/json/JCardRawWriter;->writeValue(Lezvcard/io/json/JsonValue;)V

    goto :goto_2

    .line 246
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lezvcard/io/json/JsonValue;>;"
    :cond_c
    iget-object v6, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto/16 :goto_0
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
    .line 307
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    if-nez v0, :cond_0

    .line 313
    :goto_0
    return-void

    .line 311
    :cond_0
    invoke-virtual {p0}, Lezvcard/io/json/JCardRawWriter;->closeJsonStream()V

    .line 312
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->writer:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    goto :goto_0
.end method

.method public closeJsonStream()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 285
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    if-nez v0, :cond_0

    .line 299
    :goto_0
    return-void

    .line 289
    :cond_0
    :goto_1
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    if-eqz v0, :cond_1

    .line 290
    invoke-virtual {p0}, Lezvcard/io/json/JCardRawWriter;->writeEndVCard()V

    goto :goto_1

    .line 293
    :cond_1
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->wrapInArray:Z

    if-eqz v0, :cond_2

    .line 294
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardRawWriter;->indent(I)V

    .line 295
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 298
    :cond_2
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    goto :goto_0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 272
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    if-nez v0, :cond_0

    .line 277
    :goto_0
    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->flush()V

    goto :goto_0
.end method

.method public isIndent()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->indent:Z

    return v0
.end method

.method public setIndent(Z)V
    .locals 0
    .param p1, "indent"    # Z

    .prologue
    .line 83
    iput-boolean p1, p0, Lezvcard/io/json/JCardRawWriter;->indent:Z

    .line 84
    return-void
.end method

.method public writeEndVCard()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 114
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    if-nez v0, :cond_0

    .line 115
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call \"writeStartVCard\" first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 119
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    .line 122
    return-void
.end method

.method public writeProperty(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V
    .locals 6
    .param p1, "propertyName"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "value"    # Lezvcard/io/json/JCardValue;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 134
    const/4 v1, 0x0

    new-instance v3, Lezvcard/parameter/VCardParameters;

    invoke-direct {v3}, Lezvcard/parameter/VCardParameters;-><init>()V

    move-object v0, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lezvcard/io/json/JCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V

    .line 135
    return-void
.end method

.method public writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V
    .locals 9
    .param p1, "group"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p4, "dataType"    # Lezvcard/VCardDataType;
    .param p5, "value"    # Lezvcard/io/json/JCardValue;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 149
    iget-boolean v7, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    if-nez v7, :cond_0

    .line 150
    new-instance v7, Ljava/lang/IllegalStateException;

    const-string v8, "Call \"writeStartVCard\" first."

    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 153
    :cond_0
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 154
    const/4 v7, 0x2

    invoke-direct {p0, v7}, Lezvcard/io/json/JCardRawWriter;->indent(I)V

    .line 157
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 160
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 161
    invoke-virtual {p3}, Lezvcard/parameter/VCardParameters;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 162
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 163
    .local v4, "name":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 164
    .local v6, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 168
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_2

    .line 169
    iget-object v8, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v8, v4, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 171
    :cond_2
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7, v4}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 172
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 173
    .local v5, "paramValue":Ljava/lang/String;
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7, v5}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 175
    .end local v5    # "paramValue":Ljava/lang/String;
    :cond_3
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_0

    .line 180
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v4    # "name":Ljava/lang/String;
    .end local v6    # "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_4
    if-eqz p1, :cond_5

    .line 181
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string v8, "group"

    invoke-virtual {v7, v8, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :cond_5
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 187
    iget-object v8, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    if-nez p4, :cond_7

    const-string v7, "unknown"

    :goto_2
    invoke-virtual {v8, v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 190
    invoke-virtual {p5}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 191
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string v8, ""

    invoke-virtual {v7, v8}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 198
    :cond_6
    iget-object v7, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 199
    return-void

    .line 187
    :cond_7
    invoke-virtual {p4}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 193
    :cond_8
    invoke-virtual {p5}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lezvcard/io/json/JsonValue;

    .line 194
    .local v3, "jsonValue":Lezvcard/io/json/JsonValue;
    invoke-direct {p0, v3}, Lezvcard/io/json/JCardRawWriter;->writeValue(Lezvcard/io/json/JsonValue;)V

    goto :goto_3
.end method

.method public writeStartVCard()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 91
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    if-nez v0, :cond_0

    .line 92
    invoke-direct {p0}, Lezvcard/io/json/JCardRawWriter;->init()V

    .line 95
    :cond_0
    iget-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    if-eqz v0, :cond_1

    .line 96
    invoke-virtual {p0}, Lezvcard/io/json/JCardRawWriter;->writeEndVCard()V

    .line 99
    :cond_1
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 100
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardRawWriter;->indent(I)V

    .line 101
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string v1, "vcard"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lezvcard/io/json/JCardRawWriter;->jg:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Lezvcard/io/json/JCardRawWriter;->open:Z

    .line 105
    return-void
.end method
