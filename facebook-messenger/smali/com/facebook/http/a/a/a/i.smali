.class public Lcom/facebook/http/a/a/a/i;
.super Ljava/lang/Object;
.source "MultipartEntity.java"

# interfaces
.implements Lorg/apache/http/HttpEntity;


# static fields
.field private static final a:[C


# instance fields
.field private final b:Lcom/facebook/http/a/a/a/c;

.field private final c:Lorg/apache/http/Header;

.field private d:J

.field private volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/facebook/http/a/a/a/i;->a:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 103
    sget-object v0, Lcom/facebook/http/a/a/a/f;->STRICT:Lcom/facebook/http/a/a/a/f;

    invoke-direct {p0, v0, v1, v1}, Lcom/facebook/http/a/a/a/i;-><init>(Lcom/facebook/http/a/a/a/f;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 104
    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/a/a/a/f;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 3

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    if-nez p2, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/i;->a()Ljava/lang/String;

    move-result-object p2

    .line 79
    :cond_0
    if-nez p1, :cond_1

    .line 80
    sget-object p1, Lcom/facebook/http/a/a/a/f;->STRICT:Lcom/facebook/http/a/a/a/f;

    .line 82
    :cond_1
    new-instance v0, Lcom/facebook/http/a/a/a/c;

    const-string v1, "form-data"

    invoke-direct {v0, v1, p3, p2, p1}, Lcom/facebook/http/a/a/a/c;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;Lcom/facebook/http/a/a/a/f;)V

    iput-object v0, p0, Lcom/facebook/http/a/a/a/i;->b:Lcom/facebook/http/a/a/a/c;

    .line 83
    new-instance v0, Lorg/apache/http/message/BasicHeader;

    const-string v1, "Content-Type"

    invoke-virtual {p0, p2, p3}, Lcom/facebook/http/a/a/a/i;->a(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/http/a/a/a/i;->c:Lorg/apache/http/Header;

    .line 86
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/http/a/a/a/i;->e:Z

    .line 87
    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 6

    .prologue
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 122
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1e

    .line 123
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    .line 124
    sget-object v4, Lcom/facebook/http/a/a/a/i;->a:[C

    sget-object v5, Lcom/facebook/http/a/a/a/i;->a:[C

    array-length v5, v5

    invoke-virtual {v2, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    aget-char v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    const-string v1, "multipart/form-data; boundary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    if-eqz p2, :cond_0

    .line 113
    const-string v1, "; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/http/a/a/a/a;)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/http/a/a/a/i;->b:Lcom/facebook/http/a/a/a/c;

    invoke-virtual {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Lcom/facebook/http/a/a/a/a;)V

    .line 131
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/http/a/a/a/i;->e:Z

    .line 132
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V
    .locals 1

    .prologue
    .line 135
    new-instance v0, Lcom/facebook/http/a/a/a/a;

    invoke-direct {v0, p1, p2}, Lcom/facebook/http/a/a/a/a;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    invoke-virtual {p0, v0}, Lcom/facebook/http/a/a/a/i;->a(Lcom/facebook/http/a/a/a/a;)V

    .line 136
    return-void
.end method

.method public consumeContent()V
    .locals 2

    .prologue
    .line 174
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/i;->isStreaming()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Streaming entity does not implement #consumeContent()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 178
    :cond_0
    return-void
.end method

.method public getContent()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 181
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Multipart form entity does not implement #getContent()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getContentEncoding()Lorg/apache/http/Header;
    .locals 1

    .prologue
    .line 169
    const/4 v0, 0x0

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    .prologue
    .line 157
    iget-boolean v0, p0, Lcom/facebook/http/a/a/a/i;->e:Z

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/http/a/a/a/i;->b:Lcom/facebook/http/a/a/a/c;

    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/c;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/http/a/a/a/i;->d:J

    .line 159
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/http/a/a/a/i;->e:Z

    .line 161
    :cond_0
    iget-wide v0, p0, Lcom/facebook/http/a/a/a/i;->d:J

    return-wide v0
.end method

.method public getContentType()Lorg/apache/http/Header;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/http/a/a/a/i;->c:Lorg/apache/http/Header;

    return-object v0
.end method

.method public isChunked()Z
    .locals 1

    .prologue
    .line 149
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/i;->isRepeatable()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isRepeatable()Z
    .locals 6

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/http/a/a/a/i;->b:Lcom/facebook/http/a/a/a/c;

    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/c;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/a/a/a/a;

    .line 140
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v0

    .line 141
    invoke-interface {v0}, Lcom/facebook/http/a/a/a/a/b;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    .line 142
    const/4 v0, 0x0

    .line 145
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isStreaming()Z
    .locals 1

    .prologue
    .line 153
    invoke-virtual {p0}, Lcom/facebook/http/a/a/a/i;->isRepeatable()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/http/a/a/a/i;->b:Lcom/facebook/http/a/a/a/c;

    invoke-virtual {v0, p1}, Lcom/facebook/http/a/a/a/c;->a(Ljava/io/OutputStream;)V

    .line 187
    return-void
.end method
