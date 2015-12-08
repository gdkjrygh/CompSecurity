.class Lcom/google/android/gms/internal/u$b;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field public final lK:Lcom/google/android/gms/internal/u$a;

.field public final lL:Ljava/lang/String;

.field public final lM:Landroid/content/Context;

.field public final lN:Lcom/google/android/gms/internal/k;

.field public final lO:Lcom/google/android/gms/internal/gs;

.field public lP:Lcom/google/android/gms/internal/bc;

.field public lQ:Lcom/google/android/gms/internal/gf;

.field public lR:Lcom/google/android/gms/internal/gf;

.field public lS:Lcom/google/android/gms/internal/ay;

.field public lT:Lcom/google/android/gms/internal/fy;

.field public lU:Lcom/google/android/gms/internal/fy$a;

.field public lV:Lcom/google/android/gms/internal/fz;

.field public lW:Lcom/google/android/gms/internal/bf;

.field public lX:Lcom/google/android/gms/internal/er;

.field public lY:Lcom/google/android/gms/internal/en;

.field public lZ:Lcom/google/android/gms/internal/by;

.field public ma:Lcom/google/android/gms/internal/bz;

.field public mb:Lcom/google/android/gms/internal/br;

.field public mc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public md:Lcom/google/android/gms/internal/ek;

.field public me:Lcom/google/android/gms/internal/gd;

.field public mf:Landroid/view/View;

.field public mg:I

.field public mh:Z

.field public mi:Z

.field private mj:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/fz;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/gs;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->me:Lcom/google/android/gms/internal/gd;

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->mf:Landroid/view/View;

    iput v0, p0, Lcom/google/android/gms/internal/u$b;->mg:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u$b;->mh:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u$b;->mi:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->mj:Ljava/util/HashSet;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ay;->oq:Z

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->lK:Lcom/google/android/gms/internal/u$a;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/u$b;->lS:Lcom/google/android/gms/internal/ay;

    iput-object p3, p0, Lcom/google/android/gms/internal/u$b;->lL:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/u$b;->lM:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/u$b;->lO:Lcom/google/android/gms/internal/gs;

    new-instance v0, Lcom/google/android/gms/internal/k;

    new-instance v1, Lcom/google/android/gms/internal/x;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/x;-><init>(Lcom/google/android/gms/internal/u$b;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/k;-><init>(Lcom/google/android/gms/internal/g;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$b;->lN:Lcom/google/android/gms/internal/k;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/u$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/u$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$b;->lK:Lcom/google/android/gms/internal/u$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lK:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/ay;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lK:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/ay;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lK:Lcom/google/android/gms/internal/u$a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/fz;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/u$b;->mj:Ljava/util/HashSet;

    return-void
.end method

.method public ay()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/fz;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->mj:Ljava/util/HashSet;

    return-object v0
.end method
