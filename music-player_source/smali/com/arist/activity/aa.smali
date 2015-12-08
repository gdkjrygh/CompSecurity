.class final Lcom/arist/activity/aa;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/activity/z;


# direct methods
.method constructor <init>(Lcom/arist/activity/z;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-static {v0}, Lcom/arist/activity/z;->a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    iget-object v0, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-static {v0}, Lcom/arist/activity/z;->a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/arist/activity/MainActivity;->d:Landroid/app/ProgressDialog;

    iget-object v0, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-static {v0}, Lcom/arist/activity/z;->a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-static {v0}, Lcom/arist/activity/z;->a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    iget-object v0, p0, Lcom/arist/activity/aa;->a:Lcom/arist/activity/z;

    invoke-static {v0}, Lcom/arist/activity/z;->a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    const v1, 0x7f09005d

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->a(I)V

    return-void
.end method
