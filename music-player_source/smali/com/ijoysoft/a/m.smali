.class final Lcom/ijoysoft/a/m;
.super Lcom/google/android/gms/ads/a;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/m;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/m;->b:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/ijoysoft/a/m;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/m;->b:Landroid/app/Activity;

    new-instance v2, Lcom/ijoysoft/a/n;

    iget-object v3, p0, Lcom/ijoysoft/a/m;->b:Landroid/app/Activity;

    invoke-direct {v2, p0, v3}, Lcom/ijoysoft/a/n;-><init>(Lcom/ijoysoft/a/m;Landroid/app/Activity;)V

    invoke-static {v0, v1, v2}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method
