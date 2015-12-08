.class public final Lcom/google/android/gms/internal/ra$c;
.super Lcom/google/android/gms/internal/qq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ra;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qq",
        "<",
        "Lcom/google/android/gms/internal/ra$c;",
        ">;"
    }
.end annotation


# instance fields
.field public azA:[Lcom/google/android/gms/internal/ra$d;

.field public azB:Lcom/google/android/gms/internal/ra$b;

.field public azC:[B

.field public azD:[B

.field public azE:[B

.field public azF:Lcom/google/android/gms/internal/ra$a;

.field public azG:Ljava/lang/String;

.field public azH:J

.field public azw:J

.field public azx:I

.field public azy:I

.field public azz:Z

.field public tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qq;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ra$c;->sc()Lcom/google/android/gms/internal/ra$c;

    return-void
.end method


# virtual methods
.method public A(Lcom/google/android/gms/internal/qo;)Lcom/google/android/gms/internal/ra$c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rz()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ra$c;->a(Lcom/google/android/gms/internal/qo;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rB()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/qz;->b(Lcom/google/android/gms/internal/qo;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/ra$d;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/internal/ra$d;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ra$d;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qo;->a(Lcom/google/android/gms/internal/qw;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rz()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/ra$d;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ra$d;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qo;->a(Lcom/google/android/gms/internal/qw;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/ra$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ra$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qo;->a(Lcom/google/android/gms/internal/qw;)V

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/ra$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ra$b;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qo;->a(Lcom/google/android/gms/internal/qw;)V

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rD()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rC()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rC()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rF()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x32 -> :sswitch_4
        0x3a -> :sswitch_5
        0x42 -> :sswitch_6
        0x4a -> :sswitch_7
        0x50 -> :sswitch_8
        0x58 -> :sswitch_9
        0x60 -> :sswitch_a
        0x6a -> :sswitch_b
        0x72 -> :sswitch_c
        0x78 -> :sswitch_d
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qp;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v4, 0x0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    cmp-long v0, v0, v4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qp;->b(IJ)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->b(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    array-length v0, v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    aget-object v1, v1, v0

    if-eqz v1, :cond_2

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/qp;->a(ILcom/google/android/gms/internal/qw;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    sget-object v1, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->a(I[B)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-eqz v0, :cond_5

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->a(ILcom/google/android/gms/internal/qw;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    sget-object v1, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->a(I[B)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-eqz v0, :cond_7

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->a(ILcom/google/android/gms/internal/qw;)V

    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    if-eqz v0, :cond_8

    const/16 v0, 0xa

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->b(IZ)V

    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    if-eqz v0, :cond_9

    const/16 v0, 0xb

    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->t(II)V

    :cond_9
    iget v0, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    if-eqz v0, :cond_a

    const/16 v0, 0xc

    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->t(II)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    sget-object v1, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0xd

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->a(I[B)V

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const/16 v0, 0xe

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->b(ILjava/lang/String;)V

    :cond_c
    iget-wide v0, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    cmp-long v0, v0, v4

    if-eqz v0, :cond_d

    const/16 v0, 0xf

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qp;->c(IJ)V

    :cond_d
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qq;->a(Lcom/google/android/gms/internal/qp;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qo;)Lcom/google/android/gms/internal/qw;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ra$c;->A(Lcom/google/android/gms/internal/qo;)Lcom/google/android/gms/internal/ra$c;

    move-result-object v0

    return-object v0
.end method

.method protected c()I
    .locals 7

    const-wide/16 v4, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/qq;->c()I

    move-result v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qp;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->j(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    array-length v1, v1

    if-lez v1, :cond_4

    const/4 v1, 0x0

    move v6, v1

    move v1, v0

    move v0, v6

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x3

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/qp;->c(ILcom/google/android/gms/internal/qw;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    sget-object v2, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-eqz v1, :cond_6

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->c(ILcom/google/android/gms/internal/qw;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    sget-object v2, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_7

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-eqz v1, :cond_8

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->c(ILcom/google/android/gms/internal/qw;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    if-eqz v1, :cond_9

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->c(IZ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    if-eqz v1, :cond_a

    const/16 v1, 0xb

    iget v2, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->v(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    if-eqz v1, :cond_b

    const/16 v1, 0xc

    iget v2, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->v(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    sget-object v2, Lcom/google/android/gms/internal/qz;->azq:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_c

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->j(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_e

    const/16 v1, 0xf

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qp;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    .end local p1    # "o":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    instance-of v1, p1, Lcom/google/android/gms/internal/ra$c;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ra$c;

    .end local p1    # "o":Ljava/lang/Object;
    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ra$c;->azw:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    iget v2, p1, Lcom/google/android/gms/internal/ra$c;->azx:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    iget v2, p1, Lcom/google/android/gms/internal/ra$c;->azy:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ra$c;->azz:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qu;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-nez v1, :cond_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azC:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azD:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azE:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-nez v1, :cond_0

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_5
    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ra$c;->azH:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ra$c;->a(Lcom/google/android/gms/internal/qq;)Z

    move-result v0

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ra$b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ra$a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    invoke-static {v2}, Lcom/google/android/gms/internal/qu;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    if-nez v0, :cond_3

    move v0, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    if-nez v2, :cond_4

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ra$c;->rQ()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, 0x4d5

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ra$b;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ra$a;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_4
.end method

.method public sc()Lcom/google/android/gms/internal/ra$c;
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/internal/ra$c;->azw:J

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->tag:Ljava/lang/String;

    iput v1, p0, Lcom/google/android/gms/internal/ra$c;->azx:I

    iput v1, p0, Lcom/google/android/gms/internal/ra$c;->azy:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ra$c;->azz:Z

    invoke-static {}, Lcom/google/android/gms/internal/ra$d;->sd()[Lcom/google/android/gms/internal/ra$d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azA:[Lcom/google/android/gms/internal/ra$d;

    iput-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azB:Lcom/google/android/gms/internal/ra$b;

    sget-object v0, Lcom/google/android/gms/internal/qz;->azq:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azC:[B

    sget-object v0, Lcom/google/android/gms/internal/qz;->azq:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azD:[B

    sget-object v0, Lcom/google/android/gms/internal/qz;->azq:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azE:[B

    iput-object v2, p0, Lcom/google/android/gms/internal/ra$c;->azF:Lcom/google/android/gms/internal/ra$a;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ra$c;->azG:Ljava/lang/String;

    iput-wide v4, p0, Lcom/google/android/gms/internal/ra$c;->azH:J

    iput-object v2, p0, Lcom/google/android/gms/internal/ra$c;->ayW:Lcom/google/android/gms/internal/qs;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ra$c;->azh:I

    return-object p0
.end method
