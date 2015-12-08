.class public final Lcom/google/android/gms/internal/bu$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final adUnitId:Ljava/lang/String;

.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final ed:Lcom/google/android/gms/internal/x;

.field public final eg:Lcom/google/android/gms/internal/co;

.field public final gA:Landroid/os/Bundle;

.field public final gB:Lcom/google/android/gms/internal/v;

.field public final gC:Landroid/content/pm/PackageInfo;

.field public final gE:Ljava/lang/String;

.field public final gF:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bu$a;->gA:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/bu$a;->gB:Lcom/google/android/gms/internal/v;

    iput-object p3, p0, Lcom/google/android/gms/internal/bu$a;->ed:Lcom/google/android/gms/internal/x;

    iput-object p4, p0, Lcom/google/android/gms/internal/bu$a;->adUnitId:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/bu$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p6, p0, Lcom/google/android/gms/internal/bu$a;->gC:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/bu$a;->gE:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/bu$a;->gF:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/bu$a;->eg:Lcom/google/android/gms/internal/co;

    return-void
.end method
