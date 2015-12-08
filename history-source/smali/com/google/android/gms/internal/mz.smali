.class public Lcom/google/android/gms/internal/mz;
.super Ljava/lang/Object;


# instance fields
.field private final DZ:Ljava/lang/String;

.field private final Ee:Lcom/google/android/gms/internal/np;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/np",
            "<",
            "Lcom/google/android/gms/internal/ni;",
            ">;"
        }
    .end annotation
.end field

.field private final JK:Ljava/lang/String;

.field private agz:Lcom/google/android/gms/internal/na;

.field private final mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/np;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/np",
            "<",
            "Lcom/google/android/gms/internal/ni;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mz;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/mz;->DZ:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mz;->Ee:Lcom/google/android/gms/internal/np;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/mz;->agz:Lcom/google/android/gms/internal/na;

    iput-object p3, p0, Lcom/google/android/gms/internal/mz;->JK:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/np;)Lcom/google/android/gms/internal/mz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/np",
            "<",
            "Lcom/google/android/gms/internal/ni;",
            ">;)",
            "Lcom/google/android/gms/internal/mz;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/mz;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/mz;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/np;)V

    return-object v0
.end method
