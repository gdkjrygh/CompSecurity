.class public abstract Lcom/google/android/gms/internal/kv;
.super Ljava/lang/Object;


# instance fields
.field protected n:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/kv;->n:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kv;->n:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kv;->b()I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/kv;->n:I

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kp;)V
    .locals 0

    return-void
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/kv;->n:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/kw;->a(Lcom/google/android/gms/internal/kv;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
