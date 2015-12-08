.class public final Lcom/google/android/gms/internal/iv$a;
.super Lcom/google/android/gms/internal/ma;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/iv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/iv$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ma",
        "<",
        "Lcom/google/android/gms/internal/iv$a;",
        ">;"
    }
.end annotation


# instance fields
.field public Uy:[Lcom/google/android/gms/internal/iv$a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ma;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iv$a;->iQ()Lcom/google/android/gms/internal/iv$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lz;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/lz;->a(ILcom/google/android/gms/internal/me;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/iv$a;->n(Lcom/google/android/gms/internal/ly;)Lcom/google/android/gms/internal/iv$a;

    move-result-object v0

    return-object v0
.end method

.method protected c()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/ma;->c()I

    move-result v1

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/lz;->b(ILcom/google/android/gms/internal/me;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
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
    instance-of v2, p1, Lcom/google/android/gms/internal/iv$a;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/iv$a;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v2, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/mc;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/mc;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public iQ()Lcom/google/android/gms/internal/iv$a;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/iv$a$a;->iR()[Lcom/google/android/gms/internal/iv$a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/iv$a;->amX:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/iv$a;->anb:I

    return-object p0
.end method

.method public n(Lcom/google/android/gms/internal/ly;)Lcom/google/android/gms/internal/iv$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nB()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/iv$a;->a(Lcom/google/android/gms/internal/ly;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/mh;->b(Lcom/google/android/gms/internal/ly;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/iv$a$a;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/internal/iv$a$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/iv$a$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/internal/me;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->nB()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/iv$a$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/iv$a$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/internal/me;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method
