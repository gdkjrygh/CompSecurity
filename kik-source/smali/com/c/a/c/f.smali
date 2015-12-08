.class final enum Lcom/c/a/c/f;
.super Lcom/c/a/c/d;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 90
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/c/a/c/d;-><init>(Ljava/lang/String;IB)V

    return-void
.end method

.method private static a([B)J
    .locals 8

    .prologue
    .line 129
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    const/4 v1, 0x6

    aget-byte v1, p0, v1

    const/4 v2, 0x5

    aget-byte v2, p0, v2

    const/4 v3, 0x4

    aget-byte v3, p0, v3

    const/4 v4, 0x3

    aget-byte v4, p0, v4

    const/4 v5, 0x2

    aget-byte v5, p0, v5

    const/4 v6, 0x1

    aget-byte v6, p0, v6

    const/4 v7, 0x0

    aget-byte v7, p0, v7

    invoke-static/range {v0 .. v7}, Lcom/c/a/g/b;->a(BBBBBBBB)J

    move-result-wide v0

    return-wide v0
.end method

.method private static b([B)J
    .locals 8

    .prologue
    .line 134
    const/16 v0, 0xf

    aget-byte v0, p0, v0

    const/16 v1, 0xe

    aget-byte v1, p0, v1

    const/16 v2, 0xd

    aget-byte v2, p0, v2

    const/16 v3, 0xc

    aget-byte v3, p0, v3

    const/16 v4, 0xb

    aget-byte v4, p0, v4

    const/16 v5, 0xa

    aget-byte v5, p0, v5

    const/16 v6, 0x9

    aget-byte v6, p0, v6

    const/16 v7, 0x8

    aget-byte v7, p0, v7

    invoke-static/range {v0 .. v7}, Lcom/c/a/g/b;->a(BBBBBBBB)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/c/a/c/g;ILcom/c/a/c/d$a;)Z
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 94
    invoke-virtual {p4}, Lcom/c/a/c/d$a;->a()J

    move-result-wide v4

    .line 95
    invoke-static {}, Lcom/c/a/c/l;->a()Lcom/c/a/c/j;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/c/a/c/j;->a(Ljava/lang/Object;Lcom/c/a/c/g;)Lcom/c/a/c/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/c/i;->e()[B

    move-result-object v3

    .line 96
    invoke-static {v3}, Lcom/c/a/c/f;->a([B)J

    move-result-wide v0

    .line 97
    invoke-static {v3}, Lcom/c/a/c/f;->b([B)J

    move-result-wide v6

    move v3, v2

    .line 101
    :goto_0
    if-ge v2, p3, :cond_0

    .line 103
    const-wide v8, 0x7fffffffffffffffL

    and-long/2addr v8, v0

    rem-long/2addr v8, v4

    invoke-virtual {p4, v8, v9}, Lcom/c/a/c/d$a;->a(J)Z

    move-result v8

    or-int/2addr v3, v8

    .line 104
    add-long/2addr v0, v6

    .line 101
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 106
    :cond_0
    return v3
.end method

.method public final b(Ljava/lang/Object;Lcom/c/a/c/g;ILcom/c/a/c/d$a;)Z
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 112
    invoke-virtual {p4}, Lcom/c/a/c/d$a;->a()J

    move-result-wide v4

    .line 113
    invoke-static {}, Lcom/c/a/c/l;->a()Lcom/c/a/c/j;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/c/a/c/j;->a(Ljava/lang/Object;Lcom/c/a/c/g;)Lcom/c/a/c/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/a/c/i;->e()[B

    move-result-object v1

    .line 114
    invoke-static {v1}, Lcom/c/a/c/f;->a([B)J

    move-result-wide v2

    .line 115
    invoke-static {v1}, Lcom/c/a/c/f;->b([B)J

    move-result-wide v6

    move v1, v0

    .line 118
    :goto_0
    if-ge v1, p3, :cond_1

    .line 120
    const-wide v8, 0x7fffffffffffffffL

    and-long/2addr v8, v2

    rem-long/2addr v8, v4

    invoke-virtual {p4, v8, v9}, Lcom/c/a/c/d$a;->b(J)Z

    move-result v8

    if-nez v8, :cond_0

    .line 125
    :goto_1
    return v0

    .line 123
    :cond_0
    add-long/2addr v2, v6

    .line 118
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 125
    :cond_1
    const/4 v0, 0x1

    goto :goto_1
.end method
