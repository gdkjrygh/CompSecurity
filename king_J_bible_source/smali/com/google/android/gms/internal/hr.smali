.class public Lcom/google/android/gms/internal/hr;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final Ok:Lcom/google/android/gms/internal/hf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hf",
            "<",
            "Lcom/google/android/gms/internal/ha;",
            ">;"
        }
    .end annotation
.end field

.field private final Rj:Lcom/google/android/gms/internal/hs;

.field private final Rk:Ljava/util/Locale;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/hr;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/hr;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/hf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hf",
            "<",
            "Lcom/google/android/gms/internal/ha;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/hr;->Ok:Lcom/google/android/gms/internal/hf;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hr;->Rk:Ljava/util/Locale;

    new-instance v0, Lcom/google/android/gms/internal/hs;

    iget-object v1, p0, Lcom/google/android/gms/internal/hr;->Rk:Ljava/util/Locale;

    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/hs;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/hr;->Rj:Lcom/google/android/gms/internal/hs;

    return-void
.end method
