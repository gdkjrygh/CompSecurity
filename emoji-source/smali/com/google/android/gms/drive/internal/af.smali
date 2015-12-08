.class public final Lcom/google/android/gms/drive/internal/af;
.super Lcom/google/android/gms/internal/ma;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ma",
        "<",
        "Lcom/google/android/gms/drive/internal/af;",
        ">;"
    }
.end annotation


# instance fields
.field public Jt:Ljava/lang/String;

.field public Ju:J

.field public Jv:J

.field public versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ma;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/af;->gs()Lcom/google/android/gms/drive/internal/af;

    return-void
.end method

.method public static g([B)Lcom/google/android/gms/drive/internal/af;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/md;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/af;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/af;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/me;->a(Lcom/google/android/gms/internal/me;[B)Lcom/google/android/gms/internal/me;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/af;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lz;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/lz;->p(II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/lz;->b(ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/lz;->c(IJ)V

    const/4 v0, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/lz;->c(IJ)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ma;->a(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/ly;)Lcom/google/android/gms/internal/me;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/af;->m(Lcom/google/android/gms/internal/ly;)Lcom/google/android/gms/drive/internal/af;

    move-result-object v0

    return-object v0
.end method

.method protected c()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/ma;->c()I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/lz;->r(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/lz;->h(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/lz;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/lz;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    .end local p1    # "o":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/drive/internal/af;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/drive/internal/af;

    .end local p1    # "o":Ljava/lang/Object;
    iget v2, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    iget v3, p1, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    if-nez v2, :cond_5

    iget-object v2, p1, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_2
    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    iget-wide v4, p1, Lcom/google/android/gms/drive/internal/af;->Ju:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    iget-wide v4, p1, Lcom/google/android/gms/drive/internal/af;->Jv:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_3
    iget-object v2, p1, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    if-eqz v2, :cond_4

    iget-object v2, p1, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public gs()Lcom/google/android/gms/drive/internal/af;
    .locals 4

    const-wide/16 v2, -0x1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/af;->anb:I

    return-object p0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    const/4 v1, 0x0

    iget v0, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    :goto_1
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/af;->amX:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    goto :goto_1
.end method

.method public m(Lcom/google/android/gms/internal/ly;)Lcom/google/android/gms/drive/internal/af;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nB()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/af;->a(Lcom/google/android/gms/internal/ly;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nE()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/drive/internal/af;->versionCode:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/af;->Jt:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nH()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/drive/internal/af;->Ju:J

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nH()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/drive/internal/af;->Jv:J

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
