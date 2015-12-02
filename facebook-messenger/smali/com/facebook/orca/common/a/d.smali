.class public Lcom/facebook/orca/common/a/d;
.super Ljava/lang/Object;
.source "VersionStringComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-string v0, "(\\d*)(\\D*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/common/a/d;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(II)I
    .locals 1

    .prologue
    .line 77
    if-ge p1, p2, :cond_0

    .line 78
    const/4 v0, -0x1

    .line 82
    :goto_0
    return v0

    .line 79
    :cond_0
    if-le p1, p2, :cond_1

    .line 80
    const/4 v0, 0x1

    goto :goto_0

    .line 82
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 87
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 89
    :goto_0
    return p2

    .line 88
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 13

    .prologue
    const/4 v12, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 26
    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 30
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 31
    array-length v0, v6

    array-length v1, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v8

    move v5, v3

    move v2, v3

    .line 34
    :goto_0
    if-nez v2, :cond_a

    if-ge v5, v8, :cond_a

    .line 35
    array-length v0, v6

    if-ge v5, v0, :cond_1

    aget-object v0, v6, v5

    .line 36
    :goto_1
    array-length v1, v7

    if-ge v5, v1, :cond_2

    aget-object v1, v7, v5

    .line 39
    :goto_2
    sget-object v9, Lcom/facebook/orca/common/a/d;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 40
    sget-object v0, Lcom/facebook/orca/common/a/d;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    move v0, v2

    .line 43
    :cond_0
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    .line 44
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    .line 45
    if-nez v2, :cond_3

    if-nez v11, :cond_3

    .line 34
    :goto_3
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v2, v0

    goto :goto_0

    .line 35
    :cond_1
    const-string v0, ""

    goto :goto_1

    .line 36
    :cond_2
    const-string v1, ""

    goto :goto_2

    .line 51
    :cond_3
    if-eqz v2, :cond_5

    invoke-virtual {v9, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/facebook/orca/common/a/d;->a(Ljava/lang/String;I)I

    move-result v0

    move v1, v0

    .line 52
    :goto_4
    if-eqz v11, :cond_6

    invoke-virtual {v10, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/facebook/orca/common/a/d;->a(Ljava/lang/String;I)I

    move-result v0

    .line 58
    :goto_5
    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/common/a/d;->a(II)I

    move-result v1

    .line 59
    if-nez v1, :cond_b

    .line 60
    if-eqz v2, :cond_7

    invoke-virtual {v9, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 61
    :goto_6
    if-eqz v11, :cond_8

    invoke-virtual {v10, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 62
    :goto_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_9

    move v1, v4

    .line 67
    :cond_4
    :goto_8
    if-nez v1, :cond_b

    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 71
    :goto_9
    if-eqz v0, :cond_0

    goto :goto_3

    :cond_5
    move v1, v3

    .line 51
    goto :goto_4

    :cond_6
    move v0, v3

    .line 52
    goto :goto_5

    .line 60
    :cond_7
    const-string v0, ""

    move-object v2, v0

    goto :goto_6

    .line 61
    :cond_8
    const-string v0, ""

    goto :goto_7

    .line 64
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_4

    .line 65
    const/4 v1, -0x1

    goto :goto_8

    .line 73
    :cond_a
    return v2

    :cond_b
    move v0, v1

    goto :goto_9
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 12
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/common/a/d;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
