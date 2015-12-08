.class public final Lcom/google/android/gms/ads/AdRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/AdRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private d:Ljava/util/Date;

.field private dI:I

.field private dK:I

.field private final dM:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final dN:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
            ">;",
            "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
            ">;"
        }
    .end annotation
.end field

.field private final dO:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dM:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dN:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dO:Ljava/util/HashSet;

    iput v1, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dI:I

    iput v1, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dK:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/AdRequest$Builder;)Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->d:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/AdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dI:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/AdRequest$Builder;)Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dM:Ljava/util/HashSet;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/AdRequest$Builder;)Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dN:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/AdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dK:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/AdRequest$Builder;)Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dO:Ljava/util/HashSet;

    return-object v0
.end method


# virtual methods
.method public addKeyword(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 1
    .param p1, "keyword"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dM:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addNetworkExtras(Lcom/google/android/gms/ads/mediation/NetworkExtras;)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 2
    .param p1, "networkExtras"    # Lcom/google/android/gms/ads/mediation/NetworkExtras;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dN:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 1
    .param p1, "deviceId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dO:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public build()Lcom/google/android/gms/ads/AdRequest;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/AdRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/AdRequest;-><init>(Lcom/google/android/gms/ads/AdRequest$Builder;Lcom/google/android/gms/ads/AdRequest$1;)V

    return-object v0
.end method

.method public setBirthday(Ljava/util/Date;)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 0
    .param p1, "birthday"    # Ljava/util/Date;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->d:Ljava/util/Date;

    return-object p0
.end method

.method public setGender(I)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 0
    .param p1, "gender"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dI:I

    return-object p0
.end method

.method public tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 1
    .param p1, "tagForChildDirectedTreatment"    # Z

    .prologue
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->dK:I

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
