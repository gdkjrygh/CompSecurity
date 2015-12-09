.class Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setOnState(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

.field final synthetic val$on:Z


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;Z)V
    .locals 0

    .prologue
    .line 216
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;->val$on:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 220
    const-string v0, "NatBut"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setOn: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v2, v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;->val$on:Z

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 222
    return-void
.end method
