.class public final enum Lcom/google/android/gms/analytics/l;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/analytics/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum yI:Lcom/google/android/gms/analytics/l;

.field public static final enum yJ:Lcom/google/android/gms/analytics/l;

.field private static final synthetic yK:[Lcom/google/android/gms/analytics/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/analytics/l;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/analytics/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/l;->yI:Lcom/google/android/gms/analytics/l;

    new-instance v0, Lcom/google/android/gms/analytics/l;

    const-string v1, "GZIP"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/analytics/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/l;->yJ:Lcom/google/android/gms/analytics/l;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/analytics/l;

    sget-object v1, Lcom/google/android/gms/analytics/l;->yI:Lcom/google/android/gms/analytics/l;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/analytics/l;->yJ:Lcom/google/android/gms/analytics/l;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/analytics/l;->yK:[Lcom/google/android/gms/analytics/l;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/gms/analytics/l;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    const-class v0, Lcom/google/android/gms/analytics/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/l;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/analytics/l;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/l;->yK:[Lcom/google/android/gms/analytics/l;

    invoke-virtual {v0}, [Lcom/google/android/gms/analytics/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/analytics/l;

    return-object v0
.end method
