.class public final Ltwitter4j/internal/http/HttpParameter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field private static final GIF:Ljava/lang/String; = "image/gif"

.field private static final JPEG:Ljava/lang/String; = "image/jpeg"

.field private static final OCTET:Ljava/lang/String; = "application/octet-stream"

.field private static final PNG:Ljava/lang/String; = "image/png"

.field private static final serialVersionUID:J = -0x78d96ac49142488cL


# instance fields
.field private file:Ljava/io/File;

.field private fileBody:Ljava/io/InputStream;

.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;D)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 64
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 65
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 54
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 55
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 59
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 60
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/File;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 43
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 44
    iput-object p2, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 38
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 48
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 50
    iput-object p3, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    .line 34
    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    .line 69
    iput-object p1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    .line 70
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    .line 71
    return-void
.end method

.method static containsFile(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 174
    const/4 v1, 0x0

    .line 175
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/internal/http/HttpParameter;

    .line 176
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    const/4 v0, 0x1

    .line 181
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public static containsFile([Ltwitter4j/internal/http/HttpParameter;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 159
    .line 160
    if-nez p0, :cond_1

    .line 169
    :cond_0
    :goto_0
    return v0

    .line 163
    :cond_1
    array-length v2, p0

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    .line 164
    invoke-virtual {v3}, Ltwitter4j/internal/http/HttpParameter;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 165
    const/4 v0, 0x1

    .line 166
    goto :goto_0

    .line 163
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 259
    const/4 v0, 0x0

    .line 261
    :try_start_0
    const-string v1, "UTF-8"

    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 264
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 266
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 268
    const/16 v4, 0x2a

    if-ne v3, v4, :cond_0

    .line 269
    const-string v3, "%2A"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 270
    :cond_0
    const/16 v4, 0x2b

    if-ne v3, v4, :cond_1

    .line 271
    const-string v3, "%20"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 272
    :cond_1
    const/16 v4, 0x25

    if-ne v3, v4, :cond_2

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x37

    if-ne v4, v5, :cond_2

    add-int/lit8 v4, v1, 0x2

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x45

    if-ne v4, v5, :cond_2

    .line 274
    const/16 v3, 0x7e

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 277
    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 280
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static encodeParameters([Ltwitter4j/internal/http/HttpParameter;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 234
    if-nez p0, :cond_0

    .line 235
    const-string v0, ""

    .line 248
    :goto_0
    return-object v0

    .line 237
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    const/4 v0, 0x0

    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_3

    .line 239
    aget-object v2, p0, v0

    invoke-virtual {v2}, Ltwitter4j/internal/http/HttpParameter;->isFile()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 240
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "parameter ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v0, p0, v0

    iget-object v0, v0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "]should be text"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 242
    :cond_1
    if-eqz v0, :cond_2

    .line 243
    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    :cond_2
    aget-object v2, p0, v0

    iget-object v2, v2, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-static {v2}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, p0, v0

    iget-object v3, v3, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    invoke-static {v3}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 248
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getParameterArray(Ljava/lang/String;I)[Ltwitter4j/internal/http/HttpParameter;
    .locals 1

    .prologue
    .line 189
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ltwitter4j/internal/http/HttpParameter;->getParameterArray(Ljava/lang/String;Ljava/lang/String;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    return-object v0
.end method

.method public static getParameterArray(Ljava/lang/String;ILjava/lang/String;I)[Ltwitter4j/internal/http/HttpParameter;
    .locals 2

    .prologue
    .line 200
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, p2, v1}, Ltwitter4j/internal/http/HttpParameter;->getParameterArray(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    return-object v0
.end method

.method public static getParameterArray(Ljava/lang/String;Ljava/lang/String;)[Ltwitter4j/internal/http/HttpParameter;
    .locals 3

    .prologue
    .line 185
    const/4 v0, 0x1

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    const/4 v1, 0x0

    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    invoke-direct {v2, p0, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static getParameterArray(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ltwitter4j/internal/http/HttpParameter;
    .locals 3

    .prologue
    .line 194
    const/4 v0, 0x2

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    const/4 v1, 0x0

    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    invoke-direct {v2, p0, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    invoke-direct {v2, p2, p3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    return-object v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 225
    check-cast p1, Ltwitter4j/internal/http/HttpParameter;

    .line 226
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    iget-object v1, p1, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 227
    if-nez v0, :cond_0

    .line 228
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    iget-object v1, p1, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 230
    :cond_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 142
    if-ne p0, p1, :cond_1

    .line 155
    :cond_0
    :goto_0
    return v0

    .line 143
    :cond_1
    instance-of v2, p1, Ltwitter4j/internal/http/HttpParameter;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 145
    :cond_2
    check-cast p1, Ltwitter4j/internal/http/HttpParameter;

    .line 147
    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    iget-object v3, p1, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_3
    move v0, v1

    .line 148
    goto :goto_0

    .line 147
    :cond_4
    iget-object v2, p1, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    if-nez v2, :cond_3

    .line 149
    :cond_5
    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    if-eqz v2, :cond_7

    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    iget-object v3, p1, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_6
    move v0, v1

    .line 150
    goto :goto_0

    .line 149
    :cond_7
    iget-object v2, p1, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    if-nez v2, :cond_6

    .line 151
    :cond_8
    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    move v0, v1

    goto :goto_0

    .line 152
    :cond_9
    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 153
    goto :goto_0

    .line 152
    :cond_a
    iget-object v2, p1, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 3

    .prologue
    .line 106
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpParameter;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not a file"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 111
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 112
    const/4 v2, -0x1

    if-eq v2, v1, :cond_6

    .line 116
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_4

    .line 118
    const-string v1, "gif"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 119
    const-string v0, "image/gif"

    .line 137
    :goto_0
    return-object v0

    .line 120
    :cond_1
    const-string v1, "png"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 121
    const-string v0, "image/png"

    goto :goto_0

    .line 122
    :cond_2
    const-string v1, "jpg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 123
    const-string v0, "image/jpeg"

    goto :goto_0

    .line 125
    :cond_3
    const-string v0, "application/octet-stream"

    goto :goto_0

    .line 127
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_6

    .line 128
    const-string v1, "jpeg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 129
    const-string v0, "image/jpeg"

    goto :goto_0

    .line 131
    :cond_5
    const-string v0, "application/octet-stream"

    goto :goto_0

    .line 134
    :cond_6
    const-string v0, "application/octet-stream"

    goto :goto_0
.end method

.method public final getFile()Ljava/io/File;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    return-object v0
.end method

.method public final getFileBody()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final hasFileBody()Z
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 205
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 206
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v2

    .line 207
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 208
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 209
    return v0

    :cond_1
    move v0, v1

    .line 206
    goto :goto_0

    :cond_2
    move v0, v1

    .line 207
    goto :goto_1
.end method

.method public final isFile()Z
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PostParameter{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/http/HttpParameter;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", value=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpParameter;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", file="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpParameter;->file:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fileBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpParameter;->fileBody:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
