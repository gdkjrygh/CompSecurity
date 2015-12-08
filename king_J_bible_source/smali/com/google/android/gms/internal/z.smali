.class public final Lcom/google/android/gms/internal/z;
.super Ljava/lang/Object;


# instance fields
.field private final le:Ljava/lang/String;

.field private final lf:Lorg/json/JSONObject;

.field private final lg:Ljava/lang/String;

.field private final lh:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/dx;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/z;->lh:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/z;->lf:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/z;->lg:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/z;->le:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public al()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/z;->le:Ljava/lang/String;

    return-object v0
.end method

.method public am()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/z;->lh:Ljava/lang/String;

    return-object v0
.end method

.method public an()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/z;->lf:Lorg/json/JSONObject;

    return-object v0
.end method

.method public ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/z;->lg:Ljava/lang/String;

    return-object v0
.end method
