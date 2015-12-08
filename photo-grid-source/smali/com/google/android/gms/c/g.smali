.class final Lcom/google/android/gms/c/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/c/c;

.field final synthetic b:Lcom/google/android/gms/c/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/c/f;Lcom/google/android/gms/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/c/g;->b:Lcom/google/android/gms/c/f;

    iput-object p2, p0, Lcom/google/android/gms/c/g;->a:Lcom/google/android/gms/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/c/g;->a:Lcom/google/android/gms/c/c;

    invoke-virtual {v0}, Lcom/google/android/gms/c/c;->h()Lcom/google/android/gms/c/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/c/g;->a:Lcom/google/android/gms/c/c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/c/e;->a(Lcom/google/android/gms/c/c;)V

    iget-object v0, p0, Lcom/google/android/gms/c/g;->b:Lcom/google/android/gms/c/f;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/c/g;->a:Lcom/google/android/gms/c/c;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->b(Lcom/google/android/gms/c/c;)V

    return-void
.end method
