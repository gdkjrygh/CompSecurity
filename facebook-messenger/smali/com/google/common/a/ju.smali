.class Lcom/google/common/a/ju;
.super Lcom/google/common/a/es;
.source "RegularImmutableList.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/es",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final transient a:I

.field private final transient b:I

.field private final transient d:[Ljava/lang/Object;


# direct methods
.method constructor <init>([Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 45
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/ju;-><init>([Ljava/lang/Object;II)V

    .line 46
    return-void
.end method

.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/google/common/a/es;-><init>()V

    .line 39
    iput p2, p0, Lcom/google/common/a/ju;->a:I

    .line 40
    iput p3, p0, Lcom/google/common/a/ju;->b:I

    .line 41
    iput-object p1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/google/common/a/ju;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/common/a/ju;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    return v0
.end method


# virtual methods
.method public a(II)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 118
    iget v0, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {p1, p2, v0}, Lcom/google/common/base/Preconditions;->checkPositionIndexes(III)V

    .line 119
    if-ne p1, p2, :cond_0

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/ju;

    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/common/a/ju;->a:I

    add-int/2addr v2, p1

    sub-int v3, p2, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/common/a/ju;-><init>([Ljava/lang/Object;II)V

    goto :goto_0
.end method

.method public a(I)Lcom/google/common/a/mi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/a/mi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 126
    new-instance v0, Lcom/google/common/a/jv;

    iget v1, p0, Lcom/google/common/a/ju;->b:I

    invoke-direct {v0, p0, v1, p1}, Lcom/google/common/a/jv;-><init>(Lcom/google/common/a/ju;II)V

    return-object v0
.end method

.method a()Z
    .locals 2

    .prologue
    .line 58
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/common/a/ju;->b:I

    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    array-length v1, v1

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 62
    invoke-virtual {p0, p1}, Lcom/google/common/a/ju;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 137
    if-ne p1, p0, :cond_0

    move v0, v3

    .line 164
    :goto_0
    return v0

    .line 140
    :cond_0
    instance-of v0, p1, Ljava/util/List;

    if-nez v0, :cond_1

    move v0, v4

    .line 141
    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 144
    check-cast v0, Ljava/util/List;

    .line 145
    invoke-virtual {p0}, Lcom/google/common/a/ju;->size()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_2

    move v0, v4

    .line 146
    goto :goto_0

    .line 149
    :cond_2
    iget v1, p0, Lcom/google/common/a/ju;->a:I

    .line 150
    instance-of v2, p1, Lcom/google/common/a/ju;

    if-eqz v2, :cond_4

    .line 151
    check-cast p1, Lcom/google/common/a/ju;

    .line 152
    iget v0, p1, Lcom/google/common/a/ju;->a:I

    :goto_1
    iget v2, p1, Lcom/google/common/a/ju;->a:I

    iget v5, p1, Lcom/google/common/a/ju;->b:I

    add-int/2addr v2, v5

    if-ge v0, v2, :cond_6

    .line 153
    iget-object v5, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    add-int/lit8 v2, v1, 0x1

    aget-object v1, v5, v1

    iget-object v5, p1, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    aget-object v5, v5, v0

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    move v0, v4

    .line 154
    goto :goto_0

    .line 152
    :cond_3
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_1

    .line 158
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 159
    iget-object v6, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    aget-object v1, v6, v1

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    move v0, v4

    .line 160
    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_2

    :cond_6
    move v0, v3

    .line 164
    goto :goto_0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 91
    iget v0, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkElementIndex(II)I

    .line 92
    iget-object v0, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/a/ju;->a:I

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/a/ju;->a:I

    iget v2, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {v0, v1, v2}, Lcom/google/common/a/gg;->a([Ljava/lang/Object;II)Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 170
    const/4 v1, 0x1

    .line 171
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    :goto_0
    iget v2, p0, Lcom/google/common/a/ju;->a:I

    iget v3, p0, Lcom/google/common/a/ju;->b:I

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    .line 172
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    .line 171
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 174
    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 96
    if-eqz p1, :cond_1

    .line 97
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    :goto_0
    iget v1, p0, Lcom/google/common/a/ju;->a:I

    iget v2, p0, Lcom/google/common/a/ju;->b:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    .line 98
    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 99
    iget v1, p0, Lcom/google/common/a/ju;->a:I

    sub-int/2addr v0, v1

    .line 103
    :goto_1
    return v0

    .line 97
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 103
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/google/common/a/ju;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 107
    if-eqz p1, :cond_1

    .line 108
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    iget v1, p0, Lcom/google/common/a/ju;->b:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget v1, p0, Lcom/google/common/a/ju;->a:I

    if-lt v0, v1, :cond_1

    .line 109
    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    iget v1, p0, Lcom/google/common/a/ju;->a:I

    sub-int/2addr v0, v1

    .line 114
    :goto_1
    return v0

    .line 108
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 114
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 31
    invoke-virtual {p0, p1}, Lcom/google/common/a/ju;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/google/common/a/ju;->b:I

    return v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 31
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/ju;->a(II)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 5

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/google/common/a/ju;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    .line 73
    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/common/a/ju;->a:I

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 78
    array-length v0, p1

    iget v1, p0, Lcom/google/common/a/ju;->b:I

    if-ge v0, v1, :cond_1

    .line 79
    iget v0, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {p1, v0}, Lcom/google/common/a/jp;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 83
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/a/ju;->a:I

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/common/a/ju;->b:I

    invoke-static {v0, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    return-object p1

    .line 80
    :cond_1
    array-length v0, p1

    iget v1, p0, Lcom/google/common/a/ju;->b:I

    if-le v0, v1, :cond_0

    .line 81
    iget v0, p0, Lcom/google/common/a/ju;->b:I

    const/4 v1, 0x0

    aput-object v1, p1, v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/google/common/a/ju;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/ax;->a(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/common/a/ju;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 180
    iget v0, p0, Lcom/google/common/a/ju;->a:I

    add-int/lit8 v0, v0, 0x1

    :goto_0
    iget v2, p0, Lcom/google/common/a/ju;->a:I

    iget v3, p0, Lcom/google/common/a/ju;->b:I

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    .line 181
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/common/a/ju;->d:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 183
    :cond_0
    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
