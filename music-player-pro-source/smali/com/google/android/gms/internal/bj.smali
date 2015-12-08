.class public final Lcom/google/android/gms/internal/bj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/bk;


# instance fields
.field public final backgroundColor:I

.field public final oQ:I

.field public final oR:I

.field public final oS:I

.field public final oT:I

.field public final oU:I

.field public final oV:I

.field public final oW:I

.field public final oX:Ljava/lang/String;

.field public final oY:I

.field public final oZ:Ljava/lang/String;

.field public final pa:I

.field public final pb:I

.field public final pc:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/bk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/bk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/bj;->CREATOR:Lcom/google/android/gms/internal/bk;

    return-void
.end method

.method constructor <init>(IIIIIIIIILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/bj;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/internal/bj;->oQ:I

    iput p3, p0, Lcom/google/android/gms/internal/bj;->backgroundColor:I

    iput p4, p0, Lcom/google/android/gms/internal/bj;->oR:I

    iput p5, p0, Lcom/google/android/gms/internal/bj;->oS:I

    iput p6, p0, Lcom/google/android/gms/internal/bj;->oT:I

    iput p7, p0, Lcom/google/android/gms/internal/bj;->oU:I

    iput p8, p0, Lcom/google/android/gms/internal/bj;->oV:I

    iput p9, p0, Lcom/google/android/gms/internal/bj;->oW:I

    iput-object p10, p0, Lcom/google/android/gms/internal/bj;->oX:Ljava/lang/String;

    iput p11, p0, Lcom/google/android/gms/internal/bj;->oY:I

    iput-object p12, p0, Lcom/google/android/gms/internal/bj;->oZ:Ljava/lang/String;

    iput p13, p0, Lcom/google/android/gms/internal/bj;->pa:I

    iput p14, p0, Lcom/google/android/gms/internal/bj;->pb:I

    iput-object p15, p0, Lcom/google/android/gms/internal/bj;->pc:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/bj;->versionCode:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getAnchorTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oQ:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->backgroundColor:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundGradientBottom()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oR:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBackgroundGradientTop()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oS:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oT:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderThickness()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oU:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getBorderType()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oV:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getCallButtonColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oW:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getCustomChannels()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bj;->oX:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getDescriptionTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->oY:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getFontFace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bj;->oZ:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getHeaderTextColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->pa:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getHeaderTextSize()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/bj;->pb:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;->getQuery()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bj;->pc:Ljava/lang/String;

    return-void
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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/bk;->a(Lcom/google/android/gms/internal/bj;Landroid/os/Parcel;I)V

    return-void
.end method
