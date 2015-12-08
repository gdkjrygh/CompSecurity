.class public final Lcom/b/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/k;


# instance fields
.field public final a:Z

.field private final b:[B

.field private c:I

.field private d:I

.field private e:I

.field private final f:Ljava/io/InputStream;

.field private g:I

.field private h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 591
    const/16 v0, 0x1000

    new-array v0, v0, [B

    invoke-direct {p0, p1, v0}, Lcom/b/a/c;-><init>(Ljava/io/InputStream;[B)V

    .line 592
    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;[B)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 600
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 564
    const v0, 0x7fffffff

    iput v0, p0, Lcom/b/a/c;->i:I

    .line 574
    const/high16 v0, 0x4000000

    iput v0, p0, Lcom/b/a/c;->j:I

    .line 601
    iput-object p2, p0, Lcom/b/a/c;->b:[B

    .line 602
    iput v1, p0, Lcom/b/a/c;->c:I

    .line 603
    iput v1, p0, Lcom/b/a/c;->e:I

    .line 604
    iput v1, p0, Lcom/b/a/c;->h:I

    .line 605
    iput-object p1, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    .line 606
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/b/a/c;->a:Z

    .line 607
    return-void
.end method

.method private a(Z)Z
    .locals 4

    .prologue
    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 740
    iget v0, p0, Lcom/b/a/c;->e:I

    iget v3, p0, Lcom/b/a/c;->c:I

    if-ge v0, v3, :cond_0

    .line 741
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "refillBuffer() called when buffer wasn\'t empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 745
    :cond_0
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v3, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v3

    iget v3, p0, Lcom/b/a/c;->i:I

    if-ne v0, v3, :cond_2

    .line 747
    if-eqz p1, :cond_1

    .line 748
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_1
    move v0, v2

    .line 777
    :goto_0
    return v0

    .line 754
    :cond_2
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v3, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/b/a/c;->h:I

    .line 756
    iput v2, p0, Lcom/b/a/c;->e:I

    .line 757
    iget-object v0, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    if-nez v0, :cond_4

    move v0, v1

    :goto_1
    iput v0, p0, Lcom/b/a/c;->c:I

    .line 758
    iget v0, p0, Lcom/b/a/c;->c:I

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/b/a/c;->c:I

    if-ge v0, v1, :cond_5

    .line 759
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "InputStream#read(byte[]) returned invalid result: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/b/a/c;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nThe InputStream implementation is buggy."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 757
    :cond_4
    iget-object v0, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/b/a/c;->b:[B

    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_1

    .line 763
    :cond_5
    iget v0, p0, Lcom/b/a/c;->c:I

    if-ne v0, v1, :cond_7

    .line 764
    iput v2, p0, Lcom/b/a/c;->c:I

    .line 765
    if-eqz p1, :cond_6

    .line 766
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_6
    move v0, v2

    .line 768
    goto :goto_0

    .line 771
    :cond_7
    invoke-direct {p0}, Lcom/b/a/c;->i()V

    .line 772
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v1, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/b/a/c;->d:I

    add-int/2addr v0, v1

    .line 774
    iget v1, p0, Lcom/b/a/c;->j:I

    if-gt v0, v1, :cond_8

    if-gez v0, :cond_9

    .line 775
    :cond_8
    invoke-static {}, Lcom/b/a/p;->h()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 777
    :cond_9
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 141
    invoke-static {p1}, Lcom/b/a/y;->a(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 163
    invoke-static {}, Lcom/b/a/p;->g()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 143
    :pswitch_0
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    .line 161
    :goto_0
    return v0

    .line 146
    :pswitch_1
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    goto :goto_0

    .line 149
    :pswitch_2
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/b/a/c;->d(I)V

    goto :goto_0

    .line 152
    :cond_0
    :pswitch_3
    invoke-direct {p0}, Lcom/b/a/c;->j()Z

    move-result v2

    if-eqz v2, :cond_2

    iput v1, p0, Lcom/b/a/c;->g:I

    move v2, v1

    :goto_1
    if-eqz v2, :cond_1

    invoke-direct {p0, v2}, Lcom/b/a/c;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 153
    :cond_1
    invoke-static {p1}, Lcom/b/a/y;->b(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/b/a/y;->a(II)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/b/a/c;->a(I)V

    goto :goto_0

    .line 152
    :cond_2
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v2

    ushr-int/lit8 v3, v2, 0x3

    if-nez v3, :cond_3

    invoke-static {}, Lcom/b/a/p;->e()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_3
    iput v2, p0, Lcom/b/a/c;->g:I

    goto :goto_1

    :pswitch_4
    move v0, v1

    .line 158
    goto :goto_0

    .line 160
    :pswitch_5
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    goto :goto_0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private c(I)[B
    .locals 10

    .prologue
    const/4 v5, 0x1

    const/4 v3, -0x1

    const/4 v1, 0x0

    .line 801
    if-gez p1, :cond_0

    .line 802
    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 805
    :cond_0
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v2, p0, Lcom/b/a/c;->e:I

    add-int/2addr v0, v2

    add-int/2addr v0, p1

    iget v2, p0, Lcom/b/a/c;->i:I

    if-le v0, v2, :cond_1

    .line 807
    iget v0, p0, Lcom/b/a/c;->i:I

    iget v1, p0, Lcom/b/a/c;->h:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/b/a/c;->d(I)V

    .line 809
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 812
    :cond_1
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v2, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_2

    .line 814
    new-array v0, p1, [B

    .line 815
    iget-object v2, p0, Lcom/b/a/c;->b:[B

    iget v3, p0, Lcom/b/a/c;->e:I

    invoke-static {v2, v3, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 816
    iget v1, p0, Lcom/b/a/c;->e:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/b/a/c;->e:I

    .line 897
    :goto_0
    return-object v0

    .line 818
    :cond_2
    iget-object v0, p0, Lcom/b/a/c;->b:[B

    array-length v0, v0

    if-ge p1, v0, :cond_4

    .line 823
    new-array v2, p1, [B

    .line 824
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v3, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v3

    .line 825
    iget-object v3, p0, Lcom/b/a/c;->b:[B

    iget v4, p0, Lcom/b/a/c;->e:I

    invoke-static {v3, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 826
    iget v3, p0, Lcom/b/a/c;->c:I

    iput v3, p0, Lcom/b/a/c;->e:I

    .line 831
    invoke-direct {p0, v5}, Lcom/b/a/c;->a(Z)Z

    .line 833
    :goto_1
    sub-int v3, p1, v0

    iget v4, p0, Lcom/b/a/c;->c:I

    if-le v3, v4, :cond_3

    .line 834
    iget-object v3, p0, Lcom/b/a/c;->b:[B

    iget v4, p0, Lcom/b/a/c;->c:I

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 835
    iget v3, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v3

    .line 836
    iget v3, p0, Lcom/b/a/c;->c:I

    iput v3, p0, Lcom/b/a/c;->e:I

    .line 837
    invoke-direct {p0, v5}, Lcom/b/a/c;->a(Z)Z

    goto :goto_1

    .line 840
    :cond_3
    iget-object v3, p0, Lcom/b/a/c;->b:[B

    sub-int v4, p1, v0

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 841
    sub-int v0, p1, v0

    iput v0, p0, Lcom/b/a/c;->e:I

    move-object v0, v2

    .line 843
    goto :goto_0

    .line 855
    :cond_4
    iget v5, p0, Lcom/b/a/c;->e:I

    .line 856
    iget v6, p0, Lcom/b/a/c;->c:I

    .line 859
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v2, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/b/a/c;->h:I

    .line 860
    iput v1, p0, Lcom/b/a/c;->e:I

    .line 861
    iput v1, p0, Lcom/b/a/c;->c:I

    .line 864
    sub-int v0, v6, v5

    sub-int v0, p1, v0

    .line 865
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    .line 867
    :goto_2
    if-lez v4, :cond_8

    .line 868
    iget-object v0, p0, Lcom/b/a/c;->b:[B

    array-length v0, v0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v8, v0, [B

    move v0, v1

    .line 870
    :goto_3
    array-length v2, v8

    if-ge v0, v2, :cond_7

    .line 871
    iget-object v2, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    if-nez v2, :cond_5

    move v2, v3

    .line 873
    :goto_4
    if-ne v2, v3, :cond_6

    .line 874
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 871
    :cond_5
    iget-object v2, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    array-length v9, v8

    sub-int/2addr v9, v0

    invoke-virtual {v2, v8, v0, v9}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    goto :goto_4

    .line 876
    :cond_6
    iget v9, p0, Lcom/b/a/c;->h:I

    add-int/2addr v9, v2

    iput v9, p0, Lcom/b/a/c;->h:I

    .line 877
    add-int/2addr v0, v2

    .line 878
    goto :goto_3

    .line 879
    :cond_7
    array-length v0, v8

    sub-int v0, v4, v0

    .line 880
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v0

    .line 881
    goto :goto_2

    .line 884
    :cond_8
    new-array v3, p1, [B

    .line 887
    sub-int v0, v6, v5

    .line 888
    iget-object v2, p0, Lcom/b/a/c;->b:[B

    invoke-static {v2, v5, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 891
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 892
    array-length v5, v0

    invoke-static {v0, v1, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 893
    array-length v0, v0

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_5

    :cond_9
    move-object v0, v3

    .line 897
    goto/16 :goto_0
.end method

.method private d(I)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 908
    if-gez p1, :cond_0

    .line 909
    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 912
    :cond_0
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v1, p0, Lcom/b/a/c;->e:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lcom/b/a/c;->i:I

    if-le v0, v1, :cond_1

    .line 914
    iget v0, p0, Lcom/b/a/c;->i:I

    iget v1, p0, Lcom/b/a/c;->h:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/b/a/c;->d(I)V

    .line 916
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 919
    :cond_1
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v1, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_3

    .line 921
    iget v0, p0, Lcom/b/a/c;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/b/a/c;->e:I

    .line 939
    :cond_2
    return-void

    .line 924
    :cond_3
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v1, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v1

    .line 925
    iget v1, p0, Lcom/b/a/c;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/b/a/c;->h:I

    .line 926
    iput v2, p0, Lcom/b/a/c;->e:I

    .line 927
    iput v2, p0, Lcom/b/a/c;->c:I

    move v1, v0

    .line 930
    :goto_0
    if-ge v1, p1, :cond_2

    .line 931
    iget-object v0, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    if-nez v0, :cond_4

    const/4 v0, -0x1

    .line 932
    :goto_1
    if-gtz v0, :cond_5

    .line 933
    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 931
    :cond_4
    iget-object v0, p0, Lcom/b/a/c;->f:Ljava/io/InputStream;

    sub-int v2, p1, v1

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    long-to-int v0, v2

    goto :goto_1

    .line 935
    :cond_5
    add-int/2addr v1, v0

    .line 936
    iget v2, p0, Lcom/b/a/c;->h:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/b/a/c;->h:I

    goto :goto_0
.end method

.method private i()V
    .locals 2

    .prologue
    .line 681
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v1, p0, Lcom/b/a/c;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/b/a/c;->c:I

    .line 682
    iget v0, p0, Lcom/b/a/c;->h:I

    iget v1, p0, Lcom/b/a/c;->c:I

    add-int/2addr v0, v1

    .line 683
    iget v1, p0, Lcom/b/a/c;->i:I

    if-le v0, v1, :cond_0

    .line 685
    iget v1, p0, Lcom/b/a/c;->i:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/b/a/c;->d:I

    .line 686
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v1, p0, Lcom/b/a/c;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/b/a/c;->c:I

    .line 690
    :goto_0
    return-void

    .line 688
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/c;->d:I

    goto :goto_0
.end method

.method private j()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 721
    iget v1, p0, Lcom/b/a/c;->e:I

    iget v2, p0, Lcom/b/a/c;->c:I

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Lcom/b/a/c;->a(Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private k()B
    .locals 3

    .prologue
    .line 788
    iget v0, p0, Lcom/b/a/c;->e:I

    iget v1, p0, Lcom/b/a/c;->c:I

    if-ne v0, v1, :cond_0

    .line 789
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/b/a/c;->a(Z)Z

    .line 791
    :cond_0
    iget-object v0, p0, Lcom/b/a/c;->b:[B

    iget v1, p0, Lcom/b/a/c;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/b/a/c;->e:I

    aget-byte v0, v0, v1

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    .line 356
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v0

    .line 357
    if-ltz v0, :cond_1

    .line 386
    :cond_0
    :goto_0
    return v0

    .line 360
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 361
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v1

    if-ltz v1, :cond_2

    .line 362
    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_0

    .line 364
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 365
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v1

    if-ltz v1, :cond_3

    .line 366
    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_0

    .line 368
    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 369
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v1

    if-ltz v1, :cond_4

    .line 370
    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_0

    .line 372
    :cond_4
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 373
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    .line 374
    if-gez v1, :cond_0

    .line 376
    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    .line 377
    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v2

    if-gez v2, :cond_0

    .line 376
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 381
    :cond_5
    invoke-static {}, Lcom/b/a/p;->d()Lcom/b/a/p;

    move-result-object v0

    throw v0
.end method

.method public final a(Lcom/b/a/u;)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 943
    invoke-direct {p0}, Lcom/b/a/c;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 944
    iput v0, p0, Lcom/b/a/c;->g:I

    .line 966
    :goto_0
    return v0

    .line 948
    :cond_0
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v2

    .line 949
    ushr-int/lit8 v1, v2, 0x3

    .line 950
    if-nez v1, :cond_2

    .line 951
    iget-boolean v1, p0, Lcom/b/a/c;->a:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x7

    and-int/lit8 v2, v2, 0x7

    if-ne v1, v2, :cond_1

    .line 954
    iput v0, p0, Lcom/b/a/c;->g:I

    goto :goto_0

    .line 958
    :cond_1
    invoke-static {}, Lcom/b/a/p;->e()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 960
    :cond_2
    iget-boolean v3, p0, Lcom/b/a/c;->a:Z

    if-eqz v3, :cond_3

    const/4 v3, 0x4

    and-int/lit8 v4, v2, 0x7

    if-ne v3, v4, :cond_3

    .line 961
    iput v0, p0, Lcom/b/a/c;->g:I

    goto :goto_0

    .line 965
    :cond_3
    iput v2, p0, Lcom/b/a/c;->g:I

    move v0, v1

    .line 966
    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 238
    iget-boolean v0, p0, Lcom/b/a/c;->a:Z

    if-eqz v0, :cond_2

    .line 239
    if-nez p1, :cond_0

    invoke-interface {p2}, Lcom/b/a/u;->a()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    invoke-interface {p2, p0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p1, p2}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v0

    :cond_1
    invoke-virtual {p0, v3}, Lcom/b/a/c;->a(I)V

    .line 258
    :goto_0
    return-object p1

    .line 241
    :cond_2
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v0

    .line 245
    if-gez v0, :cond_3

    invoke-static {}, Lcom/b/a/p;->c()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_3
    iget v1, p0, Lcom/b/a/c;->h:I

    iget v2, p0, Lcom/b/a/c;->e:I

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/b/a/c;->i:I

    if-le v0, v1, :cond_4

    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_4
    iput v0, p0, Lcom/b/a/c;->i:I

    invoke-direct {p0}, Lcom/b/a/c;->i()V

    .line 248
    if-nez p1, :cond_5

    .line 249
    invoke-interface {p2}, Lcom/b/a/u;->a()Ljava/lang/Object;

    move-result-object p1

    .line 251
    :cond_5
    invoke-interface {p2, p0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    .line 252
    invoke-interface {p2, p1}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 253
    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p1, p2}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v0

    .line 255
    :cond_6
    invoke-virtual {p0, v3}, Lcom/b/a/c;->a(I)V

    .line 257
    iput v1, p0, Lcom/b/a/c;->i:I

    invoke-direct {p0}, Lcom/b/a/c;->i()V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 129
    iget v0, p0, Lcom/b/a/c;->g:I

    if-eq v0, p1, :cond_0

    .line 130
    invoke-static {}, Lcom/b/a/p;->f()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 132
    :cond_0
    return-void
.end method

.method public final a(ILcom/b/a/u;)V
    .locals 1

    .prologue
    .line 985
    iget v0, p0, Lcom/b/a/c;->g:I

    invoke-direct {p0, v0}, Lcom/b/a/c;->b(I)Z

    .line 986
    return-void
.end method

.method public final b()J
    .locals 6

    .prologue
    .line 194
    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    invoke-direct {p0}, Lcom/b/a/c;->k()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/b/a/p;->d()Lcom/b/a/p;

    move-result-object v0

    throw v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 204
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 219
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 1003
    iget v0, p0, Lcom/b/a/c;->g:I

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 326
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v1

    .line 225
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v2, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 228
    iget-object v0, p0, Lcom/b/a/c;->b:[B

    iget v2, p0, Lcom/b/a/c;->e:I

    invoke-static {v0, v2, v1}, Lcom/b/a/w$a;->a([BII)Ljava/lang/String;

    move-result-object v0

    .line 229
    iget v2, p0, Lcom/b/a/c;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/b/a/c;->e:I

    .line 233
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v1}, Lcom/b/a/c;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/b/a/w$a;->a([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final h()Lcom/b/a/b;
    .locals 3

    .prologue
    .line 302
    invoke-virtual {p0}, Lcom/b/a/c;->a()I

    move-result v1

    .line 303
    iget v0, p0, Lcom/b/a/c;->c:I

    iget v2, p0, Lcom/b/a/c;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 306
    iget-object v0, p0, Lcom/b/a/c;->b:[B

    iget v2, p0, Lcom/b/a/c;->e:I

    invoke-static {v0, v2, v1}, Lcom/b/a/b;->a([BII)Lcom/b/a/b;

    move-result-object v0

    .line 307
    iget v2, p0, Lcom/b/a/c;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/b/a/c;->e:I

    .line 312
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, v1}, Lcom/b/a/c;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/b/a/b;->a([B)Lcom/b/a/b;

    move-result-object v0

    goto :goto_0
.end method
