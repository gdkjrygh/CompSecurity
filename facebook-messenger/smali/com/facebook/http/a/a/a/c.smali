.class public Lcom/facebook/http/a/a/a/c;
.super Ljava/lang/Object;
.source "HttpMultipart.java"


# static fields
.field private static final a:Lorg/apache/http/util/ByteArrayBuffer;

.field private static final b:Lorg/apache/http/util/ByteArrayBuffer;

.field private static final c:Lorg/apache/http/util/ByteArrayBuffer;


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Ljava/nio/charset/Charset;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/http/a/a/a/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/http/a/a/a/g;->a:Ljava/nio/charset/Charset;

    const-string v1, ": "

    invoke-static {v0, v1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v0

    sput-object v0, Lcom/facebook/http/a/a/a/c;->a:Lorg/apache/http/util/ByteArrayBuffer;

    .line 93
    sget-object v0, Lcom/facebook/http/a/a/a/g;->a:Ljava/nio/charset/Charset;

    const-string v1, "\r\n"

    invoke-static {v0, v1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v0

    sput-object v0, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    .line 94
    sget-object v0, Lcom/facebook/http/a/a/a/g;->a:Ljava/nio/charset/Charset;

    const-string v1, "--"

    invoke-static {v0, v1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v0

    sput-object v0, Lcom/facebook/http/a/a/a/c;->c:Lorg/apache/http/util/ByteArrayBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;Lcom/facebook/http/a/a/a/f;)V
    .locals 2

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    if-nez p1, :cond_0

    .line 117
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Multipart subtype may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_0
    if-nez p3, :cond_1

    .line 120
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Multipart boundary may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_1
    iput-object p1, p0, Lcom/facebook/http/a/a/a/c;->d:Ljava/lang/String;

    .line 123
    if-eqz p2, :cond_2

    :goto_0
    iput-object p2, p0, Lcom/facebook/http/a/a/a/c;->e:Ljava/nio/charset/Charset;

    .line 124
    iput-object p3, p0, Lcom/facebook/http/a/a/a/c;->f:Ljava/lang/String;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/http/a/a/a/c;->g:Ljava/util/List;

    .line 126
    iput-object p4, p0, Lcom/facebook/http/a/a/a/c;->h:Lcom/facebook/http/a/a/a/f;

    .line 127
    return-void

    .line 123
    :cond_2
    sget-object p2, Lcom/facebook/http/a/a/a/g;->a:Ljava/nio/charset/Charset;

    goto :goto_0
.end method

.method private static a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
    .locals 4

    .prologue
    .line 53
    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/nio/charset/Charset;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 54
    new-instance v1, Lorg/apache/http/util/ByteArrayBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-direct {v1, v2}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V

    .line 55
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    invoke-virtual {v1, v2, v3, v0}, Lorg/apache/http/util/ByteArrayBuffer;->append([BII)V

    .line 56
    return-object v1
.end method

.method private a(Lcom/facebook/http/a/a/a/f;Ljava/io/OutputStream;Z)V
    .locals 6

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v2

    .line 179
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/a/a/a/a;

    .line 180
    sget-object v1, Lcom/facebook/http/a/a/a/c;->c:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v1, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 181
    invoke-static {v2, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 182
    sget-object v1, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v1, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 184
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->c()Lcom/facebook/http/a/a/a/b;

    move-result-object v1

    .line 186
    sget-object v4, Lcom/facebook/http/a/a/a/d;->a:[I

    invoke-virtual {p1}, Lcom/facebook/http/a/a/a/f;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 204
    :cond_0
    :goto_1
    sget-object v1, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v1, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 206
    if-eqz p3, :cond_1

    .line 207
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/facebook/http/a/a/a/a/b;->a(Ljava/io/OutputStream;)V

    .line 209
    :cond_1
    sget-object v0, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    goto :goto_0

    .line 188
    :pswitch_0
    invoke-virtual {v1}, Lcom/facebook/http/a/a/a/b;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/a/a/a/h;

    .line 189
    invoke-static {v1, p2}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/h;Ljava/io/OutputStream;)V

    goto :goto_2

    .line 195
    :pswitch_1
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->c()Lcom/facebook/http/a/a/a/b;

    move-result-object v1

    const-string v4, "Content-Disposition"

    invoke-virtual {v1, v4}, Lcom/facebook/http/a/a/a/b;->a(Ljava/lang/String;)Lcom/facebook/http/a/a/a/h;

    move-result-object v1

    .line 196
    iget-object v4, p0, Lcom/facebook/http/a/a/a/c;->e:Ljava/nio/charset/Charset;

    invoke-static {v1, v4, p2}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/h;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V

    .line 197
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/http/a/a/a/a/b;->b()Ljava/lang/String;

    move-result-object v1

    .line 198
    if-eqz v1, :cond_0

    .line 199
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->c()Lcom/facebook/http/a/a/a/b;

    move-result-object v1

    const-string v4, "Content-Type"

    invoke-virtual {v1, v4}, Lcom/facebook/http/a/a/a/b;->a(Ljava/lang/String;)Lcom/facebook/http/a/a/a/h;

    move-result-object v1

    .line 200
    iget-object v4, p0, Lcom/facebook/http/a/a/a/c;->e:Ljava/nio/charset/Charset;

    invoke-static {v1, v4, p2}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/h;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V

    goto :goto_1

    .line 211
    :cond_2
    sget-object v0, Lcom/facebook/http/a/a/a/c;->c:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 212
    invoke-static {v2, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 213
    sget-object v0, Lcom/facebook/http/a/a/a/c;->c:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 214
    sget-object v0, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 215
    return-void

    .line 186
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Lcom/facebook/http/a/a/a/h;Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/lang/String;Ljava/io/OutputStream;)V

    .line 79
    sget-object v0, Lcom/facebook/http/a/a/a/c;->a:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 80
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/lang/String;Ljava/io/OutputStream;)V

    .line 81
    sget-object v0, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 82
    return-void
.end method

.method private static a(Lcom/facebook/http/a/a/a/h;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/facebook/http/a/a/a/c;->a(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V

    .line 87
    sget-object v0, Lcom/facebook/http/a/a/a/c;->a:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 88
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/facebook/http/a/a/a/c;->a(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V

    .line 89
    sget-object v0, Lcom/facebook/http/a/a/a/c;->b:Lorg/apache/http/util/ByteArrayBuffer;

    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 90
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/facebook/http/a/a/a/g;->a:Ljava/nio/charset/Charset;

    invoke-static {v0, p0}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v0

    .line 73
    invoke-static {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 74
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 66
    invoke-static {p1, p0}, Lcom/facebook/http/a/a/a/c;->a(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;

    move-result-object v0

    .line 67
    invoke-static {v0, p2}, Lcom/facebook/http/a/a/a/c;->a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V

    .line 68
    return-void
.end method

.method private static a(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
    .locals 3

    .prologue
    .line 61
    invoke-virtual {p0}, Lorg/apache/http/util/ByteArrayBuffer;->buffer()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/apache/http/util/ByteArrayBuffer;->length()I

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 62
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->g:Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/facebook/http/a/a/a/a;)V
    .locals 1

    .prologue
    .line 163
    if-nez p1, :cond_0

    .line 167
    :goto_0
    return-void

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->h:Lcom/facebook/http/a/a/a/f;

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/f;Ljava/io/OutputStream;Z)V

    .line 226
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 10

    .prologue
    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x1

    .line 242
    .line 243
    iget-object v0, p0, Lcom/facebook/http/a/a/a/c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-wide v1, v3

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/a/a/a/a;

    .line 244
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v0

    .line 245
    invoke-interface {v0}, Lcom/facebook/http/a/a/a/a/b;->e()J

    move-result-wide v8

    .line 246
    cmp-long v0, v8, v3

    if-ltz v0, :cond_0

    .line 247
    add-long v0, v1, v8

    move-wide v1, v0

    .line 251
    goto :goto_0

    :cond_0
    move-wide v0, v5

    .line 258
    :goto_1
    return-wide v0

    .line 252
    :cond_1
    new-instance v0, Lcom/facebook/http/a/a/a/e;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Lcom/facebook/http/a/a/a/e;-><init>(Lcom/facebook/http/a/a/a/d;)V

    .line 254
    :try_start_0
    iget-object v3, p0, Lcom/facebook/http/a/a/a/c;->h:Lcom/facebook/http/a/a/a/f;

    const/4 v4, 0x0

    invoke-direct {p0, v3, v0, v4}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/f;Ljava/io/OutputStream;Z)V

    .line 255
    iget v0, v0, Lcom/facebook/http/a/a/a/e;->a:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v3, v0

    add-long v0, v1, v3

    goto :goto_1

    .line 256
    :catch_0
    move-exception v0

    move-wide v0, v5

    .line 258
    goto :goto_1
.end method
