.class Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->deselectButton()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 252
    const-string v0, "NatBut"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deslsecting: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v2, v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 254
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    .line 255
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 256
    return-void
.end method
