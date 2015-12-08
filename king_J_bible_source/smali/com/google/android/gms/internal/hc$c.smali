.class final Lcom/google/android/gms/internal/hc$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/hf",
        "<",
        "Lcom/google/android/gms/internal/ha;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic Ou:Lcom/google/android/gms/internal/hc;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/hc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hc$c;->Ou:Lcom/google/android/gms/internal/hc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/hc;Lcom/google/android/gms/internal/hc$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hc$c;-><init>(Lcom/google/android/gms/internal/hc;)V

    return-void
.end method


# virtual methods
.method public bT()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hc$c;->Ou:Lcom/google/android/gms/internal/hc;

    invoke-static {v0}, Lcom/google/android/gms/internal/hc;->a(Lcom/google/android/gms/internal/hc;)V

    return-void
.end method

.method public synthetic eM()Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hc$c;->hR()Lcom/google/android/gms/internal/ha;

    move-result-object v0

    return-object v0
.end method

.method public hR()Lcom/google/android/gms/internal/ha;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hc$c;->Ou:Lcom/google/android/gms/internal/hc;

    invoke-static {v0}, Lcom/google/android/gms/internal/hc;->b(Lcom/google/android/gms/internal/hc;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ha;

    return-object v0
.end method
