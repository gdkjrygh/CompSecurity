.class public final Lcom/google/android/gms/drive/internal/ak;
.super Lcom/google/android/gms/internal/qq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qq",
        "<",
        "Lcom/google/android/gms/drive/internal/ak;",
        ">;"
    }
.end annotation


# instance fields
.field public QG:Ljava/lang/String;

.field public QH:J

.field public QI:J

.field public versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qq;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/ak;->iK()Lcom/google/android/gms/drive/internal/ak;

    return-void
.end method

.method public static g([B)Lcom/google/android/gms/drive/internal/ak;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/qv;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/ak;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/ak;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/qw;->a(Lcom/google/android/gms/internal/qw;[B)Lcom/google/android/gms/internal/qw;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/ak;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/qp;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->t(II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qp;->b(ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qp;->c(IJ)V

    const/4 v0, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qp;->c(IJ)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/ak;->m(Lcom/google/android/gms/internal/qo;)Lcom/google/android/gms/drive/internal/ak;

    move-result-object v0

    return-object v0
.end method

.method protected c()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/qq;->c()I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->v(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qp;->j(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qp;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qp;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

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
    instance-of v1, p1, Lcom/google/android/gms/drive/internal/ak;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/drive/internal/ak;

    .end local p1    # "o":Ljava/lang/Object;
    iget v1, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    iget v2, p1, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    iget-wide v4, p1, Lcom/google/android/gms/drive/internal/ak;->QH:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    iget-wide v4, p1, Lcom/google/android/gms/drive/internal/ak;->QI:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/ak;->a(Lcom/google/android/gms/internal/qq;)Z

    move-result v0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    iget v0, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/ak;->rQ()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public iK()Lcom/google/android/gms/drive/internal/ak;
    .locals 4

    const-wide/16 v2, -0x1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->ayW:Lcom/google/android/gms/internal/qs;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/ak;->azh:I

    return-object p0
.end method

.method public m(Lcom/google/android/gms/internal/qo;)Lcom/google/android/gms/drive/internal/ak;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rz()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/ak;->a(Lcom/google/android/gms/internal/qo;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rC()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/drive/internal/ak;->versionCode:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->QG:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rF()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/drive/internal/ak;->QH:J

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qo;->rF()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/drive/internal/ak;->QI:J

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
    .end sparse-switch
.end method
