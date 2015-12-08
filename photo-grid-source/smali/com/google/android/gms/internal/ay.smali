.class final Lcom/google/android/gms/internal/ay;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/at;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ay;->a:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ay;->a:Lcom/google/android/gms/internal/at;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/at;->b(Z)V

    return-void
.end method
