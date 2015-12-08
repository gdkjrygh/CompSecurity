.class final Lcom/google/android/gms/internal/mk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/mj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mk;->a:Lcom/google/android/gms/internal/mj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mk;->a:Lcom/google/android/gms/internal/mj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mj;->onStop()V

    return-void
.end method
