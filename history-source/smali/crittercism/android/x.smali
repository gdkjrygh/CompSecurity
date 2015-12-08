.class public final Lcrittercism/android/x;
.super Ljava/io/InputStream;

# interfaces
.implements Lcrittercism/android/al;


# instance fields
.field private a:Lcrittercism/android/ae;

.field private b:Lcrittercism/android/c;

.field private c:Ljava/io/InputStream;

.field private d:Lcrittercism/android/e;

.field private e:Lcrittercism/android/af;


# direct methods
.method public constructor <init>(Lcrittercism/android/ae;Ljava/io/InputStream;Lcrittercism/android/e;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 30
    if-nez p1, :cond_0

    .line 31
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "socket was null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    if-nez p2, :cond_1

    .line 35
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "delegate was null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_1
    if-nez p3, :cond_2

    .line 39
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "dispatch was null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_2
    iput-object p1, p0, Lcrittercism/android/x;->a:Lcrittercism/android/ae;

    .line 43
    iput-object p2, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    .line 44
    iput-object p3, p0, Lcrittercism/android/x;->d:Lcrittercism/android/e;

    .line 45
    invoke-virtual {p0}, Lcrittercism/android/x;->b()Lcrittercism/android/af;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    .line 47
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    if-nez v0, :cond_3

    .line 48
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "parser was null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 84
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/x;->e()Lcrittercism/android/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcrittercism/android/c;->a(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcrittercism/android/x;->d:Lcrittercism/android/e;

    sget-object v2, Lcrittercism/android/c$a;->h:Lcrittercism/android/c$a;

    invoke-virtual {v1, v0, v2}, Lcrittercism/android/e;->a(Lcrittercism/android/c;Lcrittercism/android/c$a;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 85
    :catch_0
    move-exception v0

    throw v0

    .line 87
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a([BII)V
    .locals 2

    .prologue
    .line 170
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    invoke-virtual {v0, p1, p2, p3}, Lcrittercism/android/af;->a([BII)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 178
    :goto_0
    return-void

    .line 171
    :catch_0
    move-exception v0

    throw v0

    .line 173
    :catch_1
    move-exception v0

    .line 174
    sget-object v1, Lcrittercism/android/as;->d:Lcrittercism/android/as;

    iput-object v1, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    .line 176
    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private e()Lcrittercism/android/c;
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    if-nez v0, :cond_0

    .line 254
    iget-object v0, p0, Lcrittercism/android/x;->a:Lcrittercism/android/ae;

    invoke-interface {v0}, Lcrittercism/android/ae;->b()Lcrittercism/android/c;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    .line 257
    :cond_0
    iget-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    return-object v0
.end method


# virtual methods
.method public final a()Lcrittercism/android/af;
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 203
    invoke-direct {p0}, Lcrittercism/android/x;->e()Lcrittercism/android/c;

    move-result-object v0

    .line 205
    if-eqz v0, :cond_0

    .line 206
    invoke-virtual {v0}, Lcrittercism/android/c;->c()V

    .line 207
    iput p1, v0, Lcrittercism/android/c;->e:I

    .line 209
    :cond_0
    return-void
.end method

.method public final a(Lcrittercism/android/af;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    .line 215
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 290
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 198
    return-void
.end method

.method public final a(Ljava/io/InputStream;)Z
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final available()I
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final b()Lcrittercism/android/af;
    .locals 1

    .prologue
    .line 266
    new-instance v0, Lcrittercism/android/ap;

    invoke-direct {v0, p0}, Lcrittercism/android/ap;-><init>(Lcrittercism/android/al;)V

    return-object v0
.end method

.method public final b(I)V
    .locals 4

    .prologue
    .line 224
    const/4 v0, 0x0

    .line 225
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    .line 227
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    if-eqz v1, :cond_1

    .line 228
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    iget v1, v1, Lcrittercism/android/c;->e:I

    .line 230
    const/16 v2, 0x64

    if-lt v1, v2, :cond_0

    const/16 v2, 0xc8

    if-ge v1, v2, :cond_0

    .line 239
    new-instance v0, Lcrittercism/android/c;

    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    invoke-virtual {v1}, Lcrittercism/android/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcrittercism/android/c;-><init>(Ljava/lang/String;)V

    .line 240
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    iget-wide v1, v1, Lcrittercism/android/c;->a:J

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/c;->e(J)V

    .line 241
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    iget-wide v1, v1, Lcrittercism/android/c;->d:J

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/c;->d(J)V

    .line 242
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    iget-object v1, v1, Lcrittercism/android/c;->f:Ljava/lang/String;

    iput-object v1, v0, Lcrittercism/android/c;->f:Ljava/lang/String;

    .line 245
    :cond_0
    iget-object v1, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lcrittercism/android/c;->b(J)V

    .line 246
    iget-object v1, p0, Lcrittercism/android/x;->d:Lcrittercism/android/e;

    iget-object v2, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    sget-object v3, Lcrittercism/android/c$a;->g:Lcrittercism/android/c$a;

    invoke-virtual {v1, v2, v3}, Lcrittercism/android/e;->a(Lcrittercism/android/c;Lcrittercism/android/c$a;)V

    .line 249
    :cond_1
    iput-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    .line 250
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 271
    invoke-direct {p0}, Lcrittercism/android/x;->e()Lcrittercism/android/c;

    move-result-object v1

    .line 272
    const/4 v0, 0x0

    .line 274
    if-eqz v1, :cond_0

    .line 277
    iget-object v0, v1, Lcrittercism/android/c;->f:Ljava/lang/String;

    .line 280
    :cond_0
    return-object v0
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 60
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    invoke-virtual {v0}, Lcrittercism/android/af;->f()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    :goto_0
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 68
    return-void

    .line 61
    :catch_0
    move-exception v0

    throw v0

    .line 63
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    .prologue
    .line 301
    iget-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/x;->b:Lcrittercism/android/c;

    iget-object v0, v0, Lcrittercism/android/c;->g:Lcrittercism/android/cm;

    sget-object v1, Lcrittercism/android/cl;->a:Lcrittercism/android/cl;

    iget v2, v0, Lcrittercism/android/cm;->a:I

    sget-object v3, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    invoke-virtual {v3}, Lcrittercism/android/cn;->ordinal()I

    move-result v3

    if-ne v2, v3, :cond_1

    iget v0, v0, Lcrittercism/android/cm;->b:I

    invoke-virtual {v1}, Lcrittercism/android/cl;->a()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    invoke-virtual {v0}, Lcrittercism/android/af;->f()V

    .line 306
    :cond_0
    return-void

    .line 301
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final mark(I)V
    .locals 1
    .param p1, "readlimit"    # I

    .prologue
    .line 73
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 74
    return-void
.end method

.method public final markSupported()Z
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 3

    .prologue
    .line 108
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 118
    :try_start_1
    iget-object v0, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    invoke-virtual {v0, v1}, Lcrittercism/android/af;->a(I)Z
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    .line 127
    :goto_0
    return v1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    invoke-direct {p0, v0}, Lcrittercism/android/x;->a(Ljava/lang/Exception;)V

    .line 114
    throw v0

    .line 119
    :catch_1
    move-exception v0

    throw v0

    .line 121
    :catch_2
    move-exception v0

    .line 122
    sget-object v2, Lcrittercism/android/as;->d:Lcrittercism/android/as;

    iput-object v2, p0, Lcrittercism/android/x;->e:Lcrittercism/android/af;

    .line 124
    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final read([B)I
    .locals 2
    .param p1, "buffer"    # [B

    .prologue
    .line 136
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 145
    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcrittercism/android/x;->a([BII)V

    .line 147
    return v0

    .line 140
    :catch_0
    move-exception v0

    .line 141
    invoke-direct {p0, v0}, Lcrittercism/android/x;->a(Ljava/lang/Exception;)V

    .line 142
    throw v0
.end method

.method public final read([BII)I
    .locals 1
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I

    .prologue
    .line 154
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 163
    invoke-direct {p0, p1, p2, v0}, Lcrittercism/android/x;->a([BII)V

    .line 165
    return v0

    .line 158
    :catch_0
    move-exception v0

    .line 159
    invoke-direct {p0, v0}, Lcrittercism/android/x;->a(Ljava/lang/Exception;)V

    .line 160
    throw v0
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .prologue
    .line 187
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    monitor-exit p0

    return-void

    .line 187
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final skip(J)J
    .locals 2
    .param p1, "byteCount"    # J

    .prologue
    .line 193
    iget-object v0, p0, Lcrittercism/android/x;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    return-wide v0
.end method
