.class final Lcom/google/android/gms/internal/v$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final kG:Lcom/google/android/gms/internal/v$a;

.field public final kH:Ljava/lang/String;

.field public final kI:Landroid/content/Context;

.field public final kJ:Lcom/google/android/gms/internal/l;

.field public final kK:Lcom/google/android/gms/internal/dx;

.field public kL:Lcom/google/android/gms/internal/ao;

.field public kM:Lcom/google/android/gms/internal/do;

.field public kN:Lcom/google/android/gms/internal/ak;

.field public kO:Lcom/google/android/gms/internal/dh;

.field public kP:Lcom/google/android/gms/internal/di;

.field public kQ:Lcom/google/android/gms/internal/ar;

.field public kR:Lcom/google/android/gms/internal/co;

.field public kS:Lcom/google/android/gms/internal/dm;

.field private kT:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/di;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Lcom/google/android/gms/internal/dx;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/v$b;->kS:Lcom/google/android/gms/internal/dm;

    iput-object v1, p0, Lcom/google/android/gms/internal/v$b;->kT:Ljava/util/HashSet;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iput-object p3, p0, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/l;

    iget-object v1, p4, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/k;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/k;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/l;-><init>(Lcom/google/android/gms/internal/h;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/v$b;->kJ:Lcom/google/android/gms/internal/l;

    iput-object p4, p0, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/v$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/v$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget v1, p2, Lcom/google/android/gms/internal/ak;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget v1, p2, Lcom/google/android/gms/internal/ak;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setVisibility(I)V

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
            "Lcom/google/android/gms/internal/di;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/v$b;->kT:Ljava/util/HashSet;

    return-void
.end method

.method public ak()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/di;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/v$b;->kT:Ljava/util/HashSet;

    return-object v0
.end method
