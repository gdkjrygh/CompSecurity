.class final Lkik/android/net/a/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/net/a/l;


# direct methods
.method constructor <init>(Lkik/android/net/a/l;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v9, -0x1

    const/4 v8, 0x2

    const/4 v2, 0x0

    .line 178
    :try_start_0
    iget-object v0, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    iget-object v1, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v1}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;)Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 179
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v1}, Lkik/android/net/a/l;->b(Lkik/android/net/a/l;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 181
    const-string v0, "HTTP\\/\\d\\.\\d (\\d+) (.*)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 183
    const/4 v0, 0x0

    .line 188
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 191
    :goto_0
    :try_start_2
    const-string v4, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v4}, Lkik/android/net/a/l;->c(Lkik/android/net/a/l;)I

    move-result v4

    if-eq v4, v8, :cond_0

    .line 195
    :cond_1
    if-nez v0, :cond_2

    .line 196
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 287
    :catch_0
    move-exception v0

    .line 288
    iget-object v1, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v1}, Lkik/android/net/a/l;->d(Lkik/android/net/a/l;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 289
    :try_start_3
    iget-object v2, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v2, v0}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;Ljava/io/IOException;)Ljava/io/IOException;

    .line 290
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 291
    :goto_1
    return-void

    .line 198
    :cond_2
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-nez v4, :cond_3

    .line 200
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not parse status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 202
    :cond_3
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v4

    if-ge v4, v8, :cond_4

    .line 203
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not parse code from status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 205
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 206
    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 208
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 213
    :goto_2
    const-string v5, ""

    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 214
    if-nez v6, :cond_5

    .line 215
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF while reading headers"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 217
    :cond_5
    const-string v5, ": "

    invoke-virtual {v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 218
    array-length v6, v5

    if-eq v6, v8, :cond_6

    .line 219
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Could not parse header"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 221
    :cond_6
    const/4 v6, 0x0

    aget-object v6, v5, v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    aget-object v5, v5, v7

    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 224
    :cond_7
    iget-object v5, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v5}, Lkik/android/net/a/l;->d(Lkik/android/net/a/l;)Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 225
    :try_start_5
    iget-object v6, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v6, v0}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;I)I

    .line 226
    iget-object v0, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v0, v1}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    iget-object v0, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v0, v4}, Lkik/android/net/a/l;->a(Lkik/android/net/a/l;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 228
    iget-object v0, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-static {v0}, Lkik/android/net/a/l;->d(Lkik/android/net/a/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 229
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 232
    :try_start_6
    const-string v0, "transfer-encoding"

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 233
    const-string v1, "content-length"

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 235
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    if-eqz v0, :cond_c

    const-string v5, "chunked"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 242
    :cond_8
    const-string v0, ""

    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    move-result v0

    if-nez v0, :cond_8

    .line 245
    if-eqz v1, :cond_a

    .line 246
    :try_start_7
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    move-result v0

    .line 256
    const/16 v1, 0x1000

    :try_start_8
    new-array v5, v1, [C

    move v1, v2

    .line 257
    :goto_3
    if-ge v1, v0, :cond_9

    .line 258
    invoke-virtual {v3, v5}, Ljava/io/BufferedReader;->read([C)I

    move-result v6

    .line 259
    if-ne v6, v9, :cond_b

    move v0, v2

    .line 266
    :cond_9
    if-gtz v0, :cond_8

    .line 280
    :cond_a
    iget-object v0, p0, Lkik/android/net/a/m;->a:Lkik/android/net/a/l;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/net/a/l;->b(Lkik/android/net/a/l;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    goto/16 :goto_1

    .line 229
    :catchall_0
    move-exception v0

    :try_start_9
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v0

    .line 252
    :catch_1
    move-exception v0

    .line 253
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 263
    :cond_b
    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7, v6}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 264
    add-int/2addr v1, v6

    .line 265
    goto :goto_3

    .line 268
    :cond_c
    if-eqz v1, :cond_a

    .line 269
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 271
    const/16 v0, 0x1000

    new-array v5, v0, [C

    move v0, v2

    .line 272
    :goto_4
    if-ge v0, v1, :cond_a

    .line 273
    invoke-virtual {v3, v5}, Ljava/io/BufferedReader;->read([C)I

    move-result v2

    .line 274
    if-eq v2, v9, :cond_a

    .line 275
    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 278
    add-int/2addr v0, v2

    .line 279
    goto :goto_4

    .line 290
    :catchall_1
    move-exception v0

    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    throw v0

    :catch_2
    move-exception v4

    goto/16 :goto_0
.end method
