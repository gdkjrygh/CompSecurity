.class Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->d()V

    .line 129
    return-void
.end method
