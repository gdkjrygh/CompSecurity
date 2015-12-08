.class final Lcom/ijoysoft/a/l;
.super Lcom/google/android/gms/ads/a;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/l;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/l;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/a;->a()V

    iget-object v0, p0, Lcom/ijoysoft/a/l;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final b()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/a;->b()V

    iget-object v0, p0, Lcom/ijoysoft/a/l;->a:Lcom/ijoysoft/a/a;

    invoke-static {v0}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;)V

    return-void
.end method
