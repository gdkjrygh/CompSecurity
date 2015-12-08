.class final Lc/a/a/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/j$a;,
        Lc/a/a/j$b;,
        Lc/a/a/j$g;,
        Lc/a/a/j$c;,
        Lc/a/a/j$d;,
        Lc/a/a/j$e;,
        Lc/a/a/j$f;
    }
.end annotation


# static fields
.field public static final a:Lc/a/a/j$d;

.field public static final b:Lc/a/a/j$e;

.field public static final c:Lc/a/a/j$c;

.field public static final d:Lc/a/a/j$b;

.field public static final e:Lc/a/a/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27
    new-instance v0, Lc/a/a/j$d;

    invoke-direct {v0, v1}, Lc/a/a/j$d;-><init>(B)V

    sput-object v0, Lc/a/a/j;->a:Lc/a/a/j$d;

    .line 28
    new-instance v0, Lc/a/a/j$e;

    invoke-direct {v0, v1}, Lc/a/a/j$e;-><init>(B)V

    sput-object v0, Lc/a/a/j;->b:Lc/a/a/j$e;

    .line 29
    new-instance v0, Lc/a/a/j$c;

    invoke-direct {v0, v1}, Lc/a/a/j$c;-><init>(B)V

    sput-object v0, Lc/a/a/j;->c:Lc/a/a/j$c;

    .line 31
    new-instance v0, Lc/a/a/j$b;

    invoke-direct {v0, v1}, Lc/a/a/j$b;-><init>(B)V

    sput-object v0, Lc/a/a/j;->d:Lc/a/a/j$b;

    .line 32
    new-instance v0, Lc/a/a/j$a;

    invoke-direct {v0, v1}, Lc/a/a/j$a;-><init>(B)V

    sput-object v0, Lc/a/a/j;->e:Lc/a/a/j$a;

    return-void
.end method

.method public static a(C)Z
    .locals 1

    .prologue
    .line 163
    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 187
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    .line 198
    :cond_0
    :goto_0
    return v0

    .line 189
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 190
    const/16 v2, 0x6e

    if-ne v1, v2, :cond_2

    .line 191
    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 192
    :cond_2
    const/16 v2, 0x74

    if-ne v1, v2, :cond_3

    .line 193
    const-string v0, "true"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 194
    :cond_3
    const/16 v2, 0x66

    if-ne v1, v2, :cond_4

    .line 195
    const-string v0, "false"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 196
    :cond_4
    const/16 v2, 0x4e

    if-ne v1, v2, :cond_0

    .line 197
    const-string v0, "NaN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public static b(C)Z
    .locals 1

    .prologue
    .line 167
    const/16 v0, 0x8

    if-eq p0, v0, :cond_0

    const/16 v0, 0xc

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c(C)Z
    .locals 1

    .prologue
    .line 175
    const/16 v0, 0x7d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x3a

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d(C)Z
    .locals 1

    .prologue
    .line 179
    const/16 v0, 0x7b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p0, v0, :cond_0

    const/16 v0, 0x7d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x3a

    if-eq p0, v0, :cond_0

    const/16 v0, 0x27

    if-eq p0, v0, :cond_0

    const/16 v0, 0x22

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e(C)Z
    .locals 1

    .prologue
    .line 183
    if-ltz p0, :cond_0

    const/16 v0, 0x1f

    if-le p0, v0, :cond_2

    :cond_0
    const/16 v0, 0x7f

    if-lt p0, v0, :cond_1

    const/16 v0, 0x9f

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x2000

    if-lt p0, v0, :cond_3

    const/16 v0, 0x20ff

    if-gt p0, v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
