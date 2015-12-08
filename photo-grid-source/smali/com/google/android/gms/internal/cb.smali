.class final Lcom/google/android/gms/internal/cb;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ca;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ca;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cb;->a:Lcom/google/android/gms/internal/ca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 0
    check-cast p1, Ljava/lang/String;

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/cb;->a:Lcom/google/android/gms/internal/ca;

    iget-object v0, v0, Lcom/google/android/gms/internal/ca;->d:Lcom/google/android/gms/internal/by;

    iget-object v1, p0, Lcom/google/android/gms/internal/cb;->a:Lcom/google/android/gms/internal/ca;

    iget-object v1, v1, Lcom/google/android/gms/internal/ca;->b:Lcom/google/android/gms/internal/bv;

    iget-object v2, p0, Lcom/google/android/gms/internal/cb;->a:Lcom/google/android/gms/internal/ca;

    iget-object v2, v2, Lcom/google/android/gms/internal/ca;->c:Landroid/webkit/WebView;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/by;->a(Lcom/google/android/gms/internal/bv;Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 0
    return-void
.end method
