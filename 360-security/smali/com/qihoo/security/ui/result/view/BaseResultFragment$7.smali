.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$7;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->u()V
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
    .line 662
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$7;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 665
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$7;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setEnabled(Z)V

    .line 666
    return-void
.end method
