.class public abstract Landroid_src/mms/transaction/r;
.super Landroid_src/mms/transaction/k;
.source "Transaction.java"


# instance fields
.field private final a:I

.field protected b:Landroid/content/Context;

.field protected c:Ljava/lang/String;

.field protected d:Landroid_src/mms/transaction/x;

.field protected e:Landroid_src/mms/transaction/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid_src/mms/transaction/w;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Landroid_src/mms/transaction/k;-><init>()V

    .line 64
    iput-object p1, p0, Landroid_src/mms/transaction/r;->b:Landroid/content/Context;

    .line 65
    new-instance v0, Landroid_src/mms/transaction/x;

    invoke-direct {v0}, Landroid_src/mms/transaction/x;-><init>()V

    iput-object v0, p0, Landroid_src/mms/transaction/r;->d:Landroid_src/mms/transaction/x;

    .line 66
    iput p2, p0, Landroid_src/mms/transaction/r;->a:I

    .line 67
    iput-object p3, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    .line 68
    return-void
.end method

.method private a(Ljava/lang/String;Landroid_src/mms/transaction/w;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, -0x1

    .line 212
    iget-object v0, p0, Landroid_src/mms/transaction/r;->b:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 216
    invoke-virtual {p2}, Landroid_src/mms/transaction/w;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 217
    invoke-virtual {p2}, Landroid_src/mms/transaction/w;->b()Ljava/lang/String;

    move-result-object v1

    .line 218
    invoke-static {v1}, Landroid_src/mms/transaction/r;->b(Ljava/lang/String;)I

    move-result v1

    .line 219
    if-ne v1, v2, :cond_0

    .line 220
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot establish route for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Unknown host"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 222
    :cond_0
    invoke-virtual {v0, v3, v1}, Landroid/net/ConnectivityManager;->requestRouteToHost(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 224
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot establish route to proxy "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 228
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 229
    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid_src/mms/transaction/r;->b(Ljava/lang/String;)I

    move-result v1

    .line 230
    if-ne v1, v2, :cond_2

    .line 231
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot establish route for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Unknown host"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_2
    invoke-virtual {v0, v3, v1}, Landroid/net/ConnectivityManager;->requestRouteToHost(II)Z

    move-result v0

    if-nez v0, :cond_3

    .line 235
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot establish route to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_3
    return-void
.end method

.method public static b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 252
    :try_start_0
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    .line 259
    const/4 v1, 0x3

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    const/4 v2, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    const/4 v2, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    const/4 v2, 0x0

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 263
    :goto_0
    return v0

    .line 253
    :catch_0
    move-exception v0

    .line 254
    const/4 v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public a(Landroid_src/mms/transaction/w;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    .line 110
    return-void
.end method

.method public a(Landroid_src/mms/transaction/r;)Z
    .locals 2

    .prologue
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid_src/mms/transaction/r;->c:Ljava/lang/String;

    iget-object v1, p1, Landroid_src/mms/transaction/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(J[B)[B
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v0}, Landroid_src/mms/transaction/w;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid_src/mms/transaction/r;->a(J[BLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected a(J[BLjava/lang/String;)[B
    .locals 9

    .prologue
    .line 171
    if-nez p3, :cond_0

    .line 172
    new-instance v0, Landroid_src/mms/d;

    invoke-direct {v0}, Landroid_src/mms/d;-><init>()V

    throw v0

    .line 175
    :cond_0
    iget-object v0, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-direct {p0, p4, v0}, Landroid_src/mms/transaction/r;->a(Ljava/lang/String;Landroid_src/mms/transaction/w;)V

    .line 176
    iget-object v0, p0, Landroid_src/mms/transaction/r;->b:Landroid/content/Context;

    const/4 v5, 0x1

    iget-object v1, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v1}, Landroid_src/mms/transaction/w;->d()Z

    move-result v6

    iget-object v1, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v1}, Landroid_src/mms/transaction/w;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v1}, Landroid_src/mms/transaction/w;->c()I

    move-result v8

    move-wide v1, p1

    move-object v3, p4

    move-object v4, p3

    invoke-static/range {v0 .. v8}, Landroid_src/mms/transaction/c;->a(Landroid/content/Context;JLjava/lang/String;[BIZLjava/lang/String;I)[B

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/String;)[B
    .locals 9

    .prologue
    .line 195
    iget-object v0, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-direct {p0, p1, v0}, Landroid_src/mms/transaction/r;->a(Ljava/lang/String;Landroid_src/mms/transaction/w;)V

    .line 196
    iget-object v0, p0, Landroid_src/mms/transaction/r;->b:Landroid/content/Context;

    const-wide/16 v1, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    iget-object v3, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v3}, Landroid_src/mms/transaction/w;->d()Z

    move-result v6

    iget-object v3, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v3}, Landroid_src/mms/transaction/w;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v3, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v3}, Landroid_src/mms/transaction/w;->c()I

    move-result v8

    move-object v3, p1

    invoke-static/range {v0 .. v8}, Landroid_src/mms/transaction/c;->a(Landroid/content/Context;JLjava/lang/String;[BIZLjava/lang/String;I)[B

    move-result-object v0

    return-object v0
.end method

.method protected a([B)[B
    .locals 3

    .prologue
    .line 123
    const-wide/16 v0, -0x1

    iget-object v2, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    invoke-virtual {v2}, Landroid_src/mms/transaction/w;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, p1, v2}, Landroid_src/mms/transaction/r;->a(J[BLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected a([BLjava/lang/String;)[B
    .locals 2

    .prologue
    .line 139
    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Landroid_src/mms/transaction/r;->a(J[BLjava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract b()I
.end method

.method public d()Landroid_src/mms/transaction/x;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Landroid_src/mms/transaction/r;->d:Landroid_src/mms/transaction/x;

    return-object v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 102
    iget v0, p0, Landroid_src/mms/transaction/r;->a:I

    return v0
.end method

.method public f()Landroid_src/mms/transaction/w;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Landroid_src/mms/transaction/r;->e:Landroid_src/mms/transaction/w;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": serviceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid_src/mms/transaction/r;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
