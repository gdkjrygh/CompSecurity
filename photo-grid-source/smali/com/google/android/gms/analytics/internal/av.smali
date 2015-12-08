.class public final enum Lcom/google/android/gms/analytics/internal/av;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/analytics/internal/av;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/analytics/internal/av;

.field public static final enum b:Lcom/google/android/gms/analytics/internal/av;

.field private static final synthetic c:[Lcom/google/android/gms/analytics/internal/av;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/analytics/internal/av;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/av;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/internal/av;->a:Lcom/google/android/gms/analytics/internal/av;

    new-instance v0, Lcom/google/android/gms/analytics/internal/av;

    const-string v1, "GZIP"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/analytics/internal/av;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/internal/av;->b:Lcom/google/android/gms/analytics/internal/av;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/analytics/internal/av;

    sget-object v1, Lcom/google/android/gms/analytics/internal/av;->a:Lcom/google/android/gms/analytics/internal/av;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/analytics/internal/av;->b:Lcom/google/android/gms/analytics/internal/av;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/analytics/internal/av;->c:[Lcom/google/android/gms/analytics/internal/av;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/analytics/internal/av;
    .locals 1

    const-string v0, "GZIP"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/analytics/internal/av;->b:Lcom/google/android/gms/analytics/internal/av;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/analytics/internal/av;->a:Lcom/google/android/gms/analytics/internal/av;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/gms/analytics/internal/av;
    .locals 1

    const-class v0, Lcom/google/android/gms/analytics/internal/av;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/av;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/analytics/internal/av;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/internal/av;->c:[Lcom/google/android/gms/analytics/internal/av;

    invoke-virtual {v0}, [Lcom/google/android/gms/analytics/internal/av;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/analytics/internal/av;

    return-object v0
.end method
