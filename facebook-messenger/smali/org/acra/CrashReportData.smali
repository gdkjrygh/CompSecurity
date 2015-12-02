.class public Lorg/acra/CrashReportData;
.super Ljava/util/EnumMap;
.source "CrashReportData.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/EnumMap",
        "<",
        "Lorg/acra/ReportField;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final CONTINUE:I = 0x3

.field private static final IGNORE:I = 0x5

.field private static final KEY_DONE:I = 0x4

.field private static final NONE:I = 0x0

.field private static final PROP_DTD_NAME:Ljava/lang/String; = "http://java.sun.com/dtd/properties.dtd"

.field private static final SLASH:I = 0x1

.field private static final UNICODE:I = 0x2

.field private static lineSeparator:Ljava/lang/String; = null

.field private static final serialVersionUID:J = 0x3912d07a70363e98L


# instance fields
.field protected defaults:Lorg/acra/CrashReportData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 527
    const-string v0, "\n"

    sput-object v0, Lorg/acra/CrashReportData;->lineSeparator:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 78
    const-class v0, Lorg/acra/ReportField;

    invoke-direct {p0, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    return-void
.end method

.method public constructor <init>(Lorg/acra/CrashReportData;)V
    .locals 1

    .prologue
    .line 89
    const-class v0, Lorg/acra/ReportField;

    invoke-direct {p0, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 90
    iput-object p1, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    .line 91
    return-void
.end method

.method private dumpString(Ljava/io/Writer;Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x20

    .line 94
    .line 95
    if-nez p3, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_5

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_5

    .line 96
    const-string v0, "\\ "

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 97
    const/4 v0, 0x1

    .line 100
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 101
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 102
    packed-switch v2, :pswitch_data_0

    .line 116
    :pswitch_0
    const-string v3, "\\#!=:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_0

    if-eqz p3, :cond_1

    if-ne v2, v5, :cond_1

    .line 117
    :cond_0
    const/16 v3, 0x5c

    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(I)V

    .line 119
    :cond_1
    if-lt v2, v5, :cond_2

    const/16 v3, 0x7e

    if-gt v2, v3, :cond_2

    .line 120
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    .line 100
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 104
    :pswitch_1
    const-string v2, "\\t"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 107
    :pswitch_2
    const-string v2, "\\n"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 110
    :pswitch_3
    const-string v2, "\\f"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 113
    :pswitch_4
    const-string v2, "\\r"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 122
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 123
    const-string v2, "\\u"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move v2, v1

    .line 124
    :goto_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    rsub-int/lit8 v4, v4, 0x4

    if-ge v2, v4, :cond_3

    .line 125
    const-string v4, "0"

    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 124
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 127
    :cond_3
    invoke-virtual {p1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 131
    :cond_4
    return-void

    :cond_5
    move v0, v1

    goto :goto_0

    .line 102
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static getWriter(Ljava/io/OutputStream;)Ljava/io/Writer;
    .locals 2

    .prologue
    .line 549
    :try_start_0
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "ISO8859_1"

    invoke-direct {v0, p0, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 551
    :goto_0
    return-object v0

    .line 550
    :catch_0
    move-exception v0

    .line 551
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isEbcdic(Ljava/io/BufferedInputStream;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 270
    :cond_0
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    int-to-byte v1, v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 271
    const/16 v2, 0x23

    if-eq v1, v2, :cond_1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_2

    .line 283
    :cond_1
    :goto_0
    return v0

    .line 274
    :cond_2
    const/16 v2, 0x15

    if-ne v1, v2, :cond_0

    .line 275
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private keys()Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Enumeration",
            "<",
            "Lorg/acra/ReportField;",
            ">;"
        }
    .end annotation

    .prologue
    .line 486
    invoke-virtual {p0}, Lorg/acra/CrashReportData;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->enumeration(Ljava/util/Collection;)Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method private substitutePredefinedEntries(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 791
    const-string v0, "&"

    const-string v1, "&amp;"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<"

    const-string v2, "&lt;"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ">"

    const-string v2, "&gt;"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\'"

    const-string v2, "&apos;"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\""

    const-string v2, "&quot;"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getProperty(Lorg/acra/ReportField;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 143
    invoke-super {p0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    if-nez v0, :cond_0

    iget-object v1, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    if-eqz v1, :cond_0

    .line 145
    iget-object v0, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    invoke-virtual {v0, p1}, Lorg/acra/CrashReportData;->getProperty(Lorg/acra/ReportField;)Ljava/lang/String;

    move-result-object v0

    .line 147
    :cond_0
    return-object v0
.end method

.method public getProperty(Lorg/acra/ReportField;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 163
    invoke-super {p0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 164
    if-nez v0, :cond_0

    iget-object v1, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    if-eqz v1, :cond_0

    .line 165
    iget-object v0, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    invoke-virtual {v0, p1}, Lorg/acra/CrashReportData;->getProperty(Lorg/acra/ReportField;)Ljava/lang/String;

    move-result-object v0

    .line 167
    :cond_0
    if-nez v0, :cond_1

    .line 170
    :goto_0
    return-object p2

    :cond_1
    move-object p2, v0

    goto :goto_0
.end method

.method public list(Ljava/io/PrintStream;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 182
    if-nez p1, :cond_0

    .line 183
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 185
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x50

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 186
    invoke-direct {p0}, Lorg/acra/CrashReportData;->keys()Ljava/util/Enumeration;

    move-result-object v4

    .line 187
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/acra/ReportField;

    .line 189
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    const/16 v1, 0x3d

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 191
    invoke-super {p0, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 192
    iget-object v2, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    .line 193
    :goto_1
    if-nez v1, :cond_1

    .line 194
    invoke-virtual {v2, v0}, Lorg/acra/CrashReportData;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 195
    iget-object v2, v2, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    goto :goto_1

    .line 197
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x28

    if-le v0, v2, :cond_2

    .line 198
    const/16 v0, 0x25

    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    const-string v0, "..."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_0

    .line 201
    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 206
    :cond_3
    return-void
.end method

.method public list(Ljava/io/PrintWriter;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 217
    if-nez p1, :cond_0

    .line 218
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 220
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x50

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 221
    invoke-direct {p0}, Lorg/acra/CrashReportData;->keys()Ljava/util/Enumeration;

    move-result-object v4

    .line 222
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/acra/ReportField;

    .line 224
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    const/16 v1, 0x3d

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 226
    invoke-super {p0, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 227
    iget-object v2, p0, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    .line 228
    :goto_1
    if-nez v1, :cond_1

    .line 229
    invoke-virtual {v2, v0}, Lorg/acra/CrashReportData;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 230
    iget-object v2, v2, Lorg/acra/CrashReportData;->defaults:Lorg/acra/CrashReportData;

    goto :goto_1

    .line 232
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x28

    if-le v0, v2, :cond_2

    .line 233
    const/16 v0, 0x25

    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    const-string v0, "..."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 239
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_0

    .line 236
    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 241
    :cond_3
    return-void
.end method

.method public declared-synchronized load(Ljava/io/InputStream;)V
    .locals 3

    .prologue
    .line 253
    monitor-enter p0

    if-nez p1, :cond_0

    .line 254
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 256
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 257
    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 258
    invoke-direct {p0, v0}, Lorg/acra/CrashReportData;->isEbcdic(Ljava/io/BufferedInputStream;)Z

    move-result v1

    .line 259
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V

    .line 261
    if-nez v1, :cond_1

    .line 262
    new-instance v1, Ljava/io/InputStreamReader;

    const-string v2, "ISO8859-1"

    invoke-direct {v1, v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lorg/acra/CrashReportData;->load(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    :goto_0
    monitor-exit p0

    return-void

    .line 264
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p0, v1}, Lorg/acra/CrashReportData;->load(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized load(Ljava/io/Reader;)V
    .locals 13

    .prologue
    .line 315
    monitor-enter p0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 316
    const/16 v0, 0x28

    :try_start_0
    new-array v7, v0, [C

    .line 317
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 318
    const/4 v0, 0x1

    .line 319
    new-instance v9, Ljava/io/BufferedReader;

    invoke-direct {v9, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move v8, v0

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 322
    :goto_0
    invoke-virtual {v9}, Ljava/io/BufferedReader;->read()I

    move-result v0

    .line 323
    const/4 v6, -0x1

    if-ne v0, v6, :cond_0

    .line 457
    const/4 v0, 0x2

    if-ne v5, v0, :cond_12

    const/4 v0, 0x4

    if-gt v3, v0, :cond_12

    .line 459
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "luni.08"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 325
    :cond_0
    int-to-char v0, v0

    .line 327
    :try_start_1
    array-length v6, v7

    if-ne v1, v6, :cond_1

    .line 328
    array-length v6, v7

    mul-int/lit8 v6, v6, 0x2

    new-array v6, v6, [C

    .line 329
    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v7, v10, v6, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v7, v6

    .line 332
    :cond_1
    const/4 v6, 0x2

    if-ne v5, v6, :cond_1a

    .line 333
    const/16 v6, 0x10

    invoke-static {v0, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v6

    .line 334
    if-ltz v6, :cond_2

    .line 335
    shl-int/lit8 v4, v4, 0x4

    add-int/2addr v6, v4

    .line 336
    add-int/lit8 v4, v3, 0x1

    const/4 v3, 0x4

    if-ge v4, v3, :cond_19

    move v3, v4

    move v4, v6

    .line 337
    goto :goto_0

    .line 339
    :cond_2
    const/4 v5, 0x4

    if-gt v3, v5, :cond_3

    .line 341
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "luni.09"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v5, v4

    move v4, v3

    .line 343
    :goto_1
    const/4 v6, 0x0

    .line 344
    add-int/lit8 v3, v1, 0x1

    int-to-char v10, v5

    aput-char v10, v7, v1

    .line 345
    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0x85

    if-eq v0, v1, :cond_4

    move v1, v3

    move v3, v4

    move v4, v5

    move v5, v6

    .line 346
    goto :goto_0

    :cond_4
    move v1, v3

    move v3, v6

    .line 349
    :goto_2
    const/4 v6, 0x1

    if-ne v3, v6, :cond_6

    .line 350
    const/4 v3, 0x0

    .line 351
    sparse-switch v0, :sswitch_data_0

    :goto_3
    move v12, v0

    move v0, v3

    move v3, v12

    .line 450
    :goto_4
    const/4 v6, 0x0

    .line 451
    const/4 v8, 0x4

    if-ne v0, v8, :cond_5

    .line 453
    const/4 v0, 0x0

    move v2, v1

    .line 455
    :cond_5
    add-int/lit8 v8, v1, 0x1

    aput-char v3, v7, v1

    move v1, v8

    move v3, v4

    move v8, v6

    move v4, v5

    move v5, v0

    goto :goto_0

    .line 353
    :sswitch_0
    const/4 v3, 0x3

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 354
    goto :goto_0

    .line 357
    :sswitch_1
    const/4 v3, 0x5

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 358
    goto/16 :goto_0

    .line 360
    :sswitch_2
    const/16 v0, 0x8

    .line 361
    goto :goto_3

    .line 363
    :sswitch_3
    const/16 v0, 0xc

    .line 364
    goto :goto_3

    .line 366
    :sswitch_4
    const/16 v0, 0xa

    .line 367
    goto :goto_3

    .line 369
    :sswitch_5
    const/16 v0, 0xd

    .line 370
    goto :goto_3

    .line 372
    :sswitch_6
    const/16 v0, 0x9

    .line 373
    goto :goto_3

    .line 375
    :sswitch_7
    const/4 v3, 0x2

    .line 376
    const/4 v4, 0x0

    move v5, v3

    move v3, v4

    .line 377
    goto/16 :goto_0

    .line 380
    :cond_6
    sparse-switch v0, :sswitch_data_1

    .line 433
    :cond_7
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 434
    const/4 v6, 0x3

    if-ne v3, v6, :cond_8

    .line 435
    const/4 v3, 0x5

    .line 438
    :cond_8
    if-eqz v1, :cond_17

    if-eq v1, v2, :cond_17

    const/4 v6, 0x5

    if-ne v3, v6, :cond_f

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 439
    goto/16 :goto_0

    .line 383
    :sswitch_8
    if-eqz v8, :cond_7

    .line 385
    :cond_9
    invoke-virtual {v9}, Ljava/io/BufferedReader;->read()I

    move-result v0

    .line 386
    const/4 v6, -0x1

    if-ne v0, v6, :cond_a

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 387
    goto/16 :goto_0

    .line 388
    :cond_a
    int-to-char v0, v0

    .line 391
    const/16 v6, 0xd

    if-eq v0, v6, :cond_17

    const/16 v6, 0xa

    if-eq v0, v6, :cond_17

    const/16 v6, 0x85

    if-ne v0, v6, :cond_9

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 392
    goto/16 :goto_0

    .line 399
    :sswitch_9
    const/4 v0, 0x3

    if-ne v3, v0, :cond_b

    .line 400
    const/4 v3, 0x5

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 401
    goto/16 :goto_0

    .line 406
    :cond_b
    :sswitch_a
    const/4 v3, 0x0

    .line 407
    const/4 v0, 0x1

    .line 408
    if-gtz v1, :cond_c

    if-nez v1, :cond_e

    if-nez v2, :cond_e

    .line 409
    :cond_c
    const/4 v6, -0x1

    if-ne v2, v6, :cond_d

    move v2, v1

    .line 412
    :cond_d
    new-instance v6, Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8, v1}, Ljava/lang/String;-><init>([CII)V

    .line 413
    const-class v1, Lorg/acra/ReportField;

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v1

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    :cond_e
    const/4 v2, -0x1

    .line 416
    const/4 v1, 0x0

    move v8, v0

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 417
    goto/16 :goto_0

    .line 419
    :sswitch_b
    const/4 v0, 0x4

    if-ne v3, v0, :cond_18

    move v0, v1

    .line 422
    :goto_5
    const/4 v3, 0x1

    move v2, v0

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 423
    goto/16 :goto_0

    .line 426
    :sswitch_c
    const/4 v6, -0x1

    if-ne v2, v6, :cond_7

    .line 427
    const/4 v3, 0x0

    move v2, v1

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 429
    goto/16 :goto_0

    .line 441
    :cond_f
    const/4 v6, -0x1

    if-ne v2, v6, :cond_10

    .line 442
    const/4 v3, 0x4

    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    .line 443
    goto/16 :goto_0

    .line 446
    :cond_10
    const/4 v6, 0x5

    if-eq v3, v6, :cond_11

    const/4 v6, 0x3

    if-ne v3, v6, :cond_16

    .line 447
    :cond_11
    const/4 v3, 0x0

    move v12, v0

    move v0, v3

    move v3, v12

    goto/16 :goto_4

    .line 461
    :cond_12
    const/4 v0, -0x1

    if-ne v2, v0, :cond_13

    if-lez v1, :cond_13

    move v2, v1

    .line 464
    :cond_13
    if-ltz v2, :cond_15

    .line 465
    new-instance v3, Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {v3, v7, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 466
    const-class v0, Lorg/acra/ReportField;

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/acra/ReportField;

    .line 467
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 468
    const/4 v2, 0x1

    if-ne v5, v2, :cond_14

    .line 469
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u0000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 471
    :cond_14
    invoke-virtual {p0, v0, v1}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 473
    :cond_15
    monitor-exit p0

    return-void

    :cond_16
    move v12, v0

    move v0, v3

    move v3, v12

    goto/16 :goto_4

    :cond_17
    move v12, v4

    move v4, v5

    move v5, v3

    move v3, v12

    goto/16 :goto_0

    :cond_18
    move v0, v2

    goto :goto_5

    :cond_19
    move v5, v6

    goto/16 :goto_1

    :cond_1a
    move v12, v3

    move v3, v5

    move v5, v4

    move v4, v12

    goto/16 :goto_2

    .line 351
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_1
        0xd -> :sswitch_0
        0x62 -> :sswitch_2
        0x66 -> :sswitch_3
        0x6e -> :sswitch_4
        0x72 -> :sswitch_5
        0x74 -> :sswitch_6
        0x75 -> :sswitch_7
        0x85 -> :sswitch_1
    .end sparse-switch

    .line 380
    :sswitch_data_1
    .sparse-switch
        0xa -> :sswitch_9
        0xd -> :sswitch_a
        0x21 -> :sswitch_8
        0x23 -> :sswitch_8
        0x3a -> :sswitch_c
        0x3d -> :sswitch_c
        0x5c -> :sswitch_b
        0x85 -> :sswitch_a
    .end sparse-switch
.end method

.method public put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 478
    invoke-virtual {p0, p1, p2}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 479
    if-eqz p3, :cond_0

    .line 480
    invoke-virtual {p0, p3, p1, p2}, Lorg/acra/CrashReportData;->storeKeyValuePair(Ljava/io/Writer;Lorg/acra/ReportField;Ljava/lang/String;)V

    .line 482
    :cond_0
    return-object v0
.end method

.method public save(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 508
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/acra/CrashReportData;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 511
    :goto_0
    return-void

    .line 509
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setProperty(Lorg/acra/ReportField;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 524
    invoke-virtual {p0, p1, p2}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized store(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 544
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lorg/acra/CrashReportData;->getWriter(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lorg/acra/CrashReportData;->store(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 545
    monitor-exit p0

    return-void

    .line 544
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized store(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 569
    monitor-enter p0

    if-eqz p2, :cond_0

    .line 570
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/acra/CrashReportData;->storeComment(Ljava/io/Writer;Ljava/lang/String;)V

    .line 572
    :cond_0
    invoke-virtual {p0}, Lorg/acra/CrashReportData;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 573
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/acra/ReportField;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1, v1, v0}, Lorg/acra/CrashReportData;->storeKeyValuePair(Ljava/io/Writer;Lorg/acra/ReportField;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 569
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 575
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 576
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized storeComment(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 579
    monitor-enter p0

    :try_start_0
    const-string v0, "#"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 580
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 581
    sget-object v0, Lorg/acra/CrashReportData;->lineSeparator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 582
    monitor-exit p0

    return-void

    .line 579
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized storeKeyValuePair(Ljava/io/Writer;Lorg/acra/ReportField;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 585
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Lorg/acra/ReportField;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lorg/acra/CrashReportData;->dumpString(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 586
    const-string v0, "="

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 587
    if-nez p3, :cond_0

    const-string p3, ""

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, v0}, Lorg/acra/CrashReportData;->dumpString(Ljava/io/Writer;Ljava/lang/String;Z)V

    .line 588
    sget-object v0, Lorg/acra/CrashReportData;->lineSeparator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 589
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 590
    monitor-exit p0

    return-void

    .line 585
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public storeToXML(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 705
    const-string v0, "UTF-8"

    invoke-virtual {p0, p1, p2, v0}, Lorg/acra/CrashReportData;->storeToXML(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    return-void
.end method

.method public declared-synchronized storeToXML(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 732
    monitor-enter p0

    if-eqz p1, :cond_0

    if-nez p3, :cond_1

    .line 733
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 732
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 745
    :cond_1
    :try_start_1
    invoke-static {p3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
    :try_end_1
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 754
    :goto_0
    :try_start_2
    new-instance v2, Ljava/io/PrintStream;

    const/4 v1, 0x0

    invoke-direct {v2, p1, v1, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;ZLjava/lang/String;)V

    .line 756
    const-string v1, "<?xml version=\"1.0\" encoding=\""

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 757
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 758
    const-string v0, "\"?>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 760
    const-string v0, "<!DOCTYPE properties SYSTEM \""

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 761
    const-string v0, "http://java.sun.com/dtd/properties.dtd"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 762
    const-string v0, "\">"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 764
    const-string v0, "<properties>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 766
    if-eqz p2, :cond_2

    .line 767
    const-string v0, "<comment>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 768
    invoke-direct {p0, p2}, Lorg/acra/CrashReportData;->substitutePredefinedEntries(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 769
    const-string v0, "</comment>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 772
    :cond_2
    invoke-virtual {p0}, Lorg/acra/CrashReportData;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 773
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/acra/ReportField;

    invoke-virtual {v1}, Lorg/acra/ReportField;->toString()Ljava/lang/String;

    move-result-object v1

    .line 774
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 775
    const-string v4, "<entry key=\""

    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 776
    invoke-direct {p0, v1}, Lorg/acra/CrashReportData;->substitutePredefinedEntries(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 777
    const-string v1, "\">"

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 778
    invoke-direct {p0, v0}, Lorg/acra/CrashReportData;->substitutePredefinedEntries(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 779
    const-string v0, "</entry>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    .line 746
    :catch_0
    move-exception v0

    .line 747
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Warning: encoding name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is illegal, using UTF-8 as default encoding"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 748
    const-string v0, "UTF-8"

    goto/16 :goto_0

    .line 749
    :catch_1
    move-exception v0

    .line 750
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Warning: encoding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not supported, using UTF-8 as default encoding"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 751
    const-string v0, "UTF-8"

    goto/16 :goto_0

    .line 781
    :cond_3
    const-string v0, "</properties>"

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 782
    invoke-virtual {v2}, Ljava/io/PrintStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 783
    monitor-exit p0

    return-void
.end method
