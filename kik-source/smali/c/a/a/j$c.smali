.class final Lc/a/a/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/a/a/j$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Lc/a/a/j$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/16 v8, 0x2d

    const/16 v7, 0x39

    const/16 v6, 0x30

    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 85
    if-nez p1, :cond_1

    move v1, v3

    .line 158
    :cond_0
    :goto_0
    return v1

    .line 87
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 88
    if-eqz v2, :cond_0

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 95
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 96
    invoke-static {v0}, Lc/a/a/j;->d(C)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v0}, Lc/a/a/j;->e(C)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 99
    :goto_1
    if-ge v0, v2, :cond_2

    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 101
    invoke-static {v4}, Lc/a/a/j;->c(C)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v4}, Lc/a/a/j;->e(C)Z

    move-result v4

    if-nez v4, :cond_0

    .line 99
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 105
    :cond_2
    invoke-static {p1}, Lc/a/a/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 109
    if-lt v0, v6, :cond_3

    if-le v0, v7, :cond_4

    :cond_3
    if-ne v0, v8, :cond_10

    :cond_4
    move v2, v0

    move v0, v1

    .line 111
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_5

    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 113
    if-lt v2, v6, :cond_5

    if-gt v2, v7, :cond_5

    .line 114
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v0, v4, :cond_0

    .line 119
    const/16 v4, 0x2e

    if-ne v2, v4, :cond_6

    .line 120
    add-int/lit8 v0, v0, 0x1

    .line 121
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_6

    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 123
    if-lt v2, v6, :cond_6

    if-gt v2, v7, :cond_6

    .line 124
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 127
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v0, v4, :cond_0

    .line 130
    const/16 v4, 0x45

    if-ne v2, v4, :cond_7

    const/16 v4, 0x65

    if-eq v2, v4, :cond_8

    :cond_7
    move v1, v3

    .line 131
    goto/16 :goto_0

    .line 132
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_9

    move v1, v3

    .line 134
    goto/16 :goto_0

    .line 135
    :cond_9
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 136
    const/16 v4, 0x2b

    if-eq v2, v4, :cond_a

    if-ne v2, v8, :cond_c

    .line 137
    :cond_a
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_b

    move v1, v3

    .line 139
    goto/16 :goto_0

    .line 140
    :cond_b
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 143
    :cond_c
    const/16 v4, 0x2b

    if-eq v2, v4, :cond_d

    if-ne v2, v8, :cond_e

    .line 144
    :cond_d
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_e

    move v1, v3

    .line 146
    goto/16 :goto_0

    .line 149
    :cond_e
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_f

    .line 150
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 151
    if-lt v2, v6, :cond_f

    if-gt v2, v7, :cond_f

    .line 152
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 154
    :cond_f
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v0, v2, :cond_0

    move v1, v3

    .line 156
    goto/16 :goto_0

    :cond_10
    move v1, v3

    .line 158
    goto/16 :goto_0
.end method
