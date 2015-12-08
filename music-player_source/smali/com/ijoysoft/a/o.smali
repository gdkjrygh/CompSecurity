.class final Lcom/ijoysoft/a/o;
.super Lcom/google/android/gms/ads/a;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/Activity;

.field private final synthetic c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/o;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/o;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/ijoysoft/a/o;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/ijoysoft/a/o;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/o;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/ijoysoft/a/o;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/google/android/gms/ads/a;->a()V

    return-void
.end method
