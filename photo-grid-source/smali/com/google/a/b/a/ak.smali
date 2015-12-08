.class final Lcom/google/a/b/a/ak;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/util/BitSet;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method

.method private static b(Lcom/google/a/d/a;)Ljava/util/BitSet;
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 77
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/google/a/d/a;->j()V

    .line 79
    const/4 v0, 0x0

    .line 114
    :goto_0
    return-object v0

    .line 82
    :cond_0
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    .line 83
    invoke-virtual {p0}, Lcom/google/a/d/a;->a()V

    .line 85
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    move v1, v2

    .line 86
    :goto_1
    sget-object v5, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    if-eq v0, v5, :cond_4

    .line 88
    sget-object v5, Lcom/google/a/b/a/az;->a:[I

    invoke-virtual {v0}, Lcom/google/a/d/e;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 105
    new-instance v1, Lcom/google/a/ag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid bitset value type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/String;)V

    throw v1

    .line 90
    :pswitch_0
    invoke-virtual {p0}, Lcom/google/a/d/a;->m()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    .line 107
    :goto_2
    if-eqz v0, :cond_1

    .line 108
    invoke-virtual {v4, v1}, Ljava/util/BitSet;->set(I)V

    .line 110
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 111
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 90
    goto :goto_2

    .line 93
    :pswitch_1
    invoke-virtual {p0}, Lcom/google/a/d/a;->i()Z

    move-result v0

    goto :goto_2

    .line 96
    :pswitch_2
    invoke-virtual {p0}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v0

    .line 98
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_2

    .line 100
    :catch_0
    move-exception v1

    new-instance v1, Lcom/google/a/ag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error: Expecting: bitset number value (1, 0), Found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/String;)V

    throw v1

    .line 113
    :cond_4
    invoke-virtual {p0}, Lcom/google/a/d/a;->b()V

    move-object v0, v4

    .line 114
    goto :goto_0

    .line 88
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 75
    invoke-static {p1}, Lcom/google/a/b/a/ak;->b(Lcom/google/a/d/a;)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 75
    check-cast p2, Ljava/util/BitSet;

    .line 1118
    if-nez p2, :cond_0

    .line 1119
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1120
    :goto_0
    return-void

    .line 1123
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/f;->b()Lcom/google/a/d/f;

    move v0, v1

    .line 1124
    :goto_1
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 1125
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 1126
    :goto_2
    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1124
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move v2, v1

    .line 1125
    goto :goto_2

    .line 1128
    :cond_2
    invoke-virtual {p1}, Lcom/google/a/d/f;->c()Lcom/google/a/d/f;

    goto :goto_0
.end method
