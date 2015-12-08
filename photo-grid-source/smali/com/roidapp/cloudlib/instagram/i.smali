.class final Lcom/roidapp/cloudlib/instagram/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/i;->a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 82
    packed-switch p3, :pswitch_data_0

    .line 90
    :goto_0
    return-void

    .line 84
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/i;->a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Z)V

    goto :goto_0

    .line 87
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/i;->a:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Z)V

    goto :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
