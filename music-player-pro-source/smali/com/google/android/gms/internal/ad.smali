.class public final Lcom/google/android/gms/internal/ad;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final mD:Ljava/lang/String;

.field private final mE:Lorg/json/JSONObject;

.field private final mF:Ljava/lang/String;

.field private final mG:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/gs;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/internal/gs;->wS:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ad;->mG:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ad;->mE:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/ad;->mF:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ad;->mD:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public aE()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mD:Ljava/lang/String;

    return-object v0
.end method

.method public aF()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mG:Ljava/lang/String;

    return-object v0
.end method

.method public aG()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mE:Lorg/json/JSONObject;

    return-object v0
.end method

.method public aH()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ad;->mF:Ljava/lang/String;

    return-object v0
.end method
