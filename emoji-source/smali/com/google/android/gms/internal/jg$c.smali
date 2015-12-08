.class final Lcom/google/android/gms/internal/jg$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/jg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/jj",
        "<",
        "Lcom/google/android/gms/internal/je;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic VU:Lcom/google/android/gms/internal/jg;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/jg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jg$c;->VU:Lcom/google/android/gms/internal/jg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/jg;Lcom/google/android/gms/internal/jg$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/jg$c;-><init>(Lcom/google/android/gms/internal/jg;)V

    return-void
.end method


# virtual methods
.method public cn()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg$c;->VU:Lcom/google/android/gms/internal/jg;

    invoke-static {v0}, Lcom/google/android/gms/internal/jg;->b(Lcom/google/android/gms/internal/jg;)V

    return-void
.end method

.method public synthetic ft()Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg$c;->iZ()Lcom/google/android/gms/internal/je;

    move-result-object v0

    return-object v0
.end method

.method public iZ()Lcom/google/android/gms/internal/je;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg$c;->VU:Lcom/google/android/gms/internal/jg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/je;

    return-object v0
.end method
