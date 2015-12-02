.class Lcom/qihoo/security/widget/switcher/Switch$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/switcher/Switch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/switcher/Switch;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/switcher/Switch;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 138
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 150
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 140
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-static {v2}, Lcom/qihoo/security/widget/switcher/Switch;->a(Lcom/qihoo/security/widget/switcher/Switch;)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Lcom/qihoo/security/widget/switcher/Switch;->a(Lcom/qihoo/security/widget/switcher/Switch;F)F

    .line 141
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-static {v1}, Lcom/qihoo/security/widget/switcher/Switch;->b(Lcom/qihoo/security/widget/switcher/Switch;)V

    .line 142
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-virtual {v1}, Lcom/qihoo/security/widget/switcher/Switch;->invalidate()V

    goto :goto_0

    .line 145
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-static {v2}, Lcom/qihoo/security/widget/switcher/Switch;->a(Lcom/qihoo/security/widget/switcher/Switch;)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Lcom/qihoo/security/widget/switcher/Switch;->b(Lcom/qihoo/security/widget/switcher/Switch;F)F

    .line 146
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-static {v1}, Lcom/qihoo/security/widget/switcher/Switch;->b(Lcom/qihoo/security/widget/switcher/Switch;)V

    .line 147
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch$1;->a:Lcom/qihoo/security/widget/switcher/Switch;

    invoke-virtual {v1}, Lcom/qihoo/security/widget/switcher/Switch;->invalidate()V

    goto :goto_0

    .line 138
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
