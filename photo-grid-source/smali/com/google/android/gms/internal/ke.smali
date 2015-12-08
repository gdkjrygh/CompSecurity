.class final Lcom/google/android/gms/internal/ke;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/kd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/kd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ke;->a:Lcom/google/android/gms/internal/kd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ke;->a:Lcom/google/android/gms/internal/kd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kd;->b()Landroid/content/Intent;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ke;->a:Lcom/google/android/gms/internal/kd;

    invoke-static {v1}, Lcom/google/android/gms/internal/kd;->a(Lcom/google/android/gms/internal/kd;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/qa;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
