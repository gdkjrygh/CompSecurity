.class Lcom/qihoo/security/ui/main/BoosterFragment$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 1237
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$4;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1240
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$4;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->k(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->performClick()Z

    .line 1241
    return-void
.end method
