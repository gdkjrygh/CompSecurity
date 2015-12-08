.class public final Lcom/google/android/gms/internal/fh$a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final lL:Ljava/lang/String;

.field public final lO:Lcom/google/android/gms/internal/gs;

.field public final lS:Lcom/google/android/gms/internal/ay;

.field public final mc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final tK:Landroid/os/Bundle;

.field public final tL:Lcom/google/android/gms/internal/av;

.field public final tM:Landroid/content/pm/PackageInfo;

.field public final tO:Ljava/lang/String;

.field public final tP:Ljava/lang/String;

.field public final tQ:Landroid/os/Bundle;

.field public final tR:I

.field public final tS:Landroid/os/Bundle;

.field public final tT:Z


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gs;Landroid/os/Bundle;Ljava/util/List;Landroid/os/Bundle;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gs;",
            "Landroid/os/Bundle;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fh$a;->tK:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/fh$a;->tL:Lcom/google/android/gms/internal/av;

    iput-object p3, p0, Lcom/google/android/gms/internal/fh$a;->lS:Lcom/google/android/gms/internal/ay;

    iput-object p4, p0, Lcom/google/android/gms/internal/fh$a;->lL:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/fh$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p6, p0, Lcom/google/android/gms/internal/fh$a;->tM:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/fh$a;->tO:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/fh$a;->tP:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/fh$a;->lO:Lcom/google/android/gms/internal/gs;

    iput-object p10, p0, Lcom/google/android/gms/internal/fh$a;->tQ:Landroid/os/Bundle;

    iput-boolean p13, p0, Lcom/google/android/gms/internal/fh$a;->tT:Z

    if-eqz p11, :cond_0

    invoke-interface {p11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/fh$a;->tR:I

    iput-object p11, p0, Lcom/google/android/gms/internal/fh$a;->mc:Ljava/util/List;

    :goto_0
    iput-object p12, p0, Lcom/google/android/gms/internal/fh$a;->tS:Landroid/os/Bundle;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/fh$a;->tR:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/fh$a;->mc:Ljava/util/List;

    goto :goto_0
.end method
