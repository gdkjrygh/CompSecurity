.class public final Lkik/android/ah;
.super Landroid/database/AbstractCursor;
.source "SourceFile"


# instance fields
.field private a:Landroid/database/Cursor;

.field private b:[Landroid/database/Cursor;

.field private c:[I

.field private final d:I

.field private e:[I

.field private f:[I

.field private g:[[I

.field private h:I

.field private i:Landroid/database/DataSetObserver;


# direct methods
.method public constructor <init>([Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x40

    .line 62
    invoke-direct {p0}, Landroid/database/AbstractCursor;-><init>()V

    .line 40
    iput v5, p0, Lkik/android/ah;->d:I

    .line 41
    new-array v0, v5, [I

    iput-object v0, p0, Lkik/android/ah;->e:[I

    .line 42
    new-array v0, v5, [I

    iput-object v0, p0, Lkik/android/ah;->f:[I

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/ah;->h:I

    .line 45
    new-instance v0, Lkik/android/ai;

    invoke-direct {v0, p0}, Lkik/android/ai;-><init>(Lkik/android/ah;)V

    iput-object v0, p0, Lkik/android/ah;->i:Landroid/database/DataSetObserver;

    .line 63
    iput-object p1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    .line 64
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v3, v0

    .line 65
    new-array v0, v3, [I

    iput-object v0, p0, Lkik/android/ah;->c:[I

    move v0, v1

    .line 66
    :goto_0
    if-ge v0, v3, :cond_1

    .line 67
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 68
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    iget-object v4, p0, Lkik/android/ah;->i:Landroid/database/DataSetObserver;

    invoke-interface {v2, v4}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 73
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 75
    iget-object v2, p0, Lkik/android/ah;->c:[I

    iget-object v4, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v4, v4, v0

    invoke-interface {v4, p2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    aput v4, v2, v0

    .line 66
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 77
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    .line 78
    const-string v0, ""

    move v2, v1

    .line 79
    :goto_1
    if-ge v2, v3, :cond_5

    .line 80
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v1, v1, v2

    if-eqz v1, :cond_3

    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v1, v1, v2

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    if-nez v1, :cond_3

    .line 81
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v1, v1, v2

    iget-object v4, p0, Lkik/android/ah;->c:[I

    aget v4, v4, v2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, ""

    .line 83
    :goto_2
    iget-object v4, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-eqz v4, :cond_2

    if-eqz v0, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_3

    .line 85
    :cond_2
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v0, v2

    iput-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    move-object v0, v1

    .line 79
    :cond_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 81
    :cond_4
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v1, v1, v2

    iget-object v4, p0, Lkik/android/ah;->c:[I

    aget v4, v4, v2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 88
    :cond_5
    iget-object v0, p0, Lkik/android/ah;->e:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_3
    if-ltz v0, :cond_6

    .line 89
    iget-object v1, p0, Lkik/android/ah;->e:[I

    const/4 v2, -0x2

    aput v2, v1, v0

    .line 88
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    .line 91
    :cond_6
    filled-new-array {v5, v3}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lkik/android/ah;->g:[[I

    .line 92
    return-void
.end method

.method static synthetic a(Lkik/android/ah;)I
    .locals 1

    .prologue
    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/ah;->mPos:I

    return v0
.end method

.method static synthetic b(Lkik/android/ah;)I
    .locals 1

    .prologue
    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/ah;->mPos:I

    return v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v1, v0

    .line 300
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 301
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 302
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 300
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 305
    :cond_1
    return-void
.end method

.method public final deactivate()V
    .locals 3

    .prologue
    .line 288
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v1, v0

    .line 289
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 290
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 291
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2}, Landroid/database/Cursor;->deactivate()V

    .line 289
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 294
    :cond_1
    return-void
.end method

.method public final getBlob(I)[B
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 261
    const/4 v0, 0x0

    .line 263
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    goto :goto_0
.end method

.method public final getColumnNames()[Ljava/lang/String;
    .locals 3

    .prologue
    .line 269
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    .line 278
    :goto_0
    return-object v0

    .line 275
    :cond_0
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v1, v0

    .line 276
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_2

    .line 277
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_1

    .line 278
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v1, v0

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 276
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 281
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No cursor that can return names"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getCount()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 97
    .line 98
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v2, v1

    move v1, v0

    .line 99
    :goto_0
    if-ge v1, v2, :cond_1

    .line 100
    iget-object v3, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v3, v3, v1

    if-eqz v3, :cond_0

    .line 101
    iget-object v3, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v3, v3, v1

    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v3

    add-int/2addr v0, v3

    .line 99
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 104
    :cond_1
    return v0
.end method

.method public final getDouble(I)D
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 234
    const-wide/16 v0, 0x0

    .line 236
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    goto :goto_0
.end method

.method public final getFloat(I)F
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 225
    const/4 v0, 0x0

    .line 227
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    goto :goto_0
.end method

.method public final getInt(I)I
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 207
    const/4 v0, 0x0

    .line 209
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    goto :goto_0
.end method

.method public final getLong(I)J
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 216
    const-wide/16 v0, 0x0

    .line 218
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    goto :goto_0
.end method

.method public final getShort(I)S
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 198
    const/4 v0, 0x0

    .line 200
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getShort(I)S

    move-result v0

    goto :goto_0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 189
    const/4 v0, 0x0

    .line 191
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final getType(I)I
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 243
    const/4 v0, 0x0

    .line 245
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getType(I)I

    move-result v0

    goto :goto_0
.end method

.method public final isNull(I)Z
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 252
    const/4 v0, 0x0

    .line 254
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    goto :goto_0
.end method

.method public final onMove(II)Z
    .locals 11

    .prologue
    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v1, 0x0

    .line 110
    if-ne p1, p2, :cond_0

    move v1, v5

    .line 182
    :goto_0
    return v1

    .line 120
    :cond_0
    rem-int/lit8 v8, p2, 0x40

    .line 121
    iget-object v0, p0, Lkik/android/ah;->e:[I

    aget v0, v0, v8

    if-ne v0, p2, :cond_2

    .line 122
    iget-object v0, p0, Lkik/android/ah;->f:[I

    aget v0, v0, v8

    .line 123
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    iput-object v2, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    .line 124
    iget-object v2, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    if-nez v2, :cond_1

    .line 125
    const-string v0, "SortCursor"

    const-string v2, "onMove: cache results in a null cursor."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 128
    :cond_1
    iget-object v1, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    iget-object v2, p0, Lkik/android/ah;->g:[[I

    aget-object v2, v2, v8

    aget v0, v2, v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 129
    iput v8, p0, Lkik/android/ah;->h:I

    move v1, v5

    .line 130
    goto :goto_0

    .line 132
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    .line 133
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v9, v0

    .line 134
    iget v0, p0, Lkik/android/ah;->h:I

    if-ltz v0, :cond_4

    move v0, v1

    .line 135
    :goto_1
    if-ge v0, v9, :cond_4

    .line 136
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    .line 137
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    iget-object v3, p0, Lkik/android/ah;->g:[[I

    iget v4, p0, Lkik/android/ah;->h:I

    aget-object v3, v3, v4

    aget v3, v3, v0

    invoke-interface {v2, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 135
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 141
    :cond_4
    if-lt p2, p1, :cond_5

    if-ne p1, v6, :cond_11

    :cond_5
    move v0, v1

    .line 142
    :goto_2
    if-ge v0, v9, :cond_7

    .line 143
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_6

    .line 144
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 142
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    move v0, v1

    .line 149
    :goto_3
    if-gez v0, :cond_8

    move v0, v1

    :cond_8
    move v3, v6

    move v7, v0

    .line 154
    :goto_4
    if-gt v7, p2, :cond_d

    .line 155
    const-string v0, ""

    move v4, v1

    move v3, v6

    .line 157
    :goto_5
    if-ge v4, v9, :cond_b

    .line 158
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v4

    if-eqz v2, :cond_10

    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v4

    invoke-interface {v2}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v2

    if-nez v2, :cond_10

    .line 159
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v4

    iget-object v10, p0, Lkik/android/ah;->c:[I

    aget v10, v10, v4

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_a

    const-string v2, ""

    .line 162
    :goto_6
    if-ltz v3, :cond_9

    if-eqz v0, :cond_10

    invoke-virtual {v2, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v10

    if-lez v10, :cond_10

    :cond_9
    move-object v0, v2

    move v2, v4

    .line 157
    :goto_7
    add-int/lit8 v4, v4, 0x1

    move v3, v2

    goto :goto_5

    .line 159
    :cond_a
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v4

    iget-object v10, p0, Lkik/android/ah;->c:[I

    aget v10, v10, v4

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    .line 167
    :cond_b
    if-eq v7, p2, :cond_d

    .line 168
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v0, v3

    if-eqz v0, :cond_c

    .line 170
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 154
    :cond_c
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_4

    .line 173
    :cond_d
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v0, v3

    iput-object v0, p0, Lkik/android/ah;->a:Landroid/database/Cursor;

    .line 174
    iget-object v0, p0, Lkik/android/ah;->e:[I

    aput p2, v0, v8

    .line 175
    iget-object v0, p0, Lkik/android/ah;->f:[I

    aput v3, v0, v8

    .line 176
    :goto_8
    if-ge v1, v9, :cond_f

    .line 177
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v0, v0, v1

    if-eqz v0, :cond_e

    .line 178
    iget-object v0, p0, Lkik/android/ah;->g:[[I

    aget-object v0, v0, v8

    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v1

    invoke-interface {v2}, Landroid/database/Cursor;->getPosition()I

    move-result v2

    aput v2, v0, v1

    .line 176
    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 181
    :cond_f
    iput v6, p0, Lkik/android/ah;->h:I

    move v1, v5

    .line 182
    goto/16 :goto_0

    :cond_10
    move v2, v3

    goto :goto_7

    :cond_11
    move v0, p1

    goto/16 :goto_3
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 3

    .prologue
    .line 310
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v1, v0

    .line 311
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 312
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 313
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2, p1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 311
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 316
    :cond_1
    return-void
.end method

.method public final requery()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 332
    iget-object v1, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v2, v1

    move v1, v0

    .line 333
    :goto_0
    if-ge v1, v2, :cond_1

    .line 334
    iget-object v3, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v3, v3, v1

    if-eqz v3, :cond_0

    .line 335
    iget-object v3, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v3, v3, v1

    invoke-interface {v3}, Landroid/database/Cursor;->requery()Z

    move-result v3

    if-nez v3, :cond_0

    .line 341
    :goto_1
    return v0

    .line 333
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 341
    :cond_1
    const/4 v0, 0x1

    goto :goto_1
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 3

    .prologue
    .line 321
    iget-object v0, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    array-length v1, v0

    .line 322
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 323
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 324
    iget-object v2, p0, Lkik/android/ah;->b:[Landroid/database/Cursor;

    aget-object v2, v2, v0

    invoke-interface {v2, p1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 322
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 327
    :cond_1
    return-void
.end method
