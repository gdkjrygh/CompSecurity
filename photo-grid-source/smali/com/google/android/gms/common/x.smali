.class final Lcom/google/android/gms/common/x;
.super Ljava/lang/Object;


# static fields
.field static final a:[Lcom/google/android/gms/common/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/common/k;

    const/4 v1, 0x0

    new-instance v2, Lcom/google/android/gms/common/y;

    const-string v3, "0\u0082\u0003\u00bb0\u0082\u0002\u00a3\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00de\u00df+\u0084&\u0003\u008d\u00dd0"

    invoke-static {v3}, Lcom/google/android/gms/common/k;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/y;-><init>([B)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/google/android/gms/common/z;

    const-string v3, "0\u0082\u0003\u00bb0\u0082\u0002\u00a3\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00dcm\u0081\u001c\u00ac\u00ac Z0"

    invoke-static {v3}, Lcom/google/android/gms/common/k;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/z;-><init>([B)V

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/common/x;->a:[Lcom/google/android/gms/common/k;

    return-void
.end method
