.class final Lcom/google/android/gms/internal/he;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/he;->a:Lcom/google/android/gms/internal/hd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/he;->a:Lcom/google/android/gms/internal/hd;

    iget-object v0, v0, Lcom/google/android/gms/internal/hd;->a:Lcom/google/android/gms/internal/hc;

    iget-object v0, v0, Lcom/google/android/gms/internal/hc;->a:Lcom/google/android/gms/internal/bg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bg;->a()V

    return-void
.end method
