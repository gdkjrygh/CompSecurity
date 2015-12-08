.class final Lcom/roidapp/cloudlib/sns/basepost/ap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 644
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ap;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 649
    packed-switch p2, :pswitch_data_0

    .line 655
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 652
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ap;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->q(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    goto :goto_0

    .line 649
    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
