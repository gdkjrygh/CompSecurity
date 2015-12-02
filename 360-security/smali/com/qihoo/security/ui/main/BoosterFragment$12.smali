.class Lcom/qihoo/security/ui/main/BoosterFragment$12;
.super Lcom/qihoo/security/alasticbutton/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/nineoldandroids/a/a$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nineoldandroids/a/a$a;

.field final synthetic b:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/nineoldandroids/a/a$a;)V
    .locals 0

    .prologue
    .line 952
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->a:Lcom/nineoldandroids/a/a$a;

    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 963
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->c_()V

    .line 965
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;Z)Z

    .line 967
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    .line 968
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    .line 969
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 955
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->a:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 956
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->a:Lcom/nineoldandroids/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 958
    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 974
    const/16 v0, 0x2b00

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 975
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$12;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->l()V

    .line 976
    return-void
.end method
