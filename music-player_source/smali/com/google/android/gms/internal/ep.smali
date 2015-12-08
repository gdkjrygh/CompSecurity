.class final Lcom/google/android/gms/internal/ep;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/bp;

.field final synthetic b:Lcom/google/android/gms/internal/eo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/eo;Lcom/google/android/gms/internal/bp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ep;->b:Lcom/google/android/gms/internal/eo;

    iput-object p2, p0, Lcom/google/android/gms/internal/ep;->a:Lcom/google/android/gms/internal/bp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ep;->a:Lcom/google/android/gms/internal/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bp;->j()V

    return-void
.end method
