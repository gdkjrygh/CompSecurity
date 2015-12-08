.class public final Lcom/google/android/gms/internal/xu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/xt",
        "<TM;>;T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:I

.field protected final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field

.field public final c:I

.field protected final d:Z


# direct methods
.method private b(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 0
    iget v0, p0, Lcom/google/android/gms/internal/xu;->c:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ye;->a(I)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/xu;->a:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/internal/xu;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast p1, Lcom/google/android/gms/internal/yb;

    .line 4000
    invoke-static {v0}, Lcom/google/android/gms/internal/xr;->b(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    .line 5000
    invoke-virtual {p1}, Lcom/google/android/gms/internal/yb;->d()I

    move-result v1

    .line 4000
    add-int/2addr v0, v1

    .line 0
    :goto_0
    return v0

    :pswitch_1
    check-cast p1, Lcom/google/android/gms/internal/yb;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/xr;->b(ILcom/google/android/gms/internal/yb;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/lang/Object;Lcom/google/android/gms/internal/xr;)V
    .locals 3

    .prologue
    .line 0
    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/xu;->c:I

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/xr;->c(I)V

    iget v0, p0, Lcom/google/android/gms/internal/xu;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/internal/xu;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_0
    :try_start_1
    check-cast p1, Lcom/google/android/gms/internal/yb;

    iget v0, p0, Lcom/google/android/gms/internal/xu;->c:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ye;->a(I)I

    move-result v0

    .line 2000
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/yb;->a(Lcom/google/android/gms/internal/xr;)V

    .line 0
    const/4 v1, 0x4

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/xr;->b(II)V

    :goto_0
    return-void

    :pswitch_1
    check-cast p1, Lcom/google/android/gms/internal/yb;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/xr;->a(Lcom/google/android/gms/internal/yb;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method final a(Ljava/lang/Object;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/xu;->d:Z

    if-eqz v1, :cond_1

    .line 3000
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/xu;->b(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v0, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 0
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/xu;->b(Ljava/lang/Object;)I

    move-result v0

    :cond_2
    return v0
.end method

.method final a(Ljava/lang/Object;Lcom/google/android/gms/internal/xr;)V
    .locals 3

    .prologue
    .line 0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/xu;->d:Z

    if-eqz v0, :cond_1

    .line 1000
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v2, p2}, Lcom/google/android/gms/internal/xu;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/xr;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 0
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/xu;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/xr;)V

    :cond_2
    return-void
.end method
