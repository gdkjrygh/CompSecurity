.class public abstract Lcom/google/android/gms/internal/xt;
.super Lcom/google/android/gms/internal/yb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/xt",
        "<TM;>;>",
        "Lcom/google/android/gms/internal/yb;"
    }
.end annotation


# instance fields
.field protected m:Lcom/google/android/gms/internal/xy;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/yb;-><init>()V

    return-void
.end method

.method private e()Lcom/google/android/gms/internal/xt;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/internal/yb;->b()Lcom/google/android/gms/internal/yb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/xt;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ya;->a(Lcom/google/android/gms/internal/xt;Lcom/google/android/gms/internal/xt;)V

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    if-eqz v1, :cond_0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/xy;->a()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/xy;->a(I)Lcom/google/android/gms/internal/xz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/xz;->a()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    return v1
.end method

.method public a(Lcom/google/android/gms/internal/xr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/xy;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/xt;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/xy;->a(I)Lcom/google/android/gms/internal/xz;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/xz;->a(Lcom/google/android/gms/internal/xr;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final synthetic b()Lcom/google/android/gms/internal/yb;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/xt;->e()Lcom/google/android/gms/internal/xt;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/xt;->e()Lcom/google/android/gms/internal/xt;

    move-result-object v0

    return-object v0
.end method
