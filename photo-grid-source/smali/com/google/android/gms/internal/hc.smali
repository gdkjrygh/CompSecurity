.class final Lcom/google/android/gms/internal/hc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/bh;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/bg;

.field final synthetic b:Lcom/google/android/gms/internal/hb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hc;->b:Lcom/google/android/gms/internal/hb;

    iput-object p2, p0, Lcom/google/android/gms/internal/hc;->a:Lcom/google/android/gms/internal/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/hd;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hd;-><init>(Lcom/google/android/gms/internal/hc;)V

    sget v2, Lcom/google/android/gms/internal/hl;->b:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
