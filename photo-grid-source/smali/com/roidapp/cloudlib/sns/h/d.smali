.class final Lcom/roidapp/cloudlib/sns/h/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/d;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .prologue
    .line 314
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/d;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->e(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 315
    return-void
.end method
