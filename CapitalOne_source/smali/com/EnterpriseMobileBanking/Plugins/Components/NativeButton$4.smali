.class Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setPressed(Z)V
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
    .line 206
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;->val$on:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;->val$on:Z

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 211
    return-void
.end method
