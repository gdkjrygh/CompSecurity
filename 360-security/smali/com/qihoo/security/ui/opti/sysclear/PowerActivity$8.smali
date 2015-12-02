.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V
    .locals 0

    .prologue
    .line 903
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 908
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 1027
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 912
    :pswitch_1
    iget v2, p1, Landroid/os/Message;->arg2:I

    .line 913
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 914
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 917
    :goto_1
    sub-int v3, v2, v0

    .line 924
    int-to-float v3, v3

    iget v4, p1, Landroid/os/Message;->arg1:I

    int-to-float v4, v4

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v4, v5

    mul-float/2addr v3, v4

    float-to-int v3, v3

    add-int/2addr v3, v0

    .line 926
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v4, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)V

    .line 927
    iget v3, p1, Landroid/os/Message;->arg1:I

    const/16 v4, 0xa

    if-ge v3, v4, :cond_0

    .line 928
    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 929
    iput v1, v3, Landroid/os/Message;->what:I

    .line 930
    iget v1, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v3, Landroid/os/Message;->arg1:I

    .line 931
    iput v2, v3, Landroid/os/Message;->arg2:I

    .line 932
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 933
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    const-wide/16 v4, 0x3c

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 947
    :goto_2
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 949
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 950
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/a/a/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/qihoo/security/a/a/a;->a(Landroid/view/View;)V

    .line 947
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 977
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a$a;)V

    .line 1016
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/a/a/a;->a()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1017
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/a/a/a;->b()V

    goto/16 :goto_0

    :cond_2
    move v0, v1

    goto/16 :goto_1

    .line 908
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
