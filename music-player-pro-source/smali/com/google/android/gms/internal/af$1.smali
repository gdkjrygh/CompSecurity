.class Lcom/google/android/gms/internal/af$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ah$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/af;-><init>(Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/fy;Lcom/google/android/gms/internal/gs;Landroid/view/View;Lcom/google/android/gms/internal/ah;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nc:Landroid/view/View;

.field final synthetic nd:Lcom/google/android/gms/internal/af;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/af;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/af$1;->nd:Lcom/google/android/gms/internal/af;

    iput-object p2, p0, Lcom/google/android/gms/internal/af$1;->nc:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public aR()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/af$1;->nd:Lcom/google/android/gms/internal/af;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/af;->b(Lcom/google/android/gms/internal/af;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/af$1;->nd:Lcom/google/android/gms/internal/af;

    iget-object v1, p0, Lcom/google/android/gms/internal/af$1;->nc:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/af;->d(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/af$1;->nd:Lcom/google/android/gms/internal/af;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/af;->aI()V

    return-void
.end method
