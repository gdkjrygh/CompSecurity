.class Lcom/google/android/gms/internal/ai$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ai;->a(Landroid/content/Context;Lcom/google/android/gms/internal/gs;Ljava/lang/String;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nf:Landroid/content/Context;

.field final synthetic ng:Lcom/google/android/gms/internal/gs;

.field final synthetic nh:Lcom/google/android/gms/internal/gj;

.field final synthetic ni:Ljava/lang/String;

.field final synthetic nj:Lcom/google/android/gms/internal/ai;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ai;Landroid/content/Context;Lcom/google/android/gms/internal/gs;Lcom/google/android/gms/internal/gj;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ai$1;->nj:Lcom/google/android/gms/internal/ai;

    iput-object p2, p0, Lcom/google/android/gms/internal/ai$1;->nf:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ai$1;->ng:Lcom/google/android/gms/internal/gs;

    iput-object p4, p0, Lcom/google/android/gms/internal/ai$1;->nh:Lcom/google/android/gms/internal/gj;

    iput-object p5, p0, Lcom/google/android/gms/internal/ai$1;->ni:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ai$1;->nj:Lcom/google/android/gms/internal/ai;

    iget-object v1, p0, Lcom/google/android/gms/internal/ai$1;->nf:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ai$1;->ng:Lcom/google/android/gms/internal/gs;

    iget-object v3, p0, Lcom/google/android/gms/internal/ai$1;->nh:Lcom/google/android/gms/internal/gj;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ai;->a(Landroid/content/Context;Lcom/google/android/gms/internal/gs;Lcom/google/android/gms/internal/gj;)Lcom/google/android/gms/internal/ah;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ai$1;->ni:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ah;->f(Ljava/lang/String;)V

    return-void
.end method
