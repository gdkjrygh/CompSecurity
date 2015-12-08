.class final Lcom/google/android/gms/internal/nq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/hm",
        "<",
        "Lcom/google/android/gms/internal/bg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/nj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nq;->a:Lcom/google/android/gms/internal/nj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zzc(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bg;

    .line 1000
    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/fo;->h:Lcom/google/android/gms/internal/fz;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    .line 0
    return-void
.end method
