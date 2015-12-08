.class final Lcom/arist/activity/ac;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    iput v3, v0, Lcom/arist/activity/MainActivity;->b:I

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    iput v2, v0, Lcom/arist/activity/MainActivity;->c:I

    :goto_0
    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v3}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->d(Lcom/arist/activity/MainActivity;)V

    :goto_1
    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    const/4 v1, 0x4

    iput v1, v0, Lcom/arist/activity/MainActivity;->b:I

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    goto :goto_1

    :sswitch_1
    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    iput v2, v0, Lcom/arist/activity/MainActivity;->b:I

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    goto :goto_1

    :sswitch_2
    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    const/4 v1, 0x2

    iput v1, v0, Lcom/arist/activity/MainActivity;->b:I

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v2}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    goto :goto_1

    :sswitch_3
    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    iput v3, v0, Lcom/arist/activity/MainActivity;->b:I

    iget-object v0, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    iput v3, v0, Lcom/arist/activity/MainActivity;->c:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    const/4 v2, 0x3

    iput v2, v1, Lcom/arist/activity/MainActivity;->b:I

    iget-object v1, p0, Lcom/arist/activity/ac;->a:Lcom/arist/activity/MainActivity;

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Lcom/arist/activity/MainActivity;->c:I

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f060099 -> :sswitch_3
        0x7f06009d -> :sswitch_2
        0x7f0600a1 -> :sswitch_0
        0x7f0600a5 -> :sswitch_1
    .end sparse-switch
.end method
