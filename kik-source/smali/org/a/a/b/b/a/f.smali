.class public final Lorg/a/a/b/b/a/f;
.super Lorg/a/a/b/b/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/a/a/b/b/a/f$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/EnumSet;


# direct methods
.method public varargs constructor <init>()V
    .locals 3

    .prologue
    .line 56
    invoke-direct {p0}, Lorg/a/a/b/b/a/b;-><init>()V

    .line 57
    const/4 v0, 0x1

    new-array v0, v0, [Lorg/a/a/b/b/a/f$a;

    const/4 v1, 0x0

    sget-object v2, Lorg/a/a/b/b/a/f$a;->a:Lorg/a/a/b/b/a/f$a;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lorg/a/a/b/b/a/f;->a:Ljava/util/EnumSet;

    .line 62
    return-void
.end method

.method private a(Lorg/a/a/b/b/a/f$a;)Z
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lorg/a/a/b/b/a/f;->a:Ljava/util/EnumSet;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/a/a/b/b/a/f;->a:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 79
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 81
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0x26

    if-ne v0, v3, :cond_1

    add-int/lit8 v0, v5, -0x2

    if-ge p2, v0, :cond_1

    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0x23

    if-ne v0, v3, :cond_1

    .line 82
    add-int/lit8 v0, p2, 0x2

    .line 85
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 86
    const/16 v4, 0x78

    if-eq v3, v4, :cond_0

    const/16 v4, 0x58

    if-ne v3, v4, :cond_d

    .line 87
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 91
    if-ne v0, v5, :cond_2

    .line 137
    :cond_1
    :goto_0
    return v1

    :cond_2
    move v3, v0

    move v0, v2

    :goto_1
    move v6, v3

    .line 98
    :goto_2
    if-ge v6, v5, :cond_6

    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x30

    if-lt v4, v7, :cond_3

    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x39

    if-le v4, v7, :cond_5

    :cond_3
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x61

    if-lt v4, v7, :cond_4

    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x66

    if-le v4, v7, :cond_5

    :cond_4
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x41

    if-lt v4, v7, :cond_6

    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v7, 0x46

    if-gt v4, v7, :cond_6

    .line 102
    :cond_5
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_2

    .line 105
    :cond_6
    if-eq v6, v5, :cond_7

    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x3b

    if-ne v4, v5, :cond_7

    move v5, v2

    .line 107
    :goto_3
    if-nez v5, :cond_8

    .line 108
    sget-object v4, Lorg/a/a/b/b/a/f$a;->a:Lorg/a/a/b/b/a/f$a;

    invoke-direct {p0, v4}, Lorg/a/a/b/b/a/f;->a(Lorg/a/a/b/b/a/f$a;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 111
    sget-object v4, Lorg/a/a/b/b/a/f$a;->c:Lorg/a/a/b/b/a/f$a;

    invoke-direct {p0, v4}, Lorg/a/a/b/b/a/f;->a(Lorg/a/a/b/b/a/f$a;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 112
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Semi-colon required at end of numeric entity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move v5, v1

    .line 105
    goto :goto_3

    .line 118
    :cond_8
    if-eqz v0, :cond_9

    .line 119
    :try_start_0
    invoke-interface {p1, v3, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x10

    invoke-static {v4, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 127
    :goto_4
    const v7, 0xffff

    if-le v4, v7, :cond_a

    .line 128
    invoke-static {v4}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v4

    .line 129
    aget-char v7, v4, v1

    invoke-virtual {p3, v7}, Ljava/io/Writer;->write(I)V

    .line 130
    aget-char v4, v4, v2

    invoke-virtual {p3, v4}, Ljava/io/Writer;->write(I)V

    .line 135
    :goto_5
    add-int/lit8 v4, v6, 0x2

    sub-int v3, v4, v3

    if-eqz v0, :cond_b

    move v0, v2

    :goto_6
    add-int/2addr v0, v3

    if-eqz v5, :cond_c

    :goto_7
    add-int v1, v0, v2

    goto/16 :goto_0

    .line 121
    :cond_9
    :try_start_1
    invoke-interface {p1, v3, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0xa

    invoke-static {v4, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v4

    goto :goto_4

    .line 132
    :cond_a
    invoke-virtual {p3, v4}, Ljava/io/Writer;->write(I)V

    goto :goto_5

    :cond_b
    move v0, v1

    .line 135
    goto :goto_6

    :cond_c
    move v2, v1

    goto :goto_7

    .line 124
    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_d
    move v3, v0

    move v0, v1

    goto/16 :goto_1
.end method
