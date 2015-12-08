.class final Lcom/google/android/gms/internal/hv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hv;->a:Lcom/google/android/gms/internal/hs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bg;

    .line 1000
    new-instance v0, Lcom/google/android/gms/internal/hw;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/hw;-><init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/bg;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->a(Ljava/lang/Runnable;)V

    .line 0
    return-void
.end method
