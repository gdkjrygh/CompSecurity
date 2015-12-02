.class public La/a/d;
.super Ljava/lang/Object;
.source "MyersDiff.java"

# interfaces
.implements La/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    return-void
.end method

.method public static a(La/a/e;[Ljava/lang/Object;[Ljava/lang/Object;)La/i;
    .locals 7

    .prologue
    .line 189
    if-nez p0, :cond_0

    .line 190
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "path is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_0
    if-nez p1, :cond_1

    .line 192
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "original sequence is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 193
    :cond_1
    if-nez p2, :cond_2

    .line 194
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "revised sequence is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 196
    :cond_2
    new-instance v2, La/i;

    invoke-direct {v2}, La/i;-><init>()V

    .line 197
    invoke-virtual {p0}, La/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 198
    iget-object v0, p0, La/a/e;->c:La/a/e;

    .line 199
    :goto_0
    if-eqz v0, :cond_6

    iget-object v1, v0, La/a/e;->c:La/a/e;

    if-eqz v1, :cond_6

    iget-object v1, v0, La/a/e;->c:La/a/e;

    iget v1, v1, La/a/e;->b:I

    if-ltz v1, :cond_6

    .line 200
    invoke-virtual {v0}, La/a/e;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 201
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "bad diffpath: found snake when looking for diff"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 202
    :cond_3
    iget v3, v0, La/a/e;->a:I

    .line 203
    iget v4, v0, La/a/e;->b:I

    .line 205
    iget-object v1, v0, La/a/e;->c:La/a/e;

    .line 206
    iget v0, v1, La/a/e;->a:I

    .line 207
    iget v5, v1, La/a/e;->b:I

    .line 209
    new-instance v6, La/b;

    invoke-static {p1, v0, v3}, La/a/d;->a([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v6, v0, v3}, La/b;-><init>(I[Ljava/lang/Object;)V

    .line 210
    new-instance v3, La/b;

    invoke-static {p2, v5, v4}, La/a/d;->a([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v3, v5, v0}, La/b;-><init>(I[Ljava/lang/Object;)V

    .line 212
    invoke-virtual {v6}, La/b;->c()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v3}, La/b;->c()I

    move-result v0

    if-eqz v0, :cond_4

    .line 213
    new-instance v0, La/h;

    invoke-direct {v0, v6, v3}, La/h;-><init>(La/b;La/b;)V

    .line 220
    :goto_1
    invoke-virtual {v2, v0}, La/i;->a(La/d;)V

    .line 221
    invoke-virtual {v1}, La/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 222
    iget-object v0, v1, La/a/e;->c:La/a/e;

    goto :goto_0

    .line 214
    :cond_4
    invoke-virtual {v6}, La/b;->c()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {v3}, La/b;->c()I

    move-result v0

    if-nez v0, :cond_5

    .line 215
    new-instance v0, La/c;

    invoke-direct {v0, v6, v3}, La/c;-><init>(La/b;La/b;)V

    goto :goto_1

    .line 217
    :cond_5
    new-instance v0, La/a;

    invoke-direct {v0, v6, v3}, La/a;-><init>(La/b;La/b;)V

    goto :goto_1

    .line 224
    :cond_6
    return-object v2

    :cond_7
    move-object v0, v1

    goto :goto_0

    :cond_8
    move-object v0, p0

    goto :goto_0
.end method

.method public static a([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)[TT;"
        }
    .end annotation

    .prologue
    .line 233
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, La/a/d;->a([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">([TU;II",
            "Ljava/lang/Class",
            "<+[TT;>;)[TT;"
        }
    .end annotation

    .prologue
    .line 242
    sub-int v1, p2, p1

    .line 243
    if-gez v1, :cond_0

    .line 244
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_0
    const-class v0, [Ljava/lang/Object;

    if-ne p3, v0, :cond_1

    new-array v0, v1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 247
    :goto_0
    const/4 v2, 0x0

    array-length v3, p0

    sub-int/2addr v3, p1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p0, p1, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 248
    return-object v0

    .line 245
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0
.end method

.method public static b([Ljava/lang/Object;[Ljava/lang/Object;)La/a/e;
    .locals 14

    .prologue
    const/4 v0, 0x0

    const/4 v13, 0x0

    .line 118
    if-nez p0, :cond_0

    .line 119
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "original sequence is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    if-nez p1, :cond_1

    .line 121
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "revised sequence is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_1
    array-length v6, p0

    .line 125
    array-length v7, p1

    .line 127
    add-int v1, v6, v7

    add-int/lit8 v8, v1, 0x1

    .line 128
    mul-int/lit8 v1, v8, 0x2

    add-int/lit8 v1, v1, 0x1

    .line 129
    div-int/lit8 v9, v1, 0x2

    .line 130
    new-array v10, v1, [La/a/e;

    .line 132
    add-int/lit8 v1, v9, 0x1

    new-instance v2, La/a/f;

    const/4 v3, -0x1

    invoke-direct {v2, v0, v3, v13}, La/a/f;-><init>(IILa/a/e;)V

    aput-object v2, v10, v1

    move v5, v0

    .line 133
    :goto_0
    if-ge v5, v8, :cond_7

    .line 134
    neg-int v0, v5

    move v4, v0

    :goto_1
    if-gt v4, v5, :cond_6

    .line 135
    add-int v11, v9, v4

    .line 136
    add-int/lit8 v1, v11, 0x1

    .line 137
    add-int/lit8 v2, v11, -0x1

    .line 141
    neg-int v0, v5

    if-eq v4, v0, :cond_2

    if-eq v4, v5, :cond_3

    aget-object v0, v10, v2

    iget v0, v0, La/a/e;->a:I

    aget-object v3, v10, v1

    iget v3, v3, La/a/e;->a:I

    if-ge v0, v3, :cond_3

    .line 142
    :cond_2
    aget-object v0, v10, v1

    iget v0, v0, La/a/e;->a:I

    .line 143
    aget-object v1, v10, v1

    .line 149
    :goto_2
    aput-object v13, v10, v2

    .line 151
    sub-int v3, v0, v4

    .line 153
    new-instance v2, La/a/b;

    invoke-direct {v2, v0, v3, v1}, La/a/b;-><init>(IILa/a/e;)V

    move v1, v3

    move v3, v0

    .line 158
    :goto_3
    if-ge v3, v6, :cond_4

    if-ge v1, v7, :cond_4

    aget-object v0, p0, v3

    aget-object v12, p1, v1

    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 145
    :cond_3
    aget-object v0, v10, v2

    iget v0, v0, La/a/e;->a:I

    add-int/lit8 v0, v0, 0x1

    .line 146
    aget-object v1, v10, v2

    goto :goto_2

    .line 162
    :cond_4
    iget v0, v2, La/a/e;->a:I

    if-le v3, v0, :cond_8

    .line 163
    new-instance v0, La/a/f;

    invoke-direct {v0, v3, v1, v2}, La/a/f;-><init>(IILa/a/e;)V

    .line 165
    :goto_4
    aput-object v0, v10, v11

    .line 167
    if-lt v3, v6, :cond_5

    if-lt v1, v7, :cond_5

    .line 168
    aget-object v0, v10, v11

    return-object v0

    .line 134
    :cond_5
    add-int/lit8 v0, v4, 0x2

    move v4, v0

    goto :goto_1

    .line 171
    :cond_6
    add-int v0, v9, v5

    add-int/lit8 v0, v0, -0x1

    aput-object v13, v10, v0

    .line 133
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_0

    .line 175
    :cond_7
    new-instance v0, La/a/c;

    const-string v1, "could not find a diff path"

    invoke-direct {v0, v1}, La/a/c;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object v0, v2

    goto :goto_4
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)La/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;",
            "Ljava/util/List",
            "<*>;)",
            "La/i;"
        }
    .end annotation

    .prologue
    .line 87
    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, La/a/d;->a([Ljava/lang/Object;[Ljava/lang/Object;)La/i;

    move-result-object v0

    return-object v0
.end method

.method public a([Ljava/lang/Object;[Ljava/lang/Object;)La/i;
    .locals 1

    .prologue
    .line 98
    :try_start_0
    invoke-static {p1, p2}, La/a/d;->b([Ljava/lang/Object;[Ljava/lang/Object;)La/a/e;

    move-result-object v0

    .line 99
    invoke-static {v0, p1, p2}, La/a/d;->a(La/a/e;[Ljava/lang/Object;[Ljava/lang/Object;)La/i;
    :try_end_0
    .catch La/a/c; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 103
    :goto_0
    return-object v0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    invoke-virtual {v0}, La/a/c;->printStackTrace()V

    .line 103
    new-instance v0, La/i;

    invoke-direct {v0}, La/i;-><init>()V

    goto :goto_0
.end method
