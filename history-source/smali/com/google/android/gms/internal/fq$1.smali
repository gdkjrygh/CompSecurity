.class final Lcom/google/android/gms/internal/fq$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/cn;Lcom/google/android/gms/internal/fw;Lcom/google/android/gms/internal/fh;)Lcom/google/android/gms/internal/fj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic nf:Landroid/content/Context;

.field final synthetic uA:Lcom/google/android/gms/internal/gv$a;

.field final synthetic uB:Ljava/lang/String;

.field final synthetic uy:Lcom/google/android/gms/internal/fh;

.field final synthetic uz:Lcom/google/android/gms/internal/fs;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fs;Lcom/google/android/gms/internal/gv$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fq$1;->nf:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/fq$1;->uy:Lcom/google/android/gms/internal/fh;

    iput-object p3, p0, Lcom/google/android/gms/internal/fq$1;->uz:Lcom/google/android/gms/internal/fs;

    iput-object p4, p0, Lcom/google/android/gms/internal/fq$1;->uA:Lcom/google/android/gms/internal/gv$a;

    iput-object p5, p0, Lcom/google/android/gms/internal/fq$1;->uB:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/fq$1;->nf:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ay;-><init>()V

    const/4 v4, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/fq$1;->uy:Lcom/google/android/gms/internal/fh;

    iget-object v5, v3, Lcom/google/android/gms/internal/fh;->lO:Lcom/google/android/gms/internal/gs;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/gu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/gs;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->setWillNotDraw(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/fq$1;->uz:Lcom/google/android/gms/internal/fs;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/fs;->b(Lcom/google/android/gms/internal/gu;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v1

    const-string v2, "/invalidRequest"

    iget-object v3, p0, Lcom/google/android/gms/internal/fq$1;->uz:Lcom/google/android/gms/internal/fs;

    iget-object v3, v3, Lcom/google/android/gms/internal/fs;->uG:Lcom/google/android/gms/internal/cd;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v2, "/loadAdURL"

    iget-object v3, p0, Lcom/google/android/gms/internal/fq$1;->uz:Lcom/google/android/gms/internal/fs;

    iget-object v3, v3, Lcom/google/android/gms/internal/fs;->uH:Lcom/google/android/gms/internal/cd;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    const-string v2, "/log"

    sget-object v3, Lcom/google/android/gms/internal/cc;->pX:Lcom/google/android/gms/internal/cd;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Lcom/google/android/gms/internal/cd;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/fq$1;->uA:Lcom/google/android/gms/internal/gv$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/gv$a;)V

    const-string v1, "Loading the JS library."

    invoke-static {v1}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/fq$1;->uB:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
