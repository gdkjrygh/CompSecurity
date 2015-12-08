.class public Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;
.super Ljava/lang/Object;
.source "LockPatternUtils.java"


# static fields
.field public static final _Sha1:Ljava/lang/String; = "sha-1"

.field public static final _Utf8:Ljava/lang/String; = "utf-8"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static patternToSha1(Ljava/util/List;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 121
    .local p0, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :try_start_0
    const-string v4, "sha-1"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 122
    .local v3, "md":Ljava/security/MessageDigest;
    invoke-static {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "utf-8"

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 124
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 125
    .local v1, "digest":[B
    new-instance v0, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v0, v4, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 126
    .local v0, "bi":Ljava/math/BigInteger;
    const/4 v4, 0x0

    check-cast v4, Ljava/util/Locale;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "%0"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    array-length v6, v1

    mul-int/lit8 v6, v6, 0x2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "x"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 133
    .end local v0    # "bi":Ljava/math/BigInteger;
    .end local v1    # "digest":[B
    .end local v3    # "md":Ljava/security/MessageDigest;
    :goto_0
    return-object v4

    .line 128
    :catch_0
    move-exception v2

    .line 130
    .local v2, "e":Ljava/security/NoSuchAlgorithmException;
    const-string v4, ""

    goto :goto_0

    .line 131
    .end local v2    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v2

    .line 133
    .local v2, "e":Ljava/io/UnsupportedEncodingException;
    const-string v4, ""

    goto :goto_0
.end method

.method public static patternToString(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 71
    .local p0, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    if-nez p0, :cond_0

    .line 72
    const-string v5, ""

    .line 85
    :goto_0
    return-object v5

    .line 74
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    .line 76
    .local v3, "patternSize":I
    new-array v4, v3, [B

    .line 77
    .local v4, "res":[B
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    if-ge v2, v3, :cond_1

    .line 78
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 79
    .local v0, "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v5

    mul-int/lit8 v5, v5, 0x3

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v6

    add-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v2

    .line 77
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 82
    .end local v0    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_1
    :try_start_0
    new-instance v5, Ljava/lang/String;

    const-string v6, "utf-8"

    invoke-direct {v5, v4, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 83
    :catch_0
    move-exception v1

    .line 85
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    const-string v5, ""

    goto :goto_0
.end method

.method public static patternToStringValue(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 98
    .local p0, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    const-string v2, ""

    .line 99
    .local v2, "res":Ljava/lang/String;
    if-nez p0, :cond_0

    .line 100
    const-string v3, ""

    .line 107
    :goto_0
    return-object v3

    .line 103
    :cond_0
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 104
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 105
    .local v0, "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v4

    mul-int/lit8 v4, v4, 0x3

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 103
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .end local v0    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_1
    move-object v3, v2

    .line 107
    goto :goto_0
.end method

.method public static stringToPattern(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .param p0, "string"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;"
        }
    .end annotation

    .prologue
    .line 46
    invoke-static {}, Lgroup/pals/android/lib/ui/lockpattern/collect/Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v3

    .line 49
    .local v3, "result":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :try_start_0
    const-string v4, "utf-8"

    invoke-virtual {p0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 50
    .local v1, "bytes":[B
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, v1

    if-ge v2, v4, :cond_0

    .line 53
    aget-byte v4, v1, v2

    add-int/lit8 v4, v4, -0x31

    int-to-byte v0, v4

    .line 54
    .local v0, "b":B
    div-int/lit8 v4, v0, 0x3

    rem-int/lit8 v5, v0, 0x3

    invoke-static {v4, v5}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->of(II)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    .end local v0    # "b":B
    .end local v1    # "bytes":[B
    .end local v2    # "i":I
    :catch_0
    move-exception v4

    .line 60
    :cond_0
    return-object v3
.end method
