.class public Lcom/facebook/messages/threads/ui/name/a;
.super Ljava/lang/Object;
.source "TextListWithMoreComputer.java"


# instance fields
.field private final a:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    .line 231
    return-void
.end method

.method private a(Ljava/lang/CharSequence;ZLandroid/text/TextPaint;)F
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 198
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 201
    if-eqz p2, :cond_0

    .line 202
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 206
    :goto_0
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p3, v0, v2, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v0

    return v0

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private a([II)I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 217
    if-eqz p1, :cond_0

    array-length v1, p1

    if-nez v1, :cond_1

    .line 224
    :cond_0
    :goto_0
    return v0

    .line 219
    :cond_1
    array-length v1, p1

    if-eq v1, v2, :cond_2

    const/16 v1, 0xa

    if-ge p2, v1, :cond_3

    .line 220
    :cond_2
    aget v0, p1, v0

    goto :goto_0

    .line 221
    :cond_3
    array-length v0, p1

    if-eq v0, v3, :cond_4

    const/16 v0, 0x64

    if-ge p2, v0, :cond_5

    .line 222
    :cond_4
    aget v0, p1, v2

    goto :goto_0

    .line 224
    :cond_5
    aget v0, p1, v3

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Landroid/text/TextPaint;F)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 179
    const-string v0, "\u2026, "

    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v2

    .line 180
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 184
    invoke-virtual {p2, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 185
    :goto_0
    cmpg-float v3, p3, v0

    if-gez v3, :cond_0

    const/4 v3, 0x3

    if-le v1, v3, :cond_0

    .line 186
    invoke-virtual {p1, v1}, Ljava/lang/String;->codePointBefore(I)I

    move-result v0

    .line 187
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    sub-int/2addr v1, v0

    .line 188
    invoke-virtual {p2, p1, v4, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;II)F

    move-result v0

    add-float/2addr v0, v2

    .line 189
    goto :goto_0

    .line 190
    :cond_0
    cmpl-float v0, p3, v0

    if-ltz v0, :cond_1

    .line 191
    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 193
    :goto_1
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 210
    if-eqz p3, :cond_0

    .line 211
    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;IIILandroid/text/TextPaint;[I)Lcom/facebook/messages/threads/ui/name/c;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;III",
            "Landroid/text/TextPaint;",
            "[I)",
            "Lcom/facebook/messages/threads/ui/name/c;"
        }
    .end annotation

    .prologue
    .line 76
    .line 77
    invoke-virtual/range {p5 .. p5}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v1

    .line 78
    iget v2, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float v8, v2, v1

    .line 79
    move/from16 v0, p4

    int-to-float v1, v0

    invoke-static {v1, v8}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 80
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v9

    .line 81
    invoke-static/range {p1 .. p1}, Lcom/facebook/messages/threads/ui/name/b;->a(Ljava/util/Collection;)Lcom/facebook/messages/threads/ui/name/b;

    move-result-object v10

    .line 82
    const/4 v2, -0x1

    .line 83
    const-string v3, ","

    move-object/from16 v0, p5

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v11

    .line 85
    new-instance v12, Ljava/lang/StringBuilder;

    const/16 v3, 0x64

    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    :goto_0
    if-lez p3, :cond_f

    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->b()I

    move-result v3

    if-lez v3, :cond_f

    cmpl-float v3, v1, v8

    if-ltz v3, :cond_f

    .line 87
    add-int/lit8 p3, p3, -0x1

    .line 88
    sub-float v7, v1, v8

    .line 89
    move/from16 v0, p2

    int-to-float v1, v0

    .line 90
    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    move v3, v1

    move v4, v2

    .line 91
    :goto_1
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 92
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 95
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    :goto_2
    move-object/from16 v0, p5

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/CharSequence;ZLandroid/text/TextPaint;)F

    move-result v5

    .line 100
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->b()I

    move-result v2

    const/4 v6, 0x1

    if-le v2, v6, :cond_11

    if-lez p3, :cond_11

    .line 101
    add-float v2, v5, v11

    .line 104
    :goto_3
    if-lez p3, :cond_5

    cmpl-float v6, v7, v8

    if-ltz v6, :cond_5

    .line 107
    cmpg-float v2, v2, v3

    if-gez v2, :cond_2

    .line 108
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->next()Ljava/lang/Object;

    .line 109
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    :goto_4
    invoke-direct {p0, v12, v1, v2}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    move v2, v4

    .line 166
    :goto_5
    sub-float v1, v3, v5

    move v3, v1

    move v4, v2

    .line 167
    goto :goto_1

    .line 95
    :cond_0
    const/4 v2, 0x0

    goto :goto_2

    .line 109
    :cond_1
    const/4 v2, 0x0

    goto :goto_4

    .line 113
    :cond_2
    const-string v1, ","

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    :cond_3
    :goto_6
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_4

    .line 172
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    move v2, v4

    move v1, v7

    .line 174
    goto :goto_0

    .line 117
    :cond_5
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->b()I

    move-result v2

    const/4 v6, 0x1

    if-ne v2, v6, :cond_8

    .line 118
    cmpg-float v2, v3, v5

    if-gez v2, :cond_6

    .line 119
    const/4 v4, 0x1

    .line 123
    :goto_7
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->next()Ljava/lang/Object;

    move v2, v4

    goto :goto_5

    .line 121
    :cond_6
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_7

    const/4 v2, 0x1

    :goto_8
    invoke-direct {p0, v12, v1, v2}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    goto :goto_8

    .line 126
    :cond_8
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->b()I

    move-result v6

    .line 127
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->b()I

    move-result v2

    move-object/from16 v0, p6

    invoke-direct {p0, v0, v2}, Lcom/facebook/messages/threads/ui/name/a;->a([II)I

    move-result v13

    .line 128
    sub-float v2, v3, v5

    int-to-float v14, v13

    cmpg-float v2, v2, v14

    if-gez v2, :cond_d

    .line 131
    const/4 v2, 0x5

    if-ge v6, v2, :cond_c

    .line 132
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    :goto_9
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 134
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-eqz v5, :cond_a

    :cond_9
    const/4 v5, 0x1

    :goto_a
    invoke-direct {p0, v14, v2, v5}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    goto :goto_a

    .line 141
    :cond_b
    const/4 v2, 0x0

    move-object/from16 v0, p5

    invoke-direct {p0, v14, v2, v0}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/CharSequence;ZLandroid/text/TextPaint;)F

    move-result v2

    .line 142
    cmpg-float v2, v2, v3

    if-gtz v2, :cond_c

    .line 143
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_6

    .line 150
    :cond_c
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-nez v2, :cond_10

    .line 151
    int-to-float v2, v13

    sub-float v2, v3, v2

    move-object/from16 v0, p5

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/String;Landroid/text/TextPaint;F)Ljava/lang/String;

    move-result-object v1

    .line 152
    if-eqz v1, :cond_10

    .line 153
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    const-string v1, "\u2026"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    add-int/lit8 v1, v6, -0x1

    :goto_b
    move v4, v1

    .line 159
    goto/16 :goto_6

    .line 161
    :cond_d
    invoke-virtual {v10}, Lcom/facebook/messages/threads/ui/name/b;->next()Ljava/lang/Object;

    .line 162
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_e

    const/4 v2, 0x1

    :goto_c
    invoke-direct {p0, v12, v1, v2}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    move v2, v4

    goto/16 :goto_5

    :cond_e
    const/4 v2, 0x0

    goto :goto_c

    .line 175
    :cond_f
    new-instance v1, Lcom/facebook/messages/threads/ui/name/c;

    invoke-direct {v1, v9, v2}, Lcom/facebook/messages/threads/ui/name/c;-><init>(Ljava/util/List;I)V

    return-object v1

    :cond_10
    move v1, v6

    goto :goto_b

    :cond_11
    move v2, v5

    goto/16 :goto_3
.end method
