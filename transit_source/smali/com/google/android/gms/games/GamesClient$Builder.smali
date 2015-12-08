.class public final Lcom/google/android/gms/games/GamesClient$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/GamesClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final iq:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

.field private final ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

.field private is:[Ljava/lang/String;

.field private it:Ljava/lang/String;

.field private mA:Ljava/lang/String;

.field private mB:I

.field private mC:Landroid/view/View;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "connectedListener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .param p3, "connectionFailedListener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "<<default account>>"

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->it:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "https://www.googleapis.com/auth/games"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->is:[Ljava/lang/String;

    const/16 v0, 0x31

    iput v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mB:I

    iput-object p1, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mA:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/GamesClient$Builder;->iq:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iput-object p3, p0, Lcom/google/android/gms/games/GamesClient$Builder;->ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    return-void
.end method


# virtual methods
.method public create()Lcom/google/android/gms/games/GamesClient;
    .locals 10

    new-instance v0, Lcom/google/android/gms/games/GamesClient;

    iget-object v1, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mA:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/games/GamesClient$Builder;->it:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/games/GamesClient$Builder;->iq:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iget-object v5, p0, Lcom/google/android/gms/games/GamesClient$Builder;->ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    iget-object v6, p0, Lcom/google/android/gms/games/GamesClient$Builder;->is:[Ljava/lang/String;

    iget v7, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mB:I

    iget-object v8, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mC:Landroid/view/View;

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/games/GamesClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Lcom/google/android/gms/games/GamesClient$1;)V

    return-object v0
.end method

.method public setAccountName(Ljava/lang/String;)Lcom/google/android/gms/games/GamesClient$Builder;
    .locals 1
    .param p1, "accountName"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/dm;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->it:Ljava/lang/String;

    return-object p0
.end method

.method public setGravityForPopups(I)Lcom/google/android/gms/games/GamesClient$Builder;
    .locals 0
    .param p1, "gravity"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mB:I

    return-object p0
.end method

.method public varargs setScopes([Ljava/lang/String;)Lcom/google/android/gms/games/GamesClient$Builder;
    .locals 0
    .param p1, "scopes"    # [Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/GamesClient$Builder;->is:[Ljava/lang/String;

    return-object p0
.end method

.method public setViewForPopups(Landroid/view/View;)Lcom/google/android/gms/games/GamesClient$Builder;
    .locals 1
    .param p1, "gamesContentView"    # Landroid/view/View;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/dm;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/games/GamesClient$Builder;->mC:Landroid/view/View;

    return-object p0
.end method
