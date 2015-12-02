.class public Lcom/facebook/orca/camera/a/g;
.super Ljava/lang/Object;
.source "ImageListUber.java"

# interfaces
.implements Lcom/facebook/orca/camera/a/d;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:[Lcom/facebook/orca/camera/a/d;

.field private final c:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue",
            "<",
            "Lcom/facebook/orca/camera/a/k;",
            ">;"
        }
    .end annotation
.end field

.field private d:[J

.field private e:I

.field private f:[I

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/camera/a/g;

    sput-object v0, Lcom/facebook/orca/camera/a/g;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>([Lcom/facebook/orca/camera/a/d;I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, [Lcom/facebook/orca/camera/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/camera/a/d;

    iput-object v0, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    .line 56
    new-instance v2, Ljava/util/PriorityQueue;

    const/4 v3, 0x4

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    new-instance v0, Lcom/facebook/orca/camera/a/i;

    invoke-direct {v0, v4}, Lcom/facebook/orca/camera/a/i;-><init>(Lcom/facebook/orca/camera/a/h;)V

    :goto_0
    invoke-direct {v2, v3, v0}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v2, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    .line 60
    const/16 v0, 0x10

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    .line 61
    iput v1, p0, Lcom/facebook/orca/camera/a/g;->e:I

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/orca/camera/a/g;->f:[I

    .line 63
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/camera/a/g;->g:I

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    array-length v2, v0

    move v0, v1

    :goto_1
    if-ge v0, v2, :cond_2

    .line 66
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    aget-object v1, v1, v0

    .line 67
    new-instance v3, Lcom/facebook/orca/camera/a/k;

    invoke-direct {v3, v1, v0}, Lcom/facebook/orca/camera/a/k;-><init>(Lcom/facebook/orca/camera/a/d;I)V

    .line 68
    invoke-virtual {v3}, Lcom/facebook/orca/camera/a/k;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v1, v3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 56
    :cond_1
    new-instance v0, Lcom/facebook/orca/camera/a/j;

    invoke-direct {v0, v4}, Lcom/facebook/orca/camera/a/j;-><init>(Lcom/facebook/orca/camera/a/h;)V

    goto :goto_0

    .line 70
    :cond_2
    return-void
.end method

.method private c()Lcom/facebook/orca/camera/a/k;
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v4, 0x0

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/a/k;

    .line 146
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 159
    :goto_0
    return-object v0

    .line 147
    :cond_0
    iget v1, v0, Lcom/facebook/orca/camera/a/k;->a:I

    iget v2, p0, Lcom/facebook/orca/camera/a/g;->g:I

    if-ne v1, v2, :cond_1

    .line 148
    iget v1, p0, Lcom/facebook/orca/camera/a/g;->e:I

    add-int/lit8 v1, v1, -0x1

    .line 149
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    aget-wide v3, v2, v1

    add-long/2addr v3, v6

    aput-wide v3, v2, v1

    goto :goto_0

    .line 151
    :cond_1
    iget v1, v0, Lcom/facebook/orca/camera/a/k;->a:I

    iput v1, p0, Lcom/facebook/orca/camera/a/g;->g:I

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    array-length v1, v1

    iget v2, p0, Lcom/facebook/orca/camera/a/g;->e:I

    if-ne v1, v2, :cond_2

    .line 153
    iget v1, p0, Lcom/facebook/orca/camera/a/g;->e:I

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [J

    .line 154
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    iget v3, p0, Lcom/facebook/orca/camera/a/g;->e:I

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 155
    iput-object v1, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    .line 157
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    iget v2, p0, Lcom/facebook/orca/camera/a/g;->e:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/facebook/orca/camera/a/g;->e:I

    iget v3, p0, Lcom/facebook/orca/camera/a/g;->g:I

    int-to-long v3, v3

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    or-long/2addr v3, v6

    aput-wide v3, v1, v2

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/facebook/orca/camera/a/c;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 101
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/camera/a/g;->b()I

    move-result v1

    if-le p1, v1, :cond_1

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " out of range max is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/camera/a/g;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->f:[I

    .line 109
    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    .line 119
    iget v3, p0, Lcom/facebook/orca/camera/a/g;->e:I

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_6

    .line 120
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->d:[J

    aget-wide v4, v2, v1

    .line 122
    const-wide/16 v6, -0x1

    and-long/2addr v6, v4

    long-to-int v6, v6

    .line 123
    const/16 v2, 0x20

    shr-long/2addr v4, v2

    long-to-int v4, v4

    .line 124
    add-int v2, v0, v6

    if-le v2, p1, :cond_3

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->f:[I

    aget v1, v1, v4

    sub-int v0, p1, v0

    add-int/2addr v0, v1

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    aget-object v1, v1, v4

    invoke-interface {v1, v0}, Lcom/facebook/orca/camera/a/d;->a(I)Lcom/facebook/orca/camera/a/c;

    move-result-object v0

    .line 138
    :cond_2
    :goto_1
    return-object v0

    .line 128
    :cond_3
    add-int v2, v0, v6

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/camera/a/g;->f:[I

    aget v5, v0, v4

    add-int/2addr v5, v6

    aput v5, v0, v4

    .line 119
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_0

    .line 140
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/orca/camera/a/k;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 132
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 133
    :cond_6
    invoke-direct {p0}, Lcom/facebook/orca/camera/a/g;->c()Lcom/facebook/orca/camera/a/k;

    move-result-object v1

    .line 134
    if-nez v1, :cond_7

    const/4 v0, 0x0

    goto :goto_1

    .line 135
    :cond_7
    if-ne v0, p1, :cond_4

    .line 136
    iget-object v0, v1, Lcom/facebook/orca/camera/a/k;->c:Lcom/facebook/orca/camera/a/c;

    .line 137
    invoke-virtual {v1}, Lcom/facebook/orca/camera/a/k;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public a(Landroid/net/Uri;)Lcom/facebook/orca/camera/a/c;
    .locals 4

    .prologue
    .line 163
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 164
    invoke-interface {v0, p1}, Lcom/facebook/orca/camera/a/d;->a(Landroid/net/Uri;)Lcom/facebook/orca/camera/a/c;

    move-result-object v0

    .line 165
    if-eqz v0, :cond_0

    .line 167
    :goto_1
    return-object v0

    .line 163
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 167
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a()V
    .locals 3

    .prologue
    .line 292
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 293
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/facebook/orca/camera/a/d;->a()V

    .line 292
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 295
    :cond_0
    return-void
.end method

.method public b()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 81
    .line 82
    iget-object v2, p0, Lcom/facebook/orca/camera/a/g;->b:[Lcom/facebook/orca/camera/a/d;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 83
    invoke-interface {v4}, Lcom/facebook/orca/camera/a/d;->b()I

    move-result v4

    add-int/2addr v1, v4

    .line 82
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 85
    :cond_0
    return v1
.end method
