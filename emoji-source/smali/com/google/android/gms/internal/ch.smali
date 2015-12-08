.class public final Lcom/google/android/gms/internal/ch;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/cg;


# instance fields
.field public final kQ:Lcom/google/android/gms/internal/ev;

.field public final oA:Ljava/lang/String;

.field public final oB:Z

.field public final oC:Ljava/lang/String;

.field public final oD:Lcom/google/android/gms/internal/cl;

.field public final oE:I

.field public final oF:Lcom/google/android/gms/internal/bd;

.field public final oG:Ljava/lang/String;

.field public final oH:Lcom/google/android/gms/internal/v;

.field public final ob:Ljava/lang/String;

.field public final orientation:I

.field public final ov:Lcom/google/android/gms/internal/ce;

.field public final ow:Lcom/google/android/gms/internal/t;

.field public final ox:Lcom/google/android/gms/internal/ci;

.field public final oy:Lcom/google/android/gms/internal/ex;

.field public final oz:Lcom/google/android/gms/internal/ba;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/cg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/cg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ch;->CREATOR:Lcom/google/android/gms/internal/cg;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/internal/ce;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;ZLjava/lang/String;Landroid/os/IBinder;IILjava/lang/String;Lcom/google/android/gms/internal/ev;Landroid/os/IBinder;Ljava/lang/String;Lcom/google/android/gms/internal/v;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    invoke-static {p3}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/t;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    invoke-static {p4}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ci;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    invoke-static {p5}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ex;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    invoke-static {p6}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ba;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object p7, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object p9, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    invoke-static {p10}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/cl;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iput p11, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    iput p12, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object p13, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    invoke-static/range {p15 .. p15}, Lcom/google/android/gms/dynamic/d$a;->ag(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/bd;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ev;)V
    .locals 3

    const/4 v2, 0x4

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v2, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    iput-object p3, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    iput v2, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILjava/lang/String;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/bd;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iput-object p1, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    iput-object p5, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object p3, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iput p7, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object p8, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iput-object p10, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/bd;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iput-object p1, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    iput-object p5, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object p3, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object p9, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iput p7, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iput-object p11, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ILcom/google/android/gms/internal/ev;Ljava/lang/String;Lcom/google/android/gms/internal/v;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iput-object p1, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    iput-object p4, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iput p5, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    iput-object p7, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ZILcom/google/android/gms/internal/ev;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ch;->versionCode:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iput-object p1, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    iput-object p2, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    iput-object p4, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ch;->oB:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iput p6, p0, Lcom/google/android/gms/internal/ch;->orientation:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ch;->oE:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/internal/ch;
    .locals 2

    :try_start_0
    const-string v0, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/ch;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ch;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;Lcom/google/android/gms/internal/ch;)V
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
.method aU()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aV()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aW()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aX()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aY()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method aZ()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/cg;->a(Lcom/google/android/gms/internal/ch;Landroid/os/Parcel;I)V

    return-void
.end method
