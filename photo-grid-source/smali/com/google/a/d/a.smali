.class public Lcom/google/a/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final a:[C


# instance fields
.field private final b:Lcom/google/a/d/i;

.field private final c:Ljava/io/Reader;

.field private d:Z

.field private final e:[C

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:[Lcom/google/a/d/d;

.field private k:I

.field private l:Lcom/google/a/d/e;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:I

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 193
    const-string v0, ")]}\'\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/google/a/d/a;->a:[C

    .line 1315
    new-instance v0, Lcom/google/a/d/b;

    invoke-direct {v0}, Lcom/google/a/d/b;-><init>()V

    sput-object v0, Lcom/google/a/b/q;->a:Lcom/google/a/b/q;

    .line 1331
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    new-instance v0, Lcom/google/a/d/i;

    invoke-direct {v0}, Lcom/google/a/d/i;-><init>()V

    iput-object v0, p0, Lcom/google/a/d/a;->b:Lcom/google/a/d/i;

    .line 204
    iput-boolean v1, p0, Lcom/google/a/d/a;->d:Z

    .line 212
    const/16 v0, 0x400

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/google/a/d/a;->e:[C

    .line 213
    iput v1, p0, Lcom/google/a/d/a;->f:I

    .line 214
    iput v1, p0, Lcom/google/a/d/a;->g:I

    .line 219
    iput v2, p0, Lcom/google/a/d/a;->h:I

    .line 220
    iput v2, p0, Lcom/google/a/d/a;->i:I

    .line 225
    const/16 v0, 0x20

    new-array v0, v0, [Lcom/google/a/d/d;

    iput-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    .line 226
    iput v1, p0, Lcom/google/a/d/a;->k:I

    .line 228
    sget-object v0, Lcom/google/a/d/d;->f:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/d;)V

    .line 249
    iput-boolean v1, p0, Lcom/google/a/d/a;->q:Z

    .line 255
    if-nez p1, :cond_0

    .line 256
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "in == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_0
    iput-object p1, p0, Lcom/google/a/d/a;->c:Ljava/io/Reader;

    .line 259
    return-void
.end method

.method static synthetic a(Lcom/google/a/d/a;)Lcom/google/a/d/e;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    return-object v0
.end method

.method static synthetic a(Lcom/google/a/d/a;Lcom/google/a/d/e;)Lcom/google/a/d/e;
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    return-object p1
.end method

.method private a(Ljava/lang/String;)Ljava/io/IOException;
    .locals 3

    .prologue
    .line 1310
    new-instance v0, Lcom/google/a/d/h;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/d/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(C)Ljava/lang/String;
    .locals 8

    .prologue
    .line 1006
    iget-object v5, p0, Lcom/google/a/d/a;->e:[C

    .line 1007
    const/4 v0, 0x0

    .line 1009
    :cond_0
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 1010
    iget v2, p0, Lcom/google/a/d/a;->g:I

    move v4, v1

    .line 1013
    :goto_0
    if-ge v4, v2, :cond_5

    .line 1014
    add-int/lit8 v3, v4, 0x1

    aget-char v4, v5, v4

    .line 1016
    if-ne v4, p1, :cond_3

    .line 1017
    iput v3, p0, Lcom/google/a/d/a;->f:I

    .line 1018
    iget-boolean v2, p0, Lcom/google/a/d/a;->q:Z

    if-eqz v2, :cond_1

    .line 1019
    const-string v0, "skipped!"

    .line 1024
    :goto_1
    return-object v0

    .line 1020
    :cond_1
    if-nez v0, :cond_2

    .line 1021
    iget-object v0, p0, Lcom/google/a/d/a;->b:Lcom/google/a/d/i;

    sub-int v2, v3, v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v5, v1, v2}, Lcom/google/a/d/i;->a([CII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1023
    :cond_2
    sub-int v2, v3, v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v5, v1, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1024
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1027
    :cond_3
    const/16 v6, 0x5c

    if-ne v4, v6, :cond_7

    .line 1028
    iput v3, p0, Lcom/google/a/d/a;->f:I

    .line 1029
    if-nez v0, :cond_4

    .line 1030
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1032
    :cond_4
    sub-int v2, v3, v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v5, v1, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1033
    invoke-direct {p0}, Lcom/google/a/d/a;->v()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1034
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 1035
    iget v2, p0, Lcom/google/a/d/a;->g:I

    move-object v3, v0

    move v0, v1

    move v7, v1

    move v1, v2

    move v2, v7

    :goto_2
    move v4, v2

    move v2, v1

    move v1, v0

    move-object v0, v3

    .line 1038
    goto :goto_0

    .line 1040
    :cond_5
    if-nez v0, :cond_6

    .line 1041
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1043
    :cond_6
    sub-int v2, v4, v1

    invoke-virtual {v0, v5, v1, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1044
    iput v4, p0, Lcom/google/a/d/a;->f:I

    .line 1045
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/a/d/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1046
    const-string v0, "Unterminated string"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_7
    move v7, v1

    move v1, v2

    move v2, v3

    move-object v3, v0

    move v0, v7

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/a/d/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/google/a/d/d;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 650
    iget v0, p0, Lcom/google/a/d/a;->k:I

    iget-object v1, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 651
    iget v0, p0, Lcom/google/a/d/a;->k:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lcom/google/a/d/d;

    .line 652
    iget-object v1, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v2, p0, Lcom/google/a/d/a;->k:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 653
    iput-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    .line 655
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v1, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/a/d/a;->k:I

    aput-object p1, v0, v1

    .line 656
    return-void
.end method

.method private a(Lcom/google/a/d/e;)V
    .locals 3

    .prologue
    .line 337
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 338
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    if-eq v0, p1, :cond_0

    .line 339
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 342
    :cond_0
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 343
    return-void
.end method

.method private a(I)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 799
    iget-object v5, p0, Lcom/google/a/d/a;->e:[C

    .line 803
    iget v2, p0, Lcom/google/a/d/a;->h:I

    .line 804
    iget v0, p0, Lcom/google/a/d/a;->i:I

    .line 805
    iget v6, p0, Lcom/google/a/d/a;->f:I

    move v4, v3

    :goto_0
    if-ge v4, v6, :cond_1

    .line 806
    aget-char v7, v5, v4

    const/16 v8, 0xa

    if-ne v7, v8, :cond_0

    .line 807
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v1

    .line 805
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 810
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 813
    :cond_1
    iput v2, p0, Lcom/google/a/d/a;->h:I

    .line 814
    iput v0, p0, Lcom/google/a/d/a;->i:I

    .line 816
    iget v0, p0, Lcom/google/a/d/a;->g:I

    iget v2, p0, Lcom/google/a/d/a;->f:I

    if-eq v0, v2, :cond_4

    .line 817
    iget v0, p0, Lcom/google/a/d/a;->g:I

    iget v2, p0, Lcom/google/a/d/a;->f:I

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/google/a/d/a;->g:I

    .line 818
    iget v0, p0, Lcom/google/a/d/a;->f:I

    iget v2, p0, Lcom/google/a/d/a;->g:I

    invoke-static {v5, v0, v5, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 823
    :goto_2
    iput v3, p0, Lcom/google/a/d/a;->f:I

    .line 825
    :cond_2
    iget-object v0, p0, Lcom/google/a/d/a;->c:Ljava/io/Reader;

    iget v2, p0, Lcom/google/a/d/a;->g:I

    array-length v4, v5

    iget v6, p0, Lcom/google/a/d/a;->g:I

    sub-int/2addr v4, v6

    invoke-virtual {v0, v5, v2, v4}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_5

    .line 826
    iget v2, p0, Lcom/google/a/d/a;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/a/d/a;->g:I

    .line 829
    iget v0, p0, Lcom/google/a/d/a;->h:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/a/d/a;->i:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/a/d/a;->g:I

    if-lez v0, :cond_3

    aget-char v0, v5, v3

    const v2, 0xfeff

    if-ne v0, v2, :cond_3

    .line 830
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 831
    iget v0, p0, Lcom/google/a/d/a;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->i:I

    .line 834
    :cond_3
    iget v0, p0, Lcom/google/a/d/a;->g:I

    if-lt v0, p1, :cond_2

    .line 838
    :goto_3
    return v1

    .line 820
    :cond_4
    iput v3, p0, Lcom/google/a/d/a;->g:I

    goto :goto_2

    :cond_5
    move v1, v3

    .line 838
    goto :goto_3
.end method

.method static synthetic b(Lcom/google/a/d/a;)I
    .locals 1

    .prologue
    .line 190
    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v0

    return v0
.end method

.method private b(Z)Lcom/google/a/d/e;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 660
    if-eqz p1, :cond_0

    .line 661
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v1, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v1, v1, -0x1

    sget-object v2, Lcom/google/a/d/d;->b:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    .line 677
    :goto_0
    :sswitch_0
    invoke-direct {p0, v3}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 692
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 693
    invoke-direct {p0}, Lcom/google/a/d/a;->q()Lcom/google/a/d/e;

    move-result-object v0

    :goto_1
    return-object v0

    .line 664
    :cond_0
    invoke-direct {p0, v3}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 673
    const-string v0, "Unterminated array"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 666
    :sswitch_1
    iget v0, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->k:I

    .line 667
    sget-object v0, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_1

    .line 669
    :sswitch_2
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    goto :goto_0

    .line 679
    :sswitch_3
    if-eqz p1, :cond_1

    .line 680
    iget v0, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->k:I

    .line 681
    sget-object v0, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_1

    .line 687
    :cond_1
    :sswitch_4
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 688
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 689
    const-string v0, "null"

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 690
    sget-object v0, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_1

    .line 677
    nop

    :sswitch_data_0
    .sparse-switch
        0x2c -> :sswitch_4
        0x3b -> :sswitch_4
        0x5d -> :sswitch_3
    .end sparse-switch

    .line 664
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_0
        0x3b -> :sswitch_2
        0x5d -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic c(Lcom/google/a/d/a;)I
    .locals 1

    .prologue
    .line 190
    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v0

    return v0
.end method

.method private c(Z)Lcom/google/a/d/e;
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 704
    if-eqz p1, :cond_0

    .line 706
    invoke-direct {p0, v1}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 711
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 727
    :sswitch_0
    invoke-direct {p0, v1}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    .line 728
    sparse-switch v0, :sswitch_data_0

    .line 735
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 736
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 737
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->e(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    .line 738
    iget-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 739
    const-string v0, "Expected name"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 708
    :pswitch_0
    iget v0, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->k:I

    .line 709
    sget-object v0, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 744
    :goto_0
    return-object v0

    .line 714
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 722
    const-string v0, "Unterminated object"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 716
    :sswitch_1
    iget v0, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->k:I

    .line 717
    sget-object v0, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_0

    .line 730
    :sswitch_2
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 732
    :sswitch_3
    int-to-char v0, v0

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    .line 743
    :cond_1
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v1, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v1, v1, -0x1

    sget-object v2, Lcom/google/a/d/d;->d:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    .line 744
    sget-object v0, Lcom/google/a/d/e;->e:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_0

    .line 706
    nop

    :pswitch_data_0
    .packed-switch 0x7d
        :pswitch_0
    .end packed-switch

    .line 728
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
    .end sparse-switch

    .line 714
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_0
        0x3b -> :sswitch_0
        0x7d -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Z)I
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 878
    iget-object v5, p0, Lcom/google/a/d/a;->e:[C

    .line 879
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 880
    iget v0, p0, Lcom/google/a/d/a;->g:I

    .line 882
    :goto_0
    if-ne v1, v0, :cond_0

    .line 883
    iput v1, p0, Lcom/google/a/d/a;->f:I

    .line 884
    invoke-direct {p0, v3}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 887
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 888
    iget v0, p0, Lcom/google/a/d/a;->g:I

    .line 891
    :cond_0
    add-int/lit8 v4, v1, 0x1

    aget-char v1, v5, v1

    .line 892
    sparse-switch v1, :sswitch_data_0

    .line 949
    iput v4, p0, Lcom/google/a/d/a;->f:I

    move v0, v1

    .line 957
    :goto_1
    return v0

    :sswitch_0
    move v1, v4

    .line 897
    goto :goto_0

    .line 900
    :sswitch_1
    iput v4, p0, Lcom/google/a/d/a;->f:I

    .line 901
    if-ne v4, v0, :cond_1

    .line 902
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 903
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    .line 904
    iget v4, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/google/a/d/a;->f:I

    .line 905
    if-nez v0, :cond_1

    move v0, v1

    .line 906
    goto :goto_1

    .line 910
    :cond_1
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 911
    iget v0, p0, Lcom/google/a/d/a;->f:I

    aget-char v0, v5, v0

    .line 912
    sparse-switch v0, :sswitch_data_1

    move v0, v1

    .line 932
    goto :goto_1

    .line 915
    :sswitch_2
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 916
    const-string v1, "*/"

    .line 2983
    :goto_2
    iget v0, p0, Lcom/google/a/d/a;->f:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v0, v4

    iget v4, p0, Lcom/google/a/d/a;->g:I

    if-le v0, v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_2
    move v0, v2

    .line 2984
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_3

    .line 2985
    iget-object v4, p0, Lcom/google/a/d/a;->e:[C

    iget v6, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v6, v0

    aget-char v4, v4, v6

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v4, v6, :cond_4

    .line 2984
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    move v0, v3

    .line 916
    :goto_4
    if-nez v0, :cond_6

    .line 917
    const-string v0, "Unterminated comment"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 2983
    :cond_4
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    goto :goto_2

    :cond_5
    move v0, v2

    .line 2991
    goto :goto_4

    .line 919
    :cond_6
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v1, v0, 0x2

    .line 920
    iget v0, p0, Lcom/google/a/d/a;->g:I

    goto/16 :goto_0

    .line 925
    :sswitch_3
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 926
    invoke-direct {p0}, Lcom/google/a/d/a;->u()V

    .line 927
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 928
    iget v0, p0, Lcom/google/a/d/a;->g:I

    goto/16 :goto_0

    .line 936
    :sswitch_4
    iput v4, p0, Lcom/google/a/d/a;->f:I

    .line 942
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 943
    invoke-direct {p0}, Lcom/google/a/d/a;->u()V

    .line 944
    iget v1, p0, Lcom/google/a/d/a;->f:I

    .line 945
    iget v0, p0, Lcom/google/a/d/a;->g:I

    goto/16 :goto_0

    .line 953
    :cond_7
    if-eqz p1, :cond_8

    .line 954
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "End of input at line "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 957
    :cond_8
    const/4 v0, -0x1

    goto/16 :goto_1

    .line 892
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x20 -> :sswitch_0
        0x23 -> :sswitch_4
        0x2f -> :sswitch_1
    .end sparse-switch

    .line 912
    :sswitch_data_1
    .sparse-switch
        0x2a -> :sswitch_2
        0x2f -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic d(Lcom/google/a/d/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/google/a/d/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method private e(Z)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1061
    .line 1062
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->o:I

    .line 1063
    iput v2, p0, Lcom/google/a/d/a;->p:I

    move v1, v2

    move-object v0, v3

    .line 1068
    :cond_0
    :goto_0
    iget v4, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v4, v1

    iget v5, p0, Lcom/google/a/d/a;->g:I

    if-ge v4, v5, :cond_1

    .line 1069
    iget-object v4, p0, Lcom/google/a/d/a;->e:[C

    iget v5, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v5, v1

    aget-char v4, v4, v5

    sparse-switch v4, :sswitch_data_0

    .line 1068
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1075
    :sswitch_0
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 1119
    :goto_1
    :sswitch_1
    if-eqz p1, :cond_4

    if-nez v0, :cond_4

    .line 1120
    iget v0, p0, Lcom/google/a/d/a;->f:I

    iput v0, p0, Lcom/google/a/d/a;->o:I

    .line 1130
    :goto_2
    iget v0, p0, Lcom/google/a/d/a;->p:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/a/d/a;->p:I

    .line 1131
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 1132
    return-object v3

    .line 1096
    :cond_1
    iget-object v4, p0, Lcom/google/a/d/a;->e:[C

    array-length v4, v4

    if-ge v1, v4, :cond_2

    .line 1097
    add-int/lit8 v4, v1, 0x1

    invoke-direct {p0, v4}, Lcom/google/a/d/a;->a(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1100
    iget-object v4, p0, Lcom/google/a/d/a;->e:[C

    iget v5, p0, Lcom/google/a/d/a;->g:I

    aput-char v2, v4, v5

    goto :goto_1

    .line 1106
    :cond_2
    if-nez v0, :cond_3

    .line 1107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1109
    :cond_3
    iget-object v4, p0, Lcom/google/a/d/a;->e:[C

    iget v5, p0, Lcom/google/a/d/a;->f:I

    invoke-virtual {v0, v4, v5, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1110
    iget v4, p0, Lcom/google/a/d/a;->p:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/google/a/d/a;->p:I

    .line 1111
    iget v4, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v1, v4

    iput v1, p0, Lcom/google/a/d/a;->f:I

    .line 1113
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/google/a/d/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_1

    .line 1122
    :cond_4
    iget-boolean v2, p0, Lcom/google/a/d/a;->q:Z

    if-eqz v2, :cond_5

    .line 1123
    const-string v3, "skipped!"

    goto :goto_2

    .line 1124
    :cond_5
    if-nez v0, :cond_6

    .line 1125
    iget-object v0, p0, Lcom/google/a/d/a;->b:Lcom/google/a/d/i;

    iget-object v2, p0, Lcom/google/a/d/a;->e:[C

    iget v3, p0, Lcom/google/a/d/a;->f:I

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/a/d/i;->a([CII)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    .line 1127
    :cond_6
    iget-object v2, p0, Lcom/google/a/d/a;->e:[C

    iget v3, p0, Lcom/google/a/d/a;->f:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_7
    move v1, v2

    goto :goto_0

    .line 1069
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
        0xc -> :sswitch_1
        0xd -> :sswitch_1
        0x20 -> :sswitch_1
        0x23 -> :sswitch_0
        0x2c -> :sswitch_1
        0x2f -> :sswitch_0
        0x3a -> :sswitch_1
        0x3b -> :sswitch_0
        0x3d -> :sswitch_0
        0x5b -> :sswitch_1
        0x5c -> :sswitch_0
        0x5d -> :sswitch_1
        0x7b -> :sswitch_1
        0x7d -> :sswitch_1
    .end sparse-switch
.end method

.method private o()Lcom/google/a/d/e;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 426
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 428
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 429
    iput-object v1, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 430
    iput-object v1, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 431
    iput-object v1, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    .line 432
    return-object v0
.end method

.method private q()Lcom/google/a/d/e;
    .locals 11

    .prologue
    const/16 v9, 0x65

    const/16 v3, 0x4c

    const/16 v8, 0x45

    const/16 v7, 0x39

    const/16 v6, 0x30

    .line 771
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    .line 772
    sparse-switch v0, :sswitch_data_0

    .line 788
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 2205
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->e(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 2206
    iget v0, p0, Lcom/google/a/d/a;->p:I

    if-nez v0, :cond_0

    .line 2207
    const-string v0, "Expected literal value"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 774
    :sswitch_0
    sget-object v0, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/d;)V

    .line 775
    sget-object v0, Lcom/google/a/d/e;->c:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 789
    :goto_0
    return-object v0

    .line 778
    :sswitch_1
    sget-object v0, Lcom/google/a/d/d;->a:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/d;)V

    .line 779
    sget-object v0, Lcom/google/a/d/e;->a:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_0

    .line 782
    :sswitch_2
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 784
    :sswitch_3
    int-to-char v0, v0

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 785
    sget-object v0, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto :goto_0

    .line 2220
    :cond_0
    iget v0, p0, Lcom/google/a/d/a;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1b

    .line 2223
    iget v0, p0, Lcom/google/a/d/a;->p:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    const/16 v0, 0x6e

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_1

    const/16 v0, 0x4e

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_6

    :cond_1
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_2

    const/16 v0, 0x55

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_6

    :cond_2
    const/16 v0, 0x6c

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_6

    :cond_3
    const/16 v0, 0x6c

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_6

    .line 2228
    :cond_4
    const-string v0, "null"

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 2229
    sget-object v0, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    .line 2209
    :goto_1
    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 2210
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_5

    .line 2211
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 2213
    :cond_5
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    goto/16 :goto_0

    .line 2230
    :cond_6
    iget v0, p0, Lcom/google/a/d/a;->p:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_b

    const/16 v0, 0x74

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_7

    const/16 v0, 0x54

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_b

    :cond_7
    const/16 v0, 0x72

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_8

    const/16 v0, 0x52

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_b

    :cond_8
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_9

    const/16 v0, 0x55

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_b

    :cond_9
    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-eq v9, v0, :cond_a

    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v8, v0, :cond_b

    .line 2235
    :cond_a
    const-string v0, "true"

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 2236
    sget-object v0, Lcom/google/a/d/e;->h:Lcom/google/a/d/e;

    goto :goto_1

    .line 2237
    :cond_b
    iget v0, p0, Lcom/google/a/d/a;->p:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_11

    const/16 v0, 0x66

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_c

    const/16 v0, 0x46

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_11

    :cond_c
    const/16 v0, 0x61

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_d

    const/16 v0, 0x41

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_11

    :cond_d
    const/16 v0, 0x6c

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_e

    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_11

    :cond_e
    const/16 v0, 0x73

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_f

    const/16 v0, 0x53

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_11

    :cond_f
    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    if-eq v9, v0, :cond_10

    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->o:I

    add-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    if-ne v8, v0, :cond_11

    .line 2243
    :cond_10
    const-string v0, "false"

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 2244
    sget-object v0, Lcom/google/a/d/e;->h:Lcom/google/a/d/e;

    goto/16 :goto_1

    .line 2246
    :cond_11
    iget-object v0, p0, Lcom/google/a/d/a;->b:Lcom/google/a/d/i;

    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    iget v3, p0, Lcom/google/a/d/a;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/a/d/i;->a([CII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 2247
    iget-object v3, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->o:I

    iget v4, p0, Lcom/google/a/d/a;->p:I

    .line 2259
    aget-char v0, v3, v2

    .line 2261
    const/16 v1, 0x2d

    if-ne v0, v1, :cond_1c

    .line 2262
    add-int/lit8 v1, v2, 0x1

    aget-char v0, v3, v1

    .line 2265
    :goto_2
    if-ne v0, v6, :cond_13

    .line 2266
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    .line 2276
    :cond_12
    const/16 v5, 0x2e

    if-ne v0, v5, :cond_15

    .line 2277
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    .line 2278
    :goto_3
    if-lt v0, v6, :cond_15

    if-gt v0, v7, :cond_15

    .line 2279
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    goto :goto_3

    .line 2267
    :cond_13
    const/16 v5, 0x31

    if-lt v0, v5, :cond_14

    if-gt v0, v7, :cond_14

    .line 2268
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    .line 2269
    :goto_4
    if-lt v0, v6, :cond_12

    if-gt v0, v7, :cond_12

    .line 2270
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    goto :goto_4

    .line 2273
    :cond_14
    sget-object v0, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    goto/16 :goto_1

    :cond_15
    move v10, v0

    move v0, v1

    move v1, v10

    .line 2283
    if-eq v1, v9, :cond_16

    if-ne v1, v8, :cond_1a

    .line 2284
    :cond_16
    add-int/lit8 v1, v0, 0x1

    aget-char v0, v3, v1

    .line 2285
    const/16 v5, 0x2b

    if-eq v0, v5, :cond_17

    const/16 v5, 0x2d

    if-ne v0, v5, :cond_18

    .line 2286
    :cond_17
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    .line 2288
    :cond_18
    if-lt v0, v6, :cond_19

    if-gt v0, v7, :cond_19

    .line 2289
    add-int/lit8 v1, v1, 0x1

    aget-char v0, v3, v1

    move v10, v0

    move v0, v1

    move v1, v10

    .line 2290
    :goto_5
    if-lt v1, v6, :cond_1a

    if-gt v1, v7, :cond_1a

    .line 2291
    add-int/lit8 v1, v0, 0x1

    aget-char v0, v3, v1

    move v10, v0

    move v0, v1

    move v1, v10

    goto :goto_5

    .line 2294
    :cond_19
    sget-object v0, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    goto/16 :goto_1

    .line 2298
    :cond_1a
    add-int v1, v2, v4

    if-ne v0, v1, :cond_1b

    .line 2299
    sget-object v0, Lcom/google/a/d/e;->g:Lcom/google/a/d/e;

    goto/16 :goto_1

    .line 2301
    :cond_1b
    sget-object v0, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    goto/16 :goto_1

    :cond_1c
    move v1, v2

    goto :goto_2

    .line 772
    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
        0x5b -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch
.end method

.method private r()I
    .locals 4

    .prologue
    .line 842
    iget v1, p0, Lcom/google/a/d/a;->h:I

    .line 843
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/google/a/d/a;->f:I

    if-ge v0, v2, :cond_1

    .line 844
    iget-object v2, p0, Lcom/google/a/d/a;->e:[C

    aget-char v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    .line 845
    add-int/lit8 v1, v1, 0x1

    .line 843
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 848
    :cond_1
    return v1
.end method

.method private s()I
    .locals 4

    .prologue
    .line 852
    iget v1, p0, Lcom/google/a/d/a;->i:I

    .line 853
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/google/a/d/a;->f:I

    if-ge v0, v2, :cond_1

    .line 854
    iget-object v2, p0, Lcom/google/a/d/a;->e:[C

    aget-char v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    .line 855
    const/4 v1, 0x1

    .line 853
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 857
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 860
    :cond_1
    return v1
.end method

.method private t()V
    .locals 1

    .prologue
    .line 962
    iget-boolean v0, p0, Lcom/google/a/d/a;->d:Z

    if-nez v0, :cond_0

    .line 963
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 965
    :cond_0
    return-void
.end method

.method private u()V
    .locals 3

    .prologue
    .line 973
    :cond_0
    iget v0, p0, Lcom/google/a/d/a;->f:I

    iget v1, p0, Lcom/google/a/d/a;->g:I

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 974
    :cond_1
    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/a/d/a;->f:I

    aget-char v0, v0, v1

    .line 975
    const/16 v1, 0xd

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 979
    :cond_2
    return-void
.end method

.method private v()C
    .locals 7

    .prologue
    const/4 v5, 0x4

    .line 1150
    iget v0, p0, Lcom/google/a/d/a;->f:I

    iget v1, p0, Lcom/google/a/d/a;->g:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1151
    const-string v0, "Unterminated escape sequence"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1154
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/a/d/a;->f:I

    aget-char v0, v0, v1

    .line 1155
    sparse-switch v0, :sswitch_data_0

    .line 1197
    :goto_0
    return v0

    .line 1157
    :sswitch_0
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x4

    iget v1, p0, Lcom/google/a/d/a;->g:I

    if-le v0, v1, :cond_1

    invoke-direct {p0, v5}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1158
    const-string v0, "Unterminated escape sequence"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1161
    :cond_1
    const/4 v1, 0x0

    .line 1162
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v2, v0, 0x4

    move v6, v0

    move v0, v1

    move v1, v6

    :goto_1
    if-ge v1, v2, :cond_5

    .line 1163
    iget-object v3, p0, Lcom/google/a/d/a;->e:[C

    aget-char v3, v3, v1

    .line 1164
    shl-int/lit8 v0, v0, 0x4

    int-to-char v0, v0

    .line 1165
    const/16 v4, 0x30

    if-lt v3, v4, :cond_2

    const/16 v4, 0x39

    if-gt v3, v4, :cond_2

    .line 1166
    add-int/lit8 v3, v3, -0x30

    add-int/2addr v0, v3

    int-to-char v0, v0

    .line 1162
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1167
    :cond_2
    const/16 v4, 0x61

    if-lt v3, v4, :cond_3

    const/16 v4, 0x66

    if-gt v3, v4, :cond_3

    .line 1168
    add-int/lit8 v3, v3, -0x61

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v0, v3

    int-to-char v0, v0

    goto :goto_2

    .line 1169
    :cond_3
    const/16 v4, 0x41

    if-lt v3, v4, :cond_4

    const/16 v4, 0x46

    if-gt v3, v4, :cond_4

    .line 1170
    add-int/lit8 v3, v3, -0x41

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v0, v3

    int-to-char v0, v0

    goto :goto_2

    .line 1172
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\\u"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->b:Lcom/google/a/d/i;

    iget-object v3, p0, Lcom/google/a/d/a;->e:[C

    iget v4, p0, Lcom/google/a/d/a;->f:I

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/a/d/i;->a([CII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1175
    :cond_5
    iget v1, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/a/d/a;->f:I

    goto :goto_0

    .line 1179
    :sswitch_1
    const/16 v0, 0x9

    goto :goto_0

    .line 1182
    :sswitch_2
    const/16 v0, 0x8

    goto :goto_0

    .line 1185
    :sswitch_3
    const/16 v0, 0xa

    goto/16 :goto_0

    .line 1188
    :sswitch_4
    const/16 v0, 0xd

    goto/16 :goto_0

    .line 1191
    :sswitch_5
    const/16 v0, 0xc

    goto/16 :goto_0

    .line 1155
    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_2
        0x66 -> :sswitch_5
        0x6e -> :sswitch_3
        0x72 -> :sswitch_4
        0x74 -> :sswitch_1
        0x75 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 306
    sget-object v0, Lcom/google/a/d/e;->a:Lcom/google/a/d/e;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/e;)V

    .line 307
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 291
    iput-boolean p1, p0, Lcom/google/a/d/a;->d:Z

    .line 292
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 314
    sget-object v0, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/e;)V

    .line 315
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 322
    sget-object v0, Lcom/google/a/d/e;->c:Lcom/google/a/d/e;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/e;)V

    .line 323
    return-void
.end method

.method public close()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 620
    iput-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 621
    iput-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 622
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/a/d/d;->h:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    .line 623
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->k:I

    .line 624
    iget-object v0, p0, Lcom/google/a/d/a;->c:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 625
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 330
    sget-object v0, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Lcom/google/a/d/e;)V

    .line 331
    return-void
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 349
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 350
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Lcom/google/a/d/e;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    .line 357
    iget-object v1, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    if-eqz v1, :cond_1

    .line 358
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    .line 392
    :cond_0
    :goto_0
    return-object v0

    .line 361
    :cond_1
    sget-object v1, Lcom/google/a/d/c;->a:[I

    iget-object v2, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v3, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/google/a/d/d;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 396
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 363
    :pswitch_0
    iget-boolean v1, p0, Lcom/google/a/d/a;->d:Z

    if-eqz v1, :cond_4

    .line 1405
    invoke-direct {p0, v4}, Lcom/google/a/d/a;->d(Z)I

    .line 1406
    iget v1, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/a/d/a;->f:I

    .line 1408
    iget v1, p0, Lcom/google/a/d/a;->f:I

    sget-object v2, Lcom/google/a/d/a;->a:[C

    array-length v2, v2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/google/a/d/a;->g:I

    if-le v1, v2, :cond_2

    sget-object v1, Lcom/google/a/d/a;->a:[C

    array-length v1, v1

    invoke-direct {p0, v1}, Lcom/google/a/d/a;->a(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1412
    :cond_2
    :goto_1
    sget-object v1, Lcom/google/a/d/a;->a:[C

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 1413
    iget-object v1, p0, Lcom/google/a/d/a;->e:[C

    iget v2, p0, Lcom/google/a/d/a;->f:I

    add-int/2addr v2, v0

    aget-char v1, v1, v2

    sget-object v2, Lcom/google/a/d/a;->a:[C

    aget-char v2, v2, v0

    if-ne v1, v2, :cond_4

    .line 1412
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1419
    :cond_3
    iget v0, p0, Lcom/google/a/d/a;->f:I

    sget-object v1, Lcom/google/a/d/a;->a:[C

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 366
    :cond_4
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v1, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v1, v1, -0x1

    sget-object v2, Lcom/google/a/d/d;->g:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    .line 367
    invoke-direct {p0}, Lcom/google/a/d/a;->q()Lcom/google/a/d/e;

    move-result-object v0

    .line 368
    iget-boolean v1, p0, Lcom/google/a/d/a;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v2, Lcom/google/a/d/e;->a:Lcom/google/a/d/e;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v2, Lcom/google/a/d/e;->c:Lcom/google/a/d/e;

    if-eq v1, v2, :cond_0

    .line 369
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected JSON document to start with \'[\' or \'{\' but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 374
    :pswitch_1
    invoke-direct {p0, v4}, Lcom/google/a/d/a;->b(Z)Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 376
    :pswitch_2
    invoke-direct {p0, v0}, Lcom/google/a/d/a;->b(Z)Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 378
    :pswitch_3
    invoke-direct {p0, v4}, Lcom/google/a/d/a;->c(Z)Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 1752
    :pswitch_4
    invoke-direct {p0, v4}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 1762
    :pswitch_5
    const-string v0, "Expected \':\'"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1756
    :pswitch_6
    invoke-direct {p0}, Lcom/google/a/d/a;->t()V

    .line 1757
    iget v0, p0, Lcom/google/a/d/a;->f:I

    iget v1, p0, Lcom/google/a/d/a;->g:I

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v4}, Lcom/google/a/d/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    iget-object v0, p0, Lcom/google/a/d/a;->e:[C

    iget v1, p0, Lcom/google/a/d/a;->f:I

    aget-char v0, v0, v1

    const/16 v1, 0x3e

    if-ne v0, v1, :cond_6

    .line 1758
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 1765
    :cond_6
    :pswitch_7
    iget-object v0, p0, Lcom/google/a/d/a;->j:[Lcom/google/a/d/d;

    iget v1, p0, Lcom/google/a/d/a;->k:I

    add-int/lit8 v1, v1, -0x1

    sget-object v2, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    .line 1766
    invoke-direct {p0}, Lcom/google/a/d/a;->q()Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 382
    :pswitch_8
    invoke-direct {p0, v0}, Lcom/google/a/d/a;->c(Z)Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 384
    :pswitch_9
    invoke-direct {p0, v0}, Lcom/google/a/d/a;->d(Z)I

    move-result v0

    .line 385
    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    .line 386
    sget-object v0, Lcom/google/a/d/e;->j:Lcom/google/a/d/e;

    goto/16 :goto_0

    .line 388
    :cond_7
    iget v0, p0, Lcom/google/a/d/a;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/d/a;->f:I

    .line 389
    iget-boolean v0, p0, Lcom/google/a/d/a;->d:Z

    if-nez v0, :cond_8

    .line 390
    const-string v0, "Expected EOF"

    invoke-direct {p0, v0}, Lcom/google/a/d/a;->a(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 392
    :cond_8
    invoke-direct {p0}, Lcom/google/a/d/a;->q()Lcom/google/a/d/e;

    move-result-object v0

    goto/16 :goto_0

    .line 394
    :pswitch_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 361
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch

    .line 1752
    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_7
        :pswitch_5
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public g()Ljava/lang/String;
    .locals 3

    .prologue
    .line 443
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 444
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->e:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 445
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->m:Ljava/lang/String;

    .line 449
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 450
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 3

    .prologue
    .line 462
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 463
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->g:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 464
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a string but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    .line 469
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 470
    return-object v0
.end method

.method public i()Z
    .locals 3

    .prologue
    .line 481
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 482
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->h:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 483
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a boolean but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 487
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    const-string v1, "true"

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    .line 488
    :goto_0
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 489
    return v0

    .line 487
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()V
    .locals 3

    .prologue
    .line 500
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 501
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 502
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected null but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 506
    :cond_0
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 507
    return-void
.end method

.method public k()D
    .locals 4

    .prologue
    .line 519
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 520
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->g:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 521
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a double but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 525
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 527
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, v0, v2

    if-ltz v2, :cond_1

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 528
    new-instance v0, Lcom/google/a/d/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON forbids octal prefixes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/d/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 531
    :cond_1
    iget-boolean v2, p0, Lcom/google/a/d/a;->d:Z

    if-nez v2, :cond_3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 532
    :cond_2
    new-instance v0, Lcom/google/a/d/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/d/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 536
    :cond_3
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 537
    return-wide v0
.end method

.method public l()J
    .locals 6

    .prologue
    .line 551
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 552
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->g:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 553
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a long but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 559
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 569
    :cond_1
    const-wide/16 v2, 0x1

    cmp-long v2, v0, v2

    if-ltz v2, :cond_2

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 570
    new-instance v0, Lcom/google/a/d/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON forbids octal prefixes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/d/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 561
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 562
    double-to-long v0, v2

    .line 563
    long-to-double v4, v0

    cmpl-double v2, v4, v2

    if-eqz v2, :cond_1

    .line 564
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a long but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_2
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 575
    return-wide v0
.end method

.method public m()I
    .locals 6

    .prologue
    .line 589
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 590
    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->f:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    sget-object v1, Lcom/google/a/d/e;->g:Lcom/google/a/d/e;

    if-eq v0, v1, :cond_0

    .line 591
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected an int but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->l:Lcom/google/a/d/e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 597
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 607
    :cond_1
    int-to-long v2, v0

    const-wide/16 v4, 0x1

    cmp-long v1, v2, v4

    if-ltz v1, :cond_2

    iget-object v1, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 608
    new-instance v0, Lcom/google/a/d/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON forbids octal prefixes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/d/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 599
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 600
    double-to-int v0, v2

    .line 601
    int-to-double v4, v0

    cmpl-double v1, v4, v2

    if-eqz v1, :cond_1

    .line 602
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected an int but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 612
    :cond_2
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    .line 613
    return v0
.end method

.method public n()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 633
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/a/d/a;->q:Z

    move v0, v1

    .line 637
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/google/a/d/a;->o()Lcom/google/a/d/e;

    move-result-object v2

    .line 638
    sget-object v3, Lcom/google/a/d/e;->a:Lcom/google/a/d/e;

    if-eq v2, v3, :cond_1

    sget-object v3, Lcom/google/a/d/e;->c:Lcom/google/a/d/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, v3, :cond_3

    .line 639
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 643
    :cond_2
    :goto_0
    if-nez v0, :cond_0

    .line 645
    iput-boolean v1, p0, Lcom/google/a/d/a;->q:Z

    .line 646
    return-void

    .line 640
    :cond_3
    :try_start_1
    sget-object v3, Lcom/google/a/d/e;->b:Lcom/google/a/d/e;

    if-eq v2, v3, :cond_4

    sget-object v3, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v3, :cond_2

    .line 641
    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 645
    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lcom/google/a/d/a;->q:Z

    throw v0
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 298
    iget-boolean v0, p0, Lcom/google/a/d/a;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " at line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/a/d/a;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " column "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/a/d/a;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
