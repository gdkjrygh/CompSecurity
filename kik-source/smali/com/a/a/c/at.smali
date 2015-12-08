.class final Lcom/a/a/c/at;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/at$c;,
        Lcom/a/a/c/at$b;,
        Lcom/a/a/c/at$j;,
        Lcom/a/a/c/at$g;,
        Lcom/a/a/c/at$k;,
        Lcom/a/a/c/at$f;,
        Lcom/a/a/c/at$a;,
        Lcom/a/a/c/at$d;,
        Lcom/a/a/c/at$e;,
        Lcom/a/a/c/at$i;,
        Lcom/a/a/c/at$h;
    }
.end annotation


# static fields
.field private static final a:Lcom/a/a/c/a/a/e;

.field private static final b:[Lcom/a/a/c/at$h;

.field private static final c:[Lcom/a/a/c/at$k;

.field private static final d:[Lcom/a/a/c/at$g;

.field private static final e:[Lcom/a/a/c/at$b;

.field private static final f:[Lcom/a/a/c/at$c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 23
    new-instance v0, Lcom/a/a/c/a/a/e;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/a/a/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/a/a/c/at;->a:Lcom/a/a/c/a/a/e;

    .line 25
    new-array v0, v3, [Lcom/a/a/c/at$h;

    sput-object v0, Lcom/a/a/c/at;->b:[Lcom/a/a/c/at$h;

    .line 26
    new-array v0, v3, [Lcom/a/a/c/at$k;

    sput-object v0, Lcom/a/a/c/at;->c:[Lcom/a/a/c/at$k;

    .line 27
    new-array v0, v3, [Lcom/a/a/c/at$g;

    sput-object v0, Lcom/a/a/c/at;->d:[Lcom/a/a/c/at$g;

    .line 28
    new-array v0, v3, [Lcom/a/a/c/at$b;

    sput-object v0, Lcom/a/a/c/at;->e:[Lcom/a/a/c/at$b;

    .line 30
    new-array v0, v3, [Lcom/a/a/c/at$c;

    sput-object v0, Lcom/a/a/c/at;->f:[Lcom/a/a/c/at$c;

    return-void
.end method

.method private static a([Lcom/a/a/c/a/a/f$a;)Lcom/a/a/c/at$i;
    .locals 4

    .prologue
    .line 496
    if-eqz p0, :cond_0

    array-length v0, p0

    new-array v0, v0, [Lcom/a/a/c/at$g;

    .line 498
    :goto_0
    const/4 v1, 0x0

    :goto_1
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 499
    new-instance v2, Lcom/a/a/c/at$g;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lcom/a/a/c/at$g;-><init>(Lcom/a/a/c/a/a/f$a;)V

    aput-object v2, v0, v1

    .line 498
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 496
    :cond_0
    sget-object v0, Lcom/a/a/c/at;->d:[Lcom/a/a/c/at$g;

    goto :goto_0

    .line 501
    :cond_1
    new-instance v1, Lcom/a/a/c/at$i;

    invoke-direct {v1, v0}, Lcom/a/a/c/at$i;-><init>([Lcom/a/a/c/at$h;)V

    return-object v1
.end method

.method public static a(Lcom/a/a/c/a/a/d;Lcom/a/a/c/f;)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    .line 533
    iget-object v0, p0, Lcom/a/a/c/a/a/d;->b:Lcom/a/a/c/a/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/a/a/d;->b:Lcom/a/a/c/a/a/e;

    :goto_0
    new-instance v3, Lcom/a/a/c/at$j;

    invoke-direct {v3, v0}, Lcom/a/a/c/at$j;-><init>(Lcom/a/a/c/a/a/e;)V

    iget-object v4, p0, Lcom/a/a/c/a/a/d;->c:[Lcom/a/a/c/a/a/f;

    if-eqz v4, :cond_1

    array-length v0, v4

    new-array v0, v0, [Lcom/a/a/c/at$k;

    :goto_1
    move v1, v2

    :goto_2
    array-length v5, v0

    if-ge v1, v5, :cond_2

    aget-object v5, v4, v1

    new-instance v6, Lcom/a/a/c/at$k;

    iget-object v7, v5, Lcom/a/a/c/a/a/f;->c:[Lcom/a/a/c/a/a/f$a;

    invoke-static {v7}, Lcom/a/a/c/at;->a([Lcom/a/a/c/a/a/f$a;)Lcom/a/a/c/at$i;

    move-result-object v7

    invoke-direct {v6, v5, v7}, Lcom/a/a/c/at$k;-><init>(Lcom/a/a/c/a/a/f;Lcom/a/a/c/at$i;)V

    aput-object v6, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_0
    sget-object v0, Lcom/a/a/c/at;->a:Lcom/a/a/c/a/a/e;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/a/a/c/at;->c:[Lcom/a/a/c/at$k;

    goto :goto_1

    :cond_2
    new-instance v4, Lcom/a/a/c/at$i;

    invoke-direct {v4, v0}, Lcom/a/a/c/at$i;-><init>([Lcom/a/a/c/at$h;)V

    iget-object v5, p0, Lcom/a/a/c/a/a/d;->d:[Lcom/a/a/c/a/a/a;

    if-eqz v5, :cond_3

    array-length v0, v5

    new-array v0, v0, [Lcom/a/a/c/at$b;

    :goto_3
    move v1, v2

    :goto_4
    array-length v6, v0

    if-ge v1, v6, :cond_4

    new-instance v6, Lcom/a/a/c/at$b;

    aget-object v7, v5, v1

    invoke-direct {v6, v7}, Lcom/a/a/c/at$b;-><init>(Lcom/a/a/c/a/a/a;)V

    aput-object v6, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_3
    sget-object v0, Lcom/a/a/c/at;->e:[Lcom/a/a/c/at$b;

    goto :goto_3

    :cond_4
    new-instance v1, Lcom/a/a/c/at$i;

    invoke-direct {v1, v0}, Lcom/a/a/c/at$i;-><init>([Lcom/a/a/c/at$h;)V

    new-instance v5, Lcom/a/a/c/at$f;

    invoke-direct {v5, v3, v4, v1}, Lcom/a/a/c/at$f;-><init>(Lcom/a/a/c/at$j;Lcom/a/a/c/at$i;Lcom/a/a/c/at$i;)V

    iget-object v1, p0, Lcom/a/a/c/a/a/d;->e:[Lcom/a/a/c/a/a/b;

    if-eqz v1, :cond_5

    array-length v0, v1

    new-array v0, v0, [Lcom/a/a/c/at$c;

    :goto_5
    array-length v3, v0

    if-ge v2, v3, :cond_6

    new-instance v3, Lcom/a/a/c/at$c;

    aget-object v4, v1, v2

    invoke-direct {v3, v4}, Lcom/a/a/c/at$c;-><init>(Lcom/a/a/c/a/a/b;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    sget-object v0, Lcom/a/a/c/at;->f:[Lcom/a/a/c/at$c;

    goto :goto_5

    :cond_6
    new-instance v1, Lcom/a/a/c/at$i;

    invoke-direct {v1, v0}, Lcom/a/a/c/at$i;-><init>([Lcom/a/a/c/at$h;)V

    new-instance v0, Lcom/a/a/c/at$a;

    invoke-direct {v0, v5, v1}, Lcom/a/a/c/at$a;-><init>(Lcom/a/a/c/at$f;Lcom/a/a/c/at$i;)V

    iget-object v8, p0, Lcom/a/a/c/a/a/d;->f:Lcom/a/a/c/a/a/c;

    new-instance v1, Lcom/a/a/c/at$d;

    iget v2, v8, Lcom/a/a/c/a/a/c;->f:I

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    iget v3, v8, Lcom/a/a/c/a/a/c;->g:I

    iget-boolean v4, v8, Lcom/a/a/c/a/a/c;->h:Z

    iget v5, v8, Lcom/a/a/c/a/a/c;->a:I

    iget-wide v6, v8, Lcom/a/a/c/a/a/c;->b:J

    iget-wide v10, v8, Lcom/a/a/c/a/a/c;->d:J

    sub-long/2addr v6, v10

    iget-wide v10, v8, Lcom/a/a/c/a/a/c;->c:J

    iget-wide v8, v8, Lcom/a/a/c/a/a/c;->e:J

    sub-long v8, v10, v8

    invoke-direct/range {v1 .. v9}, Lcom/a/a/c/at$d;-><init>(FIZIJJ)V

    new-instance v3, Lcom/a/a/c/at$e;

    iget-wide v4, p0, Lcom/a/a/c/a/a/d;->a:J

    const-string v6, "ndk-crash"

    move-object v7, v0

    move-object v8, v1

    invoke-direct/range {v3 .. v8}, Lcom/a/a/c/at$e;-><init>(JLjava/lang/String;Lcom/a/a/c/at$a;Lcom/a/a/c/at$d;)V

    .line 534
    invoke-virtual {v3, p1}, Lcom/a/a/c/at$e;->b(Lcom/a/a/c/f;)V

    .line 535
    return-void
.end method
