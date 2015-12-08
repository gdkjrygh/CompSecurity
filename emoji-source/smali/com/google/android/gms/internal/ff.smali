.class public final Lcom/google/android/gms/internal/ff;
.super Ljava/lang/Object;


# static fields
.field public static final xI:Lcom/google/android/gms/common/api/Api$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$c",
            "<",
            "Lcom/google/android/gms/internal/fx;",
            ">;"
        }
    .end annotation
.end field

.field private static final xJ:Lcom/google/android/gms/common/api/Api$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$b",
            "<",
            "Lcom/google/android/gms/internal/fx;",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final xK:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final xL:Lcom/google/android/gms/internal/ft;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$c;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$c;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ff;->xI:Lcom/google/android/gms/common/api/Api$c;

    new-instance v0, Lcom/google/android/gms/internal/ff$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ff$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ff;->xJ:Lcom/google/android/gms/common/api/Api$b;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    sget-object v1, Lcom/google/android/gms/internal/ff;->xJ:Lcom/google/android/gms/common/api/Api$b;

    sget-object v2, Lcom/google/android/gms/internal/ff;->xI:Lcom/google/android/gms/common/api/Api$c;

    const/4 v3, 0x0

    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Lcom/google/android/gms/common/api/Api$b;Lcom/google/android/gms/common/api/Api$c;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcom/google/android/gms/internal/ff;->xK:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/fy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ff;->xL:Lcom/google/android/gms/internal/ft;

    return-void
.end method
