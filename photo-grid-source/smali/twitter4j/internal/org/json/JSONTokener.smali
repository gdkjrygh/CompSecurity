.class public Ltwitter4j/internal/org/json/JSONTokener;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private character:I

.field private eof:Z

.field private index:I

.field private line:I

.field private previous:C

.field private reader:Ljava/io/Reader;

.field private usePrevious:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 69
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;-><init>(Ljava/io/Reader;)V

    .line 70
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    iput-object p1, p0, Ltwitter4j/internal/org/json/JSONTokener;->reader:Ljava/io/Reader;

    .line 56
    iput-boolean v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->eof:Z

    .line 57
    iput-boolean v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    .line 58
    iput-char v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->previous:C

    .line 59
    iput v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    .line 60
    iput v2, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    .line 61
    iput v2, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    .line 62
    return-void

    .line 54
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object p1, v0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;-><init>(Ljava/io/Reader;)V

    .line 80
    return-void
.end method


# virtual methods
.method public back()V
    .locals 2

    .prologue
    .line 89
    iget-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    if-nez v0, :cond_0

    iget v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    if-gtz v0, :cond_1

    .line 90
    :cond_0
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "Stepping back two steps is not supported"

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_1
    iget v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    .line 93
    iget v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->eof:Z

    .line 96
    return-void
.end method

.method public end()Z
    .locals 1

    .prologue
    .line 100
    iget-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->eof:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public more()Z
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    .line 112
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->end()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    const/4 v0, 0x0

    .line 116
    :goto_0
    return v0

    .line 115
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 116
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public next()C
    .locals 6

    .prologue
    const/16 v5, 0xa

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 127
    iget-boolean v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    if-eqz v0, :cond_1

    .line 128
    iput-boolean v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->usePrevious:Z

    .line 129
    iget-char v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->previous:C

    .line 142
    :cond_0
    :goto_0
    iget v3, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    .line 143
    iget-char v3, p0, Ltwitter4j/internal/org/json/JSONTokener;->previous:C

    const/16 v4, 0xd

    if-ne v3, v4, :cond_3

    .line 144
    iget v3, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    .line 145
    if-ne v0, v5, :cond_2

    :goto_1
    iput v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    .line 152
    :goto_2
    int-to-char v0, v0

    iput-char v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->previous:C

    .line 153
    iget-char v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->previous:C

    return v0

    .line 132
    :cond_1
    :try_start_0
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONTokener;->reader:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 137
    if-gtz v0, :cond_0

    .line 138
    iput-boolean v2, p0, Ltwitter4j/internal/org/json/JSONTokener;->eof:Z

    move v0, v1

    .line 139
    goto :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    new-instance v1, Ltwitter4j/internal/org/json/JSONException;

    invoke-direct {v1, v0}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    move v1, v2

    .line 145
    goto :goto_1

    .line 146
    :cond_3
    if-ne v0, v5, :cond_4

    .line 147
    iget v2, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    .line 148
    iput v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    goto :goto_2

    .line 150
    :cond_4
    iget v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    goto :goto_2
.end method

.method public next(C)C
    .locals 3

    .prologue
    .line 166
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v0

    .line 167
    if-eq v0, p1, :cond_0

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' and instead saw \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 171
    :cond_0
    return v0
.end method

.method public next(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 184
    if-nez p1, :cond_0

    .line 185
    const-string v0, ""

    .line 198
    :goto_0
    return-object v0

    .line 188
    :cond_0
    new-array v1, p1, [C

    .line 189
    const/4 v0, 0x0

    .line 191
    :goto_1
    if-ge v0, p1, :cond_2

    .line 192
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v2

    aput-char v2, v1, v0

    .line 193
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->end()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 194
    const-string v0, "Substring bounds error"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 196
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 198
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    goto :goto_0
.end method

.method public nextClean()C
    .locals 2

    .prologue
    .line 210
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v0

    .line 211
    if-eqz v0, :cond_1

    const/16 v1, 0x20

    if-le v0, v1, :cond_0

    .line 212
    :cond_1
    return v0
.end method

.method public nextString(C)Ljava/lang/String;
    .locals 3

    .prologue
    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    :goto_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v1

    .line 235
    sparse-switch v1, :sswitch_data_0

    .line 272
    if-ne v1, p1, :cond_0

    .line 273
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 239
    :sswitch_0
    const-string v0, "Unterminated string"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 241
    :sswitch_1
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v1

    .line 242
    sparse-switch v1, :sswitch_data_1

    .line 268
    const-string v0, "Illegal escape."

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 244
    :sswitch_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 247
    :sswitch_3
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 250
    :sswitch_4
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 253
    :sswitch_5
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 256
    :sswitch_6
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 259
    :sswitch_7
    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Ltwitter4j/internal/org/json/JSONTokener;->next(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 265
    :sswitch_8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 235
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x5c -> :sswitch_1
    .end sparse-switch

    .line 242
    :sswitch_data_1
    .sparse-switch
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2f -> :sswitch_8
        0x5c -> :sswitch_8
        0x62 -> :sswitch_2
        0x66 -> :sswitch_5
        0x6e -> :sswitch_4
        0x72 -> :sswitch_6
        0x74 -> :sswitch_3
        0x75 -> :sswitch_7
    .end sparse-switch
.end method

.method public nextValue()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 288
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v0

    .line 291
    sparse-switch v0, :sswitch_data_0

    .line 312
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    :goto_0
    const/16 v2, 0x20

    if-lt v0, v2, :cond_0

    const-string v2, ",:]}/\\\"[{;=#"

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_0

    .line 314
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v0

    goto :goto_0

    .line 294
    :sswitch_0
    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->nextString(C)Ljava/lang/String;

    move-result-object v0

    .line 323
    :goto_1
    return-object v0

    .line 296
    :sswitch_1
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 297
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ltwitter4j/internal/org/json/JSONTokener;)V

    goto :goto_1

    .line 299
    :sswitch_2
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 300
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ltwitter4j/internal/org/json/JSONTokener;)V

    goto :goto_1

    .line 317
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 319
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 320
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 321
    const-string v0, "Missing value"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 323
    :cond_1
    invoke-static {v0}, Ltwitter4j/internal/org/json/JSONObject;->stringToValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    .line 291
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_0
        0x27 -> :sswitch_0
        0x5b -> :sswitch_2
        0x7b -> :sswitch_1
    .end sparse-switch
.end method

.method public syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;
    .locals 3

    .prologue
    .line 335
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONTokener;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 345
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [character "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->character:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/org/json/JSONTokener;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
