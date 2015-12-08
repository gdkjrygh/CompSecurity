.class final Lcom/google/android/gms/internal/vc;
.super Lcom/google/android/gms/internal/ux;


# instance fields
.field final synthetic b:Landroid/app/Dialog;

.field final synthetic c:Lcom/google/android/gms/internal/vb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/vb;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/vc;->c:Lcom/google/android/gms/internal/vb;

    iput-object p2, p0, Lcom/google/android/gms/internal/vc;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ux;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vc;->c:Lcom/google/android/gms/internal/vb;

    iget-object v0, v0, Lcom/google/android/gms/internal/vb;->a:Lcom/google/android/gms/internal/uz;

    invoke-static {v0}, Lcom/google/android/gms/internal/uz;->d(Lcom/google/android/gms/internal/uz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/vc;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
