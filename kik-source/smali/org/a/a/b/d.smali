.class public final Lorg/a/a/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 148
    const-string v0, "\\s+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/a/a/b/d;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v3, -0x1

    .line 3828
    invoke-static {p0}, Lorg/a/a/b/d;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/a/a/b/d;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    if-eq v2, v3, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    if-gez v0, :cond_2

    move v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x10

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v0, v6

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    move v1, v2

    move v2, v3

    :goto_1
    if-eq v1, v3, :cond_3

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v0, v1, v4

    add-int/lit8 v2, v2, -0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static a(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 184
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/CharSequence;[C)Z
    .locals 11

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1580
    invoke-static {p0}, Lorg/a/a/b/d;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Lorg/a/a/b/a;->a([C)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 1606
    :cond_1
    :goto_0
    return v0

    .line 1583
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 1584
    array-length v5, p1

    .line 1585
    add-int/lit8 v6, v4, -0x1

    .line 1586
    add-int/lit8 v7, v5, -0x1

    move v3, v1

    .line 1587
    :goto_1
    if-ge v3, v4, :cond_5

    .line 1588
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    move v2, v1

    .line 1589
    :goto_2
    if-ge v2, v5, :cond_4

    .line 1590
    aget-char v9, p1, v2

    if-ne v9, v8, :cond_3

    .line 1591
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1592
    if-eq v2, v7, :cond_1

    .line 1596
    if-ge v3, v6, :cond_3

    add-int/lit8 v9, v2, 0x1

    aget-char v9, p1, v9

    add-int/lit8 v10, v3, 0x1

    invoke-interface {p0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_1

    .line 1589
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1587
    :cond_4
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_5
    move v0, v1

    .line 1606
    goto :goto_0
.end method

.method public static varargs b(Ljava/lang/CharSequence;[C)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1836
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v0, v1

    .line 1862
    :cond_1
    :goto_0
    return v0

    .line 1839
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 1840
    add-int/lit8 v5, v4, -0x1

    .line 1841
    array-length v6, p1

    .line 1842
    add-int/lit8 v7, v6, -0x1

    move v3, v0

    .line 1843
    :goto_1
    if-ge v3, v4, :cond_5

    .line 1844
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    move v2, v0

    .line 1845
    :goto_2
    if-ge v2, v6, :cond_4

    .line 1846
    aget-char v9, p1, v2

    if-ne v9, v8, :cond_3

    .line 1847
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1848
    if-eq v2, v7, :cond_1

    .line 1852
    if-ge v3, v5, :cond_3

    add-int/lit8 v9, v2, 0x1

    aget-char v9, p1, v9

    add-int/lit8 v10, v3, 0x1

    invoke-interface {p0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_1

    .line 1845
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1843
    :cond_4
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_5
    move v0, v1

    .line 1862
    goto :goto_0
.end method
