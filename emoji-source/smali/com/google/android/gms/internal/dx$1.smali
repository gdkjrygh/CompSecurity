.class final Lcom/google/android/gms/internal/dx$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dx;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/ed;Lcom/google/android/gms/internal/ds;)Lcom/google/android/gms/internal/du;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic qu:Landroid/content/Context;

.field final synthetic qv:Lcom/google/android/gms/internal/ds;

.field final synthetic qw:Lcom/google/android/gms/internal/dz;

.field final synthetic qx:Lcom/google/android/gms/internal/ey$a;

.field final synthetic qy:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dz;Lcom/google/android/gms/internal/ey$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dx$1;->qu:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/dx$1;->qv:Lcom/google/android/gms/internal/ds;

    iput-object p3, p0, Lcom/google/android/gms/internal/dx$1;->qw:Lcom/google/android/gms/internal/dz;

    iput-object p4, p0, Lcom/google/android/gms/internal/dx$1;->qx:Lcom/google/android/gms/internal/ey$a;

    iput-object p5, p0, Lcom/google/android/gms/internal/dx$1;->qy:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dx$1;->qu:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/al;

    invoke-direct {v1}, Lcom/google/android/gms/internal/al;-><init>()V

    const/4 v4, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/dx$1;->qv:Lcom/google/android/gms/internal/ds;

    iget-object v5, v3, Lcom/google/android/gms/internal/ds;->kQ:Lcom/google/android/gms/internal/ev;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ev;)Lcom/google/android/gms/internal/ex;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->setWillNotDraw(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/dx$1;->qw:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/dz;->b(Lcom/google/android/gms/internal/ex;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v1

    const-string v2, "/invalidRequest"

    iget-object v3, p0, Lcom/google/android/gms/internal/dx$1;->qw:Lcom/google/android/gms/internal/dz;

    iget-object v3, v3, Lcom/google/android/gms/internal/dz;->qD:Lcom/google/android/gms/internal/bc;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v2, "/loadAdURL"

    iget-object v3, p0, Lcom/google/android/gms/internal/dx$1;->qw:Lcom/google/android/gms/internal/dz;

    iget-object v3, v3, Lcom/google/android/gms/internal/dz;->qE:Lcom/google/android/gms/internal/bc;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    const-string v2, "/log"

    sget-object v3, Lcom/google/android/gms/internal/bb;->mZ:Lcom/google/android/gms/internal/bc;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/String;Lcom/google/android/gms/internal/bc;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/dx$1;->qx:Lcom/google/android/gms/internal/ey$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ey$a;)V

    const-string v1, "Loading the JS library."

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/dx$1;->qy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
