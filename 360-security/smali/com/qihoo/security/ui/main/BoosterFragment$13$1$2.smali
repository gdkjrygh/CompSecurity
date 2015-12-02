.class Lcom/qihoo/security/ui/main/BoosterFragment$13$1$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment$13$1;->b(Lcom/nineoldandroids/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment$13$1;)V
    .locals 0

    .prologue
    .line 1053
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1$2;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1056
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1$2;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    .line 1057
    return-void
.end method
