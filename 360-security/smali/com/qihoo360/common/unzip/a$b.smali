.class public Lcom/qihoo360/common/unzip/a$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Enumeration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/unzip/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Enumeration",
        "<",
        "Lcom/qihoo360/common/unzip/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/common/unzip/a;

.field private b:Z

.field private c:J


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/unzip/a;)V
    .locals 2

    .prologue
    .line 38
    iput-object p1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$b;->b:Z

    .line 47
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/qihoo360/common/unzip/a$b;->c:J

    return-void
.end method

.method private a([B)Ljava/lang/String;
    .locals 3

    .prologue
    .line 156
    array-length v0, p1

    new-array v1, v0, [C

    .line 157
    const/4 v0, 0x0

    :goto_0
    array-length v2, p1

    if-lt v0, v2, :cond_0

    .line 160
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 158
    :cond_0
    aget-byte v2, p1, v0

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 157
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private b()Lcom/qihoo360/common/unzip/a$a;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 82
    new-instance v0, Lcom/qihoo360/common/unzip/a$a;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-direct {v0, v1}, Lcom/qihoo360/common/unzip/a$a;-><init>(Lcom/qihoo360/common/unzip/a;)V

    .line 84
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v1, v1, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 91
    const/4 v1, 0x4

    .line 94
    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-static {v2, v1}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/common/unzip/a$a;->b:I

    .line 95
    const/4 v1, 0x6

    .line 98
    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-static {v2, v1}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/common/unzip/a$a;->c:I

    .line 105
    const/16 v1, 0x10

    .line 108
    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-static {v2, v1}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([BI)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo360/common/unzip/a$a;->d:J

    .line 112
    const/16 v1, 0x18

    .line 114
    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-static {v2, v1}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v1

    .line 115
    const/16 v2, 0x1a

    .line 118
    iget-object v3, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v3}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v3

    invoke-static {v3, v2}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v2

    .line 119
    const/16 v3, 0x1c

    .line 122
    iget-object v4, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v4}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v4

    invoke-static {v4, v3}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v3

    .line 132
    const/16 v4, 0x26

    .line 134
    new-array v1, v1, [B

    .line 135
    iget-object v5, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v5, v5, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v5, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 136
    invoke-direct {p0, v1}, Lcom/qihoo360/common/unzip/a$b;->a([B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/common/unzip/a$a;->a:Ljava/lang/String;

    .line 139
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1}, Lcom/qihoo360/common/unzip/a;->b(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v1

    invoke-static {v1, v4}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([BI)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/qihoo360/common/unzip/a$a;->e:J

    .line 141
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1, v2}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;I)V

    .line 142
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1, v3}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;I)V

    .line 144
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v1, v1, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo360/common/unzip/a$b;->c:J

    .line 147
    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/a$a;->c()V

    .line 149
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v1, v1, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$b;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 151
    return-object v0
.end method


# virtual methods
.method public a()Lcom/qihoo360/common/unzip/a$a;
    .locals 6

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/qihoo360/common/unzip/a$b;->b:Z

    if-eqz v0, :cond_2

    .line 58
    :try_start_0
    iget-wide v0, p0, Lcom/qihoo360/common/unzip/a$b;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$b;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 60
    :cond_0
    invoke-direct {p0}, Lcom/qihoo360/common/unzip/a$b;->b()Lcom/qihoo360/common/unzip/a$a;

    move-result-object v1

    .line 61
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 62
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([B)J

    move-result-wide v2

    invoke-static {}, Lcom/qihoo360/common/unzip/a;->c()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$b;->b:Z

    .line 64
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$b;->a:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo360/common/unzip/a$b;->c:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-object v1

    .line 62
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 74
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasMoreElements()Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/qihoo360/common/unzip/a$b;->b:Z

    return v0
.end method

.method public synthetic nextElement()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/qihoo360/common/unzip/a$b;->a()Lcom/qihoo360/common/unzip/a$a;

    move-result-object v0

    return-object v0
.end method
