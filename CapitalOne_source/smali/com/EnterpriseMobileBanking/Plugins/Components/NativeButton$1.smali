.class final Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setTouchedAsPressed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$lastTouched:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;->val$lastTouched:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;->val$lastTouched:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 79
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;->val$lastTouched:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 80
    return-void
.end method
