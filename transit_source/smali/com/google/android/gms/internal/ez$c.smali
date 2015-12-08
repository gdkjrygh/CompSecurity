.class final Lcom/google/android/gms/internal/ez$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/fc",
        "<",
        "Lcom/google/android/gms/internal/ex;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic oX:Lcom/google/android/gms/internal/ez;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ez;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ez$c;->oX:Lcom/google/android/gms/internal/ez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/internal/ez$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ez$c;-><init>(Lcom/google/android/gms/internal/ez;)V

    return-void
.end method


# virtual methods
.method public bc()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ez$c;->oX:Lcom/google/android/gms/internal/ez;

    invoke-static {v0}, Lcom/google/android/gms/internal/ez;->a(Lcom/google/android/gms/internal/ez;)V

    return-void
.end method

.method public synthetic bd()Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ez$c;->cn()Lcom/google/android/gms/internal/ex;

    move-result-object v0

    return-object v0
.end method

.method public cn()Lcom/google/android/gms/internal/ex;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ez$c;->oX:Lcom/google/android/gms/internal/ez;

    invoke-static {v0}, Lcom/google/android/gms/internal/ez;->b(Lcom/google/android/gms/internal/ez;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ex;

    return-object v0
.end method
