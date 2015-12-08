.class final Lcom/google/android/gms/internal/um;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/al;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/uj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/uj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/um;->a:Lcom/google/android/gms/internal/uj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isConnected()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/um;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uj;->g()Z

    move-result v0

    return v0
.end method

.method public final zzmS()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
