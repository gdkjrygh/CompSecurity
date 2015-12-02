.class Lcom/qihoo/security/ui/main/BoosterFragment$13$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment$13;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment$13;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment$13;)V
    .locals 0

    .prologue
    .line 1082
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1085
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$3;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    .line 1086
    return-void
.end method
