.class final Lcom/google/android/gms/internal/dc$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ax;Lcom/google/android/gms/internal/bf;Lcom/google/android/gms/internal/cx;)Lcom/google/android/gms/internal/cz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic pB:Landroid/content/Context;

.field final synthetic pC:Lcom/google/android/gms/internal/cx;

.field final synthetic pD:Lcom/google/android/gms/internal/de;

.field final synthetic pE:Lcom/google/android/gms/internal/ea$a;

.field final synthetic pF:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/de;Lcom/google/android/gms/internal/ea$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dc$1;->pB:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/dc$1;->pC:Lcom/google/android/gms/internal/cx;

    iput-object p3, p0, Lcom/google/android/gms/internal/dc$1;->pD:Lcom/google/android/gms/internal/de;

    iput-object p4, p0, Lcom/google/android/gms/internal/dc$1;->pE:Lcom/google/android/gms/internal/ea$a;

    iput-object p5, p0, Lcom/google/android/gms/internal/dc$1;->pF:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dc$1;->pB:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ak;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ak;-><init>()V

    const/4 v4, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/dc$1;->pC:Lcom/google/android/gms/internal/cx;

    iget-object v5, v3, Lcom/google/android/gms/internal/cx;->kK:Lcom/google/android/gms/internal/dx;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;ZZLcom/google/android/gms/internal/l;Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/dz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->setWillNotDraw(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/dc$1;->pD:Lcom/google/android/gms/internal/de;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/de;->b(Lcom/google/android/gms/internal/dz;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v1

    const-string v2, "/invalidRequest"

    iget-object v3, p0, Lcom/google/android/gms/internal/dc$1;->pD:Lcom/google/android/gms/internal/de;

    iget-object v3, v3, Lcom/google/android/gms/internal/de;->pK:Lcom/google/android/gms/internal/bb;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v2, "/loadAdURL"

    iget-object v3, p0, Lcom/google/android/gms/internal/dc$1;->pD:Lcom/google/android/gms/internal/de;

    iget-object v3, v3, Lcom/google/android/gms/internal/de;->pL:Lcom/google/android/gms/internal/bb;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    const-string v2, "/log"

    sget-object v3, Lcom/google/android/gms/internal/ba;->mM:Lcom/google/android/gms/internal/bb;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ea;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bb;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/dc$1;->pE:Lcom/google/android/gms/internal/ea$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ea$a;)V

    const-string v1, "Loading the JS library."

    invoke-static {v1}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/dc$1;->pF:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
