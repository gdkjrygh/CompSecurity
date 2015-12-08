.class final Lcom/google/android/gms/analytics/internal/au;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/analytics/internal/as;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/as;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/au;->a:Lcom/google/android/gms/analytics/internal/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/au;->a:Lcom/google/android/gms/analytics/internal/as;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/as;->a(Lcom/google/android/gms/analytics/internal/as;)Ljava/lang/String;

    move-result-object v0

    .line 0
    return-object v0
.end method
