.class public final Lcom/google/android/gms/ads/search/SearchAdRequest;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/search/SearchAdRequest$1;,
        Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    }
.end annotation


# static fields
.field public static final BORDER_TYPE_DASHED:I = 0x1

.field public static final BORDER_TYPE_DOTTED:I = 0x2

.field public static final BORDER_TYPE_NONE:I = 0x0

.field public static final BORDER_TYPE_SOLID:I = 0x3

.field public static final CALL_BUTTON_COLOR_DARK:I = 0x2

.field public static final CALL_BUTTON_COLOR_LIGHT:I = 0x0

.field public static final CALL_BUTTON_COLOR_MEDIUM:I = 0x1

.field public static final DEVICE_ID_EMULATOR:Ljava/lang/String;

.field public static final ERROR_CODE_INTERNAL_ERROR:I = 0x0

.field public static final ERROR_CODE_INVALID_REQUEST:I = 0x1

.field public static final ERROR_CODE_NETWORK_ERROR:I = 0x2

.field public static final ERROR_CODE_NO_FILL:I = 0x3


# instance fields
.field private final ks:Lcom/google/android/gms/internal/at;

.field private final tc:I

.field private final td:I

.field private final te:I

.field private final tf:I

.field private final tg:I

.field private final th:I

.field private final ti:I

.field private final tj:I

.field private final tk:Ljava/lang/String;

.field private final tl:I

.field private final tm:Ljava/lang/String;

.field private final tn:I

.field private final to:I

.field private final tp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/at;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/ads/search/SearchAdRequest;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)V
    .locals 2
    .param p1, "builder"    # Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->a(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tc:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->b(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->td:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->c(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->te:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->d(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tf:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->e(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tg:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->f(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->th:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->g(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ti:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->h(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tj:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->i(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tk:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->j(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tl:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->k(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tm:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->l(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tn:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->m(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->to:I

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->n(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tp:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/at;

    invoke-static {p1}, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->o(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Lcom/google/android/gms/internal/at$a;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/internal/at$a;Lcom/google/android/gms/ads/search/SearchAdRequest;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;Lcom/google/android/gms/ads/search/SearchAdRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/ads/search/SearchAdRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/search/SearchAdRequest;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)V

    return-void
.end method


# virtual methods
.method T()Lcom/google/android/gms/internal/at;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    return-object v0
.end method

.method public getAnchorTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tc:I

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->td:I

    return v0
.end method

.method public getBackgroundGradientBottom()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->te:I

    return v0
.end method

.method public getBackgroundGradientTop()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tf:I

    return v0
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tg:I

    return v0
.end method

.method public getBorderThickness()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->th:I

    return v0
.end method

.method public getBorderType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ti:I

    return v0
.end method

.method public getCallButtonColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tj:I

    return v0
.end method

.method public getCustomChannels()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tk:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/at;->getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptionTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tl:I

    return v0
.end method

.method public getFontFace()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tm:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tn:I

    return v0
.end method

.method public getHeaderTextSize()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->to:I

    return v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/at;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p1, "networkExtrasClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/at;->getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/at;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->tp:Ljava/lang/String;

    return-object v0
.end method

.method public isTestDevice(Landroid/content/Context;)Z
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ks:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/at;->isTestDevice(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method
