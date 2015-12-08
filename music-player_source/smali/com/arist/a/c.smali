.class final Lcom/arist/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/a/a;

.field private b:Landroid/widget/PopupWindow;

.field private c:Lcom/arist/b/b;


# direct methods
.method public constructor <init>(Lcom/arist/a/a;Landroid/widget/PopupWindow;Lcom/arist/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/arist/a/c;->b:Landroid/widget/PopupWindow;

    iput-object p3, p0, Lcom/arist/a/c;->c:Lcom/arist/b/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/arist/a/c;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v1, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v1}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/a/c;->c:Lcom/arist/b/b;

    iput-object v2, v1, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v1, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v1}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v2}, Lcom/arist/a/a;->b(Lcom/arist/a/a;)I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {v1, v0}, Lcom/arist/activity/MainActivity;->c(Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->d()V

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v1}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v1

    invoke-virtual {v1, v0, v0}, Lcom/arist/activity/MainActivity;->a(II)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->a()V

    goto :goto_0

    :pswitch_4
    new-instance v0, Lcom/arist/model/a/a;

    invoke-direct {v0}, Lcom/arist/model/a/a;-><init>()V

    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/a/c;->c:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->c()I

    move-result v1

    iget-object v2, p0, Lcom/arist/a/c;->c:Lcom/arist/b/b;

    invoke-virtual {v2}, Lcom/arist/b/b;->e()Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/arist/model/a/a;->a(Landroid/content/Context;I)Z

    move-result v0

    iget-object v1, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v1}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v1

    if-eqz v0, :cond_1

    const v0, 0x7f0900db

    :goto_1
    invoke-virtual {v1, v0}, Lcom/arist/activity/MainActivity;->a(I)V

    goto :goto_0

    :cond_1
    const v0, 0x7f0900dc

    goto :goto_1

    :pswitch_5
    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->b(Lcom/arist/a/a;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->c()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/arist/a/c;->a:Lcom/arist/a/a;

    invoke-static {v0}, Lcom/arist/a/a;->a(Lcom/arist/a/a;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->b()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f0600f1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method
