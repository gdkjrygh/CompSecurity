.class Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->onClick(Landroid/view/View;)V
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
    .line 106
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->appLink:Lorg/apache/cordova/DroidGap;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;

    iget-object v1, v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/cordova/DroidGap;->sendJavascript(Ljava/lang/String;)V

    .line 111
    return-void
.end method
