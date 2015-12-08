.class final Lcom/cleanmaster/sdk/cmloginsdkjar/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private final b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;)V
    .locals 1

    .prologue
    .line 2030
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2028
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->c:Z

    .line 2031
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    .line 2032
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    .line 2033
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 2158
    const-string v0, "--%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2159
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 2117
    if-nez p3, :cond_0

    .line 2118
    const-string p3, "content/unknown"

    .line 2120
    :cond_0
    invoke-direct {p0, p1, p1, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2124
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;

    if-eqz v0, :cond_2

    .line 2126
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a(J)V

    move v0, v1

    .line 2150
    :goto_0
    const-string v2, ""

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2151
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a()V

    .line 2152
    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    if-eqz v2, :cond_1

    .line 2153
    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "    "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "<Data: %d>"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2155
    :cond_1
    return-void

    .line 2132
    :cond_2
    :try_start_0
    new-instance v4, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v4, p2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2133
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2135
    const/16 v0, 0x2000

    :try_start_2
    new-array v3, v0, [B

    move v0, v1

    .line 2137
    :goto_1
    invoke-virtual {v2, v3}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_3

    .line 2138
    iget-object v6, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    const/4 v7, 0x0

    invoke-virtual {v6, v3, v7, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2139
    add-int/2addr v0, v5

    goto :goto_1

    .line 2143
    :cond_3
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 2146
    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;->close()V

    goto :goto_0

    .line 2142
    :catchall_0
    move-exception v0

    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_4

    .line 2143
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    .line 2145
    :cond_4
    if-eqz v3, :cond_5

    .line 2146
    invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;->close()V

    :cond_5
    throw v0

    .line 2142
    :catchall_1
    move-exception v0

    move-object v1, v3

    move-object v3, v4

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v3, v4

    goto :goto_2
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 2162
    const-string v0, "Content-Disposition: form-data; name=\"%s\""

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2163
    if-eqz p2, :cond_0

    .line 2164
    const-string v0, "; filename=\"%s\""

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2166
    :cond_0
    const-string v0, ""

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2167
    if-eqz p3, :cond_1

    .line 2168
    const-string v0, "%s: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Content-Type"

    aput-object v2, v1, v3

    aput-object p3, v1, v4

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2170
    :cond_1
    const-string v0, ""

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2171
    return-void
.end method

.method private varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 2174
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->c:Z

    if-eqz v0, :cond_0

    .line 2176
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    const-string v1, "--"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2177
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    const-string v1, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2178
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    const-string v1, "\r\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->c:Z

    .line 2181
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2182
    return-void
.end method

.method private varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 2185
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2186
    const-string v0, "\r\n"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2187
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 2036
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;

    if-eqz v0, :cond_0

    .line 2037
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;

    invoke-interface {v0, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;->a(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    .line 2040
    :cond_0
    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedParameterType(Ljava/lang/Object;)Z
    invoke-static {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->access$000(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2041
    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;
    invoke-static {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->access$100(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2049
    :cond_1
    :goto_0
    return-void

    .line 2042
    :cond_2
    instance-of v0, p2, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 2043
    check-cast p2, Landroid/graphics/Bitmap;

    .line 3092
    const-string v0, "image/png"

    invoke-direct {p0, p1, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3094
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    invoke-virtual {p2, v0, v1, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 3095
    const-string v0, ""

    new-array v1, v5, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3096
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a()V

    .line 3097
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    if-eqz v0, :cond_1

    .line 3098
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "<Image>"

    invoke-virtual {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 2044
    :cond_3
    instance-of v0, p2, [B

    if-eqz v0, :cond_4

    .line 2045
    check-cast p2, [B

    .line 3103
    const-string v0, "content/unknown"

    invoke-direct {p0, p1, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3104
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 3105
    const-string v0, ""

    new-array v1, v5, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3106
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a()V

    .line 3107
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    if-eqz v0, :cond_1

    .line 3108
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "<Data: %d>"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    array-length v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 2046
    :cond_4
    instance-of v0, p2, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_5

    .line 2047
    check-cast p2, Landroid/os/ParcelFileDescriptor;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2048
    :cond_5
    instance-of v0, p2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;

    if-eqz v0, :cond_6

    .line 2049
    check-cast p2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;

    .line 3113
    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->b()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2051
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value is not a supported type: String, Bitmap, byte[]"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 2083
    invoke-direct {p0, p1, v0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2084
    const-string v0, "%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2085
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a()V

    .line 2086
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    if-eqz v0, :cond_0

    .line 2087
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2089
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONArray;",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 2057
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;

    if-nez v0, :cond_1

    .line 2058
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2080
    :cond_0
    :goto_0
    return-void

    .line 2062
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a:Ljava/io/OutputStream;

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;

    .line 2063
    invoke-direct {p0, p1, v1, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2064
    const-string v1, "["

    new-array v2, v3, [Ljava/lang/Object;

    invoke-direct {p0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2066
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v3

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 2067
    invoke-virtual {p2, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 2068
    invoke-interface {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/ab;->a(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    .line 2069
    if-lez v2, :cond_2

    .line 2070
    const-string v1, ",%s"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v3

    invoke-direct {p0, v1, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2074
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    .line 2075
    goto :goto_1

    .line 2072
    :cond_2
    const-string v1, "%s"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v3

    invoke-direct {p0, v1, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 2076
    :cond_3
    const-string v0, "]"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2077
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    if-eqz v0, :cond_0

    .line 2078
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method
