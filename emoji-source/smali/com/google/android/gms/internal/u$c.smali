.class final Lcom/google/android/gms/internal/u$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final kM:Lcom/google/android/gms/internal/u$a;

.field public final kN:Ljava/lang/String;

.field public final kO:Landroid/content/Context;

.field public final kP:Lcom/google/android/gms/internal/k;

.field public final kQ:Lcom/google/android/gms/internal/ev;

.field public kR:Lcom/google/android/gms/internal/ap;

.field public kS:Lcom/google/android/gms/internal/em;

.field public kT:Lcom/google/android/gms/internal/al;

.field public kU:Lcom/google/android/gms/internal/ef;

.field public kV:Lcom/google/android/gms/internal/eg;

.field public kW:Lcom/google/android/gms/internal/as;

.field public kX:Lcom/google/android/gms/internal/dg;

.field public kY:Lcom/google/android/gms/internal/dc;

.field public kZ:Lcom/google/android/gms/internal/cz;

.field public la:Lcom/google/android/gms/internal/ek;

.field public lb:Z

.field private lc:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/eg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/al;Ljava/lang/String;Lcom/google/android/gms/internal/ev;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/u$c;->la:Lcom/google/android/gms/internal/ek;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u$c;->lb:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/u$c;->lc:Ljava/util/HashSet;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iput-object p3, p0, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    new-instance v0, Lcom/google/android/gms/internal/k;

    new-instance v1, Lcom/google/android/gms/internal/u$b;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/u$b;-><init>(Lcom/google/android/gms/internal/u$c;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/k;-><init>(Lcom/google/android/gms/internal/g;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$c;->kP:Lcom/google/android/gms/internal/k;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/u$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/u$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/al;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/al;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

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
            "Lcom/google/android/gms/internal/eg;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/u$c;->lc:Ljava/util/HashSet;

    return-void
.end method

.method public aq()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/eg;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/u$c;->lc:Ljava/util/HashSet;

    return-object v0
.end method
