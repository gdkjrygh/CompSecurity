.class public final Lcom/google/android/gms/games/internal/JingleLog;
.super Ljava/lang/Object;


# static fields
.field private static final Qp:Lcom/google/android/gms/internal/jp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/jp;

    const-string v1, "GamesJingle"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/jp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/internal/JingleLog;->Qp:Lcom/google/android/gms/internal/jp;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
