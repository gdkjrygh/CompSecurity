.class public Lcom/google/android/gms/plus/PlusClient$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/plus/PlusClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

.field private final mContext:Landroid/content/Context;

.field private final rc:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

.field private final rd:Lcom/google/android/gms/internal/fo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "connectionCallbacks"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .param p3, "connectionFailedListener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rc:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iput-object p3, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    new-instance v0, Lcom/google/android/gms/internal/fo;

    iget-object v1, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/plus/PlusClient;
    .locals 6

    new-instance v0, Lcom/google/android/gms/plus/PlusClient;

    new-instance v1, Lcom/google/android/gms/internal/fl;

    iget-object v2, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/fo;->dh()Lcom/google/android/gms/internal/fn;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rc:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iget-object v5, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->ir:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/fl;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/fn;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/plus/PlusClient;-><init>(Lcom/google/android/gms/internal/fl;)V

    return-object v0
.end method

.method public clearScopes()Lcom/google/android/gms/plus/PlusClient$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fo;->dg()Lcom/google/android/gms/internal/fo;

    return-object p0
.end method

.method public setAccountName(Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;
    .locals 1
    .param p1, "accountName"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fo;->Z(Ljava/lang/String;)Lcom/google/android/gms/internal/fo;

    return-object p0
.end method

.method public varargs setActions([Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;
    .locals 1
    .param p1, "actions"    # [Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fo;->e([Ljava/lang/String;)Lcom/google/android/gms/internal/fo;

    return-object p0
.end method

.method public varargs setScopes([Ljava/lang/String;)Lcom/google/android/gms/plus/PlusClient$Builder;
    .locals 1
    .param p1, "scopes"    # [Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$Builder;->rd:Lcom/google/android/gms/internal/fo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fo;->d([Ljava/lang/String;)Lcom/google/android/gms/internal/fo;

    return-object p0
.end method
