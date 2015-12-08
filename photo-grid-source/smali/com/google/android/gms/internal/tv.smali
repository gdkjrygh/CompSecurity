.class final Lcom/google/android/gms/internal/tv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/tv;->a:Lcom/google/android/gms/internal/tu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tv;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/internal/tu;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/b;->b(Landroid/content/Context;)V

    return-void
.end method
