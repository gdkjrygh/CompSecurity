.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 150
    return-void
.end method
