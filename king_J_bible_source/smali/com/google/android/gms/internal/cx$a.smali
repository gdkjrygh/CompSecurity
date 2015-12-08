.class public final Lcom/google/android/gms/internal/cx$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final kH:Ljava/lang/String;

.field public final kK:Lcom/google/android/gms/internal/dx;

.field public final kN:Lcom/google/android/gms/internal/ak;

.field public final pf:Landroid/os/Bundle;

.field public final pg:Lcom/google/android/gms/internal/ah;

.field public final ph:Landroid/content/pm/PackageInfo;

.field public final pj:Ljava/lang/String;

.field public final pk:Ljava/lang/String;

.field public final pl:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/dx;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cx$a;->pf:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/cx$a;->pg:Lcom/google/android/gms/internal/ah;

    iput-object p3, p0, Lcom/google/android/gms/internal/cx$a;->kN:Lcom/google/android/gms/internal/ak;

    iput-object p4, p0, Lcom/google/android/gms/internal/cx$a;->kH:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/cx$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p6, p0, Lcom/google/android/gms/internal/cx$a;->ph:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/cx$a;->pj:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/cx$a;->pk:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/cx$a;->kK:Lcom/google/android/gms/internal/dx;

    iput-object p10, p0, Lcom/google/android/gms/internal/cx$a;->pl:Landroid/os/Bundle;

    return-void
.end method
