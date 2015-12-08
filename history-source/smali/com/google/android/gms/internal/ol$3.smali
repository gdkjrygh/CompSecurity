.class final Lcom/google/android/gms/internal/ol$3;
.super Lcom/google/android/gms/internal/oj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ol;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/oj;Landroid/net/Uri;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic amO:Landroid/net/Uri;

.field final synthetic amQ:Lcom/google/android/gms/internal/oj;

.field final synthetic nf:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/google/android/gms/internal/oj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ol$3;->nf:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ol$3;->amO:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/internal/ol$3;->amQ:Lcom/google/android/gms/internal/oj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;ILandroid/content/Intent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ol$3;->nf:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ol$3;->amO:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ol;->b(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ol$3;->amQ:Lcom/google/android/gms/internal/oj;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/oj;->a(ILandroid/os/Bundle;ILandroid/content/Intent;)V

    return-void
.end method
