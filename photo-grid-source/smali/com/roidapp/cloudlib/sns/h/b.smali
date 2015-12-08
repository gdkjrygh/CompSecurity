.class final Lcom/roidapp/cloudlib/sns/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/b;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 282
    packed-switch p2, :pswitch_data_0

    .line 292
    :goto_0
    return-void

    .line 285
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/b;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;)V

    goto :goto_0

    .line 289
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/b;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->b(Lcom/roidapp/cloudlib/sns/h/a;)V

    goto :goto_0

    .line 282
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
