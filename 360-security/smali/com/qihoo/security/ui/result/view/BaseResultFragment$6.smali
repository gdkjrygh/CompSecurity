.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t()V
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
    .line 635
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 639
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    new-instance v1, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6$1;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Lcom/nineoldandroids/a/b;)V

    .line 653
    return-void
.end method
