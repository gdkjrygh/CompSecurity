.class public final Lcom/google/android/gms/internal/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/w;


# instance fields
.field public final es:J

.field public final et:I

.field public final eu:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ev:Z

.field public final extras:Landroid/os/Bundle;

.field public final tagForChildDirectedTreatment:I

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/w;

    invoke-direct {v0}, Lcom/google/android/gms/internal/w;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/v;->CREATOR:Lcom/google/android/gms/internal/w;

    return-void
.end method

.method constructor <init>(IJLandroid/os/Bundle;ILjava/util/List;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/v;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/v;->es:J

    iput-object p4, p0, Lcom/google/android/gms/internal/v;->extras:Landroid/os/Bundle;

    iput p5, p0, Lcom/google/android/gms/internal/v;->et:I

    iput-object p6, p0, Lcom/google/android/gms/internal/v;->eu:Ljava/util/List;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/v;->ev:Z

    iput p8, p0, Lcom/google/android/gms/internal/v;->tagForChildDirectedTreatment:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdRequest;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/v;->versionCode:I

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/v;->es:J

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest;->getGender()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/v;->et:I

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest;->getKeywords()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/v;->eu:Ljava/util/List;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/ads/AdRequest;->isTestDevice(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/v;->ev:Z

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest;->w()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/v;->tagForChildDirectedTreatment:I

    const-class v0, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/AdRequest;->getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    :cond_0
    iput-object v2, p0, Lcom/google/android/gms/internal/v;->extras:Landroid/os/Bundle;

    return-void

    :cond_1
    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_2
    move-object v0, v2

    goto :goto_1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/w;->a(Lcom/google/android/gms/internal/v;Landroid/os/Parcel;I)V

    return-void
.end method
