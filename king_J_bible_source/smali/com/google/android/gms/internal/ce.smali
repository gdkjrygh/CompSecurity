.class public final Lcom/google/android/gms/internal/ce;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/cd;


# instance fields
.field public final kK:Lcom/google/android/gms/internal/dx;

.field public final nO:Ljava/lang/String;

.field public final og:Lcom/google/android/gms/internal/cb;

.field public final oh:Lcom/google/android/gms/internal/u;

.field public final oi:Lcom/google/android/gms/internal/cf;

.field public final oj:Lcom/google/android/gms/internal/dz;

.field public final ok:Lcom/google/android/gms/internal/az;

.field public final ol:Ljava/lang/String;

.field public final om:Z

.field public final on:Ljava/lang/String;

.field public final oo:Lcom/google/android/gms/internal/ci;

.field public final op:I

.field public final oq:Lcom/google/android/gms/internal/bc;

.field public final or:Ljava/lang/String;

.field public final orientation:I

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/cd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/cd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ce;->CREATOR:Lcom/google/android/gms/internal/cd;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/internal/cb;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;ZLjava/lang/String;Landroid/os/IBinder;IILjava/lang/String;Lcom/google/android/gms/internal/dx;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    invoke-static {p3}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/u;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    invoke-static {p4}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/cf;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    invoke-static {p5}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/dz;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    invoke-static {p6}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/az;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object p7, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object p9, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    invoke-static {p10}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ci;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iput p11, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    iput p12, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object p13, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    invoke-static/range {p15 .. p15}, Lcom/google/android/gms/dynamic/d$a;->K(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/bc;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dx;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    iput-object p3, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILjava/lang/String;Lcom/google/android/gms/internal/dx;Lcom/google/android/gms/internal/bc;)V
    .locals 2

    const/4 v1, 0x3

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    iput-object p5, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iput p7, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    iput v1, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object p8, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iput-object p10, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/dx;Lcom/google/android/gms/internal/bc;)V
    .locals 2

    const/4 v1, 0x3

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    iput-object p5, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object p9, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iput p7, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    iput v1, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iput-object p11, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    iput-object v0, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ILcom/google/android/gms/internal/dx;Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iput p5, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    iput-object p7, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ZILcom/google/android/gms/internal/dx;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ce;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ce;->om:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iput p6, p0, Lcom/google/android/gms/internal/ce;->orientation:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ce;->op:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    iput-object v1, p0, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/internal/ce;
    .locals 2

    :try_start_0
    const-string v0, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/ce;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ce;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;Lcom/google/android/gms/internal/ce;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    const-string v1, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method aO()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aP()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aQ()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aR()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aS()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aT()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/cd;->a(Lcom/google/android/gms/internal/ce;Landroid/os/Parcel;I)V

    return-void
.end method
