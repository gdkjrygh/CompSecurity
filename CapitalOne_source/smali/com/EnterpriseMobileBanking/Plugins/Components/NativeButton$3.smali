.class Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$3;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->updateImage(Ljava/lang/String;Ljava/lang/String;)V
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
    .line 178
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 181
    return-void
.end method
