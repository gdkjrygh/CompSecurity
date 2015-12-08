.class final Lcom/c/c/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/c/a/a/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-string v0, ""

    invoke-static {v0}, Lcom/c/a/a/r;->a(Ljava/lang/String;)Lcom/c/a/a/r;

    move-result-object v0

    sput-object v0, Lcom/c/c/a/c;->a:Lcom/c/a/a/r;

    return-void
.end method

.method private static a(Ljava/util/List;Ljava/lang/CharSequence;Lcom/c/a/b/o$a;)I
    .locals 11

    .prologue
    .line 65
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 66
    const/4 v1, 0x0

    .line 67
    const/4 v0, 0x0

    move v3, v1

    .line 70
    :goto_0
    if-ge v3, v4, :cond_0

    .line 71
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 72
    const/16 v1, 0x26

    if-eq v0, v1, :cond_0

    const/16 v1, 0x3f

    if-eq v0, v1, :cond_0

    const/16 v1, 0x21

    if-eq v0, v1, :cond_0

    const/16 v1, 0x3a

    if-eq v0, v1, :cond_0

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_0

    .line 73
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    .line 77
    :cond_0
    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const/4 v2, 0x1

    if-gt v6, v2, :cond_6

    :goto_1
    invoke-interface {p0, v5, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 79
    const/16 v1, 0x21

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3a

    if-eq v0, v1, :cond_1

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_2

    .line 84
    :cond_1
    sget-object v1, Lcom/c/c/a/c;->a:Lcom/c/a/a/r;

    invoke-virtual {v1, p0}, Lcom/c/a/a/r;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 86
    invoke-static {v0}, Lcom/c/c/a/b;->a(C)Lcom/c/c/a/b;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/c/a/b/o$a;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/o$a;

    .line 89
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 91
    const/16 v2, 0x3f

    if-eq v0, v2, :cond_9

    const/16 v2, 0x2c

    if-eq v0, v2, :cond_9

    move v0, v1

    .line 92
    :cond_3
    if-ge v0, v4, :cond_5

    .line 94
    invoke-interface {p1, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p0, v1, p2}, Lcom/c/c/a/c;->a(Ljava/util/List;Ljava/lang/CharSequence;Lcom/c/a/b/o$a;)I

    move-result v1

    add-int/2addr v0, v1

    .line 95
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x3f

    if-eq v1, v2, :cond_4

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_3

    .line 97
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 98
    :cond_5
    :goto_2
    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 103
    return v0

    .line 77
    :cond_6
    new-array v7, v6, [C

    const/4 v2, 0x0

    add-int/lit8 v8, v6, -0x1

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    aput-char v8, v7, v2

    const/4 v2, 0x1

    :goto_3
    if-ge v2, v6, :cond_8

    add-int/lit8 v8, v6, -0x1

    sub-int/2addr v8, v2

    invoke-interface {v1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    aput-char v8, v7, v2

    aget-char v8, v7, v2

    add-int/lit8 v9, v2, -0x1

    aget-char v9, v7, v9

    invoke-static {v8, v9}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v8

    if-eqz v8, :cond_7

    add-int/lit8 v8, v2, -0x1

    aget-char v9, v7, v8

    aget-char v10, v7, v2

    aput-char v10, v7, v8

    aput-char v9, v7, v2

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v7}, Ljava/lang/String;-><init>([C)V

    goto/16 :goto_1

    :cond_9
    move v0, v1

    goto :goto_2
.end method

.method static a(Ljava/lang/CharSequence;)Lcom/c/a/b/o;
    .locals 5

    .prologue
    .line 39
    invoke-static {}, Lcom/c/a/b/o;->h()Lcom/c/a/b/o$a;

    move-result-object v1

    .line 40
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 41
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-ge v0, v2, :cond_0

    .line 43
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {p0, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v3, v4, v1}, Lcom/c/c/a/c;->a(Ljava/util/List;Ljava/lang/CharSequence;Lcom/c/a/b/o$a;)I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v1}, Lcom/c/a/b/o$a;->a()Lcom/c/a/b/o;

    move-result-object v0

    return-object v0
.end method
